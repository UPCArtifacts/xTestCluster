import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
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
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) (byte) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        byte byte92 = org.apache.commons.lang.math.NumberUtils.min(byteArray76);
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
        org.junit.Assert.assertTrue("'" + byte92 + "' != '" + (byte) -1 + "'", byte92 == (byte) -1);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) -1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(1L, (long) (short) 0, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        java.lang.Class<?> wildcardClass88 = doubleArray85.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 100, (double) 52, (double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        long long22 = org.apache.commons.lang.math.NumberUtils.min(longArray14);
        long[] longArray23 = new long[] {};
        long[] longArray25 = new long[] { (byte) -1 };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(longArray23, longArray25);
        long long27 = org.apache.commons.lang.math.NumberUtils.max(longArray25);
        long[] longArray30 = new long[] { 52L, (short) 1 };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(longArray25, longArray30);
        long[] longArray32 = new long[] {};
        long[] longArray34 = new long[] { (byte) -1 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(longArray32, longArray34);
        long[] longArray36 = new long[] {};
        long[] longArray38 = new long[] { (byte) -1 };
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray36, longArray38);
        long long40 = org.apache.commons.lang.math.NumberUtils.max(longArray38);
        long long41 = org.apache.commons.lang.math.NumberUtils.max(longArray38);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(longArray34, longArray38);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(longArray25, longArray38);
        long long44 = org.apache.commons.lang.math.NumberUtils.max(longArray38);
        long[] longArray48 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray49 = new long[] {};
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(longArray48, longArray49);
        long long51 = org.apache.commons.lang.math.NumberUtils.max(longArray48);
        long long52 = org.apache.commons.lang.math.NumberUtils.max(longArray48);
        long long53 = org.apache.commons.lang.math.NumberUtils.max(longArray48);
        long[] longArray54 = new long[] {};
        long[] longArray56 = new long[] { (byte) -1 };
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(longArray54, longArray56);
        long long58 = org.apache.commons.lang.math.NumberUtils.max(longArray56);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(longArray48, longArray56);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(longArray38, longArray48);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(longArray14, longArray38);
        long long62 = org.apache.commons.lang.math.NumberUtils.max(longArray14);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 52L + "'", long51 == 52L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 52L + "'", long52 == 52L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 52L + "'", long53 == 52L);
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[]");
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 52L + "'", long62 == 52L);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        float[] floatArray49 = new float[] {};
        float[] floatArray53 = new float[] { 0, 1.0f, 100 };
        float[] floatArray55 = new float[] { (-1L) };
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(floatArray53, floatArray55);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(floatArray49, floatArray53);
        float float58 = org.apache.commons.lang.math.NumberUtils.max(floatArray53);
        float[] floatArray62 = new float[] { 0, 1.0f, 100 };
        float[] floatArray64 = new float[] { (-1L) };
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(floatArray62, floatArray64);
        float float66 = org.apache.commons.lang.math.NumberUtils.min(floatArray64);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(floatArray53, floatArray64);
        float[] floatArray68 = new float[] {};
        float[] floatArray72 = new float[] { 0, 1.0f, 100 };
        float[] floatArray74 = new float[] { (-1L) };
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(floatArray72, floatArray74);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(floatArray68, floatArray72);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(floatArray64, floatArray72);
        float[] floatArray82 = new float[] { 0.0f, 35, (-1), 35 };
        float[] floatArray83 = new float[] {};
        float[] floatArray87 = new float[] { 0, 1.0f, 100 };
        float[] floatArray89 = new float[] { (-1L) };
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(floatArray87, floatArray89);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(floatArray83, floatArray87);
        float float92 = org.apache.commons.lang.math.NumberUtils.max(floatArray87);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(floatArray82, floatArray87);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(floatArray64, floatArray82);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(floatArray41, floatArray82);
        float float96 = org.apache.commons.lang.math.NumberUtils.max(floatArray41);
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
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray49), "[]");
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray55), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 100.0f + "'", float58 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray62), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray64), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + (-1.0f) + "'", float66 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(floatArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray68), "[]");
        org.junit.Assert.assertNotNull(floatArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray72), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray74), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(floatArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray82), "[0.0, 35.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray83), "[]");
        org.junit.Assert.assertNotNull(floatArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray87), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray89), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + float92 + "' != '" + 100.0f + "'", float92 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + float96 + "' != '" + 100.0f + "'", float96 == 100.0f);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(byteArray29, byteArray44);
        byte[] byteArray54 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte55 = org.apache.commons.lang.math.NumberUtils.max(byteArray54);
        byte[] byteArray58 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(byteArray54, byteArray58);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(byteArray44, byteArray54);
        byte[] byteArray65 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte66 = org.apache.commons.lang.math.NumberUtils.max(byteArray65);
        byte byte67 = org.apache.commons.lang.math.NumberUtils.max(byteArray65);
        byte byte68 = org.apache.commons.lang.math.NumberUtils.min(byteArray65);
        byte byte69 = org.apache.commons.lang.math.NumberUtils.min(byteArray65);
        byte[] byteArray74 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte75 = org.apache.commons.lang.math.NumberUtils.max(byteArray74);
        byte byte76 = org.apache.commons.lang.math.NumberUtils.max(byteArray74);
        byte byte77 = org.apache.commons.lang.math.NumberUtils.min(byteArray74);
        byte byte78 = org.apache.commons.lang.math.NumberUtils.min(byteArray74);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(byteArray65, byteArray74);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(byteArray54, byteArray74);
        byte byte81 = org.apache.commons.lang.math.NumberUtils.max(byteArray74);
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
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte66 + "' != '" + (byte) 10 + "'", byte66 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) 10 + "'", byte67 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte68 + "' != '" + (byte) -1 + "'", byte68 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte69 + "' != '" + (byte) -1 + "'", byte69 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte75 + "' != '" + (byte) 10 + "'", byte75 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) 10 + "'", byte76 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte77 + "' != '" + (byte) -1 + "'", byte77 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte78 + "' != '" + (byte) -1 + "'", byte78 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + byte81 + "' != '" + (byte) 10 + "'", byte81 == (byte) 10);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        double double73 = org.apache.commons.lang.math.NumberUtils.max(doubleArray10);
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
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 100.0d + "'", double73 == 100.0d);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(10.0f, (float) 10, (float) '#');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((-1.0d), (double) (byte) 10, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(52.0f, (float) 100L, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) 0, 100.0f, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) -1, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(10, 1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(97.0d, (double) 0L, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0d, (double) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 'a', (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(52L, (long) (byte) 10, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 35L, (float) 1L, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(100.0f, (float) (short) 10, (float) '#');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(97L, (long) (short) 10, (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(0.0f, (float) 1, (float) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        float float42 = org.apache.commons.lang.math.NumberUtils.max(floatArray21);
        float[] floatArray47 = new float[] { 0.0f, 35, (-1), 35 };
        float[] floatArray48 = new float[] {};
        float[] floatArray52 = new float[] { 0, 1.0f, 100 };
        float[] floatArray54 = new float[] { (-1L) };
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(floatArray52, floatArray54);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(floatArray48, floatArray52);
        float float57 = org.apache.commons.lang.math.NumberUtils.max(floatArray52);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(floatArray47, floatArray52);
        float float59 = org.apache.commons.lang.math.NumberUtils.max(floatArray52);
        float[] floatArray63 = new float[] { 0, 1.0f, 100 };
        float[] floatArray65 = new float[] { (-1L) };
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(floatArray63, floatArray65);
        float[] floatArray70 = new float[] { 0, ' ', 100.0f };
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(floatArray65, floatArray70);
        float[] floatArray72 = new float[] {};
        float[] floatArray76 = new float[] { 0, 1.0f, 100 };
        float[] floatArray78 = new float[] { (-1L) };
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(floatArray76, floatArray78);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(floatArray72, floatArray76);
        float[] floatArray84 = new float[] { 0, 1.0f, 100 };
        float[] floatArray86 = new float[] { (-1L) };
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(floatArray84, floatArray86);
        float[] floatArray91 = new float[] { 0, ' ', 100.0f };
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(floatArray86, floatArray91);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(floatArray72, floatArray86);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(floatArray70, floatArray86);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(floatArray52, floatArray86);
        float float96 = org.apache.commons.lang.math.NumberUtils.min(floatArray52);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(floatArray21, floatArray52);
        float float98 = org.apache.commons.lang.math.NumberUtils.max(floatArray21);
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
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 100.0f + "'", float42 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray47), "[0.0, 35.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray48), "[]");
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray52), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 100.0f + "'", float57 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 100.0f + "'", float59 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray63), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray65), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(floatArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray70), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(floatArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray72), "[]");
        org.junit.Assert.assertNotNull(floatArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray76), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray78), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(floatArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray84), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray86), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(floatArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray91), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + float96 + "' != '" + 0.0f + "'", float96 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + float98 + "' != '" + 100.0f + "'", float98 == 100.0f);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 97L, (float) 52L, (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        float[] floatArray49 = new float[] { 0, 1.0f, 100 };
        float[] floatArray51 = new float[] { (-1L) };
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(floatArray49, floatArray51);
        float float53 = org.apache.commons.lang.math.NumberUtils.max(floatArray49);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(floatArray42, floatArray49);
        float float55 = org.apache.commons.lang.math.NumberUtils.max(floatArray42);
        float[] floatArray56 = new float[] {};
        float[] floatArray60 = new float[] { 0, 1.0f, 100 };
        float[] floatArray62 = new float[] { (-1L) };
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(floatArray60, floatArray62);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(floatArray56, floatArray60);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(floatArray42, floatArray60);
        float float66 = org.apache.commons.lang.math.NumberUtils.max(floatArray60);
        float float67 = org.apache.commons.lang.math.NumberUtils.min(floatArray60);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(floatArray20, floatArray60);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray60);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray49), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray51), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 100.0f + "'", float53 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 100.0f + "'", float55 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray56), "[]");
        org.junit.Assert.assertNotNull(floatArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray60), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray62), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + 100.0f + "'", float66 == 100.0f);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + 0.0f + "'", float67 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) 10, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (-1), (long) 1, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 0, (long) 100, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) -1, (int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 0L, (float) 52L, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
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
        int[] intArray43 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray48 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(intArray43, intArray48);
        int int50 = org.apache.commons.lang.math.NumberUtils.min(intArray48);
        int[] intArray55 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray60 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(intArray55, intArray60);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(intArray48, intArray55);
        int[] intArray67 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray72 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(intArray67, intArray72);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(intArray55, intArray67);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray55);
        int int76 = org.apache.commons.lang.math.NumberUtils.min(intArray55);
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
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(32, (-1), 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
            double double20 = org.apache.commons.lang.math.NumberUtils.min(doubleArray18);
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
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
        short[] shortArray21 = new short[] { (short) -1, (short) -1 };
        short short22 = org.apache.commons.lang.math.NumberUtils.min(shortArray21);
        short[] shortArray26 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short27 = org.apache.commons.lang.math.NumberUtils.max(shortArray26);
        short[] shortArray31 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(shortArray26, shortArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(shortArray21, shortArray26);
        short[] shortArray35 = new short[] { (short) 100 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(shortArray21, shortArray35);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray21);
        short short38 = org.apache.commons.lang.math.NumberUtils.max(shortArray21);
        short[] shortArray41 = new short[] { (short) -1, (short) -1 };
        short short42 = org.apache.commons.lang.math.NumberUtils.min(shortArray41);
        short[] shortArray46 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short47 = org.apache.commons.lang.math.NumberUtils.max(shortArray46);
        short[] shortArray51 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(shortArray46, shortArray51);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(shortArray41, shortArray46);
        short[] shortArray55 = new short[] { (short) 100 };
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(shortArray41, shortArray55);
        short short57 = org.apache.commons.lang.math.NumberUtils.min(shortArray55);
        short short58 = org.apache.commons.lang.math.NumberUtils.max(shortArray55);
        short short59 = org.apache.commons.lang.math.NumberUtils.min(shortArray55);
        short short60 = org.apache.commons.lang.math.NumberUtils.min(shortArray55);
        short[] shortArray64 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short65 = org.apache.commons.lang.math.NumberUtils.max(shortArray64);
        short[] shortArray69 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(shortArray64, shortArray69);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(shortArray55, shortArray64);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(shortArray21, shortArray55);
        short short73 = org.apache.commons.lang.math.NumberUtils.min(shortArray21);
        short short74 = org.apache.commons.lang.math.NumberUtils.min(shortArray21);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) -1 + "'", short38 == (short) -1);
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
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray55), "[100]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + short57 + "' != '" + (short) 100 + "'", short57 == (short) 100);
        org.junit.Assert.assertTrue("'" + short58 + "' != '" + (short) 100 + "'", short58 == (short) 100);
        org.junit.Assert.assertTrue("'" + short59 + "' != '" + (short) 100 + "'", short59 == (short) 100);
        org.junit.Assert.assertTrue("'" + short60 + "' != '" + (short) 100 + "'", short60 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray64), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short65 + "' != '" + (short) 10 + "'", short65 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray69), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + short73 + "' != '" + (short) -1 + "'", short73 == (short) -1);
        org.junit.Assert.assertTrue("'" + short74 + "' != '" + (short) -1 + "'", short74 == (short) -1);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) (byte) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(32.0f, (float) 32L, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 32L, (float) '4', (float) 35L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) 10, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 1, 97.0f, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 10, 100, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (-1), (long) (byte) 0, 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 0, (double) ' ', (double) 52L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(0.0f, (float) (short) 0, (float) 52);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        float[] floatArray26 = new float[] { 0.0f, 35, (-1), 35 };
        float[] floatArray27 = new float[] {};
        float[] floatArray31 = new float[] { 0, 1.0f, 100 };
        float[] floatArray33 = new float[] { (-1L) };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(floatArray31, floatArray33);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(floatArray27, floatArray31);
        float float36 = org.apache.commons.lang.math.NumberUtils.max(floatArray31);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(floatArray26, floatArray31);
        float float38 = org.apache.commons.lang.math.NumberUtils.max(floatArray31);
        float float39 = org.apache.commons.lang.math.NumberUtils.max(floatArray31);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray31);
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
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[0.0, 35.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 100.0f + "'", float36 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 100.0f + "'", float38 == 100.0f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 100.0f + "'", float39 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) ' ', (long) 1, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 100, (double) 1, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) (byte) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 10, (short) 1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) '4', 52, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) 1, (double) (byte) 10, 32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) '4', (float) 32, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(0.0d, (double) (byte) 1, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        double double54 = org.apache.commons.lang.math.NumberUtils.max(doubleArray44);
        double double55 = org.apache.commons.lang.math.NumberUtils.min(doubleArray44);
        double double56 = org.apache.commons.lang.math.NumberUtils.max(doubleArray44);
        double[] doubleArray57 = null;
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray44, doubleArray57);
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
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 100.0d + "'", double54 == 100.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.0d + "'", double55 == 1.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) (byte) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float float7 = org.apache.commons.lang.math.NumberUtils.min(floatArray3);
        float float8 = org.apache.commons.lang.math.NumberUtils.min(floatArray3);
        java.lang.Class<?> wildcardClass9 = floatArray3.getClass();
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 97L, (-1.0d));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        int int55 = org.apache.commons.lang.math.NumberUtils.max(intArray20);
        int[] intArray56 = null;
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(intArray20, intArray56);
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
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        double[] doubleArray0 = null;
        double[] doubleArray1 = new double[] {};
        double[] doubleArray4 = new double[] { 100L, 1.0f };
        double[] doubleArray8 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray12 = new double[] { 100L, 1.0f };
        double[] doubleArray16 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray12, doubleArray16);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray12);
        double double19 = org.apache.commons.lang.math.NumberUtils.min(doubleArray12);
        double double20 = org.apache.commons.lang.math.NumberUtils.max(doubleArray12);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray1, doubleArray12);
        double double22 = org.apache.commons.lang.math.NumberUtils.max(doubleArray12);
        double double23 = org.apache.commons.lang.math.NumberUtils.min(doubleArray12);
        double double24 = org.apache.commons.lang.math.NumberUtils.max(doubleArray12);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (-1), (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        double double77 = org.apache.commons.lang.math.NumberUtils.min(doubleArray10);
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
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 1.0d + "'", double77 == 1.0d);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(100, 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) (byte) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(10L, 35L, (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 100L, (double) 32, (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray13);
        byte byte16 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte byte17 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte22 = org.apache.commons.lang.math.NumberUtils.max(byteArray21);
        byte[] byteArray23 = null;
        byte[] byteArray30 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(byteArray23, byteArray30);
        byte[] byteArray36 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(byteArray30, byteArray36);
        byte byte38 = org.apache.commons.lang.math.NumberUtils.max(byteArray30);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray30);
        byte[] byteArray40 = null;
        byte[] byteArray47 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(byteArray40, byteArray47);
        byte byte49 = org.apache.commons.lang.math.NumberUtils.min(byteArray47);
        byte[] byteArray53 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte54 = org.apache.commons.lang.math.NumberUtils.max(byteArray53);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(byteArray47, byteArray53);
        byte byte56 = org.apache.commons.lang.math.NumberUtils.max(byteArray47);
        byte[] byteArray60 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte61 = org.apache.commons.lang.math.NumberUtils.max(byteArray60);
        byte[] byteArray62 = null;
        byte[] byteArray69 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(byteArray62, byteArray69);
        byte[] byteArray75 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(byteArray69, byteArray75);
        byte byte77 = org.apache.commons.lang.math.NumberUtils.max(byteArray69);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(byteArray60, byteArray69);
        byte byte79 = org.apache.commons.lang.math.NumberUtils.max(byteArray69);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(byteArray47, byteArray69);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(byteArray30, byteArray69);
        byte byte82 = org.apache.commons.lang.math.NumberUtils.max(byteArray30);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray30);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 100 + "'", byte16 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 100 + "'", byte17 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 10 + "'", byte22 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 100 + "'", byte38 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + byte49 + "' != '" + (byte) -1 + "'", byte49 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte54 + "' != '" + (byte) 10 + "'", byte54 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + byte56 + "' != '" + (byte) 100 + "'", byte56 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte61 + "' != '" + (byte) 10 + "'", byte61 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + byte77 + "' != '" + (byte) 100 + "'", byte77 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + byte79 + "' != '" + (byte) 100 + "'", byte79 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + byte82 + "' != '" + (byte) 100 + "'", byte82 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
        byte[] byteArray75 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte76 = org.apache.commons.lang.math.NumberUtils.max(byteArray75);
        byte[] byteArray79 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(byteArray75, byteArray79);
        byte byte81 = org.apache.commons.lang.math.NumberUtils.max(byteArray75);
        byte byte82 = org.apache.commons.lang.math.NumberUtils.max(byteArray75);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray75);
        byte byte84 = org.apache.commons.lang.math.NumberUtils.max(byteArray75);
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
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) 10 + "'", byte76 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + byte81 + "' != '" + (byte) 10 + "'", byte81 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte82 + "' != '" + (byte) 10 + "'", byte82 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + byte84 + "' != '" + (byte) 10 + "'", byte84 == (byte) 10);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) -1, (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, 52, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        double[] doubleArray3 = new double[] { (-1.0f), (short) 1, 35 };
        double double4 = org.apache.commons.lang.math.NumberUtils.min(doubleArray3);
        double[] doubleArray7 = new double[] { 100L, 1.0f };
        double[] doubleArray11 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray7, doubleArray11);
        double[] doubleArray15 = new double[] { 100L, 1.0f };
        double[] doubleArray19 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray15, doubleArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray15);
        double double22 = org.apache.commons.lang.math.NumberUtils.min(doubleArray15);
        double double23 = org.apache.commons.lang.math.NumberUtils.min(doubleArray15);
        double[] doubleArray26 = new double[] { 100L, 1.0f };
        double[] doubleArray30 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray26, doubleArray30);
        double[] doubleArray34 = new double[] { 100L, 1.0f };
        double[] doubleArray38 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray34, doubleArray38);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray26, doubleArray34);
        double[] doubleArray43 = new double[] { 100L, 1.0f };
        double[] doubleArray47 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray43, doubleArray47);
        double[] doubleArray51 = new double[] { 100L, 1.0f };
        double[] doubleArray55 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray51, doubleArray55);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray43, doubleArray51);
        double[] doubleArray60 = new double[] { 100L, 1.0f };
        double[] doubleArray64 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray60, doubleArray64);
        double[] doubleArray68 = new double[] { 100L, 1.0f };
        double[] doubleArray72 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray68, doubleArray72);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray64, doubleArray68);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray43, doubleArray68);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray26, doubleArray68);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray15, doubleArray26);
        double[] doubleArray80 = new double[] { 100L, 1.0f };
        double[] doubleArray84 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray80, doubleArray84);
        double[] doubleArray88 = new double[] { 100L, 1.0f };
        double[] doubleArray92 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray88, doubleArray92);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray84, doubleArray88);
        double double95 = org.apache.commons.lang.math.NumberUtils.min(doubleArray84);
        double double96 = org.apache.commons.lang.math.NumberUtils.min(doubleArray84);
        double double97 = org.apache.commons.lang.math.NumberUtils.max(doubleArray84);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray15, doubleArray84);
        boolean boolean99 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray3, doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray92), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 1.0d + "'", double95 == 1.0d);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 1.0d + "'", double96 == 1.0d);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 100.0d + "'", double97 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        double[] doubleArray1 = new double[] { (-1L) };
        double double2 = org.apache.commons.lang.math.NumberUtils.max(doubleArray1);
        double double3 = org.apache.commons.lang.math.NumberUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang.math.NumberUtils.min(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        float float42 = org.apache.commons.lang.math.NumberUtils.max(floatArray21);
        java.lang.Class<?> wildcardClass43 = floatArray21.getClass();
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
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 100.0f + "'", float42 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        int[] intArray41 = null;
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray41);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = org.apache.commons.lang.math.NumberUtils.max(intArray41);
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 1L, (float) (short) 0, (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(10, 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) 10, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 0, (long) 0, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        short short26 = org.apache.commons.lang.math.NumberUtils.min(shortArray20);
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
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 1L, (float) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 100, (float) (byte) 1, (float) 52);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(1.0f, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(0.0f, (float) (byte) 0, 35.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 97, 1.0d, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        int int64 = org.apache.commons.lang.math.NumberUtils.max(intArray45);
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
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 100 + "'", int64 == 100);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(0.0d, (double) 100, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        long[] longArray0 = new long[] {};
        long[] longArray2 = new long[] { (byte) -1 };
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray2);
        long long4 = org.apache.commons.lang.math.NumberUtils.max(longArray2);
        long[] longArray9 = new long[] { 0, (short) 1, 52, (byte) 1 };
        long long10 = org.apache.commons.lang.math.NumberUtils.max(longArray9);
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray9);
        long long12 = org.apache.commons.lang.math.NumberUtils.max(longArray9);
        long[] longArray16 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray17 = new long[] {};
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(longArray16, longArray17);
        long[] longArray22 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray23 = new long[] {};
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(longArray22, longArray23);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(longArray16, longArray23);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(longArray9, longArray16);
        long long27 = org.apache.commons.lang.math.NumberUtils.min(longArray9);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[0, 1, 52, 1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) ' ', (long) 'a', (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 35.0f, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
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
        byte[] byteArray75 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte76 = org.apache.commons.lang.math.NumberUtils.max(byteArray75);
        byte[] byteArray79 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(byteArray75, byteArray79);
        byte byte81 = org.apache.commons.lang.math.NumberUtils.max(byteArray75);
        byte byte82 = org.apache.commons.lang.math.NumberUtils.max(byteArray75);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray75);
        byte byte84 = org.apache.commons.lang.math.NumberUtils.min(byteArray21);
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
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) 10 + "'", byte76 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + byte81 + "' != '" + (byte) 10 + "'", byte81 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte82 + "' != '" + (byte) 10 + "'", byte82 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + byte84 + "' != '" + (byte) -1 + "'", byte84 == (byte) -1);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) -1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        byte byte23 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
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
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) -1 + "'", byte23 == (byte) -1);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) 0, 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 10, 52, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(1L, (long) '4', (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte4 = org.apache.commons.lang.math.NumberUtils.max(byteArray3);
        byte[] byteArray5 = null;
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray12);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(byteArray12, byteArray18);
        byte byte20 = org.apache.commons.lang.math.NumberUtils.max(byteArray12);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(byteArray3, byteArray12);
        byte byte22 = org.apache.commons.lang.math.NumberUtils.max(byteArray3);
        byte byte23 = org.apache.commons.lang.math.NumberUtils.min(byteArray3);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte28 = org.apache.commons.lang.math.NumberUtils.max(byteArray27);
        byte[] byteArray29 = null;
        byte[] byteArray36 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(byteArray29, byteArray36);
        byte[] byteArray42 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(byteArray36, byteArray42);
        byte byte44 = org.apache.commons.lang.math.NumberUtils.max(byteArray36);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(byteArray27, byteArray36);
        byte byte46 = org.apache.commons.lang.math.NumberUtils.min(byteArray27);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(byteArray3, byteArray27);
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
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 10 + "'", byte22 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) -1 + "'", byte23 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 10 + "'", byte28 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) 100 + "'", byte44 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) -1 + "'", byte46 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(0.0d, (double) 10.0f, 52.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 35, 100.0f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '#', (int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        short[] shortArray0 = null;
        short[] shortArray4 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short5 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        short[] shortArray9 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray9);
        short[] shortArray13 = new short[] { (short) -1, (short) -1 };
        short short14 = org.apache.commons.lang.math.NumberUtils.min(shortArray13);
        short[] shortArray18 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short19 = org.apache.commons.lang.math.NumberUtils.max(shortArray18);
        short[] shortArray23 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(shortArray18, shortArray23);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(shortArray13, shortArray18);
        short[] shortArray27 = new short[] { (short) 100 };
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(shortArray13, shortArray27);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray27);
        short short30 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        short short31 = org.apache.commons.lang.math.NumberUtils.min(shortArray4);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray4);
        short short33 = org.apache.commons.lang.math.NumberUtils.min(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 10 + "'", short19 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[100]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 10 + "'", short30 == (short) 10);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 1 + "'", short31 == (short) 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 1 + "'", short33 == (short) 1);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '4', 100L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
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
        java.lang.Class<?> wildcardClass38 = byteArray32.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 35, 0L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
        short short92 = org.apache.commons.lang.math.NumberUtils.max(shortArray73);
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
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 52L, 0.0f, 52.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 1L, (float) (short) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(10L, (long) '#', (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) 1, 32.0d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte4 = org.apache.commons.lang.math.NumberUtils.max(byteArray3);
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray3, byteArray7);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.max(byteArray3);
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
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(byteArray3, byteArray26);
        byte byte34 = org.apache.commons.lang.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) -1 + "'", byte34 == (byte) -1);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) 0, (float) 52L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(97.0f, (float) 32, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 1L, (float) 32L, 97.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 10, 35L, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 1, (int) (short) 1, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
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
        double double31 = org.apache.commons.lang.math.NumberUtils.max(doubleArray2);
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        long long89 = org.apache.commons.lang.math.NumberUtils.min(longArray37);
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
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, (long) (short) 0, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
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
        long long38 = org.apache.commons.lang.math.NumberUtils.max(longArray15);
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
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(10, (int) 'a', 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        double double46 = org.apache.commons.lang.math.NumberUtils.min(doubleArray35);
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
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 10L, (double) 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 1, (long) (byte) 0, (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) -1, (int) (byte) 0, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(32.0f, (float) 100, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        float[] floatArray49 = new float[] {};
        float[] floatArray53 = new float[] { 0, 1.0f, 100 };
        float[] floatArray55 = new float[] { (-1L) };
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(floatArray53, floatArray55);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(floatArray49, floatArray53);
        float float58 = org.apache.commons.lang.math.NumberUtils.max(floatArray53);
        float[] floatArray62 = new float[] { 0, 1.0f, 100 };
        float[] floatArray64 = new float[] { (-1L) };
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(floatArray62, floatArray64);
        float float66 = org.apache.commons.lang.math.NumberUtils.min(floatArray64);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(floatArray53, floatArray64);
        float[] floatArray68 = new float[] {};
        float[] floatArray72 = new float[] { 0, 1.0f, 100 };
        float[] floatArray74 = new float[] { (-1L) };
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(floatArray72, floatArray74);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(floatArray68, floatArray72);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(floatArray64, floatArray72);
        float[] floatArray82 = new float[] { 0.0f, 35, (-1), 35 };
        float[] floatArray83 = new float[] {};
        float[] floatArray87 = new float[] { 0, 1.0f, 100 };
        float[] floatArray89 = new float[] { (-1L) };
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(floatArray87, floatArray89);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(floatArray83, floatArray87);
        float float92 = org.apache.commons.lang.math.NumberUtils.max(floatArray87);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(floatArray82, floatArray87);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(floatArray64, floatArray82);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(floatArray41, floatArray82);
        float float96 = org.apache.commons.lang.math.NumberUtils.min(floatArray82);
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
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray49), "[]");
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray55), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 100.0f + "'", float58 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray62), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray64), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + (-1.0f) + "'", float66 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(floatArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray68), "[]");
        org.junit.Assert.assertNotNull(floatArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray72), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray74), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(floatArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray82), "[0.0, 35.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray83), "[]");
        org.junit.Assert.assertNotNull(floatArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray87), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray89), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + float92 + "' != '" + 100.0f + "'", float92 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + float96 + "' != '" + (-1.0f) + "'", float96 == (-1.0f));
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) -1, (int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
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
        float float48 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        float[] floatArray52 = new float[] { 0, 1.0f, 100 };
        float[] floatArray54 = new float[] { (-1L) };
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(floatArray52, floatArray54);
        float float56 = org.apache.commons.lang.math.NumberUtils.min(floatArray52);
        float[] floatArray61 = new float[] { 0.0f, 35, (-1), 35 };
        float[] floatArray62 = new float[] {};
        float[] floatArray66 = new float[] { 0, 1.0f, 100 };
        float[] floatArray68 = new float[] { (-1L) };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(floatArray66, floatArray68);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(floatArray62, floatArray66);
        float float71 = org.apache.commons.lang.math.NumberUtils.max(floatArray66);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(floatArray61, floatArray66);
        float float73 = org.apache.commons.lang.math.NumberUtils.max(floatArray66);
        float[] floatArray74 = new float[] {};
        float[] floatArray78 = new float[] { 0, 1.0f, 100 };
        float[] floatArray80 = new float[] { (-1L) };
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(floatArray78, floatArray80);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(floatArray74, floatArray78);
        float[] floatArray86 = new float[] { 0, 1.0f, 100 };
        float[] floatArray88 = new float[] { (-1L) };
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(floatArray86, floatArray88);
        float[] floatArray93 = new float[] { 0, ' ', 100.0f };
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(floatArray88, floatArray93);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(floatArray74, floatArray88);
        float float96 = org.apache.commons.lang.math.NumberUtils.min(floatArray88);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(floatArray66, floatArray88);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(floatArray52, floatArray66);
        boolean boolean99 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray52);
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
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray52), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 0.0f + "'", float56 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray61), "[0.0, 35.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray62), "[]");
        org.junit.Assert.assertNotNull(floatArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray66), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray68), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + 100.0f + "'", float71 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + float73 + "' != '" + 100.0f + "'", float73 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray74), "[]");
        org.junit.Assert.assertNotNull(floatArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray78), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray80), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(floatArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray86), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray88), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(floatArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray93), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + float96 + "' != '" + (-1.0f) + "'", float96 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
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
        byte byte31 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        java.lang.Class<?> wildcardClass32 = byteArray7.getClass();
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
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) -1 + "'", byte31 == (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) 1, (double) 1.0f, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
        int int38 = org.apache.commons.lang.math.NumberUtils.max(intArray17);
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) 10, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 52, (double) 10L, (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) -1, (int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        short[] shortArray2 = new short[] { (short) -1, (short) -1 };
        short short3 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
        short[] shortArray7 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short8 = org.apache.commons.lang.math.NumberUtils.max(shortArray7);
        short[] shortArray12 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray7, shortArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray7);
        short[] shortArray16 = new short[] { (short) 100 };
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray16);
        short[] shortArray21 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short22 = org.apache.commons.lang.math.NumberUtils.max(shortArray21);
        short[] shortArray26 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(shortArray21, shortArray26);
        short[] shortArray30 = new short[] { (short) -1, (short) -1 };
        short short31 = org.apache.commons.lang.math.NumberUtils.min(shortArray30);
        short[] shortArray35 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short36 = org.apache.commons.lang.math.NumberUtils.max(shortArray35);
        short[] shortArray40 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(shortArray35, shortArray40);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(shortArray30, shortArray35);
        short[] shortArray44 = new short[] { (short) 100 };
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(shortArray30, shortArray44);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(shortArray21, shortArray44);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray21);
        short short48 = org.apache.commons.lang.math.NumberUtils.max(shortArray21);
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
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 10 + "'", short22 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) -1 + "'", short31 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) 10 + "'", short36 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray44), "[100]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + short48 + "' != '" + (short) 10 + "'", short48 == (short) 10);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 10, 32L, (long) 52);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        double double37 = org.apache.commons.lang.math.NumberUtils.max(doubleArray2);
        double double38 = org.apache.commons.lang.math.NumberUtils.min(doubleArray2);
        double double39 = org.apache.commons.lang.math.NumberUtils.min(doubleArray2);
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
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 10, (float) 0L, (float) 35L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) ' ', (long) (-1), (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
        byte byte51 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
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
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) -1 + "'", byte51 == (byte) -1);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) 100, (float) 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) (byte) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(97.0f, (float) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 1L, (float) 1L, (float) 'a');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(0L, 97L, (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        byte[] byteArray56 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte57 = org.apache.commons.lang.math.NumberUtils.max(byteArray56);
        byte[] byteArray60 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(byteArray56, byteArray60);
        byte byte62 = org.apache.commons.lang.math.NumberUtils.max(byteArray56);
        byte[] byteArray66 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte67 = org.apache.commons.lang.math.NumberUtils.max(byteArray66);
        byte[] byteArray70 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(byteArray66, byteArray70);
        byte byte72 = org.apache.commons.lang.math.NumberUtils.max(byteArray66);
        byte byte73 = org.apache.commons.lang.math.NumberUtils.max(byteArray66);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(byteArray56, byteArray66);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(byteArray12, byteArray56);
        byte byte76 = org.apache.commons.lang.math.NumberUtils.min(byteArray56);
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
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte57 + "' != '" + (byte) 10 + "'", byte57 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + byte62 + "' != '" + (byte) 10 + "'", byte62 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) 10 + "'", byte67 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + byte72 + "' != '" + (byte) 10 + "'", byte72 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte73 + "' != '" + (byte) 10 + "'", byte73 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) -1 + "'", byte76 == (byte) -1);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 100, (int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(100.0f, (float) 100L, (float) 52);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (-1), (long) (short) 100, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 10, 10L, 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(0.0f, (float) 35L, (float) 35);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(35, (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
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
        long[] longArray36 = new long[] {};
        long[] longArray38 = new long[] { (byte) -1 };
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray36, longArray38);
        long long40 = org.apache.commons.lang.math.NumberUtils.max(longArray38);
        long[] longArray43 = new long[] { 52L, (short) 1 };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(longArray38, longArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(longArray23, longArray38);
        long[] longArray46 = new long[] {};
        long[] longArray48 = new long[] { (byte) -1 };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(longArray46, longArray48);
        long long50 = org.apache.commons.lang.math.NumberUtils.max(longArray48);
        long[] longArray53 = new long[] { 52L, (short) 1 };
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(longArray48, longArray53);
        long long55 = org.apache.commons.lang.math.NumberUtils.max(longArray53);
        long long56 = org.apache.commons.lang.math.NumberUtils.max(longArray53);
        long long57 = org.apache.commons.lang.math.NumberUtils.max(longArray53);
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
        long long79 = org.apache.commons.lang.math.NumberUtils.max(longArray73);
        long[] longArray83 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray84 = new long[] {};
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(longArray83, longArray84);
        long long86 = org.apache.commons.lang.math.NumberUtils.max(longArray83);
        long long87 = org.apache.commons.lang.math.NumberUtils.max(longArray83);
        long long88 = org.apache.commons.lang.math.NumberUtils.max(longArray83);
        long[] longArray89 = new long[] {};
        long[] longArray91 = new long[] { (byte) -1 };
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(longArray89, longArray91);
        long long93 = org.apache.commons.lang.math.NumberUtils.max(longArray91);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(longArray83, longArray91);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(longArray73, longArray83);
        long long96 = org.apache.commons.lang.math.NumberUtils.min(longArray83);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(longArray53, longArray83);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(longArray23, longArray53);
        long long99 = org.apache.commons.lang.math.NumberUtils.max(longArray23);
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
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 52L + "'", long55 == 52L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 52L + "'", long56 == 52L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 52L + "'", long57 == 52L);
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
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + (-1L) + "'", long79 == (-1L));
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray83), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 52L + "'", long86 == 52L);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 52L + "'", long87 == 52L);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 52L + "'", long88 == 52L);
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray89), "[]");
        org.junit.Assert.assertNotNull(longArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray91), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + (-1L) + "'", long93 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + (-1L) + "'", long96 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + long99 + "' != '" + 52L + "'", long99 == 52L);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        double double35 = org.apache.commons.lang.math.NumberUtils.min(doubleArray27);
        double[] doubleArray38 = new double[] { 100L, 1.0f };
        double[] doubleArray42 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray38, doubleArray42);
        double double44 = org.apache.commons.lang.math.NumberUtils.max(doubleArray38);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray38);
        double double46 = org.apache.commons.lang.math.NumberUtils.max(doubleArray27);
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
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 10, (int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '4', (-1), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) '#', (long) (byte) 0, 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) ' ', 100.0f, (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((-1), (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        int[] intArray61 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray66 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(intArray61, intArray66);
        int int68 = org.apache.commons.lang.math.NumberUtils.max(intArray66);
        int int69 = org.apache.commons.lang.math.NumberUtils.min(intArray66);
        int int70 = org.apache.commons.lang.math.NumberUtils.min(intArray66);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(intArray22, intArray66);
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
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 100 + "'", int68 == 100);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
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
        int int59 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        int int60 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
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
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(97, (int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 10, (double) (short) 100, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 97.0f, (double) 32L, 35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double[] doubleArray10 = new double[] { 100L, 1.0f };
        double[] doubleArray14 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray10);
        double double17 = org.apache.commons.lang.math.NumberUtils.max(doubleArray10);
        double[] doubleArray20 = new double[] { 100L, 1.0f };
        double[] doubleArray24 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray20, doubleArray24);
        double[] doubleArray28 = new double[] { 100L, 1.0f };
        double[] doubleArray32 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray28, doubleArray32);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray20, doubleArray28);
        double double35 = org.apache.commons.lang.math.NumberUtils.max(doubleArray28);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray28);
        double double37 = org.apache.commons.lang.math.NumberUtils.max(doubleArray28);
        double double38 = org.apache.commons.lang.math.NumberUtils.max(doubleArray28);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
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
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((-1.0d), (double) (short) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 97, 1.0d, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) -1, (double) 1L, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) '#', (int) ' ', 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
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
        short short50 = org.apache.commons.lang.math.NumberUtils.min(shortArray7);
        short short51 = org.apache.commons.lang.math.NumberUtils.max(shortArray7);
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
        org.junit.Assert.assertTrue("'" + short50 + "' != '" + (short) 1 + "'", short50 == (short) 1);
        org.junit.Assert.assertTrue("'" + short51 + "' != '" + (short) 10 + "'", short51 == (short) 10);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(10.0d, (double) '#', (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 1, (long) 35, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
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
        float[] floatArray23 = null;
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray23);
        // The following exception was thrown during execution in test generation
        try {
            float float25 = org.apache.commons.lang.math.NumberUtils.min(floatArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(97.0d, (double) 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 97L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 100, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 100, (-1), 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int int12 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray13 = null;
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray13);
        int int15 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 10, 0L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
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
        byte[] byteArray20 = null;
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(byteArray20, byteArray27);
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(byteArray27, byteArray33);
        byte byte35 = org.apache.commons.lang.math.NumberUtils.min(byteArray33);
        byte byte36 = org.apache.commons.lang.math.NumberUtils.min(byteArray33);
        byte[] byteArray40 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte41 = org.apache.commons.lang.math.NumberUtils.max(byteArray40);
        byte[] byteArray44 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(byteArray40, byteArray44);
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte51 = org.apache.commons.lang.math.NumberUtils.max(byteArray50);
        byte byte52 = org.apache.commons.lang.math.NumberUtils.max(byteArray50);
        byte byte53 = org.apache.commons.lang.math.NumberUtils.min(byteArray50);
        byte byte54 = org.apache.commons.lang.math.NumberUtils.min(byteArray50);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(byteArray44, byteArray50);
        byte[] byteArray59 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte60 = org.apache.commons.lang.math.NumberUtils.max(byteArray59);
        byte[] byteArray61 = null;
        byte[] byteArray68 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(byteArray61, byteArray68);
        byte[] byteArray74 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(byteArray68, byteArray74);
        byte byte76 = org.apache.commons.lang.math.NumberUtils.max(byteArray68);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(byteArray59, byteArray68);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(byteArray50, byteArray59);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(byteArray33, byteArray50);
        byte byte80 = org.apache.commons.lang.math.NumberUtils.max(byteArray33);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray33);
        byte byte82 = org.apache.commons.lang.math.NumberUtils.max(byteArray33);
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
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) -1 + "'", byte35 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) -1 + "'", byte36 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 10 + "'", byte41 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) 10 + "'", byte51 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 10 + "'", byte52 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte53 + "' != '" + (byte) -1 + "'", byte53 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte54 + "' != '" + (byte) -1 + "'", byte54 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte60 + "' != '" + (byte) 10 + "'", byte60 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) 100 + "'", byte76 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + byte80 + "' != '" + (byte) 10 + "'", byte80 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + byte82 + "' != '" + (byte) 10 + "'", byte82 == (byte) 10);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int int12 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int int13 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int int14 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray19 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray24 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(intArray19, intArray24);
        int int26 = org.apache.commons.lang.math.NumberUtils.min(intArray24);
        int[] intArray31 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray36 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(intArray31, intArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(intArray24, intArray31);
        int[] intArray43 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray48 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(intArray43, intArray48);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(intArray31, intArray43);
        int[] intArray55 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray60 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(intArray55, intArray60);
        int int62 = org.apache.commons.lang.math.NumberUtils.min(intArray60);
        int int63 = org.apache.commons.lang.math.NumberUtils.min(intArray60);
        int[] intArray68 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray73 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(intArray68, intArray73);
        int int75 = org.apache.commons.lang.math.NumberUtils.max(intArray73);
        int int76 = org.apache.commons.lang.math.NumberUtils.min(intArray73);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(intArray60, intArray73);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(intArray43, intArray60);
        int int79 = org.apache.commons.lang.math.NumberUtils.max(intArray43);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray43);
        int int81 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 100 + "'", int75 == 100);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 100 + "'", int79 == 100);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 32.0f, (double) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        int int54 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 100, (int) 'a', 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(35, 97, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        short[] shortArray0 = null;
        short[] shortArray4 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short5 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        short[] shortArray9 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray9);
        short short11 = org.apache.commons.lang.math.NumberUtils.min(shortArray4);
        short short12 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        short[] shortArray16 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short17 = org.apache.commons.lang.math.NumberUtils.max(shortArray16);
        short[] shortArray21 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(shortArray16, shortArray21);
        short[] shortArray25 = new short[] { (short) -1, (short) -1 };
        short short26 = org.apache.commons.lang.math.NumberUtils.min(shortArray25);
        short[] shortArray30 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short31 = org.apache.commons.lang.math.NumberUtils.max(shortArray30);
        short[] shortArray35 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(shortArray30, shortArray35);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(shortArray25, shortArray30);
        short[] shortArray39 = new short[] { (short) 100 };
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(shortArray25, shortArray39);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(shortArray16, shortArray39);
        short short42 = org.apache.commons.lang.math.NumberUtils.max(shortArray16);
        short short43 = org.apache.commons.lang.math.NumberUtils.min(shortArray16);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray16);
        short[] shortArray47 = new short[] { (short) -1, (short) -1 };
        short short48 = org.apache.commons.lang.math.NumberUtils.min(shortArray47);
        short[] shortArray52 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short53 = org.apache.commons.lang.math.NumberUtils.max(shortArray52);
        short[] shortArray57 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(shortArray52, shortArray57);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(shortArray47, shortArray52);
        short short60 = org.apache.commons.lang.math.NumberUtils.max(shortArray52);
        short[] shortArray63 = new short[] { (short) -1, (short) -1 };
        short short64 = org.apache.commons.lang.math.NumberUtils.min(shortArray63);
        short[] shortArray68 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short69 = org.apache.commons.lang.math.NumberUtils.max(shortArray68);
        short[] shortArray73 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(shortArray68, shortArray73);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(shortArray63, shortArray68);
        short[] shortArray77 = new short[] { (short) 100 };
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(shortArray63, shortArray77);
        short short79 = org.apache.commons.lang.math.NumberUtils.min(shortArray77);
        short short80 = org.apache.commons.lang.math.NumberUtils.max(shortArray77);
        short short81 = org.apache.commons.lang.math.NumberUtils.min(shortArray77);
        short short82 = org.apache.commons.lang.math.NumberUtils.min(shortArray77);
        short[] shortArray86 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short87 = org.apache.commons.lang.math.NumberUtils.max(shortArray86);
        short[] shortArray91 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(shortArray86, shortArray91);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(shortArray77, shortArray86);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(shortArray52, shortArray77);
        short short95 = org.apache.commons.lang.math.NumberUtils.min(shortArray77);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(shortArray16, shortArray77);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray16);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) -1 + "'", short26 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 10 + "'", short31 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[100]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) 10 + "'", short42 == (short) 10);
        org.junit.Assert.assertTrue("'" + short43 + "' != '" + (short) 1 + "'", short43 == (short) 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray47), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short48 + "' != '" + (short) -1 + "'", short48 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray52), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short53 + "' != '" + (short) 10 + "'", short53 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray57), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + short60 + "' != '" + (short) 10 + "'", short60 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray63), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short64 + "' != '" + (short) -1 + "'", short64 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray68), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short69 + "' != '" + (short) 10 + "'", short69 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray73), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(shortArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray77), "[100]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + short79 + "' != '" + (short) 100 + "'", short79 == (short) 100);
        org.junit.Assert.assertTrue("'" + short80 + "' != '" + (short) 100 + "'", short80 == (short) 100);
        org.junit.Assert.assertTrue("'" + short81 + "' != '" + (short) 100 + "'", short81 == (short) 100);
        org.junit.Assert.assertTrue("'" + short82 + "' != '" + (short) 100 + "'", short82 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray86), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short87 + "' != '" + (short) 10 + "'", short87 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray91), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + short95 + "' != '" + (short) 100 + "'", short95 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(97, 100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) (byte) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
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
        short[] shortArray25 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short26 = org.apache.commons.lang.math.NumberUtils.max(shortArray25);
        short[] shortArray30 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(shortArray25, shortArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(shortArray16, shortArray25);
        short short33 = org.apache.commons.lang.math.NumberUtils.max(shortArray25);
        short[] shortArray36 = new short[] { (short) -1, (short) -1 };
        short short37 = org.apache.commons.lang.math.NumberUtils.min(shortArray36);
        short[] shortArray41 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short42 = org.apache.commons.lang.math.NumberUtils.max(shortArray41);
        short[] shortArray46 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(shortArray41, shortArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray41);
        short[] shortArray53 = new short[] { (byte) -1, (short) 100, (byte) -1, (byte) -1 };
        short short54 = org.apache.commons.lang.math.NumberUtils.max(shortArray53);
        short short55 = org.apache.commons.lang.math.NumberUtils.min(shortArray53);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray53);
        short[] shortArray60 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short61 = org.apache.commons.lang.math.NumberUtils.max(shortArray60);
        short[] shortArray65 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(shortArray60, shortArray65);
        short short67 = org.apache.commons.lang.math.NumberUtils.min(shortArray60);
        short[] shortArray70 = new short[] { (short) -1, (short) -1 };
        short short71 = org.apache.commons.lang.math.NumberUtils.min(shortArray70);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(shortArray60, shortArray70);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray70);
        short short74 = org.apache.commons.lang.math.NumberUtils.max(shortArray36);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(shortArray25, shortArray36);
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
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 10 + "'", short26 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 10 + "'", short33 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) -1 + "'", short37 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) 10 + "'", short42 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray53), "[-1, 100, -1, -1]");
        org.junit.Assert.assertTrue("'" + short54 + "' != '" + (short) 100 + "'", short54 == (short) 100);
        org.junit.Assert.assertTrue("'" + short55 + "' != '" + (short) -1 + "'", short55 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray60), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short61 + "' != '" + (short) 10 + "'", short61 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray65), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + short67 + "' != '" + (short) 1 + "'", short67 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray70), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short71 + "' != '" + (short) -1 + "'", short71 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + short74 + "' != '" + (short) -1 + "'", short74 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) '#', (double) 35L, (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
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
        java.lang.Class<?> wildcardClass41 = floatArray30.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 100.0f, 35.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) (byte) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(32, (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) -1, 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '#', 35L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
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
        float float18 = org.apache.commons.lang.math.NumberUtils.min(floatArray3);
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
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 100L, (float) '#', (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
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
        byte[] byteArray19 = null;
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray19);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(1, (int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) (byte) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte byte10 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte byte12 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte byte13 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte[] byteArray14 = null;
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray14);
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte21 = org.apache.commons.lang.math.NumberUtils.max(byteArray20);
        byte byte22 = org.apache.commons.lang.math.NumberUtils.max(byteArray20);
        byte byte23 = org.apache.commons.lang.math.NumberUtils.min(byteArray20);
        byte byte24 = org.apache.commons.lang.math.NumberUtils.min(byteArray20);
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte30 = org.apache.commons.lang.math.NumberUtils.max(byteArray29);
        byte byte31 = org.apache.commons.lang.math.NumberUtils.max(byteArray29);
        byte byte32 = org.apache.commons.lang.math.NumberUtils.min(byteArray29);
        byte byte33 = org.apache.commons.lang.math.NumberUtils.min(byteArray29);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(byteArray20, byteArray29);
        byte[] byteArray35 = null;
        byte[] byteArray42 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(byteArray35, byteArray42);
        byte byte44 = org.apache.commons.lang.math.NumberUtils.min(byteArray42);
        byte[] byteArray48 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte49 = org.apache.commons.lang.math.NumberUtils.max(byteArray48);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(byteArray42, byteArray48);
        byte byte51 = org.apache.commons.lang.math.NumberUtils.min(byteArray48);
        byte byte52 = org.apache.commons.lang.math.NumberUtils.min(byteArray48);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(byteArray20, byteArray48);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(byteArray14, byteArray48);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 10 + "'", byte21 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 10 + "'", byte22 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) -1 + "'", byte23 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) -1 + "'", byte24 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 10 + "'", byte30 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 10 + "'", byte31 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) -1 + "'", byte32 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) -1 + "'", byte33 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) -1 + "'", byte44 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte49 + "' != '" + (byte) 10 + "'", byte49 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) -1 + "'", byte51 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) -1 + "'", byte52 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 10, 1.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 32.0f, (double) 100, (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        java.lang.Class<?> wildcardClass85 = floatArray9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        short[] shortArray2 = new short[] { (short) -1, (short) -1 };
        short short3 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
        short[] shortArray7 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short8 = org.apache.commons.lang.math.NumberUtils.max(shortArray7);
        short[] shortArray12 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray7, shortArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray7);
        java.lang.Class<?> wildcardClass15 = shortArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 0, (float) 100L, (float) '4');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
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
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray36);
        byte[] byteArray49 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte50 = org.apache.commons.lang.math.NumberUtils.max(byteArray49);
        byte[] byteArray51 = null;
        byte[] byteArray58 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(byteArray51, byteArray58);
        byte[] byteArray64 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(byteArray58, byteArray64);
        byte byte66 = org.apache.commons.lang.math.NumberUtils.max(byteArray58);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(byteArray49, byteArray58);
        byte[] byteArray72 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte73 = org.apache.commons.lang.math.NumberUtils.max(byteArray72);
        byte byte74 = org.apache.commons.lang.math.NumberUtils.max(byteArray72);
        byte byte75 = org.apache.commons.lang.math.NumberUtils.max(byteArray72);
        byte[] byteArray76 = null;
        byte[] byteArray83 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(byteArray76, byteArray83);
        byte byte85 = org.apache.commons.lang.math.NumberUtils.min(byteArray83);
        byte byte86 = org.apache.commons.lang.math.NumberUtils.max(byteArray83);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(byteArray72, byteArray83);
        byte byte88 = org.apache.commons.lang.math.NumberUtils.max(byteArray72);
        byte byte89 = org.apache.commons.lang.math.NumberUtils.min(byteArray72);
        byte byte90 = org.apache.commons.lang.math.NumberUtils.max(byteArray72);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(byteArray58, byteArray72);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(byteArray36, byteArray58);
        byte byte93 = org.apache.commons.lang.math.NumberUtils.min(byteArray58);
        byte byte94 = org.apache.commons.lang.math.NumberUtils.max(byteArray58);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) 10 + "'", byte50 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + byte66 + "' != '" + (byte) 100 + "'", byte66 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte73 + "' != '" + (byte) 10 + "'", byte73 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte74 + "' != '" + (byte) 10 + "'", byte74 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte75 + "' != '" + (byte) 10 + "'", byte75 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + byte85 + "' != '" + (byte) -1 + "'", byte85 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte86 + "' != '" + (byte) 100 + "'", byte86 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + byte88 + "' != '" + (byte) 10 + "'", byte88 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte89 + "' != '" + (byte) -1 + "'", byte89 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte90 + "' != '" + (byte) 10 + "'", byte90 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + byte93 + "' != '" + (byte) -1 + "'", byte93 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte94 + "' != '" + (byte) 100 + "'", byte94 == (byte) 100);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 1, (long) (byte) -1, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
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
        byte[] byteArray21 = null;
        byte[] byteArray28 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray28);
        byte byte30 = org.apache.commons.lang.math.NumberUtils.min(byteArray28);
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte35 = org.apache.commons.lang.math.NumberUtils.max(byteArray34);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(byteArray28, byteArray34);
        byte byte37 = org.apache.commons.lang.math.NumberUtils.max(byteArray28);
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte42 = org.apache.commons.lang.math.NumberUtils.max(byteArray41);
        byte[] byteArray43 = null;
        byte[] byteArray50 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(byteArray43, byteArray50);
        byte[] byteArray56 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(byteArray50, byteArray56);
        byte byte58 = org.apache.commons.lang.math.NumberUtils.max(byteArray50);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(byteArray41, byteArray50);
        byte byte60 = org.apache.commons.lang.math.NumberUtils.max(byteArray50);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(byteArray28, byteArray50);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray28);
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
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) -1 + "'", byte30 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 10 + "'", byte35 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 100 + "'", byte37 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) 10 + "'", byte42 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + byte58 + "' != '" + (byte) 100 + "'", byte58 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + byte60 + "' != '" + (byte) 100 + "'", byte60 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 0, 32, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 97.0f, (double) 100.0f, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
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
        long long29 = org.apache.commons.lang.math.NumberUtils.min(longArray24);
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
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
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
        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte44 = org.apache.commons.lang.math.NumberUtils.max(byteArray43);
        byte[] byteArray47 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(byteArray43, byteArray47);
        byte[] byteArray53 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte54 = org.apache.commons.lang.math.NumberUtils.max(byteArray53);
        byte byte55 = org.apache.commons.lang.math.NumberUtils.max(byteArray53);
        byte byte56 = org.apache.commons.lang.math.NumberUtils.min(byteArray53);
        byte byte57 = org.apache.commons.lang.math.NumberUtils.min(byteArray53);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(byteArray47, byteArray53);
        byte[] byteArray62 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte63 = org.apache.commons.lang.math.NumberUtils.max(byteArray62);
        byte[] byteArray64 = null;
        byte[] byteArray71 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(byteArray64, byteArray71);
        byte[] byteArray77 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(byteArray71, byteArray77);
        byte byte79 = org.apache.commons.lang.math.NumberUtils.max(byteArray71);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(byteArray62, byteArray71);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(byteArray53, byteArray62);
        byte byte82 = org.apache.commons.lang.math.NumberUtils.max(byteArray53);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(byteArray16, byteArray53);
        byte byte84 = org.apache.commons.lang.math.NumberUtils.min(byteArray53);
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
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) 10 + "'", byte44 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte54 + "' != '" + (byte) 10 + "'", byte54 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte55 + "' != '" + (byte) 10 + "'", byte55 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte56 + "' != '" + (byte) -1 + "'", byte56 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte57 + "' != '" + (byte) -1 + "'", byte57 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte63 + "' != '" + (byte) 10 + "'", byte63 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + byte79 + "' != '" + (byte) 100 + "'", byte79 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + byte82 + "' != '" + (byte) 10 + "'", byte82 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + byte84 + "' != '" + (byte) -1 + "'", byte84 == (byte) -1);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(10L, 0L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 0, 10.0f, (float) 52);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) (byte) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 0.0f, 35.0d, (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(97, (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
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
        double double35 = org.apache.commons.lang.math.NumberUtils.min(doubleArray27);
        double[] doubleArray38 = new double[] { 100L, 1.0f };
        double[] doubleArray42 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray38, doubleArray42);
        double double44 = org.apache.commons.lang.math.NumberUtils.max(doubleArray38);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray38);
        double double46 = org.apache.commons.lang.math.NumberUtils.max(doubleArray38);
        double double47 = org.apache.commons.lang.math.NumberUtils.max(doubleArray38);
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
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 100, 52L, 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
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
        double double48 = org.apache.commons.lang.math.NumberUtils.min(doubleArray11);
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
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) 'a', (int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 100, (float) 0, (float) '4');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 0L, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) -1, (double) '4', 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 0L, 0.0f, (float) '#');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) -1, 10L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 100, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 32, 0L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) 10, (double) (short) 0, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 1, (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((-1.0f), (float) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 1, (int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
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
        float float48 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        float[] floatArray49 = new float[] {};
        float[] floatArray53 = new float[] { 0, 1.0f, 100 };
        float[] floatArray55 = new float[] { (-1L) };
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(floatArray53, floatArray55);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(floatArray49, floatArray53);
        float[] floatArray61 = new float[] { 0, 1.0f, 100 };
        float[] floatArray63 = new float[] { (-1L) };
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(floatArray61, floatArray63);
        float[] floatArray68 = new float[] { 0, ' ', 100.0f };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(floatArray63, floatArray68);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(floatArray49, floatArray63);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray63);
        float float72 = org.apache.commons.lang.math.NumberUtils.min(floatArray63);
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
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray49), "[]");
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray55), "[-1.0]");
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
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + float72 + "' != '" + (-1.0f) + "'", float72 == (-1.0f));
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) 100, (double) 52, (double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) (byte) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
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
        double double54 = org.apache.commons.lang.math.NumberUtils.max(doubleArray2);
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
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 100.0d + "'", double54 == 100.0d);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
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
        byte[] byteArray20 = null;
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(byteArray20, byteArray27);
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(byteArray27, byteArray33);
        byte byte35 = org.apache.commons.lang.math.NumberUtils.min(byteArray33);
        byte byte36 = org.apache.commons.lang.math.NumberUtils.min(byteArray33);
        byte[] byteArray40 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte41 = org.apache.commons.lang.math.NumberUtils.max(byteArray40);
        byte[] byteArray44 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(byteArray40, byteArray44);
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte51 = org.apache.commons.lang.math.NumberUtils.max(byteArray50);
        byte byte52 = org.apache.commons.lang.math.NumberUtils.max(byteArray50);
        byte byte53 = org.apache.commons.lang.math.NumberUtils.min(byteArray50);
        byte byte54 = org.apache.commons.lang.math.NumberUtils.min(byteArray50);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(byteArray44, byteArray50);
        byte[] byteArray59 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte60 = org.apache.commons.lang.math.NumberUtils.max(byteArray59);
        byte[] byteArray61 = null;
        byte[] byteArray68 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(byteArray61, byteArray68);
        byte[] byteArray74 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(byteArray68, byteArray74);
        byte byte76 = org.apache.commons.lang.math.NumberUtils.max(byteArray68);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(byteArray59, byteArray68);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(byteArray50, byteArray59);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(byteArray33, byteArray50);
        byte byte80 = org.apache.commons.lang.math.NumberUtils.max(byteArray33);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray33);
        java.lang.Class<?> wildcardClass82 = byteArray7.getClass();
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
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) -1 + "'", byte35 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) -1 + "'", byte36 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 10 + "'", byte41 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) 10 + "'", byte51 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 10 + "'", byte52 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte53 + "' != '" + (byte) -1 + "'", byte53 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte54 + "' != '" + (byte) -1 + "'", byte54 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte60 + "' != '" + (byte) 10 + "'", byte60 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) 100 + "'", byte76 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + byte80 + "' != '" + (byte) 10 + "'", byte80 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        short[] shortArray0 = null;
        short[] shortArray2 = new short[] { (byte) 1 };
        short short3 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
        short[] shortArray5 = new short[] { (short) -1 };
        short short6 = org.apache.commons.lang.math.NumberUtils.max(shortArray5);
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray5);
        short[] shortArray11 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.max(shortArray11);
        short[] shortArray16 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray16);
        short short18 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        short[] shortArray21 = new short[] { (short) -1, (short) -1 };
        short short22 = org.apache.commons.lang.math.NumberUtils.min(shortArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray21);
        short short24 = org.apache.commons.lang.math.NumberUtils.max(shortArray21);
        short short25 = org.apache.commons.lang.math.NumberUtils.min(shortArray21);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray21);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray21);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1]");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 1 + "'", short18 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) -1 + "'", short24 == (short) -1);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) -1 + "'", short25 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int int12 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int int13 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int[] intArray20 = new int[] { (short) 0, '4', (byte) 0, (short) 1, (short) 10, '#' };
        int int21 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
        int int22 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
        int[] intArray29 = new int[] { (short) 0, '4', (byte) 0, (short) 1, (short) 10, '#' };
        int int30 = org.apache.commons.lang.math.NumberUtils.min(intArray29);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(intArray20, intArray29);
        int[] intArray37 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int38 = org.apache.commons.lang.math.NumberUtils.max(intArray37);
        int int39 = org.apache.commons.lang.math.NumberUtils.max(intArray37);
        int int40 = org.apache.commons.lang.math.NumberUtils.max(intArray37);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(intArray29, intArray37);
        int[] intArray46 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray51 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(intArray46, intArray51);
        int int53 = org.apache.commons.lang.math.NumberUtils.max(intArray51);
        int int54 = org.apache.commons.lang.math.NumberUtils.max(intArray51);
        int[] intArray59 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray64 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(intArray59, intArray64);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(intArray51, intArray59);
        int int67 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(intArray37, intArray59);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray59);
        int[] intArray74 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray79 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(intArray74, intArray79);
        int int81 = org.apache.commons.lang.math.NumberUtils.min(intArray79);
        int int82 = org.apache.commons.lang.math.NumberUtils.min(intArray79);
        int int83 = org.apache.commons.lang.math.NumberUtils.max(intArray79);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray79);
        int int85 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int int86 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 52, 0, 1, 10, 35]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 52, 0, 1, 10, 35]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 100 + "'", int83 == 100);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 100 + "'", int85 == 100);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 100, (double) 0L, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 100, (long) (short) -1, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(1L, 97L, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(100L, (long) (short) -1, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 100, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
        byte[] byteArray22 = null;
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(byteArray22, byteArray29);
        byte byte31 = org.apache.commons.lang.math.NumberUtils.min(byteArray29);
        byte[] byteArray35 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte36 = org.apache.commons.lang.math.NumberUtils.max(byteArray35);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(byteArray29, byteArray35);
        byte byte38 = org.apache.commons.lang.math.NumberUtils.max(byteArray29);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray29);
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
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) -1 + "'", byte31 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) 10 + "'", byte36 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 100 + "'", byte38 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 1, 35.0f, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 100, 0L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 0, (int) (byte) 1, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 1, (float) 32L, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 100, (int) (byte) 0, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) '#', (long) 1, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte byte10 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte16 = org.apache.commons.lang.math.NumberUtils.max(byteArray15);
        byte byte17 = org.apache.commons.lang.math.NumberUtils.max(byteArray15);
        byte byte18 = org.apache.commons.lang.math.NumberUtils.max(byteArray15);
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte23 = org.apache.commons.lang.math.NumberUtils.max(byteArray22);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(byteArray22, byteArray26);
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte33 = org.apache.commons.lang.math.NumberUtils.max(byteArray32);
        byte byte34 = org.apache.commons.lang.math.NumberUtils.max(byteArray32);
        byte byte35 = org.apache.commons.lang.math.NumberUtils.min(byteArray32);
        byte byte36 = org.apache.commons.lang.math.NumberUtils.min(byteArray32);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray32);
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte42 = org.apache.commons.lang.math.NumberUtils.max(byteArray41);
        byte[] byteArray43 = null;
        byte[] byteArray50 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(byteArray43, byteArray50);
        byte[] byteArray56 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(byteArray50, byteArray56);
        byte byte58 = org.apache.commons.lang.math.NumberUtils.max(byteArray50);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(byteArray41, byteArray50);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(byteArray32, byteArray41);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(byteArray15, byteArray32);
        byte byte62 = org.apache.commons.lang.math.NumberUtils.max(byteArray32);
        byte byte63 = org.apache.commons.lang.math.NumberUtils.max(byteArray32);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray32);
        byte byte65 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte byte66 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte byte67 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 10 + "'", byte16 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 10 + "'", byte17 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 10 + "'", byte18 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 10 + "'", byte23 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 10 + "'", byte33 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) 10 + "'", byte34 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) -1 + "'", byte35 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) -1 + "'", byte36 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) 10 + "'", byte42 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + byte58 + "' != '" + (byte) 100 + "'", byte58 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + byte62 + "' != '" + (byte) 10 + "'", byte62 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte63 + "' != '" + (byte) 10 + "'", byte63 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + byte65 + "' != '" + (byte) 100 + "'", byte65 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte66 + "' != '" + (byte) 100 + "'", byte66 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) 100 + "'", byte67 == (byte) 100);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (byte) 10, (double) (short) 10, (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
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
        java.lang.Class<?> wildcardClass35 = doubleArray27.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        short[] shortArray4 = new short[] { (byte) -1, (short) 100, (byte) -1, (byte) -1 };
        short short5 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        short short6 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        short short7 = org.apache.commons.lang.math.NumberUtils.min(shortArray4);
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
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray63);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 100, -1, -1]");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
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
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 100, (float) 10L, 35.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
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
        long long34 = org.apache.commons.lang.math.NumberUtils.max(longArray31);
        long long35 = org.apache.commons.lang.math.NumberUtils.max(longArray31);
        long long36 = org.apache.commons.lang.math.NumberUtils.max(longArray31);
        long long37 = org.apache.commons.lang.math.NumberUtils.min(longArray31);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(longArray23, longArray31);
        long long39 = org.apache.commons.lang.math.NumberUtils.min(longArray31);
        long long40 = org.apache.commons.lang.math.NumberUtils.min(longArray31);
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 52L + "'", long34 == 52L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 52L + "'", long35 == 52L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 52L + "'", long36 == 52L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((-1), (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 100, (long) (-1), (long) 52);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 10L, (float) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) -1, (int) ' ', 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) 'a', 32, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) -1, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float[] floatArray10 = new float[] { 0, 1.0f, 100 };
        float[] floatArray12 = new float[] { (-1L) };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray12);
        float float14 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray10);
        float float16 = org.apache.commons.lang.math.NumberUtils.max(floatArray5);
        float float17 = org.apache.commons.lang.math.NumberUtils.min(floatArray5);
        float[] floatArray21 = new float[] { 0, 1.0f, 100 };
        float[] floatArray23 = new float[] { (-1L) };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(floatArray21, floatArray23);
        float[] floatArray28 = new float[] { 0, 1.0f, 100 };
        float[] floatArray30 = new float[] { (-1L) };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(floatArray28, floatArray30);
        float float32 = org.apache.commons.lang.math.NumberUtils.max(floatArray28);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(floatArray23, floatArray28);
        float float34 = org.apache.commons.lang.math.NumberUtils.min(floatArray23);
        float float35 = org.apache.commons.lang.math.NumberUtils.max(floatArray23);
        float float36 = org.apache.commons.lang.math.NumberUtils.min(floatArray23);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray23);
        float[] floatArray41 = new float[] { 0, 1.0f, 100 };
        float[] floatArray43 = new float[] { (-1L) };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(floatArray41, floatArray43);
        float[] floatArray49 = new float[] { 0.0f, 35, (-1), 35 };
        float[] floatArray50 = new float[] {};
        float[] floatArray54 = new float[] { 0, 1.0f, 100 };
        float[] floatArray56 = new float[] { (-1L) };
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(floatArray54, floatArray56);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(floatArray50, floatArray54);
        float float59 = org.apache.commons.lang.math.NumberUtils.max(floatArray54);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(floatArray49, floatArray54);
        float float61 = org.apache.commons.lang.math.NumberUtils.max(floatArray54);
        float float62 = org.apache.commons.lang.math.NumberUtils.max(floatArray54);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(floatArray41, floatArray54);
        float float64 = org.apache.commons.lang.math.NumberUtils.max(floatArray54);
        float float65 = org.apache.commons.lang.math.NumberUtils.max(floatArray54);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray54);
        java.lang.Class<?> wildcardClass67 = floatArray5.getClass();
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
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-1.0f) + "'", float35 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + (-1.0f) + "'", float36 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray49), "[0.0, 35.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray50), "[]");
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray56), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 100.0f + "'", float59 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 100.0f + "'", float61 == 100.0f);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 100.0f + "'", float62 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 100.0f + "'", float64 == 100.0f);
        org.junit.Assert.assertTrue("'" + float65 + "' != '" + 100.0f + "'", float65 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) (byte) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
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
        short[] shortArray92 = new short[] { (short) -1 };
        short short93 = org.apache.commons.lang.math.NumberUtils.max(shortArray92);
        short short94 = org.apache.commons.lang.math.NumberUtils.max(shortArray92);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(shortArray45, shortArray92);
        short short96 = org.apache.commons.lang.math.NumberUtils.max(shortArray45);
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
        org.junit.Assert.assertNotNull(shortArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray92), "[-1]");
        org.junit.Assert.assertTrue("'" + short93 + "' != '" + (short) -1 + "'", short93 == (short) -1);
        org.junit.Assert.assertTrue("'" + short94 + "' != '" + (short) -1 + "'", short94 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + short96 + "' != '" + (short) 100 + "'", short96 == (short) 100);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(1.0d, (double) 10L, (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 10, (float) (byte) 0, 97.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 0, (long) '#', 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float[] floatArray10 = new float[] { 0, 1.0f, 100 };
        float[] floatArray12 = new float[] { (-1L) };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray12);
        float float14 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray10);
        float float16 = org.apache.commons.lang.math.NumberUtils.max(floatArray3);
        float[] floatArray17 = new float[] {};
        float[] floatArray21 = new float[] { 0, 1.0f, 100 };
        float[] floatArray23 = new float[] { (-1L) };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(floatArray21, floatArray23);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(floatArray17, floatArray21);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray21);
        float float27 = org.apache.commons.lang.math.NumberUtils.max(floatArray21);
        float float28 = org.apache.commons.lang.math.NumberUtils.min(floatArray21);
        java.lang.Class<?> wildcardClass29 = floatArray21.getClass();
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
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(10L, 0L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) '#', (double) (short) 1, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(0.0f, 52.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray13);
        byte byte16 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte byte17 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte byte18 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        byte byte19 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte[] byteArray20 = null;
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(byteArray20, byteArray27);
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(byteArray27, byteArray33);
        byte byte35 = org.apache.commons.lang.math.NumberUtils.min(byteArray27);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray27);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -1 + "'", byte17 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 10 + "'", byte18 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) -1 + "'", byte19 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) -1 + "'", byte35 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
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
        float float79 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float80 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float81 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
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
        org.junit.Assert.assertTrue("'" + float79 + "' != '" + 0.0f + "'", float79 == 0.0f);
        org.junit.Assert.assertTrue("'" + float80 + "' != '" + 100.0f + "'", float80 == 100.0f);
        org.junit.Assert.assertTrue("'" + float81 + "' != '" + 0.0f + "'", float81 == 0.0f);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 100, 97.0f, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((-1), 52, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) (byte) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
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
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte24 = org.apache.commons.lang.math.NumberUtils.max(byteArray23);
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(byteArray23, byteArray27);
        byte byte29 = org.apache.commons.lang.math.NumberUtils.max(byteArray27);
        byte byte30 = org.apache.commons.lang.math.NumberUtils.max(byteArray27);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray27);
        byte byte32 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
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
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 10 + "'", byte24 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 100 + "'", byte29 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 100 + "'", byte30 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) -1 + "'", byte32 == (byte) -1);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte4 = org.apache.commons.lang.math.NumberUtils.max(byteArray3);
        byte[] byteArray5 = null;
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray12);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(byteArray12, byteArray18);
        byte byte20 = org.apache.commons.lang.math.NumberUtils.max(byteArray12);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(byteArray3, byteArray12);
        byte byte22 = org.apache.commons.lang.math.NumberUtils.max(byteArray3);
        byte byte23 = org.apache.commons.lang.math.NumberUtils.min(byteArray3);
        byte byte24 = org.apache.commons.lang.math.NumberUtils.max(byteArray3);
        byte byte25 = org.apache.commons.lang.math.NumberUtils.min(byteArray3);
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
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 10 + "'", byte22 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) -1 + "'", byte23 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 10 + "'", byte24 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) -1 + "'", byte25 == (byte) -1);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(97.0f, (float) (-1), (float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(97.0f, 52.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
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
        short[] shortArray22 = new short[] { (byte) 1 };
        short short23 = org.apache.commons.lang.math.NumberUtils.min(shortArray22);
        short[] shortArray25 = new short[] { (short) -1 };
        short short26 = org.apache.commons.lang.math.NumberUtils.max(shortArray25);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(shortArray22, shortArray25);
        short[] shortArray29 = new short[] { (byte) 1 };
        short short30 = org.apache.commons.lang.math.NumberUtils.min(shortArray29);
        short[] shortArray32 = new short[] { (short) -1 };
        short short33 = org.apache.commons.lang.math.NumberUtils.max(shortArray32);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(shortArray29, shortArray32);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(shortArray25, shortArray32);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(shortArray16, shortArray32);
        short short37 = org.apache.commons.lang.math.NumberUtils.min(shortArray16);
        short[] shortArray39 = new short[] { (byte) 1 };
        short short40 = org.apache.commons.lang.math.NumberUtils.min(shortArray39);
        short[] shortArray42 = new short[] { (short) -1 };
        short short43 = org.apache.commons.lang.math.NumberUtils.max(shortArray42);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(shortArray39, shortArray42);
        short[] shortArray46 = new short[] { (byte) 1 };
        short short47 = org.apache.commons.lang.math.NumberUtils.min(shortArray46);
        short[] shortArray49 = new short[] { (short) -1 };
        short short50 = org.apache.commons.lang.math.NumberUtils.max(shortArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(shortArray46, shortArray49);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(shortArray42, shortArray49);
        short short53 = org.apache.commons.lang.math.NumberUtils.max(shortArray49);
        short short54 = org.apache.commons.lang.math.NumberUtils.max(shortArray49);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(shortArray16, shortArray49);
        short[] shortArray58 = new short[] { (short) -1, (short) -1 };
        short short59 = org.apache.commons.lang.math.NumberUtils.min(shortArray58);
        short short60 = org.apache.commons.lang.math.NumberUtils.max(shortArray58);
        short short61 = org.apache.commons.lang.math.NumberUtils.min(shortArray58);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(shortArray16, shortArray58);
        java.lang.Class<?> wildcardClass63 = shortArray16.getClass();
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
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[1]");
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 1 + "'", short23 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[-1]");
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) -1 + "'", short26 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[1]");
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 1 + "'", short30 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[-1]");
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) -1 + "'", short33 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) 100 + "'", short37 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[1]");
        org.junit.Assert.assertTrue("'" + short40 + "' != '" + (short) 1 + "'", short40 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[-1]");
        org.junit.Assert.assertTrue("'" + short43 + "' != '" + (short) -1 + "'", short43 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[1]");
        org.junit.Assert.assertTrue("'" + short47 + "' != '" + (short) 1 + "'", short47 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[-1]");
        org.junit.Assert.assertTrue("'" + short50 + "' != '" + (short) -1 + "'", short50 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + short53 + "' != '" + (short) -1 + "'", short53 == (short) -1);
        org.junit.Assert.assertTrue("'" + short54 + "' != '" + (short) -1 + "'", short54 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray58), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short59 + "' != '" + (short) -1 + "'", short59 == (short) -1);
        org.junit.Assert.assertTrue("'" + short60 + "' != '" + (short) -1 + "'", short60 == (short) -1);
        org.junit.Assert.assertTrue("'" + short61 + "' != '" + (short) -1 + "'", short61 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) ' ', 10.0f, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(0.0d, (double) 52, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 10, (float) (short) 1, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
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
        short short40 = org.apache.commons.lang.math.NumberUtils.max(shortArray22);
        short short41 = org.apache.commons.lang.math.NumberUtils.min(shortArray22);
        short short42 = org.apache.commons.lang.math.NumberUtils.min(shortArray22);
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
        org.junit.Assert.assertTrue("'" + short41 + "' != '" + (short) 100 + "'", short41 == (short) 100);
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) 100 + "'", short42 == (short) 100);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 'a', (float) 0L, 97.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(0.0d, (double) (byte) 1, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 1, (-1L), (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(1L, (long) 0, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 100, (int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        int[] intArray0 = null;
        int[] intArray7 = new int[] { (short) 0, '4', (byte) 0, (short) 1, (short) 10, '#' };
        int int8 = org.apache.commons.lang.math.NumberUtils.min(intArray7);
        int int9 = org.apache.commons.lang.math.NumberUtils.min(intArray7);
        int[] intArray16 = new int[] { (short) 0, '4', (byte) 0, (short) 1, (short) 10, '#' };
        int int17 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(intArray7, intArray16);
        int[] intArray24 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int25 = org.apache.commons.lang.math.NumberUtils.max(intArray24);
        int int26 = org.apache.commons.lang.math.NumberUtils.max(intArray24);
        int int27 = org.apache.commons.lang.math.NumberUtils.max(intArray24);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray24);
        int int29 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        int int30 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray16);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 52, 0, 1, 10, 35]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 52, 0, 1, 10, 35]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 52.0f, (double) (short) -1, 52.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
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
        int[] intArray31 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray36 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(intArray31, intArray36);
        int int38 = org.apache.commons.lang.math.NumberUtils.max(intArray31);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray31);
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
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) '#', 1.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) 1, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 10, 10, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 32, 52L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
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
        long long42 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long[] longArray43 = new long[] {};
        long[] longArray45 = new long[] { (byte) -1 };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(longArray43, longArray45);
        long[] longArray47 = new long[] {};
        long[] longArray49 = new long[] { (byte) -1 };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(longArray47, longArray49);
        long long51 = org.apache.commons.lang.math.NumberUtils.max(longArray49);
        long long52 = org.apache.commons.lang.math.NumberUtils.max(longArray49);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(longArray45, longArray49);
        long long54 = org.apache.commons.lang.math.NumberUtils.min(longArray45);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray45);
        long long56 = org.apache.commons.lang.math.NumberUtils.max(longArray45);
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
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[]");
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-1L) + "'", long56 == (-1L));
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) '4', (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 10.0f, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) (byte) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        float[] floatArray0 = null;
        float[] floatArray5 = new float[] { 52.0f, 1.0f, 1L, (byte) 0 };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray5);
        float float7 = org.apache.commons.lang.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[52.0, 1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
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
        float[] floatArray41 = null;
        float[] floatArray46 = new float[] { 0.0f, 35, (-1), 35 };
        float[] floatArray47 = new float[] {};
        float[] floatArray51 = new float[] { 0, 1.0f, 100 };
        float[] floatArray53 = new float[] { (-1L) };
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(floatArray51, floatArray53);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(floatArray47, floatArray51);
        float float56 = org.apache.commons.lang.math.NumberUtils.max(floatArray51);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(floatArray46, floatArray51);
        float float58 = org.apache.commons.lang.math.NumberUtils.max(floatArray51);
        float[] floatArray59 = new float[] {};
        float[] floatArray63 = new float[] { 0, 1.0f, 100 };
        float[] floatArray65 = new float[] { (-1L) };
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(floatArray63, floatArray65);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(floatArray59, floatArray63);
        float[] floatArray71 = new float[] { 0, 1.0f, 100 };
        float[] floatArray73 = new float[] { (-1L) };
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(floatArray71, floatArray73);
        float[] floatArray78 = new float[] { 0, ' ', 100.0f };
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(floatArray73, floatArray78);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(floatArray59, floatArray73);
        float float81 = org.apache.commons.lang.math.NumberUtils.min(floatArray73);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(floatArray51, floatArray73);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(floatArray41, floatArray73);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(floatArray31, floatArray41);
        float float85 = org.apache.commons.lang.math.NumberUtils.max(floatArray31);
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
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray46), "[0.0, 35.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray47), "[]");
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray51), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 100.0f + "'", float56 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 100.0f + "'", float58 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray59), "[]");
        org.junit.Assert.assertNotNull(floatArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray63), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray65), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(floatArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray71), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray73), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(floatArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray78), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + float81 + "' != '" + (-1.0f) + "'", float81 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + float85 + "' != '" + (-1.0f) + "'", float85 == (-1.0f));
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float[] floatArray10 = new float[] { 0, ' ', 100.0f };
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray10);
        float float12 = org.apache.commons.lang.math.NumberUtils.min(floatArray5);
        float float13 = org.apache.commons.lang.math.NumberUtils.max(floatArray5);
        float float14 = org.apache.commons.lang.math.NumberUtils.max(floatArray5);
        float[] floatArray18 = new float[] { 0, 1.0f, 100 };
        float[] floatArray20 = new float[] { (-1L) };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(floatArray18, floatArray20);
        float[] floatArray25 = new float[] { 0, ' ', 100.0f };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(floatArray20, floatArray25);
        float float27 = org.apache.commons.lang.math.NumberUtils.min(floatArray25);
        float float28 = org.apache.commons.lang.math.NumberUtils.min(floatArray25);
        float float29 = org.apache.commons.lang.math.NumberUtils.max(floatArray25);
        float[] floatArray33 = new float[] { 0, 1.0f, 100 };
        float[] floatArray35 = new float[] { (-1L) };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(floatArray33, floatArray35);
        float float37 = org.apache.commons.lang.math.NumberUtils.max(floatArray33);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(floatArray25, floatArray33);
        float float39 = org.apache.commons.lang.math.NumberUtils.max(floatArray33);
        float[] floatArray40 = new float[] {};
        float[] floatArray44 = new float[] { 0, 1.0f, 100 };
        float[] floatArray46 = new float[] { (-1L) };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(floatArray44, floatArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(floatArray40, floatArray44);
        float[] floatArray52 = new float[] { 0, 1.0f, 100 };
        float[] floatArray54 = new float[] { (-1L) };
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(floatArray52, floatArray54);
        float[] floatArray59 = new float[] { 0, ' ', 100.0f };
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(floatArray54, floatArray59);
        float float61 = org.apache.commons.lang.math.NumberUtils.min(floatArray54);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(floatArray44, floatArray54);
        float[] floatArray66 = new float[] { 0, 1.0f, 100 };
        float[] floatArray68 = new float[] { (-1L) };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(floatArray66, floatArray68);
        float[] floatArray73 = new float[] { 0, ' ', 100.0f };
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(floatArray68, floatArray73);
        float float75 = org.apache.commons.lang.math.NumberUtils.min(floatArray73);
        float float76 = org.apache.commons.lang.math.NumberUtils.min(floatArray73);
        float float77 = org.apache.commons.lang.math.NumberUtils.max(floatArray73);
        float[] floatArray81 = new float[] { 0, 1.0f, 100 };
        float[] floatArray83 = new float[] { (-1L) };
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(floatArray81, floatArray83);
        float float85 = org.apache.commons.lang.math.NumberUtils.max(floatArray81);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(floatArray73, floatArray81);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(floatArray54, floatArray81);
        float float88 = org.apache.commons.lang.math.NumberUtils.min(floatArray54);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(floatArray33, floatArray54);
        float float90 = org.apache.commons.lang.math.NumberUtils.min(floatArray54);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray54);
        float float92 = org.apache.commons.lang.math.NumberUtils.max(floatArray54);
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
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 100.0f + "'", float37 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 100.0f + "'", float39 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[]");
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray46), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray52), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(floatArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray59), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + (-1.0f) + "'", float61 == (-1.0f));
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
        org.junit.Assert.assertTrue("'" + float77 + "' != '" + 100.0f + "'", float77 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray81), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray83), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + float85 + "' != '" + 100.0f + "'", float85 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + float88 + "' != '" + (-1.0f) + "'", float88 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + float90 + "' != '" + (-1.0f) + "'", float90 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + float92 + "' != '" + (-1.0f) + "'", float92 == (-1.0f));
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
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
        double double37 = org.apache.commons.lang.math.NumberUtils.max(doubleArray2);
        double double38 = org.apache.commons.lang.math.NumberUtils.min(doubleArray2);
        double double39 = org.apache.commons.lang.math.NumberUtils.max(doubleArray2);
        double double40 = org.apache.commons.lang.math.NumberUtils.max(doubleArray2);
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
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) -1, 10, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 97, (double) 52.0f, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
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
        byte byte41 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte byte42 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte byte43 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte byte44 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte[] byteArray45 = null;
        byte[] byteArray52 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(byteArray45, byteArray52);
        byte byte54 = org.apache.commons.lang.math.NumberUtils.min(byteArray52);
        byte[] byteArray58 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte59 = org.apache.commons.lang.math.NumberUtils.max(byteArray58);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(byteArray52, byteArray58);
        byte[] byteArray61 = null;
        byte[] byteArray65 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte66 = org.apache.commons.lang.math.NumberUtils.max(byteArray65);
        byte[] byteArray67 = null;
        byte[] byteArray74 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(byteArray67, byteArray74);
        byte[] byteArray80 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(byteArray74, byteArray80);
        byte byte82 = org.apache.commons.lang.math.NumberUtils.max(byteArray74);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(byteArray65, byteArray74);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(byteArray61, byteArray74);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(byteArray52, byteArray61);
        byte byte86 = org.apache.commons.lang.math.NumberUtils.min(byteArray52);
        byte byte87 = org.apache.commons.lang.math.NumberUtils.min(byteArray52);
        byte byte88 = org.apache.commons.lang.math.NumberUtils.min(byteArray52);
        byte byte89 = org.apache.commons.lang.math.NumberUtils.max(byteArray52);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray52);
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
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) -1 + "'", byte41 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) -1 + "'", byte42 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) -1 + "'", byte43 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) -1 + "'", byte44 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + byte54 + "' != '" + (byte) -1 + "'", byte54 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte59 + "' != '" + (byte) 10 + "'", byte59 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
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
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + byte86 + "' != '" + (byte) -1 + "'", byte86 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte87 + "' != '" + (byte) -1 + "'", byte87 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte88 + "' != '" + (byte) -1 + "'", byte88 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte89 + "' != '" + (byte) 100 + "'", byte89 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 1L, 0.0d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(97, (int) (byte) 0, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 1, (double) (-1), (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
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
        double double82 = org.apache.commons.lang.math.NumberUtils.min(doubleArray62);
        double double83 = org.apache.commons.lang.math.NumberUtils.min(doubleArray62);
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
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 1.0d + "'", double82 == 1.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 1.0d + "'", double83 == 1.0d);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) '#', 35L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
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
        long long28 = org.apache.commons.lang.math.NumberUtils.max(longArray13);
        long long29 = org.apache.commons.lang.math.NumberUtils.min(longArray13);
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 52L + "'", long28 == 52L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) 10, (double) 32, 35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(100, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 32.0f, 35.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (-1L), (double) 35.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(10.0f, (float) (short) 0, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
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
        float float59 = org.apache.commons.lang.math.NumberUtils.min(floatArray5);
        float float60 = org.apache.commons.lang.math.NumberUtils.min(floatArray5);
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
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 0.0f + "'", float59 == 0.0f);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.0f + "'", float60 == 0.0f);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray13);
        byte byte16 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte byte17 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte byte18 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        byte byte19 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte byte20 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        byte[] byteArray21 = null;
        byte[] byteArray28 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray28);
        byte byte30 = org.apache.commons.lang.math.NumberUtils.min(byteArray28);
        byte byte31 = org.apache.commons.lang.math.NumberUtils.max(byteArray28);
        byte byte32 = org.apache.commons.lang.math.NumberUtils.max(byteArray28);
        byte[] byteArray33 = null;
        byte[] byteArray40 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(byteArray33, byteArray40);
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(byteArray40, byteArray46);
        byte byte48 = org.apache.commons.lang.math.NumberUtils.max(byteArray46);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(byteArray28, byteArray46);
        byte byte50 = org.apache.commons.lang.math.NumberUtils.max(byteArray28);
        byte byte51 = org.apache.commons.lang.math.NumberUtils.max(byteArray28);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray28);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -1 + "'", byte17 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 10 + "'", byte18 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) -1 + "'", byte19 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 10 + "'", byte20 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) -1 + "'", byte30 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 100 + "'", byte31 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 100 + "'", byte32 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + byte48 + "' != '" + (byte) 10 + "'", byte48 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) 100 + "'", byte50 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) 100 + "'", byte51 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) -1, (long) (short) 100, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) -1, (int) (short) 10, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
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
        long long52 = org.apache.commons.lang.math.NumberUtils.max(longArray48);
        long long53 = org.apache.commons.lang.math.NumberUtils.max(longArray48);
        long long54 = org.apache.commons.lang.math.NumberUtils.min(longArray48);
        long[] longArray58 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray59 = new long[] {};
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(longArray58, longArray59);
        long long61 = org.apache.commons.lang.math.NumberUtils.max(longArray58);
        long long62 = org.apache.commons.lang.math.NumberUtils.max(longArray58);
        long long63 = org.apache.commons.lang.math.NumberUtils.min(longArray58);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(longArray48, longArray58);
        long[] longArray68 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray69 = new long[] {};
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(longArray68, longArray69);
        long long71 = org.apache.commons.lang.math.NumberUtils.max(longArray68);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(longArray58, longArray68);
        long long73 = org.apache.commons.lang.math.NumberUtils.max(longArray58);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(longArray38, longArray58);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(longArray6, longArray38);
        long long76 = org.apache.commons.lang.math.NumberUtils.min(longArray38);
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
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 52L + "'", long52 == 52L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 52L + "'", long53 == 52L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 52L + "'", long61 == 52L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 52L + "'", long62 == 52L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-1L) + "'", long63 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 52L + "'", long71 == 52L);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 52L + "'", long73 == 52L);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + (-1L) + "'", long76 == (-1L));
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 1L, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 1, (double) 0, (double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(52.0d, (double) 32L, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 97.0f, (double) 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 100L, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
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
        byte byte41 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte byte42 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte byte43 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        java.lang.Class<?> wildcardClass44 = byteArray7.getClass();
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
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) -1 + "'", byte41 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) 100 + "'", byte42 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 100 + "'", byte43 == (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(35.0f, (float) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        int[] intArray5 = new int[] { (-1), (-1), 1, 52, ' ' };
        int int6 = org.apache.commons.lang.math.NumberUtils.min(intArray5);
        int int7 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        int int8 = org.apache.commons.lang.math.NumberUtils.min(intArray5);
        int[] intArray13 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray18 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray18);
        int int20 = org.apache.commons.lang.math.NumberUtils.max(intArray18);
        int int21 = org.apache.commons.lang.math.NumberUtils.max(intArray18);
        int[] intArray26 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray31 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(intArray26, intArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray26);
        int int34 = org.apache.commons.lang.math.NumberUtils.min(intArray26);
        int int35 = org.apache.commons.lang.math.NumberUtils.max(intArray26);
        int int36 = org.apache.commons.lang.math.NumberUtils.max(intArray26);
        int int37 = org.apache.commons.lang.math.NumberUtils.max(intArray26);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(intArray5, intArray26);
        int int39 = org.apache.commons.lang.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 1, 52, 32]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
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
        double double52 = org.apache.commons.lang.math.NumberUtils.min(doubleArray44);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray44);
        double double54 = org.apache.commons.lang.math.NumberUtils.max(doubleArray44);
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
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 100.0d + "'", double54 == 100.0d);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(1.0d, (double) (short) 0, (double) 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(10.0f, 10.0f, (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 1, (double) 97.0f, (double) 35);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(0L, 35L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 0, (double) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 100, (long) (short) 0, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
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
        byte[] byteArray56 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte57 = org.apache.commons.lang.math.NumberUtils.max(byteArray56);
        byte[] byteArray60 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(byteArray56, byteArray60);
        byte byte62 = org.apache.commons.lang.math.NumberUtils.max(byteArray56);
        byte[] byteArray66 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte67 = org.apache.commons.lang.math.NumberUtils.max(byteArray66);
        byte[] byteArray70 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(byteArray66, byteArray70);
        byte byte72 = org.apache.commons.lang.math.NumberUtils.max(byteArray66);
        byte byte73 = org.apache.commons.lang.math.NumberUtils.max(byteArray66);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(byteArray56, byteArray66);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(byteArray12, byteArray56);
        byte byte76 = org.apache.commons.lang.math.NumberUtils.min(byteArray12);
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
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte57 + "' != '" + (byte) 10 + "'", byte57 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + byte62 + "' != '" + (byte) 10 + "'", byte62 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) 10 + "'", byte67 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + byte72 + "' != '" + (byte) 10 + "'", byte72 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte73 + "' != '" + (byte) 10 + "'", byte73 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) -1 + "'", byte76 == (byte) -1);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(52, (int) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0d, (double) 32L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 1, (int) (short) 1, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 0, 100L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 10L, 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 100, 32.0d, 35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
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
        byte[] byteArray60 = null;
        byte[] byteArray67 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(byteArray60, byteArray67);
        byte byte69 = org.apache.commons.lang.math.NumberUtils.min(byteArray67);
        byte byte70 = org.apache.commons.lang.math.NumberUtils.max(byteArray67);
        byte byte71 = org.apache.commons.lang.math.NumberUtils.max(byteArray67);
        byte[] byteArray72 = null;
        byte[] byteArray79 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(byteArray72, byteArray79);
        byte[] byteArray85 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(byteArray79, byteArray85);
        byte byte87 = org.apache.commons.lang.math.NumberUtils.max(byteArray85);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(byteArray67, byteArray85);
        byte byte89 = org.apache.commons.lang.math.NumberUtils.max(byteArray67);
        byte byte90 = org.apache.commons.lang.math.NumberUtils.max(byteArray67);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(byteArray30, byteArray67);
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
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + byte69 + "' != '" + (byte) -1 + "'", byte69 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte70 + "' != '" + (byte) 100 + "'", byte70 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte71 + "' != '" + (byte) 100 + "'", byte71 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + byte87 + "' != '" + (byte) 10 + "'", byte87 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + byte89 + "' != '" + (byte) 100 + "'", byte89 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte90 + "' != '" + (byte) 100 + "'", byte90 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
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
        double[] doubleArray48 = new double[] { 100L, 1.0f };
        double[] doubleArray52 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray48, doubleArray52);
        double[] doubleArray56 = new double[] { 100L, 1.0f };
        double[] doubleArray60 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray56, doubleArray60);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray48, doubleArray56);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray35, doubleArray48);
        double double64 = org.apache.commons.lang.math.NumberUtils.max(doubleArray48);
        double double65 = org.apache.commons.lang.math.NumberUtils.max(doubleArray48);
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
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 100.0d + "'", double64 == 100.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
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
        long long52 = org.apache.commons.lang.math.NumberUtils.max(longArray48);
        long long53 = org.apache.commons.lang.math.NumberUtils.max(longArray48);
        long long54 = org.apache.commons.lang.math.NumberUtils.min(longArray48);
        long[] longArray58 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray59 = new long[] {};
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(longArray58, longArray59);
        long long61 = org.apache.commons.lang.math.NumberUtils.max(longArray58);
        long long62 = org.apache.commons.lang.math.NumberUtils.max(longArray58);
        long long63 = org.apache.commons.lang.math.NumberUtils.min(longArray58);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(longArray48, longArray58);
        long[] longArray68 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray69 = new long[] {};
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(longArray68, longArray69);
        long long71 = org.apache.commons.lang.math.NumberUtils.max(longArray68);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(longArray58, longArray68);
        long long73 = org.apache.commons.lang.math.NumberUtils.max(longArray58);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(longArray38, longArray58);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(longArray6, longArray38);
        long long76 = org.apache.commons.lang.math.NumberUtils.max(longArray38);
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
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 52L + "'", long52 == 52L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 52L + "'", long53 == 52L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 52L + "'", long61 == 52L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 52L + "'", long62 == 52L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-1L) + "'", long63 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 52L + "'", long71 == 52L);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 52L + "'", long73 == 52L);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 52L + "'", long76 == 52L);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) 1, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
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
        short short26 = org.apache.commons.lang.math.NumberUtils.min(shortArray4);
        short[] shortArray30 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short31 = org.apache.commons.lang.math.NumberUtils.max(shortArray30);
        short[] shortArray35 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(shortArray30, shortArray35);
        short[] shortArray39 = new short[] { (short) -1, (short) -1 };
        short short40 = org.apache.commons.lang.math.NumberUtils.min(shortArray39);
        short[] shortArray44 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short45 = org.apache.commons.lang.math.NumberUtils.max(shortArray44);
        short[] shortArray49 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(shortArray44, shortArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(shortArray39, shortArray44);
        short[] shortArray53 = new short[] { (short) 100 };
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(shortArray39, shortArray53);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(shortArray30, shortArray53);
        short short56 = org.apache.commons.lang.math.NumberUtils.max(shortArray30);
        short short57 = org.apache.commons.lang.math.NumberUtils.min(shortArray30);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray30);
        short[] shortArray60 = new short[] { (byte) 1 };
        short short61 = org.apache.commons.lang.math.NumberUtils.min(shortArray60);
        short[] shortArray63 = new short[] { (short) -1 };
        short short64 = org.apache.commons.lang.math.NumberUtils.max(shortArray63);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(shortArray60, shortArray63);
        short[] shortArray69 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short70 = org.apache.commons.lang.math.NumberUtils.max(shortArray69);
        short[] shortArray74 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(shortArray69, shortArray74);
        short short76 = org.apache.commons.lang.math.NumberUtils.min(shortArray69);
        short[] shortArray79 = new short[] { (short) -1, (short) -1 };
        short short80 = org.apache.commons.lang.math.NumberUtils.min(shortArray79);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(shortArray69, shortArray79);
        short short82 = org.apache.commons.lang.math.NumberUtils.max(shortArray79);
        short short83 = org.apache.commons.lang.math.NumberUtils.min(shortArray79);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(shortArray63, shortArray79);
        short short85 = org.apache.commons.lang.math.NumberUtils.min(shortArray79);
        short short86 = org.apache.commons.lang.math.NumberUtils.max(shortArray79);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray79);
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
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 10 + "'", short31 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short40 + "' != '" + (short) -1 + "'", short40 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray44), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short45 + "' != '" + (short) 10 + "'", short45 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray53), "[100]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + short56 + "' != '" + (short) 10 + "'", short56 == (short) 10);
        org.junit.Assert.assertTrue("'" + short57 + "' != '" + (short) 1 + "'", short57 == (short) 1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray60), "[1]");
        org.junit.Assert.assertTrue("'" + short61 + "' != '" + (short) 1 + "'", short61 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray63), "[-1]");
        org.junit.Assert.assertTrue("'" + short64 + "' != '" + (short) -1 + "'", short64 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(shortArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray69), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short70 + "' != '" + (short) 10 + "'", short70 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray74), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + short76 + "' != '" + (short) 1 + "'", short76 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray79), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short80 + "' != '" + (short) -1 + "'", short80 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + short82 + "' != '" + (short) -1 + "'", short82 == (short) -1);
        org.junit.Assert.assertTrue("'" + short83 + "' != '" + (short) -1 + "'", short83 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + short85 + "' != '" + (short) -1 + "'", short85 == (short) -1);
        org.junit.Assert.assertTrue("'" + short86 + "' != '" + (short) -1 + "'", short86 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) '#', (double) 1, (double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) -1, 0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) -1, (long) '#', (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
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
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(byteArray29, byteArray44);
        byte[] byteArray54 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte55 = org.apache.commons.lang.math.NumberUtils.max(byteArray54);
        byte[] byteArray58 = new byte[] { (byte) 100, (byte) 0 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(byteArray54, byteArray58);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(byteArray44, byteArray54);
        byte[] byteArray65 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte66 = org.apache.commons.lang.math.NumberUtils.max(byteArray65);
        byte byte67 = org.apache.commons.lang.math.NumberUtils.max(byteArray65);
        byte byte68 = org.apache.commons.lang.math.NumberUtils.min(byteArray65);
        byte byte69 = org.apache.commons.lang.math.NumberUtils.min(byteArray65);
        byte[] byteArray74 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte75 = org.apache.commons.lang.math.NumberUtils.max(byteArray74);
        byte byte76 = org.apache.commons.lang.math.NumberUtils.max(byteArray74);
        byte byte77 = org.apache.commons.lang.math.NumberUtils.min(byteArray74);
        byte byte78 = org.apache.commons.lang.math.NumberUtils.min(byteArray74);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(byteArray65, byteArray74);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(byteArray54, byteArray74);
        byte byte81 = org.apache.commons.lang.math.NumberUtils.min(byteArray74);
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
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte66 + "' != '" + (byte) 10 + "'", byte66 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) 10 + "'", byte67 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte68 + "' != '" + (byte) -1 + "'", byte68 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte69 + "' != '" + (byte) -1 + "'", byte69 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte75 + "' != '" + (byte) 10 + "'", byte75 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) 10 + "'", byte76 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte77 + "' != '" + (byte) -1 + "'", byte77 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte78 + "' != '" + (byte) -1 + "'", byte78 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + byte81 + "' != '" + (byte) -1 + "'", byte81 == (byte) -1);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        short[] shortArray0 = null;
        short[] shortArray4 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short5 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        short[] shortArray9 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray9);
        short short11 = org.apache.commons.lang.math.NumberUtils.min(shortArray4);
        short[] shortArray14 = new short[] { (short) -1, (short) -1 };
        short short15 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray14);
        short short17 = org.apache.commons.lang.math.NumberUtils.max(shortArray14);
        short short18 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
        short short19 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray14);
        short[] shortArray24 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short25 = org.apache.commons.lang.math.NumberUtils.max(shortArray24);
        short[] shortArray29 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(shortArray24, shortArray29);
        short[] shortArray33 = new short[] { (short) -1, (short) -1 };
        short short34 = org.apache.commons.lang.math.NumberUtils.min(shortArray33);
        short[] shortArray38 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short39 = org.apache.commons.lang.math.NumberUtils.max(shortArray38);
        short[] shortArray43 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(shortArray38, shortArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(shortArray33, shortArray38);
        short[] shortArray47 = new short[] { (short) 100 };
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(shortArray33, shortArray47);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(shortArray24, shortArray47);
        short[] shortArray52 = new short[] { (short) -1, (short) -1 };
        short short53 = org.apache.commons.lang.math.NumberUtils.min(shortArray52);
        short[] shortArray57 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short58 = org.apache.commons.lang.math.NumberUtils.max(shortArray57);
        short[] shortArray62 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(shortArray57, shortArray62);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(shortArray52, shortArray57);
        short[] shortArray66 = new short[] { (short) 100 };
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(shortArray52, shortArray66);
        short short68 = org.apache.commons.lang.math.NumberUtils.min(shortArray66);
        short short69 = org.apache.commons.lang.math.NumberUtils.max(shortArray66);
        short short70 = org.apache.commons.lang.math.NumberUtils.min(shortArray66);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(shortArray24, shortArray66);
        short short72 = org.apache.commons.lang.math.NumberUtils.min(shortArray66);
        short[] shortArray75 = new short[] { (short) -1, (short) -1 };
        short short76 = org.apache.commons.lang.math.NumberUtils.min(shortArray75);
        short[] shortArray80 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short81 = org.apache.commons.lang.math.NumberUtils.max(shortArray80);
        short[] shortArray85 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(shortArray80, shortArray85);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(shortArray75, shortArray80);
        short short88 = org.apache.commons.lang.math.NumberUtils.max(shortArray80);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(shortArray66, shortArray80);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray80);
        short short91 = org.apache.commons.lang.math.NumberUtils.max(shortArray80);
        short short92 = org.apache.commons.lang.math.NumberUtils.min(shortArray80);
        short short93 = org.apache.commons.lang.math.NumberUtils.min(shortArray80);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) -1 + "'", short15 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -1 + "'", short17 == (short) -1);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) -1 + "'", short18 == (short) -1);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) -1 + "'", short19 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 10 + "'", short25 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) -1 + "'", short34 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short39 + "' != '" + (short) 10 + "'", short39 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray43), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray47), "[100]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray52), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short53 + "' != '" + (short) -1 + "'", short53 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray57), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short58 + "' != '" + (short) 10 + "'", short58 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray62), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(shortArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray66), "[100]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + short68 + "' != '" + (short) 100 + "'", short68 == (short) 100);
        org.junit.Assert.assertTrue("'" + short69 + "' != '" + (short) 100 + "'", short69 == (short) 100);
        org.junit.Assert.assertTrue("'" + short70 + "' != '" + (short) 100 + "'", short70 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + short72 + "' != '" + (short) 100 + "'", short72 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray75), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + short76 + "' != '" + (short) -1 + "'", short76 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray80), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + short81 + "' != '" + (short) 10 + "'", short81 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray85), "[1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + short88 + "' != '" + (short) 10 + "'", short88 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + short91 + "' != '" + (short) 10 + "'", short91 == (short) 10);
        org.junit.Assert.assertTrue("'" + short92 + "' != '" + (short) 1 + "'", short92 == (short) 1);
        org.junit.Assert.assertTrue("'" + short93 + "' != '" + (short) 1 + "'", short93 == (short) 1);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(10.0f, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) (byte) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 97L, (double) 35L, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 32, (long) 52, (long) 52);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(100, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 1, 35, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 100, (int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 97.0f, (double) (byte) 0, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
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
        float float18 = org.apache.commons.lang.math.NumberUtils.max(floatArray5);
        float float19 = org.apache.commons.lang.math.NumberUtils.min(floatArray5);
        float float20 = org.apache.commons.lang.math.NumberUtils.min(floatArray5);
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
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-1.0f) + "'", float20 == (-1.0f));
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 'a', (double) 32L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.max(intArray4);
        int int12 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((-1L), (long) 35, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) (byte) 10, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 32.0f, (double) (-1), (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
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
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.lang.math.NumberUtils.max(intArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        double[] doubleArray1 = new double[] { '#' };
        double double2 = org.apache.commons.lang.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang.math.NumberUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang.math.NumberUtils.max(doubleArray1);
        java.lang.Class<?> wildcardClass5 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[35.0]");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) 0, (double) (byte) 0, (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 0L, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 100, (int) '4', 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        short[] shortArray4 = new short[] { (byte) -1, (short) 100, (byte) -1, (byte) -1 };
        short short5 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        short short6 = org.apache.commons.lang.math.NumberUtils.min(shortArray4);
        short short7 = org.apache.commons.lang.math.NumberUtils.min(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 100, -1, -1]");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
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
        int[] intArray30 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray35 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(intArray30, intArray35);
        int[] intArray41 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray46 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(intArray41, intArray46);
        int int48 = org.apache.commons.lang.math.NumberUtils.min(intArray46);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray46);
        int int50 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray35);
        int int52 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        int int53 = org.apache.commons.lang.math.NumberUtils.max(intArray35);
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
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
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
        long long22 = org.apache.commons.lang.math.NumberUtils.min(longArray14);
        long[] longArray26 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray27 = new long[] {};
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray26, longArray27);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray14, longArray27);
        long[] longArray34 = new long[] { 0L, 35, 32L, '#' };
        long[] longArray38 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray39 = new long[] {};
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(longArray38, longArray39);
        long long41 = org.apache.commons.lang.math.NumberUtils.max(longArray38);
        long long42 = org.apache.commons.lang.math.NumberUtils.max(longArray38);
        long long43 = org.apache.commons.lang.math.NumberUtils.max(longArray38);
        long long44 = org.apache.commons.lang.math.NumberUtils.min(longArray38);
        long[] longArray48 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray49 = new long[] {};
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(longArray48, longArray49);
        long long51 = org.apache.commons.lang.math.NumberUtils.max(longArray48);
        long long52 = org.apache.commons.lang.math.NumberUtils.max(longArray48);
        long long53 = org.apache.commons.lang.math.NumberUtils.min(longArray48);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(longArray38, longArray48);
        long[] longArray58 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray59 = new long[] {};
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(longArray58, longArray59);
        long long61 = org.apache.commons.lang.math.NumberUtils.max(longArray58);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(longArray48, longArray58);
        long[] longArray66 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray67 = new long[] {};
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(longArray66, longArray67);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(longArray58, longArray66);
        long long70 = org.apache.commons.lang.math.NumberUtils.min(longArray58);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(longArray34, longArray58);
        long[] longArray75 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray76 = new long[] {};
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(longArray75, longArray76);
        long long78 = org.apache.commons.lang.math.NumberUtils.max(longArray75);
        long long79 = org.apache.commons.lang.math.NumberUtils.max(longArray75);
        long long80 = org.apache.commons.lang.math.NumberUtils.max(longArray75);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(longArray58, longArray75);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(longArray14, longArray75);
        long long83 = org.apache.commons.lang.math.NumberUtils.min(longArray75);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[0, 35, 32, 35]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 52L + "'", long41 == 52L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 52L + "'", long42 == 52L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 52L + "'", long43 == 52L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 52L + "'", long51 == 52L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 52L + "'", long52 == 52L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 52L + "'", long61 == 52L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-1L) + "'", long70 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 52L + "'", long78 == 52L);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 52L + "'", long79 == 52L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 52L + "'", long80 == 52L);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + (-1L) + "'", long83 == (-1L));
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(100, (int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 35, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) (byte) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(10L, (long) '#', 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
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
        double double37 = org.apache.commons.lang.math.NumberUtils.max(doubleArray2);
        double double38 = org.apache.commons.lang.math.NumberUtils.max(doubleArray2);
        double double39 = org.apache.commons.lang.math.NumberUtils.max(doubleArray2);
        double double40 = org.apache.commons.lang.math.NumberUtils.min(doubleArray2);
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
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) (byte) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        long[] longArray0 = new long[] {};
        long[] longArray2 = new long[] { (byte) -1 };
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray2);
        long long4 = org.apache.commons.lang.math.NumberUtils.max(longArray2);
        long[] longArray9 = new long[] { 0, (short) 1, 52, (byte) 1 };
        long long10 = org.apache.commons.lang.math.NumberUtils.max(longArray9);
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray9);
        long[] longArray15 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray16 = new long[] {};
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(longArray15, longArray16);
        long long18 = org.apache.commons.lang.math.NumberUtils.min(longArray15);
        long long19 = org.apache.commons.lang.math.NumberUtils.min(longArray15);
        long[] longArray20 = new long[] {};
        long[] longArray22 = new long[] { (byte) -1 };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(longArray20, longArray22);
        long[] longArray24 = new long[] {};
        long[] longArray26 = new long[] { (byte) -1 };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(longArray24, longArray26);
        long long28 = org.apache.commons.lang.math.NumberUtils.max(longArray26);
        long long29 = org.apache.commons.lang.math.NumberUtils.max(longArray26);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(longArray22, longArray26);
        long[] longArray34 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray35 = new long[] {};
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(longArray34, longArray35);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(longArray26, longArray34);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(longArray15, longArray34);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray9, longArray34);
        long[] longArray40 = new long[] {};
        long[] longArray42 = new long[] { (byte) -1 };
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(longArray40, longArray42);
        long long44 = org.apache.commons.lang.math.NumberUtils.max(longArray42);
        long[] longArray47 = new long[] { 52L, (short) 1 };
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(longArray42, longArray47);
        long[] longArray49 = new long[] {};
        long[] longArray51 = new long[] { (byte) -1 };
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(longArray49, longArray51);
        long[] longArray53 = new long[] {};
        long[] longArray55 = new long[] { (byte) -1 };
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(longArray53, longArray55);
        long long57 = org.apache.commons.lang.math.NumberUtils.max(longArray55);
        long long58 = org.apache.commons.lang.math.NumberUtils.max(longArray55);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(longArray51, longArray55);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(longArray42, longArray55);
        long[] longArray64 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray65 = new long[] {};
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(longArray64, longArray65);
        long long67 = org.apache.commons.lang.math.NumberUtils.min(longArray64);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(longArray42, longArray64);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(longArray34, longArray42);
        long long70 = org.apache.commons.lang.math.NumberUtils.min(longArray42);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[0, 1, 52, 1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
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
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[]");
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L) + "'", long57 == (-1L));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-1L) + "'", long67 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-1L) + "'", long70 == (-1L));
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
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
        byte byte20 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
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
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) -1 + "'", byte20 == (byte) -1);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 97L, 0.0f, (float) 35);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        long[] longArray3 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray4 = new long[] {};
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long7 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long8 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long9 = org.apache.commons.lang.math.NumberUtils.min(longArray3);
        long long10 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long[] longArray15 = new long[] { 0L, 35, 32L, '#' };
        long[] longArray19 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray20 = new long[] {};
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(longArray19, longArray20);
        long long22 = org.apache.commons.lang.math.NumberUtils.max(longArray19);
        long long23 = org.apache.commons.lang.math.NumberUtils.max(longArray19);
        long long24 = org.apache.commons.lang.math.NumberUtils.max(longArray19);
        long long25 = org.apache.commons.lang.math.NumberUtils.min(longArray19);
        long[] longArray29 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray30 = new long[] {};
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(longArray29, longArray30);
        long long32 = org.apache.commons.lang.math.NumberUtils.max(longArray29);
        long long33 = org.apache.commons.lang.math.NumberUtils.max(longArray29);
        long long34 = org.apache.commons.lang.math.NumberUtils.min(longArray29);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(longArray19, longArray29);
        long[] longArray39 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray40 = new long[] {};
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(longArray39, longArray40);
        long long42 = org.apache.commons.lang.math.NumberUtils.max(longArray39);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(longArray29, longArray39);
        long[] longArray47 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray48 = new long[] {};
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(longArray47, longArray48);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(longArray39, longArray47);
        long long51 = org.apache.commons.lang.math.NumberUtils.min(longArray39);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(longArray15, longArray39);
        long long53 = org.apache.commons.lang.math.NumberUtils.max(longArray15);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray15);
        long long55 = org.apache.commons.lang.math.NumberUtils.min(longArray3);
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
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[0, 35, 32, 35]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 52L + "'", long22 == 52L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 52L + "'", long23 == 52L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 52L + "'", long24 == 52L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 52L + "'", long32 == 52L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 52L + "'", long33 == 52L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 52L + "'", long42 == 52L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 35L + "'", long53 == 35L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
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
        java.lang.Class<?> wildcardClass26 = shortArray20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(100, 97, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 'a', (float) '#', 97.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) -1, 97, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
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
        double double80 = org.apache.commons.lang.math.NumberUtils.min(doubleArray63);
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
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 1.0d + "'", double80 == 1.0d);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 97, (double) 35L, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 'a', 35.0f, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(52.0f, (float) (short) 0, (float) '4');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 1, (long) (short) 100, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) (byte) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) 10, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) '#', (float) (short) 10, (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", 35.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 1, (long) 0, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, (int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
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
        long long22 = org.apache.commons.lang.math.NumberUtils.min(longArray14);
        long[] longArray26 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray27 = new long[] {};
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray26, longArray27);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray14, longArray27);
        long long30 = org.apache.commons.lang.math.NumberUtils.min(longArray14);
        long long31 = org.apache.commons.lang.math.NumberUtils.max(longArray14);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 52L + "'", long31 == 52L);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 100, (double) 97L, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) -1, 52L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double[] doubleArray10 = new double[] { 100L, 1.0f };
        double[] doubleArray14 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray6, doubleArray10);
        double double17 = org.apache.commons.lang.math.NumberUtils.min(doubleArray6);
        double double18 = org.apache.commons.lang.math.NumberUtils.max(doubleArray6);
        double double19 = org.apache.commons.lang.math.NumberUtils.min(doubleArray6);
        double double20 = org.apache.commons.lang.math.NumberUtils.min(doubleArray6);
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        long[] longArray0 = new long[] {};
        long[] longArray2 = new long[] { (byte) -1 };
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray2);
        long[] longArray7 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray8 = new long[] {};
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray7, longArray8);
        long long10 = org.apache.commons.lang.math.NumberUtils.max(longArray7);
        long long11 = org.apache.commons.lang.math.NumberUtils.max(longArray7);
        long long12 = org.apache.commons.lang.math.NumberUtils.max(longArray7);
        long long13 = org.apache.commons.lang.math.NumberUtils.min(longArray7);
        long[] longArray17 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray18 = new long[] {};
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(longArray17, longArray18);
        long long20 = org.apache.commons.lang.math.NumberUtils.max(longArray17);
        long long21 = org.apache.commons.lang.math.NumberUtils.max(longArray17);
        long long22 = org.apache.commons.lang.math.NumberUtils.min(longArray17);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(longArray7, longArray17);
        long[] longArray27 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray28 = new long[] {};
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray27, longArray28);
        long long30 = org.apache.commons.lang.math.NumberUtils.max(longArray27);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(longArray17, longArray27);
        long[] longArray35 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray36 = new long[] {};
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(longArray35, longArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(longArray27, longArray35);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray27);
        long long40 = org.apache.commons.lang.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 52L + "'", long30 == 52L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
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
        int[] intArray58 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int59 = org.apache.commons.lang.math.NumberUtils.max(intArray58);
        int int60 = org.apache.commons.lang.math.NumberUtils.max(intArray58);
        int int61 = org.apache.commons.lang.math.NumberUtils.max(intArray58);
        int int62 = org.apache.commons.lang.math.NumberUtils.max(intArray58);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(intArray45, intArray58);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(intArray15, intArray45);
        int int65 = org.apache.commons.lang.math.NumberUtils.max(intArray15);
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
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 52 + "'", int65 == 52);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 32L, (double) 52L, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int int12 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int int13 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int[] intArray20 = new int[] { (short) 0, '4', (byte) 0, (short) 1, (short) 10, '#' };
        int int21 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
        int int22 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
        int[] intArray29 = new int[] { (short) 0, '4', (byte) 0, (short) 1, (short) 10, '#' };
        int int30 = org.apache.commons.lang.math.NumberUtils.min(intArray29);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(intArray20, intArray29);
        int[] intArray37 = new int[] { 100, (byte) 0, (-1), 1, (byte) 1 };
        int int38 = org.apache.commons.lang.math.NumberUtils.max(intArray37);
        int int39 = org.apache.commons.lang.math.NumberUtils.max(intArray37);
        int int40 = org.apache.commons.lang.math.NumberUtils.max(intArray37);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(intArray29, intArray37);
        int[] intArray46 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray51 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(intArray46, intArray51);
        int int53 = org.apache.commons.lang.math.NumberUtils.max(intArray51);
        int int54 = org.apache.commons.lang.math.NumberUtils.max(intArray51);
        int[] intArray59 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray64 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(intArray59, intArray64);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(intArray51, intArray59);
        int int67 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(intArray37, intArray59);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray59);
        int[] intArray74 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray79 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(intArray74, intArray79);
        int int81 = org.apache.commons.lang.math.NumberUtils.min(intArray79);
        int int82 = org.apache.commons.lang.math.NumberUtils.min(intArray79);
        int int83 = org.apache.commons.lang.math.NumberUtils.max(intArray79);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray79);
        int int85 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 52, 0, 1, 10, 35]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 52, 0, 1, 10, 35]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 100 + "'", int83 == 100);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) (byte) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        short[] shortArray2 = new short[] { (short) -1, (short) -1 };
        short short3 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
        short[] shortArray7 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short8 = org.apache.commons.lang.math.NumberUtils.max(shortArray7);
        short[] shortArray12 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray7, shortArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray7);
        short short15 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
        short short16 = org.apache.commons.lang.math.NumberUtils.max(shortArray2);
        short short17 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
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
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) -1 + "'", short15 == (short) -1);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -1 + "'", short17 == (short) -1);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(35, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) (byte) 100, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, 52, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) 1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        long[] longArray3 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray4 = new long[] {};
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long7 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long8 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long9 = org.apache.commons.lang.math.NumberUtils.min(longArray3);
        long long10 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long[] longArray15 = new long[] { 0L, 35, 32L, '#' };
        long[] longArray19 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray20 = new long[] {};
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(longArray19, longArray20);
        long long22 = org.apache.commons.lang.math.NumberUtils.max(longArray19);
        long long23 = org.apache.commons.lang.math.NumberUtils.max(longArray19);
        long long24 = org.apache.commons.lang.math.NumberUtils.max(longArray19);
        long long25 = org.apache.commons.lang.math.NumberUtils.min(longArray19);
        long[] longArray29 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray30 = new long[] {};
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(longArray29, longArray30);
        long long32 = org.apache.commons.lang.math.NumberUtils.max(longArray29);
        long long33 = org.apache.commons.lang.math.NumberUtils.max(longArray29);
        long long34 = org.apache.commons.lang.math.NumberUtils.min(longArray29);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(longArray19, longArray29);
        long[] longArray39 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray40 = new long[] {};
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(longArray39, longArray40);
        long long42 = org.apache.commons.lang.math.NumberUtils.max(longArray39);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(longArray29, longArray39);
        long[] longArray47 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray48 = new long[] {};
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(longArray47, longArray48);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(longArray39, longArray47);
        long long51 = org.apache.commons.lang.math.NumberUtils.min(longArray39);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(longArray15, longArray39);
        long long53 = org.apache.commons.lang.math.NumberUtils.max(longArray15);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray15);
        long long55 = org.apache.commons.lang.math.NumberUtils.max(longArray15);
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
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[0, 35, 32, 35]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 52L + "'", long22 == 52L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 52L + "'", long23 == 52L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 52L + "'", long24 == 52L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 52L + "'", long32 == 52L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 52L + "'", long33 == 52L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 52L + "'", long42 == 52L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 35L + "'", long53 == 35L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 35L + "'", long55 == 35L);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
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
        int[] intArray45 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray50 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(intArray45, intArray50);
        int int52 = org.apache.commons.lang.math.NumberUtils.max(intArray50);
        int int53 = org.apache.commons.lang.math.NumberUtils.max(intArray50);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(intArray22, intArray50);
        int int55 = org.apache.commons.lang.math.NumberUtils.max(intArray22);
        int int56 = org.apache.commons.lang.math.NumberUtils.min(intArray22);
        int int57 = org.apache.commons.lang.math.NumberUtils.min(intArray22);
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
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
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
        float float18 = org.apache.commons.lang.math.NumberUtils.max(floatArray5);
        java.lang.Class<?> wildcardClass19 = floatArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 0.0f, (double) 100, 52.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }
}

