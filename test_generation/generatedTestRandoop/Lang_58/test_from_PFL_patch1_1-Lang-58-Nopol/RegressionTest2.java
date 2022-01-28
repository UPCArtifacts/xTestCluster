import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 97L, (double) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float float7 = org.apache.commons.lang.math.NumberUtils.min(floatArray5);
        float float8 = org.apache.commons.lang.math.NumberUtils.max(floatArray5);
        float float9 = org.apache.commons.lang.math.NumberUtils.min(floatArray5);
        float float10 = org.apache.commons.lang.math.NumberUtils.max(floatArray5);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) 0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(0.0f, (float) 35L, (float) 52);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) 0, 97.0d, 97.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 0, 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 52, 1L, 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) (byte) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte25 = org.apache.commons.lang.math.NumberUtils.max(byteArray24);
        byte[] byteArray26 = null;
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray33);
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(byteArray33, byteArray39);
        byte byte41 = org.apache.commons.lang.math.NumberUtils.max(byteArray33);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(byteArray24, byteArray33);
        byte[] byteArray43 = null;
        byte[] byteArray50 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(byteArray43, byteArray50);
        byte byte52 = org.apache.commons.lang.math.NumberUtils.min(byteArray50);
        byte[] byteArray56 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte57 = org.apache.commons.lang.math.NumberUtils.max(byteArray56);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(byteArray50, byteArray56);
        byte byte59 = org.apache.commons.lang.math.NumberUtils.max(byteArray50);
        byte[] byteArray63 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte64 = org.apache.commons.lang.math.NumberUtils.max(byteArray63);
        byte[] byteArray65 = null;
        byte[] byteArray72 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(byteArray65, byteArray72);
        byte[] byteArray78 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(byteArray72, byteArray78);
        byte byte80 = org.apache.commons.lang.math.NumberUtils.max(byteArray72);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(byteArray63, byteArray72);
        byte byte82 = org.apache.commons.lang.math.NumberUtils.max(byteArray72);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(byteArray50, byteArray72);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(byteArray33, byteArray72);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray33);
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
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 10 + "'", byte25 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 100 + "'", byte41 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) -1 + "'", byte52 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte57 + "' != '" + (byte) 10 + "'", byte57 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + byte59 + "' != '" + (byte) 100 + "'", byte59 == (byte) 100);
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
        org.junit.Assert.assertTrue("'" + byte82 + "' != '" + (byte) 100 + "'", byte82 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 100, 1L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 100, 1L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(10.0f, 35.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(100.0f, (-1.0f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        float float85 = org.apache.commons.lang.math.NumberUtils.max(floatArray9);
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
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 0, (float) 97, (float) (-1));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) -1, 32.0d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) '#', (long) 35, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) 10, 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        float[] floatArray33 = new float[] { 0.0f, 35, (-1), 35 };
        float[] floatArray34 = new float[] {};
        float[] floatArray38 = new float[] { 0, 1.0f, 100 };
        float[] floatArray40 = new float[] { (-1L) };
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(floatArray38, floatArray40);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(floatArray34, floatArray38);
        float float43 = org.apache.commons.lang.math.NumberUtils.max(floatArray38);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(floatArray33, floatArray38);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(floatArray15, floatArray33);
        float float46 = org.apache.commons.lang.math.NumberUtils.max(floatArray15);
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
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[0.0, 35.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[]");
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 100.0f + "'", float43 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + (-1.0f) + "'", float46 == (-1.0f));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 100, 32.0f, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        byte[] byteArray63 = null;
        byte[] byteArray70 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(byteArray63, byteArray70);
        byte[] byteArray76 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(byteArray70, byteArray76);
        byte byte78 = org.apache.commons.lang.math.NumberUtils.min(byteArray70);
        byte byte79 = org.apache.commons.lang.math.NumberUtils.min(byteArray70);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(byteArray48, byteArray70);
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
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + byte78 + "' != '" + (byte) -1 + "'", byte78 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte79 + "' != '" + (byte) -1 + "'", byte79 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float[] floatArray10 = new float[] { 0, ' ', 100.0f };
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray10);
        float float12 = org.apache.commons.lang.math.NumberUtils.min(floatArray5);
        float float13 = org.apache.commons.lang.math.NumberUtils.max(floatArray5);
        float float14 = org.apache.commons.lang.math.NumberUtils.min(floatArray5);
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
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 10, (short) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 10, 32, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", 52.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        double[] doubleArray74 = new double[] { 0.0d };
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray74);
        double double76 = org.apache.commons.lang.math.NumberUtils.min(doubleArray27);
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
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 1.0d + "'", double76 == 1.0d);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) -1, (int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(10, 32, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 10, (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0f, 52.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(100, (int) '4', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (-1L), 100.0f, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        int[] intArray36 = null;
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray36);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 100, (double) 32L, (double) 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) ' ', (double) (short) 1, (double) 35);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 97.0f, 32.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        float float51 = org.apache.commons.lang.math.NumberUtils.max(floatArray15);
        float float52 = org.apache.commons.lang.math.NumberUtils.max(floatArray15);
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
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + (-1.0f) + "'", float51 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + (-1.0f) + "'", float52 == (-1.0f));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 0L, (double) (short) -1, (double) 35);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1, (double) 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(10.0d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0f, (float) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 0, (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        float float31 = org.apache.commons.lang.math.NumberUtils.max(floatArray26);
        float[] floatArray32 = new float[] {};
        float[] floatArray36 = new float[] { 0, 1.0f, 100 };
        float[] floatArray38 = new float[] { (-1L) };
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(floatArray36, floatArray38);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(floatArray32, floatArray36);
        float float41 = org.apache.commons.lang.math.NumberUtils.max(floatArray36);
        float[] floatArray45 = new float[] { 0, 1.0f, 100 };
        float[] floatArray47 = new float[] { (-1L) };
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(floatArray45, floatArray47);
        float float49 = org.apache.commons.lang.math.NumberUtils.min(floatArray47);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(floatArray36, floatArray47);
        float[] floatArray51 = new float[] {};
        float[] floatArray55 = new float[] { 0, 1.0f, 100 };
        float[] floatArray57 = new float[] { (-1L) };
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(floatArray55, floatArray57);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(floatArray51, floatArray55);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(floatArray47, floatArray55);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(floatArray26, floatArray47);
        float float62 = org.apache.commons.lang.math.NumberUtils.max(floatArray47);
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
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 100.0f + "'", float31 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 100.0f + "'", float41 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray45), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray47), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
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
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + (-1.0f) + "'", float62 == (-1.0f));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        long[] longArray46 = new long[] { 0L, 35, 32L, '#' };
        long[] longArray50 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray51 = new long[] {};
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(longArray50, longArray51);
        long long53 = org.apache.commons.lang.math.NumberUtils.max(longArray50);
        long long54 = org.apache.commons.lang.math.NumberUtils.max(longArray50);
        long long55 = org.apache.commons.lang.math.NumberUtils.max(longArray50);
        long long56 = org.apache.commons.lang.math.NumberUtils.min(longArray50);
        long[] longArray60 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray61 = new long[] {};
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(longArray60, longArray61);
        long long63 = org.apache.commons.lang.math.NumberUtils.max(longArray60);
        long long64 = org.apache.commons.lang.math.NumberUtils.max(longArray60);
        long long65 = org.apache.commons.lang.math.NumberUtils.min(longArray60);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(longArray50, longArray60);
        long[] longArray70 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray71 = new long[] {};
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(longArray70, longArray71);
        long long73 = org.apache.commons.lang.math.NumberUtils.max(longArray70);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(longArray60, longArray70);
        long[] longArray78 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray79 = new long[] {};
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(longArray78, longArray79);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(longArray70, longArray78);
        long long82 = org.apache.commons.lang.math.NumberUtils.min(longArray70);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(longArray46, longArray70);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray46);
        long long85 = org.apache.commons.lang.math.NumberUtils.min(longArray46);
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
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[0, 35, 32, 35]");
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 52L + "'", long53 == 52L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 52L + "'", long54 == 52L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 52L + "'", long55 == 52L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-1L) + "'", long56 == (-1L));
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 52L + "'", long63 == 52L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 52L + "'", long64 == 52L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-1L) + "'", long65 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray71), "[]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 52L + "'", long73 == 52L);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray78), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + (-1L) + "'", long82 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        long long52 = org.apache.commons.lang.math.NumberUtils.max(longArray28);
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
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 52L + "'", long52 == 52L);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) (byte) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float[] floatArray10 = new float[] { 0, 1.0f, 100 };
        float[] floatArray12 = new float[] { (-1L) };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray12);
        float float14 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray10);
        float float16 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        float float17 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        java.lang.Class<?> wildcardClass18 = floatArray10.getClass();
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
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 97L, (double) 100L, 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 1, (double) (byte) 100, (double) 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) '4', 35.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 10.0f, 100.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(32.0f, (float) (byte) -1, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int[] intArray15 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray20 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray15, intArray20);
        int int22 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray20);
        int int24 = org.apache.commons.lang.math.NumberUtils.max(intArray20);
        int[] intArray31 = new int[] { (short) 0, '4', (byte) 0, (short) 1, (short) 10, '#' };
        int int32 = org.apache.commons.lang.math.NumberUtils.min(intArray31);
        int int33 = org.apache.commons.lang.math.NumberUtils.min(intArray31);
        int[] intArray40 = new int[] { (short) 0, '4', (byte) 0, (short) 1, (short) 10, '#' };
        int int41 = org.apache.commons.lang.math.NumberUtils.min(intArray40);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(intArray31, intArray40);
        int[] intArray48 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int49 = org.apache.commons.lang.math.NumberUtils.max(intArray48);
        int int50 = org.apache.commons.lang.math.NumberUtils.max(intArray48);
        int int51 = org.apache.commons.lang.math.NumberUtils.max(intArray48);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(intArray40, intArray48);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(intArray20, intArray48);
        int[] intArray58 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray63 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(intArray58, intArray63);
        int int65 = org.apache.commons.lang.math.NumberUtils.max(intArray63);
        int int66 = org.apache.commons.lang.math.NumberUtils.max(intArray63);
        int[] intArray71 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray76 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(intArray71, intArray76);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(intArray63, intArray71);
        int[] intArray84 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int85 = org.apache.commons.lang.math.NumberUtils.max(intArray84);
        int int86 = org.apache.commons.lang.math.NumberUtils.max(intArray84);
        int int87 = org.apache.commons.lang.math.NumberUtils.max(intArray84);
        int int88 = org.apache.commons.lang.math.NumberUtils.max(intArray84);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(intArray71, intArray84);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(intArray48, intArray84);
        int int91 = org.apache.commons.lang.math.NumberUtils.max(intArray48);
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
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 52, 0, 1, 10, 35]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 52, 0, 1, 10, 35]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 100 + "'", int66 == 100);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 100 + "'", int85 == 100);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 100 + "'", int86 == 100);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 100 + "'", int87 == 100);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 100 + "'", int88 == 100);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 100 + "'", int91 == 100);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) 10, (float) (short) 10, (float) 97);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 1, (double) '#', (double) 52);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        long long65 = org.apache.commons.lang.math.NumberUtils.min(longArray23);
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
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-1L) + "'", long65 == (-1L));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(32, (-1), (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) 10, (float) 52, (float) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        float float24 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
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
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(10.0d, (double) 10, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        int[] intArray6 = new int[] { (short) 0, '4', (byte) 0, (short) 1, (short) 10, '#' };
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray6);
        int int8 = org.apache.commons.lang.math.NumberUtils.min(intArray6);
        int[] intArray15 = new int[] { (short) 0, '4', (byte) 0, (short) 1, (short) 10, '#' };
        int int16 = org.apache.commons.lang.math.NumberUtils.min(intArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray15);
        int[] intArray23 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int24 = org.apache.commons.lang.math.NumberUtils.max(intArray23);
        int int25 = org.apache.commons.lang.math.NumberUtils.max(intArray23);
        int int26 = org.apache.commons.lang.math.NumberUtils.max(intArray23);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(intArray15, intArray23);
        int[] intArray32 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray37 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(intArray32, intArray37);
        int int39 = org.apache.commons.lang.math.NumberUtils.max(intArray37);
        int int40 = org.apache.commons.lang.math.NumberUtils.max(intArray37);
        int[] intArray45 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray50 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(intArray45, intArray50);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(intArray37, intArray45);
        int int53 = org.apache.commons.lang.math.NumberUtils.min(intArray45);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(intArray23, intArray45);
        java.lang.Class<?> wildcardClass55 = intArray45.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 52, 0, 1, 10, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 52, 0, 1, 10, 35]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 1, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, (int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        float[] floatArray33 = new float[] { 0.0f, 35, (-1), 35 };
        float[] floatArray34 = new float[] {};
        float[] floatArray38 = new float[] { 0, 1.0f, 100 };
        float[] floatArray40 = new float[] { (-1L) };
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(floatArray38, floatArray40);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(floatArray34, floatArray38);
        float float43 = org.apache.commons.lang.math.NumberUtils.max(floatArray38);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(floatArray33, floatArray38);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(floatArray15, floatArray33);
        float float46 = org.apache.commons.lang.math.NumberUtils.min(floatArray33);
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
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[0.0, 35.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[]");
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 100.0f + "'", float43 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + (-1.0f) + "'", float46 == (-1.0f));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        java.lang.Class<?> wildcardClass79 = floatArray4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(10, (int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) -1, (int) (short) 0, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        int int36 = org.apache.commons.lang.math.NumberUtils.min(intArray28);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) 100, (-1.0f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(35, 52, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) (byte) 1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) (byte) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double[] doubleArray10 = new double[] { 100L, 1.0f };
        double[] doubleArray14 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray14);
        double[] doubleArray18 = new double[] { 100L, 1.0f };
        double[] doubleArray22 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray18, doubleArray22);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray18);
        double[] doubleArray27 = new double[] { 100L, 1.0f };
        double[] doubleArray31 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray31);
        double[] doubleArray35 = new double[] { 100L, 1.0f };
        double[] doubleArray39 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray35, doubleArray39);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray31, doubleArray35);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray35);
        double double43 = org.apache.commons.lang.math.NumberUtils.min(doubleArray35);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray6, doubleArray35);
        double double45 = org.apache.commons.lang.math.NumberUtils.max(doubleArray35);
        double double46 = org.apache.commons.lang.math.NumberUtils.max(doubleArray35);
        double double47 = org.apache.commons.lang.math.NumberUtils.min(doubleArray35);
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
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 100.0d + "'", double45 == 100.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        short[] shortArray3 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short4 = org.apache.commons.lang.math.NumberUtils.max(shortArray3);
        short[] shortArray8 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray8);
        short short10 = org.apache.commons.lang.math.NumberUtils.min(shortArray3);
        short short11 = org.apache.commons.lang.math.NumberUtils.min(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) -1, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        float[] floatArray0 = null;
        float[] floatArray1 = new float[] {};
        float[] floatArray5 = new float[] { 0, 1.0f, 100 };
        float[] floatArray7 = new float[] { (-1L) };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray7);
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray5);
        float[] floatArray13 = new float[] { 0, 1.0f, 100 };
        float[] floatArray15 = new float[] { (-1L) };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(floatArray13, floatArray15);
        float[] floatArray20 = new float[] { 0, ' ', 100.0f };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(floatArray15, floatArray20);
        float float22 = org.apache.commons.lang.math.NumberUtils.min(floatArray15);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray15);
        float[] floatArray24 = null;
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray24);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray24);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + (-1.0f) + "'", float22 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) (byte) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) 1, (double) 32, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
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
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 100, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) (byte) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 0L, 1.0f, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 'a', (long) 52, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) 'a', 97, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 10L, (float) 100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 32, 0.0f, (float) 35);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) -1, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(32, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(10L, (long) (byte) 0, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) 'a', (int) '#', 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(52, 100, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 100, (double) 0.0f, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) (byte) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 100, (int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(100, 52, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(35.0f, 97.0f, (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 0.0f, (double) 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        short[] shortArray54 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short55 = org.apache.commons.lang.math.NumberUtils.max(shortArray54);
        short short56 = org.apache.commons.lang.math.NumberUtils.min(shortArray54);
        short[] shortArray61 = new short[] { (byte) -1, (short) 100, (byte) -1, (byte) -1 };
        short short62 = org.apache.commons.lang.math.NumberUtils.max(shortArray61);
        short[] shortArray65 = new short[] { (short) -1, (short) -1 };
        short short66 = org.apache.commons.lang.math.NumberUtils.min(shortArray65);
        short[] shortArray70 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short71 = org.apache.commons.lang.math.NumberUtils.max(shortArray70);
        short[] shortArray75 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(shortArray70, shortArray75);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(shortArray65, shortArray70);
        short[] shortArray79 = new short[] { (short) 100 };
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(shortArray65, shortArray79);
        short short81 = org.apache.commons.lang.math.NumberUtils.min(shortArray79);
        short short82 = org.apache.commons.lang.math.NumberUtils.max(shortArray79);
        short short83 = org.apache.commons.lang.math.NumberUtils.min(shortArray79);
        short short84 = org.apache.commons.lang.math.NumberUtils.min(shortArray79);
        short[] shortArray88 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short89 = org.apache.commons.lang.math.NumberUtils.max(shortArray88);
        short[] shortArray93 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(shortArray88, shortArray93);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(shortArray79, shortArray88);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(shortArray61, shortArray79);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(shortArray54, shortArray79);
        short short98 = org.apache.commons.lang.math.NumberUtils.max(shortArray79);
        boolean boolean99 = org.apache.commons.lang.math.NumberUtils.equals(shortArray45, shortArray79);
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
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short55 + "' != '" + (short) 10 + "'", short55 == (short) 10);
        org.junit.Assert.assertTrue("'" + short56 + "' != '" + (short) 1 + "'", short56 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray61), "[-1, 100, -1, -1]");
        org.junit.Assert.assertTrue("'" + short62 + "' != '" + (short) 100 + "'", short62 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray65), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short66 + "' != '" + (short) -1 + "'", short66 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray70), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short71 + "' != '" + (short) 10 + "'", short71 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray75), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(shortArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray79), "[100]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + short81 + "' != '" + (short) 100 + "'", short81 == (short) 100);
        org.junit.Assert.assertTrue("'" + short82 + "' != '" + (short) 100 + "'", short82 == (short) 100);
        org.junit.Assert.assertTrue("'" + short83 + "' != '" + (short) 100 + "'", short83 == (short) 100);
        org.junit.Assert.assertTrue("'" + short84 + "' != '" + (short) 100 + "'", short84 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray88), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short89 + "' != '" + (short) 10 + "'", short89 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray93), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + short98 + "' != '" + (short) 100 + "'", short98 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        byte byte60 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
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
        org.junit.Assert.assertTrue("'" + byte60 + "' != '" + (byte) -1 + "'", byte60 == (byte) -1);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        java.lang.Class<?> wildcardClass21 = longArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) (byte) -1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 100, 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) 10, (float) (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) 10, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        // The following exception was thrown during execution in test generation
        try {
            int int35 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 10.0f, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(1, (int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) 0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, 10, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
        double double35 = org.apache.commons.lang.math.NumberUtils.min(doubleArray2);
        double double36 = org.apache.commons.lang.math.NumberUtils.max(doubleArray2);
        java.lang.Class<?> wildcardClass37 = doubleArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) (byte) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 52, 10L, 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        byte byte20 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
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
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) -1 + "'", byte20 == (byte) -1);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        int[] intArray44 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray49 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(intArray44, intArray49);
        int int51 = org.apache.commons.lang.math.NumberUtils.min(intArray49);
        int int52 = org.apache.commons.lang.math.NumberUtils.min(intArray49);
        int int53 = org.apache.commons.lang.math.NumberUtils.max(intArray49);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(intArray20, intArray49);
        int int55 = org.apache.commons.lang.math.NumberUtils.min(intArray49);
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
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 10, (float) 97L, (float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte byte10 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte17 = org.apache.commons.lang.math.NumberUtils.max(byteArray16);
        byte byte18 = org.apache.commons.lang.math.NumberUtils.max(byteArray16);
        byte byte19 = org.apache.commons.lang.math.NumberUtils.min(byteArray16);
        byte byte20 = org.apache.commons.lang.math.NumberUtils.min(byteArray16);
        byte byte21 = org.apache.commons.lang.math.NumberUtils.min(byteArray16);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray16);
        byte[] byteArray23 = null;
        byte[] byteArray30 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(byteArray23, byteArray30);
        byte byte32 = org.apache.commons.lang.math.NumberUtils.min(byteArray30);
        byte[] byteArray36 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte37 = org.apache.commons.lang.math.NumberUtils.max(byteArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(byteArray30, byteArray36);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(byteArray16, byteArray36);
        byte byte40 = org.apache.commons.lang.math.NumberUtils.max(byteArray36);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 10 + "'", byte17 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 10 + "'", byte18 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) -1 + "'", byte19 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) -1 + "'", byte20 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) -1 + "'", byte21 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) -1 + "'", byte32 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 10 + "'", byte37 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) 10 + "'", byte40 == (byte) 10);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 1, (long) (short) 1, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        int[] intArray5 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int6 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int int8 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int[] intArray13 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray18 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray18);
        int int20 = org.apache.commons.lang.math.NumberUtils.min(intArray18);
        int int21 = org.apache.commons.lang.math.NumberUtils.min(intArray18);
        int int22 = org.apache.commons.lang.math.NumberUtils.max(intArray18);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray5, intArray18);
        int int24 = org.apache.commons.lang.math.NumberUtils.min(intArray5);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 32L, (double) 100, (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(10L, (long) 1, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float[] floatArray10 = new float[] { (short) 0, (byte) 0, (byte) 100 };
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray10);
        float float13 = org.apache.commons.lang.math.NumberUtils.min(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 1, (int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 1, 52, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) ' ', (float) (-1L), (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 1, (float) (short) -1, (float) 35);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        int[] intArray6 = new int[] { (short) 0, '4', (byte) 0, (short) 1, (short) 10, '#' };
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray6);
        int int8 = org.apache.commons.lang.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 52, 0, 1, 10, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 10, 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        // The following exception was thrown during execution in test generation
        try {
            double double21 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 0, 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(35, 100, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (-1), (double) (short) 10, (double) 32L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 32, (float) 35, 97.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 35L, (double) 100, (double) 32L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        short[] shortArray3 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short4 = org.apache.commons.lang.math.NumberUtils.max(shortArray3);
        short short5 = org.apache.commons.lang.math.NumberUtils.min(shortArray3);
        short short6 = org.apache.commons.lang.math.NumberUtils.min(shortArray3);
        short short7 = org.apache.commons.lang.math.NumberUtils.min(shortArray3);
        short[] shortArray10 = new short[] { (short) -1, (short) -1 };
        short short11 = org.apache.commons.lang.math.NumberUtils.min(shortArray10);
        short[] shortArray15 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short16 = org.apache.commons.lang.math.NumberUtils.max(shortArray15);
        short[] shortArray20 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(shortArray15, shortArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray15);
        short[] shortArray24 = new short[] { (short) 100 };
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray24);
        short short26 = org.apache.commons.lang.math.NumberUtils.max(shortArray10);
        short[] shortArray29 = new short[] { (short) -1, (short) -1 };
        short short30 = org.apache.commons.lang.math.NumberUtils.min(shortArray29);
        short[] shortArray34 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short35 = org.apache.commons.lang.math.NumberUtils.max(shortArray34);
        short[] shortArray39 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(shortArray34, shortArray39);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(shortArray29, shortArray34);
        short[] shortArray43 = new short[] { (short) 100 };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(shortArray29, shortArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray29);
        short short46 = org.apache.commons.lang.math.NumberUtils.max(shortArray29);
        short[] shortArray49 = new short[] { (short) -1, (short) -1 };
        short short50 = org.apache.commons.lang.math.NumberUtils.min(shortArray49);
        short[] shortArray54 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short55 = org.apache.commons.lang.math.NumberUtils.max(shortArray54);
        short[] shortArray59 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(shortArray54, shortArray59);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(shortArray49, shortArray54);
        short[] shortArray63 = new short[] { (short) 100 };
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(shortArray49, shortArray63);
        short short65 = org.apache.commons.lang.math.NumberUtils.min(shortArray63);
        short short66 = org.apache.commons.lang.math.NumberUtils.max(shortArray63);
        short short67 = org.apache.commons.lang.math.NumberUtils.min(shortArray63);
        short short68 = org.apache.commons.lang.math.NumberUtils.min(shortArray63);
        short[] shortArray72 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short73 = org.apache.commons.lang.math.NumberUtils.max(shortArray72);
        short[] shortArray77 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(shortArray72, shortArray77);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(shortArray63, shortArray72);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(shortArray29, shortArray63);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray63);
        short short82 = org.apache.commons.lang.math.NumberUtils.max(shortArray63);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[100]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) -1 + "'", short26 == (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + short46 + "' != '" + (short) -1 + "'", short46 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short50 + "' != '" + (short) -1 + "'", short50 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short55 + "' != '" + (short) 10 + "'", short55 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray59), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray63), "[100]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + short65 + "' != '" + (short) 100 + "'", short65 == (short) 100);
        org.junit.Assert.assertTrue("'" + short66 + "' != '" + (short) 100 + "'", short66 == (short) 100);
        org.junit.Assert.assertTrue("'" + short67 + "' != '" + (short) 100 + "'", short67 == (short) 100);
        org.junit.Assert.assertTrue("'" + short68 + "' != '" + (short) 100 + "'", short68 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray72), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short73 + "' != '" + (short) 10 + "'", short73 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray77), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + short82 + "' != '" + (short) 100 + "'", short82 == (short) 100);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(100, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) (byte) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(1.0f, (float) 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 1, (long) (byte) 0, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, 35, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int int12 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray13 = null;
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.lang.math.NumberUtils.min(intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 100, (int) (short) 1, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 0, 97L, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 10, (double) 100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        float[] floatArray67 = new float[] { 0, 1.0f, 100 };
        float[] floatArray69 = new float[] { (-1L) };
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(floatArray67, floatArray69);
        float[] floatArray74 = new float[] { 0, 1.0f, 100 };
        float[] floatArray76 = new float[] { (-1L) };
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(floatArray74, floatArray76);
        float float78 = org.apache.commons.lang.math.NumberUtils.max(floatArray74);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(floatArray67, floatArray74);
        float float80 = org.apache.commons.lang.math.NumberUtils.max(floatArray67);
        float[] floatArray81 = new float[] {};
        float[] floatArray85 = new float[] { 0, 1.0f, 100 };
        float[] floatArray87 = new float[] { (-1L) };
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(floatArray85, floatArray87);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(floatArray81, floatArray85);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(floatArray67, floatArray85);
        float float91 = org.apache.commons.lang.math.NumberUtils.max(floatArray85);
        float float92 = org.apache.commons.lang.math.NumberUtils.min(floatArray85);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(floatArray45, floatArray85);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(floatArray32, floatArray45);
        float float95 = org.apache.commons.lang.math.NumberUtils.min(floatArray45);
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
        org.junit.Assert.assertNotNull(floatArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray67), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray69), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(floatArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray74), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray76), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + float78 + "' != '" + 100.0f + "'", float78 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + float80 + "' != '" + 100.0f + "'", float80 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray81), "[]");
        org.junit.Assert.assertNotNull(floatArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray85), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray87), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + float91 + "' != '" + 100.0f + "'", float91 == 100.0f);
        org.junit.Assert.assertTrue("'" + float92 + "' != '" + 0.0f + "'", float92 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + float95 + "' != '" + 0.0f + "'", float95 == 0.0f);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(32L, (long) 0, (long) 52);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(0.0d, (double) 35, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        double[] doubleArray75 = new double[] { 100L, 1.0f };
        double[] doubleArray79 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray75, doubleArray79);
        double[] doubleArray83 = new double[] { 100L, 1.0f };
        double[] doubleArray87 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray83, doubleArray87);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray79, doubleArray83);
        double double90 = org.apache.commons.lang.math.NumberUtils.min(doubleArray79);
        double double91 = org.apache.commons.lang.math.NumberUtils.min(doubleArray79);
        double double92 = org.apache.commons.lang.math.NumberUtils.max(doubleArray79);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray79);
        double double94 = org.apache.commons.lang.math.NumberUtils.min(doubleArray79);
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
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 1.0d + "'", double90 == 1.0d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 1.0d + "'", double91 == 1.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 100.0d + "'", double92 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 1.0d + "'", double94 == 1.0d);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 100L, 35.0f, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 1.0f, (double) 35.0f, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 10, 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, 100L, 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 52.0f, (double) (-1), (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(52.0f, (float) 100, (float) 52L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 10, (long) '#', (long) 52);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 100L, (double) (-1.0f), (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) -1, (double) (-1.0f), (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int[] intArray15 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray20 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray15, intArray20);
        int int22 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray20);
        int int24 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray29 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray34 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(intArray29, intArray34);
        int int36 = org.apache.commons.lang.math.NumberUtils.max(intArray34);
        int int37 = org.apache.commons.lang.math.NumberUtils.min(intArray34);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray34);
        int int39 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 10, (long) (byte) 10, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) (byte) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        short[] shortArray40 = null;
        short[] shortArray44 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short45 = org.apache.commons.lang.math.NumberUtils.max(shortArray44);
        short[] shortArray49 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(shortArray44, shortArray49);
        short[] shortArray53 = new short[] { (short) -1, (short) -1 };
        short short54 = org.apache.commons.lang.math.NumberUtils.min(shortArray53);
        short[] shortArray58 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short59 = org.apache.commons.lang.math.NumberUtils.max(shortArray58);
        short[] shortArray63 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(shortArray58, shortArray63);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(shortArray53, shortArray58);
        short[] shortArray67 = new short[] { (short) 100 };
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(shortArray53, shortArray67);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(shortArray44, shortArray67);
        short short70 = org.apache.commons.lang.math.NumberUtils.max(shortArray44);
        short short71 = org.apache.commons.lang.math.NumberUtils.min(shortArray44);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(shortArray40, shortArray44);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray40);
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
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray44), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short45 + "' != '" + (short) 10 + "'", short45 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray53), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short54 + "' != '" + (short) -1 + "'", short54 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray58), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short59 + "' != '" + (short) 10 + "'", short59 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray63), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(shortArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray67), "[100]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + short70 + "' != '" + (short) 10 + "'", short70 == (short) 10);
        org.junit.Assert.assertTrue("'" + short71 + "' != '" + (short) 1 + "'", short71 == (short) 1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 100, 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 52, 35.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        int[] intArray6 = new int[] { (short) 0, '4', (byte) 0, (short) 1, (short) 10, '#' };
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray6);
        int int8 = org.apache.commons.lang.math.NumberUtils.min(intArray6);
        int[] intArray15 = new int[] { (short) 0, '4', (byte) 0, (short) 1, (short) 10, '#' };
        int int16 = org.apache.commons.lang.math.NumberUtils.min(intArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray15);
        int[] intArray22 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray27 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(intArray22, intArray27);
        int int29 = org.apache.commons.lang.math.NumberUtils.max(intArray27);
        int int30 = org.apache.commons.lang.math.NumberUtils.max(intArray27);
        int[] intArray35 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray40 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray40);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(intArray27, intArray35);
        int int43 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        int int44 = org.apache.commons.lang.math.NumberUtils.max(intArray35);
        int int45 = org.apache.commons.lang.math.NumberUtils.max(intArray35);
        int int46 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray35);
        int int48 = org.apache.commons.lang.math.NumberUtils.max(intArray6);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 52 + "'", int48 == 52);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 0, 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        short[] shortArray1 = new short[] { (short) -1 };
        short short2 = org.apache.commons.lang.math.NumberUtils.max(shortArray1);
        short[] shortArray5 = new short[] { (short) -1, (short) -1 };
        short short6 = org.apache.commons.lang.math.NumberUtils.min(shortArray5);
        short[] shortArray10 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short11 = org.apache.commons.lang.math.NumberUtils.max(shortArray10);
        short[] shortArray15 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray10);
        short[] shortArray19 = new short[] { (short) 100 };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray19);
        short short21 = org.apache.commons.lang.math.NumberUtils.max(shortArray5);
        short[] shortArray24 = new short[] { (short) -1, (short) -1 };
        short short25 = org.apache.commons.lang.math.NumberUtils.min(shortArray24);
        short[] shortArray29 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short30 = org.apache.commons.lang.math.NumberUtils.max(shortArray29);
        short[] shortArray34 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(shortArray29, shortArray34);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(shortArray24, shortArray29);
        short[] shortArray38 = new short[] { (short) 100 };
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(shortArray24, shortArray38);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray24);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray5);
        short short42 = org.apache.commons.lang.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[100]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) -1 + "'", short21 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) -1 + "'", short25 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 10 + "'", short30 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[100]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) -1 + "'", short42 == (short) -1);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) (byte) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(0.0d, 0.0d, (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte byte10 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        java.lang.Class<?> wildcardClass11 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        long[] longArray0 = new long[] {};
        long[] longArray2 = new long[] { (byte) -1 };
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray2);
        long long4 = org.apache.commons.lang.math.NumberUtils.max(longArray2);
        long[] longArray7 = new long[] { 52L, (short) 1 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray7);
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray7);
        long long10 = org.apache.commons.lang.math.NumberUtils.max(longArray7);
        long long11 = org.apache.commons.lang.math.NumberUtils.max(longArray7);
        long[] longArray12 = new long[] {};
        long[] longArray14 = new long[] { (byte) -1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(longArray12, longArray14);
        long long16 = org.apache.commons.lang.math.NumberUtils.max(longArray14);
        long[] longArray19 = new long[] { 52L, (short) 1 };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray14, longArray19);
        long[] longArray21 = new long[] {};
        long[] longArray23 = new long[] { (byte) -1 };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(longArray21, longArray23);
        long[] longArray25 = new long[] {};
        long[] longArray27 = new long[] { (byte) -1 };
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray25, longArray27);
        long long29 = org.apache.commons.lang.math.NumberUtils.max(longArray27);
        long long30 = org.apache.commons.lang.math.NumberUtils.max(longArray27);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(longArray23, longArray27);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(longArray14, longArray27);
        long long33 = org.apache.commons.lang.math.NumberUtils.max(longArray27);
        long[] longArray37 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray38 = new long[] {};
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray37, longArray38);
        long long40 = org.apache.commons.lang.math.NumberUtils.max(longArray37);
        long long41 = org.apache.commons.lang.math.NumberUtils.max(longArray37);
        long long42 = org.apache.commons.lang.math.NumberUtils.max(longArray37);
        long[] longArray43 = new long[] {};
        long[] longArray45 = new long[] { (byte) -1 };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(longArray43, longArray45);
        long long47 = org.apache.commons.lang.math.NumberUtils.max(longArray45);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(longArray37, longArray45);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(longArray27, longArray37);
        long long50 = org.apache.commons.lang.math.NumberUtils.min(longArray37);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(longArray7, longArray37);
        long long52 = org.apache.commons.lang.math.NumberUtils.min(longArray37);
        long[] longArray56 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray57 = new long[] {};
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(longArray56, longArray57);
        long long59 = org.apache.commons.lang.math.NumberUtils.max(longArray56);
        long long60 = org.apache.commons.lang.math.NumberUtils.max(longArray56);
        long long61 = org.apache.commons.lang.math.NumberUtils.max(longArray56);
        long long62 = org.apache.commons.lang.math.NumberUtils.min(longArray56);
        long[] longArray66 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray67 = new long[] {};
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(longArray66, longArray67);
        long long69 = org.apache.commons.lang.math.NumberUtils.max(longArray66);
        long long70 = org.apache.commons.lang.math.NumberUtils.max(longArray66);
        long long71 = org.apache.commons.lang.math.NumberUtils.min(longArray66);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(longArray56, longArray66);
        long[] longArray76 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray77 = new long[] {};
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(longArray76, longArray77);
        long long79 = org.apache.commons.lang.math.NumberUtils.max(longArray76);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(longArray66, longArray76);
        long[] longArray84 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray85 = new long[] {};
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(longArray84, longArray85);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(longArray76, longArray84);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(longArray37, longArray76);
        long long89 = org.apache.commons.lang.math.NumberUtils.min(longArray76);
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 52L + "'", long40 == 52L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 52L + "'", long41 == 52L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 52L + "'", long42 == 52L);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[]");
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 52L + "'", long59 == 52L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 52L + "'", long60 == 52L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 52L + "'", long61 == 52L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-1L) + "'", long62 == (-1L));
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 52L + "'", long69 == 52L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 52L + "'", long70 == 52L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-1L) + "'", long71 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 52L + "'", long79 == 52L);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray85), "[]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + (-1L) + "'", long89 == (-1L));
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '4', (long) (byte) 0, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        float[] floatArray75 = new float[] {};
        float[] floatArray79 = new float[] { 0, 1.0f, 100 };
        float[] floatArray81 = new float[] { (-1L) };
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(floatArray79, floatArray81);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(floatArray75, floatArray79);
        float float84 = org.apache.commons.lang.math.NumberUtils.max(floatArray79);
        float[] floatArray88 = new float[] { 0, 1.0f, 100 };
        float[] floatArray90 = new float[] { (-1L) };
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(floatArray88, floatArray90);
        float float92 = org.apache.commons.lang.math.NumberUtils.min(floatArray90);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(floatArray79, floatArray90);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(floatArray39, floatArray90);
        float float95 = org.apache.commons.lang.math.NumberUtils.min(floatArray90);
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
        org.junit.Assert.assertNotNull(floatArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray75), "[]");
        org.junit.Assert.assertNotNull(floatArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray79), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray81), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + float84 + "' != '" + 100.0f + "'", float84 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray88), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray90), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + float92 + "' != '" + (-1.0f) + "'", float92 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + float95 + "' != '" + (-1.0f) + "'", float95 == (-1.0f));
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 1, (long) 97, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 35L, (float) 35, (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) 0, (float) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", 52.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 52L, (float) 32L, (float) 52L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(97.0f, (float) '4', 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        long[] longArray3 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray4 = new long[] {};
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray4);
        long[] longArray6 = null;
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
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
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) -1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        short[] shortArray2 = new short[] { (short) -1, (short) -1 };
        short short3 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
        short[] shortArray7 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short8 = org.apache.commons.lang.math.NumberUtils.max(shortArray7);
        short[] shortArray12 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray7, shortArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray7);
        short[] shortArray16 = new short[] { (short) 100 };
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray16);
        short short18 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
        short short19 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
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
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) ' ', (int) '#', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        short[] shortArray3 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short4 = org.apache.commons.lang.math.NumberUtils.max(shortArray3);
        short short5 = org.apache.commons.lang.math.NumberUtils.min(shortArray3);
        short[] shortArray10 = new short[] { (byte) -1, (short) 100, (byte) -1, (byte) -1 };
        short short11 = org.apache.commons.lang.math.NumberUtils.max(shortArray10);
        short[] shortArray14 = new short[] { (short) -1, (short) -1 };
        short short15 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
        short[] shortArray19 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short20 = org.apache.commons.lang.math.NumberUtils.max(shortArray19);
        short[] shortArray24 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray24);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray19);
        short[] shortArray28 = new short[] { (short) 100 };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray28);
        short short30 = org.apache.commons.lang.math.NumberUtils.min(shortArray28);
        short short31 = org.apache.commons.lang.math.NumberUtils.max(shortArray28);
        short short32 = org.apache.commons.lang.math.NumberUtils.min(shortArray28);
        short short33 = org.apache.commons.lang.math.NumberUtils.min(shortArray28);
        short[] shortArray37 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short38 = org.apache.commons.lang.math.NumberUtils.max(shortArray37);
        short[] shortArray42 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(shortArray37, shortArray42);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(shortArray28, shortArray37);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray28);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray28);
        short[] shortArray49 = new short[] { (short) -1, (short) -1 };
        short short50 = org.apache.commons.lang.math.NumberUtils.min(shortArray49);
        short[] shortArray54 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short55 = org.apache.commons.lang.math.NumberUtils.max(shortArray54);
        short[] shortArray59 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(shortArray54, shortArray59);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(shortArray49, shortArray54);
        short short62 = org.apache.commons.lang.math.NumberUtils.min(shortArray49);
        short short63 = org.apache.commons.lang.math.NumberUtils.max(shortArray49);
        short[] shortArray67 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short68 = org.apache.commons.lang.math.NumberUtils.max(shortArray67);
        short[] shortArray72 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(shortArray67, shortArray72);
        short[] shortArray76 = new short[] { (short) -1, (short) -1 };
        short short77 = org.apache.commons.lang.math.NumberUtils.min(shortArray76);
        short[] shortArray81 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short82 = org.apache.commons.lang.math.NumberUtils.max(shortArray81);
        short[] shortArray86 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(shortArray81, shortArray86);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(shortArray76, shortArray81);
        short[] shortArray90 = new short[] { (short) 100 };
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(shortArray76, shortArray90);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(shortArray67, shortArray90);
        short[] shortArray95 = new short[] { (short) -1, (short) -1 };
        short short96 = org.apache.commons.lang.math.NumberUtils.min(shortArray95);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(shortArray90, shortArray95);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(shortArray49, shortArray95);
        boolean boolean99 = org.apache.commons.lang.math.NumberUtils.equals(shortArray28, shortArray49);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[-1, 100, -1, -1]");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) -1 + "'", short15 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 10 + "'", short20 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[100]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 100 + "'", short30 == (short) 100);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 100 + "'", short31 == (short) 100);
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 100 + "'", short32 == (short) 100);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 100 + "'", short33 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) 10 + "'", short38 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short50 + "' != '" + (short) -1 + "'", short50 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short55 + "' != '" + (short) 10 + "'", short55 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray59), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + short62 + "' != '" + (short) -1 + "'", short62 == (short) -1);
        org.junit.Assert.assertTrue("'" + short63 + "' != '" + (short) -1 + "'", short63 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray67), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short68 + "' != '" + (short) 10 + "'", short68 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray72), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(shortArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray76), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short77 + "' != '" + (short) -1 + "'", short77 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray81), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short82 + "' != '" + (short) 10 + "'", short82 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray86), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(shortArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray90), "[100]");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(shortArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray95), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short96 + "' != '" + (short) -1 + "'", short96 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        long[] longArray24 = new long[] { 0L, 35, 32L, '#' };
        long[] longArray28 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray29 = new long[] {};
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(longArray28, longArray29);
        long long31 = org.apache.commons.lang.math.NumberUtils.max(longArray28);
        long long32 = org.apache.commons.lang.math.NumberUtils.max(longArray28);
        long long33 = org.apache.commons.lang.math.NumberUtils.max(longArray28);
        long long34 = org.apache.commons.lang.math.NumberUtils.min(longArray28);
        long[] longArray38 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray39 = new long[] {};
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(longArray38, longArray39);
        long long41 = org.apache.commons.lang.math.NumberUtils.max(longArray38);
        long long42 = org.apache.commons.lang.math.NumberUtils.max(longArray38);
        long long43 = org.apache.commons.lang.math.NumberUtils.min(longArray38);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(longArray28, longArray38);
        long[] longArray48 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray49 = new long[] {};
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(longArray48, longArray49);
        long long51 = org.apache.commons.lang.math.NumberUtils.max(longArray48);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(longArray38, longArray48);
        long[] longArray56 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray57 = new long[] {};
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(longArray56, longArray57);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(longArray48, longArray56);
        long long60 = org.apache.commons.lang.math.NumberUtils.min(longArray48);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(longArray24, longArray48);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray48);
        long[] longArray66 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray67 = new long[] {};
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(longArray66, longArray67);
        long long69 = org.apache.commons.lang.math.NumberUtils.min(longArray66);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(longArray48, longArray66);
        long long71 = org.apache.commons.lang.math.NumberUtils.min(longArray48);
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
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[0, 35, 32, 35]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 52L + "'", long31 == 52L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 52L + "'", long32 == 52L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 52L + "'", long33 == 52L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 52L + "'", long41 == 52L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 52L + "'", long42 == 52L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 52L + "'", long51 == 52L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-1L) + "'", long69 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-1L) + "'", long71 == (-1L));
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (-1), 0L, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        // The following exception was thrown during execution in test generation
        try {
            double double21 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) -1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte5 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte6 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte8 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte[] byteArray10 = null;
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(byteArray10, byteArray17);
        byte byte19 = org.apache.commons.lang.math.NumberUtils.min(byteArray17);
        byte byte20 = org.apache.commons.lang.math.NumberUtils.max(byteArray17);
        byte byte21 = org.apache.commons.lang.math.NumberUtils.max(byteArray17);
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte27 = org.apache.commons.lang.math.NumberUtils.max(byteArray26);
        byte byte28 = org.apache.commons.lang.math.NumberUtils.max(byteArray26);
        byte byte29 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        byte byte30 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        byte byte31 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray26);
        byte[] byteArray33 = null;
        byte[] byteArray40 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(byteArray33, byteArray40);
        byte byte42 = org.apache.commons.lang.math.NumberUtils.min(byteArray40);
        byte[] byteArray46 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte47 = org.apache.commons.lang.math.NumberUtils.max(byteArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(byteArray40, byteArray46);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray46);
        byte[] byteArray53 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte54 = org.apache.commons.lang.math.NumberUtils.max(byteArray53);
        byte[] byteArray57 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(byteArray53, byteArray57);
        byte[] byteArray63 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte64 = org.apache.commons.lang.math.NumberUtils.max(byteArray63);
        byte byte65 = org.apache.commons.lang.math.NumberUtils.max(byteArray63);
        byte byte66 = org.apache.commons.lang.math.NumberUtils.min(byteArray63);
        byte byte67 = org.apache.commons.lang.math.NumberUtils.min(byteArray63);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(byteArray57, byteArray63);
        byte[] byteArray72 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte73 = org.apache.commons.lang.math.NumberUtils.max(byteArray72);
        byte[] byteArray74 = null;
        byte[] byteArray81 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(byteArray74, byteArray81);
        byte[] byteArray87 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(byteArray81, byteArray87);
        byte byte89 = org.apache.commons.lang.math.NumberUtils.max(byteArray81);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(byteArray72, byteArray81);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(byteArray63, byteArray72);
        byte byte92 = org.apache.commons.lang.math.NumberUtils.max(byteArray63);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray63);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray26);
        byte byte95 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) -1 + "'", byte19 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 100 + "'", byte20 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 100 + "'", byte21 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 10 + "'", byte27 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 10 + "'", byte28 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) -1 + "'", byte29 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) -1 + "'", byte30 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) -1 + "'", byte31 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) -1 + "'", byte42 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte47 + "' != '" + (byte) 10 + "'", byte47 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte54 + "' != '" + (byte) 10 + "'", byte54 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte64 + "' != '" + (byte) 10 + "'", byte64 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte65 + "' != '" + (byte) 10 + "'", byte65 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte66 + "' != '" + (byte) -1 + "'", byte66 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) -1 + "'", byte67 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
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
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + byte92 + "' != '" + (byte) 10 + "'", byte92 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + byte95 + "' != '" + (byte) -1 + "'", byte95 == (byte) -1);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        float float53 = org.apache.commons.lang.math.NumberUtils.max(floatArray43);
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
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + (-1.0f) + "'", float53 == (-1.0f));
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) -1, 97, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(100, (int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        double[] doubleArray1 = new double[] { '#' };
        double double2 = org.apache.commons.lang.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang.math.NumberUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang.math.NumberUtils.min(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[35.0]");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (byte) 10, (double) 32.0f, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        short short30 = org.apache.commons.lang.math.NumberUtils.max(shortArray3);
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
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 10 + "'", short30 == (short) 10);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 100.0f, (double) (-1.0f), (double) 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(97.0d, (double) 10, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) 10, (float) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        byte[] byteArray0 = null;
        byte[] byteArray1 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(byteArray1, byteArray8);
        byte byte10 = org.apache.commons.lang.math.NumberUtils.min(byteArray8);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.min(byteArray8);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte17 = org.apache.commons.lang.math.NumberUtils.max(byteArray16);
        byte byte18 = org.apache.commons.lang.math.NumberUtils.max(byteArray16);
        byte byte19 = org.apache.commons.lang.math.NumberUtils.min(byteArray16);
        byte byte20 = org.apache.commons.lang.math.NumberUtils.max(byteArray16);
        byte byte21 = org.apache.commons.lang.math.NumberUtils.max(byteArray16);
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte27 = org.apache.commons.lang.math.NumberUtils.max(byteArray26);
        byte byte28 = org.apache.commons.lang.math.NumberUtils.max(byteArray26);
        byte byte29 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        byte byte30 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        byte[] byteArray35 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte36 = org.apache.commons.lang.math.NumberUtils.max(byteArray35);
        byte byte37 = org.apache.commons.lang.math.NumberUtils.max(byteArray35);
        byte byte38 = org.apache.commons.lang.math.NumberUtils.min(byteArray35);
        byte byte39 = org.apache.commons.lang.math.NumberUtils.min(byteArray35);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray35);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(byteArray16, byteArray35);
        byte byte42 = org.apache.commons.lang.math.NumberUtils.min(byteArray35);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(byteArray8, byteArray35);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray8);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 10 + "'", byte17 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 10 + "'", byte18 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) -1 + "'", byte19 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 10 + "'", byte20 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 10 + "'", byte21 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 10 + "'", byte27 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 10 + "'", byte28 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) -1 + "'", byte29 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) -1 + "'", byte30 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) 10 + "'", byte36 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 10 + "'", byte37 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) -1 + "'", byte38 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) -1 + "'", byte39 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) -1 + "'", byte42 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) -1, (float) 35, (float) 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 0, (int) (byte) 10, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        // The following exception was thrown during execution in test generation
        try {
            double double20 = org.apache.commons.lang.math.NumberUtils.max(doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
        int int42 = org.apache.commons.lang.math.NumberUtils.max(intArray22);
        int[] intArray47 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray52 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(intArray47, intArray52);
        int int54 = org.apache.commons.lang.math.NumberUtils.max(intArray52);
        int int55 = org.apache.commons.lang.math.NumberUtils.max(intArray52);
        int[] intArray60 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray65 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(intArray60, intArray65);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(intArray52, intArray60);
        int int68 = org.apache.commons.lang.math.NumberUtils.min(intArray52);
        int[] intArray69 = null;
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(intArray52, intArray69);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(intArray22, intArray69);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
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
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(10L, 1L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 1L, (double) (byte) 0, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) '#', (-1), 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        double double99 = org.apache.commons.lang.math.NumberUtils.min(doubleArray55);
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
        org.junit.Assert.assertTrue("'" + double99 + "' != '" + 1.0d + "'", double99 == 1.0d);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte5 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte6 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte8 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte[] byteArray10 = null;
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(byteArray10, byteArray17);
        byte byte19 = org.apache.commons.lang.math.NumberUtils.min(byteArray17);
        byte byte20 = org.apache.commons.lang.math.NumberUtils.max(byteArray17);
        byte byte21 = org.apache.commons.lang.math.NumberUtils.max(byteArray17);
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte27 = org.apache.commons.lang.math.NumberUtils.max(byteArray26);
        byte byte28 = org.apache.commons.lang.math.NumberUtils.max(byteArray26);
        byte byte29 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        byte byte30 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        byte byte31 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray26);
        byte[] byteArray33 = null;
        byte[] byteArray40 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(byteArray33, byteArray40);
        byte byte42 = org.apache.commons.lang.math.NumberUtils.min(byteArray40);
        byte[] byteArray46 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte47 = org.apache.commons.lang.math.NumberUtils.max(byteArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(byteArray40, byteArray46);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray46);
        byte[] byteArray53 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte54 = org.apache.commons.lang.math.NumberUtils.max(byteArray53);
        byte[] byteArray57 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(byteArray53, byteArray57);
        byte[] byteArray63 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte64 = org.apache.commons.lang.math.NumberUtils.max(byteArray63);
        byte byte65 = org.apache.commons.lang.math.NumberUtils.max(byteArray63);
        byte byte66 = org.apache.commons.lang.math.NumberUtils.min(byteArray63);
        byte byte67 = org.apache.commons.lang.math.NumberUtils.min(byteArray63);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(byteArray57, byteArray63);
        byte[] byteArray72 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte73 = org.apache.commons.lang.math.NumberUtils.max(byteArray72);
        byte[] byteArray74 = null;
        byte[] byteArray81 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(byteArray74, byteArray81);
        byte[] byteArray87 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(byteArray81, byteArray87);
        byte byte89 = org.apache.commons.lang.math.NumberUtils.max(byteArray81);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(byteArray72, byteArray81);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(byteArray63, byteArray72);
        byte byte92 = org.apache.commons.lang.math.NumberUtils.max(byteArray63);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray63);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray26);
        byte[] byteArray96 = new byte[] { (byte) 10 };
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray96);
        byte byte98 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) -1 + "'", byte19 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 100 + "'", byte20 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 100 + "'", byte21 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 10 + "'", byte27 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 10 + "'", byte28 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) -1 + "'", byte29 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) -1 + "'", byte30 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) -1 + "'", byte31 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) -1 + "'", byte42 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte47 + "' != '" + (byte) 10 + "'", byte47 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte54 + "' != '" + (byte) 10 + "'", byte54 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte64 + "' != '" + (byte) 10 + "'", byte64 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte65 + "' != '" + (byte) 10 + "'", byte65 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte66 + "' != '" + (byte) -1 + "'", byte66 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) -1 + "'", byte67 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
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
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + byte92 + "' != '" + (byte) 10 + "'", byte92 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(byteArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray96), "[10]");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + byte98 + "' != '" + (byte) -1 + "'", byte98 == (byte) -1);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
        int int43 = org.apache.commons.lang.math.NumberUtils.min(intArray22);
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(0L, (long) 'a', (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '4', 32, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        float float75 = org.apache.commons.lang.math.NumberUtils.max(floatArray18);
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
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + 100.0f + "'", float75 == 100.0f);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) (byte) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 52L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) '4', (float) 10, 97.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 97, (long) (short) 10, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) (byte) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0f, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        float[] floatArray0 = null;
        float[] floatArray5 = new float[] { 52.0f, 1.0f, 1L, (byte) 0 };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray5);
        float[] floatArray7 = new float[] {};
        float[] floatArray11 = new float[] { 0, 1.0f, 100 };
        float[] floatArray13 = new float[] { (-1L) };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(floatArray11, floatArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(floatArray7, floatArray11);
        float float16 = org.apache.commons.lang.math.NumberUtils.max(floatArray11);
        float[] floatArray20 = new float[] { 0, 1.0f, 100 };
        float[] floatArray22 = new float[] { (-1L) };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(floatArray20, floatArray22);
        float float24 = org.apache.commons.lang.math.NumberUtils.min(floatArray22);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(floatArray11, floatArray22);
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
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(floatArray26, floatArray40);
        float[] floatArray51 = new float[] { 0, 1.0f, 100 };
        float[] floatArray53 = new float[] { (-1L) };
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(floatArray51, floatArray53);
        float float55 = org.apache.commons.lang.math.NumberUtils.max(floatArray51);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(floatArray40, floatArray51);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(floatArray22, floatArray51);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray22);
        float float59 = org.apache.commons.lang.math.NumberUtils.max(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[52.0, 1.0, 1.0, 0.0]");
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
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-1.0f) + "'", float24 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray51), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 100.0f + "'", float55 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 52.0f + "'", float59 == 52.0f);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 52, (float) (short) 10, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
        float float31 = org.apache.commons.lang.math.NumberUtils.max(floatArray26);
        float[] floatArray32 = new float[] {};
        float[] floatArray36 = new float[] { 0, 1.0f, 100 };
        float[] floatArray38 = new float[] { (-1L) };
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(floatArray36, floatArray38);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(floatArray32, floatArray36);
        float float41 = org.apache.commons.lang.math.NumberUtils.max(floatArray36);
        float[] floatArray45 = new float[] { 0, 1.0f, 100 };
        float[] floatArray47 = new float[] { (-1L) };
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(floatArray45, floatArray47);
        float float49 = org.apache.commons.lang.math.NumberUtils.min(floatArray47);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(floatArray36, floatArray47);
        float[] floatArray51 = new float[] {};
        float[] floatArray55 = new float[] { 0, 1.0f, 100 };
        float[] floatArray57 = new float[] { (-1L) };
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(floatArray55, floatArray57);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(floatArray51, floatArray55);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(floatArray47, floatArray55);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(floatArray26, floatArray47);
        float float62 = org.apache.commons.lang.math.NumberUtils.min(floatArray26);
        float float63 = org.apache.commons.lang.math.NumberUtils.min(floatArray26);
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
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 100.0f + "'", float31 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 100.0f + "'", float41 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray45), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray47), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
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
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 0.0f + "'", float62 == 0.0f);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.0f + "'", float63 == 0.0f);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 35, (double) 52.0f, 32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 32L, (float) 0L, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
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
        short short69 = org.apache.commons.lang.math.NumberUtils.max(shortArray45);
        short short70 = org.apache.commons.lang.math.NumberUtils.max(shortArray45);
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
        org.junit.Assert.assertTrue("'" + short69 + "' != '" + (short) 100 + "'", short69 == (short) 100);
        org.junit.Assert.assertTrue("'" + short70 + "' != '" + (short) 100 + "'", short70 == (short) 100);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 100, (long) (short) 100, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
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
        short short69 = org.apache.commons.lang.math.NumberUtils.max(shortArray59);
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
        org.junit.Assert.assertTrue("'" + short69 + "' != '" + (short) 10 + "'", short69 == (short) 10);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        float[] floatArray55 = new float[] { 0, 1.0f, 100 };
        float[] floatArray57 = new float[] { (-1L) };
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(floatArray55, floatArray57);
        float[] floatArray62 = new float[] { 0, 1.0f, 100 };
        float[] floatArray64 = new float[] { (-1L) };
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(floatArray62, floatArray64);
        float float66 = org.apache.commons.lang.math.NumberUtils.max(floatArray62);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(floatArray57, floatArray62);
        float float68 = org.apache.commons.lang.math.NumberUtils.max(floatArray62);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(floatArray44, floatArray62);
        float float70 = org.apache.commons.lang.math.NumberUtils.min(floatArray44);
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
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray55), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray57), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(floatArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray62), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray64), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + 100.0f + "'", float66 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + float68 + "' != '" + 100.0f + "'", float68 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 0.0f + "'", float70 == 0.0f);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 1, (double) 10, (double) 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 1, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) 0, (double) 100L, (double) 52);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) 10, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, 0L, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 10, (int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        long long38 = org.apache.commons.lang.math.NumberUtils.max(longArray25);
        long long39 = org.apache.commons.lang.math.NumberUtils.min(longArray25);
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
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 52L + "'", long38 == 52L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 100, (long) (short) 100, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        java.lang.Class<?> wildcardClass51 = byteArray34.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 100, (int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) ' ', 100.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(0.0f, (-1.0f), (float) 35L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        long[] longArray43 = null;
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray43);
        java.lang.Class<?> wildcardClass45 = longArray4.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 100L, 1.0f };
        double[] doubleArray7 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray3, doubleArray7);
        double[] doubleArray11 = new double[] { 100L, 1.0f };
        double[] doubleArray15 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray7, doubleArray11);
        double[] doubleArray20 = new double[] { 100L, 1.0f };
        double[] doubleArray24 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray20, doubleArray24);
        double[] doubleArray28 = new double[] { 100L, 1.0f };
        double[] doubleArray32 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray28, doubleArray32);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray20, doubleArray28);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray28);
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
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray28, doubleArray38);
        double[] doubleArray74 = new double[] { 100L, 1.0f };
        double[] doubleArray78 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray74, doubleArray78);
        double[] doubleArray82 = new double[] { 100L, 1.0f };
        double[] doubleArray86 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray82, doubleArray86);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray78, doubleArray82);
        double double89 = org.apache.commons.lang.math.NumberUtils.min(doubleArray82);
        double double90 = org.apache.commons.lang.math.NumberUtils.max(doubleArray82);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray28, doubleArray82);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray82);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
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
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 1.0d + "'", double89 == 1.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 100.0d + "'", double90 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0d, (-1.0d));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, 35, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(100.0f, (float) 10L, (float) 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) (byte) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '4', (long) (byte) 100, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 97L, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 10, (double) 32, (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 1, 52L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 1.0f, (double) 97.0f, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
        short short54 = org.apache.commons.lang.math.NumberUtils.max(shortArray16);
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
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        short[] shortArray1 = new short[] { (short) -1 };
        short short2 = org.apache.commons.lang.math.NumberUtils.max(shortArray1);
        short[] shortArray5 = new short[] { (short) -1, (short) -1 };
        short short6 = org.apache.commons.lang.math.NumberUtils.min(shortArray5);
        short[] shortArray10 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short11 = org.apache.commons.lang.math.NumberUtils.max(shortArray10);
        short[] shortArray15 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray10);
        short[] shortArray19 = new short[] { (short) 100 };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray19);
        short short21 = org.apache.commons.lang.math.NumberUtils.max(shortArray5);
        short[] shortArray24 = new short[] { (short) -1, (short) -1 };
        short short25 = org.apache.commons.lang.math.NumberUtils.min(shortArray24);
        short[] shortArray29 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short30 = org.apache.commons.lang.math.NumberUtils.max(shortArray29);
        short[] shortArray34 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(shortArray29, shortArray34);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(shortArray24, shortArray29);
        short[] shortArray38 = new short[] { (short) 100 };
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(shortArray24, shortArray38);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray24);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray5);
        short short42 = org.apache.commons.lang.math.NumberUtils.min(shortArray5);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[100]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) -1 + "'", short21 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) -1 + "'", short25 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 10 + "'", short30 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[100]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) -1 + "'", short42 == (short) -1);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) '4', (float) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 1L, (double) 32.0f, (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 100L, (double) 10, 35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 100, (int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(10.0d, 0.0d, (double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 100.0f, (double) ' ', (double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
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
        int[] intArray52 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray57 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(intArray52, intArray57);
        int int59 = org.apache.commons.lang.math.NumberUtils.min(intArray57);
        int int60 = org.apache.commons.lang.math.NumberUtils.min(intArray57);
        int[] intArray65 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray70 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(intArray65, intArray70);
        int int72 = org.apache.commons.lang.math.NumberUtils.max(intArray70);
        int int73 = org.apache.commons.lang.math.NumberUtils.min(intArray70);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(intArray57, intArray70);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(intArray41, intArray57);
        int int76 = org.apache.commons.lang.math.NumberUtils.min(intArray57);
        int[] intArray81 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray86 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(intArray81, intArray86);
        int int88 = org.apache.commons.lang.math.NumberUtils.max(intArray86);
        int int89 = org.apache.commons.lang.math.NumberUtils.min(intArray86);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(intArray57, intArray86);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray86);
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
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 100 + "'", int72 == 100);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 100 + "'", int88 == 100);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(52.0f, (float) 52L, (float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 52, (double) 97.0f, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 35, (double) (short) -1, (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 1, (double) '4', (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
        byte byte32 = org.apache.commons.lang.math.NumberUtils.max(byteArray29);
        byte byte33 = org.apache.commons.lang.math.NumberUtils.max(byteArray29);
        byte[] byteArray34 = null;
        byte[] byteArray41 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(byteArray34, byteArray41);
        byte[] byteArray47 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(byteArray41, byteArray47);
        byte byte49 = org.apache.commons.lang.math.NumberUtils.max(byteArray47);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(byteArray29, byteArray47);
        byte byte51 = org.apache.commons.lang.math.NumberUtils.max(byteArray29);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(byteArray12, byteArray29);
        byte[] byteArray53 = null;
        byte[] byteArray60 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(byteArray53, byteArray60);
        byte[] byteArray66 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(byteArray60, byteArray66);
        byte byte68 = org.apache.commons.lang.math.NumberUtils.max(byteArray60);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(byteArray12, byteArray60);
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
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 100 + "'", byte32 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 100 + "'", byte33 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + byte49 + "' != '" + (byte) 10 + "'", byte49 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) 100 + "'", byte51 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + byte68 + "' != '" + (byte) 100 + "'", byte68 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 1, (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(100, 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) (byte) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 1, (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        byte byte38 = org.apache.commons.lang.math.NumberUtils.min(byteArray21);
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
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) -1 + "'", byte38 == (byte) -1);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        short[] shortArray2 = new short[] { (short) -1, (short) -1 };
        short short3 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
        short[] shortArray7 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short8 = org.apache.commons.lang.math.NumberUtils.max(shortArray7);
        short[] shortArray12 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray7, shortArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray7);
        short[] shortArray19 = new short[] { (byte) -1, (short) 100, (byte) -1, (byte) -1 };
        short short20 = org.apache.commons.lang.math.NumberUtils.max(shortArray19);
        short short21 = org.apache.commons.lang.math.NumberUtils.min(shortArray19);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray19);
        short[] shortArray26 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short27 = org.apache.commons.lang.math.NumberUtils.max(shortArray26);
        short[] shortArray31 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(shortArray26, shortArray31);
        short short33 = org.apache.commons.lang.math.NumberUtils.min(shortArray26);
        short[] shortArray36 = new short[] { (short) -1, (short) -1 };
        short short37 = org.apache.commons.lang.math.NumberUtils.min(shortArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(shortArray26, shortArray36);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray36);
        short short40 = org.apache.commons.lang.math.NumberUtils.min(shortArray36);
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
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[-1, 100, -1, -1]");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 100 + "'", short20 == (short) 100);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) -1 + "'", short21 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 10 + "'", short27 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 1 + "'", short33 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) -1 + "'", short37 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + short40 + "' != '" + (short) -1 + "'", short40 == (short) -1);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 35, 100.0d, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        double double54 = org.apache.commons.lang.math.NumberUtils.min(doubleArray2);
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
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 1L, 97.0d, (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        byte byte51 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte52 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
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
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 10 + "'", byte52 == (byte) 10);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0f, (float) 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray16 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray21 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray16);
        int int24 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int int25 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 0, (long) (short) 1, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 0L, (float) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        int[] intArray6 = new int[] { (short) 0, '4', (byte) 0, (short) 1, (short) 10, '#' };
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray6);
        int int8 = org.apache.commons.lang.math.NumberUtils.min(intArray6);
        int[] intArray15 = new int[] { (short) 0, '4', (byte) 0, (short) 1, (short) 10, '#' };
        int int16 = org.apache.commons.lang.math.NumberUtils.min(intArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray15);
        int[] intArray23 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int24 = org.apache.commons.lang.math.NumberUtils.max(intArray23);
        int int25 = org.apache.commons.lang.math.NumberUtils.max(intArray23);
        int int26 = org.apache.commons.lang.math.NumberUtils.max(intArray23);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(intArray15, intArray23);
        int[] intArray32 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray37 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(intArray32, intArray37);
        int int39 = org.apache.commons.lang.math.NumberUtils.max(intArray37);
        int int40 = org.apache.commons.lang.math.NumberUtils.max(intArray37);
        int[] intArray45 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray50 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(intArray45, intArray50);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(intArray37, intArray45);
        int int53 = org.apache.commons.lang.math.NumberUtils.min(intArray45);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(intArray23, intArray45);
        java.lang.Class<?> wildcardClass55 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 52, 0, 1, 10, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 52, 0, 1, 10, 35]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray15, doubleArray19);
        double double26 = org.apache.commons.lang.math.NumberUtils.min(doubleArray19);
        double double27 = org.apache.commons.lang.math.NumberUtils.min(doubleArray19);
        double double28 = org.apache.commons.lang.math.NumberUtils.max(doubleArray19);
        double double29 = org.apache.commons.lang.math.NumberUtils.min(doubleArray19);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray19);
        double[] doubleArray33 = new double[] { 100L, 1.0f };
        double[] doubleArray37 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray33, doubleArray37);
        double[] doubleArray41 = new double[] { 100L, 1.0f };
        double[] doubleArray45 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray41, doubleArray45);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray41);
        double double48 = org.apache.commons.lang.math.NumberUtils.min(doubleArray37);
        double double49 = org.apache.commons.lang.math.NumberUtils.max(doubleArray37);
        double double50 = org.apache.commons.lang.math.NumberUtils.max(doubleArray37);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray19, doubleArray37);
        double double52 = org.apache.commons.lang.math.NumberUtils.min(doubleArray19);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 100.0d + "'", double50 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) 0, (double) (short) 1, (double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) '#', (long) '#', (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 100, (-1), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 100, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) (byte) 0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte5 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte6 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte8 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) (byte) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(100.0f, (float) 10, (float) 52);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0d, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 10, (long) (short) 10, (long) 52);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 0.0f, (double) 1.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
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
        long long96 = org.apache.commons.lang.math.NumberUtils.max(longArray72);
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
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 52L + "'", long96 == 52L);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, 0L, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        short[] shortArray2 = new short[] { (short) -1, (short) -1 };
        short short3 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
        short[] shortArray7 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short8 = org.apache.commons.lang.math.NumberUtils.max(shortArray7);
        short[] shortArray12 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray7, shortArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray7);
        short short15 = org.apache.commons.lang.math.NumberUtils.max(shortArray7);
        short[] shortArray18 = new short[] { (short) -1, (short) -1 };
        short short19 = org.apache.commons.lang.math.NumberUtils.min(shortArray18);
        short[] shortArray23 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short24 = org.apache.commons.lang.math.NumberUtils.max(shortArray23);
        short[] shortArray28 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(shortArray23, shortArray28);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(shortArray18, shortArray23);
        short[] shortArray32 = new short[] { (short) 100 };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(shortArray18, shortArray32);
        short short34 = org.apache.commons.lang.math.NumberUtils.min(shortArray32);
        short short35 = org.apache.commons.lang.math.NumberUtils.max(shortArray32);
        short short36 = org.apache.commons.lang.math.NumberUtils.min(shortArray32);
        short short37 = org.apache.commons.lang.math.NumberUtils.min(shortArray32);
        short[] shortArray41 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short42 = org.apache.commons.lang.math.NumberUtils.max(shortArray41);
        short[] shortArray46 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(shortArray41, shortArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(shortArray32, shortArray41);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(shortArray7, shortArray32);
        short short50 = org.apache.commons.lang.math.NumberUtils.min(shortArray32);
        short[] shortArray55 = new short[] { (byte) -1, (short) 100, (byte) -1, (byte) -1 };
        short short56 = org.apache.commons.lang.math.NumberUtils.max(shortArray55);
        short[] shortArray59 = new short[] { (short) -1, (short) -1 };
        short short60 = org.apache.commons.lang.math.NumberUtils.min(shortArray59);
        short[] shortArray64 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short65 = org.apache.commons.lang.math.NumberUtils.max(shortArray64);
        short[] shortArray69 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(shortArray64, shortArray69);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(shortArray59, shortArray64);
        short[] shortArray73 = new short[] { (short) 100 };
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(shortArray59, shortArray73);
        short short75 = org.apache.commons.lang.math.NumberUtils.min(shortArray73);
        short short76 = org.apache.commons.lang.math.NumberUtils.max(shortArray73);
        short short77 = org.apache.commons.lang.math.NumberUtils.min(shortArray73);
        short short78 = org.apache.commons.lang.math.NumberUtils.min(shortArray73);
        short[] shortArray82 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short83 = org.apache.commons.lang.math.NumberUtils.max(shortArray82);
        short[] shortArray87 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(shortArray82, shortArray87);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(shortArray73, shortArray82);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(shortArray55, shortArray73);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(shortArray32, shortArray73);
        short short92 = org.apache.commons.lang.math.NumberUtils.max(shortArray32);
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
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) -1 + "'", short19 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 10 + "'", short24 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[100]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) 100 + "'", short34 == (short) 100);
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) 100 + "'", short35 == (short) 100);
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) 100 + "'", short36 == (short) 100);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) 100 + "'", short37 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) 10 + "'", short42 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + short50 + "' != '" + (short) 100 + "'", short50 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray55), "[-1, 100, -1, -1]");
        org.junit.Assert.assertTrue("'" + short56 + "' != '" + (short) 100 + "'", short56 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray59), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short60 + "' != '" + (short) -1 + "'", short60 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray64), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short65 + "' != '" + (short) 10 + "'", short65 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray69), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(shortArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray73), "[100]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + short75 + "' != '" + (short) 100 + "'", short75 == (short) 100);
        org.junit.Assert.assertTrue("'" + short76 + "' != '" + (short) 100 + "'", short76 == (short) 100);
        org.junit.Assert.assertTrue("'" + short77 + "' != '" + (short) 100 + "'", short77 == (short) 100);
        org.junit.Assert.assertTrue("'" + short78 + "' != '" + (short) 100 + "'", short78 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray82), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short83 + "' != '" + (short) 10 + "'", short83 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray87), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + short92 + "' != '" + (short) 100 + "'", short92 == (short) 100);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 10, (long) 10, (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray13);
        byte byte16 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte byte17 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte byte18 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte byte19 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 100 + "'", byte16 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -1 + "'", byte17 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 100 + "'", byte19 == (byte) 100);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 52, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) -1, (int) (short) -1, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) (byte) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float float7 = org.apache.commons.lang.math.NumberUtils.min(floatArray3);
        float[] floatArray11 = new float[] { 0, 1.0f, 100 };
        float[] floatArray13 = new float[] { (-1L) };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(floatArray11, floatArray13);
        float[] floatArray18 = new float[] { 0, 1.0f, 100 };
        float[] floatArray20 = new float[] { (-1L) };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(floatArray18, floatArray20);
        float float22 = org.apache.commons.lang.math.NumberUtils.max(floatArray18);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(floatArray11, floatArray18);
        float float24 = org.apache.commons.lang.math.NumberUtils.max(floatArray11);
        float[] floatArray25 = new float[] {};
        float[] floatArray29 = new float[] { 0, 1.0f, 100 };
        float[] floatArray31 = new float[] { (-1L) };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(floatArray29, floatArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(floatArray25, floatArray29);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(floatArray11, floatArray29);
        float float35 = org.apache.commons.lang.math.NumberUtils.max(floatArray29);
        float float36 = org.apache.commons.lang.math.NumberUtils.min(floatArray29);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray29);
        float float38 = org.apache.commons.lang.math.NumberUtils.min(floatArray29);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 100.0f + "'", float35 == 100.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '4', (long) 'a', (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 10.0f, (double) 32L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray13);
        byte[] byteArray15 = null;
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray15, byteArray22);
        byte byte24 = org.apache.commons.lang.math.NumberUtils.min(byteArray22);
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte29 = org.apache.commons.lang.math.NumberUtils.max(byteArray28);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(byteArray22, byteArray28);
        byte[] byteArray31 = null;
        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(byteArray31, byteArray38);
        byte byte40 = org.apache.commons.lang.math.NumberUtils.min(byteArray38);
        byte byte41 = org.apache.commons.lang.math.NumberUtils.max(byteArray38);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(byteArray28, byteArray38);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray28);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) -1 + "'", byte24 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 10 + "'", byte29 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) -1 + "'", byte40 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 100 + "'", byte41 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) -1, (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        byte byte42 = org.apache.commons.lang.math.NumberUtils.max(byteArray22);
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
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) 10 + "'", byte42 == (byte) 10);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(52.0f, (float) 1L, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 10L, 1.0f, 32.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 52, 0L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) 1, (double) 100L, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        int int41 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
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
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 35, 97L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        double double91 = org.apache.commons.lang.math.NumberUtils.min(doubleArray27);
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
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 1.0d + "'", double91 == 1.0d);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) '#', 0.0f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        long[] longArray46 = new long[] { 0L, 35, 32L, '#' };
        long[] longArray50 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray51 = new long[] {};
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(longArray50, longArray51);
        long long53 = org.apache.commons.lang.math.NumberUtils.max(longArray50);
        long long54 = org.apache.commons.lang.math.NumberUtils.max(longArray50);
        long long55 = org.apache.commons.lang.math.NumberUtils.max(longArray50);
        long long56 = org.apache.commons.lang.math.NumberUtils.min(longArray50);
        long[] longArray60 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray61 = new long[] {};
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(longArray60, longArray61);
        long long63 = org.apache.commons.lang.math.NumberUtils.max(longArray60);
        long long64 = org.apache.commons.lang.math.NumberUtils.max(longArray60);
        long long65 = org.apache.commons.lang.math.NumberUtils.min(longArray60);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(longArray50, longArray60);
        long[] longArray70 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray71 = new long[] {};
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(longArray70, longArray71);
        long long73 = org.apache.commons.lang.math.NumberUtils.max(longArray70);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(longArray60, longArray70);
        long[] longArray78 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray79 = new long[] {};
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(longArray78, longArray79);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(longArray70, longArray78);
        long long82 = org.apache.commons.lang.math.NumberUtils.min(longArray70);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(longArray46, longArray70);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray46);
        long long85 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long long86 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
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
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[0, 35, 32, 35]");
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 52L + "'", long53 == 52L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 52L + "'", long54 == 52L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 52L + "'", long55 == 52L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-1L) + "'", long56 == (-1L));
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 52L + "'", long63 == 52L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 52L + "'", long64 == 52L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-1L) + "'", long65 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray71), "[]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 52L + "'", long73 == 52L);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray78), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + (-1L) + "'", long82 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 35L + "'", long85 == 35L);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 35L + "'", long86 == 35L);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        float[] floatArray4 = new float[] { 0.0f, 35, (-1), 35 };
        float[] floatArray5 = new float[] {};
        float[] floatArray9 = new float[] { 0, 1.0f, 100 };
        float[] floatArray11 = new float[] { (-1L) };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray9);
        float float14 = org.apache.commons.lang.math.NumberUtils.max(floatArray9);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray9);
        float float16 = org.apache.commons.lang.math.NumberUtils.max(floatArray9);
        float float17 = org.apache.commons.lang.math.NumberUtils.max(floatArray9);
        float[] floatArray21 = new float[] { 0, 1.0f, 100 };
        float[] floatArray23 = new float[] { (-1L) };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(floatArray21, floatArray23);
        float[] floatArray28 = new float[] { 0, 1.0f, 100 };
        float[] floatArray30 = new float[] { (-1L) };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(floatArray28, floatArray30);
        float float32 = org.apache.commons.lang.math.NumberUtils.max(floatArray28);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(floatArray23, floatArray28);
        float float34 = org.apache.commons.lang.math.NumberUtils.min(floatArray23);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray23);
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
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 100.0f + "'", float32 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + (-1.0f) + "'", float34 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) -1, 52.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 97, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(35, 0, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        float float48 = org.apache.commons.lang.math.NumberUtils.max(floatArray41);
        float float49 = org.apache.commons.lang.math.NumberUtils.max(floatArray41);
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
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 100.0f + "'", float48 == 100.0f);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 100.0f + "'", float49 == 100.0f);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
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
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 100, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 35L, (double) 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 10, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        int[] intArray5 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int6 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int int8 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int[] intArray13 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray18 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray18);
        int[] intArray24 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray29 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(intArray24, intArray29);
        int int31 = org.apache.commons.lang.math.NumberUtils.min(intArray29);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray29);
        int int33 = org.apache.commons.lang.math.NumberUtils.max(intArray29);
        int int34 = org.apache.commons.lang.math.NumberUtils.min(intArray29);
        int int35 = org.apache.commons.lang.math.NumberUtils.min(intArray29);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(intArray5, intArray29);
        int int37 = org.apache.commons.lang.math.NumberUtils.min(intArray5);
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (byte) 100, (double) (byte) 10, (double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(10, (int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) '#', (float) 100, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 10, (float) 35, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((-1.0d), (double) 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        float[] floatArray0 = new float[] {};
        float[] floatArray4 = new float[] { 0, 1.0f, 100 };
        float[] floatArray6 = new float[] { (-1L) };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray4);
        float[] floatArray9 = new float[] {};
        float[] floatArray13 = new float[] { 0, 1.0f, 100 };
        float[] floatArray15 = new float[] { (-1L) };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(floatArray13, floatArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray13);
        float[] floatArray21 = new float[] { 0, 1.0f, 100 };
        float[] floatArray23 = new float[] { (-1L) };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(floatArray21, floatArray23);
        float[] floatArray28 = new float[] { 0, ' ', 100.0f };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(floatArray23, floatArray28);
        float float30 = org.apache.commons.lang.math.NumberUtils.min(floatArray23);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(floatArray13, floatArray23);
        float[] floatArray35 = new float[] { 0, 1.0f, 100 };
        float[] floatArray37 = new float[] { (-1L) };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(floatArray35, floatArray37);
        float[] floatArray42 = new float[] { 0, ' ', 100.0f };
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(floatArray37, floatArray42);
        float float44 = org.apache.commons.lang.math.NumberUtils.min(floatArray42);
        float float45 = org.apache.commons.lang.math.NumberUtils.min(floatArray42);
        float float46 = org.apache.commons.lang.math.NumberUtils.max(floatArray42);
        float[] floatArray50 = new float[] { 0, 1.0f, 100 };
        float[] floatArray52 = new float[] { (-1L) };
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(floatArray50, floatArray52);
        float float54 = org.apache.commons.lang.math.NumberUtils.max(floatArray50);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(floatArray42, floatArray50);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(floatArray23, floatArray50);
        float[] floatArray60 = new float[] { 0, 1.0f, 100 };
        float[] floatArray62 = new float[] { (-1L) };
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(floatArray60, floatArray62);
        float[] floatArray67 = new float[] { 0, 1.0f, 100 };
        float[] floatArray69 = new float[] { (-1L) };
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(floatArray67, floatArray69);
        float float71 = org.apache.commons.lang.math.NumberUtils.max(floatArray67);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(floatArray60, floatArray67);
        float float73 = org.apache.commons.lang.math.NumberUtils.max(floatArray60);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(floatArray23, floatArray60);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray23);
        // The following exception was thrown during execution in test generation
        try {
            float float76 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-1.0f) + "'", float30 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray42), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.0f + "'", float44 == 0.0f);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.0f + "'", float45 == 0.0f);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 100.0f + "'", float46 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray50), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray52), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 100.0f + "'", float54 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(floatArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray60), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray62), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(floatArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray67), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray69), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + 100.0f + "'", float71 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + float73 + "' != '" + 100.0f + "'", float73 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
        int[] intArray62 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray67 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(intArray62, intArray67);
        int int69 = org.apache.commons.lang.math.NumberUtils.max(intArray67);
        int int70 = org.apache.commons.lang.math.NumberUtils.max(intArray67);
        int int71 = org.apache.commons.lang.math.NumberUtils.min(intArray67);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(intArray48, intArray67);
        int int73 = org.apache.commons.lang.math.NumberUtils.min(intArray67);
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
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 100 + "'", int70 == 100);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
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
        double double92 = org.apache.commons.lang.math.NumberUtils.min(doubleArray81);
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
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 1.0d + "'", double92 == 1.0d);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 10, 52.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(35, (int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) 1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(35L, (long) (byte) 1, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, 0, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 10, (long) (byte) 100, (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 35.0f, (double) 0.0f, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) (byte) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(97.0d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
        java.lang.Class<?> wildcardClass64 = intArray45.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 0, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 1, (float) 32, (float) (-1));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        short[] shortArray3 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short4 = org.apache.commons.lang.math.NumberUtils.max(shortArray3);
        short short5 = org.apache.commons.lang.math.NumberUtils.min(shortArray3);
        short[] shortArray10 = new short[] { (byte) -1, (short) 100, (byte) -1, (byte) -1 };
        short short11 = org.apache.commons.lang.math.NumberUtils.max(shortArray10);
        short[] shortArray14 = new short[] { (short) -1, (short) -1 };
        short short15 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
        short[] shortArray19 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short20 = org.apache.commons.lang.math.NumberUtils.max(shortArray19);
        short[] shortArray24 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray24);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray19);
        short[] shortArray28 = new short[] { (short) 100 };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray28);
        short short30 = org.apache.commons.lang.math.NumberUtils.min(shortArray28);
        short short31 = org.apache.commons.lang.math.NumberUtils.max(shortArray28);
        short short32 = org.apache.commons.lang.math.NumberUtils.min(shortArray28);
        short short33 = org.apache.commons.lang.math.NumberUtils.min(shortArray28);
        short[] shortArray37 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short38 = org.apache.commons.lang.math.NumberUtils.max(shortArray37);
        short[] shortArray42 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(shortArray37, shortArray42);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(shortArray28, shortArray37);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray28);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray28);
        short short47 = org.apache.commons.lang.math.NumberUtils.max(shortArray28);
        short[] shortArray49 = new short[] { (byte) 1 };
        short short50 = org.apache.commons.lang.math.NumberUtils.min(shortArray49);
        short[] shortArray52 = new short[] { (short) -1 };
        short short53 = org.apache.commons.lang.math.NumberUtils.max(shortArray52);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(shortArray49, shortArray52);
        short[] shortArray56 = new short[] { (byte) 1 };
        short short57 = org.apache.commons.lang.math.NumberUtils.min(shortArray56);
        short[] shortArray59 = new short[] { (short) -1 };
        short short60 = org.apache.commons.lang.math.NumberUtils.max(shortArray59);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(shortArray56, shortArray59);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(shortArray52, shortArray59);
        short[] shortArray66 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short67 = org.apache.commons.lang.math.NumberUtils.max(shortArray66);
        short short68 = org.apache.commons.lang.math.NumberUtils.min(shortArray66);
        short short69 = org.apache.commons.lang.math.NumberUtils.min(shortArray66);
        short short70 = org.apache.commons.lang.math.NumberUtils.min(shortArray66);
        short short71 = org.apache.commons.lang.math.NumberUtils.max(shortArray66);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(shortArray52, shortArray66);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(shortArray28, shortArray52);
        short[] shortArray76 = new short[] { (short) -1, (short) -1 };
        short short77 = org.apache.commons.lang.math.NumberUtils.min(shortArray76);
        short[] shortArray81 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short82 = org.apache.commons.lang.math.NumberUtils.max(shortArray81);
        short[] shortArray86 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(shortArray81, shortArray86);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(shortArray76, shortArray81);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(shortArray52, shortArray76);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[-1, 100, -1, -1]");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) -1 + "'", short15 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 10 + "'", short20 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[100]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 100 + "'", short30 == (short) 100);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 100 + "'", short31 == (short) 100);
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 100 + "'", short32 == (short) 100);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 100 + "'", short33 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) 10 + "'", short38 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + short47 + "' != '" + (short) 100 + "'", short47 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[1]");
        org.junit.Assert.assertTrue("'" + short50 + "' != '" + (short) 1 + "'", short50 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray52), "[-1]");
        org.junit.Assert.assertTrue("'" + short53 + "' != '" + (short) -1 + "'", short53 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[1]");
        org.junit.Assert.assertTrue("'" + short57 + "' != '" + (short) 1 + "'", short57 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray59), "[-1]");
        org.junit.Assert.assertTrue("'" + short60 + "' != '" + (short) -1 + "'", short60 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(shortArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray66), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short67 + "' != '" + (short) 10 + "'", short67 == (short) 10);
        org.junit.Assert.assertTrue("'" + short68 + "' != '" + (short) 1 + "'", short68 == (short) 1);
        org.junit.Assert.assertTrue("'" + short69 + "' != '" + (short) 1 + "'", short69 == (short) 1);
        org.junit.Assert.assertTrue("'" + short70 + "' != '" + (short) 1 + "'", short70 == (short) 1);
        org.junit.Assert.assertTrue("'" + short71 + "' != '" + (short) 10 + "'", short71 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(shortArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray76), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short77 + "' != '" + (short) -1 + "'", short77 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray81), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short82 + "' != '" + (short) 10 + "'", short82 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray86), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { 1L, (short) 0, 97L };
        double[] doubleArray7 = new double[] { 100L, 1.0f };
        double[] doubleArray11 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray7, doubleArray11);
        double[] doubleArray15 = new double[] { 100L, 1.0f };
        double[] doubleArray19 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray15, doubleArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray7, doubleArray15);
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
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray7, doubleArray49);
        double double58 = org.apache.commons.lang.math.NumberUtils.min(doubleArray7);
        double double59 = org.apache.commons.lang.math.NumberUtils.min(doubleArray7);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray7);
        double double61 = org.apache.commons.lang.math.NumberUtils.max(doubleArray4);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            double double63 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 0.0, 97.0]");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 1.0d + "'", double59 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 97.0d + "'", double61 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        short[] shortArray2 = new short[] { (short) -1, (short) -1 };
        short short3 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
        short[] shortArray7 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short8 = org.apache.commons.lang.math.NumberUtils.max(shortArray7);
        short[] shortArray12 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray7, shortArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray7);
        short short15 = org.apache.commons.lang.math.NumberUtils.max(shortArray7);
        short[] shortArray18 = new short[] { (short) -1, (short) -1 };
        short short19 = org.apache.commons.lang.math.NumberUtils.min(shortArray18);
        short[] shortArray23 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short24 = org.apache.commons.lang.math.NumberUtils.max(shortArray23);
        short[] shortArray28 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(shortArray23, shortArray28);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(shortArray18, shortArray23);
        short[] shortArray32 = new short[] { (short) 100 };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(shortArray18, shortArray32);
        short short34 = org.apache.commons.lang.math.NumberUtils.min(shortArray32);
        short short35 = org.apache.commons.lang.math.NumberUtils.max(shortArray32);
        short short36 = org.apache.commons.lang.math.NumberUtils.min(shortArray32);
        short short37 = org.apache.commons.lang.math.NumberUtils.min(shortArray32);
        short[] shortArray41 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short42 = org.apache.commons.lang.math.NumberUtils.max(shortArray41);
        short[] shortArray46 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(shortArray41, shortArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(shortArray32, shortArray41);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(shortArray7, shortArray32);
        short short50 = org.apache.commons.lang.math.NumberUtils.max(shortArray32);
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
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) -1 + "'", short19 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 10 + "'", short24 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[100]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) 100 + "'", short34 == (short) 100);
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) 100 + "'", short35 == (short) 100);
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) 100 + "'", short36 == (short) 100);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) 100 + "'", short37 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) 10 + "'", short42 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + short50 + "' != '" + (short) 100 + "'", short50 == (short) 100);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
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
        byte byte64 = org.apache.commons.lang.math.NumberUtils.max(byteArray12);
        byte byte65 = org.apache.commons.lang.math.NumberUtils.min(byteArray12);
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
        org.junit.Assert.assertTrue("'" + byte65 + "' != '" + (byte) -1 + "'", byte65 == (byte) -1);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) 0, (float) 100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, 0L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
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
        int[] intArray44 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray49 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(intArray44, intArray49);
        int int51 = org.apache.commons.lang.math.NumberUtils.max(intArray49);
        int int52 = org.apache.commons.lang.math.NumberUtils.min(intArray49);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(intArray20, intArray49);
        int int54 = org.apache.commons.lang.math.NumberUtils.max(intArray49);
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
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 52, 100.0f, (float) 'a');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
        short short26 = org.apache.commons.lang.math.NumberUtils.max(shortArray20);
        short short27 = org.apache.commons.lang.math.NumberUtils.max(shortArray20);
        short short28 = org.apache.commons.lang.math.NumberUtils.max(shortArray20);
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
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) -1 + "'", short26 == (short) -1);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) -1 + "'", short27 == (short) -1);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) -1 + "'", short28 == (short) -1);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1L, (double) 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
        short short20 = org.apache.commons.lang.math.NumberUtils.min(shortArray16);
        short short21 = org.apache.commons.lang.math.NumberUtils.min(shortArray16);
        short short22 = org.apache.commons.lang.math.NumberUtils.max(shortArray16);
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
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 100 + "'", short20 == (short) 100);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 100 + "'", short21 == (short) 100);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 100 + "'", short22 == (short) 100);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 0L, (double) 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0d, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '4', 10L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 10, (long) 32, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 97.0f, (double) 32, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) -1, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 35, (long) (short) 0, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        long[] longArray0 = new long[] {};
        long[] longArray2 = new long[] { (byte) -1 };
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray2);
        long long4 = org.apache.commons.lang.math.NumberUtils.max(longArray2);
        long[] longArray7 = new long[] { 52L, (short) 1 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray7);
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray7);
        long[] longArray10 = new long[] {};
        long[] longArray12 = new long[] { (byte) -1 };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(longArray10, longArray12);
        long[] longArray14 = new long[] {};
        long[] longArray16 = new long[] { (byte) -1 };
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(longArray14, longArray16);
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray16);
        long long19 = org.apache.commons.lang.math.NumberUtils.max(longArray16);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray12, longArray16);
        long[] longArray24 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray25 = new long[] {};
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(longArray24, longArray25);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(longArray16, longArray24);
        long long28 = org.apache.commons.lang.math.NumberUtils.max(longArray16);
        long long29 = org.apache.commons.lang.math.NumberUtils.min(longArray16);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(longArray7, longArray16);
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
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 0, (double) 0.0f, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) -1, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 1, (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        double double53 = org.apache.commons.lang.math.NumberUtils.min(doubleArray44);
        java.lang.Class<?> wildcardClass54 = doubleArray44.getClass();
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
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) (byte) 10, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 100L, 1.0f, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int int12 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int int13 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int int14 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int int15 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 32L, (double) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int[] intArray15 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray20 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray15, intArray20);
        int int22 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray20);
        int int24 = org.apache.commons.lang.math.NumberUtils.max(intArray20);
        java.lang.Class<?> wildcardClass25 = intArray20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) '#', (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 35L, (float) 97L, (float) '4');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) 0, 35.0d, (double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        long[] longArray3 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray4 = new long[] {};
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.min(longArray3);
        long long7 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) (byte) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(52.0f, (float) (byte) -1, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(10.0f, (float) 35, (float) 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (byte) -1, (double) 1.0f, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) (byte) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 100, (long) (short) -1, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(97L, (long) 10, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(100L, (long) (short) 10, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 1, (double) (byte) -1, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) -1, (long) 97, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte5 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte6 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte8 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte10 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte12 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte13 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(0.0d, (double) 52.0f, 35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 1, (long) 52, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray13);
        byte byte15 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte byte16 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte byte17 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte byte18 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 100 + "'", byte15 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -1 + "'", byte17 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int int12 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray17 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray22 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray22);
        int int24 = org.apache.commons.lang.math.NumberUtils.max(intArray22);
        int int25 = org.apache.commons.lang.math.NumberUtils.min(intArray22);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray22);
        int int27 = org.apache.commons.lang.math.NumberUtils.max(intArray22);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }
}

