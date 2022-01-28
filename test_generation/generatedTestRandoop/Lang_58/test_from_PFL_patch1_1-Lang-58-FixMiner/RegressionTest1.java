import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) -1, 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 'a', 32.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 10L, (double) (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) -1, (int) (byte) 100, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
        java.lang.Class<?> wildcardClass29 = shortArray3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((-1.0d), (double) '#', (double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) -1, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 1, 32, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) (byte) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (byte) -1, (double) 35, (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 1, 0.0d, (double) 52L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) '#', (long) (short) 1, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
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
        float float24 = org.apache.commons.lang.math.NumberUtils.max(floatArray18);
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
        float[] floatArray51 = new float[] { 0, 1.0f, 100 };
        float[] floatArray53 = new float[] { (-1L) };
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(floatArray51, floatArray53);
        float[] floatArray58 = new float[] { 0, ' ', 100.0f };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(floatArray53, floatArray58);
        float float60 = org.apache.commons.lang.math.NumberUtils.min(floatArray58);
        float float61 = org.apache.commons.lang.math.NumberUtils.min(floatArray58);
        float float62 = org.apache.commons.lang.math.NumberUtils.max(floatArray58);
        float[] floatArray66 = new float[] { 0, 1.0f, 100 };
        float[] floatArray68 = new float[] { (-1L) };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(floatArray66, floatArray68);
        float float70 = org.apache.commons.lang.math.NumberUtils.max(floatArray66);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(floatArray58, floatArray66);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(floatArray39, floatArray66);
        float float73 = org.apache.commons.lang.math.NumberUtils.min(floatArray39);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(floatArray18, floatArray39);
        float float75 = org.apache.commons.lang.math.NumberUtils.min(floatArray18);
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
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray51), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray58), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.0f + "'", float60 == 0.0f);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 0.0f + "'", float61 == 0.0f);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 100.0f + "'", float62 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray66), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray68), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 100.0f + "'", float70 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + float73 + "' != '" + (-1.0f) + "'", float73 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + 0.0f + "'", float75 == 0.0f);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) (byte) 10, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 100L, (float) (byte) -1, (float) 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(32, 32, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 1, (float) 100L, 97.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        java.lang.Class<?> wildcardClass56 = doubleArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(0.0f, 52.0f, (float) 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(0.0f, (float) 97, 100.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, (long) (byte) 10, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 'a', 32.0d, (double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, 10, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
        short[] shortArray36 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short37 = org.apache.commons.lang.math.NumberUtils.max(shortArray36);
        short[] shortArray41 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray41);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(shortArray31, shortArray36);
        short[] shortArray45 = new short[] { (short) 100 };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(shortArray31, shortArray45);
        short short47 = org.apache.commons.lang.math.NumberUtils.min(shortArray45);
        short short48 = org.apache.commons.lang.math.NumberUtils.max(shortArray45);
        short short49 = org.apache.commons.lang.math.NumberUtils.min(shortArray45);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray45);
        short short51 = org.apache.commons.lang.math.NumberUtils.min(shortArray45);
        short[] shortArray54 = new short[] { (short) -1, (short) -1 };
        short short55 = org.apache.commons.lang.math.NumberUtils.min(shortArray54);
        short[] shortArray59 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short60 = org.apache.commons.lang.math.NumberUtils.max(shortArray59);
        short[] shortArray64 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(shortArray59, shortArray64);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(shortArray54, shortArray59);
        short[] shortArray68 = new short[] { (short) 100 };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(shortArray54, shortArray68);
        short short70 = org.apache.commons.lang.math.NumberUtils.min(shortArray68);
        short short71 = org.apache.commons.lang.math.NumberUtils.max(shortArray68);
        short short72 = org.apache.commons.lang.math.NumberUtils.min(shortArray68);
        short[] shortArray74 = new short[] { (byte) 1 };
        short short75 = org.apache.commons.lang.math.NumberUtils.min(shortArray74);
        short[] shortArray77 = new short[] { (short) -1 };
        short short78 = org.apache.commons.lang.math.NumberUtils.max(shortArray77);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(shortArray74, shortArray77);
        short[] shortArray81 = new short[] { (byte) 1 };
        short short82 = org.apache.commons.lang.math.NumberUtils.min(shortArray81);
        short[] shortArray84 = new short[] { (short) -1 };
        short short85 = org.apache.commons.lang.math.NumberUtils.max(shortArray84);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(shortArray81, shortArray84);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(shortArray77, shortArray84);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(shortArray68, shortArray84);
        short short89 = org.apache.commons.lang.math.NumberUtils.min(shortArray68);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(shortArray45, shortArray68);
        short short91 = org.apache.commons.lang.math.NumberUtils.max(shortArray68);
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
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) 10 + "'", short37 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[100]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + short47 + "' != '" + (short) 100 + "'", short47 == (short) 100);
        org.junit.Assert.assertTrue("'" + short48 + "' != '" + (short) 100 + "'", short48 == (short) 100);
        org.junit.Assert.assertTrue("'" + short49 + "' != '" + (short) 100 + "'", short49 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + short51 + "' != '" + (short) 100 + "'", short51 == (short) 100);
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
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray68), "[100]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + short70 + "' != '" + (short) 100 + "'", short70 == (short) 100);
        org.junit.Assert.assertTrue("'" + short71 + "' != '" + (short) 100 + "'", short71 == (short) 100);
        org.junit.Assert.assertTrue("'" + short72 + "' != '" + (short) 100 + "'", short72 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray74), "[1]");
        org.junit.Assert.assertTrue("'" + short75 + "' != '" + (short) 1 + "'", short75 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray77), "[-1]");
        org.junit.Assert.assertTrue("'" + short78 + "' != '" + (short) -1 + "'", short78 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(shortArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray81), "[1]");
        org.junit.Assert.assertTrue("'" + short82 + "' != '" + (short) 1 + "'", short82 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray84), "[-1]");
        org.junit.Assert.assertTrue("'" + short85 + "' != '" + (short) -1 + "'", short85 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + short89 + "' != '" + (short) 100 + "'", short89 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + short91 + "' != '" + (short) 100 + "'", short91 == (short) 100);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 32L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
        float float24 = org.apache.commons.lang.math.NumberUtils.max(floatArray18);
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
        float[] floatArray51 = new float[] { 0, 1.0f, 100 };
        float[] floatArray53 = new float[] { (-1L) };
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(floatArray51, floatArray53);
        float[] floatArray58 = new float[] { 0, ' ', 100.0f };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(floatArray53, floatArray58);
        float float60 = org.apache.commons.lang.math.NumberUtils.min(floatArray58);
        float float61 = org.apache.commons.lang.math.NumberUtils.min(floatArray58);
        float float62 = org.apache.commons.lang.math.NumberUtils.max(floatArray58);
        float[] floatArray66 = new float[] { 0, 1.0f, 100 };
        float[] floatArray68 = new float[] { (-1L) };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(floatArray66, floatArray68);
        float float70 = org.apache.commons.lang.math.NumberUtils.max(floatArray66);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(floatArray58, floatArray66);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(floatArray39, floatArray66);
        float float73 = org.apache.commons.lang.math.NumberUtils.min(floatArray39);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(floatArray18, floatArray39);
        java.lang.Class<?> wildcardClass75 = floatArray18.getClass();
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
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray51), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray58), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.0f + "'", float60 == 0.0f);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 0.0f + "'", float61 == 0.0f);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 100.0f + "'", float62 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray66), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray68), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 100.0f + "'", float70 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + float73 + "' != '" + (-1.0f) + "'", float73 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) 0, (double) (byte) 1, (double) 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 10, (float) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) (byte) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(32.0d, (double) 0, (double) 32L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 0, 32, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 52L, (float) (short) 10, 52.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
        java.lang.Class<?> wildcardClass54 = doubleArray41.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (-1), (long) (short) 1, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        short[] shortArray36 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short37 = org.apache.commons.lang.math.NumberUtils.max(shortArray36);
        short[] shortArray41 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray41);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(shortArray31, shortArray36);
        short[] shortArray45 = new short[] { (short) 100 };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(shortArray31, shortArray45);
        short short47 = org.apache.commons.lang.math.NumberUtils.min(shortArray45);
        short short48 = org.apache.commons.lang.math.NumberUtils.max(shortArray45);
        short short49 = org.apache.commons.lang.math.NumberUtils.min(shortArray45);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray45);
        short short51 = org.apache.commons.lang.math.NumberUtils.min(shortArray45);
        short[] shortArray54 = new short[] { (short) -1, (short) -1 };
        short short55 = org.apache.commons.lang.math.NumberUtils.min(shortArray54);
        short[] shortArray59 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short60 = org.apache.commons.lang.math.NumberUtils.max(shortArray59);
        short[] shortArray64 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(shortArray59, shortArray64);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(shortArray54, shortArray59);
        short short67 = org.apache.commons.lang.math.NumberUtils.max(shortArray59);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(shortArray45, shortArray59);
        java.lang.Class<?> wildcardClass69 = shortArray45.getClass();
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
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) 10 + "'", short37 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[100]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + short47 + "' != '" + (short) 100 + "'", short47 == (short) 100);
        org.junit.Assert.assertTrue("'" + short48 + "' != '" + (short) 100 + "'", short48 == (short) 100);
        org.junit.Assert.assertTrue("'" + short49 + "' != '" + (short) 100 + "'", short49 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + short51 + "' != '" + (short) 100 + "'", short51 == (short) 100);
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
        org.junit.Assert.assertTrue("'" + short67 + "' != '" + (short) 10 + "'", short67 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 52, (float) 35L, (float) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 100, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 32, (long) 97, (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 1, (long) '4', (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray13);
        byte byte16 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        java.lang.Class<?> wildcardClass17 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 100 + "'", byte16 == (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) '4', 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) '4', (float) ' ', 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        int[] intArray5 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int6 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray5);
        int[] intArray8 = null;
        int[] intArray14 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int15 = org.apache.commons.lang.math.NumberUtils.max(intArray14);
        int int16 = org.apache.commons.lang.math.NumberUtils.min(intArray14);
        int[] intArray21 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray26 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(intArray21, intArray26);
        int int28 = org.apache.commons.lang.math.NumberUtils.min(intArray26);
        int[] intArray33 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray38 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray38);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(intArray26, intArray33);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(intArray14, intArray33);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(intArray8, intArray33);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(intArray5, intArray8);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 10, (int) (byte) 10, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 35L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        float[] floatArray0 = null;
        float[] floatArray5 = new float[] { 0.0f, 35, (-1), 35 };
        float[] floatArray6 = new float[] {};
        float[] floatArray10 = new float[] { 0, 1.0f, 100 };
        float[] floatArray12 = new float[] { (-1L) };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(floatArray6, floatArray10);
        float float15 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray10);
        float float17 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        float[] floatArray18 = new float[] {};
        float[] floatArray22 = new float[] { 0, 1.0f, 100 };
        float[] floatArray24 = new float[] { (-1L) };
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(floatArray22, floatArray24);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(floatArray18, floatArray22);
        float[] floatArray30 = new float[] { 0, 1.0f, 100 };
        float[] floatArray32 = new float[] { (-1L) };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(floatArray30, floatArray32);
        float[] floatArray37 = new float[] { 0, ' ', 100.0f };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(floatArray32, floatArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(floatArray18, floatArray32);
        float float40 = org.apache.commons.lang.math.NumberUtils.min(floatArray32);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray32);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray32);
        float[] floatArray43 = new float[] {};
        float[] floatArray47 = new float[] { 0, 1.0f, 100 };
        float[] floatArray49 = new float[] { (-1L) };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(floatArray47, floatArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(floatArray43, floatArray47);
        float[] floatArray55 = new float[] { 0, 1.0f, 100 };
        float[] floatArray57 = new float[] { (-1L) };
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(floatArray55, floatArray57);
        float[] floatArray62 = new float[] { 0, ' ', 100.0f };
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(floatArray57, floatArray62);
        float float64 = org.apache.commons.lang.math.NumberUtils.min(floatArray57);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(floatArray47, floatArray57);
        float[] floatArray69 = new float[] { 0, 1.0f, 100 };
        float[] floatArray71 = new float[] { (-1L) };
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(floatArray69, floatArray71);
        float[] floatArray76 = new float[] { 0, ' ', 100.0f };
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(floatArray71, floatArray76);
        float float78 = org.apache.commons.lang.math.NumberUtils.min(floatArray76);
        float float79 = org.apache.commons.lang.math.NumberUtils.min(floatArray76);
        float float80 = org.apache.commons.lang.math.NumberUtils.max(floatArray76);
        float[] floatArray84 = new float[] { 0, 1.0f, 100 };
        float[] floatArray86 = new float[] { (-1L) };
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(floatArray84, floatArray86);
        float float88 = org.apache.commons.lang.math.NumberUtils.max(floatArray84);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(floatArray76, floatArray84);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(floatArray57, floatArray84);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray84);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, 35.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-1.0f) + "'", float40 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[]");
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray47), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray49), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray55), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray57), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(floatArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray62), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + (-1.0f) + "'", float64 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(floatArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray69), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray71), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(floatArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray76), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + float78 + "' != '" + 0.0f + "'", float78 == 0.0f);
        org.junit.Assert.assertTrue("'" + float79 + "' != '" + 0.0f + "'", float79 == 0.0f);
        org.junit.Assert.assertTrue("'" + float80 + "' != '" + 100.0f + "'", float80 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray84), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray86), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + float88 + "' != '" + 100.0f + "'", float88 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 1.0f, (double) (short) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 100L, 1.0f };
        double[] doubleArray7 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray3, doubleArray7);
        double[] doubleArray11 = new double[] { 100L, 1.0f };
        double[] doubleArray15 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray3, doubleArray11);
        double[] doubleArray20 = new double[] { 100L, 1.0f };
        double[] doubleArray24 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray20, doubleArray24);
        double[] doubleArray28 = new double[] { 100L, 1.0f };
        double[] doubleArray32 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray28, doubleArray32);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray24, doubleArray28);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray3, doubleArray28);
        double[] doubleArray38 = new double[] { 100L, 1.0f };
        double[] doubleArray42 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray38, doubleArray42);
        double[] doubleArray46 = new double[] { 100L, 1.0f };
        double[] doubleArray50 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray46, doubleArray50);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray38, doubleArray46);
        double[] doubleArray55 = new double[] { 100L, 1.0f };
        double[] doubleArray59 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray55, doubleArray59);
        double[] doubleArray63 = new double[] { 100L, 1.0f };
        double[] doubleArray67 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray63, doubleArray67);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray59, doubleArray63);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray38, doubleArray63);
        double double71 = org.apache.commons.lang.math.NumberUtils.min(doubleArray63);
        double[] doubleArray74 = new double[] { 100L, 1.0f };
        double[] doubleArray78 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray74, doubleArray78);
        double double80 = org.apache.commons.lang.math.NumberUtils.max(doubleArray74);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray63, doubleArray74);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray28, doubleArray63);
        double double83 = org.apache.commons.lang.math.NumberUtils.max(doubleArray63);
        double double84 = org.apache.commons.lang.math.NumberUtils.max(doubleArray63);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray63);
        // The following exception was thrown during execution in test generation
        try {
            double double86 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
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
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 1.0d + "'", double71 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 100.0d + "'", double80 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 100.0d + "'", double83 == 100.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 100.0d + "'", double84 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(100.0f, 32.0f, (float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 1.0f, (double) (-1), (double) 35L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) (byte) -1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 10, 35, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 97.0f, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        long[] longArray0 = new long[] {};
        long[] longArray2 = new long[] { (byte) -1 };
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray2);
        long long4 = org.apache.commons.lang.math.NumberUtils.max(longArray2);
        long[] longArray7 = new long[] { 52L, (short) 1 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray7);
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray7);
        java.lang.Class<?> wildcardClass10 = longArray7.getClass();
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
        java.lang.Class<?> wildcardClass20 = byteArray4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) -1, (float) 35, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte4 = org.apache.commons.lang.math.NumberUtils.max(byteArray3);
        byte[] byteArray5 = null;
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray12);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(byteArray12, byteArray18);
        byte byte20 = org.apache.commons.lang.math.NumberUtils.max(byteArray12);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(byteArray3, byteArray12);
        byte byte22 = org.apache.commons.lang.math.NumberUtils.min(byteArray3);
        byte byte23 = org.apache.commons.lang.math.NumberUtils.max(byteArray3);
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
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) -1 + "'", byte22 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 10 + "'", byte23 == (byte) 10);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) 100, (double) ' ', 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) (byte) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 1, (double) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 100.0f, (double) (-1.0f), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 97, (long) 32, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) ' ', (long) 'a', 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) -1, (long) 'a', 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((-1L), 52L, 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray16 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray21 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray16);
        int[] intArray24 = null;
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray24);
        int[] intArray26 = null;
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(intArray24, intArray26);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 35, 97L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte4 = org.apache.commons.lang.math.NumberUtils.max(byteArray3);
        byte[] byteArray5 = null;
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray12);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(byteArray12, byteArray18);
        byte byte20 = org.apache.commons.lang.math.NumberUtils.max(byteArray12);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(byteArray3, byteArray12);
        byte[] byteArray22 = null;
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(byteArray22, byteArray29);
        byte byte31 = org.apache.commons.lang.math.NumberUtils.min(byteArray29);
        byte[] byteArray35 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte36 = org.apache.commons.lang.math.NumberUtils.max(byteArray35);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(byteArray29, byteArray35);
        byte byte38 = org.apache.commons.lang.math.NumberUtils.max(byteArray29);
        byte[] byteArray42 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte43 = org.apache.commons.lang.math.NumberUtils.max(byteArray42);
        byte[] byteArray44 = null;
        byte[] byteArray51 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(byteArray44, byteArray51);
        byte[] byteArray57 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(byteArray51, byteArray57);
        byte byte59 = org.apache.commons.lang.math.NumberUtils.max(byteArray51);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(byteArray42, byteArray51);
        byte byte61 = org.apache.commons.lang.math.NumberUtils.max(byteArray51);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(byteArray29, byteArray51);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(byteArray12, byteArray51);
        byte byte64 = org.apache.commons.lang.math.NumberUtils.max(byteArray51);
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
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) -1 + "'", byte31 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) 10 + "'", byte36 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 100 + "'", byte38 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 10 + "'", byte43 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + byte59 + "' != '" + (byte) 100 + "'", byte59 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + byte61 + "' != '" + (byte) 100 + "'", byte61 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + byte64 + "' != '" + (byte) 100 + "'", byte64 == (byte) 100);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0f, (float) 100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) 100, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double[] doubleArray10 = new double[] { 100L, 1.0f };
        double[] doubleArray14 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray6, doubleArray10);
        double double17 = org.apache.commons.lang.math.NumberUtils.max(doubleArray6);
        double[] doubleArray18 = null;
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray6, doubleArray18);
        double double20 = org.apache.commons.lang.math.NumberUtils.max(doubleArray6);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 10, 10, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) ' ', (-1), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
        java.lang.Class<?> wildcardClass51 = byteArray29.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte4 = org.apache.commons.lang.math.NumberUtils.max(byteArray3);
        byte[] byteArray5 = null;
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray12);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(byteArray12, byteArray18);
        byte byte20 = org.apache.commons.lang.math.NumberUtils.max(byteArray12);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(byteArray3, byteArray12);
        byte byte22 = org.apache.commons.lang.math.NumberUtils.min(byteArray3);
        java.lang.Class<?> wildcardClass23 = byteArray3.getClass();
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
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) -1 + "'", byte22 == (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 52, (float) (-1), (float) 35);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(32, 52, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 0, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 1, (int) ' ', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 0, (float) (byte) 0, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short1 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 1L, (double) (short) 10, (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) 10, 100.0d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        long[] longArray0 = null;
        long[] longArray1 = null;
        boolean boolean2 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((-1L), (long) 35, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        short short15 = org.apache.commons.lang.math.NumberUtils.max(shortArray11);
        short short16 = org.apache.commons.lang.math.NumberUtils.max(shortArray11);
        short short17 = org.apache.commons.lang.math.NumberUtils.max(shortArray11);
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
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) -1 + "'", short15 == (short) -1);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -1 + "'", short17 == (short) -1);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double[] doubleArray10 = new double[] { 100L, 1.0f };
        double[] doubleArray14 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray6, doubleArray10);
        double double17 = org.apache.commons.lang.math.NumberUtils.min(doubleArray10);
        double double18 = org.apache.commons.lang.math.NumberUtils.min(doubleArray10);
        double double19 = org.apache.commons.lang.math.NumberUtils.max(doubleArray10);
        double double20 = org.apache.commons.lang.math.NumberUtils.min(doubleArray10);
        double double21 = org.apache.commons.lang.math.NumberUtils.max(doubleArray10);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 'a', (long) 100, 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
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
        java.lang.Class<?> wildcardClass45 = doubleArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(32L, (long) 0, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 10, (double) 52.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 32, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 1, (long) 1, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        short[] shortArray2 = new short[] { (short) -1, (short) -1 };
        short short3 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
        short[] shortArray7 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short8 = org.apache.commons.lang.math.NumberUtils.max(shortArray7);
        short[] shortArray12 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray7, shortArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray7);
        short short15 = org.apache.commons.lang.math.NumberUtils.min(shortArray7);
        short short16 = org.apache.commons.lang.math.NumberUtils.max(shortArray7);
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
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 35.0f, (double) 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 100, (double) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 0, 1.0f, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 100L, (double) 32.0f, (double) 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) 10, (float) 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        float[] floatArray4 = new float[] { 0.0f, 35, (-1), 35 };
        float[] floatArray5 = new float[] {};
        float[] floatArray9 = new float[] { 0, 1.0f, 100 };
        float[] floatArray11 = new float[] { (-1L) };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray9);
        float float14 = org.apache.commons.lang.math.NumberUtils.max(floatArray9);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray9);
        float float16 = org.apache.commons.lang.math.NumberUtils.max(floatArray9);
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
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(floatArray17, floatArray31);
        float float39 = org.apache.commons.lang.math.NumberUtils.min(floatArray31);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray31);
        java.lang.Class<?> wildcardClass41 = floatArray9.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + (-1.0f) + "'", float39 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) (byte) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(35.0d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) 100, (double) 97.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(97.0f, (float) 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(32, (int) (byte) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) (byte) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) '#', 32L, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) (byte) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 0L, (float) (short) 10, 97.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        short[] shortArray2 = new short[] { (short) -1, (short) -1 };
        short short3 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
        short[] shortArray7 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short8 = org.apache.commons.lang.math.NumberUtils.max(shortArray7);
        short[] shortArray12 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray7, shortArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray7);
        short[] shortArray16 = new short[] { (short) 100 };
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray16);
        short short18 = org.apache.commons.lang.math.NumberUtils.max(shortArray16);
        short short19 = org.apache.commons.lang.math.NumberUtils.min(shortArray16);
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
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1, 52.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 52L, (float) 97L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(97.0d, (double) (-1), (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        long[] longArray3 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray4 = new long[] {};
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray4);
        long[] longArray6 = null;
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
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
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte34 = org.apache.commons.lang.math.NumberUtils.max(byteArray33);
        byte byte35 = org.apache.commons.lang.math.NumberUtils.max(byteArray33);
        byte byte36 = org.apache.commons.lang.math.NumberUtils.min(byteArray33);
        byte byte37 = org.apache.commons.lang.math.NumberUtils.min(byteArray33);
        byte byte38 = org.apache.commons.lang.math.NumberUtils.min(byteArray33);
        byte byte39 = org.apache.commons.lang.math.NumberUtils.max(byteArray33);
        byte byte40 = org.apache.commons.lang.math.NumberUtils.min(byteArray33);
        byte[] byteArray41 = null;
        byte[] byteArray48 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(byteArray41, byteArray48);
        byte byte50 = org.apache.commons.lang.math.NumberUtils.min(byteArray48);
        byte[] byteArray54 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte55 = org.apache.commons.lang.math.NumberUtils.max(byteArray54);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(byteArray48, byteArray54);
        byte byte57 = org.apache.commons.lang.math.NumberUtils.min(byteArray54);
        byte byte58 = org.apache.commons.lang.math.NumberUtils.min(byteArray54);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(byteArray33, byteArray54);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(byteArray25, byteArray54);
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
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) 10 + "'", byte34 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 10 + "'", byte35 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) -1 + "'", byte36 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) -1 + "'", byte37 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) -1 + "'", byte38 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 10 + "'", byte39 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) -1 + "'", byte40 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) -1 + "'", byte50 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte55 + "' != '" + (byte) 10 + "'", byte55 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + byte57 + "' != '" + (byte) -1 + "'", byte57 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte58 + "' != '" + (byte) -1 + "'", byte58 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        int[] intArray0 = null;
        int[] intArray6 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int7 = org.apache.commons.lang.math.NumberUtils.max(intArray6);
        int int8 = org.apache.commons.lang.math.NumberUtils.min(intArray6);
        int[] intArray13 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray18 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray18);
        int int20 = org.apache.commons.lang.math.NumberUtils.min(intArray18);
        int[] intArray25 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray30 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(intArray25, intArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray25);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray25);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray25);
        int[] intArray40 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int41 = org.apache.commons.lang.math.NumberUtils.max(intArray40);
        int int42 = org.apache.commons.lang.math.NumberUtils.max(intArray40);
        int int43 = org.apache.commons.lang.math.NumberUtils.max(intArray40);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray40);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 0, 0.0f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(52L, 32L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 100, (double) 1, (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 1L, (double) 10.0f, (double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) 'a', (int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
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
        byte[] byteArray33 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte34 = org.apache.commons.lang.math.NumberUtils.max(byteArray33);
        byte[] byteArray35 = null;
        byte[] byteArray42 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(byteArray35, byteArray42);
        byte[] byteArray48 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(byteArray42, byteArray48);
        byte byte50 = org.apache.commons.lang.math.NumberUtils.max(byteArray42);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(byteArray33, byteArray42);
        byte[] byteArray52 = null;
        byte[] byteArray59 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(byteArray52, byteArray59);
        byte byte61 = org.apache.commons.lang.math.NumberUtils.min(byteArray59);
        byte[] byteArray65 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte66 = org.apache.commons.lang.math.NumberUtils.max(byteArray65);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(byteArray59, byteArray65);
        byte byte68 = org.apache.commons.lang.math.NumberUtils.max(byteArray59);
        byte[] byteArray72 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte73 = org.apache.commons.lang.math.NumberUtils.max(byteArray72);
        byte[] byteArray74 = null;
        byte[] byteArray81 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(byteArray74, byteArray81);
        byte[] byteArray87 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(byteArray81, byteArray87);
        byte byte89 = org.apache.commons.lang.math.NumberUtils.max(byteArray81);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(byteArray72, byteArray81);
        byte byte91 = org.apache.commons.lang.math.NumberUtils.max(byteArray81);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(byteArray59, byteArray81);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(byteArray42, byteArray81);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray42);
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
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) 10 + "'", byte34 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) 100 + "'", byte50 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + byte61 + "' != '" + (byte) -1 + "'", byte61 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte66 + "' != '" + (byte) 10 + "'", byte66 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + byte68 + "' != '" + (byte) 100 + "'", byte68 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte73 + "' != '" + (byte) 10 + "'", byte73 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray87), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + byte89 + "' != '" + (byte) 100 + "'", byte89 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + byte91 + "' != '" + (byte) 100 + "'", byte91 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 0, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 32.0f, (double) 1L, (double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 'a', (long) (byte) 1, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 10.0f, 0.0d, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 1, 0, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 1L, (float) ' ', 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 0, 10.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, 10, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, (long) (byte) -1, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (-1), (double) 32, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 32, (long) 100, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(1L, (long) 1, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(97.0f, 0.0f, (float) 52L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 100, (double) 1L, (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) 'a', (int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) ' ', (long) '#', 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) (byte) 1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) (byte) -1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 0, (double) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        long[] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 1, 35.0f, 97.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        int[] intArray5 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int6 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int int8 = org.apache.commons.lang.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 97, (long) '#', (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((-1L), 0L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 52, (float) 100L, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 35, (long) 32, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) (byte) 10, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 0, (int) (short) -1, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) -1, (long) (short) 100, (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 1.0f, (double) 35.0f, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 10L, (float) 10L, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(52.0d, (double) 97L, 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) 10, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) 1, (float) (byte) 100, (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(100L, (long) (byte) 0, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) '4', (double) 'a', (double) 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 10L, (double) 52.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(52.0f, (float) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (-1L), (double) (short) 0, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (-1), (float) '4', (float) (-1));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(100, (int) ' ', 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
        long[] longArray23 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray24 = new long[] {};
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(longArray23, longArray24);
        long long26 = org.apache.commons.lang.math.NumberUtils.max(longArray23);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray23);
        long[] longArray31 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray32 = new long[] {};
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(longArray31, longArray32);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(longArray23, longArray31);
        long long35 = org.apache.commons.lang.math.NumberUtils.min(longArray23);
        long[] longArray39 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray40 = new long[] {};
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(longArray39, longArray40);
        long long42 = org.apache.commons.lang.math.NumberUtils.max(longArray39);
        long long43 = org.apache.commons.lang.math.NumberUtils.max(longArray39);
        long long44 = org.apache.commons.lang.math.NumberUtils.max(longArray39);
        long long45 = org.apache.commons.lang.math.NumberUtils.min(longArray39);
        long[] longArray49 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray50 = new long[] {};
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(longArray49, longArray50);
        long long52 = org.apache.commons.lang.math.NumberUtils.max(longArray49);
        long long53 = org.apache.commons.lang.math.NumberUtils.max(longArray49);
        long long54 = org.apache.commons.lang.math.NumberUtils.min(longArray49);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(longArray39, longArray49);
        long[] longArray59 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray60 = new long[] {};
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(longArray59, longArray60);
        long long62 = org.apache.commons.lang.math.NumberUtils.max(longArray59);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(longArray49, longArray59);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(longArray23, longArray49);
        long long65 = org.apache.commons.lang.math.NumberUtils.max(longArray49);
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
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 52L + "'", long26 == 52L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 52L + "'", long42 == 52L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 52L + "'", long43 == 52L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 52L + "'", long44 == 52L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 52L + "'", long52 == 52L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 52L + "'", long53 == 52L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 52L + "'", long62 == 52L);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 52L + "'", long65 == 52L);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(32.0f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(10.0d, 1.0d, (double) 52L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 100, (-1), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 32, (long) (byte) 1, 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(0.0f, (float) (byte) 0, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 100, (double) 97L, (double) 52L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) (byte) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 100, (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(0L, 35L, (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(100.0f, 52.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(0L, (long) (-1), (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((-1L), 0L, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 0, (int) (short) -1, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        short[] shortArray3 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short4 = org.apache.commons.lang.math.NumberUtils.max(shortArray3);
        short short5 = org.apache.commons.lang.math.NumberUtils.max(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) (byte) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(97L, (long) '#', 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float[] floatArray10 = new float[] { 0, ' ', 100.0f };
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray10);
        float float12 = org.apache.commons.lang.math.NumberUtils.min(floatArray5);
        java.lang.Class<?> wildcardClass13 = floatArray5.getClass();
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 0, 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 35, 10L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
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
        double[] doubleArray63 = new double[] { 100L, 1.0f };
        double[] doubleArray67 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray63, doubleArray67);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray55, doubleArray63);
        double double70 = org.apache.commons.lang.math.NumberUtils.min(doubleArray63);
        double double71 = org.apache.commons.lang.math.NumberUtils.max(doubleArray63);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray63);
        java.lang.Class<?> wildcardClass73 = doubleArray2.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 1.0d + "'", double70 == 1.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 100.0d + "'", double71 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 97L, (float) 32, (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(97, (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 52, 35L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) -1, 100L, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) (byte) 100, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray13);
        byte[] byteArray16 = null;
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte21 = org.apache.commons.lang.math.NumberUtils.max(byteArray20);
        byte[] byteArray22 = null;
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(byteArray22, byteArray29);
        byte[] byteArray35 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(byteArray29, byteArray35);
        byte byte37 = org.apache.commons.lang.math.NumberUtils.max(byteArray29);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(byteArray20, byteArray29);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(byteArray16, byteArray29);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray16);
        byte[] byteArray44 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte45 = org.apache.commons.lang.math.NumberUtils.max(byteArray44);
        byte[] byteArray48 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(byteArray44, byteArray48);
        byte[] byteArray54 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte55 = org.apache.commons.lang.math.NumberUtils.max(byteArray54);
        byte byte56 = org.apache.commons.lang.math.NumberUtils.max(byteArray54);
        byte byte57 = org.apache.commons.lang.math.NumberUtils.min(byteArray54);
        byte byte58 = org.apache.commons.lang.math.NumberUtils.min(byteArray54);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(byteArray48, byteArray54);
        byte[] byteArray63 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte64 = org.apache.commons.lang.math.NumberUtils.max(byteArray63);
        byte[] byteArray65 = null;
        byte[] byteArray72 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(byteArray65, byteArray72);
        byte[] byteArray78 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(byteArray72, byteArray78);
        byte byte80 = org.apache.commons.lang.math.NumberUtils.max(byteArray72);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(byteArray63, byteArray72);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(byteArray54, byteArray63);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray54);
        byte[] byteArray88 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte89 = org.apache.commons.lang.math.NumberUtils.max(byteArray88);
        byte byte90 = org.apache.commons.lang.math.NumberUtils.max(byteArray88);
        byte byte91 = org.apache.commons.lang.math.NumberUtils.max(byteArray88);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray88);
        byte byte93 = org.apache.commons.lang.math.NumberUtils.max(byteArray88);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 10 + "'", byte45 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte55 + "' != '" + (byte) 10 + "'", byte55 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte56 + "' != '" + (byte) 10 + "'", byte56 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte57 + "' != '" + (byte) -1 + "'", byte57 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte58 + "' != '" + (byte) -1 + "'", byte58 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte64 + "' != '" + (byte) 10 + "'", byte64 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + byte80 + "' != '" + (byte) 100 + "'", byte80 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray88), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte89 + "' != '" + (byte) 10 + "'", byte89 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte90 + "' != '" + (byte) 10 + "'", byte90 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte91 + "' != '" + (byte) 10 + "'", byte91 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + byte93 + "' != '" + (byte) 10 + "'", byte93 == (byte) 10);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 100, (double) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        int[] intArray42 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int43 = org.apache.commons.lang.math.NumberUtils.max(intArray42);
        int int44 = org.apache.commons.lang.math.NumberUtils.min(intArray42);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray42);
        int int46 = org.apache.commons.lang.math.NumberUtils.max(intArray18);
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
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 32, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        double[] doubleArray84 = new double[] { 100L, 1.0f };
        double[] doubleArray88 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray84, doubleArray88);
        double double90 = org.apache.commons.lang.math.NumberUtils.max(doubleArray84);
        double double91 = org.apache.commons.lang.math.NumberUtils.min(doubleArray84);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray84);
        double double93 = org.apache.commons.lang.math.NumberUtils.min(doubleArray84);
        double double94 = org.apache.commons.lang.math.NumberUtils.min(doubleArray84);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 100.0d + "'", double90 == 100.0d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 1.0d + "'", double91 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 1.0d + "'", double93 == 1.0d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 1.0d + "'", double94 == 1.0d);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
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
        long[] longArray45 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray46 = new long[] {};
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(longArray45, longArray46);
        long long48 = org.apache.commons.lang.math.NumberUtils.max(longArray45);
        long long49 = org.apache.commons.lang.math.NumberUtils.max(longArray45);
        long long50 = org.apache.commons.lang.math.NumberUtils.max(longArray45);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(longArray28, longArray45);
        long[] longArray55 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray56 = new long[] {};
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(longArray55, longArray56);
        long long58 = org.apache.commons.lang.math.NumberUtils.max(longArray55);
        long long59 = org.apache.commons.lang.math.NumberUtils.max(longArray55);
        long long60 = org.apache.commons.lang.math.NumberUtils.max(longArray55);
        long long61 = org.apache.commons.lang.math.NumberUtils.min(longArray55);
        long[] longArray65 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray66 = new long[] {};
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(longArray65, longArray66);
        long long68 = org.apache.commons.lang.math.NumberUtils.max(longArray65);
        long long69 = org.apache.commons.lang.math.NumberUtils.max(longArray65);
        long long70 = org.apache.commons.lang.math.NumberUtils.min(longArray65);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(longArray55, longArray65);
        long[] longArray75 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray76 = new long[] {};
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(longArray75, longArray76);
        long long78 = org.apache.commons.lang.math.NumberUtils.max(longArray75);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(longArray65, longArray75);
        long[] longArray83 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray84 = new long[] {};
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(longArray83, longArray84);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(longArray75, longArray83);
        long long87 = org.apache.commons.lang.math.NumberUtils.min(longArray75);
        long[] longArray88 = new long[] {};
        long[] longArray90 = new long[] { (byte) -1 };
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(longArray88, longArray90);
        long long92 = org.apache.commons.lang.math.NumberUtils.max(longArray90);
        long[] longArray95 = new long[] { 52L, (short) 1 };
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(longArray90, longArray95);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(longArray75, longArray90);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(longArray28, longArray75);
        long long99 = org.apache.commons.lang.math.NumberUtils.min(longArray75);
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
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 52L + "'", long48 == 52L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 52L + "'", long49 == 52L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 52L + "'", long50 == 52L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 52L + "'", long58 == 52L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 52L + "'", long59 == 52L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 52L + "'", long60 == 52L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-1L) + "'", long61 == (-1L));
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 52L + "'", long68 == 52L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 52L + "'", long69 == 52L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-1L) + "'", long70 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 52L + "'", long78 == 52L);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray83), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + (-1L) + "'", long87 == (-1L));
        org.junit.Assert.assertNotNull(longArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray88), "[]");
        org.junit.Assert.assertNotNull(longArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray90), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + (-1L) + "'", long92 == (-1L));
        org.junit.Assert.assertNotNull(longArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray95), "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertTrue("'" + long99 + "' != '" + (-1L) + "'", long99 == (-1L));
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(97.0d, (double) 52.0f, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double[] doubleArray10 = new double[] { 100L, 1.0f };
        double[] doubleArray14 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray6, doubleArray10);
        double double17 = org.apache.commons.lang.math.NumberUtils.min(doubleArray10);
        double double18 = org.apache.commons.lang.math.NumberUtils.min(doubleArray10);
        double[] doubleArray21 = new double[] { 100L, 1.0f };
        double[] doubleArray25 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray25);
        double[] doubleArray29 = new double[] { 100L, 1.0f };
        double[] doubleArray33 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray29, doubleArray33);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray29);
        double[] doubleArray38 = new double[] { 100L, 1.0f };
        double[] doubleArray42 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray38, doubleArray42);
        double[] doubleArray46 = new double[] { 100L, 1.0f };
        double[] doubleArray50 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray46, doubleArray50);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray38, doubleArray46);
        double[] doubleArray55 = new double[] { 100L, 1.0f };
        double[] doubleArray59 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray55, doubleArray59);
        double[] doubleArray63 = new double[] { 100L, 1.0f };
        double[] doubleArray67 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray63, doubleArray67);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray59, doubleArray63);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray38, doubleArray63);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray63);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray21);
        double double73 = org.apache.commons.lang.math.NumberUtils.min(doubleArray21);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
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
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 1.0d + "'", double73 == 1.0d);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((-1.0f), (float) 1L, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(0.0d, (double) (byte) 10, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) (byte) 1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 52, (long) 35, (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray13);
        byte[] byteArray15 = null;
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray15);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(10.0f, 35.0f, 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 'a', (double) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) 10, (double) 100L, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 0L, (float) 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 100, (float) (short) -1, (float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 0L, (float) (short) 10, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(35.0d, (double) 10L, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 100L, (double) 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int int12 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int int13 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int int14 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray13);
        byte[] byteArray16 = null;
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte21 = org.apache.commons.lang.math.NumberUtils.max(byteArray20);
        byte[] byteArray22 = null;
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(byteArray22, byteArray29);
        byte[] byteArray35 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(byteArray29, byteArray35);
        byte byte37 = org.apache.commons.lang.math.NumberUtils.max(byteArray29);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(byteArray20, byteArray29);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(byteArray16, byteArray29);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray16);
        byte[] byteArray44 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte45 = org.apache.commons.lang.math.NumberUtils.max(byteArray44);
        byte[] byteArray48 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(byteArray44, byteArray48);
        byte[] byteArray54 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte55 = org.apache.commons.lang.math.NumberUtils.max(byteArray54);
        byte byte56 = org.apache.commons.lang.math.NumberUtils.max(byteArray54);
        byte byte57 = org.apache.commons.lang.math.NumberUtils.min(byteArray54);
        byte byte58 = org.apache.commons.lang.math.NumberUtils.min(byteArray54);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(byteArray48, byteArray54);
        byte[] byteArray63 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte64 = org.apache.commons.lang.math.NumberUtils.max(byteArray63);
        byte[] byteArray65 = null;
        byte[] byteArray72 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(byteArray65, byteArray72);
        byte[] byteArray78 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(byteArray72, byteArray78);
        byte byte80 = org.apache.commons.lang.math.NumberUtils.max(byteArray72);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(byteArray63, byteArray72);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(byteArray54, byteArray63);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray54);
        java.lang.Class<?> wildcardClass84 = byteArray54.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 10 + "'", byte45 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte55 + "' != '" + (byte) 10 + "'", byte55 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte56 + "' != '" + (byte) 10 + "'", byte56 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte57 + "' != '" + (byte) -1 + "'", byte57 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte58 + "' != '" + (byte) -1 + "'", byte58 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte64 + "' != '" + (byte) 10 + "'", byte64 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + byte80 + "' != '" + (byte) 100 + "'", byte80 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 100, (float) 1L, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) (byte) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) -1, 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 35L, (float) (byte) -1, 100.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) (byte) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 10, (long) 'a', 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) 100, (float) (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        long[] longArray23 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray24 = new long[] {};
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(longArray23, longArray24);
        long long26 = org.apache.commons.lang.math.NumberUtils.max(longArray23);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray23);
        long long28 = org.apache.commons.lang.math.NumberUtils.min(longArray13);
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
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 52L + "'", long26 == 52L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double[] doubleArray10 = new double[] { 100L, 1.0f };
        double[] doubleArray14 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray6, doubleArray10);
        double double17 = org.apache.commons.lang.math.NumberUtils.min(doubleArray10);
        double double18 = org.apache.commons.lang.math.NumberUtils.max(doubleArray10);
        double double19 = org.apache.commons.lang.math.NumberUtils.min(doubleArray10);
        double[] doubleArray21 = new double[] { 32 };
        double[] doubleArray24 = new double[] { 100L, 1.0f };
        double[] doubleArray28 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray24, doubleArray28);
        double[] doubleArray32 = new double[] { 100L, 1.0f };
        double[] doubleArray36 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray32, doubleArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray28, doubleArray32);
        double[] doubleArray41 = new double[] { 100L, 1.0f };
        double[] doubleArray45 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray41, doubleArray45);
        double[] doubleArray49 = new double[] { 100L, 1.0f };
        double[] doubleArray53 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray49, doubleArray53);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray41, doubleArray49);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray32, doubleArray49);
        double double57 = org.apache.commons.lang.math.NumberUtils.max(doubleArray49);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray49);
        double[] doubleArray61 = new double[] { 100L, 1.0f };
        double[] doubleArray65 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray61, doubleArray65);
        double[] doubleArray69 = new double[] { 100L, 1.0f };
        double[] doubleArray73 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray69, doubleArray73);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray61, doubleArray69);
        double double76 = org.apache.commons.lang.math.NumberUtils.max(doubleArray69);
        double[] doubleArray79 = new double[] { 100L, 1.0f };
        double[] doubleArray83 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray79, doubleArray83);
        double[] doubleArray87 = new double[] { 100L, 1.0f };
        double[] doubleArray91 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray87, doubleArray91);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray79, doubleArray87);
        double double94 = org.apache.commons.lang.math.NumberUtils.max(doubleArray87);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray69, doubleArray87);
        double double96 = org.apache.commons.lang.math.NumberUtils.max(doubleArray87);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray49, doubleArray87);
        double double98 = org.apache.commons.lang.math.NumberUtils.max(doubleArray49);
        boolean boolean99 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray49);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[32.0]");
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 100.0d + "'", double57 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
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
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 100.0d + "'", double76 == 100.0d);
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
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 100.0d + "'", double94 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 100.0d + "'", double96 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 100.0d + "'", double98 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '#', (long) ' ', (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) '4', 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 52L, (double) (short) 100, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) -1, (long) 52, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) -1, 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 32L, (double) 35L, (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 10, (float) (short) 0, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 0, (long) '4', (long) 52);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 10, 0L, 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) '#', (float) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 100, 35L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 100, (long) (byte) 10, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (-1), (long) (-1), (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '4', (int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 32, (double) 35, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 10, (long) (byte) -1, (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", 97.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        double[] doubleArray1 = new double[] { 32 };
        double[] doubleArray4 = new double[] { 100L, 1.0f };
        double[] doubleArray8 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray12 = new double[] { 100L, 1.0f };
        double[] doubleArray16 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray12, doubleArray16);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray12);
        double[] doubleArray21 = new double[] { 100L, 1.0f };
        double[] doubleArray25 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray25);
        double[] doubleArray29 = new double[] { 100L, 1.0f };
        double[] doubleArray33 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray29, doubleArray33);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray29);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray12, doubleArray29);
        double double37 = org.apache.commons.lang.math.NumberUtils.max(doubleArray29);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray1, doubleArray29);
        double[] doubleArray41 = new double[] { 100L, 1.0f };
        double[] doubleArray45 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray41, doubleArray45);
        double[] doubleArray49 = new double[] { 100L, 1.0f };
        double[] doubleArray53 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray49, doubleArray53);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray41, doubleArray49);
        double double56 = org.apache.commons.lang.math.NumberUtils.max(doubleArray49);
        double[] doubleArray59 = new double[] { 100L, 1.0f };
        double[] doubleArray63 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray59, doubleArray63);
        double[] doubleArray67 = new double[] { 100L, 1.0f };
        double[] doubleArray71 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray67, doubleArray71);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray59, doubleArray67);
        double double74 = org.apache.commons.lang.math.NumberUtils.max(doubleArray67);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray49, doubleArray67);
        double double76 = org.apache.commons.lang.math.NumberUtils.max(doubleArray67);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray29, doubleArray67);
        double double78 = org.apache.commons.lang.math.NumberUtils.min(doubleArray29);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[32.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
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
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 100.0d + "'", double74 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 100.0d + "'", double76 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 1.0d + "'", double78 == 1.0d);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 0, (double) 1L, (double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(100.0d, (double) 0.0f, (double) 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) -1, (int) (short) 100, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 1.0f, (double) 1.0f, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 35L, (float) (byte) 0, 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) (byte) 1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(32.0d, 35.0d, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (-1), (double) 97, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) 1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(35, (int) (short) 10, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 10, (long) 10, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) '4', (float) 'a', (float) 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) ' ', 0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) '4', (float) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 32.0f, (double) (byte) 1, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) (byte) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray13);
        byte byte15 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte byte16 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte21 = org.apache.commons.lang.math.NumberUtils.max(byteArray20);
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(byteArray20, byteArray24);
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte31 = org.apache.commons.lang.math.NumberUtils.max(byteArray30);
        byte byte32 = org.apache.commons.lang.math.NumberUtils.max(byteArray30);
        byte byte33 = org.apache.commons.lang.math.NumberUtils.min(byteArray30);
        byte byte34 = org.apache.commons.lang.math.NumberUtils.min(byteArray30);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(byteArray24, byteArray30);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte40 = org.apache.commons.lang.math.NumberUtils.max(byteArray39);
        byte[] byteArray41 = null;
        byte[] byteArray48 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(byteArray41, byteArray48);
        byte[] byteArray54 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(byteArray48, byteArray54);
        byte byte56 = org.apache.commons.lang.math.NumberUtils.max(byteArray48);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(byteArray39, byteArray48);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(byteArray30, byteArray39);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray30);
        byte byte60 = org.apache.commons.lang.math.NumberUtils.max(byteArray30);
        java.lang.Class<?> wildcardClass61 = byteArray30.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 10 + "'", byte21 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 10 + "'", byte31 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 10 + "'", byte32 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) -1 + "'", byte33 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) -1 + "'", byte34 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) 10 + "'", byte40 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + byte56 + "' != '" + (byte) 100 + "'", byte56 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + byte60 + "' != '" + (byte) 10 + "'", byte60 == (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        short[] shortArray2 = new short[] { (short) -1, (short) -1 };
        short short3 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
        short[] shortArray7 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short8 = org.apache.commons.lang.math.NumberUtils.max(shortArray7);
        short[] shortArray12 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray7, shortArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray7);
        short[] shortArray16 = new short[] { (short) 100 };
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray16);
        short short18 = org.apache.commons.lang.math.NumberUtils.max(shortArray2);
        short short19 = org.apache.commons.lang.math.NumberUtils.max(shortArray2);
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
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) -1 + "'", short18 == (short) -1);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) -1 + "'", short19 == (short) -1);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 100, (long) (byte) 10, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
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
        byte byte51 = org.apache.commons.lang.math.NumberUtils.max(byteArray48);
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
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) 100 + "'", byte51 == (byte) 100);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) (byte) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 52L, (float) 100L, 35.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) 1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(0.0f, (-1.0f), (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        java.lang.Class<?> wildcardClass23 = floatArray14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 0, (float) (-1L), 52.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) -1, (double) 0.0f, (double) 35);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(52.0f, 0.0f, 32.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1, (double) 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(10, 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(0L, (long) 'a', (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(100L, 0L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 10, (long) (byte) 1, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) 0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        int[] intArray68 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray73 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(intArray68, intArray73);
        int[] intArray79 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray84 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(intArray79, intArray84);
        int int86 = org.apache.commons.lang.math.NumberUtils.min(intArray84);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(intArray73, intArray84);
        int int88 = org.apache.commons.lang.math.NumberUtils.min(intArray73);
        int int89 = org.apache.commons.lang.math.NumberUtils.max(intArray73);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(intArray45, intArray73);
        int int91 = org.apache.commons.lang.math.NumberUtils.min(intArray73);
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
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 100 + "'", int89 == 100);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, 1, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 0, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 10, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) (byte) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) -1, (float) 32, (float) 52L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) -1, (long) 1, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (-1), (long) 10, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 10, (short) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
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
        byte byte51 = org.apache.commons.lang.math.NumberUtils.min(byteArray48);
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
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) 0 + "'", byte51 == (byte) 0);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 1, (int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte byte10 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte16 = org.apache.commons.lang.math.NumberUtils.max(byteArray15);
        byte[] byteArray17 = null;
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray24);
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(byteArray24, byteArray30);
        byte byte32 = org.apache.commons.lang.math.NumberUtils.max(byteArray24);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(byteArray15, byteArray24);
        byte[] byteArray37 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte38 = org.apache.commons.lang.math.NumberUtils.max(byteArray37);
        byte[] byteArray41 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(byteArray37, byteArray41);
        byte[] byteArray47 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte48 = org.apache.commons.lang.math.NumberUtils.max(byteArray47);
        byte byte49 = org.apache.commons.lang.math.NumberUtils.max(byteArray47);
        byte byte50 = org.apache.commons.lang.math.NumberUtils.min(byteArray47);
        byte byte51 = org.apache.commons.lang.math.NumberUtils.min(byteArray47);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(byteArray41, byteArray47);
        byte[] byteArray56 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte57 = org.apache.commons.lang.math.NumberUtils.max(byteArray56);
        byte[] byteArray58 = null;
        byte[] byteArray65 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(byteArray58, byteArray65);
        byte[] byteArray71 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(byteArray65, byteArray71);
        byte byte73 = org.apache.commons.lang.math.NumberUtils.max(byteArray65);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(byteArray56, byteArray65);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(byteArray47, byteArray56);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(byteArray24, byteArray47);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray47);
        byte byte78 = org.apache.commons.lang.math.NumberUtils.min(byteArray47);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 10 + "'", byte16 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 100 + "'", byte32 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 10 + "'", byte38 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte48 + "' != '" + (byte) 10 + "'", byte48 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte49 + "' != '" + (byte) 10 + "'", byte49 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) -1 + "'", byte50 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) -1 + "'", byte51 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
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
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + byte78 + "' != '" + (byte) -1 + "'", byte78 == (byte) -1);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 0, 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 1, (float) (-1), (float) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) -1, (float) (short) 0, (float) 100L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 'a', (double) 52.0f, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '#', (long) 35, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) (byte) -1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 1, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) (byte) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, (int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(35, 100, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
        byte byte51 = org.apache.commons.lang.math.NumberUtils.max(byteArray29);
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
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) 100 + "'", byte51 == (byte) 100);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        int[] intArray0 = null;
        int[] intArray1 = null;
        boolean boolean2 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0f, (float) 52L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 52L, (float) (byte) 0, (float) 32L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float[] floatArray10 = new float[] { 0, 1.0f, 100 };
        float[] floatArray12 = new float[] { (-1L) };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray12);
        float float14 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray10);
        java.lang.Class<?> wildcardClass16 = floatArray10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(32L, (long) 'a', 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) (byte) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 0L, (double) (-1.0f), (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) -1, (double) 97L, (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) -1, (int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) (byte) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) (byte) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 'a', (float) 0, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(10.0f, 32.0f, (float) 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 97, (float) (short) 0, (float) 52L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 35L, 0.0f, 100.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (-1), 100L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        float[] floatArray4 = new float[] { 0.0f, 35, (-1), 35 };
        float[] floatArray5 = new float[] {};
        float[] floatArray9 = new float[] { 0, 1.0f, 100 };
        float[] floatArray11 = new float[] { (-1L) };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray9);
        float float14 = org.apache.commons.lang.math.NumberUtils.max(floatArray9);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray9);
        float float16 = org.apache.commons.lang.math.NumberUtils.max(floatArray9);
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
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(floatArray17, floatArray31);
        float float39 = org.apache.commons.lang.math.NumberUtils.min(floatArray31);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray31);
        float[] floatArray44 = new float[] { 0, 1.0f, 100 };
        float[] floatArray46 = new float[] { (-1L) };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(floatArray44, floatArray46);
        float[] floatArray51 = new float[] { 0, ' ', 100.0f };
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(floatArray46, floatArray51);
        float float53 = org.apache.commons.lang.math.NumberUtils.max(floatArray46);
        float float54 = org.apache.commons.lang.math.NumberUtils.max(floatArray46);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray46);
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + (-1.0f) + "'", float39 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray46), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray51), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + (-1.0f) + "'", float53 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + (-1.0f) + "'", float54 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(1, (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) -1, (int) (short) 10, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 1, 97.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 0, (double) 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        float[] floatArray27 = new float[] { 0.0f, 35, (-1), 35 };
        float[] floatArray28 = new float[] {};
        float[] floatArray32 = new float[] { 0, 1.0f, 100 };
        float[] floatArray34 = new float[] { (-1L) };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(floatArray32, floatArray34);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(floatArray28, floatArray32);
        float float37 = org.apache.commons.lang.math.NumberUtils.max(floatArray32);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(floatArray27, floatArray32);
        float float39 = org.apache.commons.lang.math.NumberUtils.max(floatArray32);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray32);
        float float41 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
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
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[0.0, 35.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 100.0f + "'", float37 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 100.0f + "'", float39 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + (-1.0f) + "'", float41 == (-1.0f));
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(35.0d, (double) (short) 0, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
        int[] intArray68 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray73 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(intArray68, intArray73);
        int[] intArray79 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray84 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(intArray79, intArray84);
        int int86 = org.apache.commons.lang.math.NumberUtils.min(intArray84);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(intArray73, intArray84);
        int int88 = org.apache.commons.lang.math.NumberUtils.min(intArray73);
        int int89 = org.apache.commons.lang.math.NumberUtils.max(intArray73);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(intArray45, intArray73);
        int int91 = org.apache.commons.lang.math.NumberUtils.max(intArray45);
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
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 100 + "'", int89 == 100);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 100 + "'", int91 == 100);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 100L, (double) 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 1, (long) 0, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        int int64 = org.apache.commons.lang.math.NumberUtils.max(intArray18);
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
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 100 + "'", int64 == 100);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(1.0f, (float) (byte) 10, 32.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) 1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) ' ', (int) '4', 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        short[] shortArray36 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short37 = org.apache.commons.lang.math.NumberUtils.max(shortArray36);
        short[] shortArray41 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray41);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(shortArray31, shortArray36);
        short[] shortArray45 = new short[] { (short) 100 };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(shortArray31, shortArray45);
        short short47 = org.apache.commons.lang.math.NumberUtils.min(shortArray45);
        short short48 = org.apache.commons.lang.math.NumberUtils.max(shortArray45);
        short short49 = org.apache.commons.lang.math.NumberUtils.min(shortArray45);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray45);
        short short51 = org.apache.commons.lang.math.NumberUtils.min(shortArray45);
        short[] shortArray54 = new short[] { (short) -1, (short) -1 };
        short short55 = org.apache.commons.lang.math.NumberUtils.min(shortArray54);
        short[] shortArray59 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short60 = org.apache.commons.lang.math.NumberUtils.max(shortArray59);
        short[] shortArray64 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(shortArray59, shortArray64);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(shortArray54, shortArray59);
        short[] shortArray68 = new short[] { (short) 100 };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(shortArray54, shortArray68);
        short short70 = org.apache.commons.lang.math.NumberUtils.min(shortArray68);
        short short71 = org.apache.commons.lang.math.NumberUtils.max(shortArray68);
        short short72 = org.apache.commons.lang.math.NumberUtils.min(shortArray68);
        short[] shortArray74 = new short[] { (byte) 1 };
        short short75 = org.apache.commons.lang.math.NumberUtils.min(shortArray74);
        short[] shortArray77 = new short[] { (short) -1 };
        short short78 = org.apache.commons.lang.math.NumberUtils.max(shortArray77);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(shortArray74, shortArray77);
        short[] shortArray81 = new short[] { (byte) 1 };
        short short82 = org.apache.commons.lang.math.NumberUtils.min(shortArray81);
        short[] shortArray84 = new short[] { (short) -1 };
        short short85 = org.apache.commons.lang.math.NumberUtils.max(shortArray84);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(shortArray81, shortArray84);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(shortArray77, shortArray84);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(shortArray68, shortArray84);
        short short89 = org.apache.commons.lang.math.NumberUtils.min(shortArray68);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(shortArray45, shortArray68);
        java.lang.Class<?> wildcardClass91 = shortArray68.getClass();
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
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) 10 + "'", short37 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[100]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + short47 + "' != '" + (short) 100 + "'", short47 == (short) 100);
        org.junit.Assert.assertTrue("'" + short48 + "' != '" + (short) 100 + "'", short48 == (short) 100);
        org.junit.Assert.assertTrue("'" + short49 + "' != '" + (short) 100 + "'", short49 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + short51 + "' != '" + (short) 100 + "'", short51 == (short) 100);
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
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray68), "[100]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + short70 + "' != '" + (short) 100 + "'", short70 == (short) 100);
        org.junit.Assert.assertTrue("'" + short71 + "' != '" + (short) 100 + "'", short71 == (short) 100);
        org.junit.Assert.assertTrue("'" + short72 + "' != '" + (short) 100 + "'", short72 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray74), "[1]");
        org.junit.Assert.assertTrue("'" + short75 + "' != '" + (short) 1 + "'", short75 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray77), "[-1]");
        org.junit.Assert.assertTrue("'" + short78 + "' != '" + (short) -1 + "'", short78 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(shortArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray81), "[1]");
        org.junit.Assert.assertTrue("'" + short82 + "' != '" + (short) 1 + "'", short82 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray84), "[-1]");
        org.junit.Assert.assertTrue("'" + short85 + "' != '" + (short) -1 + "'", short85 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + short89 + "' != '" + (short) 100 + "'", short89 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        long long21 = org.apache.commons.lang.math.NumberUtils.max(longArray2);
        long long22 = org.apache.commons.lang.math.NumberUtils.min(longArray2);
        long long23 = org.apache.commons.lang.math.NumberUtils.max(longArray2);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) (byte) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(100L, (long) (short) 100, 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 1, (int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 100, (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        byte byte51 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        java.lang.Class<?> wildcardClass52 = byteArray4.getClass();
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
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) -1 + "'", byte51 == (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 52, (float) (byte) 0, (float) 97);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) (byte) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 1L, (float) (byte) -1, (float) 35);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) (byte) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) (byte) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 32L, 100.0f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, (long) 100, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray16 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray21 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray16);
        int int24 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, (long) '#', (long) 52);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((-1), (int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 0, (int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
        long long20 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long21 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
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
        long[] longArray45 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray46 = new long[] {};
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(longArray45, longArray46);
        long long48 = org.apache.commons.lang.math.NumberUtils.max(longArray45);
        long long49 = org.apache.commons.lang.math.NumberUtils.max(longArray45);
        long long50 = org.apache.commons.lang.math.NumberUtils.max(longArray45);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(longArray28, longArray45);
        long[] longArray55 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray56 = new long[] {};
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(longArray55, longArray56);
        long long58 = org.apache.commons.lang.math.NumberUtils.max(longArray55);
        long long59 = org.apache.commons.lang.math.NumberUtils.max(longArray55);
        long long60 = org.apache.commons.lang.math.NumberUtils.max(longArray55);
        long long61 = org.apache.commons.lang.math.NumberUtils.min(longArray55);
        long[] longArray65 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray66 = new long[] {};
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(longArray65, longArray66);
        long long68 = org.apache.commons.lang.math.NumberUtils.max(longArray65);
        long long69 = org.apache.commons.lang.math.NumberUtils.max(longArray65);
        long long70 = org.apache.commons.lang.math.NumberUtils.min(longArray65);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(longArray55, longArray65);
        long[] longArray75 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray76 = new long[] {};
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(longArray75, longArray76);
        long long78 = org.apache.commons.lang.math.NumberUtils.max(longArray75);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(longArray65, longArray75);
        long[] longArray83 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray84 = new long[] {};
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(longArray83, longArray84);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(longArray75, longArray83);
        long long87 = org.apache.commons.lang.math.NumberUtils.min(longArray75);
        long[] longArray88 = new long[] {};
        long[] longArray90 = new long[] { (byte) -1 };
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(longArray88, longArray90);
        long long92 = org.apache.commons.lang.math.NumberUtils.max(longArray90);
        long[] longArray95 = new long[] { 52L, (short) 1 };
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(longArray90, longArray95);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(longArray75, longArray90);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(longArray28, longArray75);
        java.lang.Class<?> wildcardClass99 = longArray28.getClass();
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
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 52L + "'", long48 == 52L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 52L + "'", long49 == 52L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 52L + "'", long50 == 52L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 52L + "'", long58 == 52L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 52L + "'", long59 == 52L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 52L + "'", long60 == 52L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-1L) + "'", long61 == (-1L));
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 52L + "'", long68 == 52L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 52L + "'", long69 == 52L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-1L) + "'", long70 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 52L + "'", long78 == 52L);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray83), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + (-1L) + "'", long87 == (-1L));
        org.junit.Assert.assertNotNull(longArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray88), "[]");
        org.junit.Assert.assertNotNull(longArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray90), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + (-1L) + "'", long92 == (-1L));
        org.junit.Assert.assertNotNull(longArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray95), "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 1L, 0.0d, (double) 52L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 52.0f, 52.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(100, 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 100, 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(52.0f, 100.0f, (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) 10, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
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
        // The following exception was thrown during execution in test generation
        try {
            long long28 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
        short short15 = org.apache.commons.lang.math.NumberUtils.max(shortArray11);
        short short16 = org.apache.commons.lang.math.NumberUtils.max(shortArray11);
        short short17 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        short short18 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        short short19 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        short[] shortArray22 = new short[] { (short) -1, (short) -1 };
        short short23 = org.apache.commons.lang.math.NumberUtils.min(shortArray22);
        short[] shortArray27 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short28 = org.apache.commons.lang.math.NumberUtils.max(shortArray27);
        short[] shortArray32 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(shortArray27, shortArray32);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(shortArray22, shortArray27);
        short[] shortArray36 = new short[] { (short) 100 };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(shortArray22, shortArray36);
        short short38 = org.apache.commons.lang.math.NumberUtils.max(shortArray36);
        short short39 = org.apache.commons.lang.math.NumberUtils.max(shortArray36);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray36);
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
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) -1 + "'", short15 == (short) -1);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -1 + "'", short17 == (short) -1);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) -1 + "'", short18 == (short) -1);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) -1 + "'", short19 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) -1 + "'", short23 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 10 + "'", short28 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[100]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) 100 + "'", short38 == (short) 100);
        org.junit.Assert.assertTrue("'" + short39 + "' != '" + (short) 100 + "'", short39 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
        float float41 = org.apache.commons.lang.math.NumberUtils.min(floatArray3);
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
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 0.0f + "'", float41 == 0.0f);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(32L, (-1L), (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(32L, 100L, 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        long long19 = org.apache.commons.lang.math.NumberUtils.min(longArray6);
        long long20 = org.apache.commons.lang.math.NumberUtils.max(longArray6);
        long long21 = org.apache.commons.lang.math.NumberUtils.min(longArray6);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(32.0f, (float) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }
}

