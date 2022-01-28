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
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { true, true, false, false, true };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray5);
        java.lang.Boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray6, false);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.add(booleanArray6, (int) (byte) 0, false);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, true, true, false, false, true]");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) 0);
        java.lang.Short[] shortArray9 = new java.lang.Short[] { (short) 10, (short) 100, (short) -1, (short) 1, (short) 0, (short) 0 };
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray9);
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray9);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray9, (short) 1);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray9, (short) 10);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray0, shortArray15);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.clone(shortArray16);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray16, (short) (byte) -1);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray4, (byte) 0);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray4, (byte) 1);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray4, (byte) 1, 1);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray4, (byte) 10, (int) (short) -1);
        java.lang.Byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray4);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray4);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.add(byteArray4, (int) (short) 0, (byte) -1);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.remove(byteArray19, 2);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray19);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, 1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray4, (byte) 0);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray9, (byte) 10, 0);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray4, byteArray9);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray9, 0, (int) (byte) 10);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray9, (byte) -1);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100, 100]");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray1 = org.apache.commons.lang3.ArrayUtils.clone(typeArray0);
        float[] floatArray2 = new float[] {};
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (float) 10L);
        float[] floatArray6 = new float[] { (byte) -1 };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray6);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) typeArray1, (java.lang.Object) floatArray4);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, (-1), (int) (short) 0);
        float[] floatArray12 = new float[] {};
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.add(floatArray12, (float) 10L);
        float[] floatArray15 = new float[] {};
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray12, floatArray15);
        float[] floatArray17 = null;
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray15, floatArray17);
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.clone(floatArray18);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray19);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray11, floatArray19);
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
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray1);
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray2);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray2, (double) ' ');
        double[] doubleArray7 = new double[] { (byte) 10 };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray7);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray2, doubleArray7);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray7, (double) (-1.0f), (double) 0L);
        java.lang.Double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray7);
        java.lang.Object obj14 = null;
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray13, obj14, 3);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray5);
        int[] intArray12 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray6, intArray12);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.add(intArray6, (int) '4');
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.add(intArray6, 10);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.remove(intArray17, 5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 2, 10, 0, -1, 52]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 2, 10, 0, -1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 2, 10, 0, -1]");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
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
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.clone(intArray21);
        java.lang.Integer[] intArray23 = org.apache.commons.lang3.ArrayUtils.toObject(intArray21);
        int[] intArray27 = new int[] { 100, (short) 10, '4' };
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray33);
        int[] intArray40 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray34, intArray40);
        int[] intArray42 = org.apache.commons.lang3.ArrayUtils.addAll(intArray27, intArray40);
        int int45 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray27, (int) '4', 3);
        int[] intArray47 = new int[] { (byte) 0 };
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray47, 0);
        int[] intArray51 = org.apache.commons.lang3.ArrayUtils.add(intArray47, 0);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.contains(intArray47, (int) (short) 0);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray60 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray59);
        int[] intArray66 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean67 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray60, intArray66);
        int[] intArray69 = org.apache.commons.lang3.ArrayUtils.add(intArray60, (int) '4');
        int[] intArray71 = org.apache.commons.lang3.ArrayUtils.add(intArray60, 10);
        int[] intArray72 = org.apache.commons.lang3.ArrayUtils.addAll(intArray47, intArray71);
        int[] intArray73 = org.apache.commons.lang3.ArrayUtils.addAll(intArray27, intArray71);
        int[] intArray74 = org.apache.commons.lang3.ArrayUtils.clone(intArray71);
        int[] intArray75 = org.apache.commons.lang3.ArrayUtils.addAll(intArray21, intArray74);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray75);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray75);
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
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 10, 52, 0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[0, 2, 10, 0, -1, 52]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[0, 2, 10, 0, -1, 10]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[0, 0, 2, 10, 0, -1, 10]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[100, 10, 52, 0, 2, 10, 0, -1, 10]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[0, 2, 10, 0, -1, 10]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[0, 0, 2, 10, 0, -1, 10]");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray4, (byte) 0);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray4, (byte) 1);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray4, (byte) 1, 1);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray4, (byte) 10, (int) (short) -1);
        java.lang.Byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray4);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray4);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.add(byteArray4, (int) (short) 0, (byte) -1);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray4, (byte) 100);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray4, (byte) 1);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.clone(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, 1, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 0, 0, -1]");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        short[] shortArray3 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        short[] shortArray9 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) (byte) 0, 2);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray9);
        java.lang.Short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray9);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) shortArray14);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray14, (short) (byte) 10);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray14, (short) -1);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray19, (short) 0, (int) (byte) 0);
        short[] shortArray26 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray26);
        short[] shortArray32 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray32, (short) (byte) 0, 2);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray26, shortArray32);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray32);
        short[] shortArray40 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray32, 3, (int) '4');
        int int43 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray40, (short) 100, (int) (byte) 1);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray19, shortArray40);
        short[] shortArray47 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray40, (int) (short) 0, (int) (byte) 10);
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.contains(shortArray47, (short) (byte) -1);
        int int51 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray47, (short) -1);
        short[] shortArray54 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray47, 5, (int) (short) 1);
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray47);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[0, 100, 10, 1]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray47), "[1]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray4, (byte) 0);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray6);
        java.lang.Byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray6);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray9);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray9);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray9, (byte) 100);
        java.lang.Short[] shortArray20 = new java.lang.Short[] { (short) 10, (short) 100, (short) -1, (short) 1, (short) 0, (short) 0 };
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray20);
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray20);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray20, (short) 1);
        short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray20, (short) 10);
        java.lang.Long[] longArray27 = new java.lang.Long[] {};
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray27);
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray33, (byte) 0);
        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 100 };
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray38, (byte) 10, 0);
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray33, byteArray38);
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray27, (java.lang.Object) byteArray42);
        byte[] byteArray48 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray50 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray48, (byte) 0);
        byte[] byteArray52 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray48, (byte) 1);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray42, byteArray48);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray42);
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) shortArray20, (java.lang.Object) byteArray42);
        byte[] byteArray56 = org.apache.commons.lang3.ArrayUtils.clone(byteArray42);
        byte[] byteArray57 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray13, byteArray42);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray60 = org.apache.commons.lang3.ArrayUtils.add(byteArray57, 10, (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 9");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[100, 100, 1, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[-1, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[100, 100, 1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-1, 0, 1, 100, 100, 1, 0, 0, -1]");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray15, (double) (-1.0f), 1, (double) '4');
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray15, (double) (byte) 100, (double) (byte) -1);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray15, (double) '#', (int) '#', (double) 6);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray10);
        float[] floatArray17 = new float[] { '#' };
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.add(floatArray17, (float) (-1));
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray19);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray10, floatArray19);
        java.lang.Float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray10);
        float[] floatArray26 = new float[] { 10.0f, 2, 6 };
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.add(floatArray26, 0, (float) (byte) 1);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray26, 0.0f, (int) (byte) -1);
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray26, (float) 100);
        java.lang.Float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray26);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray35);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray10, floatArray36);
        byte[] byteArray42 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray42, (byte) 0);
        java.lang.Byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray44);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray44);
        java.lang.Byte[] byteArray47 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray44);
        byte[] byteArray48 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray47);
        byte[] byteArray49 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray47);
        byte[] byteArray51 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray47, (byte) 100);
        float[] floatArray52 = new float[] {};
        float[] floatArray54 = org.apache.commons.lang3.ArrayUtils.add(floatArray52, (float) 10L);
        float[] floatArray56 = new float[] { (byte) -1 };
        float[] floatArray57 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray54, floatArray56);
        int int59 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray57, (float) (-1L));
        float[] floatArray60 = new float[] {};
        float[] floatArray62 = org.apache.commons.lang3.ArrayUtils.add(floatArray60, (float) 10L);
        float[] floatArray64 = new float[] { (byte) -1 };
        float[] floatArray65 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray62, floatArray64);
        boolean boolean66 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray57, floatArray62);
        int int67 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray47, (java.lang.Object) floatArray62);
        boolean boolean68 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray10, floatArray62);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[35.0]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[35.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0, 35.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[10.0, 2.0, 6.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[1.0, 10.0, 2.0, 6.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[10.0, 2.0, 6.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray52), "[]");
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray56), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray57), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(floatArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray60), "[]");
        org.junit.Assert.assertNotNull(floatArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray62), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray64), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray65), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.String str2 = org.apache.commons.lang3.ArrayUtils.toString(obj0, "{-1,0,0,1}");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        long[] longArray2 = new long[] { (byte) -1, 10 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.clone(longArray2);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, 1L, (-1));
        java.lang.Long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toObject(longArray3);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 10]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(longArray7);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 100 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) 10, 0);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) 1);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (int) (short) 0, (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) 10);
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) 0, (byte) 100 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray7, byteArray16);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray16, (byte) -1);
        java.lang.Byte[] byteArray22 = new java.lang.Byte[] { (byte) 0, (byte) 100 };
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray22);
        java.lang.Long[] longArray30 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray30, (long) (-1));
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray22, (java.lang.Object) longArray32, (int) (short) -1);
        byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray22, (byte) 1);
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray36, (byte) 10, 0);
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray36, (byte) 100, (int) (short) 1);
        byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray36, (byte) 0);
        byte[] byteArray46 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray44, (byte) 1);
        java.lang.Byte[] byteArray47 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray44);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray16, byteArray44);
        byte[] byteArray50 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 100]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0, 100]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[100]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[100]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[0, 100, -1]");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        java.lang.Long[] longArray0 = new java.lang.Long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 0);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) 10, 0);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray6, byteArray11);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray0, (java.lang.Object) byteArray15);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (byte) 0);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (byte) 1);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray15, byteArray21);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray15);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray15, (byte) 10);
        byte[] byteArray32 = new byte[] { (byte) 100, (byte) 100 };
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray32, (byte) 10, 0);
        byte[] byteArray37 = org.apache.commons.lang3.ArrayUtils.add(byteArray32, (byte) 1);
        byte[] byteArray40 = org.apache.commons.lang3.ArrayUtils.add(byteArray37, (int) (short) 0, (byte) 1);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray15, byteArray37);
        byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray37, (byte) 10);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, 100, 1, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100, 100, 1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1, 100, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[100, 100, 1]");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        int[] intArray3 = new int[] { 100, (short) 10, '4' };
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray9);
        int[] intArray16 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray10, intArray16);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.addAll(intArray3, intArray16);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray3, 2);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray20, (int) (short) 0);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray20, (int) (byte) 1, 2);
        java.lang.Integer[] intArray26 = org.apache.commons.lang3.ArrayUtils.toObject(intArray20);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray1);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.add(charArray3, 'a');
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray3);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(charArray7, 'a');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray7);
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.toObject(charArray7);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.add(charArray7, '4');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, 4]");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
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
        char[] charArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray35);
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray36, 'a', (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[#]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
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
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.clone(intArray21);
        java.lang.Integer[] intArray23 = org.apache.commons.lang3.ArrayUtils.toObject(intArray21);
        int[] intArray27 = new int[] { 100, (short) 10, '4' };
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray33);
        int[] intArray40 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray34, intArray40);
        int[] intArray42 = org.apache.commons.lang3.ArrayUtils.addAll(intArray27, intArray40);
        int int45 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray27, (int) '4', 3);
        int[] intArray47 = new int[] { (byte) 0 };
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray47, 0);
        int[] intArray51 = org.apache.commons.lang3.ArrayUtils.add(intArray47, 0);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.contains(intArray47, (int) (short) 0);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray60 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray59);
        int[] intArray66 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean67 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray60, intArray66);
        int[] intArray69 = org.apache.commons.lang3.ArrayUtils.add(intArray60, (int) '4');
        int[] intArray71 = org.apache.commons.lang3.ArrayUtils.add(intArray60, 10);
        int[] intArray72 = org.apache.commons.lang3.ArrayUtils.addAll(intArray47, intArray71);
        int[] intArray73 = org.apache.commons.lang3.ArrayUtils.addAll(intArray27, intArray71);
        int[] intArray74 = org.apache.commons.lang3.ArrayUtils.clone(intArray71);
        int[] intArray75 = org.apache.commons.lang3.ArrayUtils.addAll(intArray21, intArray74);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray77 = org.apache.commons.lang3.ArrayUtils.remove(intArray74, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 10, 52, 0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[0, 2, 10, 0, -1, 52]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[0, 2, 10, 0, -1, 10]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[0, 0, 2, 10, 0, -1, 10]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[100, 10, 52, 0, 2, 10, 0, -1, 10]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[0, 2, 10, 0, -1, 10]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[0, 0, 2, 10, 0, -1, 10]");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) (-1));
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.add(longArray8, 0, (long) 1);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.add(longArray11, 100L);
        java.lang.Long[] longArray14 = org.apache.commons.lang3.ArrayUtils.toObject(longArray13);
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray13, (long) '4');
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray13);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[1, -1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[1, -1, 10, -1, 10, 1, 1, 100]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[1, -1, 10, -1, 10, 1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        java.lang.Long[] longArray6 = new java.lang.Long[] { 0L, 100L, (-1L), (-1L), 100L, 100L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        long[] longArray12 = new long[] { 0L, (byte) 1, '4', (-1) };
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.clone(longArray12);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray12);
        java.lang.Long[] longArray21 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray21, (long) (-1));
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray23, (long) '#');
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.subarray(longArray23, (int) '4', (int) (byte) 10);
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray23, (long) 6);
        long[] longArray31 = new long[] {};
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.contains(longArray31, (long) (short) 1);
        long[] longArray34 = org.apache.commons.lang3.ArrayUtils.clone(longArray31);
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.addAll(longArray23, longArray34);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray12, longArray35);
        long[] longArray37 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray12);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0, 100, -1, -1, 100, 100]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[-1, 52, 1, 0]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[0, 1, 52, -1]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[0, 100, -1, -1, 100, 100, -1, 52, 1, 0]");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
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
        java.lang.Double[] doubleArray26 = new java.lang.Double[] { (-1.0d), 1.0d, 0.0d, 1.0d, 10.0d, 10.0d };
        double[] doubleArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray26, (double) '#');
        double[] doubleArray31 = org.apache.commons.lang3.ArrayUtils.add(doubleArray28, (int) (short) 1, (double) 1.0f);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray31, (double) (short) -1);
        double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray31);
        java.lang.Double[] doubleArray35 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray34);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        int int37 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) floatArray36);
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray35, (java.lang.Object) floatArray36);
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) longArray0, (java.lang.Object) doubleArray35);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray46 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray45);
        int[] intArray48 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray45, 10);
        int[] intArray50 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray45, (int) (short) 0);
        int int51 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray35, (java.lang.Object) intArray45);
        double[] doubleArray52 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray35);
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
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) (-1));
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) '#');
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.subarray(longArray8, (int) '4', (int) (byte) 10);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray8, (long) 6);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.remove(longArray8, 4);
        long[] longArray20 = new long[] { (byte) -1, 10 };
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.clone(longArray20);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.add(longArray21, 0, (long) 10);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.addAll(longArray17, longArray21);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[-1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[-1, 10]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[-1, 10]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[10, -1, 10]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[-1, 10, -1, 10, 1, -1, 10]");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, 1.0f);
        double[] doubleArray4 = new double[] { (byte) 10 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray4);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) floatArray0, (java.lang.Object[]) doubleArray7);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, (float) 0L);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.clone(floatArray12);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray12, (int) (short) 100, 10);
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
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
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
        boolean[] booleanArray45 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray32, false);
        boolean[] booleanArray47 = org.apache.commons.lang3.ArrayUtils.add(booleanArray32, true);
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray47, true);
        boolean[] booleanArray52 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray47, (int) (short) 0, (int) 'a');
        boolean[] booleanArray53 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray52);
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
        org.junit.Assert.assertNotNull(booleanArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray45), "[true, true, true, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray47), "[true, true, false, true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(booleanArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray52), "[true, true, false, true, true, true, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray53), "[true, true, false, true, true, true, false, false, true]");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray4, (byte) 0);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray9, (byte) 10, 0);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray4, byteArray9);
        byte[] byteArray14 = null;
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray13, byteArray14);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.add(byteArray14, (byte) -1);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.clone(byteArray17);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1]");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        char[] charArray5 = new char[] { '#', '#', 'a', ' ', '4' };
        char[] charArray11 = new char[] { '#', '#', 'a', ' ', '4' };
        char[][] charArray12 = new char[][] { charArray5, charArray11 };
        char[][] charArray15 = org.apache.commons.lang3.ArrayUtils.subarray(charArray12, 100, 5);
        char[][] charArray16 = org.apache.commons.lang3.ArrayUtils.clone(charArray15);
        float[] floatArray18 = new float[] { '#' };
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.add(floatArray18, (float) (-1));
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray20, 0.0f);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray20, 0, 10);
        char[][] charArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray16, (java.lang.Object) 10);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "##a 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "##a 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, #, a,  , 4]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "##a 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "##a 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, #, a,  , 4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[35.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[35.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[35.0, -1.0]");
        org.junit.Assert.assertNotNull(charArray26);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        int[] intArray3 = new int[] { 100, (short) 10, '4' };
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray9);
        int[] intArray16 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray10, intArray16);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.addAll(intArray3, intArray16);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.subarray(intArray3, (int) (short) -1, 1);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.subarray(intArray21, 1, (int) (short) -1);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray24, 4);
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
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        short[] shortArray4 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray4, (short) (byte) 0, 2);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) 100);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(shortArray9, (short) (byte) 1);
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray9, (int) (short) 0, (int) '#');
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[1, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[1, 10, 0]");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        short[] shortArray3 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        short[] shortArray9 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) (byte) 0, 2);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray9);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray3, (short) (byte) 0);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray3, (short) (byte) 100, (int) (short) 1);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray3, (short) (byte) 0, 100);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
        float[] floatArray41 = new float[] {};
        float[] floatArray43 = org.apache.commons.lang3.ArrayUtils.add(floatArray41, (float) 10L);
        float[] floatArray45 = new float[] { (byte) -1 };
        float[] floatArray46 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray43, floatArray45);
        int int48 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray46, (float) (-1L));
        int int50 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray46, (float) 100L);
        float[] floatArray51 = org.apache.commons.lang3.ArrayUtils.clone(floatArray46);
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray40, floatArray46);
        float[] floatArray55 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray40, (int) (byte) 1, (int) ' ');
        float[] floatArray58 = org.apache.commons.lang3.ArrayUtils.add(floatArray40, 0, (float) (short) -1);
        float[] floatArray61 = org.apache.commons.lang3.ArrayUtils.add(floatArray58, 0, 0.0f);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[]");
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray45), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray46), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray51), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray55), "[]");
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray58), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray61), "[0.0, -1.0, 10.0]");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 10L);
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray3);
        java.lang.Float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray3);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray3);
        float[] floatArray7 = new float[] {};
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.add(floatArray7, (float) 10L);
        float[] floatArray10 = new float[] {};
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray7, floatArray10);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray10, (float) (byte) 0, (int) (short) 1);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        int int16 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) floatArray15);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray10, floatArray15);
        java.lang.Float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray17);
        float[] floatArray20 = new float[] { '#' };
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.add(floatArray20, (float) (-1));
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.clone(floatArray20);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray17, floatArray20);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray3, floatArray20);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[35.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[35.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[35.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[35.0]");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.add(intArray1, 0);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, (int) (byte) 1, (int) ' ');
        int[] intArray10 = new int[] { (byte) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray10, 0);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray10, 10, 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray10, 0, 1);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.addAll(intArray1, intArray10);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.clone(intArray1);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray20);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.subarray(intArray20, 0, (int) ' ');
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray24, 0);
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(charArray1, '#');
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray1, '4');
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, '4', (int) (byte) -1);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.remove(charArray6, 0);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray6, 'a');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[#]");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#]");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
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
        java.lang.Integer[] intArray21 = org.apache.commons.lang3.ArrayUtils.toObject(intArray10);
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray21);
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
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0]");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray1);
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray2);
        java.lang.Double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        short[] shortArray10 = new short[] { (short) 0, (byte) 0, (byte) -1, (short) 100, (short) 10 };
        short[] shortArray15 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray15, (short) (byte) 0, 2);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray10, shortArray15);
        short[] shortArray23 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray23);
        short[] shortArray29 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray29, (short) (byte) 0, 2);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray23, shortArray29);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray29);
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray29, (short) -1, (int) (byte) 1);
        short[] shortArray38 = null;
        short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray29, shortArray38);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray10, shortArray29);
        java.lang.Short[] shortArray41 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray29);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) doubleArray4, (java.lang.Object) shortArray41);
        short[] shortArray44 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray41, (short) (byte) 100);
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray44, (short) (byte) 100);
        short[] shortArray50 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray50);
        short[] shortArray56 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int59 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray56, (short) (byte) 0, 2);
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray50, shortArray56);
        int int62 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray50, (short) (byte) 0);
        short[] shortArray67 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int70 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray67, (short) (byte) 0, 2);
        short[] shortArray72 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray67, (short) 100);
        short[] shortArray73 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray50, shortArray72);
        int int75 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray73, (short) (byte) -1);
        boolean boolean76 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray44, shortArray73);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[0, 0, -1, 100, 10]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray44), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(shortArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray67), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray72), "[1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray73), "[100, 10, 100, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        long[] longArray2 = new long[] { (byte) -1, 10 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.clone(longArray2);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray3);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(longArray3, (long) '4');
        long[] longArray9 = new long[] { (byte) -1, 10 };
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.clone(longArray9);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray10);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.clone(longArray10);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(longArray10, (long) 'a');
        java.lang.Long[] longArray21 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray21, (long) (-1));
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.add(longArray23, 0, (long) 1);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray23, (long) (-1), (int) (byte) 1);
        long[] longArray30 = new long[] {};
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.contains(longArray30, (long) (short) 1);
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.addAll(longArray23, longArray30);
        java.lang.Long[] longArray40 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray42 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray40, (long) (-1));
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray42, (long) '#');
        long[] longArray47 = org.apache.commons.lang3.ArrayUtils.subarray(longArray42, (int) '4', (int) (byte) 10);
        java.lang.Long[] longArray54 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray56 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray54, (long) (-1));
        int int58 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray56, (long) '#');
        long[] longArray59 = org.apache.commons.lang3.ArrayUtils.addAll(longArray47, longArray56);
        long[] longArray62 = new long[] { (byte) -1, 10 };
        long[] longArray63 = org.apache.commons.lang3.ArrayUtils.clone(longArray62);
        boolean boolean64 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray47, longArray62);
        long[] longArray65 = org.apache.commons.lang3.ArrayUtils.addAll(longArray33, longArray62);
        long[] longArray67 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray62, (long) (byte) 1);
        boolean boolean68 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray10, longArray62);
        boolean boolean69 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray3, longArray10);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 10]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[-1, 10]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[1, -1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[-1, 10]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[-1, 10, -1, 10, 1, 1, -1, 10]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        char[] charArray0 = null;
        char[] charArray2 = new char[] { '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.toObject(charArray2);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.clone(charArray2);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 'a');
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.toObject(charArray4);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray4, ' ');
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray4, ' ', 2);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray4, 'a', (int) (short) 10);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.clone(charArray4);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray0, charArray4);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 'a');
        char[] charArray21 = new char[] { ' ' };
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.add(charArray21, '#');
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.contains(charArray21, '4');
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray21, 'a');
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray19, charArray27);
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.subarray(charArray27, (int) (short) 0, 0);
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
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[#, a]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ ]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ , #]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[]");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { (-1.0d), 1.0d, 0.0d, 1.0d, 10.0d, 10.0d };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) '#');
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.add(doubleArray8, (int) (short) 1, (double) 1.0f);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray11, (double) (short) -1);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray11);
        java.lang.Double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray14);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) doubleArray15);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray15);
        java.lang.Double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray17);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray18);
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray19, (int) (byte) 0, 4);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 10.0, 1.0, 0.0, 1.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0, 1.0, 0.0, 1.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 10.0, 1.0, 0.0]");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray1);
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray2);
        java.lang.Double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (short) -1);
        java.lang.Double[] doubleArray10 = new java.lang.Double[] { 100.0d, 1.0d, 100.0d };
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray10);
        int int12 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) doubleArray10);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray10, (double) (byte) 100);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray10, 0.0d);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray16);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray3);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) (short) 1, (-1));
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray3, 10, (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        boolean[] booleanArray4 = new boolean[] { true, true, false, true };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray4, true, (int) '4');
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray4);
        java.lang.Boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray4);
        java.lang.Boolean[] booleanArray15 = new java.lang.Boolean[] { true, true, false, false, true };
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray15);
        java.lang.Boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray16);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray4, booleanArray16);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray16, 2);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray20, true, 1);
        boolean[] booleanArray24 = null;
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray20, booleanArray24);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray20, false, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray20, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[true, true, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        char[] charArray0 = null;
        char[] charArray2 = new char[] { '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.toObject(charArray2);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.clone(charArray2);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 'a');
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.toObject(charArray4);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray4, ' ');
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray4, ' ', 2);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray4, 'a', (int) (short) 10);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.clone(charArray4);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray0, charArray4);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 'a');
        char[] charArray21 = new char[] { ' ' };
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.add(charArray21, '#');
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.contains(charArray21, '4');
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray21, 'a');
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray19, charArray27);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray27, 'a');
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
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[#, a]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ ]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ , #]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        short[] shortArray5 = new short[] { (short) 0, (byte) 0, (byte) -1, (short) 100, (short) 10 };
        short[] shortArray10 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray10, (short) (byte) 0, 2);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray5, shortArray10);
        short[] shortArray18 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray18);
        short[] shortArray24 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray24, (short) (byte) 0, 2);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray18, shortArray24);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray24);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray24, (short) -1, (int) (byte) 1);
        short[] shortArray33 = null;
        short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray24, shortArray33);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray5, shortArray24);
        java.lang.Short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray24);
        java.lang.Boolean[] booleanArray42 = new java.lang.Boolean[] { true, true, false, false, true };
        boolean[] booleanArray43 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray42);
        java.lang.Boolean[] booleanArray44 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray43);
        boolean[] booleanArray46 = org.apache.commons.lang3.ArrayUtils.add(booleanArray43, true);
        java.lang.Boolean[] booleanArray47 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray46);
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) shortArray36, (java.lang.Object) booleanArray47, (int) (short) 100);
        boolean[] booleanArray50 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray47);
        boolean[] booleanArray52 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray47, false);
        int int54 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray52, false);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0, 0, -1, 100, 10]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertNotNull(booleanArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray43), "[true, true, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray44);
        org.junit.Assert.assertNotNull(booleanArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray46), "[true, true, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(booleanArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray50), "[true, true, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray52), "[true, true, false, false, true, true]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 3 + "'", int54 == 3);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        java.lang.Long[] longArray0 = new java.lang.Long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 0);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) 10, 0);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray6, byteArray11);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray0, (java.lang.Object) byteArray15);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (byte) 0);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (byte) 1);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray15, byteArray21);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray15);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray15, (byte) 10);
        int[] intArray31 = new int[] { (byte) 0 };
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray31, 0);
        int[] intArray35 = org.apache.commons.lang3.ArrayUtils.add(intArray31, 0);
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray35, (int) '#');
        int[] intArray39 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray35, (int) (short) 0);
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray39, (int) (byte) 0);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) (byte) 10, (java.lang.Object) (byte) 0);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, 100, 1, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(charArray3, 'a');
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray3, ' ');
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray3, '#', (int) 'a');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.subarray(charArray3, (int) (byte) 1, (-1));
        java.lang.Character[] charArray14 = org.apache.commons.lang3.ArrayUtils.toObject(charArray13);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.subarray(charArray13, (int) (short) 100, 3);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[#]");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[]");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.add(intArray1, 0);
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.toObject(intArray5);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6, (int) (byte) 10);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) intArray8, (java.lang.Object) 100.0d);
        int[] intArray12 = new int[] { (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray12, 0);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.add(intArray12, 0);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray12, (int) (byte) 1, (int) ' ');
        int[] intArray21 = new int[] { (byte) 0 };
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray21, 0);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray21, 10, 0);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray21, 0, 1);
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.addAll(intArray12, intArray21);
        int[] intArray31 = org.apache.commons.lang3.ArrayUtils.clone(intArray21);
        int int34 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray31, 1, (int) (short) 0);
        int[] intArray35 = org.apache.commons.lang3.ArrayUtils.addAll(intArray8, intArray31);
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray8, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
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
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray33, '#', (int) '#');
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) (-1));
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) '#');
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.subarray(longArray8, (int) '4', (int) (byte) 10);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray8, (long) 6);
        long[] longArray16 = new long[] {};
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.contains(longArray16, (long) (short) 1);
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.clone(longArray16);
        long[] longArray20 = org.apache.commons.lang3.ArrayUtils.addAll(longArray8, longArray19);
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.add(longArray19, (long) 2);
        java.lang.Long[] longArray23 = org.apache.commons.lang3.ArrayUtils.toObject(longArray19);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray23);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[2]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[]");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
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
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray10, 10, 0);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.add(floatArray19, (float) (-1));
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray19, (float) (byte) 0);
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
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
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
        java.lang.Double[] doubleArray52 = new java.lang.Double[] { (-1.0d), 1.0d, 0.0d, 1.0d, 10.0d, 10.0d };
        double[] doubleArray54 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray52, (double) '#');
        double[] doubleArray57 = org.apache.commons.lang3.ArrayUtils.add(doubleArray54, (int) (short) 1, (double) 1.0f);
        boolean boolean59 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray57, (double) (short) -1);
        double[] doubleArray60 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray57);
        java.lang.Double[] doubleArray61 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray60);
        float[] floatArray62 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        int int63 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) floatArray62);
        int int64 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray61, (java.lang.Object) floatArray62);
        boolean boolean65 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) shortArray45, (java.lang.Object[]) doubleArray61);
        double[] doubleArray66 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray61);
        char[] charArray68 = new char[] { '#' };
        java.lang.Character[] charArray69 = org.apache.commons.lang3.ArrayUtils.toObject(charArray68);
        char[] charArray70 = org.apache.commons.lang3.ArrayUtils.clone(charArray68);
        char[] charArray72 = org.apache.commons.lang3.ArrayUtils.add(charArray70, 'a');
        char[] charArray79 = new char[] { '#', 'a', '4', '#', ' ', ' ' };
        int int82 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray79, '4', (int) (byte) 100);
        int int85 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray79, '#', 0);
        char[] charArray86 = org.apache.commons.lang3.ArrayUtils.addAll(charArray70, charArray79);
        char[] charArray88 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray79, 'a');
        int int90 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray61, (java.lang.Object) charArray88, (int) (byte) -1);
        double[] doubleArray92 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray61, (double) (short) 100);
        double[] doubleArray94 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray61, (double) (short) 1);
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
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertNotNull(floatArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray62), "[]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray68), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray68), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray68), "[#]");
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray70), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray70), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray70), "[#]");
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray72), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray72), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray72), "[#, a]");
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray79), "#a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray79), "#a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray79), "[#, a, 4, #,  ,  ]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(charArray86);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray86), "##a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray86), "##a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray86), "[#, #, a, 4, #,  ,  ]");
        org.junit.Assert.assertNotNull(charArray88);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray88), "#4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray88), "#4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray88), "[#, 4, #,  ,  ]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray92), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray94), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
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
        short[] shortArray26 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray26);
        short[] shortArray32 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray32, (short) (byte) 0, 2);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray26, shortArray32);
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray26, (short) (byte) 0);
        short[] shortArray43 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray43, (short) (byte) 0, 2);
        short[] shortArray48 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray43, (short) 100);
        short[] shortArray49 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray26, shortArray48);
        short[] shortArray50 = org.apache.commons.lang3.ArrayUtils.clone(shortArray26);
        short[] shortArray52 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray26, (short) (byte) -1);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray19, shortArray52);
        short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.add(shortArray19, (int) (byte) 1, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray59 = org.apache.commons.lang3.ArrayUtils.add(shortArray19, (int) ' ', (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray43), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray48), "[1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[100, 10, 100, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[100, 10, 100]");
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray52), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[0, 100, 100, 10, 1]");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.add(intArray1, 0);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, (int) (byte) 1, (int) ' ');
        int[] intArray10 = new int[] { (byte) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray10, 0);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray10, 10, 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray10, 0, 1);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.addAll(intArray1, intArray10);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray10, (int) (byte) 1);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray10, (int) ' ');
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray10, (int) (short) 1, 5);
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.add(intArray10, (int) (byte) -1);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, -1]");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        java.lang.Short[][][][] shortArray0 = new java.lang.Short[][][][] {};
        java.lang.Short[][][][] shortArray1 = new java.lang.Short[][][][] {};
        java.lang.Short[][][][] shortArray2 = new java.lang.Short[][][][] {};
        java.lang.Short[][][][] shortArray3 = new java.lang.Short[][][][] {};
        java.lang.Short[][][][] shortArray4 = new java.lang.Short[][][][] {};
        java.lang.Short[][][][] shortArray5 = new java.lang.Short[][][][] {};
        java.lang.Short[][][][][] shortArray6 = new java.lang.Short[][][][][] { shortArray0, shortArray1, shortArray2, shortArray3, shortArray4, shortArray5 };
        java.lang.Byte[] byteArray9 = new java.lang.Byte[] { (byte) 0, (byte) 100 };
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray9);
        java.lang.Long[] longArray17 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray17, (long) (-1));
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray9, (java.lang.Object) longArray19, (int) (short) -1);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray9, (byte) 1);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.contains(byteArray23, (byte) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray23);
        java.lang.Short[][][][][] shortArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray6, (java.lang.Object) byteArray23);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray23, (int) (byte) -1, 5);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 100]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[100, 0]");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        long[] longArray3 = new long[] { (byte) 0, (-1L), (short) 0 };
        org.apache.commons.lang3.ArrayUtils.reverse(longArray3);
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.subarray(longArray3, 3, (int) (byte) 0);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, -1, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[]");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, 100L, (-1L), (-1L), 100L, 100L };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray8);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) floatArray0, (java.lang.Object) longArray8);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray8, (long) (short) 100);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[0, 100, -1, -1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[0, 100, -1, -1, 100, 100]");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        boolean[] booleanArray4 = new boolean[] { true, true, false, true };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray4, true, (int) '4');
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray4);
        java.lang.Boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray4);
        boolean[] booleanArray14 = new boolean[] { true, true, false, false };
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray14, false);
        boolean[] booleanArray21 = new boolean[] { true, true, false, true };
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray21, true, (int) '4');
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray14, booleanArray21);
        boolean[] booleanArray30 = new boolean[] { true, true, false, false };
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray30, false);
        boolean[] booleanArray37 = new boolean[] { true, true, false, true };
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray37, true, (int) '4');
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray30, booleanArray37);
        boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray21, booleanArray30);
        int int45 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray21, true, (int) (byte) 10);
        boolean[] booleanArray50 = new boolean[] { true, true, false, true };
        int int53 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray50, true, (int) '4');
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray50);
        boolean[] booleanArray56 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray50, false);
        boolean[] booleanArray57 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray50);
        boolean[] booleanArray58 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray21, booleanArray50);
        boolean[] booleanArray59 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray4, booleanArray21);
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray59);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray42), "[true, true, false, true, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertNotNull(booleanArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray50), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(booleanArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray56), "[true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray57), "[true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray58), "[true, true, false, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray59), "[true, true, false, true, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        long[] longArray4 = new long[] { 0L, (byte) 1, '4', (-1) };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.clone(longArray4);
        long[] longArray6 = null;
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.addAll(longArray4, longArray6);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[0, 1, 52, -1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, 1, 52, -1]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0, 1, 52, -1]");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray4, (byte) 0);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray9, (byte) 10, 0);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray4, byteArray9);
        byte[] byteArray14 = null;
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray13, byteArray14);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.remove(byteArray13, 2);
        java.lang.Byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray17);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray17, (int) (short) 0, 6);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.remove(byteArray21, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100, 100, 1, 0, -1]");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 10L);
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray3);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, (int) (byte) 0, (int) 'a');
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray4, (float) ' ', (int) (short) 10);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray4, (float) 0L, (int) '#');
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        double[] doubleArray5 = new double[] { '4', (-1.0f), (-1.0d), 1, 100.0d };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) (short) -1);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) (-1.0f), (int) (byte) 1);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray5, (double) 5);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) (short) 100, (int) 'a');
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.add(doubleArray5, (double) 1L);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray17, (double) (-1.0f), 10.0d);
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.add(doubleArray17, 100.0d);
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.add(doubleArray22, 0, (double) 10L);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray25, (double) (-1L), (double) (byte) 10);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray25, 10.0d, (double) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[52.0, -1.0, -1.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[52.0, -1.0, -1.0, 1.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 52.0, -1.0, -1.0, 1.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 6 + "'", int31 == 6);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        boolean[] booleanArray4 = new boolean[] { true, true, false, true };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray4, true, (int) '4');
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray4);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray4, false);
        java.lang.Boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray4);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray4, false);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 100 };
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray10, (long) (-1));
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray2, (java.lang.Object) longArray12, (int) (short) -1);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) 1);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) -1);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) byteArray2);
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
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
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
        short[] shortArray26 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray26);
        short[] shortArray32 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray32, (short) (byte) 0, 2);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray26, shortArray32);
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray26, (short) (byte) 0);
        short[] shortArray43 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray43, (short) (byte) 0, 2);
        short[] shortArray48 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray43, (short) 100);
        short[] shortArray49 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray26, shortArray48);
        short[] shortArray50 = org.apache.commons.lang3.ArrayUtils.clone(shortArray26);
        short[] shortArray52 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray26, (short) (byte) -1);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray19, shortArray52);
        short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.add(shortArray19, (int) (byte) 1, (short) 100);
        int int59 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray19, (short) 10, (int) (short) 10);
        int int61 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray19, (short) (byte) 0);
        int int64 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray19, (short) 0, (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray43), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray48), "[1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[100, 10, 100, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[100, 10, 100]");
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray52), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[0, 100, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        long[] longArray2 = new long[] { (byte) -1, 10 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.clone(longArray2);
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.add(longArray3, 0, (long) 10);
        java.lang.Long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toObject(longArray3);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray7, (long) '4');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 10]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[10, -1, 10]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[-1, 10]");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        short[] shortArray3 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        short[] shortArray9 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) (byte) 0, 2);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray9);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray9);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(shortArray9, (short) 1);
        short[] shortArray20 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray20);
        short[] shortArray26 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray26, (short) (byte) 0, 2);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray20, shortArray26);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray26);
        int int34 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray26, (short) -1, (int) (byte) 1);
        short[] shortArray35 = null;
        short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray26, shortArray35);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray9, shortArray26);
        java.lang.String str39 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) shortArray26, "");
        short[] shortArray41 = org.apache.commons.lang3.ArrayUtils.add(shortArray26, (short) 10);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "{0,100,10,1}" + "'", str39, "{0,100,10,1}");
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[0, 100, 10, 1, 10]");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray1 = org.apache.commons.lang3.ArrayUtils.clone(typeArray0);
        float[] floatArray2 = new float[] {};
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (float) 10L);
        float[] floatArray6 = new float[] { (byte) -1 };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray6);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) typeArray1, (java.lang.Object) floatArray4);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, (-1), (int) (short) 0);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.add(floatArray11, (float) 5);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray13, (float) (short) 0);
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
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[5.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[5.0]");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        boolean[] booleanArray4 = new boolean[] { true, true, false, false };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray4, false);
        boolean[] booleanArray11 = new boolean[] { true, true, false, true };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, true, (int) '4');
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray4, booleanArray11);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray11, true, (int) 'a');
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, true, (int) '4');
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray11);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray22, false, (int) (byte) 0);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray22, true, (int) '4');
        boolean[] booleanArray33 = new boolean[] { true, true, false, true };
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray33, true, (int) '4');
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray33);
        java.lang.Boolean[] booleanArray38 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray33);
        java.lang.Boolean[] booleanArray44 = new java.lang.Boolean[] { true, true, false, false, true };
        boolean[] booleanArray45 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray44);
        java.lang.Boolean[] booleanArray46 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray45);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray33, booleanArray45);
        boolean[] booleanArray48 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray22, booleanArray33);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertNotNull(booleanArray44);
        org.junit.Assert.assertNotNull(booleanArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray45), "[true, true, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray48), "[true, true, false, true, true, true, false, true]");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2);
        double[] doubleArray10 = new double[] { '4', (-1.0f), (-1.0d), 1, 100.0d };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray10, (double) (short) -1);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, (double) (-1.0f), (int) (byte) 1);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray10, (double) 5);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray10, (double) (short) 100, (int) 'a');
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, (double) 1L, (int) (byte) 1);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray2, (java.lang.Object) int23, (int) (byte) 100);
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2, '#');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[#]");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#]");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[#]");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, 0);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, 100, 3);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, (int) (short) 10, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0, false);
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0, true);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0, true);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[]");
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[]");
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[]");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        java.lang.Object[] objArray0 = null;
        int[] intArray2 = new int[] { (byte) 0 };
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray2, 0);
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray5);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(objArray0, (java.lang.Object[]) intArray5);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 0L, 100L, 100L, 1L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray5, (long) ' ');
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray7, (long) (short) -1);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray7, (long) 100, 4);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[100, 0, 100, 100, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        java.lang.Long[] longArray0 = new java.lang.Long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 0);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) 10, 0);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray6, byteArray11);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray0, (java.lang.Object) byteArray15);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (byte) 0);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (byte) 1);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray15, byteArray21);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray15);
        java.lang.Long[] longArray28 = new java.lang.Long[] {};
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray28);
        byte[] byteArray34 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray34, (byte) 0);
        byte[] byteArray39 = new byte[] { (byte) 100, (byte) 100 };
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray39, (byte) 10, 0);
        byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray34, byteArray39);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray28, (java.lang.Object) byteArray43);
        byte[] byteArray49 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray51 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray49, (byte) 0);
        byte[] byteArray53 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray49, (byte) 1);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray43, byteArray49);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray43);
        byte[] byteArray57 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray43, (byte) 10);
        boolean boolean58 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray15, byteArray57);
        byte[] byteArray59 = org.apache.commons.lang3.ArrayUtils.clone(byteArray15);
        byte[] byteArray61 = org.apache.commons.lang3.ArrayUtils.remove(byteArray59, 4);
        int int64 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray59, (byte) 0, (int) '4');
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, 100, 1, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[100, 100, 1, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[-1, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[100, 100, 1, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[100, 100, 1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[100, 100, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        java.lang.Class<?>[] wildcardClassArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        java.lang.Long[] longArray7 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray7, (long) (-1));
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray9, 0, (long) 1);
        java.lang.Class<?> wildcardClass13 = longArray9.getClass();
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ArrayUtils.add(wildcardClassArray0, wildcardClass13);
        short[] shortArray18 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray18);
        short[] shortArray24 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray24, (short) (byte) 0, 2);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray18, shortArray24);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.contains(shortArray24, (short) 10);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) wildcardClassArray14, (java.lang.Object) shortArray24);
        java.lang.Short[] shortArray38 = new java.lang.Short[] { (short) 10, (short) 100, (short) -1, (short) 1, (short) 0, (short) 0 };
        short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray38);
        short[] shortArray40 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray38);
        short[] shortArray42 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray38, (short) (byte) -1);
        short[] shortArray43 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray24, shortArray42);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.contains(shortArray43, (short) 10);
        short[] shortArray46 = org.apache.commons.lang3.ArrayUtils.clone(shortArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray0);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[1, -1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray43), "[1, 10, 100, 0, 10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[1, 10, 100, 0, 10, 100, -1, 1, 0, 0]");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.lang3.ArrayUtils arrayUtils0 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils1 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils2 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils3 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils4 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray5 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils0, arrayUtils1, arrayUtils2, arrayUtils3, arrayUtils4 };
        org.apache.commons.lang3.ArrayUtils arrayUtils6 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils7 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils8 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils9 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils10 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray11 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils6, arrayUtils7, arrayUtils8, arrayUtils9, arrayUtils10 };
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray12 = new org.apache.commons.lang3.ArrayUtils[][] { arrayUtilsArray5, arrayUtilsArray11 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(arrayUtilsArray12);
        org.junit.Assert.assertNotNull(arrayUtilsArray5);
        org.junit.Assert.assertNotNull(arrayUtilsArray11);
        org.junit.Assert.assertNotNull(arrayUtilsArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.add(floatArray17, (float) 100L);
        float[] floatArray22 = new float[] {};
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.add(floatArray22, (float) 10L);
        float[] floatArray26 = new float[] { (byte) -1 };
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray24, floatArray26);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray21, floatArray27);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray21, (float) (-1), (int) '4');
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
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[100.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        java.lang.Double[] doubleArray1 = new java.lang.Double[] { 10.0d };
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray1);
        double[] doubleArray4 = new double[] { (byte) 10 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray4);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray5);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray2, doubleArray5);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray2);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray2, (double) (-1), 4, 100.0d);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.add(doubleArray2, (double) 100L);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0]");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
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
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.contains(longArray13, (long) 1);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray13, (long) 3, 6);
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        short[] shortArray3 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        short[] shortArray9 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) (byte) 0, 2);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray9);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray3, (short) (byte) 0);
        short[] shortArray20 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray20, (short) (byte) 0, 2);
        short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray20, (short) 100);
        short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray25);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.clone(shortArray3);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray3, (short) -1, (int) (short) 10);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[100, 10, 100, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        java.lang.Byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray0, (byte) 0);
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray0);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray0, (byte) 10);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) (-1));
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.add(longArray8, 0, (long) 1);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.add(longArray11, 100L);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray11, (long) (byte) 10);
        java.lang.Long[] longArray22 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray22, (long) (-1));
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.add(longArray24, 0, (long) 1);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray24, (long) (-1), (int) (byte) 1);
        long[] longArray31 = new long[] {};
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.contains(longArray31, (long) (short) 1);
        long[] longArray34 = org.apache.commons.lang3.ArrayUtils.addAll(longArray24, longArray31);
        java.lang.Long[] longArray41 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray43 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray41, (long) (-1));
        int int45 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray43, (long) '#');
        long[] longArray48 = org.apache.commons.lang3.ArrayUtils.subarray(longArray43, (int) '4', (int) (byte) 10);
        java.lang.Long[] longArray55 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray57 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray55, (long) (-1));
        int int59 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray57, (long) '#');
        long[] longArray60 = org.apache.commons.lang3.ArrayUtils.addAll(longArray48, longArray57);
        long[] longArray63 = new long[] { (byte) -1, 10 };
        long[] longArray64 = org.apache.commons.lang3.ArrayUtils.clone(longArray63);
        boolean boolean65 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray48, longArray63);
        long[] longArray66 = org.apache.commons.lang3.ArrayUtils.addAll(longArray34, longArray63);
        java.lang.Long[] longArray73 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray75 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray73, (long) (-1));
        long[] longArray76 = org.apache.commons.lang3.ArrayUtils.clone(longArray75);
        java.lang.Long[] longArray83 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray85 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray83, (long) (-1));
        int int88 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray85, (long) (short) -1, 10);
        int int90 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray85, (long) ' ');
        boolean boolean91 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray75, longArray85);
        boolean boolean92 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray75);
        boolean boolean93 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray34, longArray75);
        boolean boolean94 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray11, longArray75);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray75);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[1, -1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[1, -1, 10, -1, 10, 1, 1, 100]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[1, -1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[-1, 10]");
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[-1, 10, -1, 10, 1, 1, -1, 10]");
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[1, 1, 10, -1, 10, -1]");
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertNotNull(longArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray85), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 100 };
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray10, (long) (-1));
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray2, (java.lang.Object) longArray12, (int) (short) -1);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) 1);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) 0);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) 1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 100]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 100]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 100]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 100]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 100]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 100]");
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) (-1));
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray8, (long) '4', (int) (short) 100);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray8, (long) (byte) 100);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray4, (byte) 0);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray4, (byte) 1);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) 10, 0);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.add(byteArray11, (byte) 1);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (int) (short) 0, (byte) 1);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 10);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.remove(byteArray21, 0);
        java.lang.Long[] longArray24 = new java.lang.Long[] {};
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray24);
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray30, (byte) 0);
        byte[] byteArray35 = new byte[] { (byte) 100, (byte) 100 };
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray35, (byte) 10, 0);
        byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray30, byteArray35);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray24, (java.lang.Object) byteArray39);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray23, byteArray39);
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray4, byteArray23);
        java.lang.Byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray42);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 100, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100, 100, 1, 10]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-1, 0, 0, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-1, 0, 0, 1, 100, 1, 10]");
        org.junit.Assert.assertNotNull(byteArray43);
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
        short[] shortArray20 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray20, (short) (byte) 0, 2);
        short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray20, (short) 100);
        short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray25);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.clone(shortArray3);
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray3, (short) (byte) -1);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray29);
        short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray29, (short) 1);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.contains(shortArray29, (short) -1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[100, 10, 100, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[100, 10, 100]");
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) charArray2, (java.lang.Object) (short) 10);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2);
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
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray1 = org.apache.commons.lang3.ArrayUtils.clone(typeArray0);
        float[] floatArray2 = new float[] {};
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (float) 10L);
        float[] floatArray6 = new float[] { (byte) -1 };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray6);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) typeArray1, (java.lang.Object) floatArray4);
        java.lang.Object[][] objArray11 = org.apache.commons.lang3.ArrayUtils.subarray((java.lang.Object[][]) typeArray1, 100, 1);
        char[] charArray13 = new char[] { '#' };
        java.lang.Character[] charArray14 = org.apache.commons.lang3.ArrayUtils.toObject(charArray13);
        int[] intArray16 = new int[] { (byte) 0 };
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray16, 0);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.add(intArray16, 0);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray16, (int) (short) 100);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) charArray14, (java.lang.Object) intArray16);
        int[] intArray25 = new int[] { (byte) 0 };
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray25, 0);
        int[] intArray29 = org.apache.commons.lang3.ArrayUtils.add(intArray25, 0);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray25, (int) (short) 100);
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray14, (java.lang.Object) (short) 100);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) typeArray1, (java.lang.Object[]) charArray14);
        char[] charArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray14);
        char[] charArray36 = new char[] { '#' };
        java.lang.Character[] charArray37 = org.apache.commons.lang3.ArrayUtils.toObject(charArray36);
        char[] charArray38 = org.apache.commons.lang3.ArrayUtils.clone(charArray36);
        char[] charArray40 = org.apache.commons.lang3.ArrayUtils.add(charArray38, 'a');
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray38, ' ');
        char[] charArray45 = org.apache.commons.lang3.ArrayUtils.subarray(charArray38, 0, (int) (byte) -1);
        int int47 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray38, 'a');
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) charArray14, (java.lang.Object) int47);
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
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[#]");
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray1);
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray2);
        java.lang.Double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        short[] shortArray10 = new short[] { (short) 0, (byte) 0, (byte) -1, (short) 100, (short) 10 };
        short[] shortArray15 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray15, (short) (byte) 0, 2);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray10, shortArray15);
        short[] shortArray23 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray23);
        short[] shortArray29 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray29, (short) (byte) 0, 2);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray23, shortArray29);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray29);
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray29, (short) -1, (int) (byte) 1);
        short[] shortArray38 = null;
        short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray29, shortArray38);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray10, shortArray29);
        java.lang.Short[] shortArray41 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray29);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) doubleArray4, (java.lang.Object) shortArray41);
        double[] doubleArray44 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4, (double) 1L);
        double[] doubleArray46 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4, (double) ' ');
        double[] doubleArray47 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4);
        int int51 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray47, (double) 100L, 4, (double) 11);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[0, 0, -1, 100, 10]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
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
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray11, false);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, false, (int) '4');
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray11);
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
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray1);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray3, '4');
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.subarray(charArray3, (int) '4', (int) (short) 10);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray3, '#');
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray3, '#', (int) (byte) 10);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray3, '#', 1);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray3);
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
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray1);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.add(charArray3, 'a');
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray3);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray3, 'a', (int) (byte) 0);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray3, '#');
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, #]");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        boolean[] booleanArray4 = new boolean[] { true, true, false, false };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray4, false);
        boolean[] booleanArray11 = new boolean[] { true, true, false, true };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, true, (int) '4');
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray4, booleanArray11);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray4);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray4, true);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, false, true, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true]");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray5 = new boolean[] { true, true, false, false };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray5, false);
        boolean[] booleanArray12 = new boolean[] { true, true, false, true };
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray12, true, (int) '4');
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray12);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray5);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray19);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[false, false, true, true, true]");
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray4, (byte) 0);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray9, (byte) 10, 0);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray4, byteArray9);
        byte[] byteArray14 = null;
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray13, byteArray14);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.remove(byteArray13, 2);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.clone(byteArray17);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.add(byteArray17, (byte) -1);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray20, (byte) 10);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray20, (byte) -1);
        java.lang.String str26 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) (byte) -1, "{#}");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 0, 1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1" + "'", str26, "-1");
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray1 = org.apache.commons.lang3.ArrayUtils.clone(typeArray0);
        float[] floatArray2 = new float[] {};
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (float) 10L);
        float[] floatArray6 = new float[] { (byte) -1 };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) (-1L));
        float[] floatArray10 = new float[] {};
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.add(floatArray10, (float) 10L);
        float[] floatArray14 = new float[] { (byte) -1 };
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray12, floatArray14);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray7, floatArray12);
        java.lang.Float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray12);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray12, (float) 3, (int) '4');
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) typeArray0, (java.lang.Object) int20);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        java.lang.Long[] longArray30 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray30, (long) (-1));
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.add(longArray32, 0, (long) 1);
        java.lang.Class<?> wildcardClass36 = longArray32.getClass();
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ArrayUtils.add(wildcardClassArray23, wildcardClass36);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) wildcardClassArray23);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        java.lang.Long[] longArray46 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray48 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray46, (long) (-1));
        long[] longArray51 = org.apache.commons.lang3.ArrayUtils.add(longArray48, 0, (long) 1);
        java.lang.Class<?> wildcardClass52 = longArray48.getClass();
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ArrayUtils.add(wildcardClassArray39, wildcardClass52);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray54 = org.apache.commons.lang3.ArrayUtils.addAll((java.lang.reflect.GenericDeclaration[]) wildcardClassArray23, (java.lang.reflect.GenericDeclaration[]) wildcardClassArray39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type[][] typeArray55 = org.apache.commons.lang3.ArrayUtils.add(typeArray0, (int) (short) -1, (java.lang.reflect.Type[]) wildcardClassArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[1, -1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[1, -1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(genericDeclarationArray54);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray4, (byte) 0);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray9, (byte) 10, 0);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray4, byteArray9);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray9, 0, (int) (byte) 10);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray9, (byte) 100);
        java.lang.Byte[] byteArray21 = new java.lang.Byte[] { (byte) 0, (byte) 100 };
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray21);
        java.lang.Long[] longArray29 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray29, (long) (-1));
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray21, (java.lang.Object) longArray31, (int) (short) -1);
        byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray21, (byte) 1);
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray35, (byte) 10, 0);
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray35, (byte) 100, (int) (short) 1);
        byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray35, (byte) 0);
        byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray43, (byte) 1);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray9, byteArray45);
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
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 100]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, 100]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[100]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[100]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray4, (byte) 0);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray9, (byte) 10, 0);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray4, byteArray9);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray9, 0, (int) (byte) 10);
        java.lang.Byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray16);
        float[] floatArray18 = new float[] {};
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.add(floatArray18, (float) 10L);
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray18, floatArray21);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray18, (float) (byte) 1);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.add(floatArray18, (float) (-1L));
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray26, (float) 1L);
        java.lang.Float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray26);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) byteArray17, (java.lang.Object[]) floatArray29);
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
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        java.lang.Long[] longArray0 = new java.lang.Long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 0);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) 10, 0);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray6, byteArray11);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray0, (java.lang.Object) byteArray15);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray15, (byte) 100);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray15, (byte) 100);
        java.lang.Byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray20);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 0, 0, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray21);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        short[] shortArray3 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        short[] shortArray9 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) (byte) 0, 2);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray9);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray9);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray9, 3, (int) '4');
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray17, (short) 100);
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray17, (int) (byte) 1, 100);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray17);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[1]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[1]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[]");
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        java.lang.Long[] longArray0 = new java.lang.Long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 0);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) 10, 0);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray6, byteArray11);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray0, (java.lang.Object) byteArray15);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (byte) 0);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (byte) 1);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray15, byteArray21);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray15);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray15, (byte) 10);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.clone(byteArray15);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray30);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.contains(byteArray30, (byte) 0);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, 100, 1, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100, 100, 1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, 0, 0, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        int[] intArray3 = new int[] { 100, (short) 10, '4' };
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray9);
        int[] intArray16 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray10, intArray16);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.addAll(intArray3, intArray16);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.remove(intArray3, (int) (short) 1);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray20, (int) (byte) -1);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.clone(intArray20);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray23, (int) (short) 1, (int) (short) 10);
        short[] shortArray31 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray31, (short) (byte) 0, 2);
        short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray31, (short) 100);
        java.lang.Short[] shortArray37 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray36);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) intArray23, (java.lang.Object) shortArray36);
        java.lang.Integer[] intArray39 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray41 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray39, 6);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray23, intArray41);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 52]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 52]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray4, (byte) 0);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray7);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 1]");
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 10L);
        float[] floatArray4 = new float[] { (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray2, floatArray4);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, 0, (float) 6);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(floatArray2, (float) 4);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray2);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[6.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray5);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray5, 10);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray5, (int) (short) 0);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray10, (int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { (-1.0d), 1.0d, 0.0d, 1.0d, 10.0d, 10.0d };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) '#');
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.add(doubleArray8, (int) (short) 1, (double) 1.0f);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray11, (double) (short) -1);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray11);
        java.lang.Double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray14);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) doubleArray15);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray15);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.add(doubleArray17, (double) (-1L));
        double[] doubleArray21 = new double[] { (byte) 10 };
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray21);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray22);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray22, (double) 0L, (int) (byte) 10, (-1.0d));
        double[] doubleArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray22, (double) (byte) 0);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray19, doubleArray29);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 10.0, 1.0, 0.0, 1.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0, 1.0, 0.0, 1.0, 1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 10.0, 1.0, 0.0, 1.0, 1.0, -1.0, -1.0, 10.0]");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        java.lang.Long[] longArray0 = new java.lang.Long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 0);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) 10, 0);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray6, byteArray11);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray0, (java.lang.Object) byteArray15);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (byte) 0);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (byte) 1);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray15, byteArray21);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (byte) 100);
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
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, 0, 0, 1]");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray1);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.add(charArray3, 'a');
        char[] charArray12 = new char[] { '#', 'a', '4', '#', ' ', ' ' };
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray12, '4', (int) (byte) 100);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray12, '#', 0);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.addAll(charArray3, charArray12);
        java.lang.Character[] charArray20 = org.apache.commons.lang3.ArrayUtils.toObject(charArray19);
        float[] floatArray21 = new float[] {};
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.add(floatArray21, (float) 10L);
        float[] floatArray25 = new float[] { (byte) -1 };
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray23, floatArray25);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray23, 0.0f, (int) ' ');
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.clone(floatArray23);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) charArray19, (java.lang.Object) floatArray30);
        char[] charArray34 = org.apache.commons.lang3.ArrayUtils.add(charArray19, 0, ' ');
        java.lang.Character[] charArray35 = org.apache.commons.lang3.ArrayUtils.toObject(charArray19);
        char[] charArray38 = org.apache.commons.lang3.ArrayUtils.subarray(charArray19, (int) 'a', 4);
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
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), " ##a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), " ##a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[ , #, #, a, 4, #,  ,  ]");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[]");
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        boolean[] booleanArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray0, false, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) (-1));
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) '#');
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.subarray(longArray8, (int) '4', (int) (byte) 10);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray8, (long) 6);
        long[] longArray16 = new long[] {};
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.contains(longArray16, (long) (short) 1);
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.clone(longArray16);
        long[] longArray20 = org.apache.commons.lang3.ArrayUtils.addAll(longArray8, longArray19);
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.add(longArray19, (long) 2);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray19, (long) 5);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray19, (long) (byte) 10, 2);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[2]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        int[] intArray3 = new int[] { 100, (short) 10, '4' };
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray9);
        int[] intArray16 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray10, intArray16);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.addAll(intArray3, intArray16);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.remove(intArray3, (int) (short) 1);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray20, (int) (byte) -1);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.clone(intArray20);
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.remove(intArray20, (int) (short) 1);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray25, 6);
        int[] intArray29 = org.apache.commons.lang3.ArrayUtils.add(intArray25, 2);
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray29, 100, 100);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 52]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 52]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 2]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.add(intArray1, 0);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, (int) (byte) 1, (int) ' ');
        int[] intArray10 = new int[] { (byte) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray10, 0);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray10, 10, 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray10, 0, 1);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.addAll(intArray1, intArray10);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, (int) 'a', 10);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 0, 4);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray1);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray1);
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 10.0d };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4);
        double[] doubleArray7 = new double[] { (byte) 10 };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray7);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray8);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray5, doubleArray8);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) 1L);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray2, doubleArray8);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) 10);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        short[] shortArray3 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        short[] shortArray9 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) (byte) 0, 2);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray9);
        short[] shortArray17 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray17);
        short[] shortArray23 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray23, (short) (byte) 0, 2);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray17, shortArray23);
        short[] shortArray28 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray23);
        short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.remove(shortArray3, (int) (short) 1);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray30);
        short[] shortArray33 = org.apache.commons.lang3.ArrayUtils.add(shortArray30, (short) -1);
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray33, (short) (byte) 1, 3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[100, 10, 100, 1, 10, 100, 0]");
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[100, 100]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 10L);
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray3);
        float[] floatArray5 = null;
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray3, floatArray5);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(floatArray6, (float) 0L);
        java.lang.Float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray6);
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(floatArray10);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        short[] shortArray5 = new short[] { (short) 0, (byte) 0, (byte) -1, (short) 100, (short) 10 };
        short[] shortArray10 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray10, (short) (byte) 0, 2);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray5, shortArray10);
        short[] shortArray18 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray18);
        short[] shortArray24 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray24, (short) (byte) 0, 2);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray18, shortArray24);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray24);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray24, (short) -1, (int) (byte) 1);
        short[] shortArray33 = null;
        short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray24, shortArray33);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray5, shortArray24);
        java.lang.Short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray24);
        java.lang.Boolean[] booleanArray42 = new java.lang.Boolean[] { true, true, false, false, true };
        boolean[] booleanArray43 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray42);
        java.lang.Boolean[] booleanArray44 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray43);
        boolean[] booleanArray46 = org.apache.commons.lang3.ArrayUtils.add(booleanArray43, true);
        java.lang.Boolean[] booleanArray47 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray46);
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) shortArray36, (java.lang.Object) booleanArray47, (int) (short) 100);
        short[] shortArray51 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray36, (short) 100);
        short[] shortArray52 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray36);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0, 0, -1, 100, 10]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertNotNull(booleanArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray43), "[true, true, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray44);
        org.junit.Assert.assertNotNull(booleanArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray46), "[true, true, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray51), "[0, 100, 10, 1]");
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray52), "[0, 100, 10, 1]");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, 100L, (-1L), (-1L), 100L, 100L };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray8);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) floatArray0, (java.lang.Object) longArray8);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[0, 100, -1, -1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[]");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        long[] longArray4 = new long[] { 0L, (byte) 1, '4', (-1) };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.clone(longArray4);
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray4, (long) (byte) 100);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray4, (long) (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(longArray4);
        java.lang.Long[] longArray17 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray17, (long) (-1));
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.add(longArray19, 0, (long) 1);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray19, (long) (-1), (int) (byte) 1);
        long[] longArray26 = new long[] {};
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.contains(longArray26, (long) (short) 1);
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.addAll(longArray19, longArray26);
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.clone(longArray26);
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.addAll(longArray4, longArray30);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.contains(longArray4, 100L);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 52, 1, 0]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, 1, 52, -1]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0, 1, 52, -1, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[1, -1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[-1, 52, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        float[] floatArray3 = new float[] { 10.0f, 2, 6 };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, 0, (float) (byte) 1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray3, 0.0f, (int) (byte) -1);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray3, (float) 100);
        java.lang.Float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray3);
        float[] floatArray13 = new float[] {};
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.add(floatArray13, (float) 10L);
        float[] floatArray17 = new float[] { (byte) -1 };
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray15, floatArray17);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray18, (float) (-1L));
        float[] floatArray21 = new float[] {};
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.add(floatArray21, (float) 10L);
        float[] floatArray25 = new float[] { (byte) -1 };
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray23, floatArray25);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray18, floatArray23);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray23);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray3, floatArray23);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, 2.0, 6.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 10.0, 2.0, 6.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[10.0, 2.0, 6.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) (-1));
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.add(longArray8, 0, (long) 1);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray8, (long) (-1), (int) (byte) 1);
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray8, (long) (-1));
        java.lang.Long[] longArray17 = org.apache.commons.lang3.ArrayUtils.toObject(longArray8);
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray17, (long) (byte) -1);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) (short) -1);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[1, -1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
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
        char[] charArray33 = org.apache.commons.lang3.ArrayUtils.add(charArray27, 'a');
        java.lang.Character[] charArray34 = org.apache.commons.lang3.ArrayUtils.toObject(charArray27);
        java.lang.Character[] charArray35 = org.apache.commons.lang3.ArrayUtils.toObject(charArray27);
        char[] charArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray35, ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray37);
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[#, a]");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[#]");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        short[] shortArray3 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        short[] shortArray9 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) (byte) 0, 2);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray9);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray3, (short) 10, 4);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
        char[] charArray33 = org.apache.commons.lang3.ArrayUtils.add(charArray27, 'a');
        java.lang.Character[] charArray34 = org.apache.commons.lang3.ArrayUtils.toObject(charArray27);
        java.lang.Character[] charArray35 = org.apache.commons.lang3.ArrayUtils.toObject(charArray27);
        char[] charArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray35);
        char[] charArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray35);
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[#, a]");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[#]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[#]");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.add(intArray1, 0);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(intArray1, (int) (short) 0);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray13);
        int[] intArray20 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray14, intArray20);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.add(intArray14, (int) '4');
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.add(intArray14, 10);
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.addAll(intArray1, intArray25);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 2, 10, 0, -1, 52]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 2, 10, 0, -1, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 2, 10, 0, -1, 10]");
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
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray5, floatArray10);
        java.lang.Float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray10);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.add(floatArray10, (float) 11);
        float[] floatArray18 = new float[] {};
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.add(floatArray18, (float) 10L);
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray18, floatArray21);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray22, (int) (byte) 0, (int) 'a');
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.clone(floatArray22);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray22, (float) (-1L), (int) '#');
        float[] floatArray30 = new float[] {};
        float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.add(floatArray30, (float) 10L);
        float[] floatArray34 = new float[] { (byte) -1 };
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray32, floatArray34);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray35, (float) (-1L));
        float[] floatArray38 = new float[] {};
        float[] floatArray40 = org.apache.commons.lang3.ArrayUtils.add(floatArray38, (float) 10L);
        float[] floatArray42 = new float[] { (byte) -1 };
        float[] floatArray43 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray40, floatArray42);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray35, floatArray40);
        java.lang.Float[] floatArray45 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray40);
        int int48 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray40, (float) 3, (int) '4');
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray40);
        float[] floatArray50 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray22, floatArray40);
        float[] floatArray52 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray22, (float) 100);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray10, floatArray52);
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
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[10.0, 11.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[]");
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray42), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray50), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray52), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        java.lang.Double[] doubleArray1 = new java.lang.Double[] { 10.0d };
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray1);
        double[] doubleArray4 = new double[] { (byte) 10 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray4);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray5);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray2, doubleArray5);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) (short) 10, (double) 1.0f);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        int[] intArray3 = new int[] { 100, (short) 10, '4' };
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray9);
        int[] intArray16 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray10, intArray16);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.addAll(intArray3, intArray16);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray3, (int) '4', 3);
        int[] intArray23 = new int[] { (byte) 0 };
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray23, 0);
        int[] intArray27 = org.apache.commons.lang3.ArrayUtils.add(intArray23, 0);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.contains(intArray23, (int) (short) 0);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray35);
        int[] intArray42 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray36, intArray42);
        int[] intArray45 = org.apache.commons.lang3.ArrayUtils.add(intArray36, (int) '4');
        int[] intArray47 = org.apache.commons.lang3.ArrayUtils.add(intArray36, 10);
        int[] intArray48 = org.apache.commons.lang3.ArrayUtils.addAll(intArray23, intArray47);
        int[] intArray49 = org.apache.commons.lang3.ArrayUtils.addAll(intArray3, intArray47);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.contains(intArray47, (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[0, 2, 10, 0, -1, 52]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[0, 2, 10, 0, -1, 10]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 0, 2, 10, 0, -1, 10]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, 10, 52, 0, 2, 10, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        double[] doubleArray2 = new double[] { (byte) 100, (-1.0d) };
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray2);
        double[] doubleArray5 = new double[] { (byte) 10 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray2, doubleArray5);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray5, (double) 2);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) 100L, (double) 4);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.add(doubleArray5, (double) (byte) 100);
        double[] doubleArray18 = new double[] { (-1), (byte) 100, 10L };
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray18, (double) 0.0f, 0, 100.0d);
        java.lang.Double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray18);
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.add(doubleArray18, (double) (byte) 100);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray25, (double) 0L, (double) 1.0f);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray5, doubleArray25);
        java.lang.Double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 100.0, 10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(doubleArray30);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        int[] intArray2 = new int[] { (byte) 1, 0 };
        int[] intArray5 = new int[] { (byte) 1, 0 };
        int[] intArray8 = new int[] { (byte) 1, 0 };
        int[] intArray11 = new int[] { (byte) 1, 0 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        int[] intArray16 = new int[] { 'a', '#', '4' };
        int[] intArray20 = new int[] { 'a', '#', '4' };
        int[][] intArray21 = new int[][] { intArray16, intArray20 };
        int[][] intArray22 = org.apache.commons.lang3.ArrayUtils.addAll(intArray12, intArray21);
        int[][] intArray24 = org.apache.commons.lang3.ArrayUtils.remove(intArray12, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 35, 52]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 35, 52]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        java.lang.String[] strArray1 = new java.lang.String[] { "{100,100,1,10}" };
        java.lang.String[] strArray3 = new java.lang.String[] { "{100,100,1,10}" };
        java.lang.String[] strArray5 = new java.lang.String[] { "{100,100,1,10}" };
        java.lang.String[] strArray7 = new java.lang.String[] { "{100,100,1,10}" };
        java.lang.String[][] strArray8 = new java.lang.String[][] { strArray1, strArray3, strArray5, strArray7 };
        java.lang.String[][][] strArray9 = new java.lang.String[][][] { strArray8 };
        java.lang.String[][][] strArray10 = org.apache.commons.lang3.ArrayUtils.toArray(strArray9);
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.lang.String[] strArray14 = new java.lang.String[] {};
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.lang.String[][] strArray18 = new java.lang.String[][] { strArray12, strArray13, strArray14, strArray15, strArray16, strArray17 };
        java.lang.String[] strArray19 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray19);
        java.lang.String[][] strArray21 = org.apache.commons.lang3.ArrayUtils.add(strArray18, strArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[][][] strArray22 = org.apache.commons.lang3.ArrayUtils.add(strArray9, (int) 'a', strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        short[] shortArray3 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        short[] shortArray9 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) (byte) 0, 2);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray9);
        short[] shortArray17 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray17);
        short[] shortArray23 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray23, (short) (byte) 0, 2);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray17, shortArray23);
        short[] shortArray28 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray23);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray23, (short) 1, (-1));
        short[] shortArray35 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray35);
        short[] shortArray41 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray41, (short) (byte) 0, 2);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray35, shortArray41);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray41);
        int int49 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray41, (short) -1, (int) (byte) 1);
        short[] shortArray50 = null;
        short[] shortArray51 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray41, shortArray50);
        int int54 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray51, (short) 0, 0);
        short[] shortArray59 = new short[] { (short) 10, (short) 1, (byte) 1, (short) 1 };
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray59);
        short[] shortArray62 = org.apache.commons.lang3.ArrayUtils.remove(shortArray59, 0);
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray51, shortArray62);
        java.lang.Short[] shortArray64 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray62);
        java.lang.Short[] shortArray65 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray62);
        short[] shortArray66 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray23, shortArray62);
        short[] shortArray69 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray23, (int) 'a', 6);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray72 = org.apache.commons.lang3.ArrayUtils.add(shortArray23, (int) (byte) -1, (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
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
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[100, 10, 100, 1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray51), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray59), "[1, 1, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray62), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertNotNull(shortArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray66), "[1, 10, 100, 0, 1, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray69), "[]");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray4, (byte) 0);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray9, (byte) 10, 0);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray4, byteArray9);
        java.lang.Byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray13);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray14, (byte) 1);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray14);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray17, (byte) 0, 4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 0, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 0, 0, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray1);
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray2);
        java.lang.Double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        short[] shortArray10 = new short[] { (short) 0, (byte) 0, (byte) -1, (short) 100, (short) 10 };
        short[] shortArray15 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray15, (short) (byte) 0, 2);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray10, shortArray15);
        short[] shortArray23 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray23);
        short[] shortArray29 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray29, (short) (byte) 0, 2);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray23, shortArray29);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray29);
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray29, (short) -1, (int) (byte) 1);
        short[] shortArray38 = null;
        short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray29, shortArray38);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray10, shortArray29);
        java.lang.Short[] shortArray41 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray29);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) doubleArray4, (java.lang.Object) shortArray41);
        double[] doubleArray44 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4, (double) 'a');
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[0, 0, -1, 100, 10]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0]");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        short[] shortArray3 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        short[] shortArray9 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) (byte) 0, 2);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray9);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray9);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray9, (short) -1, (int) (byte) 1);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray9, 6, 3);
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.add(shortArray20, (short) 0);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray22, (short) 1);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray22, (short) 0);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        java.lang.Long[] longArray0 = new java.lang.Long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray1, 100L, (int) (short) 0);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 100 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) 10, 0);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) 1);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (int) (short) 0, (byte) 1);
        int[] intArray12 = new int[] { (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray12, 0);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.add(intArray12, 0);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray12, (int) (byte) 1, (int) ' ');
        int[] intArray21 = new int[] { (byte) 0 };
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray21, 0);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray21, 10, 0);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray21, 0, 1);
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.addAll(intArray12, intArray21);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) byteArray10, (java.lang.Object) intArray21);
        byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.add(byteArray10, (byte) -1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1, 100, 100, 1, -1]");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        java.lang.Long[] longArray0 = new java.lang.Long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 0);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) 10, 0);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray6, byteArray11);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray0, (java.lang.Object) byteArray15);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (byte) 0);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (byte) 1);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray15, byteArray21);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray15);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray15);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray15, (byte) -1);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray15, (byte) 10);
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
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 0, 0, 1, 100, 100]");
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
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray14, 1, (int) (short) 0);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray14, (double) (-1.0f), (double) (-1.0f));
        double[] doubleArray26 = new double[] { '4', (-1.0f), (-1.0d), 1, 100.0d };
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray26, (double) (short) -1);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray26, (double) (-1.0f), (int) (byte) 1);
        double[] doubleArray32 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray26);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray14, doubleArray26);
        double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray26);
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray26, (double) (-1L), 3, (double) '4');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 10L };
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L };
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L };
        java.lang.Long[] longArray7 = new java.lang.Long[] { 10L };
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L };
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L };
        java.lang.Long[][] longArray12 = new java.lang.Long[][] { longArray1, longArray3, longArray5, longArray7, longArray9, longArray11 };
        java.lang.Long[][] longArray13 = org.apache.commons.lang3.ArrayUtils.toArray(longArray12);
        boolean[] booleanArray18 = new boolean[] { true, true, false, true };
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray18, true, (int) '4');
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray18);
        java.lang.Boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray18);
        boolean[] booleanArray24 = null;
        boolean[] booleanArray25 = new boolean[] {};
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray25, true);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray24, booleanArray25);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray25);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray18, booleanArray25);
        java.lang.Boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray25);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray31);
        boolean[] booleanArray37 = new boolean[] { true, true, false, false };
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray37, false);
        boolean[] booleanArray44 = new boolean[] { true, true, false, true };
        int int47 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray44, true, (int) '4');
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray37, booleanArray44);
        boolean[] booleanArray53 = new boolean[] { true, true, false, false };
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray53, false);
        boolean[] booleanArray60 = new boolean[] { true, true, false, true };
        int int63 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray60, true, (int) '4');
        boolean boolean64 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray53, booleanArray60);
        boolean[] booleanArray65 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray44, booleanArray53);
        int int68 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray44, true, (int) (byte) 10);
        boolean[] booleanArray73 = new boolean[] { true, true, false, true };
        int int76 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray73, true, (int) '4');
        boolean boolean77 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray73);
        boolean[] booleanArray79 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray73, false);
        boolean[] booleanArray80 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray73);
        boolean[] booleanArray81 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray44, booleanArray73);
        boolean[] booleanArray82 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray32, booleanArray81);
        int int83 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) longArray12, (java.lang.Object) booleanArray81);
        boolean boolean85 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray81, false);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[]");
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(booleanArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray44), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(booleanArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray53), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(booleanArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray60), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 3 + "'", int63 == 3);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(booleanArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray65), "[true, true, false, true, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
        org.junit.Assert.assertNotNull(booleanArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray73), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 3 + "'", int76 == 3);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(booleanArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray79), "[true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray80), "[true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray81), "[true, true, false, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray82), "[true, true, false, true, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray4, (byte) 0);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray6);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, 0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray1);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.subarray(charArray1, 3, 2);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, ' ');
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a');
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        java.lang.Short[] shortArray6 = new java.lang.Short[] { (short) 10, (short) 100, (short) -1, (short) 1, (short) 0, (short) 0 };
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.add(shortArray7, (short) 100);
        short[] shortArray13 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray13);
        short[] shortArray19 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray19, (short) (byte) 0, 2);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray13, shortArray19);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray19);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(shortArray19, (short) 1);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) (short) 100, (java.lang.Object) shortArray19);
        short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.add(shortArray19, 4, (short) (byte) 10);
        short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.clone(shortArray30);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[10, 100, -1, 1, 0, 0, 100]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[0, 100, 10, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[0, 100, 10, 1, 10]");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        char[] charArray1 = new char[] { ' ' };
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.add(charArray1, '#');
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.subarray(charArray1, (int) (short) -1, (int) (short) 0);
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.clone(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        java.lang.Long[] longArray0 = new java.lang.Long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 0);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) 10, 0);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray6, byteArray11);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray0, (java.lang.Object) byteArray15);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (byte) 0);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (byte) 1);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray15, byteArray21);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray15);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray15, (byte) 10);
        byte[] byteArray31 = org.apache.commons.lang3.ArrayUtils.remove(byteArray15, 1);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray31);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, 100, 1, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[100, 1, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        int[] intArray3 = new int[] { 100, (short) 10, '4' };
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray9);
        int[] intArray16 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray10, intArray16);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.addAll(intArray3, intArray16);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.remove(intArray3, (int) (short) 1);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray20, (int) (byte) -1);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray20, 0, 4);
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.add(intArray20, 1, (int) ' ');
        java.lang.Integer[] intArray29 = org.apache.commons.lang3.ArrayUtils.toObject(intArray28);
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.clone(intArray28);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 52]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, 52]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, 52]");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        boolean[] booleanArray4 = new boolean[] { true, true, false, true };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray4, true, (int) '4');
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray4);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray4, false);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray4);
        java.lang.Boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray11);
        boolean[] booleanArray17 = new boolean[] { true, true, false, false };
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray17, false);
        boolean[] booleanArray24 = new boolean[] { true, true, false, true };
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray24, true, (int) '4');
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray17, booleanArray24);
        boolean[] booleanArray33 = new boolean[] { true, true, false, false };
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray33, false);
        boolean[] booleanArray40 = new boolean[] { true, true, false, true };
        int int43 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray40, true, (int) '4');
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray33, booleanArray40);
        boolean[] booleanArray45 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray24, booleanArray33);
        int int48 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray24, true, (int) (byte) 10);
        boolean[] booleanArray53 = new boolean[] { true, true, false, true };
        int int56 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray53, true, (int) '4');
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray53);
        boolean[] booleanArray59 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray53, false);
        boolean[] booleanArray60 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray53);
        boolean[] booleanArray61 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray24, booleanArray53);
        boolean[] booleanArray62 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray11, booleanArray61);
        boolean boolean64 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray11, false);
        boolean boolean66 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray11, false);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray40), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(booleanArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray45), "[true, true, false, true, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(booleanArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray53), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(booleanArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray59), "[true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray60), "[true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray61), "[true, true, false, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray62), "[true, true, false, true, true, true, false, true, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        double[] doubleArray5 = new double[] { '4', (-1.0f), (-1.0d), 1, 100.0d };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) (short) -1);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) (-1.0f), (int) (byte) 1);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray5, (double) 5);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray12, (double) (byte) 100);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray12, (double) 1.0f, 6);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray12, 10.0d, (int) (short) 1);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray12, (double) 1.0f, (int) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray4, (byte) 0);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray9, (byte) 10, 0);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray4, byteArray9);
        byte[] byteArray14 = null;
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray13, byteArray14);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.remove(byteArray13, 2);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.clone(byteArray17);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.add(byteArray18, (byte) 0);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.add(byteArray18, (int) (byte) 0, (byte) -1);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray18, (byte) 10, 4);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 0, 1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, -1, 0, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.add(byteArray0, (int) '4', (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, 100L, (-1L), (-1L), 100L, 100L };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray8);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) floatArray0, (java.lang.Object) longArray8);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray8);
        int[] intArray13 = new int[] { (byte) 0 };
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray13, 0);
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.add(intArray13, 0);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray13, (int) (byte) 1, (int) ' ');
        int[] intArray22 = new int[] { (byte) 0 };
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray22, 0);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray22, 10, 0);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray22, 0, 1);
        int[] intArray31 = org.apache.commons.lang3.ArrayUtils.addAll(intArray13, intArray22);
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.clone(intArray22);
        java.lang.Integer[] intArray33 = org.apache.commons.lang3.ArrayUtils.toObject(intArray22);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) intArray33);
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray8, (java.lang.Object) intArray33);
        int[] intArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray33);
        char[] charArray38 = new char[] { '#' };
        java.lang.Character[] charArray39 = org.apache.commons.lang3.ArrayUtils.toObject(charArray38);
        char[] charArray40 = org.apache.commons.lang3.ArrayUtils.clone(charArray38);
        char[] charArray42 = org.apache.commons.lang3.ArrayUtils.add(charArray40, 'a');
        char[] charArray49 = new char[] { '#', 'a', '4', '#', ' ', ' ' };
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray49, '4', (int) (byte) 100);
        int int55 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray49, '#', 0);
        char[] charArray56 = org.apache.commons.lang3.ArrayUtils.addAll(charArray40, charArray49);
        char[] charArray58 = new char[] { '#' };
        java.lang.Character[] charArray59 = org.apache.commons.lang3.ArrayUtils.toObject(charArray58);
        char[] charArray60 = org.apache.commons.lang3.ArrayUtils.clone(charArray58);
        char[] charArray62 = org.apache.commons.lang3.ArrayUtils.add(charArray60, 'a');
        char[] charArray69 = new char[] { '#', 'a', '4', '#', ' ', ' ' };
        int int72 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray69, '4', (int) (byte) 100);
        boolean boolean73 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray62, charArray69);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray62);
        int int77 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray62, '4', 10);
        char[] charArray78 = org.apache.commons.lang3.ArrayUtils.addAll(charArray40, charArray62);
        int int80 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) intArray33, (java.lang.Object) charArray40, 5);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[0, 100, -1, -1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[0, 100, -1, -1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[0]");
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
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[#]");
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[#]");
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), "a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), "a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[a, #]");
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray69), "#a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray69), "#a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray69), "[#, a, 4, #,  ,  ]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray78), "#a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray78), "#a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray78), "[#, a, #]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        int[] intArray4 = new int[] { 100, (short) 10, '4' };
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray10);
        int[] intArray17 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray11, intArray17);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.addAll(intArray4, intArray17);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray17, 1);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) longArray0, (java.lang.Object) intArray17);
        java.lang.Long[] longArray29 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray29, (long) (-1));
        long[] longArray34 = org.apache.commons.lang3.ArrayUtils.add(longArray31, 0, (long) 1);
        java.lang.Class<?> wildcardClass35 = longArray31.getClass();
        java.lang.Long[] longArray42 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray44 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray42, (long) (-1));
        long[] longArray47 = org.apache.commons.lang3.ArrayUtils.add(longArray44, 0, (long) 1);
        java.lang.Class<?> wildcardClass48 = longArray44.getClass();
        java.lang.Long[] longArray55 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray57 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray55, (long) (-1));
        long[] longArray60 = org.apache.commons.lang3.ArrayUtils.add(longArray57, 0, (long) 1);
        java.lang.Class<?> wildcardClass61 = longArray57.getClass();
        java.lang.Long[] longArray68 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray70 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray68, (long) (-1));
        long[] longArray73 = org.apache.commons.lang3.ArrayUtils.add(longArray70, 0, (long) 1);
        java.lang.Class<?> wildcardClass74 = longArray70.getClass();
        java.lang.reflect.Type[] typeArray75 = new java.lang.reflect.Type[] { wildcardClass35, wildcardClass48, wildcardClass61, wildcardClass74 };
        java.lang.reflect.Type[] typeArray76 = org.apache.commons.lang3.ArrayUtils.toArray(typeArray75);
        int int78 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) longArray0, (java.lang.Object) typeArray75, 6);
        long[] longArray79 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 10, 52, 0, -1, -1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[1, -1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[1, -1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[1, -1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray73), "[1, -1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(typeArray75);
        org.junit.Assert.assertNotNull(typeArray76);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[]");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
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
        float[] floatArray17 = new float[] {};
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.add(floatArray17, (float) 10L);
        float[] floatArray21 = new float[] { (byte) -1 };
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray19, floatArray21);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray22, (float) (-1L));
        float[] floatArray25 = new float[] {};
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.add(floatArray25, (float) 10L);
        float[] floatArray29 = new float[] { (byte) -1 };
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray27, floatArray29);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray22, floatArray27);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray5, floatArray27);
        java.lang.String str33 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) floatArray5);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray5);
        float[] floatArray36 = new float[] { '#' };
        float[] floatArray38 = org.apache.commons.lang3.ArrayUtils.add(floatArray36, (float) (-1));
        float[] floatArray39 = org.apache.commons.lang3.ArrayUtils.clone(floatArray36);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray36);
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray36, (float) 6, (int) (byte) 100);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.contains(floatArray36, (float) (short) 1);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray5, floatArray36);
        int int48 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray5, 0.0f);
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
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "{10.0,-1.0}" + "'", str33, "{10.0,-1.0}");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[35.0]");
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[35.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[35.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        boolean[] booleanArray4 = new boolean[] { true, true, false, true };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray4, true, (int) '4');
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray4);
        java.lang.Boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray4);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray9);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray9);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray9);
        int[] intArray16 = new int[] { 100, (short) 10, '4' };
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray22);
        int[] intArray29 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray23, intArray29);
        int[] intArray31 = org.apache.commons.lang3.ArrayUtils.addAll(intArray16, intArray29);
        int[] intArray33 = org.apache.commons.lang3.ArrayUtils.remove(intArray16, (int) (short) 1);
        int[] intArray34 = org.apache.commons.lang3.ArrayUtils.clone(intArray16);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) booleanArray9, (java.lang.Object) intArray16);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, false, true]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 10, 52, 0, -1, -1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 52]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 10, 52]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        byte[] byteArray0 = null;
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray0);
        org.junit.Assert.assertNull(byteArray1);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 100 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) 10, 0);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) 1);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (int) (short) 0, (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) 10);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray7, (byte) 0);
        java.lang.Byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray7);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 100, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 100, 1, 10]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100, 100, 1]");
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        short[] shortArray4 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray4, (short) (byte) 0, 2);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) 100);
        java.lang.Short[] shortArray12 = new java.lang.Short[] { (short) -1, (short) 0 };
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray12, (short) (byte) 10);
        short[] shortArray15 = null;
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray14, shortArray15);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.clone(shortArray16);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray4, shortArray16);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(shortArray16, (short) (byte) 1);
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.add(shortArray16, (short) 1);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.add(shortArray22, (short) (byte) -1);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[-1, 0]");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 0]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[-1, 0, 1, -1]");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray1);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.add(charArray3, 'a');
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray3);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        java.lang.Object obj8 = null;
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) charArray6, obj8, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        java.lang.Character[] charArray1 = new java.lang.Character[] { '4' };
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray1);
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.toObject(charArray2);
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray8, (byte) 0);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 100 };
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray13, (byte) 10, 0);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray8, byteArray13);
        byte[] byteArray18 = null;
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray17, byteArray18);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.remove(byteArray17, 2);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.clone(byteArray21);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray3, (java.lang.Object) byteArray22, (-1));
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 0, 0, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, 0, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 100 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) 10, 0);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) 1);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (int) (short) 0, (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) 10);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray12);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 100, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 100, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        java.lang.Byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        long[] longArray5 = new long[] { 0L, (byte) 1, '4', (-1) };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.clone(longArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray0, (java.lang.Object) longArray5, (-1));
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.add(longArray11, 3, (long) 100);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[-1, 52, 1, 0]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[0, 1, 52, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[-1, 52, 1, 0, 1]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[-1, 52, 1, 100, 0, 1]");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        java.lang.Long[] longArray0 = new java.lang.Long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 0);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) 10, 0);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray6, byteArray11);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray0, (java.lang.Object) byteArray15);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (byte) 0);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (byte) 1);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray15, byteArray21);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray15, 1, 1);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.add(byteArray15, 4, (byte) 0);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.contains(byteArray15, (byte) 1);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray15);
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
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 0, 0, 1, 0, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
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
        float[] floatArray17 = new float[] {};
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.add(floatArray17, (float) 10L);
        float[] floatArray21 = new float[] { (byte) -1 };
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray19, floatArray21);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray22, (float) (-1L));
        float[] floatArray25 = new float[] {};
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.add(floatArray25, (float) 10L);
        float[] floatArray29 = new float[] { (byte) -1 };
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray27, floatArray29);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray22, floatArray27);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray5, floatArray27);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray5);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.remove(floatArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
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
        boolean[] booleanArray40 = new boolean[] { true, true, false, true };
        int int43 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray40, true, (int) '4');
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray40);
        boolean[] booleanArray46 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray40, false);
        boolean[] booleanArray47 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray40);
        boolean[] booleanArray48 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray11, booleanArray40);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray40);
        boolean[] booleanArray51 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray40, (int) (short) 0);
        boolean[] booleanArray52 = new boolean[] {};
        int int54 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray52, true);
        boolean[] booleanArray55 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray52);
        int int58 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray52, true, (int) (byte) 10);
        boolean[] booleanArray59 = new boolean[] {};
        int int61 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray59, true);
        boolean[] booleanArray62 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray59);
        int int65 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray59, true, (int) (byte) 10);
        boolean boolean66 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray52, booleanArray59);
        boolean boolean67 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray40, booleanArray59);
        boolean[] booleanArray68 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray40);
        boolean[] booleanArray70 = org.apache.commons.lang3.ArrayUtils.add(booleanArray68, true);
        boolean[] booleanArray73 = org.apache.commons.lang3.ArrayUtils.add(booleanArray68, 0, false);
        boolean[] booleanArray78 = new boolean[] { true, true, false, true };
        int int81 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray78, true, (int) '4');
        boolean boolean82 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray78);
        boolean[] booleanArray84 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray78, false);
        java.lang.Boolean[] booleanArray85 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray78);
        boolean boolean86 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray73, booleanArray78);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray40), "[true, false, true, true]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(booleanArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray46), "[true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray47), "[true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray48), "[true, true, false, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray51), "[false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray52), "[]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(booleanArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray55), "[]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(booleanArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray59), "[]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(booleanArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray62), "[]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(booleanArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray68), "[true, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray70), "[true, false, true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray73), "[false, true, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray78), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 3 + "'", int81 == 3);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(booleanArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray84), "[true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 10L);
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray3);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray3);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) 3);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray3, (float) (byte) -1, 1);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[3.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        char[] charArray0 = null;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.add(charArray0, 'a');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[a]");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
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
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray10, (float) 10);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray18, (float) (-1L));
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray18, 0.0f);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        short[] shortArray3 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        short[] shortArray9 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) (byte) 0, 2);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray9);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray3, (short) (byte) 0);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.add(shortArray3, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.add(shortArray18, (int) (byte) 100, (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 4");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[100, 10, 100, 10]");
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray1);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.add(charArray3, 'a');
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray3);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, 'a');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(charArray8, ' ');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray8, 'a');
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
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a]");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray5);
        java.lang.Boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray7, true);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray7, false);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) intArray5, (java.lang.Object) booleanArray11);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray11, (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[]");
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
        int[] intArray47 = new int[] { (byte) 0 };
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray47, 0);
        int[] intArray51 = org.apache.commons.lang3.ArrayUtils.add(intArray47, 0);
        int int53 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray47, (int) (short) 100);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray47);
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) shortArray30, (java.lang.Object) intArray47);
        int[] intArray57 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray47, (int) (byte) 100);
        int[] intArray59 = new int[] { (byte) 0 };
        int int61 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray59, 0);
        int int64 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray59, 100, 3);
        int int67 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray59, 0, 6);
        boolean boolean68 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray59);
        int[] intArray71 = org.apache.commons.lang3.ArrayUtils.subarray(intArray59, (int) (short) -1, 1);
        int[] intArray72 = org.apache.commons.lang3.ArrayUtils.addAll(intArray57, intArray71);
        int int74 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray71, 0);
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
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[0]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[0]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[0]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
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
        boolean[] booleanArray39 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray11);
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
        org.junit.Assert.assertNotNull(booleanArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray39), "[true, true, false, true]");
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        java.lang.String[][][][] strArray0 = new java.lang.String[][][][] {};
        java.lang.String[][][][] strArray1 = new java.lang.String[][][][] {};
        java.lang.String[][][][] strArray2 = new java.lang.String[][][][] {};
        java.lang.String[][][][][] strArray3 = new java.lang.String[][][][][] { strArray0, strArray1, strArray2 };
        java.lang.String[][][][] strArray4 = new java.lang.String[][][][] {};
        java.lang.String[][][][] strArray5 = new java.lang.String[][][][] {};
        java.lang.String[][][][] strArray6 = new java.lang.String[][][][] {};
        java.lang.String[][][][][] strArray7 = new java.lang.String[][][][][] { strArray4, strArray5, strArray6 };
        java.lang.String[][][][] strArray8 = new java.lang.String[][][][] {};
        java.lang.String[][][][] strArray9 = new java.lang.String[][][][] {};
        java.lang.String[][][][] strArray10 = new java.lang.String[][][][] {};
        java.lang.String[][][][][] strArray11 = new java.lang.String[][][][][] { strArray8, strArray9, strArray10 };
        java.lang.String[][][][] strArray12 = new java.lang.String[][][][] {};
        java.lang.String[][][][] strArray13 = new java.lang.String[][][][] {};
        java.lang.String[][][][] strArray14 = new java.lang.String[][][][] {};
        java.lang.String[][][][][] strArray15 = new java.lang.String[][][][][] { strArray12, strArray13, strArray14 };
        java.lang.String[][][][] strArray16 = new java.lang.String[][][][] {};
        java.lang.String[][][][] strArray17 = new java.lang.String[][][][] {};
        java.lang.String[][][][] strArray18 = new java.lang.String[][][][] {};
        java.lang.String[][][][][] strArray19 = new java.lang.String[][][][][] { strArray16, strArray17, strArray18 };
        java.lang.String[][][][] strArray20 = new java.lang.String[][][][] {};
        java.lang.String[][][][] strArray21 = new java.lang.String[][][][] {};
        java.lang.String[][][][] strArray22 = new java.lang.String[][][][] {};
        java.lang.String[][][][][] strArray23 = new java.lang.String[][][][][] { strArray20, strArray21, strArray22 };
        java.lang.String[][][][][][] strArray24 = new java.lang.String[][][][][][] { strArray3, strArray7, strArray11, strArray15, strArray19, strArray23 };
        java.lang.String[][][][] strArray25 = new java.lang.String[][][][] {};
        java.lang.String[][][][][] strArray26 = new java.lang.String[][][][][] { strArray25 };
        java.lang.Object obj27 = null;
        java.lang.String[][][][][] strArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(strArray26, obj27);
        java.lang.String[][][][][][] strArray29 = org.apache.commons.lang3.ArrayUtils.add(strArray24, strArray28);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 100 };
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray10, (long) (-1));
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray2, (java.lang.Object) longArray12, (int) (short) -1);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) 1);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        byte[] byteArray18 = null;
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray17, byteArray18);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray24, (byte) 0);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray24, (byte) 1);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray24, (byte) 1, 1);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray19, byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray34 = org.apache.commons.lang3.ArrayUtils.remove(byteArray24, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 100, -1, 0, 0, 1]");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
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
        boolean[] booleanArray40 = new boolean[] { true, true, false, true };
        int int43 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray40, true, (int) '4');
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray40);
        boolean[] booleanArray46 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray40, false);
        boolean[] booleanArray47 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray40);
        boolean[] booleanArray48 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray11, booleanArray40);
        java.lang.Boolean[] booleanArray49 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        boolean[] booleanArray51 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray49, true);
        boolean[] booleanArray56 = new boolean[] { true, true, false, false };
        boolean boolean58 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray56, false);
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray56, true);
        boolean boolean61 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray51, booleanArray56);
        boolean[] booleanArray62 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray11, booleanArray51);
        boolean boolean64 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray62, true);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray40), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(booleanArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray46), "[true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray47), "[true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray48), "[true, true, false, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray49);
        org.junit.Assert.assertNotNull(booleanArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray51), "[]");
        org.junit.Assert.assertNotNull(booleanArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray56), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(booleanArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray62), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        short[] shortArray3 = new short[] { (byte) 1, (short) 0, (byte) 100 };
        short[] shortArray7 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray7);
        short[] shortArray13 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray13, (short) (byte) 0, 2);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray7, shortArray13);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray13);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray13, 3, (int) '4');
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray21, (short) 100);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray23);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray23, (int) (short) -1, (int) (short) 0);
        java.lang.Short[] shortArray28 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray27);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[1, 0, 100]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[1]");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[1]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[1, 0, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[]");
        org.junit.Assert.assertNotNull(shortArray28);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        short[] shortArray3 = new short[] { (byte) 1, (short) 0, (byte) 100 };
        short[] shortArray7 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray7);
        short[] shortArray13 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray13, (short) (byte) 0, 2);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray7, shortArray13);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray13);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray13, 3, (int) '4');
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray21, (short) 100);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray23);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray23, (int) (short) -1, (int) (short) 0);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray23, (short) 1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[1, 0, 100]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[1]");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[1]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[1, 0, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray5 = new boolean[] { true, true, false, false };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray5, false);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray5, true);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, true);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, 0, true);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray0, booleanArray5);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray5);
        java.lang.Boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray5);
        double[] doubleArray19 = new double[] { (byte) 10 };
        double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray19);
        double[] doubleArray26 = new double[] { '4', (-1.0f), (-1.0d), 1, 100.0d };
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray26, (double) (short) -1);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray19, doubleArray26);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray26, (double) (byte) 10, 0);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray26);
        int int34 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) doubleArray33);
        double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.add(doubleArray33, (double) (-1.0f));
        double[] doubleArray37 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray36);
        double[] doubleArray43 = new double[] { '4', (-1.0f), (-1.0d), 1, 100.0d };
        int int45 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray43, (double) (short) -1);
        int int48 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray43, (double) (-1.0f), (int) (byte) 1);
        double[] doubleArray50 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray43, (double) 5);
        int int53 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray43, (double) (short) 100, (int) 'a');
        double[] doubleArray55 = org.apache.commons.lang3.ArrayUtils.add(doubleArray43, (double) 1L);
        int int58 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray55, (double) (-1.0f), 10.0d);
        double[] doubleArray60 = org.apache.commons.lang3.ArrayUtils.add(doubleArray55, 100.0d);
        double[] doubleArray63 = org.apache.commons.lang3.ArrayUtils.add(doubleArray60, 0, (double) 10L);
        double[] doubleArray64 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray37, doubleArray60);
        int int65 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray17, (java.lang.Object) doubleArray64);
        boolean[] booleanArray66 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray17);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5 + "'", int34 == 5);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[52.0, -1.0, -1.0, 1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[52.0, -1.0, -1.0, 1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[52.0, -1.0, -1.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[52.0, -1.0, -1.0, 1.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 52.0, -1.0, -1.0, 1.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[52.0, -1.0, -1.0, 1.0, 100.0, -1.0, 52.0, -1.0, -1.0, 1.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(booleanArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray66), "[true, true, false, false]");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        boolean[] booleanArray4 = new boolean[] { true, true, false, true };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray4, true, (int) '4');
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray4);
        java.lang.Boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray4);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray9);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray9, true);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray12, false);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray1);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray2);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray2, (double) 0L, (int) (byte) 10, (-1.0d));
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray2, (double) (byte) 0);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray2, 0.0d, (int) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray2);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray2, (double) (-1L));
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray15);
        java.lang.String str17 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{10.0}" + "'", str17, "{10.0}");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray1);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.add(charArray3, 'a');
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray3);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray7);
        char[] charArray10 = new char[] { '#' };
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.toObject(charArray10);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.clone(charArray10);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.add(charArray12, 'a');
        java.lang.Character[] charArray15 = org.apache.commons.lang3.ArrayUtils.toObject(charArray12);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray15);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.clone(charArray16);
        char[] charArray19 = new char[] { '#' };
        java.lang.Character[] charArray20 = org.apache.commons.lang3.ArrayUtils.toObject(charArray19);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray19);
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.addAll(charArray17, charArray19);
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.clone(charArray19);
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.subarray(charArray19, (int) (byte) 100, (int) ' ');
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray7, charArray19);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray19, '4');
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
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[#]");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, #]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) (-1));
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        java.lang.reflect.Type[][] typeArray10 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray11 = org.apache.commons.lang3.ArrayUtils.clone(typeArray10);
        float[] floatArray12 = new float[] {};
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.add(floatArray12, (float) 10L);
        float[] floatArray16 = new float[] { (byte) -1 };
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray14, floatArray16);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) typeArray11, (java.lang.Object) floatArray14);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) longArray6, (java.lang.Object[]) typeArray11);
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) '#');
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) 0);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[-1, 10, -1, 10, 1, 1]");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[-1, 10, -1, 10, 1, 1]");
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        java.lang.Double[] doubleArray1 = new java.lang.Double[] { 10.0d };
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray2, (int) 'a', 5);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0]");
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 10L);
        float[] floatArray4 = new float[] { (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray2, floatArray4);
        java.lang.Float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray5);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, (float) 0L);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, (float) 4);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.remove(floatArray10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0, -1.0]");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, (int) (short) 100);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.subarray(intArray2, (int) (byte) 10, (-1));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, 1.0f);
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        java.lang.Short[][][][][][] shortArray0 = new java.lang.Short[][][][][][] {};
        java.lang.Short[][][][][][] shortArray3 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray0, (int) (byte) 10, 10);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray3);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
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
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray25);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray25);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray25, 10.0d, (double) '4');
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
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 100 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) 10, 0);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) 1);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray12, (byte) 0);
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 100 };
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray17, (byte) 10, 0);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray12, byteArray17);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray21);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray21, (byte) 100);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray7, byteArray21);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.clone(byteArray7);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100, 100, 1, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, 100, 1]");
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        boolean[] booleanArray4 = new boolean[] { true, true, false, true };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray4, true, (int) '4');
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray4);
        java.lang.Boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray4);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray9);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray9, true);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray9, true);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, false, true]");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0, false);
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0);
        java.lang.Boolean[] booleanArray9 = new java.lang.Boolean[] { true, true, false, false, true };
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray9);
        java.lang.Boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray10);
        boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray11, true);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray3, booleanArray13);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[]");
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[true, true, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[true, true, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, false, false, true]");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
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
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.addAll(charArray7, charArray10);
        char[] charArray15 = new char[] { '#' };
        java.lang.Character[] charArray16 = org.apache.commons.lang3.ArrayUtils.toObject(charArray15);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.clone(charArray15);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.add(charArray17, 'a');
        char[] charArray26 = new char[] { '#', 'a', '4', '#', ' ', ' ' };
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray26, '4', (int) (byte) 100);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray19, charArray26);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray19);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray7, charArray19);
        char[] charArray34 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray7, '4');
        char[] charArray37 = org.apache.commons.lang3.ArrayUtils.subarray(charArray34, (int) (byte) -1, 0);
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
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #]");
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[a, #]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "#a4#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "#a4#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[#, a, 4, #,  ,  ]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[#]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[]");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray1);
        double[] doubleArray8 = new double[] { '4', (-1.0f), (-1.0d), 1, 100.0d };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) (short) -1);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray8);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) (byte) 10, 0);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        int int16 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) doubleArray15);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.add(doubleArray15, (double) (-1.0f));
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray15, (double) (short) 1);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray15, (-1.0d));
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[52.0, -1.0, -1.0, 1.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        int[] intArray3 = new int[] { 100, (short) 10, '4' };
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray9);
        int[] intArray16 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray10, intArray16);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.addAll(intArray3, intArray16);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.remove(intArray3, (int) (short) 1);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.subarray(intArray20, (int) '#', (int) (short) 0);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray20, (int) ' ', (int) (byte) 100);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        java.lang.Byte[][] byteArray0 = new java.lang.Byte[][] {};
        java.lang.Byte[] byteArray6 = new java.lang.Byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 1 };
        java.lang.Byte[] byteArray12 = new java.lang.Byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 1 };
        java.lang.Byte[] byteArray18 = new java.lang.Byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 1 };
        java.lang.Byte[] byteArray24 = new java.lang.Byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 1 };
        java.lang.Byte[] byteArray30 = new java.lang.Byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 1 };
        java.lang.Byte[][] byteArray31 = new java.lang.Byte[][] { byteArray6, byteArray12, byteArray18, byteArray24, byteArray30 };
        java.lang.Byte[][] byteArray32 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray0, byteArray31);
        java.util.Map<java.lang.Object, java.lang.Object> objMap33 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) byteArray0);
        int[] intArray37 = new int[] { 100, (short) 10, '4' };
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray44 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray43);
        int[] intArray50 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray44, intArray50);
        int[] intArray52 = org.apache.commons.lang3.ArrayUtils.addAll(intArray37, intArray50);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.contains(intArray37, 100);
        int[] intArray56 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray37, (int) (short) 100);
        int int57 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray0, (java.lang.Object) (short) 100);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertNotNull(objMap33);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 10, 52]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[100, 10, 52, 0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 100 };
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.lang.Object[][] objArray6 = new java.lang.Object[][] { objArray4, objArray5 };
        java.lang.Object obj7 = null;
        java.lang.Object[][] objArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(objArray6, obj7);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) byteArray2, (java.lang.Object[]) objArray8);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) 100);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) 100);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) 100);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray15, (byte) 0);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray15, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 100]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 100]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 100]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100]");
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        char[] charArray1 = new char[] { ' ' };
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.add(charArray1, '#');
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.add(charArray3, 'a');
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(charArray5, '#');
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray5, '#');
        char[] charArray11 = new char[] { ' ' };
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.add(charArray11, '#');
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.subarray(charArray11, (int) (short) -1, (int) (short) 0);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.add(charArray16, '4');
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray5, charArray18);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray5, 'a');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , #]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { (-1.0d), 1.0d, 0.0d, 1.0d, 10.0d, 10.0d };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) '#');
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.add(doubleArray8, (int) (short) 1, (double) 1.0f);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray11, (double) (short) -1);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray11);
        java.lang.Double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray14);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        int int17 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) floatArray16);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray15, (java.lang.Object) floatArray16);
        double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray15, 100.0d);
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray15, (double) (short) 100);
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
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        java.lang.Double[] doubleArray1 = new java.lang.Double[] { 10.0d };
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray1);
        double[] doubleArray4 = new double[] { (byte) 10 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray4);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray5);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray2, doubleArray5);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray2, 1.0d, 2, (double) '4');
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray2, (double) (byte) 100, (int) (byte) 0, (double) 6);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray2);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray2, 0.0d);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0, true);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray2);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray2, true, (int) (short) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray2, false);
        java.lang.Boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray2);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) booleanArray9);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray9, true);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray12, true, 3);
        java.lang.Boolean[] booleanArray21 = new java.lang.Boolean[] { true, true, false, false, true };
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray21);
        java.lang.Boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray22);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray22, false);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray12, booleanArray22);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[true, true, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[true, true, false, false, true]");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray4, (byte) 0);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray4, (byte) 1);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.clone(byteArray4);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray9, (int) (byte) 10, (int) (byte) 1);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray12);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) 10);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10]");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        char[] charArray1 = new char[] { ' ' };
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.add(charArray1, '#');
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.add(charArray3, 'a');
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.remove(charArray5, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a]");
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        boolean[] booleanArray4 = new boolean[] { true, true, false, true };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray4, true, (int) '4');
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray4);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray4, false);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray4);
        java.lang.Boolean[] booleanArray17 = new java.lang.Boolean[] { true, true, false, false, true };
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray17);
        java.lang.Boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray18);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray18, true);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray21, 2, (int) (byte) 10);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray4, booleanArray24);
        boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, true);
        java.lang.Boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray27);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[true, true, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[true, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, true]");
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, true, false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[true, true, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray28);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray1 = org.apache.commons.lang3.ArrayUtils.clone(typeArray0);
        float[] floatArray2 = new float[] {};
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (float) 10L);
        float[] floatArray6 = new float[] { (byte) -1 };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray6);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) typeArray1, (java.lang.Object) floatArray4);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, (-1), (int) (short) 0);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.add(floatArray11, (float) (byte) 100);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray13, (float) 3);
        java.lang.Object[] objArray16 = null;
        float[] floatArray17 = new float[] {};
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.add(floatArray17, (float) 10L);
        float[] floatArray21 = new float[] { (byte) -1 };
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray19, floatArray21);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray22, (float) (-1L));
        float[] floatArray25 = new float[] {};
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.add(floatArray25, (float) 10L);
        float[] floatArray29 = new float[] { (byte) -1 };
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray27, floatArray29);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray22, floatArray27);
        java.lang.Float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray27);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray16, (java.lang.Object) floatArray32);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray32);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray32, (float) 0);
        float[] floatArray37 = org.apache.commons.lang3.ArrayUtils.clone(floatArray36);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray13, floatArray37);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray40 = org.apache.commons.lang3.ArrayUtils.remove(floatArray13, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[100.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, 0);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, 100, 3);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, 0, 6);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray1);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, (int) (short) -1, 1);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, (int) ' ');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
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
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.add(floatArray17, (int) (short) 10, (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray4, (byte) 0);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray4, (byte) 1);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.clone(byteArray4);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray9);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray9, (byte) -1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        double[] doubleArray5 = new double[] { '4', (-1.0f), (-1.0d), 1, 100.0d };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) (short) -1);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) (-1.0f), (int) (byte) 1);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        double[] doubleArray13 = new double[] { (byte) 10 };
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray13);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray14);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray14, (double) 0L, (int) (byte) 10, (-1.0d));
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray14, (double) (byte) 0);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray14, 0.0d, (int) ' ');
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray5, doubleArray14);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) '#');
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 2, (-1), (double) (byte) 100);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray5, (double) (byte) 0);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 10L, 6, 0.0d);
        double[] doubleArray39 = org.apache.commons.lang3.ArrayUtils.add(doubleArray5, 100.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[52.0, -1.0, -1.0, 1.0, 100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[52.0, -1.0, -1.0, 1.0, 100.0, 100.0]");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) (-1));
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.clone(longArray8);
        long[] longArray12 = new long[] { (byte) -1, 10 };
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.clone(longArray12);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray13);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.clone(longArray13);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray8, longArray15);
        java.lang.Long[] longArray17 = org.apache.commons.lang3.ArrayUtils.toObject(longArray8);
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray17, (long) (-1));
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[-1, 10]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, 10, -1, 10, 1, 1]");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        java.lang.Boolean[][][] booleanArray0 = new java.lang.Boolean[][][] {};
        java.lang.Boolean[][][] booleanArray1 = new java.lang.Boolean[][][] {};
        java.lang.Boolean[][][] booleanArray2 = new java.lang.Boolean[][][] {};
        java.lang.Boolean[][][][] booleanArray3 = new java.lang.Boolean[][][][] { booleanArray0, booleanArray1, booleanArray2 };
        java.lang.Boolean[][][] booleanArray4 = new java.lang.Boolean[][][] {};
        java.lang.Boolean[][][] booleanArray5 = new java.lang.Boolean[][][] {};
        java.lang.Boolean[][][] booleanArray6 = new java.lang.Boolean[][][] {};
        java.lang.Boolean[][][][] booleanArray7 = new java.lang.Boolean[][][][] { booleanArray4, booleanArray5, booleanArray6 };
        java.lang.Boolean[][][] booleanArray8 = new java.lang.Boolean[][][] {};
        java.lang.Boolean[][][] booleanArray9 = new java.lang.Boolean[][][] {};
        java.lang.Boolean[][][] booleanArray10 = new java.lang.Boolean[][][] {};
        java.lang.Boolean[][][][] booleanArray11 = new java.lang.Boolean[][][][] { booleanArray8, booleanArray9, booleanArray10 };
        java.lang.Boolean[][][] booleanArray12 = new java.lang.Boolean[][][] {};
        java.lang.Boolean[][][] booleanArray13 = new java.lang.Boolean[][][] {};
        java.lang.Boolean[][][] booleanArray14 = new java.lang.Boolean[][][] {};
        java.lang.Boolean[][][][] booleanArray15 = new java.lang.Boolean[][][][] { booleanArray12, booleanArray13, booleanArray14 };
        java.lang.Boolean[][][] booleanArray16 = new java.lang.Boolean[][][] {};
        java.lang.Boolean[][][] booleanArray17 = new java.lang.Boolean[][][] {};
        java.lang.Boolean[][][] booleanArray18 = new java.lang.Boolean[][][] {};
        java.lang.Boolean[][][][] booleanArray19 = new java.lang.Boolean[][][][] { booleanArray16, booleanArray17, booleanArray18 };
        java.lang.Boolean[][][][][] booleanArray20 = new java.lang.Boolean[][][][][] { booleanArray3, booleanArray7, booleanArray11, booleanArray15, booleanArray19 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean[][][][][] booleanArray22 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray20, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertNotNull(booleanArray20);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.add(intArray1, 0);
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.toObject(intArray5);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6, (int) (byte) 10);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6, (int) (byte) 1);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.clone(intArray11);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.subarray(intArray11, (int) (short) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = org.apache.commons.lang3.ArrayUtils.add(intArray15, 5, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 0");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, 0);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, 100, 3);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, 0, 6);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray1, (int) (short) -1, 1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray1);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) (byte) 1);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, (-1), (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        boolean[] booleanArray4 = new boolean[] { true, true, false, true };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray4, true, (int) '4');
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray4);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray4, false);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray10, false, 0);
        boolean[] booleanArray14 = new boolean[] {};
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray14, true);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray14);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray14, true);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray10, booleanArray14);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[true, true, true]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[true, true, true]");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        java.lang.Long[] longArray6 = new java.lang.Long[] { 0L, 100L, (-1L), (-1L), 100L, 100L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        java.lang.Long[] longArray14 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray14, (long) (-1));
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray16, (long) '#');
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.subarray(longArray16, (int) '4', (int) (byte) 10);
        java.lang.Long[] longArray28 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray28, (long) (-1));
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray30, (long) '#');
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.addAll(longArray21, longArray30);
        long[] longArray36 = new long[] { (byte) -1, 10 };
        long[] longArray37 = org.apache.commons.lang3.ArrayUtils.clone(longArray36);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray21, longArray36);
        long[] longArray39 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray21);
        java.lang.Long[] longArray40 = new java.lang.Long[] {};
        long[] longArray41 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray40);
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray48 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray46, (byte) 0);
        byte[] byteArray51 = new byte[] { (byte) 100, (byte) 100 };
        int int54 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray51, (byte) 10, 0);
        byte[] byteArray55 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray46, byteArray51);
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray40, (java.lang.Object) byteArray55);
        long[] longArray57 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray40);
        long[] longArray59 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray40, (long) (byte) 10);
        long[] longArray60 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray59);
        long[] longArray63 = org.apache.commons.lang3.ArrayUtils.subarray(longArray59, (int) '4', (int) (byte) -1);
        long[] longArray65 = org.apache.commons.lang3.ArrayUtils.add(longArray59, (long) 100);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0, 100, -1, -1, 100, 100]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[-1, 10]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[0, 100, -1, -1, 100, 100]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[-1, 0, 0, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[]");
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[]");
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[0, 100, -1, -1, 100, 100]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[]");
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[100]");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 10L);
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray3);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, (int) (byte) 0, (int) 'a');
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray4, (float) ' ', (int) (short) 10);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, 6, (int) (short) -1);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray13, (float) 11);
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
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[]");
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        short[] shortArray3 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        short[] shortArray9 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) (byte) 0, 2);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray9);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray9);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray9, 3, (int) '4');
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray17);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) shortArray18);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray18, (short) (byte) 100);
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray18, (short) (byte) 0);
        short[] shortArray28 = new short[] { (short) 10, (short) 1, (byte) 1, (short) 1 };
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray28);
        short[] shortArray33 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray33);
        short[] shortArray39 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray39, (short) (byte) 0, 2);
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray33, shortArray39);
        short[] shortArray44 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray28, shortArray33);
        int int47 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray33, (short) (byte) 0, 5);
        java.lang.Short[] shortArray48 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray33);
        short[] shortArray49 = org.apache.commons.lang3.ArrayUtils.clone(shortArray33);
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray33, (short) 0, 0);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray23, shortArray33);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[1]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[1]");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[1]");
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[1, 1, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray44), "[1, 1, 1, 10, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        short[] shortArray0 = null;
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
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray0, shortArray27);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray27);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) (-1));
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) '#');
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.subarray(longArray8, (int) '4', (int) (byte) 10);
        java.lang.Long[] longArray20 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray20, (long) (-1));
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray22, (long) '#');
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.addAll(longArray13, longArray22);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray22, (long) '#');
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        java.lang.Byte[][][] byteArray0 = new java.lang.Byte[][][] {};
        java.lang.Byte[][][] byteArray1 = new java.lang.Byte[][][] {};
        java.lang.Byte[][][][] byteArray2 = new java.lang.Byte[][][][] { byteArray0, byteArray1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte[][][][] byteArray4 = org.apache.commons.lang3.ArrayUtils.remove(byteArray2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 100 };
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray10, (long) (-1));
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray2, (java.lang.Object) longArray12, (int) (short) -1);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) 1);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) -1);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray19, (int) (short) 10, (-1));
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
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
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
        char[] charArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray35);
        char[] charArray38 = org.apache.commons.lang3.ArrayUtils.remove(charArray36, (int) (short) 0);
        char[] charArray40 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray36, '#');
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
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[#]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[]");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[]");
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        java.lang.Long[] longArray0 = new java.lang.Long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 0);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) 10, 0);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray6, byteArray11);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray0, (java.lang.Object) byteArray15);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (byte) 0);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (byte) 1);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray15, byteArray21);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray15);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray15);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray15, (byte) 1);
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
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, 0, 0, 100, 100]");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        long[] longArray3 = new long[] { (byte) 0, (-1L), (short) 0 };
        org.apache.commons.lang3.ArrayUtils.reverse(longArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) (short) 100);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        double[] doubleArray0 = null;
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray1);
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray2);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray2, (double) ' ');
        double[] doubleArray7 = new double[] { (byte) 10 };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray7);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray2, doubleArray7);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray7, (double) (-1.0f), (double) 0L);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray7, (double) (short) -1, (double) 11);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
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
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.add(intArray20, 1, (int) ' ');
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
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 32]");
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        float[] floatArray3 = new float[] { 10.0f, 2, 6 };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, 0, (float) (byte) 1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.clone(floatArray6);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, 2.0, 6.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 10.0, 2.0, 6.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[1.0, 10.0, 2.0, 6.0]");
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        java.util.Map<java.lang.Object, java.lang.Object> objMap1 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) floatArray0);
        java.util.Map[] mapArray3 = new java.util.Map[1];
        @SuppressWarnings("unchecked")
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray4 = (java.util.Map<java.lang.Object, java.lang.Object>[]) mapArray3;
        objMapArray4[0] = objMap1;
        java.lang.Float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        java.util.Map<java.lang.Object, java.lang.Object> objMap8 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) floatArray7);
        java.util.Map[] mapArray10 = new java.util.Map[1];
        @SuppressWarnings("unchecked")
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray11 = (java.util.Map<java.lang.Object, java.lang.Object>[]) mapArray10;
        objMapArray11[0] = objMap8;
        java.lang.Float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        java.util.Map<java.lang.Object, java.lang.Object> objMap15 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) floatArray14);
        java.util.Map[] mapArray17 = new java.util.Map[1];
        @SuppressWarnings("unchecked")
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray18 = (java.util.Map<java.lang.Object, java.lang.Object>[]) mapArray17;
        objMapArray18[0] = objMap15;
        java.lang.Float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        java.util.Map<java.lang.Object, java.lang.Object> objMap22 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) floatArray21);
        java.util.Map[] mapArray24 = new java.util.Map[1];
        @SuppressWarnings("unchecked")
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray25 = (java.util.Map<java.lang.Object, java.lang.Object>[]) mapArray24;
        objMapArray25[0] = objMap22;
        java.util.Map[][] mapArray29 = new java.util.Map[4][];
        @SuppressWarnings("unchecked")
        java.util.Map<java.lang.Object, java.lang.Object>[][] objMapArray30 = (java.util.Map<java.lang.Object, java.lang.Object>[][]) mapArray29;
        objMapArray30[0] = objMapArray4;
        objMapArray30[1] = objMapArray11;
        objMapArray30[2] = objMapArray18;
        objMapArray30[3] = objMapArray25;
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray40 = null;
        java.util.Map<java.lang.Object, java.lang.Object>[][] objMapArray41 = org.apache.commons.lang3.ArrayUtils.add(objMapArray30, 1, objMapArray40);
        java.lang.Float[] floatArray42 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        java.util.Map<java.lang.Object, java.lang.Object> objMap43 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) floatArray42);
        java.util.Map[] mapArray45 = new java.util.Map[1];
        @SuppressWarnings("unchecked")
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray46 = (java.util.Map<java.lang.Object, java.lang.Object>[]) mapArray45;
        objMapArray46[0] = objMap43;
        java.lang.Float[] floatArray49 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        java.util.Map<java.lang.Object, java.lang.Object> objMap50 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) floatArray49);
        java.util.Map[] mapArray52 = new java.util.Map[1];
        @SuppressWarnings("unchecked")
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray53 = (java.util.Map<java.lang.Object, java.lang.Object>[]) mapArray52;
        objMapArray53[0] = objMap50;
        java.lang.Float[] floatArray56 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        java.util.Map<java.lang.Object, java.lang.Object> objMap57 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) floatArray56);
        java.util.Map[] mapArray59 = new java.util.Map[1];
        @SuppressWarnings("unchecked")
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray60 = (java.util.Map<java.lang.Object, java.lang.Object>[]) mapArray59;
        objMapArray60[0] = objMap57;
        java.lang.Float[] floatArray63 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        java.util.Map<java.lang.Object, java.lang.Object> objMap64 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) floatArray63);
        java.util.Map[] mapArray66 = new java.util.Map[1];
        @SuppressWarnings("unchecked")
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray67 = (java.util.Map<java.lang.Object, java.lang.Object>[]) mapArray66;
        objMapArray67[0] = objMap64;
        java.util.Map[][] mapArray71 = new java.util.Map[4][];
        @SuppressWarnings("unchecked")
        java.util.Map<java.lang.Object, java.lang.Object>[][] objMapArray72 = (java.util.Map<java.lang.Object, java.lang.Object>[][]) mapArray71;
        objMapArray72[0] = objMapArray46;
        objMapArray72[1] = objMapArray53;
        objMapArray72[2] = objMapArray60;
        objMapArray72[3] = objMapArray67;
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray82 = null;
        java.util.Map<java.lang.Object, java.lang.Object>[][] objMapArray83 = org.apache.commons.lang3.ArrayUtils.add(objMapArray72, 1, objMapArray82);
        java.util.Map<java.lang.Object, java.lang.Object>[][] objMapArray84 = org.apache.commons.lang3.ArrayUtils.addAll(objMapArray41, objMapArray72);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap85 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) objMapArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '[Ljava.util.Map;@7c69bc4a', has a length less than 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(objMap1);
        org.junit.Assert.assertNotNull(mapArray3);
        org.junit.Assert.assertNotNull(objMapArray4);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(objMap8);
        org.junit.Assert.assertNotNull(mapArray10);
        org.junit.Assert.assertNotNull(objMapArray11);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertNotNull(objMap15);
        org.junit.Assert.assertNotNull(mapArray17);
        org.junit.Assert.assertNotNull(objMapArray18);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertNotNull(objMap22);
        org.junit.Assert.assertNotNull(mapArray24);
        org.junit.Assert.assertNotNull(objMapArray25);
        org.junit.Assert.assertNotNull(mapArray29);
        org.junit.Assert.assertNotNull(objMapArray30);
        org.junit.Assert.assertNotNull(objMapArray41);
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertNotNull(objMap43);
        org.junit.Assert.assertNotNull(mapArray45);
        org.junit.Assert.assertNotNull(objMapArray46);
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertNotNull(objMap50);
        org.junit.Assert.assertNotNull(mapArray52);
        org.junit.Assert.assertNotNull(objMapArray53);
        org.junit.Assert.assertNotNull(floatArray56);
        org.junit.Assert.assertNotNull(objMap57);
        org.junit.Assert.assertNotNull(mapArray59);
        org.junit.Assert.assertNotNull(objMapArray60);
        org.junit.Assert.assertNotNull(floatArray63);
        org.junit.Assert.assertNotNull(objMap64);
        org.junit.Assert.assertNotNull(mapArray66);
        org.junit.Assert.assertNotNull(objMapArray67);
        org.junit.Assert.assertNotNull(mapArray71);
        org.junit.Assert.assertNotNull(objMapArray72);
        org.junit.Assert.assertNotNull(objMapArray83);
        org.junit.Assert.assertNotNull(objMapArray84);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        long[] longArray2 = new long[] { (byte) -1, 10 };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.clone(longArray2);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray3);
        java.lang.Long[] longArray5 = org.apache.commons.lang3.ArrayUtils.toObject(longArray3);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 10]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(longArray5);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 10L);
        float[] floatArray4 = new float[] { (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray2, floatArray4);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) 1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (-1L));
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) 0);
        float[] floatArray13 = new float[] { '#' };
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.add(floatArray13, (float) (-1));
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.clone(floatArray13);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray16, (float) (byte) 100);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray2, floatArray16);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray16, (float) 2);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[35.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[35.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[35.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[35.0]");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        short[] shortArray3 = new short[] { (byte) 1, (short) 0, (byte) 100 };
        short[] shortArray7 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray7);
        short[] shortArray13 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray13, (short) (byte) 0, 2);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray7, shortArray13);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray13);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray13, 3, (int) '4');
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray21, (short) 100);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray23);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.add(shortArray24, 1, (short) 100);
        short[] shortArray31 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray31);
        short[] shortArray37 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray37, (short) (byte) 0, 2);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray31, shortArray37);
        short[] shortArray42 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray27, shortArray37);
        int int45 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray37, (short) 10, 10);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.contains(shortArray37, (short) -1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[1, 0, 100]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[1]");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[1]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[1, 0, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[1, 100, 0, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[1, 100, 0, 100, 1, 1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
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
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray27, '#', (int) (byte) 10);
        char[] charArray35 = org.apache.commons.lang3.ArrayUtils.clone(charArray27);
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray27, 'a', (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[#]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        short[] shortArray3 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        short[] shortArray9 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) (byte) 0, 2);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray9);
        short[] shortArray17 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray17);
        short[] shortArray23 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray23, (short) (byte) 0, 2);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray17, shortArray23);
        short[] shortArray28 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray23);
        short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.remove(shortArray3, (int) (short) 1);
        short[] shortArray33 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray3, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[100, 10, 100, 1, 10, 100, 0]");
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[100, 100]");
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[]");
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        int[] intArray3 = new int[] { 100, (short) 10, '4' };
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray9);
        int[] intArray16 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray10, intArray16);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.addAll(intArray3, intArray16);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray16, 1);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.clone(intArray16);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray16, 1);
        int[] intArray24 = null;
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.addAll(intArray16, intArray24);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray24);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, -1, -1, 10, 100]");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 10L);
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray3);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray3);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) 3);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.remove(floatArray3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[3.0]");
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray1);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray2);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray2, (double) 0L, (int) (byte) 10, (-1.0d));
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray2, (double) (byte) 0);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray2, 0.0d, (int) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray2);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray2, (double) (-1L));
        java.lang.Boolean[] booleanArray21 = new java.lang.Boolean[] { true, true, false, false, true };
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray21);
        java.lang.Boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray22);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray23, false);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) doubleArray15, (java.lang.Object) booleanArray25);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray25, false);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.add(booleanArray25, true);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0]");
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[true, true, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[true, true, false, false, true, true]");
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
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
        float[] floatArray27 = new float[] { 10.0f, 2, 6 };
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.add(floatArray27, 0, (float) (byte) 1);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray27, 0.0f, (int) (byte) -1);
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray27, (float) 100);
        float[] floatArray38 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray27, 2, 2);
        float[] floatArray39 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray23, floatArray27);
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray23, (float) (short) -1, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[10.0, 2.0, 6.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[1.0, 10.0, 2.0, 6.0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[]");
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[10.0, 2.0, 6.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        java.lang.Long[] longArray0 = new java.lang.Long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 0);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) 10, 0);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray6, byteArray11);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray0, (java.lang.Object) byteArray15);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray17);
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.subarray(longArray17, (-1), (int) (byte) -1);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.add(longArray17, (long) ' ');
        java.lang.Long[] longArray24 = org.apache.commons.lang3.ArrayUtils.toObject(longArray23);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.clone(longArray23);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[32]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[32]");
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        short[] shortArray3 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        short[] shortArray9 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) (byte) 0, 2);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray9);
        java.lang.Short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray9);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) shortArray14);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray14, (short) (byte) 10);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray14, (short) -1);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray14);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray14);
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.add(shortArray22, (short) 0);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray22);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray21, shortArray22);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.add(shortArray27, (short) 0);
        java.lang.Short[] shortArray36 = new java.lang.Short[] { (short) 10, (short) 100, (short) -1, (short) 1, (short) 0, (short) 0 };
        short[] shortArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray36);
        short[] shortArray38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray36);
        short[] shortArray40 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray36, (short) 1);
        short[] shortArray42 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray36, (short) 10);
        short[] shortArray43 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray27, shortArray42);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray22, shortArray42);
        java.lang.Short[] shortArray45 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray42);
        short[] shortArray48 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray42, (int) (byte) 100, (-1));
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray42, (short) (byte) 10, 11);
        short[] shortArray53 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray42, (short) 0);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[1, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[0, 100, 10, 1]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[0, 100, 10, 1]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0, 100, 10, 1]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[0, 100, 10, 1]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[]");
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[0]");
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray43), "[10, 100, -1, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray48), "[]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray53), "[10, 100, -1, 1, 0]");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        double[] doubleArray5 = new double[] { '4', (-1.0f), (-1.0d), 1, 100.0d };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) (short) -1);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) (-1.0f), (int) (byte) 1);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray5, (double) 5);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) (short) 100, (int) 'a');
        java.lang.Double[] doubleArray22 = new java.lang.Double[] { (-1.0d), 1.0d, 0.0d, 1.0d, 10.0d, 10.0d };
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray22, (double) '#');
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray22);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray22, (double) (-1));
        java.lang.Double[] doubleArray28 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray27);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray27, (double) 5);
        double[] doubleArray31 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray5, doubleArray27);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[52.0, -1.0, -1.0, 1.0, 100.0, -1.0, 1.0, 0.0, 1.0, 10.0, 10.0]");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
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
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray31, 'a');
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray31, '#', 0);
        java.lang.Character[] charArray37 = org.apache.commons.lang3.ArrayUtils.toObject(charArray31);
        char[] charArray38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray37);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "##a4#  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "##a4#  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[#, #, a, 4, #,  ,  , #]");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.add(intArray1, 0);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(intArray1, (int) (short) 0);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 0, 2, 10, 0, (-1) };
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray13);
        int[] intArray20 = new int[] { (short) 0, (-1), (byte) -1, 10, 100 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray14, intArray20);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.add(intArray14, (int) '4');
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.add(intArray14, 10);
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.addAll(intArray1, intArray25);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.contains(intArray25, (int) (short) -1);
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.add(intArray25, 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 2, 10, 0, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, -1, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 2, 10, 0, -1, 52]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 2, 10, 0, -1, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 2, 10, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 2, 10, 0, -1, 10, 100]");
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        double[] doubleArray5 = new double[] { '4', (-1.0f), (-1.0d), 1, 100.0d };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) (short) -1);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) (-1.0f), (int) (byte) 1);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        double[] doubleArray13 = new double[] { (byte) 10 };
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray13);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray14);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray14, (double) 0L, (int) (byte) 10, (-1.0d));
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray14, (double) (byte) 0);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray14, 0.0d, (int) ' ');
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray5, doubleArray14);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) 0.0f);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) 1, 0);
        double[] doubleArray32 = org.apache.commons.lang3.ArrayUtils.add(doubleArray5, (double) 1L);
        double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray5, 0.0d);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray34, 100.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[52.0, -1.0, -1.0, 1.0, 100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[52.0, -1.0, -1.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 10L, (-1L), 10L, 1L, 1L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) (-1));
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.add(longArray8, 0, (long) 1);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.add(longArray11, 100L);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray11, (long) (byte) 10);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray11, (long) (byte) 100);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[1, -1, 10, -1, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[1, -1, 10, -1, 10, 1, 1, 100]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray1);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.subarray(charArray1, 3, 2);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, ' ');
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray6, '4', (int) (byte) 100);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.subarray(charArray6, (int) (short) -1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray16 = org.apache.commons.lang3.ArrayUtils.remove(charArray6, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[]");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        java.lang.Short[] shortArray0 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray1 = new java.lang.Short[][] { shortArray0 };
        java.lang.Short[] shortArray2 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray3 = new java.lang.Short[][] { shortArray2 };
        java.lang.Short[][][] shortArray4 = new java.lang.Short[][][] { shortArray1, shortArray3 };
        java.lang.Short[] shortArray5 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray6 = new java.lang.Short[][] { shortArray5 };
        java.lang.Short[] shortArray7 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray8 = new java.lang.Short[][] { shortArray7 };
        java.lang.Short[][][] shortArray9 = new java.lang.Short[][][] { shortArray6, shortArray8 };
        java.lang.Short[] shortArray10 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray11 = new java.lang.Short[][] { shortArray10 };
        java.lang.Short[] shortArray12 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray13 = new java.lang.Short[][] { shortArray12 };
        java.lang.Short[][][] shortArray14 = new java.lang.Short[][][] { shortArray11, shortArray13 };
        java.lang.Short[] shortArray15 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray16 = new java.lang.Short[][] { shortArray15 };
        java.lang.Short[] shortArray17 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray18 = new java.lang.Short[][] { shortArray17 };
        java.lang.Short[][][] shortArray19 = new java.lang.Short[][][] { shortArray16, shortArray18 };
        java.lang.Short[] shortArray20 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray21 = new java.lang.Short[][] { shortArray20 };
        java.lang.Short[] shortArray22 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray23 = new java.lang.Short[][] { shortArray22 };
        java.lang.Short[][][] shortArray24 = new java.lang.Short[][][] { shortArray21, shortArray23 };
        java.lang.Short[][][][] shortArray25 = new java.lang.Short[][][][] { shortArray4, shortArray9, shortArray14, shortArray19, shortArray24 };
        java.lang.Short[][][][][] shortArray26 = new java.lang.Short[][][][][] { shortArray25 };
        boolean[] booleanArray31 = new boolean[] { true, true, false, false };
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray31, false);
        boolean[] booleanArray38 = new boolean[] { true, true, false, true };
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray38, true, (int) '4');
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray31, booleanArray38);
        boolean[] booleanArray47 = new boolean[] { true, true, false, false };
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray47, false);
        boolean[] booleanArray54 = new boolean[] { true, true, false, true };
        int int57 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray54, true, (int) '4');
        boolean boolean58 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray47, booleanArray54);
        boolean[] booleanArray59 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray38, booleanArray47);
        int int62 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray38, true, (int) (byte) 10);
        boolean[] booleanArray67 = new boolean[] { true, true, false, true };
        int int70 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray67, true, (int) '4');
        boolean boolean71 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray67);
        boolean[] booleanArray73 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray67, false);
        boolean[] booleanArray74 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray67);
        boolean[] booleanArray75 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray38, booleanArray67);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray67);
        boolean[] booleanArray78 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray67, (int) (short) 0);
        java.lang.Short[][][][][] shortArray79 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray26, (java.lang.Object) booleanArray78);
        java.util.Map<java.lang.Object, java.lang.Object> objMap80 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) shortArray26);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray31), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray38), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(booleanArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray47), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(booleanArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray54), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(booleanArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray59), "[true, true, false, true, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertNotNull(booleanArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray67), "[true, false, true, true]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 3 + "'", int70 == 3);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(booleanArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray73), "[true, true, true]");
        org.junit.Assert.assertNotNull(booleanArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray74), "[true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray75), "[true, true, false, true, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray78), "[false, true, true]");
        org.junit.Assert.assertNotNull(shortArray79);
        org.junit.Assert.assertNotNull(objMap80);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
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
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray16, (-1.0f));
        java.lang.reflect.Type[][] typeArray21 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray22 = org.apache.commons.lang3.ArrayUtils.clone(typeArray21);
        float[] floatArray23 = new float[] {};
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.add(floatArray23, (float) 10L);
        float[] floatArray27 = new float[] { (byte) -1 };
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray25, floatArray27);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) typeArray22, (java.lang.Object) floatArray25);
        java.lang.Object[][] objArray32 = org.apache.commons.lang3.ArrayUtils.subarray((java.lang.Object[][]) typeArray22, 100, 1);
        char[] charArray34 = new char[] { '#' };
        java.lang.Character[] charArray35 = org.apache.commons.lang3.ArrayUtils.toObject(charArray34);
        int[] intArray37 = new int[] { (byte) 0 };
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray37, 0);
        int[] intArray41 = org.apache.commons.lang3.ArrayUtils.add(intArray37, 0);
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray37, (int) (short) 100);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) charArray35, (java.lang.Object) intArray37);
        int[] intArray46 = new int[] { (byte) 0 };
        int int48 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray46, 0);
        int[] intArray50 = org.apache.commons.lang3.ArrayUtils.add(intArray46, 0);
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray46, (int) (short) 100);
        int int53 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray35, (java.lang.Object) (short) 100);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) typeArray22, (java.lang.Object[]) charArray35);
        int int55 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) floatArray16, (java.lang.Object) typeArray22);
        float[] floatArray57 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray16, (float) (short) 10);
        java.lang.Float[] floatArray58 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray57);
        float[] floatArray60 = org.apache.commons.lang3.ArrayUtils.remove(floatArray57, 0);
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
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[#]");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray57), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertNotNull(floatArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray60), "[]");
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        long[] longArray4 = new long[] { 0L, (byte) 1, '4', (-1) };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.clone(longArray4);
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray4, (long) (byte) 100);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.clone(longArray4);
        java.lang.Long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toObject(longArray8);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray9);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.subarray(longArray10, (int) (byte) 100, 0);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray10);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[0, 1, 52, -1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, 1, 52, -1]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0, 1, 52, -1, 100]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[0, 1, 52, -1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[0, 1, 52, -1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        short[] shortArray3 = new short[] { (short) 100, (short) 10, (byte) 100 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        short[] shortArray9 = new short[] { (short) 1, (byte) 10, (byte) 100, (short) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) (byte) 0, 2);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray9);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray9);
        java.lang.Short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray9);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.clone(shortArray9);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray16, (short) (byte) 100);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(shortArray16, (short) (byte) 0);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[0, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray1);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.add(charArray3, 'a');
        char[] charArray12 = new char[] { '#', 'a', '4', '#', ' ', ' ' };
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray12, '4', (int) (byte) 100);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray5, charArray12);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.add(charArray12, ' ');
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "#a4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "#a4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, a, 4, #,  ,  ,  ]");
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        java.lang.Long[] longArray0 = new java.lang.Long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 0);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) 10, 0);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray6, byteArray11);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray0, (java.lang.Object) byteArray15);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (byte) 0);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (byte) 1);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray15, byteArray21);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray15);
        java.lang.Long[] longArray28 = new java.lang.Long[] {};
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray28);
        byte[] byteArray34 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray34, (byte) 0);
        byte[] byteArray39 = new byte[] { (byte) 100, (byte) 100 };
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray39, (byte) 10, 0);
        byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray34, byteArray39);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray28, (java.lang.Object) byteArray43);
        byte[] byteArray49 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray51 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray49, (byte) 0);
        byte[] byteArray53 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray49, (byte) 1);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray43, byteArray49);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray43);
        byte[] byteArray57 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray43, (byte) 10);
        boolean boolean58 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray15, byteArray57);
        byte[] byteArray59 = org.apache.commons.lang3.ArrayUtils.clone(byteArray15);
        byte[] byteArray61 = org.apache.commons.lang3.ArrayUtils.add(byteArray15, (byte) 0);
        byte[] byteArray62 = null;
        byte[] byteArray63 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray15, byteArray62);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, 100, 1, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[100, 100, 1, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[-1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[-1, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[-1, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[100, 100, 1, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[100, 100, 1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[100, 100, 1, 0, 0, -1, 0]");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[100, 100, 1, 0, 0, -1]");
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
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
        int int55 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray31, (double) 100, (int) '4');
        int int57 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray31, (double) 0);
        double[] doubleArray59 = org.apache.commons.lang3.ArrayUtils.add(doubleArray31, (double) ' ');
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
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, 1.0, 1.0, 0.0, 1.0, 10.0, 10.0, 32.0]");
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 10L);
        float[] floatArray4 = new float[] { (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray2, floatArray4);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray5, (float) (-1L));
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray5, (int) (byte) 0, 0);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.add(floatArray5, (float) '4');
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray12);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray12, (float) (short) 10);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
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
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray25, (double) '#', (int) (byte) 1, (double) 2);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
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
        float[] floatArray17 = new float[] {};
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.add(floatArray17, (float) 10L);
        float[] floatArray21 = new float[] { (byte) -1 };
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray19, floatArray21);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray22, (float) (-1L));
        float[] floatArray25 = new float[] {};
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.add(floatArray25, (float) 10L);
        float[] floatArray29 = new float[] { (byte) -1 };
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray27, floatArray29);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray22, floatArray27);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray5, floatArray27);
        java.lang.String str33 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) floatArray5);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.add(floatArray5, (int) (byte) 0, (-1.0f));
        java.lang.Class<?> wildcardClass37 = floatArray36.getClass();
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
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "{10.0,-1.0}" + "'", str33, "{10.0,-1.0}");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[-1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }
}

