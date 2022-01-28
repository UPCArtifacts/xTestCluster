import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double[] doubleArray10 = new double[] { 100L, 1.0f };
        double[] doubleArray14 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray10);
        double[] doubleArray19 = new double[] { 100L, 1.0f };
        double[] doubleArray23 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray19, doubleArray23);
        double[] doubleArray27 = new double[] { 100L, 1.0f };
        double[] doubleArray31 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray19, doubleArray27);
        double[] doubleArray36 = new double[] { 100L, 1.0f };
        double[] doubleArray40 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray36, doubleArray40);
        double[] doubleArray44 = new double[] { 100L, 1.0f };
        double[] doubleArray48 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray44, doubleArray48);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray40, doubleArray44);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray19, doubleArray44);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray44);
        double[] doubleArray55 = new double[] { 100L, 1.0f };
        double[] doubleArray59 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray55, doubleArray59);
        double double61 = org.apache.commons.lang.math.NumberUtils.max(doubleArray55);
        double[] doubleArray64 = new double[] { 100L, 1.0f };
        double[] doubleArray68 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray64, doubleArray68);
        double[] doubleArray72 = new double[] { 100L, 1.0f };
        double[] doubleArray76 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray72, doubleArray76);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray64, doubleArray72);
        double[] doubleArray81 = new double[] { 100L, 1.0f };
        double[] doubleArray85 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray81, doubleArray85);
        double[] doubleArray89 = new double[] { 100L, 1.0f };
        double[] doubleArray93 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray89, doubleArray93);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray85, doubleArray89);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray64, doubleArray89);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray55, doubleArray64);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray55);
        double double99 = org.apache.commons.lang.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 100.0d + "'", double61 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray93), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertTrue("'" + double99 + "' != '" + 100.0d + "'", double99 == 100.0d);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float[] floatArray10 = new float[] { 0, ' ', 100.0f };
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray10);
        float float12 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        float float13 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        float float14 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        float[] floatArray18 = new float[] { 0, 1.0f, 100 };
        float[] floatArray20 = new float[] { (-1L) };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(floatArray18, floatArray20);
        float float22 = org.apache.commons.lang.math.NumberUtils.max(floatArray18);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray18);
        float float24 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        float float25 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        java.lang.Class<?> wildcardClass26 = floatArray10.getClass();
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double[] doubleArray10 = new double[] { 100L, 1.0f };
        double[] doubleArray14 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray6, doubleArray10);
        double double17 = org.apache.commons.lang.math.NumberUtils.min(doubleArray10);
        double double18 = org.apache.commons.lang.math.NumberUtils.min(doubleArray10);
        double double19 = org.apache.commons.lang.math.NumberUtils.min(doubleArray10);
        double[] doubleArray22 = new double[] { 100L, 1.0f };
        double[] doubleArray26 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray22, doubleArray26);
        double[] doubleArray30 = new double[] { 100L, 1.0f };
        double[] doubleArray34 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray34);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray26, doubleArray30);
        double double37 = org.apache.commons.lang.math.NumberUtils.min(doubleArray30);
        double double38 = org.apache.commons.lang.math.NumberUtils.min(doubleArray30);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray30);
        double[] doubleArray40 = null;
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray40);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(0.0d, (double) (-1), (double) 97L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 0, (int) (byte) 10, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray17 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int18 = org.apache.commons.lang.math.NumberUtils.max(intArray17);
        int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray17);
        int int20 = org.apache.commons.lang.math.NumberUtils.max(intArray17);
        int int21 = org.apache.commons.lang.math.NumberUtils.max(intArray17);
        int int22 = org.apache.commons.lang.math.NumberUtils.min(intArray17);
        int[] intArray27 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray32 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(intArray27, intArray32);
        int[] intArray38 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray43 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(intArray38, intArray43);
        int int45 = org.apache.commons.lang.math.NumberUtils.min(intArray43);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(intArray32, intArray43);
        int int47 = org.apache.commons.lang.math.NumberUtils.min(intArray32);
        int[] intArray52 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray57 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(intArray52, intArray57);
        int int59 = org.apache.commons.lang.math.NumberUtils.max(intArray57);
        int int60 = org.apache.commons.lang.math.NumberUtils.min(intArray57);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(intArray32, intArray57);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray57);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray17);
        int int64 = org.apache.commons.lang.math.NumberUtils.max(intArray17);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 100 + "'", int64 == 100);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int int12 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int[] intArray17 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray22 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray22);
        int int24 = org.apache.commons.lang.math.NumberUtils.min(intArray22);
        int int25 = org.apache.commons.lang.math.NumberUtils.min(intArray22);
        int[] intArray30 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray35 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(intArray30, intArray35);
        int int37 = org.apache.commons.lang.math.NumberUtils.max(intArray35);
        int int38 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(intArray22, intArray35);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray22);
        int int41 = org.apache.commons.lang.math.NumberUtils.min(intArray22);
        int int42 = org.apache.commons.lang.math.NumberUtils.min(intArray22);
        int[] intArray47 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray52 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(intArray47, intArray52);
        int int54 = org.apache.commons.lang.math.NumberUtils.max(intArray52);
        int int55 = org.apache.commons.lang.math.NumberUtils.max(intArray52);
        int[] intArray60 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray65 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(intArray60, intArray65);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(intArray52, intArray60);
        int int68 = org.apache.commons.lang.math.NumberUtils.min(intArray60);
        int int69 = org.apache.commons.lang.math.NumberUtils.max(intArray60);
        int int70 = org.apache.commons.lang.math.NumberUtils.max(intArray60);
        int int71 = org.apache.commons.lang.math.NumberUtils.max(intArray60);
        int[] intArray77 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int78 = org.apache.commons.lang.math.NumberUtils.max(intArray77);
        int int79 = org.apache.commons.lang.math.NumberUtils.min(intArray77);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(intArray60, intArray77);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(intArray22, intArray60);
        int int82 = org.apache.commons.lang.math.NumberUtils.max(intArray60);
        int int83 = org.apache.commons.lang.math.NumberUtils.min(intArray60);
        int int84 = org.apache.commons.lang.math.NumberUtils.max(intArray60);
        int int85 = org.apache.commons.lang.math.NumberUtils.min(intArray60);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 100 + "'", int70 == 100);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 100 + "'", int71 == 100);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 100 + "'", int82 == 100);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 100 + "'", int84 == 100);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte5 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte6 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte[] byteArray8 = null;
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(byteArray8, byteArray15);
        byte byte17 = org.apache.commons.lang.math.NumberUtils.min(byteArray15);
        byte byte18 = org.apache.commons.lang.math.NumberUtils.max(byteArray15);
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray15);
        byte byte20 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte21 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte26 = org.apache.commons.lang.math.NumberUtils.max(byteArray25);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(byteArray25, byteArray29);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray25);
        byte byte32 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte33 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte34 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -1 + "'", byte17 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 10 + "'", byte20 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) -1 + "'", byte21 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 10 + "'", byte26 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 10 + "'", byte32 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) -1 + "'", byte33 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) -1 + "'", byte34 == (byte) -1);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float float7 = org.apache.commons.lang.math.NumberUtils.max(floatArray3);
        float float8 = org.apache.commons.lang.math.NumberUtils.max(floatArray3);
        float[] floatArray12 = new float[] { 0, 1.0f, 100 };
        float[] floatArray14 = new float[] { (-1L) };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(floatArray12, floatArray14);
        float[] floatArray19 = new float[] { 0, 1.0f, 100 };
        float[] floatArray21 = new float[] { (-1L) };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(floatArray19, floatArray21);
        float float23 = org.apache.commons.lang.math.NumberUtils.max(floatArray19);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(floatArray12, floatArray19);
        float float25 = org.apache.commons.lang.math.NumberUtils.max(floatArray19);
        float float26 = org.apache.commons.lang.math.NumberUtils.max(floatArray19);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray19);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 100.0f + "'", float25 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 100.0f + "'", float26 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 35.0f, 97.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        float[] floatArray0 = new float[] {};
        float[] floatArray4 = new float[] { 0, 1.0f, 100 };
        float[] floatArray6 = new float[] { (-1L) };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray4);
        float[] floatArray12 = new float[] { 0, 1.0f, 100 };
        float[] floatArray14 = new float[] { (-1L) };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(floatArray12, floatArray14);
        float[] floatArray19 = new float[] { 0, ' ', 100.0f };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray19);
        float float21 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray14);
        float float23 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float24 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float[] floatArray25 = new float[] {};
        float[] floatArray29 = new float[] { 0, 1.0f, 100 };
        float[] floatArray31 = new float[] { (-1L) };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(floatArray29, floatArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(floatArray25, floatArray29);
        float[] floatArray37 = new float[] { 0, 1.0f, 100 };
        float[] floatArray39 = new float[] { (-1L) };
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(floatArray37, floatArray39);
        float[] floatArray44 = new float[] { 0, ' ', 100.0f };
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(floatArray39, floatArray44);
        float float46 = org.apache.commons.lang.math.NumberUtils.min(floatArray39);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(floatArray29, floatArray39);
        float float48 = org.apache.commons.lang.math.NumberUtils.max(floatArray39);
        float float49 = org.apache.commons.lang.math.NumberUtils.min(floatArray39);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray39);
        float[] floatArray51 = new float[] {};
        float[] floatArray55 = new float[] { 0, 1.0f, 100 };
        float[] floatArray57 = new float[] { (-1L) };
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(floatArray55, floatArray57);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(floatArray51, floatArray55);
        float[] floatArray63 = new float[] { 0, 1.0f, 100 };
        float[] floatArray65 = new float[] { (-1L) };
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(floatArray63, floatArray65);
        float[] floatArray70 = new float[] { 0, ' ', 100.0f };
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(floatArray65, floatArray70);
        float float72 = org.apache.commons.lang.math.NumberUtils.min(floatArray65);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(floatArray55, floatArray65);
        float float74 = org.apache.commons.lang.math.NumberUtils.min(floatArray55);
        float float75 = org.apache.commons.lang.math.NumberUtils.max(floatArray55);
        float float76 = org.apache.commons.lang.math.NumberUtils.max(floatArray55);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(floatArray39, floatArray55);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + (-1.0f) + "'", float46 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + (-1.0f) + "'", float48 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + (-1.0f) + "'", float49 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray51), "[]");
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray55), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray57), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(floatArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray63), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray65), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(floatArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray70), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + float72 + "' != '" + (-1.0f) + "'", float72 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + float74 + "' != '" + 0.0f + "'", float74 == 0.0f);
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + 100.0f + "'", float75 == 100.0f);
        org.junit.Assert.assertTrue("'" + float76 + "' != '" + 100.0f + "'", float76 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        float[] floatArray0 = new float[] {};
        float[] floatArray4 = new float[] { 0, 1.0f, 100 };
        float[] floatArray6 = new float[] { (-1L) };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray4);
        float[] floatArray12 = new float[] { 0, 1.0f, 100 };
        float[] floatArray14 = new float[] { (-1L) };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(floatArray12, floatArray14);
        float[] floatArray19 = new float[] { 0, ' ', 100.0f };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray19);
        float float21 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray14);
        float float23 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float[] floatArray24 = new float[] {};
        float[] floatArray28 = new float[] { 0, 1.0f, 100 };
        float[] floatArray30 = new float[] { (-1L) };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(floatArray28, floatArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(floatArray24, floatArray28);
        float[] floatArray36 = new float[] { 0, 1.0f, 100 };
        float[] floatArray38 = new float[] { (-1L) };
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(floatArray36, floatArray38);
        float[] floatArray43 = new float[] { 0, ' ', 100.0f };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(floatArray38, floatArray43);
        float float45 = org.apache.commons.lang.math.NumberUtils.min(floatArray38);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(floatArray28, floatArray38);
        float[] floatArray50 = new float[] { 0, 1.0f, 100 };
        float[] floatArray52 = new float[] { (-1L) };
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(floatArray50, floatArray52);
        float[] floatArray57 = new float[] { 0, 1.0f, 100 };
        float[] floatArray59 = new float[] { (-1L) };
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(floatArray57, floatArray59);
        float float61 = org.apache.commons.lang.math.NumberUtils.max(floatArray57);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(floatArray50, floatArray57);
        float float63 = org.apache.commons.lang.math.NumberUtils.max(floatArray50);
        float[] floatArray64 = new float[] {};
        float[] floatArray68 = new float[] { 0, 1.0f, 100 };
        float[] floatArray70 = new float[] { (-1L) };
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(floatArray68, floatArray70);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(floatArray64, floatArray68);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(floatArray50, floatArray68);
        float float74 = org.apache.commons.lang.math.NumberUtils.max(floatArray68);
        float float75 = org.apache.commons.lang.math.NumberUtils.min(floatArray68);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(floatArray28, floatArray68);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray28);
        float float78 = org.apache.commons.lang.math.NumberUtils.min(floatArray28);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + (-1.0f) + "'", float45 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray50), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray52), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray57), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray59), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 100.0f + "'", float61 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 100.0f + "'", float63 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray64), "[]");
        org.junit.Assert.assertNotNull(floatArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray68), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray70), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + float74 + "' != '" + 100.0f + "'", float74 == 100.0f);
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + 0.0f + "'", float75 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + float78 + "' != '" + 0.0f + "'", float78 == 0.0f);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        short[] shortArray4 = new short[] { (byte) -1, (short) 100, (byte) -1, (byte) -1 };
        short short5 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        short short6 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        short[] shortArray10 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short11 = org.apache.commons.lang.math.NumberUtils.max(shortArray10);
        short[] shortArray15 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray15);
        short[] shortArray19 = new short[] { (short) -1, (short) -1 };
        short short20 = org.apache.commons.lang.math.NumberUtils.min(shortArray19);
        short[] shortArray24 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short25 = org.apache.commons.lang.math.NumberUtils.max(shortArray24);
        short[] shortArray29 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(shortArray24, shortArray29);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray24);
        short[] shortArray33 = new short[] { (short) 100 };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray33);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray33);
        short short36 = org.apache.commons.lang.math.NumberUtils.max(shortArray10);
        short short37 = org.apache.commons.lang.math.NumberUtils.min(shortArray10);
        short short38 = org.apache.commons.lang.math.NumberUtils.min(shortArray10);
        short short39 = org.apache.commons.lang.math.NumberUtils.max(shortArray10);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray10);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 100, -1, -1]");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) -1 + "'", short20 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 10 + "'", short25 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[100]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) 10 + "'", short36 == (short) 10);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) 1 + "'", short37 == (short) 1);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) 1 + "'", short38 == (short) 1);
        org.junit.Assert.assertTrue("'" + short39 + "' != '" + (short) 10 + "'", short39 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte5 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte[] byteArray6 = null;
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(byteArray6, byteArray13);
        byte byte15 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte byte16 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        byte byte17 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte byte18 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray13);
        byte byte20 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte21 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 100 + "'", byte16 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -1 + "'", byte17 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 10 + "'", byte20 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 10 + "'", byte21 == (byte) 10);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte byte10 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte[] byteArray12 = null;
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(byteArray12, byteArray19);
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(byteArray19, byteArray25);
        byte byte27 = org.apache.commons.lang.math.NumberUtils.max(byteArray25);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray25);
        byte byte29 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte byte30 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte byte31 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte byte32 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 10 + "'", byte27 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 100 + "'", byte29 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 100 + "'", byte30 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 100 + "'", byte31 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 100 + "'", byte32 == (byte) 100);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((-1L), (long) 35, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        long[] longArray0 = new long[] {};
        long[] longArray2 = new long[] { (byte) -1 };
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray2);
        long[] longArray4 = null;
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray2);
        long[] longArray7 = new long[] {};
        long[] longArray9 = new long[] { (byte) -1 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(longArray7, longArray9);
        long long11 = org.apache.commons.lang.math.NumberUtils.max(longArray9);
        long[] longArray14 = new long[] { 52L, (short) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(longArray9, longArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray9);
        long long17 = org.apache.commons.lang.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 1, 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte byte10 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte byte12 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte byte13 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte byte14 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte20 = org.apache.commons.lang.math.NumberUtils.max(byteArray19);
        byte byte21 = org.apache.commons.lang.math.NumberUtils.max(byteArray19);
        byte byte22 = org.apache.commons.lang.math.NumberUtils.min(byteArray19);
        byte byte23 = org.apache.commons.lang.math.NumberUtils.min(byteArray19);
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte29 = org.apache.commons.lang.math.NumberUtils.max(byteArray28);
        byte byte30 = org.apache.commons.lang.math.NumberUtils.max(byteArray28);
        byte byte31 = org.apache.commons.lang.math.NumberUtils.min(byteArray28);
        byte byte32 = org.apache.commons.lang.math.NumberUtils.min(byteArray28);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(byteArray19, byteArray28);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray19);
        byte byte35 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 10 + "'", byte20 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 10 + "'", byte21 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) -1 + "'", byte22 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) -1 + "'", byte23 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 10 + "'", byte29 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 10 + "'", byte30 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) -1 + "'", byte31 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) -1 + "'", byte32 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) -1 + "'", byte35 == (byte) -1);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 100, (short) (byte) 100, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        long[] longArray3 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray4 = new long[] {};
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long7 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long8 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long9 = org.apache.commons.lang.math.NumberUtils.min(longArray3);
        long[] longArray13 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray14 = new long[] {};
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray14);
        long long16 = org.apache.commons.lang.math.NumberUtils.max(longArray13);
        long long17 = org.apache.commons.lang.math.NumberUtils.max(longArray13);
        long long18 = org.apache.commons.lang.math.NumberUtils.min(longArray13);
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray13);
        long long20 = org.apache.commons.lang.math.NumberUtils.min(longArray13);
        long long21 = org.apache.commons.lang.math.NumberUtils.max(longArray13);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) (byte) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) 'a', 10, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double[] doubleArray10 = new double[] { 100L, 1.0f };
        double[] doubleArray14 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray10);
        double[] doubleArray19 = new double[] { 100L, 1.0f };
        double[] doubleArray23 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray19, doubleArray23);
        double[] doubleArray27 = new double[] { 100L, 1.0f };
        double[] doubleArray31 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray23, doubleArray27);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray27);
        double[] doubleArray37 = new double[] { 100L, 1.0f };
        double[] doubleArray41 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray41);
        double[] doubleArray45 = new double[] { 100L, 1.0f };
        double[] doubleArray49 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray45, doubleArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray45);
        double[] doubleArray54 = new double[] { 100L, 1.0f };
        double[] doubleArray58 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray54, doubleArray58);
        double[] doubleArray62 = new double[] { 100L, 1.0f };
        double[] doubleArray66 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray62, doubleArray66);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray58, doubleArray62);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray62);
        double double70 = org.apache.commons.lang.math.NumberUtils.min(doubleArray62);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray62);
        double double72 = org.apache.commons.lang.math.NumberUtils.min(doubleArray27);
        double double73 = org.apache.commons.lang.math.NumberUtils.min(doubleArray27);
        double double74 = org.apache.commons.lang.math.NumberUtils.min(doubleArray27);
        double[] doubleArray76 = new double[] { '#' };
        double double77 = org.apache.commons.lang.math.NumberUtils.min(doubleArray76);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray76);
        double double79 = org.apache.commons.lang.math.NumberUtils.min(doubleArray76);
        double double80 = org.apache.commons.lang.math.NumberUtils.max(doubleArray76);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 1.0d + "'", double70 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 1.0d + "'", double73 == 1.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 1.0d + "'", double74 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[35.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 35.0d + "'", double77 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 35.0d + "'", double79 == 35.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 35.0d + "'", double80 == 35.0d);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(1.0f, (float) ' ', (float) 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '#', (int) (short) 10, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 52, (float) '4', (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double[] doubleArray10 = new double[] { 100L, 1.0f };
        double[] doubleArray14 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray6, doubleArray10);
        double double17 = org.apache.commons.lang.math.NumberUtils.min(doubleArray6);
        double double18 = org.apache.commons.lang.math.NumberUtils.max(doubleArray6);
        double[] doubleArray21 = new double[] { 100L, 1.0f };
        double[] doubleArray25 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray25);
        double[] doubleArray29 = new double[] { 100L, 1.0f };
        double[] doubleArray33 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray29, doubleArray33);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray25, doubleArray29);
        double[] doubleArray38 = new double[] { 100L, 1.0f };
        double[] doubleArray42 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray38, doubleArray42);
        double[] doubleArray46 = new double[] { 100L, 1.0f };
        double[] doubleArray50 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray46, doubleArray50);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray38, doubleArray46);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray29, doubleArray46);
        double double54 = org.apache.commons.lang.math.NumberUtils.max(doubleArray46);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray6, doubleArray46);
        double double56 = org.apache.commons.lang.math.NumberUtils.max(doubleArray6);
        double double57 = org.apache.commons.lang.math.NumberUtils.max(doubleArray6);
        double double58 = org.apache.commons.lang.math.NumberUtils.min(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 100.0d + "'", double54 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 100.0d + "'", double57 == 100.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        long[] longArray3 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray4 = new long[] {};
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray4);
        long[] longArray6 = new long[] {};
        long[] longArray8 = new long[] { (byte) -1 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray6, longArray8);
        long long10 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long[] longArray13 = new long[] { 52L, (short) 1 };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray13);
        long[] longArray15 = new long[] {};
        long[] longArray17 = new long[] { (byte) -1 };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(longArray15, longArray17);
        long[] longArray19 = new long[] {};
        long[] longArray21 = new long[] { (byte) -1 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(longArray19, longArray21);
        long long23 = org.apache.commons.lang.math.NumberUtils.max(longArray21);
        long long24 = org.apache.commons.lang.math.NumberUtils.max(longArray21);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(longArray17, longArray21);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray21);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray8);
        long[] longArray28 = new long[] {};
        long[] longArray30 = new long[] { (byte) -1 };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(longArray28, longArray30);
        long long32 = org.apache.commons.lang.math.NumberUtils.max(longArray30);
        long[] longArray37 = new long[] { 0, (short) 1, 52, (byte) 1 };
        long long38 = org.apache.commons.lang.math.NumberUtils.max(longArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray30, longArray37);
        long long40 = org.apache.commons.lang.math.NumberUtils.min(longArray30);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray30);
        long long42 = org.apache.commons.lang.math.NumberUtils.min(longArray8);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[0, 1, 52, 1]");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 52L + "'", long38 == 52L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        float[] floatArray0 = new float[] {};
        float[] floatArray4 = new float[] { 0, 1.0f, 100 };
        float[] floatArray6 = new float[] { (-1L) };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray4);
        float float9 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float[] floatArray10 = null;
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray10);
        float float12 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte5 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte6 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte8 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        byte[] byteArray15 = null;
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray15, byteArray22);
        byte byte24 = org.apache.commons.lang.math.NumberUtils.min(byteArray22);
        byte byte25 = org.apache.commons.lang.math.NumberUtils.max(byteArray22);
        byte byte26 = org.apache.commons.lang.math.NumberUtils.min(byteArray22);
        byte byte27 = org.apache.commons.lang.math.NumberUtils.max(byteArray22);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray22);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray13);
        byte[] byteArray30 = null;
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray30);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) -1 + "'", byte24 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 100 + "'", byte25 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) -1 + "'", byte26 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 100 + "'", byte27 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        short[] shortArray3 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short4 = org.apache.commons.lang.math.NumberUtils.max(shortArray3);
        short[] shortArray8 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray8);
        short short10 = org.apache.commons.lang.math.NumberUtils.min(shortArray3);
        short[] shortArray13 = new short[] { (short) -1, (short) -1 };
        short short14 = org.apache.commons.lang.math.NumberUtils.min(shortArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray13);
        short short16 = org.apache.commons.lang.math.NumberUtils.max(shortArray13);
        short[] shortArray20 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short21 = org.apache.commons.lang.math.NumberUtils.max(shortArray20);
        short[] shortArray25 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(shortArray20, shortArray25);
        short[] shortArray29 = new short[] { (short) -1, (short) -1 };
        short short30 = org.apache.commons.lang.math.NumberUtils.min(shortArray29);
        short[] shortArray34 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short35 = org.apache.commons.lang.math.NumberUtils.max(shortArray34);
        short[] shortArray39 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(shortArray34, shortArray39);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(shortArray29, shortArray34);
        short[] shortArray43 = new short[] { (short) 100 };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(shortArray29, shortArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(shortArray20, shortArray43);
        short short46 = org.apache.commons.lang.math.NumberUtils.max(shortArray20);
        short short47 = org.apache.commons.lang.math.NumberUtils.min(shortArray20);
        short short48 = org.apache.commons.lang.math.NumberUtils.min(shortArray20);
        short short49 = org.apache.commons.lang.math.NumberUtils.max(shortArray20);
        short[] shortArray51 = new short[] { (byte) 1 };
        short short52 = org.apache.commons.lang.math.NumberUtils.min(shortArray51);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(shortArray20, shortArray51);
        short[] shortArray57 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short58 = org.apache.commons.lang.math.NumberUtils.max(shortArray57);
        short[] shortArray62 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(shortArray57, shortArray62);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(shortArray51, shortArray57);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(shortArray13, shortArray51);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 10 + "'", short21 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) -1 + "'", short30 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) 10 + "'", short35 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray43), "[100]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + short46 + "' != '" + (short) 10 + "'", short46 == (short) 10);
        org.junit.Assert.assertTrue("'" + short47 + "' != '" + (short) 1 + "'", short47 == (short) 1);
        org.junit.Assert.assertTrue("'" + short48 + "' != '" + (short) 1 + "'", short48 == (short) 1);
        org.junit.Assert.assertTrue("'" + short49 + "' != '" + (short) 10 + "'", short49 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray51), "[1]");
        org.junit.Assert.assertTrue("'" + short52 + "' != '" + (short) 1 + "'", short52 == (short) 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray57), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short58 + "' != '" + (short) 10 + "'", short58 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray62), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(97, (int) '#', 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 1, 1L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (byte) 100, (double) 32, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) 10, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        long[] longArray2 = new long[] { (byte) -1, (byte) 0 };
        long long3 = org.apache.commons.lang.math.NumberUtils.min(longArray2);
        long[] longArray8 = new long[] { 0L, 35, 32L, '#' };
        long[] longArray12 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray13 = new long[] {};
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(longArray12, longArray13);
        long long15 = org.apache.commons.lang.math.NumberUtils.max(longArray12);
        long long16 = org.apache.commons.lang.math.NumberUtils.max(longArray12);
        long long17 = org.apache.commons.lang.math.NumberUtils.max(longArray12);
        long long18 = org.apache.commons.lang.math.NumberUtils.min(longArray12);
        long[] longArray22 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray23 = new long[] {};
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(longArray22, longArray23);
        long long25 = org.apache.commons.lang.math.NumberUtils.max(longArray22);
        long long26 = org.apache.commons.lang.math.NumberUtils.max(longArray22);
        long long27 = org.apache.commons.lang.math.NumberUtils.min(longArray22);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray12, longArray22);
        long[] longArray32 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray33 = new long[] {};
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(longArray32, longArray33);
        long long35 = org.apache.commons.lang.math.NumberUtils.max(longArray32);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(longArray22, longArray32);
        long[] longArray40 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray41 = new long[] {};
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(longArray40, longArray41);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(longArray32, longArray40);
        long long44 = org.apache.commons.lang.math.NumberUtils.min(longArray32);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray32);
        long[] longArray50 = new long[] { 0L, 35, 32L, '#' };
        long[] longArray54 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray55 = new long[] {};
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(longArray54, longArray55);
        long long57 = org.apache.commons.lang.math.NumberUtils.max(longArray54);
        long long58 = org.apache.commons.lang.math.NumberUtils.max(longArray54);
        long long59 = org.apache.commons.lang.math.NumberUtils.max(longArray54);
        long long60 = org.apache.commons.lang.math.NumberUtils.min(longArray54);
        long[] longArray64 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray65 = new long[] {};
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(longArray64, longArray65);
        long long67 = org.apache.commons.lang.math.NumberUtils.max(longArray64);
        long long68 = org.apache.commons.lang.math.NumberUtils.max(longArray64);
        long long69 = org.apache.commons.lang.math.NumberUtils.min(longArray64);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(longArray54, longArray64);
        long[] longArray74 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray75 = new long[] {};
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(longArray74, longArray75);
        long long77 = org.apache.commons.lang.math.NumberUtils.max(longArray74);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(longArray64, longArray74);
        long[] longArray82 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray83 = new long[] {};
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(longArray82, longArray83);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(longArray74, longArray82);
        long long86 = org.apache.commons.lang.math.NumberUtils.min(longArray74);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(longArray50, longArray74);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray50);
        long long89 = org.apache.commons.lang.math.NumberUtils.max(longArray50);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray50);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[0, 35, 32, 35]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 52L + "'", long25 == 52L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 52L + "'", long26 == 52L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 52L + "'", long35 == 52L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[0, 35, 32, 35]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 52L + "'", long57 == 52L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 52L + "'", long58 == 52L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 52L + "'", long59 == 52L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 52L + "'", long67 == 52L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 52L + "'", long68 == 52L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-1L) + "'", long69 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(longArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray74), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 52L + "'", long77 == 52L);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(longArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray82), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray83), "[]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + (-1L) + "'", long86 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 35L + "'", long89 == 35L);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        short[] shortArray3 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short4 = org.apache.commons.lang.math.NumberUtils.max(shortArray3);
        short[] shortArray8 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray8);
        short[] shortArray12 = new short[] { (short) -1, (short) -1 };
        short short13 = org.apache.commons.lang.math.NumberUtils.min(shortArray12);
        short[] shortArray17 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short18 = org.apache.commons.lang.math.NumberUtils.max(shortArray17);
        short[] shortArray22 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(shortArray17, shortArray22);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(shortArray12, shortArray17);
        short[] shortArray26 = new short[] { (short) 100 };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(shortArray12, shortArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray26);
        short[] shortArray31 = new short[] { (short) -1, (short) -1 };
        short short32 = org.apache.commons.lang.math.NumberUtils.min(shortArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(shortArray26, shortArray31);
        short short34 = org.apache.commons.lang.math.NumberUtils.max(shortArray26);
        short short35 = org.apache.commons.lang.math.NumberUtils.max(shortArray26);
        short short36 = org.apache.commons.lang.math.NumberUtils.min(shortArray26);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) -1 + "'", short32 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) 100 + "'", short34 == (short) 100);
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) 100 + "'", short35 == (short) 100);
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) 100 + "'", short36 == (short) 100);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(10, (int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(97, (-1), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 1, 100L, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double[] doubleArray10 = new double[] { 100L, 1.0f };
        double[] doubleArray14 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray10);
        double double17 = org.apache.commons.lang.math.NumberUtils.min(doubleArray10);
        double double18 = org.apache.commons.lang.math.NumberUtils.max(doubleArray10);
        double double19 = org.apache.commons.lang.math.NumberUtils.min(doubleArray10);
        double[] doubleArray22 = new double[] { 100L, 1.0f };
        double[] doubleArray26 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray22, doubleArray26);
        double[] doubleArray30 = new double[] { 100L, 1.0f };
        double[] doubleArray34 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray34);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray26, doubleArray30);
        double double37 = org.apache.commons.lang.math.NumberUtils.min(doubleArray26);
        double double38 = org.apache.commons.lang.math.NumberUtils.max(doubleArray26);
        double[] doubleArray41 = new double[] { 100L, 1.0f };
        double[] doubleArray45 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray41, doubleArray45);
        double[] doubleArray49 = new double[] { 100L, 1.0f };
        double[] doubleArray53 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray49, doubleArray53);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray45, doubleArray49);
        double[] doubleArray58 = new double[] { 100L, 1.0f };
        double[] doubleArray62 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray58, doubleArray62);
        double[] doubleArray66 = new double[] { 100L, 1.0f };
        double[] doubleArray70 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray66, doubleArray70);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray58, doubleArray66);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray49, doubleArray66);
        double double74 = org.apache.commons.lang.math.NumberUtils.max(doubleArray66);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray26, doubleArray66);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray26);
        double double77 = org.apache.commons.lang.math.NumberUtils.max(doubleArray26);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 100.0d + "'", double74 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 100.0d + "'", double77 == 100.0d);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        double[] doubleArray1 = new double[] { '#' };
        double double2 = org.apache.commons.lang.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang.math.NumberUtils.max(doubleArray1);
        double[] doubleArray4 = new double[] {};
        double[] doubleArray7 = new double[] { 100L, 1.0f };
        double[] doubleArray11 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray7, doubleArray11);
        double[] doubleArray15 = new double[] { 100L, 1.0f };
        double[] doubleArray19 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray15, doubleArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray15);
        double double22 = org.apache.commons.lang.math.NumberUtils.min(doubleArray15);
        double double23 = org.apache.commons.lang.math.NumberUtils.max(doubleArray15);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray15);
        double double25 = org.apache.commons.lang.math.NumberUtils.max(doubleArray15);
        double double26 = org.apache.commons.lang.math.NumberUtils.min(doubleArray15);
        double double27 = org.apache.commons.lang.math.NumberUtils.max(doubleArray15);
        double double28 = org.apache.commons.lang.math.NumberUtils.max(doubleArray15);
        double double29 = org.apache.commons.lang.math.NumberUtils.max(doubleArray15);
        double double30 = org.apache.commons.lang.math.NumberUtils.max(doubleArray15);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray1, doubleArray15);
        double double32 = org.apache.commons.lang.math.NumberUtils.min(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[35.0]");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 10, (long) 0, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        float[] floatArray0 = new float[] {};
        float[] floatArray4 = new float[] { 0, 1.0f, 100 };
        float[] floatArray6 = new float[] { (-1L) };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray4);
        float[] floatArray12 = new float[] { 0, 1.0f, 100 };
        float[] floatArray14 = new float[] { (-1L) };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(floatArray12, floatArray14);
        float[] floatArray19 = new float[] { 0, ' ', 100.0f };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray19);
        float float21 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray14);
        float float23 = org.apache.commons.lang.math.NumberUtils.max(floatArray14);
        float float24 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        float float25 = org.apache.commons.lang.math.NumberUtils.max(floatArray14);
        float[] floatArray26 = new float[] {};
        float[] floatArray30 = new float[] { 0, 1.0f, 100 };
        float[] floatArray32 = new float[] { (-1L) };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(floatArray30, floatArray32);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(floatArray26, floatArray30);
        float[] floatArray38 = new float[] { 0, 1.0f, 100 };
        float[] floatArray40 = new float[] { (-1L) };
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(floatArray38, floatArray40);
        float[] floatArray45 = new float[] { 0, ' ', 100.0f };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(floatArray40, floatArray45);
        float float47 = org.apache.commons.lang.math.NumberUtils.min(floatArray40);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(floatArray30, floatArray40);
        float[] floatArray52 = new float[] { 0, 1.0f, 100 };
        float[] floatArray54 = new float[] { (-1L) };
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(floatArray52, floatArray54);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(floatArray30, floatArray52);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray52);
        float float58 = org.apache.commons.lang.math.NumberUtils.max(floatArray52);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-1.0f) + "'", float23 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-1.0f) + "'", float24 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-1.0f) + "'", float25 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray45), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + (-1.0f) + "'", float47 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray52), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 100.0f + "'", float58 == 100.0f);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        long[] longArray3 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray4 = new long[] {};
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray4);
        long[] longArray9 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray10 = new long[] {};
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(longArray9, longArray10);
        long long12 = org.apache.commons.lang.math.NumberUtils.max(longArray9);
        long long13 = org.apache.commons.lang.math.NumberUtils.max(longArray9);
        long long14 = org.apache.commons.lang.math.NumberUtils.max(longArray9);
        long long15 = org.apache.commons.lang.math.NumberUtils.min(longArray9);
        long[] longArray19 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray20 = new long[] {};
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(longArray19, longArray20);
        long long22 = org.apache.commons.lang.math.NumberUtils.max(longArray19);
        long long23 = org.apache.commons.lang.math.NumberUtils.max(longArray19);
        long long24 = org.apache.commons.lang.math.NumberUtils.min(longArray19);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(longArray9, longArray19);
        long[] longArray29 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray30 = new long[] {};
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(longArray29, longArray30);
        long long32 = org.apache.commons.lang.math.NumberUtils.max(longArray29);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(longArray19, longArray29);
        long[] longArray37 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray38 = new long[] {};
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray37, longArray38);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(longArray29, longArray37);
        long long41 = org.apache.commons.lang.math.NumberUtils.min(longArray29);
        long[] longArray42 = new long[] {};
        long[] longArray44 = new long[] { (byte) -1 };
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(longArray42, longArray44);
        long long46 = org.apache.commons.lang.math.NumberUtils.max(longArray44);
        long[] longArray49 = new long[] { 52L, (short) 1 };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(longArray44, longArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(longArray29, longArray44);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray29);
        long long53 = org.apache.commons.lang.math.NumberUtils.min(longArray29);
        long long54 = org.apache.commons.lang.math.NumberUtils.max(longArray29);
        long long55 = org.apache.commons.lang.math.NumberUtils.min(longArray29);
        long long56 = org.apache.commons.lang.math.NumberUtils.max(longArray29);
        long[] longArray63 = new long[] { 0, 52, 32, 32L, (short) 10, 1L };
        long long64 = org.apache.commons.lang.math.NumberUtils.max(longArray63);
        long long65 = org.apache.commons.lang.math.NumberUtils.max(longArray63);
        long long66 = org.apache.commons.lang.math.NumberUtils.min(longArray63);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(longArray29, longArray63);
        long long68 = org.apache.commons.lang.math.NumberUtils.max(longArray63);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 52L + "'", long22 == 52L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 52L + "'", long23 == 52L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 52L + "'", long32 == 52L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[]");
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 52L + "'", long54 == 52L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 52L + "'", long56 == 52L);
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[0, 52, 32, 32, 10, 1]");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 52L + "'", long64 == 52L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 52L + "'", long65 == 52L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 52L + "'", long68 == 52L);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        int[] intArray5 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int6 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int int8 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int[] intArray13 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray18 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray18);
        int int20 = org.apache.commons.lang.math.NumberUtils.min(intArray18);
        int int21 = org.apache.commons.lang.math.NumberUtils.min(intArray18);
        int[] intArray26 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray31 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(intArray26, intArray31);
        int int33 = org.apache.commons.lang.math.NumberUtils.max(intArray31);
        int int34 = org.apache.commons.lang.math.NumberUtils.min(intArray31);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray31);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(intArray5, intArray18);
        int int37 = org.apache.commons.lang.math.NumberUtils.min(intArray5);
        int int38 = org.apache.commons.lang.math.NumberUtils.min(intArray5);
        int int39 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(32L, (long) (-1), (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double[] doubleArray10 = new double[] { 100L, 1.0f };
        double[] doubleArray14 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray6, doubleArray10);
        double double17 = org.apache.commons.lang.math.NumberUtils.min(doubleArray10);
        double double18 = org.apache.commons.lang.math.NumberUtils.min(doubleArray10);
        double double19 = org.apache.commons.lang.math.NumberUtils.min(doubleArray10);
        double[] doubleArray22 = new double[] { 100L, 1.0f };
        double[] doubleArray26 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray22, doubleArray26);
        double[] doubleArray30 = new double[] { 100L, 1.0f };
        double[] doubleArray34 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray34);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray26, doubleArray30);
        double double37 = org.apache.commons.lang.math.NumberUtils.min(doubleArray30);
        double double38 = org.apache.commons.lang.math.NumberUtils.min(doubleArray30);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray30);
        double[] doubleArray42 = new double[] { 100L, 1.0f };
        double[] doubleArray46 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray42, doubleArray46);
        double[] doubleArray50 = new double[] { 100L, 1.0f };
        double[] doubleArray54 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray50, doubleArray54);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray46, doubleArray50);
        double double57 = org.apache.commons.lang.math.NumberUtils.min(doubleArray50);
        double double58 = org.apache.commons.lang.math.NumberUtils.min(doubleArray50);
        double double59 = org.apache.commons.lang.math.NumberUtils.min(doubleArray50);
        double[] doubleArray62 = new double[] { 100L, 1.0f };
        double[] doubleArray66 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray62, doubleArray66);
        double[] doubleArray70 = new double[] { 100L, 1.0f };
        double[] doubleArray74 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray70, doubleArray74);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray66, doubleArray70);
        double double77 = org.apache.commons.lang.math.NumberUtils.min(doubleArray70);
        double double78 = org.apache.commons.lang.math.NumberUtils.min(doubleArray70);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray50, doubleArray70);
        double double80 = org.apache.commons.lang.math.NumberUtils.min(doubleArray50);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray50);
        double double82 = org.apache.commons.lang.math.NumberUtils.min(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.0d + "'", double57 == 1.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 1.0d + "'", double59 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 1.0d + "'", double77 == 1.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 1.0d + "'", double78 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 1.0d + "'", double80 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 1.0d + "'", double82 == 1.0d);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) (byte) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int[] intArray15 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray20 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray15, intArray20);
        int int22 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray20);
        int int24 = org.apache.commons.lang.math.NumberUtils.max(intArray20);
        int int25 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
        int int26 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
        int[] intArray33 = new int[] { (short) 0, '4', (byte) 0, (short) 1, (short) 10, '#' };
        int int34 = org.apache.commons.lang.math.NumberUtils.min(intArray33);
        int int35 = org.apache.commons.lang.math.NumberUtils.min(intArray33);
        int[] intArray42 = new int[] { (short) 0, '4', (byte) 0, (short) 1, (short) 10, '#' };
        int int43 = org.apache.commons.lang.math.NumberUtils.min(intArray42);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray42);
        int[] intArray50 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int51 = org.apache.commons.lang.math.NumberUtils.max(intArray50);
        int int52 = org.apache.commons.lang.math.NumberUtils.max(intArray50);
        int int53 = org.apache.commons.lang.math.NumberUtils.max(intArray50);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(intArray42, intArray50);
        int int55 = org.apache.commons.lang.math.NumberUtils.max(intArray42);
        int int56 = org.apache.commons.lang.math.NumberUtils.min(intArray42);
        int int57 = org.apache.commons.lang.math.NumberUtils.min(intArray42);
        int int58 = org.apache.commons.lang.math.NumberUtils.min(intArray42);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(intArray20, intArray42);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 52, 0, 1, 10, 35]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[0, 52, 0, 1, 10, 35]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 52 + "'", int55 == 52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        long[] longArray0 = new long[] {};
        long[] longArray2 = new long[] { (byte) -1 };
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray2);
        long[] longArray4 = new long[] {};
        long[] longArray6 = new long[] { (byte) -1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray6);
        long long8 = org.apache.commons.lang.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray6);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray6);
        long long11 = org.apache.commons.lang.math.NumberUtils.max(longArray6);
        java.lang.Class<?> wildcardClass12 = longArray6.getClass();
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 10.0f, (double) (byte) 10, 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte4 = org.apache.commons.lang.math.NumberUtils.max(byteArray3);
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray3, byteArray7);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        byte byte15 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        byte byte16 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte byte17 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray13);
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte23 = org.apache.commons.lang.math.NumberUtils.max(byteArray22);
        byte[] byteArray24 = null;
        byte[] byteArray31 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(byteArray24, byteArray31);
        byte[] byteArray37 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(byteArray31, byteArray37);
        byte byte39 = org.apache.commons.lang.math.NumberUtils.max(byteArray31);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(byteArray22, byteArray31);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray22);
        byte byte42 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte byte43 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte48 = org.apache.commons.lang.math.NumberUtils.max(byteArray47);
        byte[] byteArray49 = null;
        byte[] byteArray56 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(byteArray49, byteArray56);
        byte[] byteArray62 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(byteArray56, byteArray62);
        byte byte64 = org.apache.commons.lang.math.NumberUtils.max(byteArray56);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(byteArray47, byteArray56);
        byte byte66 = org.apache.commons.lang.math.NumberUtils.max(byteArray47);
        byte byte67 = org.apache.commons.lang.math.NumberUtils.max(byteArray47);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray47);
        byte byte69 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -1 + "'", byte17 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 10 + "'", byte23 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 100 + "'", byte39 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) -1 + "'", byte42 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 10 + "'", byte43 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte48 + "' != '" + (byte) 10 + "'", byte48 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + byte64 + "' != '" + (byte) 100 + "'", byte64 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + byte66 + "' != '" + (byte) 10 + "'", byte66 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) 10 + "'", byte67 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + byte69 + "' != '" + (byte) 10 + "'", byte69 == (byte) 10);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 32L, (double) 1L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        long[] longArray0 = new long[] {};
        long[] longArray2 = new long[] { (byte) -1 };
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray2);
        long[] longArray4 = new long[] {};
        long[] longArray6 = new long[] { (byte) -1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray6);
        long long8 = org.apache.commons.lang.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray6);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray6);
        long long11 = org.apache.commons.lang.math.NumberUtils.max(longArray6);
        long[] longArray15 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray16 = new long[] {};
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(longArray15, longArray16);
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray15);
        long long19 = org.apache.commons.lang.math.NumberUtils.max(longArray15);
        long long20 = org.apache.commons.lang.math.NumberUtils.max(longArray15);
        long long21 = org.apache.commons.lang.math.NumberUtils.min(longArray15);
        long long22 = org.apache.commons.lang.math.NumberUtils.min(longArray15);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(longArray6, longArray15);
        long long24 = org.apache.commons.lang.math.NumberUtils.min(longArray15);
        long long25 = org.apache.commons.lang.math.NumberUtils.max(longArray15);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 52L + "'", long18 == 52L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 52L + "'", long25 == 52L);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        double[] doubleArray0 = null;
        double[] doubleArray1 = null;
        double[] doubleArray4 = new double[] { 100L, 1.0f };
        double[] doubleArray8 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double double10 = org.apache.commons.lang.math.NumberUtils.max(doubleArray4);
        double[] doubleArray13 = new double[] { 100L, 1.0f };
        double[] doubleArray17 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray13, doubleArray17);
        double[] doubleArray21 = new double[] { 100L, 1.0f };
        double[] doubleArray25 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray25);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray13, doubleArray21);
        double[] doubleArray30 = new double[] { 100L, 1.0f };
        double[] doubleArray34 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray34);
        double[] doubleArray38 = new double[] { 100L, 1.0f };
        double[] doubleArray42 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray38, doubleArray42);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray34, doubleArray38);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray13, doubleArray38);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray13);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray1, doubleArray13);
        double[] doubleArray50 = new double[] { 100L, 1.0f };
        double[] doubleArray54 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray50, doubleArray54);
        double[] doubleArray58 = new double[] { 100L, 1.0f };
        double[] doubleArray62 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray58, doubleArray62);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray54, doubleArray58);
        double double65 = org.apache.commons.lang.math.NumberUtils.max(doubleArray54);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray13, doubleArray54);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        long[] longArray3 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray4 = new long[] {};
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray4);
        long[] longArray9 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray10 = new long[] {};
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(longArray9, longArray10);
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray10);
        long[] longArray16 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray17 = new long[] {};
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(longArray16, longArray17);
        long long19 = org.apache.commons.lang.math.NumberUtils.max(longArray16);
        long long20 = org.apache.commons.lang.math.NumberUtils.max(longArray16);
        long long21 = org.apache.commons.lang.math.NumberUtils.max(longArray16);
        long long22 = org.apache.commons.lang.math.NumberUtils.min(longArray16);
        long long23 = org.apache.commons.lang.math.NumberUtils.max(longArray16);
        long long24 = org.apache.commons.lang.math.NumberUtils.min(longArray16);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray16);
        long long26 = org.apache.commons.lang.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 52L + "'", long23 == 52L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        short[] shortArray3 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short4 = org.apache.commons.lang.math.NumberUtils.max(shortArray3);
        short[] shortArray8 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray8);
        short short10 = org.apache.commons.lang.math.NumberUtils.min(shortArray3);
        short[] shortArray14 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short15 = org.apache.commons.lang.math.NumberUtils.max(shortArray14);
        short short16 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
        short short17 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray14);
        short short19 = org.apache.commons.lang.math.NumberUtils.min(shortArray3);
        short[] shortArray23 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short24 = org.apache.commons.lang.math.NumberUtils.max(shortArray23);
        short[] shortArray28 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(shortArray23, shortArray28);
        short[] shortArray32 = new short[] { (short) -1, (short) -1 };
        short short33 = org.apache.commons.lang.math.NumberUtils.min(shortArray32);
        short[] shortArray37 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short38 = org.apache.commons.lang.math.NumberUtils.max(shortArray37);
        short[] shortArray42 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(shortArray37, shortArray42);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(shortArray32, shortArray37);
        short[] shortArray46 = new short[] { (short) 100 };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(shortArray32, shortArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(shortArray23, shortArray46);
        short short49 = org.apache.commons.lang.math.NumberUtils.max(shortArray23);
        short short50 = org.apache.commons.lang.math.NumberUtils.min(shortArray23);
        short short51 = org.apache.commons.lang.math.NumberUtils.min(shortArray23);
        short short52 = org.apache.commons.lang.math.NumberUtils.max(shortArray23);
        short[] shortArray54 = new short[] { (byte) 1 };
        short short55 = org.apache.commons.lang.math.NumberUtils.min(shortArray54);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(shortArray23, shortArray54);
        short[] shortArray60 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short61 = org.apache.commons.lang.math.NumberUtils.max(shortArray60);
        short[] shortArray65 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(shortArray60, shortArray65);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(shortArray54, shortArray60);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray54);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 1 + "'", short16 == (short) 1);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 1 + "'", short17 == (short) 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 1 + "'", short19 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 10 + "'", short24 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) -1 + "'", short33 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) 10 + "'", short38 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[100]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + short49 + "' != '" + (short) 10 + "'", short49 == (short) 10);
        org.junit.Assert.assertTrue("'" + short50 + "' != '" + (short) 1 + "'", short50 == (short) 1);
        org.junit.Assert.assertTrue("'" + short51 + "' != '" + (short) 1 + "'", short51 == (short) 1);
        org.junit.Assert.assertTrue("'" + short52 + "' != '" + (short) 10 + "'", short52 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[1]");
        org.junit.Assert.assertTrue("'" + short55 + "' != '" + (short) 1 + "'", short55 == (short) 1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray60), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short61 + "' != '" + (short) 10 + "'", short61 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray65), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((-1), (int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte5 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte6 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte8 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        byte[] byteArray15 = null;
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray15, byteArray22);
        byte byte24 = org.apache.commons.lang.math.NumberUtils.min(byteArray22);
        byte byte25 = org.apache.commons.lang.math.NumberUtils.max(byteArray22);
        byte byte26 = org.apache.commons.lang.math.NumberUtils.min(byteArray22);
        byte byte27 = org.apache.commons.lang.math.NumberUtils.max(byteArray22);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray22);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray13);
        byte[] byteArray34 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte35 = org.apache.commons.lang.math.NumberUtils.max(byteArray34);
        byte[] byteArray36 = null;
        byte[] byteArray43 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(byteArray36, byteArray43);
        byte byte45 = org.apache.commons.lang.math.NumberUtils.min(byteArray43);
        byte byte46 = org.apache.commons.lang.math.NumberUtils.max(byteArray43);
        byte byte47 = org.apache.commons.lang.math.NumberUtils.min(byteArray43);
        byte byte48 = org.apache.commons.lang.math.NumberUtils.max(byteArray43);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(byteArray34, byteArray43);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray34);
        byte[] byteArray51 = null;
        byte[] byteArray58 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(byteArray51, byteArray58);
        byte[] byteArray64 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(byteArray58, byteArray64);
        byte byte66 = org.apache.commons.lang.math.NumberUtils.min(byteArray64);
        byte byte67 = org.apache.commons.lang.math.NumberUtils.min(byteArray64);
        byte byte68 = org.apache.commons.lang.math.NumberUtils.min(byteArray64);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(byteArray34, byteArray64);
        byte byte70 = org.apache.commons.lang.math.NumberUtils.min(byteArray34);
        byte byte71 = org.apache.commons.lang.math.NumberUtils.min(byteArray34);
        byte byte72 = org.apache.commons.lang.math.NumberUtils.max(byteArray34);
        byte byte73 = org.apache.commons.lang.math.NumberUtils.max(byteArray34);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) -1 + "'", byte24 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 100 + "'", byte25 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) -1 + "'", byte26 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 100 + "'", byte27 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 10 + "'", byte35 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) -1 + "'", byte45 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) 100 + "'", byte46 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte47 + "' != '" + (byte) -1 + "'", byte47 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte48 + "' != '" + (byte) 100 + "'", byte48 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + byte66 + "' != '" + (byte) -1 + "'", byte66 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) -1 + "'", byte67 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte68 + "' != '" + (byte) -1 + "'", byte68 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + byte70 + "' != '" + (byte) -1 + "'", byte70 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte71 + "' != '" + (byte) -1 + "'", byte71 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte72 + "' != '" + (byte) 10 + "'", byte72 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte73 + "' != '" + (byte) 10 + "'", byte73 == (byte) 10);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        int[] intArray5 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int6 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray5);
        int int8 = org.apache.commons.lang.math.NumberUtils.min(intArray5);
        int int9 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int[] intArray14 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray19 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(intArray14, intArray19);
        int int21 = org.apache.commons.lang.math.NumberUtils.max(intArray19);
        int int22 = org.apache.commons.lang.math.NumberUtils.max(intArray19);
        int[] intArray27 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray32 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(intArray27, intArray32);
        int int34 = org.apache.commons.lang.math.NumberUtils.min(intArray32);
        int int35 = org.apache.commons.lang.math.NumberUtils.min(intArray32);
        int[] intArray40 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray45 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(intArray40, intArray45);
        int int47 = org.apache.commons.lang.math.NumberUtils.max(intArray45);
        int int48 = org.apache.commons.lang.math.NumberUtils.min(intArray45);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(intArray32, intArray45);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(intArray19, intArray32);
        int[] intArray55 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray60 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(intArray55, intArray60);
        int int62 = org.apache.commons.lang.math.NumberUtils.max(intArray60);
        int int63 = org.apache.commons.lang.math.NumberUtils.max(intArray60);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(intArray32, intArray60);
        int int65 = org.apache.commons.lang.math.NumberUtils.max(intArray32);
        int int66 = org.apache.commons.lang.math.NumberUtils.min(intArray32);
        int[] intArray71 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray76 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(intArray71, intArray76);
        int int78 = org.apache.commons.lang.math.NumberUtils.min(intArray76);
        int[] intArray83 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray88 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(intArray83, intArray88);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(intArray76, intArray83);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(intArray32, intArray76);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(intArray5, intArray76);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 100 + "'", int63 == 100);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        short[] shortArray3 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short4 = org.apache.commons.lang.math.NumberUtils.max(shortArray3);
        short[] shortArray8 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray8);
        short[] shortArray12 = new short[] { (short) -1, (short) -1 };
        short short13 = org.apache.commons.lang.math.NumberUtils.min(shortArray12);
        short[] shortArray17 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short18 = org.apache.commons.lang.math.NumberUtils.max(shortArray17);
        short[] shortArray22 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(shortArray17, shortArray22);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(shortArray12, shortArray17);
        short[] shortArray26 = new short[] { (short) 100 };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(shortArray12, shortArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray26);
        short[] shortArray30 = new short[] { (byte) 1 };
        short short31 = org.apache.commons.lang.math.NumberUtils.min(shortArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(shortArray26, shortArray30);
        short[] shortArray35 = new short[] { (short) -1, (short) -1 };
        short short36 = org.apache.commons.lang.math.NumberUtils.min(shortArray35);
        short[] shortArray40 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short41 = org.apache.commons.lang.math.NumberUtils.max(shortArray40);
        short[] shortArray45 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(shortArray40, shortArray45);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(shortArray35, shortArray40);
        short[] shortArray49 = new short[] { (short) 100 };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(shortArray35, shortArray49);
        short short51 = org.apache.commons.lang.math.NumberUtils.min(shortArray49);
        short short52 = org.apache.commons.lang.math.NumberUtils.max(shortArray49);
        short short53 = org.apache.commons.lang.math.NumberUtils.min(shortArray49);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(shortArray30, shortArray49);
        short short55 = org.apache.commons.lang.math.NumberUtils.min(shortArray30);
        short[] shortArray58 = new short[] { (short) -1, (short) -1 };
        short short59 = org.apache.commons.lang.math.NumberUtils.min(shortArray58);
        short[] shortArray63 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short64 = org.apache.commons.lang.math.NumberUtils.max(shortArray63);
        short[] shortArray68 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(shortArray63, shortArray68);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(shortArray58, shortArray63);
        short[] shortArray72 = new short[] { (short) 100 };
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(shortArray58, shortArray72);
        short short74 = org.apache.commons.lang.math.NumberUtils.max(shortArray58);
        short[] shortArray77 = new short[] { (short) -1, (short) -1 };
        short short78 = org.apache.commons.lang.math.NumberUtils.min(shortArray77);
        short[] shortArray82 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short83 = org.apache.commons.lang.math.NumberUtils.max(shortArray82);
        short[] shortArray87 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(shortArray82, shortArray87);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(shortArray77, shortArray82);
        short[] shortArray91 = new short[] { (short) 100 };
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(shortArray77, shortArray91);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(shortArray58, shortArray77);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(shortArray30, shortArray77);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[1]");
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 1 + "'", short31 == (short) 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) -1 + "'", short36 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short41 + "' != '" + (short) 10 + "'", short41 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[100]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + short51 + "' != '" + (short) 100 + "'", short51 == (short) 100);
        org.junit.Assert.assertTrue("'" + short52 + "' != '" + (short) 100 + "'", short52 == (short) 100);
        org.junit.Assert.assertTrue("'" + short53 + "' != '" + (short) 100 + "'", short53 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + short55 + "' != '" + (short) 1 + "'", short55 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray58), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short59 + "' != '" + (short) -1 + "'", short59 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray63), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short64 + "' != '" + (short) 10 + "'", short64 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray68), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray72), "[100]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + short74 + "' != '" + (short) -1 + "'", short74 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray77), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short78 + "' != '" + (short) -1 + "'", short78 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray82), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short83 + "' != '" + (short) 10 + "'", short83 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray87), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(shortArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray91), "[100]");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int int12 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int[] intArray17 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray22 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray22);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray17);
        int int25 = org.apache.commons.lang.math.NumberUtils.min(intArray17);
        int int26 = org.apache.commons.lang.math.NumberUtils.max(intArray17);
        int int27 = org.apache.commons.lang.math.NumberUtils.max(intArray17);
        int int28 = org.apache.commons.lang.math.NumberUtils.max(intArray17);
        int[] intArray34 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int35 = org.apache.commons.lang.math.NumberUtils.max(intArray34);
        int int36 = org.apache.commons.lang.math.NumberUtils.min(intArray34);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray34);
        int int38 = org.apache.commons.lang.math.NumberUtils.min(intArray34);
        int int39 = org.apache.commons.lang.math.NumberUtils.min(intArray34);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        long[] longArray3 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray4 = new long[] {};
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long7 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long8 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long9 = org.apache.commons.lang.math.NumberUtils.min(longArray3);
        long long10 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long11 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 1, 52L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 10L, (float) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        long[] longArray3 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray4 = new long[] {};
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray4);
        long[] longArray6 = null;
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray6);
        long[] longArray8 = new long[] {};
        long[] longArray10 = new long[] { (byte) -1 };
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray10);
        long long12 = org.apache.commons.lang.math.NumberUtils.max(longArray10);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray10);
        long[] longArray14 = new long[] {};
        long[] longArray16 = new long[] { (byte) -1 };
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(longArray14, longArray16);
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray16);
        long[] longArray23 = new long[] { 0, (short) 1, 52, (byte) 1 };
        long long24 = org.apache.commons.lang.math.NumberUtils.max(longArray23);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(longArray16, longArray23);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(longArray10, longArray16);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[0, 1, 52, 1]");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 52L + "'", long24 == 52L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) 0, (float) (-1), (float) 100L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int[] intArray15 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray20 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray15, intArray20);
        int int22 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray20);
        int int24 = org.apache.commons.lang.math.NumberUtils.max(intArray20);
        int[] intArray29 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray34 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(intArray29, intArray34);
        int int36 = org.apache.commons.lang.math.NumberUtils.max(intArray34);
        int int37 = org.apache.commons.lang.math.NumberUtils.min(intArray34);
        int int38 = org.apache.commons.lang.math.NumberUtils.max(intArray34);
        int int39 = org.apache.commons.lang.math.NumberUtils.min(intArray34);
        int int40 = org.apache.commons.lang.math.NumberUtils.max(intArray34);
        int[] intArray46 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int47 = org.apache.commons.lang.math.NumberUtils.max(intArray46);
        int int48 = org.apache.commons.lang.math.NumberUtils.max(intArray46);
        int int49 = org.apache.commons.lang.math.NumberUtils.max(intArray46);
        int[] intArray54 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray59 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(intArray54, intArray59);
        int int61 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        int int62 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        int int63 = org.apache.commons.lang.math.NumberUtils.max(intArray59);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(intArray46, intArray59);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(intArray34, intArray46);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(intArray20, intArray46);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 100 + "'", int63 == 100);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float[] floatArray10 = new float[] { 0, 1.0f, 100 };
        float[] floatArray12 = new float[] { (-1L) };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray12);
        float float14 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray10);
        float float16 = org.apache.commons.lang.math.NumberUtils.min(floatArray5);
        float float17 = org.apache.commons.lang.math.NumberUtils.max(floatArray5);
        float float18 = org.apache.commons.lang.math.NumberUtils.min(floatArray5);
        float[] floatArray22 = new float[] { 0, 1.0f, 100 };
        float[] floatArray24 = new float[] { (-1L) };
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(floatArray22, floatArray24);
        float float26 = org.apache.commons.lang.math.NumberUtils.max(floatArray22);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray22);
        float float28 = org.apache.commons.lang.math.NumberUtils.max(floatArray22);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 100.0f + "'", float26 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 100.0f + "'", float28 == 100.0f);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 1, 52L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float float7 = org.apache.commons.lang.math.NumberUtils.min(floatArray3);
        float[] floatArray12 = new float[] { 0.0f, 35, (-1), 35 };
        float[] floatArray13 = new float[] {};
        float[] floatArray17 = new float[] { 0, 1.0f, 100 };
        float[] floatArray19 = new float[] { (-1L) };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(floatArray17, floatArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(floatArray13, floatArray17);
        float float22 = org.apache.commons.lang.math.NumberUtils.max(floatArray17);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(floatArray12, floatArray17);
        float float24 = org.apache.commons.lang.math.NumberUtils.max(floatArray17);
        float[] floatArray25 = new float[] {};
        float[] floatArray29 = new float[] { 0, 1.0f, 100 };
        float[] floatArray31 = new float[] { (-1L) };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(floatArray29, floatArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(floatArray25, floatArray29);
        float[] floatArray37 = new float[] { 0, 1.0f, 100 };
        float[] floatArray39 = new float[] { (-1L) };
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(floatArray37, floatArray39);
        float[] floatArray44 = new float[] { 0, ' ', 100.0f };
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(floatArray39, floatArray44);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(floatArray25, floatArray39);
        float float47 = org.apache.commons.lang.math.NumberUtils.min(floatArray39);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(floatArray17, floatArray39);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray17);
        float float50 = org.apache.commons.lang.math.NumberUtils.min(floatArray17);
        float float51 = org.apache.commons.lang.math.NumberUtils.min(floatArray17);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[0.0, 35.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + (-1.0f) + "'", float47 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 0.0f + "'", float50 == 0.0f);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 0.0f + "'", float51 == 0.0f);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang.math.NumberUtils.min(shortArray1);
        short[] shortArray4 = new short[] { (short) -1 };
        short short5 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray4);
        short[] shortArray8 = new short[] { (byte) 1 };
        short short9 = org.apache.commons.lang.math.NumberUtils.min(shortArray8);
        short[] shortArray11 = new short[] { (short) -1 };
        short short12 = org.apache.commons.lang.math.NumberUtils.max(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray8, shortArray11);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short[] shortArray18 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short19 = org.apache.commons.lang.math.NumberUtils.max(shortArray18);
        short short20 = org.apache.commons.lang.math.NumberUtils.min(shortArray18);
        short short21 = org.apache.commons.lang.math.NumberUtils.min(shortArray18);
        short short22 = org.apache.commons.lang.math.NumberUtils.min(shortArray18);
        short short23 = org.apache.commons.lang.math.NumberUtils.max(shortArray18);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray18);
        short short25 = org.apache.commons.lang.math.NumberUtils.max(shortArray18);
        short short26 = org.apache.commons.lang.math.NumberUtils.min(shortArray18);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[1]");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -1 + "'", short12 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 10 + "'", short19 == (short) 10);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 1 + "'", short20 == (short) 1);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 1 + "'", short21 == (short) 1);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 1 + "'", short22 == (short) 1);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 10 + "'", short23 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 10 + "'", short25 == (short) 10);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 1 + "'", short26 == (short) 1);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 1, (float) 0, (float) (-1));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int int12 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int int13 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int[] intArray18 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray23 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray23);
        int int25 = org.apache.commons.lang.math.NumberUtils.min(intArray23);
        int int26 = org.apache.commons.lang.math.NumberUtils.min(intArray23);
        int[] intArray31 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray36 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(intArray31, intArray36);
        int int38 = org.apache.commons.lang.math.NumberUtils.max(intArray36);
        int int39 = org.apache.commons.lang.math.NumberUtils.min(intArray36);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(intArray23, intArray36);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray36);
        int int42 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int int43 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray50 = new int[] { (short) 0, '4', (byte) 0, (short) 1, (short) 10, '#' };
        int int51 = org.apache.commons.lang.math.NumberUtils.min(intArray50);
        int int52 = org.apache.commons.lang.math.NumberUtils.min(intArray50);
        int[] intArray59 = new int[] { (short) 0, '4', (byte) 0, (short) 1, (short) 10, '#' };
        int int60 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(intArray50, intArray59);
        int[] intArray67 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int68 = org.apache.commons.lang.math.NumberUtils.max(intArray67);
        int int69 = org.apache.commons.lang.math.NumberUtils.max(intArray67);
        int int70 = org.apache.commons.lang.math.NumberUtils.max(intArray67);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(intArray59, intArray67);
        int int72 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray59);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[0, 52, 0, 1, 10, 35]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[0, 52, 0, 1, 10, 35]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 100 + "'", int68 == 100);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 100 + "'", int70 == 100);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte4 = org.apache.commons.lang.math.NumberUtils.max(byteArray3);
        byte[] byteArray5 = null;
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray12);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(byteArray12, byteArray18);
        byte byte20 = org.apache.commons.lang.math.NumberUtils.max(byteArray12);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(byteArray3, byteArray12);
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte26 = org.apache.commons.lang.math.NumberUtils.max(byteArray25);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(byteArray25, byteArray29);
        byte[] byteArray35 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte36 = org.apache.commons.lang.math.NumberUtils.max(byteArray35);
        byte byte37 = org.apache.commons.lang.math.NumberUtils.max(byteArray35);
        byte byte38 = org.apache.commons.lang.math.NumberUtils.min(byteArray35);
        byte byte39 = org.apache.commons.lang.math.NumberUtils.min(byteArray35);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(byteArray29, byteArray35);
        byte[] byteArray44 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte45 = org.apache.commons.lang.math.NumberUtils.max(byteArray44);
        byte[] byteArray46 = null;
        byte[] byteArray53 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(byteArray46, byteArray53);
        byte[] byteArray59 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(byteArray53, byteArray59);
        byte byte61 = org.apache.commons.lang.math.NumberUtils.max(byteArray53);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(byteArray44, byteArray53);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(byteArray35, byteArray44);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(byteArray12, byteArray35);
        byte byte65 = org.apache.commons.lang.math.NumberUtils.min(byteArray35);
        byte byte66 = org.apache.commons.lang.math.NumberUtils.max(byteArray35);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 100 + "'", byte20 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 10 + "'", byte26 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) 10 + "'", byte36 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 10 + "'", byte37 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) -1 + "'", byte38 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) -1 + "'", byte39 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 10 + "'", byte45 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + byte61 + "' != '" + (byte) 100 + "'", byte61 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + byte65 + "' != '" + (byte) -1 + "'", byte65 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte66 + "' != '" + (byte) 10 + "'", byte66 == (byte) 10);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.max(intArray4);
        int int12 = org.apache.commons.lang.math.NumberUtils.max(intArray4);
        int[] intArray19 = new int[] { 100, 'a', (byte) -1, 32, '#', (byte) -1 };
        int[] intArray25 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int26 = org.apache.commons.lang.math.NumberUtils.max(intArray25);
        int int27 = org.apache.commons.lang.math.NumberUtils.max(intArray25);
        int int28 = org.apache.commons.lang.math.NumberUtils.max(intArray25);
        int[] intArray33 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray38 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray38);
        int int40 = org.apache.commons.lang.math.NumberUtils.min(intArray38);
        int int41 = org.apache.commons.lang.math.NumberUtils.min(intArray38);
        int int42 = org.apache.commons.lang.math.NumberUtils.max(intArray38);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(intArray25, intArray38);
        int int44 = org.apache.commons.lang.math.NumberUtils.min(intArray38);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(intArray19, intArray38);
        int[] intArray50 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray55 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(intArray50, intArray55);
        int[] intArray61 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray66 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(intArray61, intArray66);
        int int68 = org.apache.commons.lang.math.NumberUtils.min(intArray66);
        int int69 = org.apache.commons.lang.math.NumberUtils.min(intArray66);
        int[] intArray74 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray79 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(intArray74, intArray79);
        int int81 = org.apache.commons.lang.math.NumberUtils.max(intArray79);
        int int82 = org.apache.commons.lang.math.NumberUtils.min(intArray79);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(intArray66, intArray79);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(intArray50, intArray66);
        int int85 = org.apache.commons.lang.math.NumberUtils.min(intArray66);
        int int86 = org.apache.commons.lang.math.NumberUtils.min(intArray66);
        int int87 = org.apache.commons.lang.math.NumberUtils.min(intArray66);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(intArray19, intArray66);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray66);
        int int90 = org.apache.commons.lang.math.NumberUtils.min(intArray66);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 97, -1, 32, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 100 + "'", int81 == 100);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) -1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int int12 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int[] intArray17 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray22 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray22);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray17);
        int int25 = org.apache.commons.lang.math.NumberUtils.min(intArray17);
        int int26 = org.apache.commons.lang.math.NumberUtils.max(intArray17);
        int int27 = org.apache.commons.lang.math.NumberUtils.max(intArray17);
        int int28 = org.apache.commons.lang.math.NumberUtils.max(intArray17);
        int[] intArray34 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int35 = org.apache.commons.lang.math.NumberUtils.max(intArray34);
        int int36 = org.apache.commons.lang.math.NumberUtils.min(intArray34);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray34);
        int int38 = org.apache.commons.lang.math.NumberUtils.min(intArray34);
        int int39 = org.apache.commons.lang.math.NumberUtils.max(intArray34);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) 0, (float) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 52.0f, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) 10, (double) (-1.0f), (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray16 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray21 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray16);
        int int24 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int[] intArray30 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int31 = org.apache.commons.lang.math.NumberUtils.max(intArray30);
        int int32 = org.apache.commons.lang.math.NumberUtils.max(intArray30);
        int int33 = org.apache.commons.lang.math.NumberUtils.max(intArray30);
        int int34 = org.apache.commons.lang.math.NumberUtils.max(intArray30);
        int int35 = org.apache.commons.lang.math.NumberUtils.max(intArray30);
        int int36 = org.apache.commons.lang.math.NumberUtils.max(intArray30);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray30);
        int[] intArray42 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray47 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(intArray42, intArray47);
        int int49 = org.apache.commons.lang.math.NumberUtils.min(intArray47);
        int[] intArray54 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray59 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(intArray54, intArray59);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(intArray47, intArray54);
        int[] intArray67 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int68 = org.apache.commons.lang.math.NumberUtils.max(intArray67);
        int int69 = org.apache.commons.lang.math.NumberUtils.min(intArray67);
        int[] intArray74 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray79 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(intArray74, intArray79);
        int int81 = org.apache.commons.lang.math.NumberUtils.min(intArray79);
        int[] intArray86 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray91 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(intArray86, intArray91);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(intArray79, intArray86);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(intArray67, intArray86);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(intArray54, intArray86);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(intArray30, intArray86);
        int int97 = org.apache.commons.lang.math.NumberUtils.max(intArray30);
        int int98 = org.apache.commons.lang.math.NumberUtils.min(intArray30);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 100 + "'", int68 == 100);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 100 + "'", int97 == 100);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(97.0f, 97.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int int12 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int[] intArray17 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray22 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray22);
        int int24 = org.apache.commons.lang.math.NumberUtils.min(intArray22);
        int int25 = org.apache.commons.lang.math.NumberUtils.min(intArray22);
        int[] intArray30 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray35 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(intArray30, intArray35);
        int int37 = org.apache.commons.lang.math.NumberUtils.max(intArray35);
        int int38 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(intArray22, intArray35);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray22);
        int int41 = org.apache.commons.lang.math.NumberUtils.min(intArray22);
        int int42 = org.apache.commons.lang.math.NumberUtils.min(intArray22);
        java.lang.Class<?> wildcardClass43 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        int[] intArray5 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int6 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int int8 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int[] intArray13 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray18 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray18);
        int int20 = org.apache.commons.lang.math.NumberUtils.min(intArray18);
        int int21 = org.apache.commons.lang.math.NumberUtils.min(intArray18);
        int[] intArray26 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray31 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(intArray26, intArray31);
        int int33 = org.apache.commons.lang.math.NumberUtils.max(intArray31);
        int int34 = org.apache.commons.lang.math.NumberUtils.min(intArray31);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray31);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(intArray5, intArray18);
        int int37 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int int38 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        long[] longArray3 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray4 = new long[] {};
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long7 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long8 = org.apache.commons.lang.math.NumberUtils.min(longArray3);
        long long9 = org.apache.commons.lang.math.NumberUtils.min(longArray3);
        long long10 = org.apache.commons.lang.math.NumberUtils.min(longArray3);
        long[] longArray14 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray15 = new long[] {};
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(longArray14, longArray15);
        long long17 = org.apache.commons.lang.math.NumberUtils.max(longArray14);
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray14);
        long long19 = org.apache.commons.lang.math.NumberUtils.min(longArray14);
        long long20 = org.apache.commons.lang.math.NumberUtils.min(longArray14);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray14);
        long[] longArray22 = new long[] {};
        long[] longArray24 = new long[] { (byte) -1 };
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(longArray22, longArray24);
        long long26 = org.apache.commons.lang.math.NumberUtils.max(longArray24);
        long long27 = org.apache.commons.lang.math.NumberUtils.max(longArray24);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray24);
        long long29 = org.apache.commons.lang.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 52L + "'", long18 == 52L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        int int12 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        int[] intArray17 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray22 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray22);
        int int24 = org.apache.commons.lang.math.NumberUtils.max(intArray22);
        int int25 = org.apache.commons.lang.math.NumberUtils.max(intArray22);
        int[] intArray30 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray35 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(intArray30, intArray35);
        int int37 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        int int38 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        int[] intArray43 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray48 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(intArray43, intArray48);
        int int50 = org.apache.commons.lang.math.NumberUtils.max(intArray48);
        int int51 = org.apache.commons.lang.math.NumberUtils.min(intArray48);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray48);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(intArray22, intArray35);
        int[] intArray54 = null;
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(intArray22, intArray54);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray22);
        int int57 = org.apache.commons.lang.math.NumberUtils.max(intArray22);
        int[] intArray58 = null;
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(intArray22, intArray58);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 100, 52.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(0L, (long) 1, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) 1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) 10, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float[] floatArray10 = new float[] { (short) 0, (byte) 0, (byte) 100 };
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray10);
        float[] floatArray16 = new float[] { 0, 1.0f, 100 };
        float[] floatArray18 = new float[] { (-1L) };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(floatArray16, floatArray18);
        float[] floatArray23 = new float[] { 0, 1.0f, 100 };
        float[] floatArray25 = new float[] { (-1L) };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(floatArray23, floatArray25);
        float float27 = org.apache.commons.lang.math.NumberUtils.max(floatArray23);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(floatArray16, floatArray23);
        float float29 = org.apache.commons.lang.math.NumberUtils.max(floatArray16);
        float[] floatArray30 = new float[] {};
        float[] floatArray34 = new float[] { 0, 1.0f, 100 };
        float[] floatArray36 = new float[] { (-1L) };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(floatArray34, floatArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(floatArray30, floatArray34);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(floatArray16, floatArray34);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray16);
        java.lang.Class<?> wildcardClass41 = floatArray16.getClass();
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 100, (short) 1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 10, 100L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(100, 32, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 1, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 100, 32L, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (-1L), (float) 1, (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) '4', (double) 32L, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 32, 100.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        long[] longArray3 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray4 = new long[] {};
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long7 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long8 = org.apache.commons.lang.math.NumberUtils.min(longArray3);
        long long9 = org.apache.commons.lang.math.NumberUtils.min(longArray3);
        long long10 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long[] longArray11 = new long[] {};
        long[] longArray13 = new long[] { (byte) -1 };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray13);
        long long15 = org.apache.commons.lang.math.NumberUtils.max(longArray13);
        long[] longArray18 = new long[] { 52L, (short) 1 };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray18);
        long[] longArray20 = new long[] {};
        long[] longArray22 = new long[] { (byte) -1 };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(longArray20, longArray22);
        long[] longArray24 = new long[] {};
        long[] longArray26 = new long[] { (byte) -1 };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(longArray24, longArray26);
        long long28 = org.apache.commons.lang.math.NumberUtils.max(longArray26);
        long long29 = org.apache.commons.lang.math.NumberUtils.max(longArray26);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(longArray22, longArray26);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray26);
        long long32 = org.apache.commons.lang.math.NumberUtils.max(longArray26);
        long[] longArray36 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray37 = new long[] {};
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(longArray36, longArray37);
        long long39 = org.apache.commons.lang.math.NumberUtils.max(longArray36);
        long long40 = org.apache.commons.lang.math.NumberUtils.max(longArray36);
        long long41 = org.apache.commons.lang.math.NumberUtils.max(longArray36);
        long[] longArray42 = new long[] {};
        long[] longArray44 = new long[] { (byte) -1 };
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(longArray42, longArray44);
        long long46 = org.apache.commons.lang.math.NumberUtils.max(longArray44);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(longArray36, longArray44);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(longArray26, longArray36);
        long long49 = org.apache.commons.lang.math.NumberUtils.min(longArray36);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray36);
        long long51 = org.apache.commons.lang.math.NumberUtils.min(longArray36);
        long[] longArray52 = null;
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(longArray36, longArray52);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 52L + "'", long39 == 52L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 52L + "'", long40 == 52L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 52L + "'", long41 == 52L);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[]");
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float[] floatArray10 = new float[] { 0, 1.0f, 100 };
        float[] floatArray12 = new float[] { (-1L) };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray12);
        float float14 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray10);
        float float16 = org.apache.commons.lang.math.NumberUtils.max(floatArray3);
        float float17 = org.apache.commons.lang.math.NumberUtils.min(floatArray3);
        java.lang.Class<?> wildcardClass18 = floatArray3.getClass();
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (-1), (float) (short) 0, (float) '4');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double[] doubleArray10 = new double[] { 100L, 1.0f };
        double[] doubleArray14 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray10);
        double[] doubleArray19 = new double[] { 100L, 1.0f };
        double[] doubleArray23 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray19, doubleArray23);
        double[] doubleArray27 = new double[] { 100L, 1.0f };
        double[] doubleArray31 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray23, doubleArray27);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray27);
        double[] doubleArray37 = new double[] { 100L, 1.0f };
        double[] doubleArray41 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray41);
        double[] doubleArray45 = new double[] { 100L, 1.0f };
        double[] doubleArray49 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray45, doubleArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray45);
        double[] doubleArray54 = new double[] { 100L, 1.0f };
        double[] doubleArray58 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray54, doubleArray58);
        double[] doubleArray62 = new double[] { 100L, 1.0f };
        double[] doubleArray66 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray62, doubleArray66);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray58, doubleArray62);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray62);
        double double70 = org.apache.commons.lang.math.NumberUtils.min(doubleArray62);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray62);
        double[] doubleArray74 = new double[] { (-1.0f), 100L };
        double double75 = org.apache.commons.lang.math.NumberUtils.min(doubleArray74);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray62, doubleArray74);
        java.lang.Class<?> wildcardClass77 = doubleArray62.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 1.0d + "'", double70 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[-1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-1.0d) + "'", double75 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) ' ', 97L, 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        long[] longArray3 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray4 = new long[] {};
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long7 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long8 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long9 = org.apache.commons.lang.math.NumberUtils.min(longArray3);
        long long10 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long11 = org.apache.commons.lang.math.NumberUtils.min(longArray3);
        long[] longArray12 = new long[] {};
        long[] longArray14 = new long[] { (byte) -1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(longArray12, longArray14);
        long long16 = org.apache.commons.lang.math.NumberUtils.max(longArray14);
        long[] longArray19 = new long[] { 52L, (short) 1 };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray14, longArray19);
        long long21 = org.apache.commons.lang.math.NumberUtils.max(longArray19);
        long long22 = org.apache.commons.lang.math.NumberUtils.max(longArray19);
        long long23 = org.apache.commons.lang.math.NumberUtils.max(longArray19);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray19);
        long[] longArray25 = new long[] {};
        long[] longArray27 = new long[] { (byte) -1 };
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray25, longArray27);
        long long29 = org.apache.commons.lang.math.NumberUtils.max(longArray27);
        long[] longArray32 = new long[] { 52L, (short) 1 };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(longArray27, longArray32);
        long long34 = org.apache.commons.lang.math.NumberUtils.max(longArray32);
        long long35 = org.apache.commons.lang.math.NumberUtils.max(longArray32);
        long long36 = org.apache.commons.lang.math.NumberUtils.max(longArray32);
        long[] longArray37 = new long[] {};
        long[] longArray39 = new long[] { (byte) -1 };
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(longArray37, longArray39);
        long long41 = org.apache.commons.lang.math.NumberUtils.max(longArray39);
        long[] longArray44 = new long[] { 52L, (short) 1 };
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(longArray39, longArray44);
        long[] longArray46 = new long[] {};
        long[] longArray48 = new long[] { (byte) -1 };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(longArray46, longArray48);
        long[] longArray50 = new long[] {};
        long[] longArray52 = new long[] { (byte) -1 };
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(longArray50, longArray52);
        long long54 = org.apache.commons.lang.math.NumberUtils.max(longArray52);
        long long55 = org.apache.commons.lang.math.NumberUtils.max(longArray52);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(longArray48, longArray52);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(longArray39, longArray52);
        long long58 = org.apache.commons.lang.math.NumberUtils.max(longArray52);
        long[] longArray62 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray63 = new long[] {};
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(longArray62, longArray63);
        long long65 = org.apache.commons.lang.math.NumberUtils.max(longArray62);
        long long66 = org.apache.commons.lang.math.NumberUtils.max(longArray62);
        long long67 = org.apache.commons.lang.math.NumberUtils.max(longArray62);
        long[] longArray68 = new long[] {};
        long[] longArray70 = new long[] { (byte) -1 };
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(longArray68, longArray70);
        long long72 = org.apache.commons.lang.math.NumberUtils.max(longArray70);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(longArray62, longArray70);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(longArray52, longArray62);
        long long75 = org.apache.commons.lang.math.NumberUtils.min(longArray62);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(longArray32, longArray62);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(longArray19, longArray32);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 52L + "'", long22 == 52L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 52L + "'", long23 == 52L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 52L + "'", long34 == 52L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 52L + "'", long35 == 52L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 52L + "'", long36 == 52L);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 52L + "'", long65 == 52L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 52L + "'", long66 == 52L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 52L + "'", long67 == 52L);
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[]");
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-1L) + "'", long72 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + (-1L) + "'", long75 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 0, (double) 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 100L, (float) '4', (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        long[] longArray0 = new long[] {};
        long[] longArray2 = new long[] { (byte) -1 };
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray2);
        long long4 = org.apache.commons.lang.math.NumberUtils.max(longArray2);
        long[] longArray7 = new long[] { 52L, (short) 1 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray7);
        long[] longArray9 = new long[] {};
        long[] longArray11 = new long[] { (byte) -1 };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(longArray9, longArray11);
        long[] longArray13 = new long[] {};
        long[] longArray15 = new long[] { (byte) -1 };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray15);
        long long17 = org.apache.commons.lang.math.NumberUtils.max(longArray15);
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray15);
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray15);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray15);
        long[] longArray24 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray25 = new long[] {};
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(longArray24, longArray25);
        long long27 = org.apache.commons.lang.math.NumberUtils.min(longArray24);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray24);
        long long29 = org.apache.commons.lang.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) '4', (float) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int[] intArray15 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray20 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray15, intArray20);
        int int22 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
        int int23 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
        int[] intArray28 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray33 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(intArray28, intArray33);
        int int35 = org.apache.commons.lang.math.NumberUtils.max(intArray33);
        int int36 = org.apache.commons.lang.math.NumberUtils.min(intArray33);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(intArray20, intArray33);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray20);
        int int39 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
        int[] intArray40 = null;
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(intArray20, intArray40);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 100, (double) (byte) 10, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        float[] floatArray0 = new float[] {};
        float[] floatArray4 = new float[] { 0, 1.0f, 100 };
        float[] floatArray6 = new float[] { (-1L) };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray4);
        float float9 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float[] floatArray13 = new float[] { 0, 1.0f, 100 };
        float[] floatArray15 = new float[] { (-1L) };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(floatArray13, floatArray15);
        float float17 = org.apache.commons.lang.math.NumberUtils.min(floatArray15);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray15);
        float[] floatArray19 = new float[] {};
        float[] floatArray23 = new float[] { 0, 1.0f, 100 };
        float[] floatArray25 = new float[] { (-1L) };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(floatArray23, floatArray25);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(floatArray19, floatArray23);
        float[] floatArray31 = new float[] { 0, 1.0f, 100 };
        float[] floatArray33 = new float[] { (-1L) };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(floatArray31, floatArray33);
        float[] floatArray38 = new float[] { 0, ' ', 100.0f };
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(floatArray33, floatArray38);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(floatArray19, floatArray33);
        float[] floatArray44 = new float[] { 0, 1.0f, 100 };
        float[] floatArray46 = new float[] { (-1L) };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(floatArray44, floatArray46);
        float float48 = org.apache.commons.lang.math.NumberUtils.max(floatArray44);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(floatArray33, floatArray44);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(floatArray15, floatArray44);
        float float51 = org.apache.commons.lang.math.NumberUtils.max(floatArray44);
        float float52 = org.apache.commons.lang.math.NumberUtils.max(floatArray44);
        float float53 = org.apache.commons.lang.math.NumberUtils.max(floatArray44);
        float float54 = org.apache.commons.lang.math.NumberUtils.min(floatArray44);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray46), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 100.0f + "'", float48 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 100.0f + "'", float51 == 100.0f);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 100.0f + "'", float52 == 100.0f);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 100.0f + "'", float53 == 100.0f);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 0.0f + "'", float54 == 0.0f);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((-1.0f), (float) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) '#', (float) (byte) 1, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float[] floatArray10 = new float[] { 0, ' ', 100.0f };
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray10);
        float float12 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        float float13 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double[] doubleArray10 = new double[] { 100L, 1.0f };
        double[] doubleArray14 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray10);
        double[] doubleArray19 = new double[] { 100L, 1.0f };
        double[] doubleArray23 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray19, doubleArray23);
        double[] doubleArray27 = new double[] { 100L, 1.0f };
        double[] doubleArray31 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray23, doubleArray27);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray27);
        double[] doubleArray37 = new double[] { 100L, 1.0f };
        double[] doubleArray41 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray41);
        double[] doubleArray45 = new double[] { 100L, 1.0f };
        double[] doubleArray49 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray45, doubleArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray45);
        double[] doubleArray54 = new double[] { 100L, 1.0f };
        double[] doubleArray58 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray54, doubleArray58);
        double[] doubleArray62 = new double[] { 100L, 1.0f };
        double[] doubleArray66 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray62, doubleArray66);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray58, doubleArray62);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray62);
        double double70 = org.apache.commons.lang.math.NumberUtils.min(doubleArray62);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray62);
        double double72 = org.apache.commons.lang.math.NumberUtils.min(doubleArray27);
        double double73 = org.apache.commons.lang.math.NumberUtils.min(doubleArray27);
        double double74 = org.apache.commons.lang.math.NumberUtils.min(doubleArray27);
        double[] doubleArray76 = new double[] { '#' };
        double double77 = org.apache.commons.lang.math.NumberUtils.min(doubleArray76);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray76);
        double double79 = org.apache.commons.lang.math.NumberUtils.min(doubleArray27);
        double double80 = org.apache.commons.lang.math.NumberUtils.min(doubleArray27);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 1.0d + "'", double70 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 1.0d + "'", double73 == 1.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 1.0d + "'", double74 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[35.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 35.0d + "'", double77 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 1.0d + "'", double79 == 1.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 1.0d + "'", double80 == 1.0d);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) '4', (float) 97L, (float) 35);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(10, (int) '4', 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) -1, (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) '4', (double) (-1L), (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte4 = org.apache.commons.lang.math.NumberUtils.max(byteArray3);
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray3, byteArray7);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        byte byte15 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        byte byte16 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte byte17 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray13);
        byte byte19 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte byte20 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -1 + "'", byte17 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray13);
        byte byte16 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte21 = org.apache.commons.lang.math.NumberUtils.max(byteArray20);
        byte[] byteArray22 = null;
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(byteArray22, byteArray29);
        byte[] byteArray35 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(byteArray29, byteArray35);
        byte byte37 = org.apache.commons.lang.math.NumberUtils.max(byteArray29);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(byteArray20, byteArray29);
        byte byte39 = org.apache.commons.lang.math.NumberUtils.max(byteArray29);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray29);
        byte[] byteArray44 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte45 = org.apache.commons.lang.math.NumberUtils.max(byteArray44);
        byte[] byteArray48 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(byteArray44, byteArray48);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(byteArray29, byteArray48);
        byte[] byteArray54 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte55 = org.apache.commons.lang.math.NumberUtils.max(byteArray54);
        byte[] byteArray58 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(byteArray54, byteArray58);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(byteArray48, byteArray54);
        byte byte61 = org.apache.commons.lang.math.NumberUtils.max(byteArray48);
        byte byte62 = org.apache.commons.lang.math.NumberUtils.min(byteArray48);
        byte byte63 = org.apache.commons.lang.math.NumberUtils.min(byteArray48);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 100 + "'", byte16 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 10 + "'", byte21 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 100 + "'", byte37 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 100 + "'", byte39 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 10 + "'", byte45 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte55 + "' != '" + (byte) 10 + "'", byte55 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + byte61 + "' != '" + (byte) 100 + "'", byte61 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte62 + "' != '" + (byte) 0 + "'", byte62 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte63 + "' != '" + (byte) 0 + "'", byte63 == (byte) 0);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(35.0d, (double) 0.0f, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) 100, (double) (byte) -1, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        long[] longArray4 = new long[] { 0L, 35, 32L, '#' };
        long[] longArray8 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray9 = new long[] {};
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray9);
        long long11 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long long12 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long long13 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long long14 = org.apache.commons.lang.math.NumberUtils.min(longArray8);
        long[] longArray18 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray19 = new long[] {};
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray19);
        long long21 = org.apache.commons.lang.math.NumberUtils.max(longArray18);
        long long22 = org.apache.commons.lang.math.NumberUtils.max(longArray18);
        long long23 = org.apache.commons.lang.math.NumberUtils.min(longArray18);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray18);
        long[] longArray28 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray29 = new long[] {};
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(longArray28, longArray29);
        long long31 = org.apache.commons.lang.math.NumberUtils.max(longArray28);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray28);
        long[] longArray36 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray37 = new long[] {};
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(longArray36, longArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray28, longArray36);
        long long40 = org.apache.commons.lang.math.NumberUtils.min(longArray28);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray28);
        long[] longArray42 = new long[] {};
        long[] longArray44 = new long[] { (byte) -1 };
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(longArray42, longArray44);
        long long46 = org.apache.commons.lang.math.NumberUtils.max(longArray44);
        long[] longArray51 = new long[] { 0, (short) 1, 52, (byte) 1 };
        long long52 = org.apache.commons.lang.math.NumberUtils.max(longArray51);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(longArray44, longArray51);
        long long54 = org.apache.commons.lang.math.NumberUtils.min(longArray51);
        long[] longArray55 = new long[] {};
        long[] longArray57 = new long[] { (byte) -1 };
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(longArray55, longArray57);
        long long59 = org.apache.commons.lang.math.NumberUtils.max(longArray57);
        long[] longArray62 = new long[] { 52L, (short) 1 };
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(longArray57, longArray62);
        long long64 = org.apache.commons.lang.math.NumberUtils.max(longArray62);
        long long65 = org.apache.commons.lang.math.NumberUtils.max(longArray62);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(longArray51, longArray62);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray62);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[0, 35, 32, 35]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 52L + "'", long22 == 52L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 52L + "'", long31 == 52L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[]");
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[0, 1, 52, 1]");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 52L + "'", long52 == 52L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 52L + "'", long64 == 52L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 52L + "'", long65 == 52L);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 0, 10.0f, (float) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) -1, 10.0d, (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        float[] floatArray0 = null;
        float[] floatArray1 = new float[] {};
        float[] floatArray5 = new float[] { 0, 1.0f, 100 };
        float[] floatArray7 = new float[] { (-1L) };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray7);
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray5);
        float float10 = org.apache.commons.lang.math.NumberUtils.max(floatArray5);
        float[] floatArray14 = new float[] { 0, 1.0f, 100 };
        float[] floatArray16 = new float[] { (-1L) };
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray16);
        float float18 = org.apache.commons.lang.math.NumberUtils.min(floatArray16);
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray16);
        float[] floatArray20 = new float[] {};
        float[] floatArray24 = new float[] { 0, 1.0f, 100 };
        float[] floatArray26 = new float[] { (-1L) };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(floatArray24, floatArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(floatArray20, floatArray24);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(floatArray16, floatArray24);
        float float30 = org.apache.commons.lang.math.NumberUtils.max(floatArray16);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray16);
        float[] floatArray35 = new float[] { 0, 1.0f, 100 };
        float[] floatArray37 = new float[] { (-1L) };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(floatArray35, floatArray37);
        float[] floatArray42 = new float[] { (short) 0, (byte) 0, (byte) 100 };
        float float43 = org.apache.commons.lang.math.NumberUtils.min(floatArray42);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(floatArray35, floatArray42);
        float[] floatArray48 = new float[] { 0, 1.0f, 100 };
        float[] floatArray50 = new float[] { (-1L) };
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(floatArray48, floatArray50);
        float[] floatArray55 = new float[] { 0, 1.0f, 100 };
        float[] floatArray57 = new float[] { (-1L) };
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(floatArray55, floatArray57);
        float float59 = org.apache.commons.lang.math.NumberUtils.max(floatArray55);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(floatArray48, floatArray55);
        float float61 = org.apache.commons.lang.math.NumberUtils.max(floatArray48);
        float[] floatArray62 = new float[] {};
        float[] floatArray66 = new float[] { 0, 1.0f, 100 };
        float[] floatArray68 = new float[] { (-1L) };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(floatArray66, floatArray68);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(floatArray62, floatArray66);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(floatArray48, floatArray66);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(floatArray35, floatArray48);
        float float73 = org.apache.commons.lang.math.NumberUtils.max(floatArray35);
        float float74 = org.apache.commons.lang.math.NumberUtils.min(floatArray35);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray35);
        float float76 = org.apache.commons.lang.math.NumberUtils.max(floatArray35);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-1.0f) + "'", float30 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray42), "[0.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.0f + "'", float43 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(floatArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray48), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray50), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray55), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray57), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 100.0f + "'", float59 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 100.0f + "'", float61 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray62), "[]");
        org.junit.Assert.assertNotNull(floatArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray66), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray68), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + float73 + "' != '" + 100.0f + "'", float73 == 100.0f);
        org.junit.Assert.assertTrue("'" + float74 + "' != '" + 0.0f + "'", float74 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + float76 + "' != '" + 100.0f + "'", float76 == 100.0f);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 52.0f, (double) (byte) 10, (double) 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 1, (long) (byte) 100, (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        int[] intArray5 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int6 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int int8 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int[] intArray13 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray18 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray18);
        int int20 = org.apache.commons.lang.math.NumberUtils.min(intArray18);
        int int21 = org.apache.commons.lang.math.NumberUtils.min(intArray18);
        int[] intArray26 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray31 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(intArray26, intArray31);
        int int33 = org.apache.commons.lang.math.NumberUtils.max(intArray31);
        int int34 = org.apache.commons.lang.math.NumberUtils.min(intArray31);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray31);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(intArray5, intArray18);
        int[] intArray41 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray46 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(intArray41, intArray46);
        int int48 = org.apache.commons.lang.math.NumberUtils.min(intArray46);
        int[] intArray53 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray58 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(intArray53, intArray58);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(intArray46, intArray53);
        int[] intArray61 = null;
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(intArray53, intArray61);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray53);
        int int64 = org.apache.commons.lang.math.NumberUtils.min(intArray18);
        int int65 = org.apache.commons.lang.math.NumberUtils.max(intArray18);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 100, (int) 'a', 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 1, 10L, (long) 52);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double double8 = org.apache.commons.lang.math.NumberUtils.max(doubleArray2);
        double[] doubleArray11 = new double[] { 100L, 1.0f };
        double[] doubleArray15 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray15);
        double[] doubleArray19 = new double[] { 100L, 1.0f };
        double[] doubleArray23 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray19, doubleArray23);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray19);
        double[] doubleArray28 = new double[] { 100L, 1.0f };
        double[] doubleArray32 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray28, doubleArray32);
        double[] doubleArray36 = new double[] { 100L, 1.0f };
        double[] doubleArray40 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray36, doubleArray40);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray32, doubleArray36);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray36);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray11);
        double double45 = org.apache.commons.lang.math.NumberUtils.min(doubleArray11);
        double double46 = org.apache.commons.lang.math.NumberUtils.min(doubleArray11);
        double double47 = org.apache.commons.lang.math.NumberUtils.max(doubleArray11);
        double double48 = org.apache.commons.lang.math.NumberUtils.max(doubleArray11);
        double double49 = org.apache.commons.lang.math.NumberUtils.max(doubleArray11);
        java.lang.Class<?> wildcardClass50 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(100, 97, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        long[] longArray0 = new long[] {};
        long[] longArray2 = new long[] { (byte) -1 };
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray2);
        long[] longArray4 = new long[] {};
        long[] longArray6 = new long[] { (byte) -1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray6);
        long long8 = org.apache.commons.lang.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray6);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray6);
        long[] longArray14 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray15 = new long[] {};
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(longArray14, longArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(longArray6, longArray14);
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray6);
        long[] longArray22 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray23 = new long[] {};
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(longArray22, longArray23);
        long long25 = org.apache.commons.lang.math.NumberUtils.max(longArray22);
        long long26 = org.apache.commons.lang.math.NumberUtils.max(longArray22);
        long long27 = org.apache.commons.lang.math.NumberUtils.max(longArray22);
        long long28 = org.apache.commons.lang.math.NumberUtils.min(longArray22);
        long[] longArray32 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray33 = new long[] {};
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(longArray32, longArray33);
        long long35 = org.apache.commons.lang.math.NumberUtils.max(longArray32);
        long long36 = org.apache.commons.lang.math.NumberUtils.max(longArray32);
        long long37 = org.apache.commons.lang.math.NumberUtils.min(longArray32);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(longArray22, longArray32);
        long[] longArray42 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray43 = new long[] {};
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(longArray42, longArray43);
        long long45 = org.apache.commons.lang.math.NumberUtils.max(longArray42);
        long long46 = org.apache.commons.lang.math.NumberUtils.max(longArray42);
        long long47 = org.apache.commons.lang.math.NumberUtils.max(longArray42);
        long long48 = org.apache.commons.lang.math.NumberUtils.min(longArray42);
        long[] longArray52 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray53 = new long[] {};
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(longArray52, longArray53);
        long long55 = org.apache.commons.lang.math.NumberUtils.max(longArray52);
        long long56 = org.apache.commons.lang.math.NumberUtils.max(longArray52);
        long long57 = org.apache.commons.lang.math.NumberUtils.min(longArray52);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(longArray42, longArray52);
        long[] longArray62 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray63 = new long[] {};
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(longArray62, longArray63);
        long long65 = org.apache.commons.lang.math.NumberUtils.max(longArray62);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(longArray52, longArray62);
        long long67 = org.apache.commons.lang.math.NumberUtils.max(longArray52);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(longArray32, longArray52);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(longArray6, longArray32);
        long long70 = org.apache.commons.lang.math.NumberUtils.max(longArray32);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 52L + "'", long25 == 52L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 52L + "'", long26 == 52L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 52L + "'", long35 == 52L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 52L + "'", long36 == 52L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 52L + "'", long45 == 52L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 52L + "'", long46 == 52L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 52L + "'", long47 == 52L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 52L + "'", long55 == 52L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 52L + "'", long56 == 52L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L) + "'", long57 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 52L + "'", long65 == 52L);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 52L + "'", long67 == 52L);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 52L + "'", long70 == 52L);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (-1L), (double) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray17 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int18 = org.apache.commons.lang.math.NumberUtils.max(intArray17);
        int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray17);
        int int20 = org.apache.commons.lang.math.NumberUtils.max(intArray17);
        int[] intArray25 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray30 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(intArray25, intArray30);
        int int32 = org.apache.commons.lang.math.NumberUtils.min(intArray30);
        int int33 = org.apache.commons.lang.math.NumberUtils.min(intArray30);
        int int34 = org.apache.commons.lang.math.NumberUtils.max(intArray30);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray30);
        int int36 = org.apache.commons.lang.math.NumberUtils.max(intArray17);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray17);
        int[] intArray38 = null;
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray38);
        int[] intArray44 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray49 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(intArray44, intArray49);
        int int51 = org.apache.commons.lang.math.NumberUtils.max(intArray49);
        int int52 = org.apache.commons.lang.math.NumberUtils.min(intArray49);
        int int53 = org.apache.commons.lang.math.NumberUtils.max(intArray49);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(intArray38, intArray49);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double[] doubleArray10 = new double[] { 100L, 1.0f };
        double[] doubleArray14 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray10);
        double[] doubleArray19 = new double[] { 100L, 1.0f };
        double[] doubleArray23 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray19, doubleArray23);
        double[] doubleArray27 = new double[] { 100L, 1.0f };
        double[] doubleArray31 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray23, doubleArray27);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray27);
        double[] doubleArray37 = new double[] { 100L, 1.0f };
        double[] doubleArray41 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray41);
        double[] doubleArray45 = new double[] { 100L, 1.0f };
        double[] doubleArray49 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray45, doubleArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray45);
        double[] doubleArray54 = new double[] { 100L, 1.0f };
        double[] doubleArray58 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray54, doubleArray58);
        double[] doubleArray62 = new double[] { 100L, 1.0f };
        double[] doubleArray66 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray62, doubleArray66);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray58, doubleArray62);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray62);
        double double70 = org.apache.commons.lang.math.NumberUtils.min(doubleArray62);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray62);
        double double72 = org.apache.commons.lang.math.NumberUtils.min(doubleArray62);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 1.0d + "'", double70 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) (byte) 100, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 1, 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (-1L), (double) 100.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) (byte) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double[] doubleArray10 = new double[] { 100L, 1.0f };
        double[] doubleArray14 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray6, doubleArray10);
        double[] doubleArray19 = new double[] { 100L, 1.0f };
        double[] doubleArray23 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray19, doubleArray23);
        double[] doubleArray27 = new double[] { 100L, 1.0f };
        double[] doubleArray31 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray19, doubleArray27);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray27);
        double[] doubleArray37 = new double[] { 100L, 1.0f };
        double[] doubleArray41 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray41);
        double[] doubleArray45 = new double[] { 100L, 1.0f };
        double[] doubleArray49 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray45, doubleArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray45);
        double[] doubleArray54 = new double[] { 100L, 1.0f };
        double[] doubleArray58 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray54, doubleArray58);
        double[] doubleArray62 = new double[] { 100L, 1.0f };
        double[] doubleArray66 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray62, doubleArray66);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray58, doubleArray62);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray62);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray37);
        double double71 = org.apache.commons.lang.math.NumberUtils.max(doubleArray27);
        double double72 = org.apache.commons.lang.math.NumberUtils.max(doubleArray27);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 100.0d + "'", double71 == 100.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 100.0d + "'", double72 == 100.0d);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (-1), 97.0d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) -1, 100L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(32.0f, 100.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        long[] longArray0 = new long[] {};
        long[] longArray2 = new long[] { (byte) -1 };
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray2);
        long[] longArray4 = new long[] {};
        long[] longArray6 = new long[] { (byte) -1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray6);
        long long8 = org.apache.commons.lang.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray6);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray6);
        long[] longArray14 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray15 = new long[] {};
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(longArray14, longArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(longArray6, longArray14);
        long[] longArray18 = new long[] {};
        long[] longArray20 = new long[] { (byte) -1 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray20);
        long long22 = org.apache.commons.lang.math.NumberUtils.max(longArray20);
        long[] longArray27 = new long[] { 0, (short) 1, 52, (byte) 1 };
        long long28 = org.apache.commons.lang.math.NumberUtils.max(longArray27);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray20, longArray27);
        long long30 = org.apache.commons.lang.math.NumberUtils.min(longArray20);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(longArray6, longArray20);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[0, 1, 52, 1]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 52L + "'", long28 == 52L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double[] doubleArray10 = new double[] { 100L, 1.0f };
        double[] doubleArray14 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray10);
        double[] doubleArray19 = new double[] { 100L, 1.0f };
        double[] doubleArray23 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray19, doubleArray23);
        double[] doubleArray27 = new double[] { 100L, 1.0f };
        double[] doubleArray31 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray23, doubleArray27);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray27);
        double[] doubleArray37 = new double[] { 100L, 1.0f };
        double[] doubleArray41 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray41);
        double[] doubleArray45 = new double[] { 100L, 1.0f };
        double[] doubleArray49 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray45, doubleArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray45);
        double[] doubleArray54 = new double[] { 100L, 1.0f };
        double[] doubleArray58 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray54, doubleArray58);
        double[] doubleArray62 = new double[] { 100L, 1.0f };
        double[] doubleArray66 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray62, doubleArray66);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray58, doubleArray62);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray62);
        double double70 = org.apache.commons.lang.math.NumberUtils.min(doubleArray62);
        double[] doubleArray73 = new double[] { 100L, 1.0f };
        double[] doubleArray77 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray73, doubleArray77);
        double double79 = org.apache.commons.lang.math.NumberUtils.max(doubleArray73);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray62, doubleArray73);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray62);
        double[] doubleArray84 = new double[] { (-1.0f), 100L };
        double double85 = org.apache.commons.lang.math.NumberUtils.min(doubleArray84);
        double double86 = org.apache.commons.lang.math.NumberUtils.max(doubleArray84);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray84);
        double[] doubleArray88 = null;
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray88);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 1.0d + "'", double70 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 100.0d + "'", double79 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-1.0d) + "'", double85 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 100.0d + "'", double86 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        int[] intArray5 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int6 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray5);
        int[] intArray12 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray17 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(intArray12, intArray17);
        int int19 = org.apache.commons.lang.math.NumberUtils.min(intArray17);
        int[] intArray24 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray29 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(intArray24, intArray29);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray24);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(intArray5, intArray24);
        int int33 = org.apache.commons.lang.math.NumberUtils.min(intArray24);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 97L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(32L, (long) 'a', (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        short[] shortArray2 = new short[] { (short) -1, (short) -1 };
        short short3 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
        short[] shortArray7 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short8 = org.apache.commons.lang.math.NumberUtils.max(shortArray7);
        short[] shortArray12 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray7, shortArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray7);
        short[] shortArray16 = new short[] { (short) 100 };
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray16);
        short short18 = org.apache.commons.lang.math.NumberUtils.min(shortArray16);
        short short19 = org.apache.commons.lang.math.NumberUtils.max(shortArray16);
        short[] shortArray23 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short24 = org.apache.commons.lang.math.NumberUtils.max(shortArray23);
        short[] shortArray28 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(shortArray23, shortArray28);
        short[] shortArray32 = new short[] { (short) -1, (short) -1 };
        short short33 = org.apache.commons.lang.math.NumberUtils.min(shortArray32);
        short[] shortArray37 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short38 = org.apache.commons.lang.math.NumberUtils.max(shortArray37);
        short[] shortArray42 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(shortArray37, shortArray42);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(shortArray32, shortArray37);
        short[] shortArray46 = new short[] { (short) 100 };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(shortArray32, shortArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(shortArray23, shortArray46);
        short[] shortArray50 = new short[] { (byte) 1 };
        short short51 = org.apache.commons.lang.math.NumberUtils.min(shortArray50);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(shortArray46, shortArray50);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(shortArray16, shortArray50);
        short short54 = org.apache.commons.lang.math.NumberUtils.min(shortArray16);
        short[] shortArray58 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short59 = org.apache.commons.lang.math.NumberUtils.max(shortArray58);
        short[] shortArray63 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(shortArray58, shortArray63);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(shortArray16, shortArray58);
        short short66 = org.apache.commons.lang.math.NumberUtils.max(shortArray16);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 100 + "'", short18 == (short) 100);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 10 + "'", short24 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) -1 + "'", short33 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) 10 + "'", short38 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[100]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[1]");
        org.junit.Assert.assertTrue("'" + short51 + "' != '" + (short) 1 + "'", short51 == (short) 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + short54 + "' != '" + (short) 100 + "'", short54 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray58), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short59 + "' != '" + (short) 10 + "'", short59 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray63), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + short66 + "' != '" + (short) 100 + "'", short66 == (short) 100);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        long[] longArray0 = new long[] {};
        long[] longArray2 = new long[] { (byte) -1 };
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray2);
        long long4 = org.apache.commons.lang.math.NumberUtils.max(longArray2);
        long[] longArray7 = new long[] { 52L, (short) 1 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray7);
        long[] longArray9 = new long[] {};
        long[] longArray11 = new long[] { (byte) -1 };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(longArray9, longArray11);
        long[] longArray13 = new long[] {};
        long[] longArray15 = new long[] { (byte) -1 };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray15);
        long long17 = org.apache.commons.lang.math.NumberUtils.max(longArray15);
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray15);
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray15);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray15);
        long long21 = org.apache.commons.lang.math.NumberUtils.max(longArray15);
        long[] longArray25 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray26 = new long[] {};
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(longArray25, longArray26);
        long long28 = org.apache.commons.lang.math.NumberUtils.max(longArray25);
        long long29 = org.apache.commons.lang.math.NumberUtils.max(longArray25);
        long long30 = org.apache.commons.lang.math.NumberUtils.max(longArray25);
        long[] longArray31 = new long[] {};
        long[] longArray33 = new long[] { (byte) -1 };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(longArray31, longArray33);
        long long35 = org.apache.commons.lang.math.NumberUtils.max(longArray33);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(longArray25, longArray33);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(longArray15, longArray25);
        long[] longArray38 = new long[] {};
        long[] longArray40 = new long[] { (byte) -1 };
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(longArray38, longArray40);
        long long42 = org.apache.commons.lang.math.NumberUtils.max(longArray40);
        long[] longArray47 = new long[] { 0, (short) 1, 52, (byte) 1 };
        long long48 = org.apache.commons.lang.math.NumberUtils.max(longArray47);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(longArray40, longArray47);
        long long50 = org.apache.commons.lang.math.NumberUtils.max(longArray47);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(longArray25, longArray47);
        long[] longArray55 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray56 = new long[] {};
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(longArray55, longArray56);
        long[] longArray58 = new long[] {};
        long[] longArray60 = new long[] { (byte) -1 };
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(longArray58, longArray60);
        long long62 = org.apache.commons.lang.math.NumberUtils.max(longArray60);
        long[] longArray65 = new long[] { 52L, (short) 1 };
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(longArray60, longArray65);
        long[] longArray67 = new long[] {};
        long[] longArray69 = new long[] { (byte) -1 };
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(longArray67, longArray69);
        long[] longArray71 = new long[] {};
        long[] longArray73 = new long[] { (byte) -1 };
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(longArray71, longArray73);
        long long75 = org.apache.commons.lang.math.NumberUtils.max(longArray73);
        long long76 = org.apache.commons.lang.math.NumberUtils.max(longArray73);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(longArray69, longArray73);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(longArray60, longArray73);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(longArray56, longArray60);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(longArray47, longArray56);
        long long81 = org.apache.commons.lang.math.NumberUtils.min(longArray47);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 52L + "'", long28 == 52L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 52L + "'", long29 == 52L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 52L + "'", long30 == 52L);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[0, 1, 52, 1]");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 52L + "'", long48 == 52L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 52L + "'", long50 == 52L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[]");
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-1L) + "'", long62 == (-1L));
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[]");
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray71), "[]");
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray73), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + (-1L) + "'", long75 == (-1L));
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + (-1L) + "'", long76 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(52.0d, (double) (short) 10, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte byte10 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte16 = org.apache.commons.lang.math.NumberUtils.max(byteArray15);
        byte byte17 = org.apache.commons.lang.math.NumberUtils.max(byteArray15);
        byte byte18 = org.apache.commons.lang.math.NumberUtils.min(byteArray15);
        byte byte19 = org.apache.commons.lang.math.NumberUtils.max(byteArray15);
        byte byte20 = org.apache.commons.lang.math.NumberUtils.max(byteArray15);
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte26 = org.apache.commons.lang.math.NumberUtils.max(byteArray25);
        byte byte27 = org.apache.commons.lang.math.NumberUtils.max(byteArray25);
        byte byte28 = org.apache.commons.lang.math.NumberUtils.min(byteArray25);
        byte byte29 = org.apache.commons.lang.math.NumberUtils.min(byteArray25);
        byte[] byteArray34 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte35 = org.apache.commons.lang.math.NumberUtils.max(byteArray34);
        byte byte36 = org.apache.commons.lang.math.NumberUtils.max(byteArray34);
        byte byte37 = org.apache.commons.lang.math.NumberUtils.min(byteArray34);
        byte byte38 = org.apache.commons.lang.math.NumberUtils.min(byteArray34);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(byteArray25, byteArray34);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(byteArray15, byteArray34);
        byte byte41 = org.apache.commons.lang.math.NumberUtils.min(byteArray34);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray34);
        byte byte43 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte byte44 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte[] byteArray47 = new byte[] { (byte) 100, (byte) 1 };
        byte[] byteArray48 = null;
        byte[] byteArray55 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(byteArray48, byteArray55);
        byte byte57 = org.apache.commons.lang.math.NumberUtils.min(byteArray55);
        byte[] byteArray61 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte62 = org.apache.commons.lang.math.NumberUtils.max(byteArray61);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(byteArray55, byteArray61);
        byte byte64 = org.apache.commons.lang.math.NumberUtils.min(byteArray61);
        byte byte65 = org.apache.commons.lang.math.NumberUtils.min(byteArray61);
        byte byte66 = org.apache.commons.lang.math.NumberUtils.min(byteArray61);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(byteArray47, byteArray61);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray61);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 10 + "'", byte16 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 10 + "'", byte17 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) -1 + "'", byte18 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 10 + "'", byte19 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 10 + "'", byte20 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 10 + "'", byte26 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 10 + "'", byte27 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) -1 + "'", byte28 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) -1 + "'", byte29 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 10 + "'", byte35 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) 10 + "'", byte36 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) -1 + "'", byte37 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) -1 + "'", byte38 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) -1 + "'", byte41 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) -1 + "'", byte43 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) 100 + "'", byte44 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[100, 1]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + byte57 + "' != '" + (byte) -1 + "'", byte57 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte62 + "' != '" + (byte) 10 + "'", byte62 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + byte64 + "' != '" + (byte) -1 + "'", byte64 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte65 + "' != '" + (byte) -1 + "'", byte65 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte66 + "' != '" + (byte) -1 + "'", byte66 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        long[] longArray3 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray4 = new long[] {};
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long7 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long8 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long9 = org.apache.commons.lang.math.NumberUtils.min(longArray3);
        long long10 = org.apache.commons.lang.math.NumberUtils.min(longArray3);
        long long11 = org.apache.commons.lang.math.NumberUtils.min(longArray3);
        long long12 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long13 = org.apache.commons.lang.math.NumberUtils.min(longArray3);
        long[] longArray17 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray18 = new long[] {};
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(longArray17, longArray18);
        long[] longArray23 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray24 = new long[] {};
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(longArray23, longArray24);
        long long26 = org.apache.commons.lang.math.NumberUtils.max(longArray23);
        long long27 = org.apache.commons.lang.math.NumberUtils.max(longArray23);
        long long28 = org.apache.commons.lang.math.NumberUtils.max(longArray23);
        long long29 = org.apache.commons.lang.math.NumberUtils.min(longArray23);
        long[] longArray33 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray34 = new long[] {};
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(longArray33, longArray34);
        long long36 = org.apache.commons.lang.math.NumberUtils.max(longArray33);
        long long37 = org.apache.commons.lang.math.NumberUtils.max(longArray33);
        long long38 = org.apache.commons.lang.math.NumberUtils.min(longArray33);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray23, longArray33);
        long[] longArray43 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray44 = new long[] {};
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(longArray43, longArray44);
        long long46 = org.apache.commons.lang.math.NumberUtils.max(longArray43);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(longArray33, longArray43);
        long[] longArray51 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray52 = new long[] {};
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(longArray51, longArray52);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(longArray43, longArray51);
        long long55 = org.apache.commons.lang.math.NumberUtils.min(longArray43);
        long[] longArray56 = new long[] {};
        long[] longArray58 = new long[] { (byte) -1 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(longArray56, longArray58);
        long long60 = org.apache.commons.lang.math.NumberUtils.max(longArray58);
        long[] longArray63 = new long[] { 52L, (short) 1 };
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(longArray58, longArray63);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(longArray43, longArray58);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(longArray17, longArray43);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray43);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 52L + "'", long26 == 52L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 52L + "'", long28 == 52L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 52L + "'", long36 == 52L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 52L + "'", long37 == 52L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 52L + "'", long46 == 52L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[]");
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float float7 = org.apache.commons.lang.math.NumberUtils.min(floatArray5);
        float float8 = org.apache.commons.lang.math.NumberUtils.max(floatArray5);
        float float9 = org.apache.commons.lang.math.NumberUtils.min(floatArray5);
        float[] floatArray13 = new float[] { 0, 1.0f, 100 };
        float[] floatArray15 = new float[] { (-1L) };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(floatArray13, floatArray15);
        float[] floatArray21 = new float[] { 0.0f, 35, (-1), 35 };
        float[] floatArray22 = new float[] {};
        float[] floatArray26 = new float[] { 0, 1.0f, 100 };
        float[] floatArray28 = new float[] { (-1L) };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(floatArray26, floatArray28);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(floatArray22, floatArray26);
        float float31 = org.apache.commons.lang.math.NumberUtils.max(floatArray26);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(floatArray21, floatArray26);
        float float33 = org.apache.commons.lang.math.NumberUtils.max(floatArray26);
        float float34 = org.apache.commons.lang.math.NumberUtils.max(floatArray26);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(floatArray13, floatArray26);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray26);
        float float37 = org.apache.commons.lang.math.NumberUtils.min(floatArray26);
        float float38 = org.apache.commons.lang.math.NumberUtils.min(floatArray26);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[0.0, 35.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 100.0f + "'", float31 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 100.0f + "'", float33 == 100.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 100.0f + "'", float34 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        float[] floatArray0 = new float[] {};
        float[] floatArray4 = new float[] { 0, 1.0f, 100 };
        float[] floatArray6 = new float[] { (-1L) };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray4);
        float float9 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float[] floatArray13 = new float[] { 0, 1.0f, 100 };
        float[] floatArray15 = new float[] { (-1L) };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(floatArray13, floatArray15);
        float float17 = org.apache.commons.lang.math.NumberUtils.min(floatArray15);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray15);
        float[] floatArray19 = new float[] {};
        float[] floatArray23 = new float[] { 0, 1.0f, 100 };
        float[] floatArray25 = new float[] { (-1L) };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(floatArray23, floatArray25);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(floatArray19, floatArray23);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(floatArray15, floatArray23);
        float[] floatArray32 = new float[] { 0, 1.0f, 100 };
        float[] floatArray34 = new float[] { (-1L) };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(floatArray32, floatArray34);
        float[] floatArray39 = new float[] { 0, 1.0f, 100 };
        float[] floatArray41 = new float[] { (-1L) };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(floatArray39, floatArray41);
        float float43 = org.apache.commons.lang.math.NumberUtils.max(floatArray39);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(floatArray32, floatArray39);
        float float45 = org.apache.commons.lang.math.NumberUtils.max(floatArray32);
        float[] floatArray46 = new float[] {};
        float[] floatArray50 = new float[] { 0, 1.0f, 100 };
        float[] floatArray52 = new float[] { (-1L) };
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(floatArray50, floatArray52);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(floatArray46, floatArray50);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(floatArray32, floatArray50);
        float float56 = org.apache.commons.lang.math.NumberUtils.max(floatArray50);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(floatArray23, floatArray50);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 100.0f + "'", float43 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 100.0f + "'", float45 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray46), "[]");
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray50), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray52), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 100.0f + "'", float56 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        long[] longArray3 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray4 = new long[] {};
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long[] longArray11 = new long[] { 0L, 35, 32L, '#' };
        long[] longArray15 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray16 = new long[] {};
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(longArray15, longArray16);
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray15);
        long long19 = org.apache.commons.lang.math.NumberUtils.max(longArray15);
        long long20 = org.apache.commons.lang.math.NumberUtils.max(longArray15);
        long long21 = org.apache.commons.lang.math.NumberUtils.min(longArray15);
        long[] longArray25 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray26 = new long[] {};
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(longArray25, longArray26);
        long long28 = org.apache.commons.lang.math.NumberUtils.max(longArray25);
        long long29 = org.apache.commons.lang.math.NumberUtils.max(longArray25);
        long long30 = org.apache.commons.lang.math.NumberUtils.min(longArray25);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(longArray15, longArray25);
        long[] longArray35 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray36 = new long[] {};
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(longArray35, longArray36);
        long long38 = org.apache.commons.lang.math.NumberUtils.max(longArray35);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray25, longArray35);
        long[] longArray43 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray44 = new long[] {};
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(longArray43, longArray44);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(longArray35, longArray43);
        long long47 = org.apache.commons.lang.math.NumberUtils.min(longArray35);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray35);
        long long49 = org.apache.commons.lang.math.NumberUtils.min(longArray11);
        long[] longArray50 = null;
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray50);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray11);
        long[] longArray56 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray57 = new long[] {};
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(longArray56, longArray57);
        long long59 = org.apache.commons.lang.math.NumberUtils.min(longArray56);
        long long60 = org.apache.commons.lang.math.NumberUtils.min(longArray56);
        long[] longArray61 = new long[] {};
        long[] longArray63 = new long[] { (byte) -1 };
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(longArray61, longArray63);
        long[] longArray65 = new long[] {};
        long[] longArray67 = new long[] { (byte) -1 };
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(longArray65, longArray67);
        long long69 = org.apache.commons.lang.math.NumberUtils.max(longArray67);
        long long70 = org.apache.commons.lang.math.NumberUtils.max(longArray67);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(longArray63, longArray67);
        long[] longArray75 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray76 = new long[] {};
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(longArray75, longArray76);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(longArray67, longArray75);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(longArray56, longArray75);
        long[] longArray83 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray84 = new long[] {};
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(longArray83, longArray84);
        long long86 = org.apache.commons.lang.math.NumberUtils.max(longArray83);
        long long87 = org.apache.commons.lang.math.NumberUtils.max(longArray83);
        long long88 = org.apache.commons.lang.math.NumberUtils.min(longArray83);
        long long89 = org.apache.commons.lang.math.NumberUtils.min(longArray83);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(longArray56, longArray83);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray83);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[0, 35, 32, 35]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 52L + "'", long18 == 52L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 52L + "'", long28 == 52L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 52L + "'", long29 == 52L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 52L + "'", long38 == 52L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-1L) + "'", long69 == (-1L));
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-1L) + "'", long70 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray83), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 52L + "'", long86 == 52L);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 52L + "'", long87 == 52L);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + (-1L) + "'", long88 == (-1L));
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + (-1L) + "'", long89 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang.math.NumberUtils.min(shortArray1);
        short[] shortArray4 = new short[] { (short) -1 };
        short short5 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray4);
        short[] shortArray10 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short11 = org.apache.commons.lang.math.NumberUtils.max(shortArray10);
        short[] shortArray15 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray15);
        short short17 = org.apache.commons.lang.math.NumberUtils.min(shortArray10);
        short[] shortArray20 = new short[] { (short) -1, (short) -1 };
        short short21 = org.apache.commons.lang.math.NumberUtils.min(shortArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray20);
        short short23 = org.apache.commons.lang.math.NumberUtils.max(shortArray20);
        short short24 = org.apache.commons.lang.math.NumberUtils.min(shortArray20);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray20);
        short[] shortArray29 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short30 = org.apache.commons.lang.math.NumberUtils.max(shortArray29);
        short[] shortArray34 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(shortArray29, shortArray34);
        short short36 = org.apache.commons.lang.math.NumberUtils.min(shortArray29);
        short short37 = org.apache.commons.lang.math.NumberUtils.max(shortArray29);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(shortArray20, shortArray29);
        short short39 = org.apache.commons.lang.math.NumberUtils.min(shortArray20);
        short short40 = org.apache.commons.lang.math.NumberUtils.max(shortArray20);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 1 + "'", short17 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) -1 + "'", short21 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) -1 + "'", short23 == (short) -1);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) -1 + "'", short24 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 10 + "'", short30 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) 1 + "'", short36 == (short) 1);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) 10 + "'", short37 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + short39 + "' != '" + (short) -1 + "'", short39 == (short) -1);
        org.junit.Assert.assertTrue("'" + short40 + "' != '" + (short) -1 + "'", short40 == (short) -1);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double[] doubleArray10 = new double[] { 100L, 1.0f };
        double[] doubleArray14 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray10);
        double[] doubleArray19 = new double[] { 100L, 1.0f };
        double[] doubleArray23 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray19, doubleArray23);
        double[] doubleArray27 = new double[] { 100L, 1.0f };
        double[] doubleArray31 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray23, doubleArray27);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray27);
        double[] doubleArray37 = new double[] { 100L, 1.0f };
        double[] doubleArray41 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray41);
        double[] doubleArray45 = new double[] { 100L, 1.0f };
        double[] doubleArray49 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray45, doubleArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray41, doubleArray45);
        double double52 = org.apache.commons.lang.math.NumberUtils.min(doubleArray41);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray41);
        double[] doubleArray56 = new double[] { 100L, 1.0f };
        double[] doubleArray60 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray56, doubleArray60);
        double[] doubleArray64 = new double[] { 100L, 1.0f };
        double[] doubleArray68 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray64, doubleArray68);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray56, doubleArray64);
        double[] doubleArray73 = new double[] { 100L, 1.0f };
        double[] doubleArray77 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray73, doubleArray77);
        double[] doubleArray81 = new double[] { 100L, 1.0f };
        double[] doubleArray85 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray81, doubleArray85);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray77, doubleArray81);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray56, doubleArray81);
        double double89 = org.apache.commons.lang.math.NumberUtils.min(doubleArray56);
        double double90 = org.apache.commons.lang.math.NumberUtils.max(doubleArray56);
        double double91 = org.apache.commons.lang.math.NumberUtils.min(doubleArray56);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray56);
        double double93 = org.apache.commons.lang.math.NumberUtils.max(doubleArray56);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 1.0d + "'", double89 == 1.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 100.0d + "'", double90 == 100.0d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 1.0d + "'", double91 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 100.0d + "'", double93 == 100.0d);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        float[] floatArray0 = new float[] {};
        float[] floatArray4 = new float[] { 0, 1.0f, 100 };
        float[] floatArray6 = new float[] { (-1L) };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray4);
        float[] floatArray12 = new float[] { 0, 1.0f, 100 };
        float[] floatArray14 = new float[] { (-1L) };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(floatArray12, floatArray14);
        float[] floatArray19 = new float[] { 0, ' ', 100.0f };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray19);
        float float21 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray14);
        float[] floatArray26 = new float[] { 0, 1.0f, 100 };
        float[] floatArray28 = new float[] { (-1L) };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(floatArray26, floatArray28);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray26);
        float float31 = org.apache.commons.lang.math.NumberUtils.min(floatArray26);
        float float32 = org.apache.commons.lang.math.NumberUtils.max(floatArray26);
        float[] floatArray36 = new float[] { 0, 1.0f, 100 };
        float[] floatArray38 = new float[] { (-1L) };
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(floatArray36, floatArray38);
        float float40 = org.apache.commons.lang.math.NumberUtils.min(floatArray36);
        float[] floatArray45 = new float[] { 0.0f, 35, (-1), 35 };
        float[] floatArray46 = new float[] {};
        float[] floatArray50 = new float[] { 0, 1.0f, 100 };
        float[] floatArray52 = new float[] { (-1L) };
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(floatArray50, floatArray52);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(floatArray46, floatArray50);
        float float55 = org.apache.commons.lang.math.NumberUtils.max(floatArray50);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(floatArray45, floatArray50);
        float float57 = org.apache.commons.lang.math.NumberUtils.max(floatArray50);
        float[] floatArray58 = new float[] {};
        float[] floatArray62 = new float[] { 0, 1.0f, 100 };
        float[] floatArray64 = new float[] { (-1L) };
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(floatArray62, floatArray64);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(floatArray58, floatArray62);
        float[] floatArray70 = new float[] { 0, 1.0f, 100 };
        float[] floatArray72 = new float[] { (-1L) };
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(floatArray70, floatArray72);
        float[] floatArray77 = new float[] { 0, ' ', 100.0f };
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(floatArray72, floatArray77);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(floatArray58, floatArray72);
        float float80 = org.apache.commons.lang.math.NumberUtils.min(floatArray72);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(floatArray50, floatArray72);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(floatArray36, floatArray50);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(floatArray26, floatArray36);
        float float84 = org.apache.commons.lang.math.NumberUtils.min(floatArray26);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 100.0f + "'", float32 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.0f + "'", float40 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray45), "[0.0, 35.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray46), "[]");
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray50), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray52), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 100.0f + "'", float55 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 100.0f + "'", float57 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray58), "[]");
        org.junit.Assert.assertNotNull(floatArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray62), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray64), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(floatArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray70), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray72), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(floatArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray77), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + float80 + "' != '" + (-1.0f) + "'", float80 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + float84 + "' != '" + 0.0f + "'", float84 == 0.0f);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 35.0f, (double) 35L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        long[] longArray0 = new long[] {};
        long[] longArray2 = new long[] { (byte) -1 };
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray2);
        long[] longArray4 = new long[] {};
        long[] longArray6 = new long[] { (byte) -1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray6);
        long long8 = org.apache.commons.lang.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray6);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray6);
        long[] longArray14 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray15 = new long[] {};
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(longArray14, longArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(longArray6, longArray14);
        long[] longArray18 = new long[] {};
        long[] longArray20 = new long[] { (byte) -1 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray20);
        long long22 = org.apache.commons.lang.math.NumberUtils.max(longArray20);
        long long23 = org.apache.commons.lang.math.NumberUtils.max(longArray20);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(longArray6, longArray20);
        long long25 = org.apache.commons.lang.math.NumberUtils.max(longArray6);
        long long26 = org.apache.commons.lang.math.NumberUtils.max(longArray6);
        long long27 = org.apache.commons.lang.math.NumberUtils.min(longArray6);
        long long28 = org.apache.commons.lang.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        float[] floatArray0 = new float[] {};
        float[] floatArray4 = new float[] { 0, 1.0f, 100 };
        float[] floatArray6 = new float[] { (-1L) };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray4);
        float float9 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float[] floatArray14 = new float[] { 0.0f, 35, (-1), 35 };
        float[] floatArray15 = new float[] {};
        float[] floatArray19 = new float[] { 0, 1.0f, 100 };
        float[] floatArray21 = new float[] { (-1L) };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(floatArray19, floatArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(floatArray15, floatArray19);
        float float24 = org.apache.commons.lang.math.NumberUtils.max(floatArray19);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray19);
        float float26 = org.apache.commons.lang.math.NumberUtils.max(floatArray19);
        float[] floatArray30 = new float[] { 0, 1.0f, 100 };
        float[] floatArray32 = new float[] { (-1L) };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(floatArray30, floatArray32);
        float[] floatArray37 = new float[] { 0, ' ', 100.0f };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(floatArray32, floatArray37);
        float[] floatArray39 = new float[] {};
        float[] floatArray43 = new float[] { 0, 1.0f, 100 };
        float[] floatArray45 = new float[] { (-1L) };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(floatArray43, floatArray45);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(floatArray39, floatArray43);
        float[] floatArray51 = new float[] { 0, 1.0f, 100 };
        float[] floatArray53 = new float[] { (-1L) };
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(floatArray51, floatArray53);
        float[] floatArray58 = new float[] { 0, ' ', 100.0f };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(floatArray53, floatArray58);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(floatArray39, floatArray53);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(floatArray37, floatArray53);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(floatArray19, floatArray53);
        float[] floatArray66 = new float[] { 0, 1.0f, 100 };
        float[] floatArray68 = new float[] { (-1L) };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(floatArray66, floatArray68);
        float[] floatArray73 = new float[] { 0, ' ', 100.0f };
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(floatArray68, floatArray73);
        float float75 = org.apache.commons.lang.math.NumberUtils.min(floatArray73);
        float float76 = org.apache.commons.lang.math.NumberUtils.min(floatArray73);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(floatArray19, floatArray73);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray19);
        float[] floatArray82 = new float[] { 0, 1.0f, 100 };
        float[] floatArray84 = new float[] { (-1L) };
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(floatArray82, floatArray84);
        float[] floatArray89 = new float[] { 0, 1.0f, 100 };
        float[] floatArray91 = new float[] { (-1L) };
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(floatArray89, floatArray91);
        float float93 = org.apache.commons.lang.math.NumberUtils.max(floatArray89);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(floatArray82, floatArray89);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray89);
        float float96 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[0.0, 35.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 100.0f + "'", float26 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[]");
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray45), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray51), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray58), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(floatArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray66), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray68), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(floatArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray73), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + 0.0f + "'", float75 == 0.0f);
        org.junit.Assert.assertTrue("'" + float76 + "' != '" + 0.0f + "'", float76 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(floatArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray82), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray84), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(floatArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray89), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray91), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + float93 + "' != '" + 100.0f + "'", float93 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + float96 + "' != '" + 100.0f + "'", float96 == 100.0f);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(97.0f, 0.0f, (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float[] floatArray10 = new float[] { 0, 1.0f, 100 };
        float[] floatArray12 = new float[] { (-1L) };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray12);
        float float14 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray10);
        float float16 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        float[] floatArray17 = new float[] {};
        float[] floatArray21 = new float[] { 0, 1.0f, 100 };
        float[] floatArray23 = new float[] { (-1L) };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(floatArray21, floatArray23);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(floatArray17, floatArray21);
        float[] floatArray29 = new float[] { 0, 1.0f, 100 };
        float[] floatArray31 = new float[] { (-1L) };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(floatArray29, floatArray31);
        float[] floatArray36 = new float[] { 0, ' ', 100.0f };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(floatArray31, floatArray36);
        float float38 = org.apache.commons.lang.math.NumberUtils.min(floatArray31);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(floatArray21, floatArray31);
        float float40 = org.apache.commons.lang.math.NumberUtils.max(floatArray21);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray21);
        float[] floatArray42 = null;
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray42);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + (-1.0f) + "'", float38 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 100.0f + "'", float40 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 100, (long) (byte) 1, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(52.0f, (float) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double[] doubleArray10 = new double[] { 100L, 1.0f };
        double[] doubleArray14 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray10);
        double[] doubleArray19 = new double[] { 100L, 1.0f };
        double[] doubleArray23 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray19, doubleArray23);
        double[] doubleArray27 = new double[] { 100L, 1.0f };
        double[] doubleArray31 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray23, doubleArray27);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray27);
        double[] doubleArray37 = new double[] { 100L, 1.0f };
        double[] doubleArray41 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray41);
        double[] doubleArray45 = new double[] { 100L, 1.0f };
        double[] doubleArray49 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray45, doubleArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray45);
        double[] doubleArray54 = new double[] { 100L, 1.0f };
        double[] doubleArray58 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray54, doubleArray58);
        double[] doubleArray62 = new double[] { 100L, 1.0f };
        double[] doubleArray66 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray62, doubleArray66);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray58, doubleArray62);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray62);
        double double70 = org.apache.commons.lang.math.NumberUtils.min(doubleArray62);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray62);
        double double72 = org.apache.commons.lang.math.NumberUtils.min(doubleArray27);
        double double73 = org.apache.commons.lang.math.NumberUtils.min(doubleArray27);
        double double74 = org.apache.commons.lang.math.NumberUtils.min(doubleArray27);
        double double75 = org.apache.commons.lang.math.NumberUtils.max(doubleArray27);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 1.0d + "'", double70 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 1.0d + "'", double73 == 1.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 1.0d + "'", double74 == 1.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 100.0d + "'", double75 == 100.0d);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray13);
        byte byte15 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte21 = org.apache.commons.lang.math.NumberUtils.max(byteArray20);
        byte[] byteArray22 = null;
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(byteArray22, byteArray29);
        byte byte31 = org.apache.commons.lang.math.NumberUtils.min(byteArray29);
        byte byte32 = org.apache.commons.lang.math.NumberUtils.max(byteArray29);
        byte byte33 = org.apache.commons.lang.math.NumberUtils.min(byteArray29);
        byte byte34 = org.apache.commons.lang.math.NumberUtils.max(byteArray29);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(byteArray20, byteArray29);
        byte byte36 = org.apache.commons.lang.math.NumberUtils.max(byteArray29);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray29);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 100 + "'", byte15 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 10 + "'", byte21 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) -1 + "'", byte31 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 100 + "'", byte32 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) -1 + "'", byte33 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) 100 + "'", byte34 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) 100 + "'", byte36 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) (byte) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(35.0d, (double) 1L, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) (byte) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        float[] floatArray0 = new float[] {};
        float[] floatArray4 = new float[] { 0, 1.0f, 100 };
        float[] floatArray6 = new float[] { (-1L) };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray4);
        float float9 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float10 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray16 = new float[] { 0.0f, 35, (-1), 35 };
        float[] floatArray17 = new float[] {};
        float[] floatArray21 = new float[] { 0, 1.0f, 100 };
        float[] floatArray23 = new float[] { (-1L) };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(floatArray21, floatArray23);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(floatArray17, floatArray21);
        float float26 = org.apache.commons.lang.math.NumberUtils.max(floatArray21);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(floatArray16, floatArray21);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray21);
        float[] floatArray29 = new float[] {};
        float[] floatArray33 = new float[] { 0, 1.0f, 100 };
        float[] floatArray35 = new float[] { (-1L) };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(floatArray33, floatArray35);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(floatArray29, floatArray33);
        float float38 = org.apache.commons.lang.math.NumberUtils.max(floatArray33);
        float[] floatArray42 = new float[] { 0, 1.0f, 100 };
        float[] floatArray44 = new float[] { (-1L) };
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(floatArray42, floatArray44);
        float float46 = org.apache.commons.lang.math.NumberUtils.min(floatArray44);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(floatArray33, floatArray44);
        float[] floatArray48 = new float[] {};
        float[] floatArray52 = new float[] { 0, 1.0f, 100 };
        float[] floatArray54 = new float[] { (-1L) };
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(floatArray52, floatArray54);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(floatArray48, floatArray52);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(floatArray44, floatArray52);
        float[] floatArray61 = new float[] { 0, 1.0f, 100 };
        float[] floatArray63 = new float[] { (-1L) };
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(floatArray61, floatArray63);
        float[] floatArray68 = new float[] { 0, ' ', 100.0f };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(floatArray63, floatArray68);
        float float70 = org.apache.commons.lang.math.NumberUtils.min(floatArray68);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(floatArray52, floatArray68);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(floatArray21, floatArray68);
        float[] floatArray76 = new float[] { 0, 1.0f, 100 };
        float[] floatArray78 = new float[] { (-1L) };
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(floatArray76, floatArray78);
        float[] floatArray83 = new float[] { 0, 1.0f, 100 };
        float[] floatArray85 = new float[] { (-1L) };
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(floatArray83, floatArray85);
        float float87 = org.apache.commons.lang.math.NumberUtils.max(floatArray83);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(floatArray76, floatArray83);
        float float89 = org.apache.commons.lang.math.NumberUtils.max(floatArray83);
        float float90 = org.apache.commons.lang.math.NumberUtils.min(floatArray83);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(floatArray68, floatArray83);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[0.0, 35.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 100.0f + "'", float26 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 100.0f + "'", float38 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray42), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + (-1.0f) + "'", float46 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(floatArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray48), "[]");
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray52), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(floatArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray61), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray63), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(floatArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray68), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 0.0f + "'", float70 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(floatArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray76), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray78), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(floatArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray83), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray85), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + float87 + "' != '" + 100.0f + "'", float87 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + float89 + "' != '" + 100.0f + "'", float89 == 100.0f);
        org.junit.Assert.assertTrue("'" + float90 + "' != '" + 0.0f + "'", float90 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 100, (int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double[] doubleArray10 = new double[] { 100L, 1.0f };
        double[] doubleArray14 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray6, doubleArray10);
        double[] doubleArray19 = new double[] { 100L, 1.0f };
        double[] doubleArray23 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray19, doubleArray23);
        double[] doubleArray27 = new double[] { 100L, 1.0f };
        double[] doubleArray31 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray19, doubleArray27);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray27);
        double[] doubleArray37 = new double[] { 100L, 1.0f };
        double[] doubleArray41 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray41);
        double[] doubleArray45 = new double[] { 100L, 1.0f };
        double[] doubleArray49 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray45, doubleArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray45);
        double[] doubleArray54 = new double[] { 100L, 1.0f };
        double[] doubleArray58 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray54, doubleArray58);
        double[] doubleArray62 = new double[] { 100L, 1.0f };
        double[] doubleArray66 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray62, doubleArray66);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray58, doubleArray62);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray62);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray37);
        double[] doubleArray73 = new double[] { 100L, 1.0f };
        double[] doubleArray77 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray73, doubleArray77);
        double[] doubleArray81 = new double[] { 100L, 1.0f };
        double[] doubleArray85 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray81, doubleArray85);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray77, doubleArray81);
        double double88 = org.apache.commons.lang.math.NumberUtils.min(doubleArray81);
        double double89 = org.apache.commons.lang.math.NumberUtils.max(doubleArray81);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray81);
        double double91 = org.apache.commons.lang.math.NumberUtils.max(doubleArray27);
        double double92 = org.apache.commons.lang.math.NumberUtils.max(doubleArray27);
        double double93 = org.apache.commons.lang.math.NumberUtils.max(doubleArray27);
        double double94 = org.apache.commons.lang.math.NumberUtils.min(doubleArray27);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 1.0d + "'", double88 == 1.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 100.0d + "'", double89 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 100.0d + "'", double91 == 100.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 100.0d + "'", double92 == 100.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 100.0d + "'", double93 == 100.0d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 1.0d + "'", double94 == 1.0d);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(10L, (-1L), (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte5 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte6 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte8 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        java.lang.Class<?> wildcardClass10 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 'a', (float) '#', 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang.math.NumberUtils.min(shortArray1);
        short[] shortArray4 = new short[] { (short) -1 };
        short short5 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray4);
        short[] shortArray8 = new short[] { (byte) 1 };
        short short9 = org.apache.commons.lang.math.NumberUtils.min(shortArray8);
        short[] shortArray11 = new short[] { (short) -1 };
        short short12 = org.apache.commons.lang.math.NumberUtils.max(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray8, shortArray11);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short[] shortArray18 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short19 = org.apache.commons.lang.math.NumberUtils.max(shortArray18);
        short short20 = org.apache.commons.lang.math.NumberUtils.min(shortArray18);
        short short21 = org.apache.commons.lang.math.NumberUtils.min(shortArray18);
        short short22 = org.apache.commons.lang.math.NumberUtils.min(shortArray18);
        short short23 = org.apache.commons.lang.math.NumberUtils.max(shortArray18);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray18);
        short[] shortArray27 = new short[] { (short) -1, (short) -1 };
        short short28 = org.apache.commons.lang.math.NumberUtils.min(shortArray27);
        short[] shortArray32 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short33 = org.apache.commons.lang.math.NumberUtils.max(shortArray32);
        short[] shortArray37 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(shortArray32, shortArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(shortArray27, shortArray32);
        short[] shortArray41 = new short[] { (short) 100 };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(shortArray27, shortArray41);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(shortArray18, shortArray27);
        short[] shortArray47 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short48 = org.apache.commons.lang.math.NumberUtils.max(shortArray47);
        short[] shortArray52 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(shortArray47, shortArray52);
        short[] shortArray56 = new short[] { (short) -1, (short) -1 };
        short short57 = org.apache.commons.lang.math.NumberUtils.min(shortArray56);
        short[] shortArray61 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short62 = org.apache.commons.lang.math.NumberUtils.max(shortArray61);
        short[] shortArray66 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(shortArray61, shortArray66);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(shortArray56, shortArray61);
        short[] shortArray70 = new short[] { (short) 100 };
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(shortArray56, shortArray70);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(shortArray47, shortArray70);
        short short73 = org.apache.commons.lang.math.NumberUtils.min(shortArray47);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(shortArray27, shortArray47);
        short short75 = org.apache.commons.lang.math.NumberUtils.min(shortArray27);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[1]");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -1 + "'", short12 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 10 + "'", short19 == (short) 10);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 1 + "'", short20 == (short) 1);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 1 + "'", short21 == (short) 1);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 1 + "'", short22 == (short) 1);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 10 + "'", short23 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) -1 + "'", short28 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 10 + "'", short33 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[100]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray47), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short48 + "' != '" + (short) 10 + "'", short48 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray52), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short57 + "' != '" + (short) -1 + "'", short57 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray61), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short62 + "' != '" + (short) 10 + "'", short62 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray66), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray70), "[100]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + short73 + "' != '" + (short) 1 + "'", short73 == (short) 1);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + short75 + "' != '" + (short) -1 + "'", short75 == (short) -1);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(35.0f, (float) (-1), 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '4', 52, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        float[] floatArray0 = new float[] {};
        float[] floatArray4 = new float[] { 0, 1.0f, 100 };
        float[] floatArray6 = new float[] { (-1L) };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray4);
        float[] floatArray12 = new float[] { 0, 1.0f, 100 };
        float[] floatArray14 = new float[] { (-1L) };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(floatArray12, floatArray14);
        float[] floatArray19 = new float[] { 0, ' ', 100.0f };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray19);
        float float21 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray14);
        float[] floatArray26 = new float[] { 0, 1.0f, 100 };
        float[] floatArray28 = new float[] { (-1L) };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(floatArray26, floatArray28);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray26);
        float[] floatArray31 = new float[] {};
        float[] floatArray35 = new float[] { 0, 1.0f, 100 };
        float[] floatArray37 = new float[] { (-1L) };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(floatArray35, floatArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(floatArray31, floatArray35);
        float[] floatArray43 = new float[] { 0, 1.0f, 100 };
        float[] floatArray45 = new float[] { (-1L) };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(floatArray43, floatArray45);
        float[] floatArray50 = new float[] { 0, ' ', 100.0f };
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(floatArray45, floatArray50);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(floatArray31, floatArray45);
        float[] floatArray53 = new float[] {};
        float[] floatArray57 = new float[] { 0, 1.0f, 100 };
        float[] floatArray59 = new float[] { (-1L) };
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(floatArray57, floatArray59);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(floatArray53, floatArray57);
        float[] floatArray65 = new float[] { 0, 1.0f, 100 };
        float[] floatArray67 = new float[] { (-1L) };
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(floatArray65, floatArray67);
        float[] floatArray72 = new float[] { 0, ' ', 100.0f };
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(floatArray67, floatArray72);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(floatArray53, floatArray67);
        float float75 = org.apache.commons.lang.math.NumberUtils.min(floatArray67);
        float float76 = org.apache.commons.lang.math.NumberUtils.min(floatArray67);
        float float77 = org.apache.commons.lang.math.NumberUtils.min(floatArray67);
        float[] floatArray81 = new float[] { 0, 1.0f, 100 };
        float[] floatArray83 = new float[] { (-1L) };
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(floatArray81, floatArray83);
        float[] floatArray88 = new float[] { 0, ' ', 100.0f };
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(floatArray83, floatArray88);
        float float90 = org.apache.commons.lang.math.NumberUtils.min(floatArray83);
        float float91 = org.apache.commons.lang.math.NumberUtils.max(floatArray83);
        float float92 = org.apache.commons.lang.math.NumberUtils.max(floatArray83);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(floatArray67, floatArray83);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(floatArray45, floatArray83);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray83);
        float float96 = org.apache.commons.lang.math.NumberUtils.max(floatArray83);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray45), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray50), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[]");
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray57), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray59), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(floatArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray65), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray67), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(floatArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray72), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + (-1.0f) + "'", float75 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float76 + "' != '" + (-1.0f) + "'", float76 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float77 + "' != '" + (-1.0f) + "'", float77 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray81), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray83), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(floatArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray88), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + float90 + "' != '" + (-1.0f) + "'", float90 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float91 + "' != '" + (-1.0f) + "'", float91 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float92 + "' != '" + (-1.0f) + "'", float92 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + float96 + "' != '" + (-1.0f) + "'", float96 == (-1.0f));
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte5 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte6 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte8 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        byte[] byteArray15 = null;
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray15, byteArray22);
        byte byte24 = org.apache.commons.lang.math.NumberUtils.min(byteArray22);
        byte byte25 = org.apache.commons.lang.math.NumberUtils.max(byteArray22);
        byte byte26 = org.apache.commons.lang.math.NumberUtils.min(byteArray22);
        byte byte27 = org.apache.commons.lang.math.NumberUtils.max(byteArray22);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray22);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray13);
        byte[] byteArray34 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte35 = org.apache.commons.lang.math.NumberUtils.max(byteArray34);
        byte[] byteArray36 = null;
        byte[] byteArray43 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(byteArray36, byteArray43);
        byte byte45 = org.apache.commons.lang.math.NumberUtils.min(byteArray43);
        byte byte46 = org.apache.commons.lang.math.NumberUtils.max(byteArray43);
        byte byte47 = org.apache.commons.lang.math.NumberUtils.min(byteArray43);
        byte byte48 = org.apache.commons.lang.math.NumberUtils.max(byteArray43);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(byteArray34, byteArray43);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray34);
        byte[] byteArray51 = null;
        byte[] byteArray58 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(byteArray51, byteArray58);
        byte[] byteArray64 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(byteArray58, byteArray64);
        byte byte66 = org.apache.commons.lang.math.NumberUtils.min(byteArray64);
        byte byte67 = org.apache.commons.lang.math.NumberUtils.min(byteArray64);
        byte byte68 = org.apache.commons.lang.math.NumberUtils.min(byteArray64);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(byteArray34, byteArray64);
        byte byte70 = org.apache.commons.lang.math.NumberUtils.max(byteArray64);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) -1 + "'", byte24 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 100 + "'", byte25 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) -1 + "'", byte26 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 100 + "'", byte27 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 10 + "'", byte35 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) -1 + "'", byte45 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) 100 + "'", byte46 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte47 + "' != '" + (byte) -1 + "'", byte47 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte48 + "' != '" + (byte) 100 + "'", byte48 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + byte66 + "' != '" + (byte) -1 + "'", byte66 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) -1 + "'", byte67 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte68 + "' != '" + (byte) -1 + "'", byte68 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + byte70 + "' != '" + (byte) 10 + "'", byte70 == (byte) 10);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double[] doubleArray10 = new double[] { 100L, 1.0f };
        double[] doubleArray14 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray6, doubleArray10);
        double[] doubleArray19 = new double[] { 100L, 1.0f };
        double[] doubleArray23 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray19, doubleArray23);
        double[] doubleArray27 = new double[] { 100L, 1.0f };
        double[] doubleArray31 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray19, doubleArray27);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray27);
        double[] doubleArray37 = new double[] { 100L, 1.0f };
        double[] doubleArray41 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray41);
        double[] doubleArray45 = new double[] { 100L, 1.0f };
        double[] doubleArray49 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray45, doubleArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray45);
        double[] doubleArray54 = new double[] { 100L, 1.0f };
        double[] doubleArray58 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray54, doubleArray58);
        double[] doubleArray62 = new double[] { 100L, 1.0f };
        double[] doubleArray66 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray62, doubleArray66);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray58, doubleArray62);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray62);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray37);
        double[] doubleArray73 = new double[] { 100L, 1.0f };
        double[] doubleArray77 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray73, doubleArray77);
        double[] doubleArray81 = new double[] { 100L, 1.0f };
        double[] doubleArray85 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray81, doubleArray85);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray77, doubleArray81);
        double double88 = org.apache.commons.lang.math.NumberUtils.min(doubleArray81);
        double double89 = org.apache.commons.lang.math.NumberUtils.max(doubleArray81);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray81);
        double double91 = org.apache.commons.lang.math.NumberUtils.max(doubleArray81);
        double double92 = org.apache.commons.lang.math.NumberUtils.max(doubleArray81);
        double double93 = org.apache.commons.lang.math.NumberUtils.min(doubleArray81);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 1.0d + "'", double88 == 1.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 100.0d + "'", double89 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 100.0d + "'", double91 == 100.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 100.0d + "'", double92 == 100.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 1.0d + "'", double93 == 1.0d);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        short[] shortArray3 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short4 = org.apache.commons.lang.math.NumberUtils.max(shortArray3);
        short[] shortArray8 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray8);
        short[] shortArray12 = new short[] { (short) -1, (short) -1 };
        short short13 = org.apache.commons.lang.math.NumberUtils.min(shortArray12);
        short[] shortArray17 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short18 = org.apache.commons.lang.math.NumberUtils.max(shortArray17);
        short[] shortArray22 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(shortArray17, shortArray22);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(shortArray12, shortArray17);
        short[] shortArray26 = new short[] { (short) 100 };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(shortArray12, shortArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray26);
        short short29 = org.apache.commons.lang.math.NumberUtils.max(shortArray3);
        short short30 = org.apache.commons.lang.math.NumberUtils.min(shortArray3);
        short short31 = org.apache.commons.lang.math.NumberUtils.min(shortArray3);
        short short32 = org.apache.commons.lang.math.NumberUtils.max(shortArray3);
        short short33 = org.apache.commons.lang.math.NumberUtils.max(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 10 + "'", short29 == (short) 10);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 1 + "'", short30 == (short) 1);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 1 + "'", short31 == (short) 1);
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 10 + "'", short32 == (short) 10);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 10 + "'", short33 == (short) 10);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(32.0f, 35.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(10, 32, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray13);
        byte byte16 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte22 = org.apache.commons.lang.math.NumberUtils.max(byteArray21);
        byte byte23 = org.apache.commons.lang.math.NumberUtils.max(byteArray21);
        byte byte24 = org.apache.commons.lang.math.NumberUtils.max(byteArray21);
        byte[] byteArray25 = null;
        byte[] byteArray32 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(byteArray25, byteArray32);
        byte byte34 = org.apache.commons.lang.math.NumberUtils.min(byteArray32);
        byte byte35 = org.apache.commons.lang.math.NumberUtils.max(byteArray32);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray32);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray21);
        byte byte38 = org.apache.commons.lang.math.NumberUtils.max(byteArray21);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 10 + "'", byte22 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 10 + "'", byte23 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 10 + "'", byte24 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) -1 + "'", byte34 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 100 + "'", byte35 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 10 + "'", byte38 == (byte) 10);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        double[] doubleArray4 = new double[] { 32L, 100.0f, (byte) 10, 35L };
        double[] doubleArray7 = new double[] { 100L, 1.0f };
        double[] doubleArray11 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray7, doubleArray11);
        double[] doubleArray15 = new double[] { 100L, 1.0f };
        double[] doubleArray19 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray15, doubleArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray15);
        double double22 = org.apache.commons.lang.math.NumberUtils.min(doubleArray11);
        double double23 = org.apache.commons.lang.math.NumberUtils.max(doubleArray11);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray11);
        double[] doubleArray27 = new double[] { 100L, 1.0f };
        double[] doubleArray31 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray31);
        double[] doubleArray35 = new double[] { 100L, 1.0f };
        double[] doubleArray39 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray35, doubleArray39);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray35);
        double[] doubleArray44 = new double[] { 100L, 1.0f };
        double[] doubleArray48 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray44, doubleArray48);
        double[] doubleArray52 = new double[] { 100L, 1.0f };
        double[] doubleArray56 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray52, doubleArray56);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray44, doubleArray52);
        double[] doubleArray61 = new double[] { 100L, 1.0f };
        double[] doubleArray65 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray61, doubleArray65);
        double[] doubleArray69 = new double[] { 100L, 1.0f };
        double[] doubleArray73 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray69, doubleArray73);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray65, doubleArray69);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray44, doubleArray69);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray69);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray69);
        double double79 = org.apache.commons.lang.math.NumberUtils.max(doubleArray69);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[32.0, 100.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 100.0d + "'", double79 == 100.0d);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double[] doubleArray10 = new double[] { 100L, 1.0f };
        double[] doubleArray14 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray10);
        double[] doubleArray19 = new double[] { 100L, 1.0f };
        double[] doubleArray23 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray19, doubleArray23);
        double[] doubleArray27 = new double[] { 100L, 1.0f };
        double[] doubleArray31 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray23, doubleArray27);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray27);
        double[] doubleArray37 = new double[] { 100L, 1.0f };
        double[] doubleArray41 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray41);
        double[] doubleArray45 = new double[] { 100L, 1.0f };
        double[] doubleArray49 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray45, doubleArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray41, doubleArray45);
        double double52 = org.apache.commons.lang.math.NumberUtils.min(doubleArray41);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray41);
        double double54 = org.apache.commons.lang.math.NumberUtils.min(doubleArray41);
        double[] doubleArray55 = new double[] {};
        double[] doubleArray58 = new double[] { 100L, 1.0f };
        double[] doubleArray62 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray58, doubleArray62);
        double[] doubleArray66 = new double[] { 100L, 1.0f };
        double[] doubleArray70 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray66, doubleArray70);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray62, doubleArray66);
        double double73 = org.apache.commons.lang.math.NumberUtils.min(doubleArray66);
        double double74 = org.apache.commons.lang.math.NumberUtils.max(doubleArray66);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray55, doubleArray66);
        double[] doubleArray76 = new double[] {};
        double[] doubleArray79 = new double[] { 100L, 1.0f };
        double[] doubleArray83 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray79, doubleArray83);
        double[] doubleArray87 = new double[] { 100L, 1.0f };
        double[] doubleArray91 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray87, doubleArray91);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray83, doubleArray87);
        double double94 = org.apache.commons.lang.math.NumberUtils.min(doubleArray87);
        double double95 = org.apache.commons.lang.math.NumberUtils.max(doubleArray87);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray76, doubleArray87);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray66, doubleArray87);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray41, doubleArray66);
        double double99 = org.apache.commons.lang.math.NumberUtils.max(doubleArray41);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 1.0d + "'", double73 == 1.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 100.0d + "'", double74 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 1.0d + "'", double94 == 1.0d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 100.0d + "'", double95 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + double99 + "' != '" + 100.0d + "'", double99 == 100.0d);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 100L, 1.0f };
        double[] doubleArray7 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray3, doubleArray7);
        double[] doubleArray11 = new double[] { 100L, 1.0f };
        double[] doubleArray15 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray7, doubleArray11);
        double double18 = org.apache.commons.lang.math.NumberUtils.min(doubleArray11);
        double double19 = org.apache.commons.lang.math.NumberUtils.max(doubleArray11);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray11);
        double double21 = org.apache.commons.lang.math.NumberUtils.max(doubleArray11);
        double[] doubleArray24 = new double[] { 100L, 1.0f };
        double[] doubleArray28 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray24, doubleArray28);
        double[] doubleArray32 = new double[] { 100L, 1.0f };
        double[] doubleArray36 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray32, doubleArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray24, doubleArray32);
        double[] doubleArray41 = new double[] { 100L, 1.0f };
        double[] doubleArray45 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray41, doubleArray45);
        double[] doubleArray49 = new double[] { 100L, 1.0f };
        double[] doubleArray53 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray49, doubleArray53);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray45, doubleArray49);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray24, doubleArray49);
        double[] doubleArray59 = new double[] { 100L, 1.0f };
        double[] doubleArray63 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray59, doubleArray63);
        double[] doubleArray67 = new double[] { 100L, 1.0f };
        double[] doubleArray71 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray67, doubleArray71);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray63, doubleArray67);
        double double74 = org.apache.commons.lang.math.NumberUtils.min(doubleArray63);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray24, doubleArray63);
        double double76 = org.apache.commons.lang.math.NumberUtils.min(doubleArray63);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray63);
        double double78 = org.apache.commons.lang.math.NumberUtils.min(doubleArray63);
        double double79 = org.apache.commons.lang.math.NumberUtils.max(doubleArray63);
        double double80 = org.apache.commons.lang.math.NumberUtils.max(doubleArray63);
        double double81 = org.apache.commons.lang.math.NumberUtils.min(doubleArray63);
        double double82 = org.apache.commons.lang.math.NumberUtils.min(doubleArray63);
        double double83 = org.apache.commons.lang.math.NumberUtils.max(doubleArray63);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 1.0d + "'", double74 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 1.0d + "'", double76 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 1.0d + "'", double78 == 1.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 100.0d + "'", double79 == 100.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 100.0d + "'", double80 == 100.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 1.0d + "'", double81 == 1.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 1.0d + "'", double82 == 1.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 100.0d + "'", double83 == 100.0d);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float[] floatArray10 = new float[] { 0, 1.0f, 100 };
        float[] floatArray12 = new float[] { (-1L) };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray12);
        float float14 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray10);
        float[] floatArray16 = new float[] {};
        float[] floatArray20 = new float[] { 0, 1.0f, 100 };
        float[] floatArray22 = new float[] { (-1L) };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(floatArray20, floatArray22);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(floatArray16, floatArray20);
        float[] floatArray28 = new float[] { 0, 1.0f, 100 };
        float[] floatArray30 = new float[] { (-1L) };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(floatArray28, floatArray30);
        float[] floatArray35 = new float[] { 0, ' ', 100.0f };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(floatArray30, floatArray35);
        float float37 = org.apache.commons.lang.math.NumberUtils.min(floatArray30);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(floatArray20, floatArray30);
        float[] floatArray42 = new float[] { 0, 1.0f, 100 };
        float[] floatArray44 = new float[] { (-1L) };
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(floatArray42, floatArray44);
        float[] floatArray49 = new float[] { 0, ' ', 100.0f };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(floatArray44, floatArray49);
        float float51 = org.apache.commons.lang.math.NumberUtils.min(floatArray49);
        float float52 = org.apache.commons.lang.math.NumberUtils.min(floatArray49);
        float float53 = org.apache.commons.lang.math.NumberUtils.max(floatArray49);
        float[] floatArray57 = new float[] { 0, 1.0f, 100 };
        float[] floatArray59 = new float[] { (-1L) };
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(floatArray57, floatArray59);
        float float61 = org.apache.commons.lang.math.NumberUtils.max(floatArray57);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(floatArray49, floatArray57);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(floatArray30, floatArray57);
        float float64 = org.apache.commons.lang.math.NumberUtils.min(floatArray30);
        float[] floatArray65 = new float[] {};
        float[] floatArray69 = new float[] { 0, 1.0f, 100 };
        float[] floatArray71 = new float[] { (-1L) };
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(floatArray69, floatArray71);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(floatArray65, floatArray69);
        float[] floatArray77 = new float[] { 0, 1.0f, 100 };
        float[] floatArray79 = new float[] { (-1L) };
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(floatArray77, floatArray79);
        float[] floatArray84 = new float[] { 0, ' ', 100.0f };
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(floatArray79, floatArray84);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(floatArray65, floatArray79);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(floatArray30, floatArray79);
        float float88 = org.apache.commons.lang.math.NumberUtils.max(floatArray79);
        float float89 = org.apache.commons.lang.math.NumberUtils.min(floatArray79);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray79);
        float float91 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + (-1.0f) + "'", float37 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray42), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray49), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 0.0f + "'", float51 == 0.0f);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.0f + "'", float52 == 0.0f);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 100.0f + "'", float53 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray57), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray59), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 100.0f + "'", float61 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + (-1.0f) + "'", float64 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray65), "[]");
        org.junit.Assert.assertNotNull(floatArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray69), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray71), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(floatArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray77), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray79), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(floatArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray84), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + float88 + "' != '" + (-1.0f) + "'", float88 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float89 + "' != '" + (-1.0f) + "'", float89 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + float91 + "' != '" + 100.0f + "'", float91 == 100.0f);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, (int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (-1), 32L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 100L, 1.0f };
        double[] doubleArray7 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray3, doubleArray7);
        double[] doubleArray11 = new double[] { 100L, 1.0f };
        double[] doubleArray15 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray15);
        double[] doubleArray19 = new double[] { 100L, 1.0f };
        double[] doubleArray23 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray19, doubleArray23);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray19);
        double[] doubleArray28 = new double[] { 100L, 1.0f };
        double[] doubleArray32 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray28, doubleArray32);
        double[] doubleArray36 = new double[] { 100L, 1.0f };
        double[] doubleArray40 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray36, doubleArray40);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray32, doubleArray36);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray36);
        double double44 = org.apache.commons.lang.math.NumberUtils.min(doubleArray36);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray7, doubleArray36);
        double double46 = org.apache.commons.lang.math.NumberUtils.max(doubleArray36);
        double[] doubleArray49 = new double[] { 100L, 1.0f };
        double[] doubleArray53 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray49, doubleArray53);
        double[] doubleArray57 = new double[] { 100L, 1.0f };
        double[] doubleArray61 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray57, doubleArray61);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray49, doubleArray57);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray36, doubleArray49);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray36);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        long[] longArray4 = new long[] { 0L, 35, 32L, '#' };
        long[] longArray8 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray9 = new long[] {};
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray9);
        long long11 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long long12 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long long13 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long long14 = org.apache.commons.lang.math.NumberUtils.min(longArray8);
        long[] longArray18 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray19 = new long[] {};
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray19);
        long long21 = org.apache.commons.lang.math.NumberUtils.max(longArray18);
        long long22 = org.apache.commons.lang.math.NumberUtils.max(longArray18);
        long long23 = org.apache.commons.lang.math.NumberUtils.min(longArray18);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray18);
        long[] longArray28 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray29 = new long[] {};
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(longArray28, longArray29);
        long long31 = org.apache.commons.lang.math.NumberUtils.max(longArray28);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray28);
        long[] longArray36 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray37 = new long[] {};
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(longArray36, longArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray28, longArray36);
        long long40 = org.apache.commons.lang.math.NumberUtils.min(longArray28);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray28);
        long long42 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
        long long43 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray47 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray48 = new long[] {};
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(longArray47, longArray48);
        long long50 = org.apache.commons.lang.math.NumberUtils.max(longArray47);
        long long51 = org.apache.commons.lang.math.NumberUtils.max(longArray47);
        long long52 = org.apache.commons.lang.math.NumberUtils.max(longArray47);
        long long53 = org.apache.commons.lang.math.NumberUtils.min(longArray47);
        long[] longArray57 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray58 = new long[] {};
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(longArray57, longArray58);
        long long60 = org.apache.commons.lang.math.NumberUtils.max(longArray57);
        long long61 = org.apache.commons.lang.math.NumberUtils.max(longArray57);
        long long62 = org.apache.commons.lang.math.NumberUtils.min(longArray57);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(longArray47, longArray57);
        long[] longArray67 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray68 = new long[] {};
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(longArray67, longArray68);
        long long70 = org.apache.commons.lang.math.NumberUtils.max(longArray67);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(longArray57, longArray67);
        long[] longArray75 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray76 = new long[] {};
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(longArray75, longArray76);
        long long78 = org.apache.commons.lang.math.NumberUtils.max(longArray75);
        long long79 = org.apache.commons.lang.math.NumberUtils.max(longArray75);
        long long80 = org.apache.commons.lang.math.NumberUtils.max(longArray75);
        long long81 = org.apache.commons.lang.math.NumberUtils.min(longArray75);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(longArray67, longArray75);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray67);
        long long84 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long long85 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[0, 35, 32, 35]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 52L + "'", long22 == 52L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 52L + "'", long31 == 52L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 35L + "'", long43 == 35L);
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 52L + "'", long50 == 52L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 52L + "'", long51 == 52L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 52L + "'", long52 == 52L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 52L + "'", long60 == 52L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 52L + "'", long61 == 52L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-1L) + "'", long62 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 52L + "'", long70 == 52L);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 52L + "'", long78 == 52L);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 52L + "'", long79 == 52L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 52L + "'", long80 == 52L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + (-1L) + "'", long81 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 35L + "'", long84 == 35L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 35L + "'", long85 == 35L);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (-1.0f), (double) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) 10, (float) 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((-1.0f), 100.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray16 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray21 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray16);
        int[] intArray28 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray33 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(intArray28, intArray33);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray28);
        int[] intArray40 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray45 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(intArray40, intArray45);
        int int47 = org.apache.commons.lang.math.NumberUtils.min(intArray45);
        int int48 = org.apache.commons.lang.math.NumberUtils.min(intArray45);
        int[] intArray53 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray58 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(intArray53, intArray58);
        int int60 = org.apache.commons.lang.math.NumberUtils.max(intArray58);
        int int61 = org.apache.commons.lang.math.NumberUtils.min(intArray58);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(intArray45, intArray58);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(intArray28, intArray45);
        int int64 = org.apache.commons.lang.math.NumberUtils.min(intArray28);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 35.0f, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray13);
        byte byte16 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte21 = org.apache.commons.lang.math.NumberUtils.max(byteArray20);
        byte[] byteArray22 = null;
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(byteArray22, byteArray29);
        byte[] byteArray35 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(byteArray29, byteArray35);
        byte byte37 = org.apache.commons.lang.math.NumberUtils.max(byteArray29);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(byteArray20, byteArray29);
        byte byte39 = org.apache.commons.lang.math.NumberUtils.max(byteArray29);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray29);
        byte byte41 = org.apache.commons.lang.math.NumberUtils.max(byteArray29);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 100 + "'", byte16 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 10 + "'", byte21 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 100 + "'", byte37 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 100 + "'", byte39 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 100 + "'", byte41 == (byte) 100);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        int[] intArray0 = null;
        int[] intArray7 = new int[] { (short) 0, '4', (byte) 0, (short) 1, (short) 10, '#' };
        int int8 = org.apache.commons.lang.math.NumberUtils.min(intArray7);
        int int9 = org.apache.commons.lang.math.NumberUtils.min(intArray7);
        int[] intArray16 = new int[] { (short) 0, '4', (byte) 0, (short) 1, (short) 10, '#' };
        int int17 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(intArray7, intArray16);
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray16);
        int[] intArray24 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray29 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(intArray24, intArray29);
        int[] intArray35 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray40 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray40);
        int int42 = org.apache.commons.lang.math.NumberUtils.min(intArray40);
        int int43 = org.apache.commons.lang.math.NumberUtils.min(intArray40);
        int[] intArray48 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray53 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(intArray48, intArray53);
        int int55 = org.apache.commons.lang.math.NumberUtils.max(intArray53);
        int int56 = org.apache.commons.lang.math.NumberUtils.min(intArray53);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(intArray40, intArray53);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(intArray24, intArray40);
        int int59 = org.apache.commons.lang.math.NumberUtils.min(intArray40);
        int[] intArray64 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray69 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(intArray64, intArray69);
        int int71 = org.apache.commons.lang.math.NumberUtils.min(intArray69);
        int int72 = org.apache.commons.lang.math.NumberUtils.min(intArray69);
        int int73 = org.apache.commons.lang.math.NumberUtils.max(intArray69);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(intArray40, intArray69);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray40);
        int int76 = org.apache.commons.lang.math.NumberUtils.max(intArray40);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 52, 0, 1, 10, 35]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 52, 0, 1, 10, 35]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 100 + "'", int73 == 100);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 100 + "'", int76 == 100);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, (long) 52, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        long[] longArray0 = null;
        long[] longArray4 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray5 = new long[] {};
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray5);
        long long7 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long long8 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long long10 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
        long[] longArray14 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray15 = new long[] {};
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(longArray14, longArray15);
        long long17 = org.apache.commons.lang.math.NumberUtils.max(longArray14);
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray14);
        long long19 = org.apache.commons.lang.math.NumberUtils.min(longArray14);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray14);
        long[] longArray24 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray25 = new long[] {};
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(longArray24, longArray25);
        long long27 = org.apache.commons.lang.math.NumberUtils.max(longArray24);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray14, longArray24);
        long[] longArray32 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray33 = new long[] {};
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(longArray32, longArray33);
        long long35 = org.apache.commons.lang.math.NumberUtils.max(longArray32);
        long long36 = org.apache.commons.lang.math.NumberUtils.max(longArray32);
        long long37 = org.apache.commons.lang.math.NumberUtils.max(longArray32);
        long long38 = org.apache.commons.lang.math.NumberUtils.min(longArray32);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray24, longArray32);
        long long40 = org.apache.commons.lang.math.NumberUtils.min(longArray32);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray32);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 52L + "'", long18 == 52L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 52L + "'", long35 == 52L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 52L + "'", long36 == 52L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 52L + "'", long37 == 52L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray16 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray21 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray16);
        int[] intArray29 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int30 = org.apache.commons.lang.math.NumberUtils.max(intArray29);
        int int31 = org.apache.commons.lang.math.NumberUtils.min(intArray29);
        int[] intArray36 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray41 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(intArray36, intArray41);
        int int43 = org.apache.commons.lang.math.NumberUtils.min(intArray41);
        int[] intArray48 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray53 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(intArray48, intArray53);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(intArray41, intArray48);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(intArray29, intArray48);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray48);
        int int58 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        int[] intArray63 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray68 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(intArray63, intArray68);
        int int70 = org.apache.commons.lang.math.NumberUtils.min(intArray68);
        int[] intArray75 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray80 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(intArray75, intArray80);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(intArray68, intArray75);
        int[] intArray87 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray92 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(intArray87, intArray92);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(intArray75, intArray87);
        int int95 = org.apache.commons.lang.math.NumberUtils.max(intArray87);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray87);
        int[] intArray97 = null;
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray97);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 100 + "'", int95 == 100);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 32L, (double) (byte) 100, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, (long) (-1), 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        long[] longArray0 = new long[] {};
        long[] longArray2 = new long[] { (byte) -1 };
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray2);
        long[] longArray4 = new long[] {};
        long[] longArray6 = new long[] { (byte) -1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray6);
        long long8 = org.apache.commons.lang.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray6);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray6);
        long[] longArray14 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray15 = new long[] {};
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(longArray14, longArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(longArray6, longArray14);
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray6);
        long[] longArray19 = new long[] {};
        long[] longArray21 = new long[] { (byte) -1 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(longArray19, longArray21);
        long long23 = org.apache.commons.lang.math.NumberUtils.max(longArray21);
        long[] longArray26 = new long[] { 52L, (short) 1 };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(longArray21, longArray26);
        long long28 = org.apache.commons.lang.math.NumberUtils.max(longArray26);
        long long29 = org.apache.commons.lang.math.NumberUtils.max(longArray26);
        long long30 = org.apache.commons.lang.math.NumberUtils.max(longArray26);
        long[] longArray31 = new long[] {};
        long[] longArray33 = new long[] { (byte) -1 };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(longArray31, longArray33);
        long long35 = org.apache.commons.lang.math.NumberUtils.max(longArray33);
        long[] longArray38 = new long[] { 52L, (short) 1 };
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray33, longArray38);
        long[] longArray40 = new long[] {};
        long[] longArray42 = new long[] { (byte) -1 };
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(longArray40, longArray42);
        long[] longArray44 = new long[] {};
        long[] longArray46 = new long[] { (byte) -1 };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(longArray44, longArray46);
        long long48 = org.apache.commons.lang.math.NumberUtils.max(longArray46);
        long long49 = org.apache.commons.lang.math.NumberUtils.max(longArray46);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(longArray42, longArray46);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(longArray33, longArray46);
        long long52 = org.apache.commons.lang.math.NumberUtils.max(longArray46);
        long[] longArray56 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray57 = new long[] {};
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(longArray56, longArray57);
        long long59 = org.apache.commons.lang.math.NumberUtils.max(longArray56);
        long long60 = org.apache.commons.lang.math.NumberUtils.max(longArray56);
        long long61 = org.apache.commons.lang.math.NumberUtils.max(longArray56);
        long[] longArray62 = new long[] {};
        long[] longArray64 = new long[] { (byte) -1 };
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(longArray62, longArray64);
        long long66 = org.apache.commons.lang.math.NumberUtils.max(longArray64);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(longArray56, longArray64);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(longArray46, longArray56);
        long long69 = org.apache.commons.lang.math.NumberUtils.min(longArray56);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(longArray26, longArray56);
        long long71 = org.apache.commons.lang.math.NumberUtils.max(longArray56);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(longArray6, longArray56);
        long long73 = org.apache.commons.lang.math.NumberUtils.max(longArray56);
        long long74 = org.apache.commons.lang.math.NumberUtils.min(longArray56);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 52L + "'", long28 == 52L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 52L + "'", long29 == 52L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 52L + "'", long30 == 52L);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[]");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 52L + "'", long59 == 52L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 52L + "'", long60 == 52L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 52L + "'", long61 == 52L);
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[]");
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-1L) + "'", long66 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-1L) + "'", long69 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 52L + "'", long71 == 52L);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 52L + "'", long73 == 52L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-1L) + "'", long74 == (-1L));
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 1, (float) 97, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 35L, (float) 32L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) (byte) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float[] floatArray10 = new float[] { 0, ' ', 100.0f };
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray10);
        float float12 = org.apache.commons.lang.math.NumberUtils.max(floatArray5);
        float float13 = org.apache.commons.lang.math.NumberUtils.max(floatArray5);
        float[] floatArray17 = new float[] { 0, 1.0f, 100 };
        float[] floatArray19 = new float[] { (-1L) };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(floatArray17, floatArray19);
        float[] floatArray24 = new float[] { 0, ' ', 100.0f };
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(floatArray19, floatArray24);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray19);
        float float27 = org.apache.commons.lang.math.NumberUtils.min(floatArray5);
        float[] floatArray32 = new float[] { 0.0f, 35, (-1), 35 };
        float[] floatArray33 = new float[] {};
        float[] floatArray37 = new float[] { 0, 1.0f, 100 };
        float[] floatArray39 = new float[] { (-1L) };
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(floatArray37, floatArray39);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(floatArray33, floatArray37);
        float float42 = org.apache.commons.lang.math.NumberUtils.max(floatArray37);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(floatArray32, floatArray37);
        float float44 = org.apache.commons.lang.math.NumberUtils.max(floatArray37);
        float float45 = org.apache.commons.lang.math.NumberUtils.max(floatArray37);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray37);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-1.0f) + "'", float27 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[0.0, 35.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[]");
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 100.0f + "'", float42 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 100.0f + "'", float44 == 100.0f);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 100.0f + "'", float45 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 'a', (double) 0, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        int[] intArray6 = new int[] { (short) 0, '4', (byte) 0, (short) 1, (short) 10, '#' };
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray6);
        int int8 = org.apache.commons.lang.math.NumberUtils.min(intArray6);
        int[] intArray13 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray18 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray18);
        int int20 = org.apache.commons.lang.math.NumberUtils.max(intArray18);
        int int21 = org.apache.commons.lang.math.NumberUtils.max(intArray18);
        int[] intArray26 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray31 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(intArray26, intArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray26);
        int[] intArray39 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int40 = org.apache.commons.lang.math.NumberUtils.max(intArray39);
        int int41 = org.apache.commons.lang.math.NumberUtils.max(intArray39);
        int int42 = org.apache.commons.lang.math.NumberUtils.max(intArray39);
        int int43 = org.apache.commons.lang.math.NumberUtils.max(intArray39);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(intArray26, intArray39);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray39);
        int int46 = org.apache.commons.lang.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 52, 0, 1, 10, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 52 + "'", int46 == 52);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((-1.0f), 32.0f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang.math.NumberUtils.min(shortArray1);
        short[] shortArray4 = new short[] { (short) -1 };
        short short5 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray4);
        short[] shortArray10 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short11 = org.apache.commons.lang.math.NumberUtils.max(shortArray10);
        short[] shortArray15 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray15);
        short short17 = org.apache.commons.lang.math.NumberUtils.min(shortArray10);
        short[] shortArray20 = new short[] { (short) -1, (short) -1 };
        short short21 = org.apache.commons.lang.math.NumberUtils.min(shortArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray20);
        short short23 = org.apache.commons.lang.math.NumberUtils.max(shortArray20);
        short short24 = org.apache.commons.lang.math.NumberUtils.min(shortArray20);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray20);
        short[] shortArray29 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short30 = org.apache.commons.lang.math.NumberUtils.max(shortArray29);
        short[] shortArray34 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(shortArray29, shortArray34);
        short short36 = org.apache.commons.lang.math.NumberUtils.min(shortArray29);
        short short37 = org.apache.commons.lang.math.NumberUtils.max(shortArray29);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(shortArray20, shortArray29);
        short[] shortArray41 = new short[] { (short) -1, (short) -1 };
        short short42 = org.apache.commons.lang.math.NumberUtils.min(shortArray41);
        short[] shortArray46 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short47 = org.apache.commons.lang.math.NumberUtils.max(shortArray46);
        short[] shortArray51 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(shortArray46, shortArray51);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(shortArray41, shortArray46);
        short short54 = org.apache.commons.lang.math.NumberUtils.min(shortArray41);
        short short55 = org.apache.commons.lang.math.NumberUtils.max(shortArray41);
        short[] shortArray59 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short60 = org.apache.commons.lang.math.NumberUtils.max(shortArray59);
        short[] shortArray64 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(shortArray59, shortArray64);
        short[] shortArray68 = new short[] { (short) -1, (short) -1 };
        short short69 = org.apache.commons.lang.math.NumberUtils.min(shortArray68);
        short[] shortArray73 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short74 = org.apache.commons.lang.math.NumberUtils.max(shortArray73);
        short[] shortArray78 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(shortArray73, shortArray78);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(shortArray68, shortArray73);
        short[] shortArray82 = new short[] { (short) 100 };
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(shortArray68, shortArray82);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(shortArray59, shortArray82);
        short[] shortArray87 = new short[] { (short) -1, (short) -1 };
        short short88 = org.apache.commons.lang.math.NumberUtils.min(shortArray87);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(shortArray82, shortArray87);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(shortArray41, shortArray87);
        short short91 = org.apache.commons.lang.math.NumberUtils.max(shortArray41);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(shortArray29, shortArray41);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 1 + "'", short17 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) -1 + "'", short21 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) -1 + "'", short23 == (short) -1);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) -1 + "'", short24 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 10 + "'", short30 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) 1 + "'", short36 == (short) 1);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) 10 + "'", short37 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) -1 + "'", short42 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short47 + "' != '" + (short) 10 + "'", short47 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray51), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + short54 + "' != '" + (short) -1 + "'", short54 == (short) -1);
        org.junit.Assert.assertTrue("'" + short55 + "' != '" + (short) -1 + "'", short55 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray59), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short60 + "' != '" + (short) 10 + "'", short60 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray64), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray68), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short69 + "' != '" + (short) -1 + "'", short69 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray73), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short74 + "' != '" + (short) 10 + "'", short74 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray78), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(shortArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray82), "[100]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(shortArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray87), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short88 + "' != '" + (short) -1 + "'", short88 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + short91 + "' != '" + (short) -1 + "'", short91 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        long[] longArray4 = new long[] { 0, (short) 1, 52, (byte) 1 };
        long long5 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray10 = new long[] { 0L, 35, 32L, '#' };
        long[] longArray14 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray15 = new long[] {};
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(longArray14, longArray15);
        long long17 = org.apache.commons.lang.math.NumberUtils.max(longArray14);
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray14);
        long long19 = org.apache.commons.lang.math.NumberUtils.max(longArray14);
        long long20 = org.apache.commons.lang.math.NumberUtils.min(longArray14);
        long[] longArray24 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray25 = new long[] {};
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(longArray24, longArray25);
        long long27 = org.apache.commons.lang.math.NumberUtils.max(longArray24);
        long long28 = org.apache.commons.lang.math.NumberUtils.max(longArray24);
        long long29 = org.apache.commons.lang.math.NumberUtils.min(longArray24);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(longArray14, longArray24);
        long[] longArray34 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray35 = new long[] {};
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(longArray34, longArray35);
        long long37 = org.apache.commons.lang.math.NumberUtils.max(longArray34);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(longArray24, longArray34);
        long[] longArray42 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray43 = new long[] {};
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(longArray42, longArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(longArray34, longArray42);
        long long46 = org.apache.commons.lang.math.NumberUtils.min(longArray34);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(longArray10, longArray34);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray34);
        long[] longArray52 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray53 = new long[] {};
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(longArray52, longArray53);
        long long55 = org.apache.commons.lang.math.NumberUtils.max(longArray52);
        long long56 = org.apache.commons.lang.math.NumberUtils.max(longArray52);
        long long57 = org.apache.commons.lang.math.NumberUtils.max(longArray52);
        long long58 = org.apache.commons.lang.math.NumberUtils.min(longArray52);
        long[] longArray62 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray63 = new long[] {};
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(longArray62, longArray63);
        long long65 = org.apache.commons.lang.math.NumberUtils.max(longArray62);
        long long66 = org.apache.commons.lang.math.NumberUtils.max(longArray62);
        long long67 = org.apache.commons.lang.math.NumberUtils.min(longArray62);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(longArray52, longArray62);
        long[] longArray72 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray73 = new long[] {};
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(longArray72, longArray73);
        long long75 = org.apache.commons.lang.math.NumberUtils.max(longArray72);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(longArray62, longArray72);
        long[] longArray80 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray81 = new long[] {};
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(longArray80, longArray81);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(longArray72, longArray80);
        long long84 = org.apache.commons.lang.math.NumberUtils.min(longArray72);
        long[] longArray85 = new long[] {};
        long[] longArray87 = new long[] { (byte) -1 };
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(longArray85, longArray87);
        long long89 = org.apache.commons.lang.math.NumberUtils.max(longArray87);
        long[] longArray92 = new long[] { 52L, (short) 1 };
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(longArray87, longArray92);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(longArray72, longArray87);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(longArray34, longArray72);
        long long96 = org.apache.commons.lang.math.NumberUtils.min(longArray72);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[0, 1, 52, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[0, 35, 32, 35]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 52L + "'", long18 == 52L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 52L + "'", long28 == 52L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 52L + "'", long37 == 52L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 52L + "'", long55 == 52L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 52L + "'", long56 == 52L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 52L + "'", long57 == 52L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 52L + "'", long65 == 52L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 52L + "'", long66 == 52L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-1L) + "'", long67 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray73), "[]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 52L + "'", long75 == 52L);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray81), "[]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + (-1L) + "'", long84 == (-1L));
        org.junit.Assert.assertNotNull(longArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray85), "[]");
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray87), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + (-1L) + "'", long89 == (-1L));
        org.junit.Assert.assertNotNull(longArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray92), "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + (-1L) + "'", long96 == (-1L));
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte5 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte6 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte8 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        byte byte15 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        byte byte16 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte byte17 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray13);
        byte[] byteArray19 = null;
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(byteArray19, byteArray26);
        byte byte28 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte33 = org.apache.commons.lang.math.NumberUtils.max(byteArray32);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray32);
        byte byte35 = org.apache.commons.lang.math.NumberUtils.min(byteArray32);
        byte byte36 = org.apache.commons.lang.math.NumberUtils.min(byteArray32);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray32);
        byte byte38 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -1 + "'", byte17 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) -1 + "'", byte28 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 10 + "'", byte33 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) -1 + "'", byte35 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) -1 + "'", byte36 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 10 + "'", byte38 == (byte) 10);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte5 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte6 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte12 = org.apache.commons.lang.math.NumberUtils.max(byteArray11);
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(byteArray11, byteArray15);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte22 = org.apache.commons.lang.math.NumberUtils.max(byteArray21);
        byte byte23 = org.apache.commons.lang.math.NumberUtils.max(byteArray21);
        byte byte24 = org.apache.commons.lang.math.NumberUtils.min(byteArray21);
        byte byte25 = org.apache.commons.lang.math.NumberUtils.min(byteArray21);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(byteArray15, byteArray21);
        byte[] byteArray30 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte31 = org.apache.commons.lang.math.NumberUtils.max(byteArray30);
        byte[] byteArray32 = null;
        byte[] byteArray39 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(byteArray32, byteArray39);
        byte[] byteArray45 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(byteArray39, byteArray45);
        byte byte47 = org.apache.commons.lang.math.NumberUtils.max(byteArray39);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(byteArray30, byteArray39);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray30);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray21);
        byte byte51 = org.apache.commons.lang.math.NumberUtils.max(byteArray21);
        byte[] byteArray55 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte56 = org.apache.commons.lang.math.NumberUtils.max(byteArray55);
        byte[] byteArray59 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(byteArray55, byteArray59);
        byte[] byteArray65 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte66 = org.apache.commons.lang.math.NumberUtils.max(byteArray65);
        byte byte67 = org.apache.commons.lang.math.NumberUtils.max(byteArray65);
        byte byte68 = org.apache.commons.lang.math.NumberUtils.min(byteArray65);
        byte byte69 = org.apache.commons.lang.math.NumberUtils.min(byteArray65);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(byteArray59, byteArray65);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray59);
        byte[] byteArray76 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte77 = org.apache.commons.lang.math.NumberUtils.max(byteArray76);
        byte byte78 = org.apache.commons.lang.math.NumberUtils.max(byteArray76);
        byte byte79 = org.apache.commons.lang.math.NumberUtils.min(byteArray76);
        byte byte80 = org.apache.commons.lang.math.NumberUtils.min(byteArray76);
        byte[] byteArray85 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte86 = org.apache.commons.lang.math.NumberUtils.max(byteArray85);
        byte byte87 = org.apache.commons.lang.math.NumberUtils.max(byteArray85);
        byte byte88 = org.apache.commons.lang.math.NumberUtils.min(byteArray85);
        byte byte89 = org.apache.commons.lang.math.NumberUtils.min(byteArray85);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(byteArray76, byteArray85);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray76);
        byte byte92 = org.apache.commons.lang.math.NumberUtils.max(byteArray21);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 10 + "'", byte22 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 10 + "'", byte23 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) -1 + "'", byte24 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) -1 + "'", byte25 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 10 + "'", byte31 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + byte47 + "' != '" + (byte) 100 + "'", byte47 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) 10 + "'", byte51 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte56 + "' != '" + (byte) 10 + "'", byte56 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte66 + "' != '" + (byte) 10 + "'", byte66 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) 10 + "'", byte67 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte68 + "' != '" + (byte) -1 + "'", byte68 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte69 + "' != '" + (byte) -1 + "'", byte69 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte77 + "' != '" + (byte) 10 + "'", byte77 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte78 + "' != '" + (byte) 10 + "'", byte78 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte79 + "' != '" + (byte) -1 + "'", byte79 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte80 + "' != '" + (byte) -1 + "'", byte80 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte86 + "' != '" + (byte) 10 + "'", byte86 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte87 + "' != '" + (byte) 10 + "'", byte87 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte88 + "' != '" + (byte) -1 + "'", byte88 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte89 + "' != '" + (byte) -1 + "'", byte89 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + byte92 + "' != '" + (byte) 10 + "'", byte92 == (byte) 10);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        short[] shortArray3 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short4 = org.apache.commons.lang.math.NumberUtils.max(shortArray3);
        short[] shortArray8 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray8);
        short[] shortArray12 = new short[] { (short) -1, (short) -1 };
        short short13 = org.apache.commons.lang.math.NumberUtils.min(shortArray12);
        short[] shortArray17 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short18 = org.apache.commons.lang.math.NumberUtils.max(shortArray17);
        short[] shortArray22 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(shortArray17, shortArray22);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(shortArray12, shortArray17);
        short[] shortArray26 = new short[] { (short) 100 };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(shortArray12, shortArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray26);
        short short29 = org.apache.commons.lang.math.NumberUtils.max(shortArray3);
        short short30 = org.apache.commons.lang.math.NumberUtils.min(shortArray3);
        short short31 = org.apache.commons.lang.math.NumberUtils.min(shortArray3);
        short short32 = org.apache.commons.lang.math.NumberUtils.max(shortArray3);
        short[] shortArray36 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short37 = org.apache.commons.lang.math.NumberUtils.max(shortArray36);
        short[] shortArray41 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray41);
        short short43 = org.apache.commons.lang.math.NumberUtils.min(shortArray36);
        short[] shortArray46 = new short[] { (short) -1, (short) -1 };
        short short47 = org.apache.commons.lang.math.NumberUtils.min(shortArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray46);
        short short49 = org.apache.commons.lang.math.NumberUtils.max(shortArray46);
        short short50 = org.apache.commons.lang.math.NumberUtils.min(shortArray46);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray46);
        short[] shortArray54 = new short[] { (short) -1, (short) -1 };
        short short55 = org.apache.commons.lang.math.NumberUtils.min(shortArray54);
        short[] shortArray59 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short60 = org.apache.commons.lang.math.NumberUtils.max(shortArray59);
        short[] shortArray64 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(shortArray59, shortArray64);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(shortArray54, shortArray59);
        short short67 = org.apache.commons.lang.math.NumberUtils.min(shortArray59);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray59);
        short short69 = org.apache.commons.lang.math.NumberUtils.max(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 10 + "'", short29 == (short) 10);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 1 + "'", short30 == (short) 1);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 1 + "'", short31 == (short) 1);
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 10 + "'", short32 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) 10 + "'", short37 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + short43 + "' != '" + (short) 1 + "'", short43 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short47 + "' != '" + (short) -1 + "'", short47 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + short49 + "' != '" + (short) -1 + "'", short49 == (short) -1);
        org.junit.Assert.assertTrue("'" + short50 + "' != '" + (short) -1 + "'", short50 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short55 + "' != '" + (short) -1 + "'", short55 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray59), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short60 + "' != '" + (short) 10 + "'", short60 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray64), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + short67 + "' != '" + (short) 1 + "'", short67 == (short) 1);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + short69 + "' != '" + (short) 10 + "'", short69 == (short) 10);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte4 = org.apache.commons.lang.math.NumberUtils.max(byteArray3);
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray3, byteArray7);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        byte byte15 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        byte byte16 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte byte17 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray13);
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte23 = org.apache.commons.lang.math.NumberUtils.max(byteArray22);
        byte[] byteArray24 = null;
        byte[] byteArray31 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(byteArray24, byteArray31);
        byte[] byteArray37 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(byteArray31, byteArray37);
        byte byte39 = org.apache.commons.lang.math.NumberUtils.max(byteArray31);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(byteArray22, byteArray31);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray22);
        byte byte42 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte byte43 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte byte44 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        byte[] byteArray45 = null;
        byte[] byteArray52 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(byteArray45, byteArray52);
        byte byte54 = org.apache.commons.lang.math.NumberUtils.min(byteArray52);
        byte[] byteArray58 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte59 = org.apache.commons.lang.math.NumberUtils.max(byteArray58);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(byteArray52, byteArray58);
        byte byte61 = org.apache.commons.lang.math.NumberUtils.max(byteArray52);
        byte[] byteArray65 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte66 = org.apache.commons.lang.math.NumberUtils.max(byteArray65);
        byte[] byteArray67 = null;
        byte[] byteArray74 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(byteArray67, byteArray74);
        byte[] byteArray80 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(byteArray74, byteArray80);
        byte byte82 = org.apache.commons.lang.math.NumberUtils.max(byteArray74);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(byteArray65, byteArray74);
        byte byte84 = org.apache.commons.lang.math.NumberUtils.max(byteArray74);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(byteArray52, byteArray74);
        byte[] byteArray89 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte90 = org.apache.commons.lang.math.NumberUtils.max(byteArray89);
        byte[] byteArray93 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(byteArray89, byteArray93);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(byteArray74, byteArray93);
        byte byte96 = org.apache.commons.lang.math.NumberUtils.min(byteArray74);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray74);
        byte byte98 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -1 + "'", byte17 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 10 + "'", byte23 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 100 + "'", byte39 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) -1 + "'", byte42 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) -1 + "'", byte43 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) 10 + "'", byte44 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + byte54 + "' != '" + (byte) -1 + "'", byte54 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte59 + "' != '" + (byte) 10 + "'", byte59 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + byte61 + "' != '" + (byte) 100 + "'", byte61 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte66 + "' != '" + (byte) 10 + "'", byte66 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray80), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + byte82 + "' != '" + (byte) 100 + "'", byte82 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + byte84 + "' != '" + (byte) 100 + "'", byte84 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray89), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte90 + "' != '" + (byte) 10 + "'", byte90 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray93), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + byte96 + "' != '" + (byte) -1 + "'", byte96 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + byte98 + "' != '" + (byte) 10 + "'", byte98 == (byte) 10);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) '#', 1L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        float[] floatArray0 = new float[] {};
        float[] floatArray4 = new float[] { 0, 1.0f, 100 };
        float[] floatArray6 = new float[] { (-1L) };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray4);
        float[] floatArray12 = new float[] { 0, 1.0f, 100 };
        float[] floatArray14 = new float[] { (-1L) };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(floatArray12, floatArray14);
        float[] floatArray19 = new float[] { 0, ' ', 100.0f };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray19);
        float float21 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray14);
        float[] floatArray26 = new float[] { 0, 1.0f, 100 };
        float[] floatArray28 = new float[] { (-1L) };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(floatArray26, floatArray28);
        float[] floatArray33 = new float[] { 0, ' ', 100.0f };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(floatArray28, floatArray33);
        float float35 = org.apache.commons.lang.math.NumberUtils.min(floatArray33);
        float float36 = org.apache.commons.lang.math.NumberUtils.min(floatArray33);
        float float37 = org.apache.commons.lang.math.NumberUtils.max(floatArray33);
        float[] floatArray41 = new float[] { 0, 1.0f, 100 };
        float[] floatArray43 = new float[] { (-1L) };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(floatArray41, floatArray43);
        float float45 = org.apache.commons.lang.math.NumberUtils.max(floatArray41);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(floatArray33, floatArray41);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray41);
        float float48 = org.apache.commons.lang.math.NumberUtils.max(floatArray14);
        float float49 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        float float50 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 100.0f + "'", float37 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 100.0f + "'", float45 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + (-1.0f) + "'", float48 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + (-1.0f) + "'", float49 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + (-1.0f) + "'", float50 == (-1.0f));
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 100, (short) (byte) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float[] floatArray10 = new float[] { 0, 1.0f, 100 };
        float[] floatArray12 = new float[] { (-1L) };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray12);
        float[] floatArray17 = new float[] { 0, ' ', 100.0f };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(floatArray12, floatArray17);
        float float19 = org.apache.commons.lang.math.NumberUtils.min(floatArray17);
        float float20 = org.apache.commons.lang.math.NumberUtils.min(floatArray17);
        float float21 = org.apache.commons.lang.math.NumberUtils.max(floatArray17);
        float[] floatArray25 = new float[] { 0, 1.0f, 100 };
        float[] floatArray27 = new float[] { (-1L) };
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(floatArray25, floatArray27);
        float float29 = org.apache.commons.lang.math.NumberUtils.max(floatArray25);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(floatArray17, floatArray25);
        float float31 = org.apache.commons.lang.math.NumberUtils.min(floatArray17);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray17);
        float float33 = org.apache.commons.lang.math.NumberUtils.min(floatArray3);
        float float34 = org.apache.commons.lang.math.NumberUtils.min(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.0f + "'", float33 == 0.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.0f + "'", float34 == 0.0f);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) -1, 35, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte5 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte[] byteArray6 = null;
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(byteArray6, byteArray13);
        byte byte15 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte byte16 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        byte byte17 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte byte18 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray13);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte25 = org.apache.commons.lang.math.NumberUtils.max(byteArray24);
        byte[] byteArray26 = null;
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray33);
        byte byte35 = org.apache.commons.lang.math.NumberUtils.min(byteArray33);
        byte byte36 = org.apache.commons.lang.math.NumberUtils.max(byteArray33);
        byte byte37 = org.apache.commons.lang.math.NumberUtils.min(byteArray33);
        byte byte38 = org.apache.commons.lang.math.NumberUtils.max(byteArray33);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(byteArray24, byteArray33);
        byte byte40 = org.apache.commons.lang.math.NumberUtils.max(byteArray24);
        byte[] byteArray41 = null;
        byte[] byteArray48 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(byteArray41, byteArray48);
        byte byte50 = org.apache.commons.lang.math.NumberUtils.min(byteArray48);
        byte byte51 = org.apache.commons.lang.math.NumberUtils.max(byteArray48);
        byte byte52 = org.apache.commons.lang.math.NumberUtils.max(byteArray48);
        byte[] byteArray57 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte58 = org.apache.commons.lang.math.NumberUtils.max(byteArray57);
        byte byte59 = org.apache.commons.lang.math.NumberUtils.max(byteArray57);
        byte byte60 = org.apache.commons.lang.math.NumberUtils.min(byteArray57);
        byte byte61 = org.apache.commons.lang.math.NumberUtils.min(byteArray57);
        byte byte62 = org.apache.commons.lang.math.NumberUtils.min(byteArray57);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(byteArray48, byteArray57);
        byte[] byteArray64 = null;
        byte[] byteArray71 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(byteArray64, byteArray71);
        byte byte73 = org.apache.commons.lang.math.NumberUtils.min(byteArray71);
        byte[] byteArray77 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte78 = org.apache.commons.lang.math.NumberUtils.max(byteArray77);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(byteArray71, byteArray77);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(byteArray57, byteArray77);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(byteArray24, byteArray77);
        byte byte82 = org.apache.commons.lang.math.NumberUtils.min(byteArray24);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray24);
        byte byte84 = org.apache.commons.lang.math.NumberUtils.min(byteArray24);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 100 + "'", byte16 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -1 + "'", byte17 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 10 + "'", byte25 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) -1 + "'", byte35 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) 100 + "'", byte36 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) -1 + "'", byte37 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 100 + "'", byte38 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) 10 + "'", byte40 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) -1 + "'", byte50 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) 100 + "'", byte51 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 100 + "'", byte52 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte58 + "' != '" + (byte) 10 + "'", byte58 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte59 + "' != '" + (byte) 10 + "'", byte59 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte60 + "' != '" + (byte) -1 + "'", byte60 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte61 + "' != '" + (byte) -1 + "'", byte61 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte62 + "' != '" + (byte) -1 + "'", byte62 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + byte73 + "' != '" + (byte) -1 + "'", byte73 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte78 + "' != '" + (byte) 10 + "'", byte78 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + byte82 + "' != '" + (byte) -1 + "'", byte82 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + byte84 + "' != '" + (byte) -1 + "'", byte84 == (byte) -1);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 0, 100, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 32L, (float) 'a', (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 97L, (float) '#', (float) 52L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 100, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 100L, 100.0d, (double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 100L, 1.0f };
        double[] doubleArray7 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray3, doubleArray7);
        double[] doubleArray11 = new double[] { 100L, 1.0f };
        double[] doubleArray15 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray7, doubleArray11);
        double double18 = org.apache.commons.lang.math.NumberUtils.min(doubleArray11);
        double double19 = org.apache.commons.lang.math.NumberUtils.max(doubleArray11);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray11);
        double double21 = org.apache.commons.lang.math.NumberUtils.max(doubleArray11);
        double[] doubleArray24 = new double[] { 100L, 1.0f };
        double[] doubleArray28 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray24, doubleArray28);
        double[] doubleArray32 = new double[] { 100L, 1.0f };
        double[] doubleArray36 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray32, doubleArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray24, doubleArray32);
        double[] doubleArray41 = new double[] { 100L, 1.0f };
        double[] doubleArray45 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray41, doubleArray45);
        double[] doubleArray49 = new double[] { 100L, 1.0f };
        double[] doubleArray53 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray49, doubleArray53);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray45, doubleArray49);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray24, doubleArray49);
        double[] doubleArray59 = new double[] { 100L, 1.0f };
        double[] doubleArray63 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray59, doubleArray63);
        double[] doubleArray67 = new double[] { 100L, 1.0f };
        double[] doubleArray71 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray67, doubleArray71);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray63, doubleArray67);
        double double74 = org.apache.commons.lang.math.NumberUtils.min(doubleArray63);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray24, doubleArray63);
        double double76 = org.apache.commons.lang.math.NumberUtils.min(doubleArray63);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray63);
        double double78 = org.apache.commons.lang.math.NumberUtils.min(doubleArray63);
        double double79 = org.apache.commons.lang.math.NumberUtils.max(doubleArray63);
        double double80 = org.apache.commons.lang.math.NumberUtils.max(doubleArray63);
        double[] doubleArray83 = new double[] { 100L, 1.0f };
        double[] doubleArray87 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray83, doubleArray87);
        double double89 = org.apache.commons.lang.math.NumberUtils.max(doubleArray83);
        double double90 = org.apache.commons.lang.math.NumberUtils.min(doubleArray83);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray63, doubleArray83);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 1.0d + "'", double74 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 1.0d + "'", double76 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 1.0d + "'", double78 == 1.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 100.0d + "'", double79 == 100.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 100.0d + "'", double80 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 100.0d + "'", double89 == 100.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 1.0d + "'", double90 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        short[] shortArray4 = new short[] { (byte) -1, (short) 100, (byte) -1, (byte) -1 };
        short short5 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        short[] shortArray8 = new short[] { (short) -1, (short) -1 };
        short short9 = org.apache.commons.lang.math.NumberUtils.min(shortArray8);
        short[] shortArray13 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short14 = org.apache.commons.lang.math.NumberUtils.max(shortArray13);
        short[] shortArray18 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(shortArray13, shortArray18);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(shortArray8, shortArray13);
        short[] shortArray22 = new short[] { (short) 100 };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(shortArray8, shortArray22);
        short short24 = org.apache.commons.lang.math.NumberUtils.min(shortArray22);
        short short25 = org.apache.commons.lang.math.NumberUtils.max(shortArray22);
        short short26 = org.apache.commons.lang.math.NumberUtils.min(shortArray22);
        short short27 = org.apache.commons.lang.math.NumberUtils.min(shortArray22);
        short[] shortArray31 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short32 = org.apache.commons.lang.math.NumberUtils.max(shortArray31);
        short[] shortArray36 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(shortArray31, shortArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(shortArray22, shortArray31);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray22);
        short short40 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        short short41 = org.apache.commons.lang.math.NumberUtils.min(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 100, -1, -1]");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[100]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 100 + "'", short24 == (short) 100);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 100 + "'", short25 == (short) 100);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 100 + "'", short26 == (short) 100);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 100 + "'", short27 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 10 + "'", short32 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + short40 + "' != '" + (short) 100 + "'", short40 == (short) 100);
        org.junit.Assert.assertTrue("'" + short41 + "' != '" + (short) -1 + "'", short41 == (short) -1);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) (byte) 100, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        int[] intArray6 = new int[] { (short) 0, '4', (byte) 0, (short) 1, (short) 10, '#' };
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray6);
        int int8 = org.apache.commons.lang.math.NumberUtils.min(intArray6);
        int[] intArray15 = new int[] { (short) 0, '4', (byte) 0, (short) 1, (short) 10, '#' };
        int int16 = org.apache.commons.lang.math.NumberUtils.min(intArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray15);
        int[] intArray22 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray27 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(intArray22, intArray27);
        int int29 = org.apache.commons.lang.math.NumberUtils.min(intArray27);
        int[] intArray35 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int36 = org.apache.commons.lang.math.NumberUtils.max(intArray35);
        int int37 = org.apache.commons.lang.math.NumberUtils.max(intArray35);
        int int38 = org.apache.commons.lang.math.NumberUtils.max(intArray35);
        int[] intArray43 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray48 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(intArray43, intArray48);
        int int50 = org.apache.commons.lang.math.NumberUtils.min(intArray48);
        int int51 = org.apache.commons.lang.math.NumberUtils.min(intArray48);
        int int52 = org.apache.commons.lang.math.NumberUtils.max(intArray48);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray48);
        int int54 = org.apache.commons.lang.math.NumberUtils.max(intArray35);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(intArray27, intArray35);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(intArray15, intArray35);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 52, 0, 1, 10, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 52, 0, 1, 10, 35]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) '4', (float) (short) 0, (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 10, (long) (byte) 1, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        float[] floatArray4 = new float[] { 0.0f, 35, (-1), 35 };
        float[] floatArray5 = new float[] {};
        float[] floatArray9 = new float[] { 0, 1.0f, 100 };
        float[] floatArray11 = new float[] { (-1L) };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray9);
        float float14 = org.apache.commons.lang.math.NumberUtils.max(floatArray9);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray9);
        float float16 = org.apache.commons.lang.math.NumberUtils.max(floatArray9);
        float[] floatArray20 = new float[] { 0, 1.0f, 100 };
        float[] floatArray22 = new float[] { (-1L) };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(floatArray20, floatArray22);
        float[] floatArray27 = new float[] { 0, ' ', 100.0f };
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(floatArray22, floatArray27);
        float[] floatArray29 = new float[] {};
        float[] floatArray33 = new float[] { 0, 1.0f, 100 };
        float[] floatArray35 = new float[] { (-1L) };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(floatArray33, floatArray35);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(floatArray29, floatArray33);
        float[] floatArray41 = new float[] { 0, 1.0f, 100 };
        float[] floatArray43 = new float[] { (-1L) };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(floatArray41, floatArray43);
        float[] floatArray48 = new float[] { 0, ' ', 100.0f };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(floatArray43, floatArray48);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(floatArray29, floatArray43);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(floatArray27, floatArray43);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray43);
        float[] floatArray56 = new float[] { 0, 1.0f, 100 };
        float[] floatArray58 = new float[] { (-1L) };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(floatArray56, floatArray58);
        float[] floatArray63 = new float[] { 0, ' ', 100.0f };
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(floatArray58, floatArray63);
        float float65 = org.apache.commons.lang.math.NumberUtils.min(floatArray63);
        float float66 = org.apache.commons.lang.math.NumberUtils.min(floatArray63);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray63);
        float[] floatArray72 = new float[] { 0.0f, 35, (-1), 35 };
        float[] floatArray73 = new float[] {};
        float[] floatArray77 = new float[] { 0, 1.0f, 100 };
        float[] floatArray79 = new float[] { (-1L) };
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(floatArray77, floatArray79);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(floatArray73, floatArray77);
        float float82 = org.apache.commons.lang.math.NumberUtils.max(floatArray77);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(floatArray72, floatArray77);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray77);
        float float85 = org.apache.commons.lang.math.NumberUtils.max(floatArray77);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 35.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(floatArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray48), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(floatArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray56), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray58), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(floatArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray63), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + float65 + "' != '" + 0.0f + "'", float65 == 0.0f);
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + 0.0f + "'", float66 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(floatArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray72), "[0.0, 35.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray73), "[]");
        org.junit.Assert.assertNotNull(floatArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray77), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray79), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + float82 + "' != '" + 100.0f + "'", float82 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + float85 + "' != '" + 100.0f + "'", float85 == 100.0f);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double double8 = org.apache.commons.lang.math.NumberUtils.max(doubleArray2);
        double double9 = org.apache.commons.lang.math.NumberUtils.min(doubleArray2);
        double double10 = org.apache.commons.lang.math.NumberUtils.max(doubleArray2);
        double[] doubleArray13 = new double[] { 100L, 1.0f };
        double[] doubleArray17 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray13, doubleArray17);
        double[] doubleArray21 = new double[] { 100L, 1.0f };
        double[] doubleArray25 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray25);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray13, doubleArray21);
        double[] doubleArray30 = new double[] { 100L, 1.0f };
        double[] doubleArray34 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray34);
        double[] doubleArray38 = new double[] { 100L, 1.0f };
        double[] doubleArray42 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray38, doubleArray42);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray34, doubleArray38);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray13, doubleArray38);
        double double46 = org.apache.commons.lang.math.NumberUtils.min(doubleArray38);
        double[] doubleArray49 = new double[] { 100L, 1.0f };
        double[] doubleArray53 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray49, doubleArray53);
        double double55 = org.apache.commons.lang.math.NumberUtils.max(doubleArray49);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray38, doubleArray49);
        double double57 = org.apache.commons.lang.math.NumberUtils.max(doubleArray49);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray49);
        double double59 = org.apache.commons.lang.math.NumberUtils.min(doubleArray2);
        double double60 = org.apache.commons.lang.math.NumberUtils.min(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 100.0d + "'", double55 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 100.0d + "'", double57 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 1.0d + "'", double59 == 1.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        float[] floatArray0 = new float[] {};
        float[] floatArray4 = new float[] { 0, 1.0f, 100 };
        float[] floatArray6 = new float[] { (-1L) };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray4);
        float[] floatArray12 = new float[] { 0, 1.0f, 100 };
        float[] floatArray14 = new float[] { (-1L) };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(floatArray12, floatArray14);
        float[] floatArray19 = new float[] { 0, ' ', 100.0f };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray19);
        float float21 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray14);
        float float23 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        float float24 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        float float25 = org.apache.commons.lang.math.NumberUtils.max(floatArray14);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-1.0f) + "'", float23 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-1.0f) + "'", float24 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-1.0f) + "'", float25 == (-1.0f));
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        short[] shortArray3 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short4 = org.apache.commons.lang.math.NumberUtils.max(shortArray3);
        short[] shortArray8 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray8);
        short[] shortArray11 = new short[] { (byte) 1 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        short[] shortArray14 = new short[] { (short) -1 };
        short short15 = org.apache.commons.lang.math.NumberUtils.max(shortArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray14);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray8, shortArray11);
        short short18 = org.apache.commons.lang.math.NumberUtils.max(shortArray11);
        short[] shortArray21 = new short[] { (short) -1, (short) -1 };
        short short22 = org.apache.commons.lang.math.NumberUtils.min(shortArray21);
        short[] shortArray26 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short27 = org.apache.commons.lang.math.NumberUtils.max(shortArray26);
        short[] shortArray31 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(shortArray26, shortArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(shortArray21, shortArray26);
        short[] shortArray35 = new short[] { (short) 100 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(shortArray21, shortArray35);
        short short37 = org.apache.commons.lang.math.NumberUtils.min(shortArray35);
        short short38 = org.apache.commons.lang.math.NumberUtils.max(shortArray35);
        short short39 = org.apache.commons.lang.math.NumberUtils.min(shortArray35);
        short[] shortArray41 = new short[] { (byte) 1 };
        short short42 = org.apache.commons.lang.math.NumberUtils.min(shortArray41);
        short[] shortArray44 = new short[] { (short) -1 };
        short short45 = org.apache.commons.lang.math.NumberUtils.max(shortArray44);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(shortArray41, shortArray44);
        short[] shortArray48 = new short[] { (byte) 1 };
        short short49 = org.apache.commons.lang.math.NumberUtils.min(shortArray48);
        short[] shortArray51 = new short[] { (short) -1 };
        short short52 = org.apache.commons.lang.math.NumberUtils.max(shortArray51);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(shortArray48, shortArray51);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(shortArray44, shortArray51);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(shortArray35, shortArray51);
        short short56 = org.apache.commons.lang.math.NumberUtils.min(shortArray35);
        short short57 = org.apache.commons.lang.math.NumberUtils.min(shortArray35);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray35);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[1]");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 1 + "'", short12 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[-1]");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) -1 + "'", short15 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 1 + "'", short18 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 10 + "'", short27 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[100]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) 100 + "'", short37 == (short) 100);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) 100 + "'", short38 == (short) 100);
        org.junit.Assert.assertTrue("'" + short39 + "' != '" + (short) 100 + "'", short39 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[1]");
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) 1 + "'", short42 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray44), "[-1]");
        org.junit.Assert.assertTrue("'" + short45 + "' != '" + (short) -1 + "'", short45 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray48), "[1]");
        org.junit.Assert.assertTrue("'" + short49 + "' != '" + (short) 1 + "'", short49 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray51), "[-1]");
        org.junit.Assert.assertTrue("'" + short52 + "' != '" + (short) -1 + "'", short52 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + short56 + "' != '" + (short) 100 + "'", short56 == (short) 100);
        org.junit.Assert.assertTrue("'" + short57 + "' != '" + (short) 100 + "'", short57 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray17 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int18 = org.apache.commons.lang.math.NumberUtils.max(intArray17);
        int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray17);
        int int20 = org.apache.commons.lang.math.NumberUtils.max(intArray17);
        int int21 = org.apache.commons.lang.math.NumberUtils.max(intArray17);
        int int22 = org.apache.commons.lang.math.NumberUtils.min(intArray17);
        int[] intArray27 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray32 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(intArray27, intArray32);
        int[] intArray38 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray43 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(intArray38, intArray43);
        int int45 = org.apache.commons.lang.math.NumberUtils.min(intArray43);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(intArray32, intArray43);
        int int47 = org.apache.commons.lang.math.NumberUtils.min(intArray32);
        int[] intArray52 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray57 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(intArray52, intArray57);
        int int59 = org.apache.commons.lang.math.NumberUtils.max(intArray57);
        int int60 = org.apache.commons.lang.math.NumberUtils.min(intArray57);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(intArray32, intArray57);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray57);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray17);
        int[] intArray69 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int70 = org.apache.commons.lang.math.NumberUtils.max(intArray69);
        int int71 = org.apache.commons.lang.math.NumberUtils.max(intArray69);
        int int72 = org.apache.commons.lang.math.NumberUtils.max(intArray69);
        int int73 = org.apache.commons.lang.math.NumberUtils.max(intArray69);
        int int74 = org.apache.commons.lang.math.NumberUtils.max(intArray69);
        int int75 = org.apache.commons.lang.math.NumberUtils.max(intArray69);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray69);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 100 + "'", int70 == 100);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 100 + "'", int71 == 100);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 100 + "'", int72 == 100);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 100 + "'", int73 == 100);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 100 + "'", int74 == 100);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 100 + "'", int75 == 100);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 1, (long) 97, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        int[] intArray5 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int6 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int int8 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang.math.NumberUtils.min(intArray5);
        int[] intArray15 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray20 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray15, intArray20);
        int[] intArray26 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray31 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(intArray26, intArray31);
        int int33 = org.apache.commons.lang.math.NumberUtils.min(intArray31);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(intArray20, intArray31);
        int int35 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
        int[] intArray40 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray45 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(intArray40, intArray45);
        int int47 = org.apache.commons.lang.math.NumberUtils.max(intArray45);
        int int48 = org.apache.commons.lang.math.NumberUtils.min(intArray45);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(intArray20, intArray45);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(intArray5, intArray45);
        int int51 = org.apache.commons.lang.math.NumberUtils.min(intArray5);
        int int52 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte5 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte6 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte8 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        byte byte15 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        byte byte16 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte byte17 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray13);
        byte[] byteArray19 = null;
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(byteArray19, byteArray26);
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray32);
        byte byte34 = org.apache.commons.lang.math.NumberUtils.max(byteArray26);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray26);
        byte[] byteArray36 = null;
        byte[] byteArray43 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(byteArray36, byteArray43);
        byte byte45 = org.apache.commons.lang.math.NumberUtils.min(byteArray43);
        byte[] byteArray49 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte50 = org.apache.commons.lang.math.NumberUtils.max(byteArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(byteArray43, byteArray49);
        byte byte52 = org.apache.commons.lang.math.NumberUtils.max(byteArray43);
        byte[] byteArray56 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte57 = org.apache.commons.lang.math.NumberUtils.max(byteArray56);
        byte[] byteArray58 = null;
        byte[] byteArray65 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(byteArray58, byteArray65);
        byte[] byteArray71 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(byteArray65, byteArray71);
        byte byte73 = org.apache.commons.lang.math.NumberUtils.max(byteArray65);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(byteArray56, byteArray65);
        byte byte75 = org.apache.commons.lang.math.NumberUtils.max(byteArray65);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(byteArray43, byteArray65);
        byte[] byteArray80 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte81 = org.apache.commons.lang.math.NumberUtils.max(byteArray80);
        byte[] byteArray84 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(byteArray80, byteArray84);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(byteArray65, byteArray80);
        byte[] byteArray90 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte91 = org.apache.commons.lang.math.NumberUtils.max(byteArray90);
        byte[] byteArray94 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(byteArray90, byteArray94);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(byteArray80, byteArray90);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray80);
        byte byte98 = org.apache.commons.lang.math.NumberUtils.min(byteArray80);
        byte byte99 = org.apache.commons.lang.math.NumberUtils.max(byteArray80);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -1 + "'", byte17 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) 100 + "'", byte34 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) -1 + "'", byte45 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) 10 + "'", byte50 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 100 + "'", byte52 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte57 + "' != '" + (byte) 10 + "'", byte57 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + byte73 + "' != '" + (byte) 100 + "'", byte73 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + byte75 + "' != '" + (byte) 100 + "'", byte75 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray80), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte81 + "' != '" + (byte) 10 + "'", byte81 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray90), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte91 + "' != '" + (byte) 10 + "'", byte91 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray94), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + byte98 + "' != '" + (byte) -1 + "'", byte98 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte99 + "' != '" + (byte) 10 + "'", byte99 == (byte) 10);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) ' ', (float) '4', (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) -1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte15 = org.apache.commons.lang.math.NumberUtils.max(byteArray14);
        byte byte16 = org.apache.commons.lang.math.NumberUtils.max(byteArray14);
        byte byte17 = org.apache.commons.lang.math.NumberUtils.min(byteArray14);
        byte byte18 = org.apache.commons.lang.math.NumberUtils.min(byteArray14);
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte24 = org.apache.commons.lang.math.NumberUtils.max(byteArray23);
        byte[] byteArray25 = null;
        byte[] byteArray32 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(byteArray25, byteArray32);
        byte byte34 = org.apache.commons.lang.math.NumberUtils.min(byteArray32);
        byte byte35 = org.apache.commons.lang.math.NumberUtils.max(byteArray32);
        byte byte36 = org.apache.commons.lang.math.NumberUtils.min(byteArray32);
        byte byte37 = org.apache.commons.lang.math.NumberUtils.max(byteArray32);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(byteArray23, byteArray32);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(byteArray14, byteArray23);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray14);
        byte byte41 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 10 + "'", byte16 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -1 + "'", byte17 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) -1 + "'", byte18 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 10 + "'", byte24 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) -1 + "'", byte34 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 100 + "'", byte35 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) -1 + "'", byte36 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 100 + "'", byte37 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 100 + "'", byte41 == (byte) 100);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        float[] floatArray0 = new float[] {};
        float[] floatArray4 = new float[] { 0, 1.0f, 100 };
        float[] floatArray6 = new float[] { (-1L) };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray4);
        float[] floatArray12 = new float[] { 0, 1.0f, 100 };
        float[] floatArray14 = new float[] { (-1L) };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(floatArray12, floatArray14);
        float[] floatArray19 = new float[] { 0, ' ', 100.0f };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray14);
        float float22 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        float float23 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        float float24 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        float[] floatArray28 = new float[] { 0, 1.0f, 100 };
        float[] floatArray30 = new float[] { (-1L) };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(floatArray28, floatArray30);
        float[] floatArray35 = new float[] { 0, ' ', 100.0f };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(floatArray30, floatArray35);
        float float37 = org.apache.commons.lang.math.NumberUtils.min(floatArray30);
        float float38 = org.apache.commons.lang.math.NumberUtils.max(floatArray30);
        float float39 = org.apache.commons.lang.math.NumberUtils.max(floatArray30);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray30);
        float float41 = org.apache.commons.lang.math.NumberUtils.min(floatArray30);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + (-1.0f) + "'", float22 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-1.0f) + "'", float23 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-1.0f) + "'", float24 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + (-1.0f) + "'", float37 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + (-1.0f) + "'", float38 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + (-1.0f) + "'", float39 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + (-1.0f) + "'", float41 == (-1.0f));
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(35.0f, (float) (byte) 100, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 100, 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) 'a', 0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 1, (long) 52, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int int12 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int[] intArray17 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray22 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray22);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray17);
        int int25 = org.apache.commons.lang.math.NumberUtils.min(intArray17);
        int int26 = org.apache.commons.lang.math.NumberUtils.max(intArray17);
        int int27 = org.apache.commons.lang.math.NumberUtils.max(intArray17);
        int int28 = org.apache.commons.lang.math.NumberUtils.max(intArray17);
        int[] intArray34 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int35 = org.apache.commons.lang.math.NumberUtils.max(intArray34);
        int int36 = org.apache.commons.lang.math.NumberUtils.min(intArray34);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray34);
        int int38 = org.apache.commons.lang.math.NumberUtils.max(intArray34);
        int int39 = org.apache.commons.lang.math.NumberUtils.max(intArray34);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float[] floatArray10 = new float[] { (short) 0, (byte) 0, (byte) 100 };
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray10);
        float[] floatArray16 = new float[] { 0, 1.0f, 100 };
        float[] floatArray18 = new float[] { (-1L) };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(floatArray16, floatArray18);
        float[] floatArray23 = new float[] { 0, 1.0f, 100 };
        float[] floatArray25 = new float[] { (-1L) };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(floatArray23, floatArray25);
        float float27 = org.apache.commons.lang.math.NumberUtils.max(floatArray23);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(floatArray16, floatArray23);
        float float29 = org.apache.commons.lang.math.NumberUtils.max(floatArray16);
        float[] floatArray30 = new float[] {};
        float[] floatArray34 = new float[] { 0, 1.0f, 100 };
        float[] floatArray36 = new float[] { (-1L) };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(floatArray34, floatArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(floatArray30, floatArray34);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(floatArray16, floatArray34);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray16);
        float[] floatArray41 = new float[] {};
        float[] floatArray45 = new float[] { 0, 1.0f, 100 };
        float[] floatArray47 = new float[] { (-1L) };
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(floatArray45, floatArray47);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(floatArray41, floatArray45);
        float[] floatArray53 = new float[] { 0, 1.0f, 100 };
        float[] floatArray55 = new float[] { (-1L) };
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(floatArray53, floatArray55);
        float[] floatArray60 = new float[] { 0, ' ', 100.0f };
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(floatArray55, floatArray60);
        float float62 = org.apache.commons.lang.math.NumberUtils.min(floatArray55);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(floatArray45, floatArray55);
        float float64 = org.apache.commons.lang.math.NumberUtils.max(floatArray45);
        float float65 = org.apache.commons.lang.math.NumberUtils.max(floatArray45);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(floatArray16, floatArray45);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[]");
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray45), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray47), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray55), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(floatArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray60), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + (-1.0f) + "'", float62 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 100.0f + "'", float64 == 100.0f);
        org.junit.Assert.assertTrue("'" + float65 + "' != '" + 100.0f + "'", float65 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray13);
        byte byte16 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte21 = org.apache.commons.lang.math.NumberUtils.max(byteArray20);
        byte[] byteArray22 = null;
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(byteArray22, byteArray29);
        byte[] byteArray35 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(byteArray29, byteArray35);
        byte byte37 = org.apache.commons.lang.math.NumberUtils.max(byteArray29);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(byteArray20, byteArray29);
        byte byte39 = org.apache.commons.lang.math.NumberUtils.max(byteArray29);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray29);
        byte[] byteArray44 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte45 = org.apache.commons.lang.math.NumberUtils.max(byteArray44);
        byte[] byteArray48 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(byteArray44, byteArray48);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(byteArray29, byteArray48);
        byte[] byteArray51 = null;
        byte[] byteArray58 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(byteArray51, byteArray58);
        byte byte60 = org.apache.commons.lang.math.NumberUtils.min(byteArray58);
        byte[] byteArray61 = null;
        byte[] byteArray68 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(byteArray61, byteArray68);
        byte byte70 = org.apache.commons.lang.math.NumberUtils.min(byteArray68);
        byte[] byteArray74 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte75 = org.apache.commons.lang.math.NumberUtils.max(byteArray74);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(byteArray68, byteArray74);
        byte byte77 = org.apache.commons.lang.math.NumberUtils.min(byteArray74);
        byte byte78 = org.apache.commons.lang.math.NumberUtils.max(byteArray74);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(byteArray58, byteArray74);
        byte byte80 = org.apache.commons.lang.math.NumberUtils.min(byteArray58);
        byte byte81 = org.apache.commons.lang.math.NumberUtils.min(byteArray58);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(byteArray48, byteArray58);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 100 + "'", byte16 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 10 + "'", byte21 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 100 + "'", byte37 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 100 + "'", byte39 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 10 + "'", byte45 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + byte60 + "' != '" + (byte) -1 + "'", byte60 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + byte70 + "' != '" + (byte) -1 + "'", byte70 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte75 + "' != '" + (byte) 10 + "'", byte75 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + byte77 + "' != '" + (byte) -1 + "'", byte77 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte78 + "' != '" + (byte) 10 + "'", byte78 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + byte80 + "' != '" + (byte) -1 + "'", byte80 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte81 + "' != '" + (byte) -1 + "'", byte81 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 32L, 32.0f, (float) '4');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) '4', 0L, (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int int12 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int[] intArray17 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray22 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray22);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray17);
        int int25 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int int26 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray31 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray36 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(intArray31, intArray36);
        int int38 = org.apache.commons.lang.math.NumberUtils.min(intArray36);
        int int39 = org.apache.commons.lang.math.NumberUtils.min(intArray36);
        int[] intArray44 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray49 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(intArray44, intArray49);
        int int51 = org.apache.commons.lang.math.NumberUtils.max(intArray49);
        int int52 = org.apache.commons.lang.math.NumberUtils.min(intArray49);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(intArray36, intArray49);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray36);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float[] floatArray7 = new float[] {};
        float[] floatArray11 = new float[] { 0, 1.0f, 100 };
        float[] floatArray13 = new float[] { (-1L) };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(floatArray11, floatArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(floatArray7, floatArray11);
        float float16 = org.apache.commons.lang.math.NumberUtils.max(floatArray11);
        float float17 = org.apache.commons.lang.math.NumberUtils.min(floatArray11);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray11);
        float float19 = org.apache.commons.lang.math.NumberUtils.min(floatArray11);
        float[] floatArray23 = new float[] { 0, 1.0f, 100 };
        float[] floatArray25 = new float[] { (-1L) };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(floatArray23, floatArray25);
        float float27 = org.apache.commons.lang.math.NumberUtils.min(floatArray25);
        float float28 = org.apache.commons.lang.math.NumberUtils.max(floatArray25);
        float float29 = org.apache.commons.lang.math.NumberUtils.min(floatArray25);
        float[] floatArray33 = new float[] { 0, 1.0f, 100 };
        float[] floatArray35 = new float[] { (-1L) };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(floatArray33, floatArray35);
        float[] floatArray41 = new float[] { 0.0f, 35, (-1), 35 };
        float[] floatArray42 = new float[] {};
        float[] floatArray46 = new float[] { 0, 1.0f, 100 };
        float[] floatArray48 = new float[] { (-1L) };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(floatArray46, floatArray48);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(floatArray42, floatArray46);
        float float51 = org.apache.commons.lang.math.NumberUtils.max(floatArray46);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(floatArray41, floatArray46);
        float float53 = org.apache.commons.lang.math.NumberUtils.max(floatArray46);
        float float54 = org.apache.commons.lang.math.NumberUtils.max(floatArray46);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(floatArray33, floatArray46);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(floatArray25, floatArray46);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(floatArray11, floatArray25);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-1.0f) + "'", float27 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + (-1.0f) + "'", float29 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[0.0, 35.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray42), "[]");
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray46), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray48), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 100.0f + "'", float51 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 100.0f + "'", float53 == 100.0f);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 100.0f + "'", float54 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(100.0f, (float) 'a', (float) 52);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double[] doubleArray10 = new double[] { 100L, 1.0f };
        double[] doubleArray14 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray10);
        double[] doubleArray19 = new double[] { 100L, 1.0f };
        double[] doubleArray23 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray19, doubleArray23);
        double[] doubleArray27 = new double[] { 100L, 1.0f };
        double[] doubleArray31 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray23, doubleArray27);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray27);
        double[] doubleArray37 = new double[] { 100L, 1.0f };
        double[] doubleArray41 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray41);
        double[] doubleArray45 = new double[] { 100L, 1.0f };
        double[] doubleArray49 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray45, doubleArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray45);
        double[] doubleArray54 = new double[] { 100L, 1.0f };
        double[] doubleArray58 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray54, doubleArray58);
        double[] doubleArray62 = new double[] { 100L, 1.0f };
        double[] doubleArray66 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray62, doubleArray66);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray58, doubleArray62);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray62);
        double double70 = org.apache.commons.lang.math.NumberUtils.min(doubleArray62);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray62);
        double double72 = org.apache.commons.lang.math.NumberUtils.min(doubleArray27);
        double double73 = org.apache.commons.lang.math.NumberUtils.max(doubleArray27);
        double[] doubleArray76 = new double[] { 100L, 1.0f };
        double[] doubleArray80 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray76, doubleArray80);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray76);
        double double83 = org.apache.commons.lang.math.NumberUtils.min(doubleArray76);
        double[] doubleArray85 = new double[] { '#' };
        double double86 = org.apache.commons.lang.math.NumberUtils.min(doubleArray85);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray76, doubleArray85);
        double double88 = org.apache.commons.lang.math.NumberUtils.max(doubleArray85);
        double double89 = org.apache.commons.lang.math.NumberUtils.min(doubleArray85);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 1.0d + "'", double70 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 100.0d + "'", double73 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 1.0d + "'", double83 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[35.0]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 35.0d + "'", double86 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 35.0d + "'", double88 == 35.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 35.0d + "'", double89 == 35.0d);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 32, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte5 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte6 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte8 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        byte[] byteArray15 = null;
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray15, byteArray22);
        byte byte24 = org.apache.commons.lang.math.NumberUtils.min(byteArray22);
        byte byte25 = org.apache.commons.lang.math.NumberUtils.max(byteArray22);
        byte byte26 = org.apache.commons.lang.math.NumberUtils.min(byteArray22);
        byte byte27 = org.apache.commons.lang.math.NumberUtils.max(byteArray22);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray22);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray13);
        byte[] byteArray34 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte35 = org.apache.commons.lang.math.NumberUtils.max(byteArray34);
        byte[] byteArray36 = null;
        byte[] byteArray43 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(byteArray36, byteArray43);
        byte byte45 = org.apache.commons.lang.math.NumberUtils.min(byteArray43);
        byte byte46 = org.apache.commons.lang.math.NumberUtils.max(byteArray43);
        byte byte47 = org.apache.commons.lang.math.NumberUtils.min(byteArray43);
        byte byte48 = org.apache.commons.lang.math.NumberUtils.max(byteArray43);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(byteArray34, byteArray43);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray34);
        byte byte51 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte52 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) -1 + "'", byte24 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 100 + "'", byte25 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) -1 + "'", byte26 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 100 + "'", byte27 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 10 + "'", byte35 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) -1 + "'", byte45 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) 100 + "'", byte46 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte47 + "' != '" + (byte) -1 + "'", byte47 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte48 + "' != '" + (byte) 100 + "'", byte48 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) 10 + "'", byte51 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) -1 + "'", byte52 == (byte) -1);
    }
}

