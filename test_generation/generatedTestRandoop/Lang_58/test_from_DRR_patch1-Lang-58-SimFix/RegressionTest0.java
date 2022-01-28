import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        float float1 = org.apache.commons.lang.math.NumberUtils.toFloat("");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang.math.NumberUtils.createNumber("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 1, (float) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 100, (double) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang.math.NumberUtils.createDouble("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) -1, (long) 0, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (-1), (float) (byte) 0, (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 'a', 1.0f, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        int int1 = org.apache.commons.lang.math.NumberUtils.toInt("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((-1.0f), (float) 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 10.0f, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        long[] longArray0 = new long[] {};
        long[] longArray2 = new long[] { (byte) -1 };
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray2);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang.math.NumberUtils.createInteger("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length string");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 0, (long) 1, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang.math.NumberUtils.createLong("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang.math.NumberUtils.createFloat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang.math.NumberUtils.createInteger("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        double double1 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        long[] longArray3 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray4 = new long[] {};
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) ' ', (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        long[] longArray0 = new long[] {};
        long[] longArray2 = new long[] { (byte) -1 };
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray2);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang.math.NumberUtils.createLong("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((-1), (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) 10, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang.math.NumberUtils.createBigDecimal("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        long[] longArray0 = new long[] {};
        long[] longArray2 = new long[] { (byte) -1 };
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray2);
        java.lang.Class<?> wildcardClass4 = longArray0.getClass();
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 100, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            byte byte1 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 10, (long) ' ', (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        boolean boolean1 = org.apache.commons.lang.math.NumberUtils.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        int int1 = org.apache.commons.lang.math.NumberUtils.toInt("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        long long1 = org.apache.commons.lang.math.NumberUtils.toLong("");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 100, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(0.0d, (double) (-1L), (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang.math.NumberUtils.createFloat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        int int1 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (-1), 100.0f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) ' ', (long) '4', 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 0, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        boolean boolean1 = org.apache.commons.lang.math.NumberUtils.isDigits("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) ' ', (double) 52L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '4', (long) 100, 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) 0, 1.0d, (double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        float float1 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang.math.NumberUtils.createBigInteger("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 100L, (double) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1.0f, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 'a', (double) (byte) 10, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        short[] shortArray2 = new short[] { (short) -1, (short) -1 };
        short short3 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
        short[] shortArray7 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short8 = org.apache.commons.lang.math.NumberUtils.max(shortArray7);
        short[] shortArray12 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray7, shortArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray7);
        java.lang.Class<?> wildcardClass15 = shortArray7.getClass();
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
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) -1, (long) (-1), (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((-1.0d), (double) 35, (double) 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float[] floatArray10 = new float[] { 0, ' ', 100.0f };
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray10);
        java.lang.Class<?> wildcardClass12 = floatArray10.getClass();
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '#', 0L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 0, (float) 10, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 97.0f, (-1.0d));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (-1), 100.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        long[] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte byte1 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) ' ', (double) 97.0f, (double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) '#', (float) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 'a', (double) 100.0f, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        boolean boolean1 = org.apache.commons.lang.math.NumberUtils.isDigits("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(100.0d, 0.0d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        long long1 = org.apache.commons.lang.math.NumberUtils.toLong("hi!");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short1 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang.math.NumberUtils.createBigInteger("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 1.0f, (double) (-1.0f), (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((-1.0f), (float) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 10, (-1L), (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 0, (long) (byte) -1, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        double double1 = org.apache.commons.lang.math.NumberUtils.toDouble("");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 100, 97.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) 10, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((-1.0f), (float) 32, (float) 52L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 1L, (float) ' ', (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float1 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, 100, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 35, (long) (byte) 1, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 0L, 100.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(1.0f, (float) (short) 0, (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) 1, (float) 52L, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) (byte) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double[] doubleArray10 = new double[] { 100L, 1.0f };
        double[] doubleArray14 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray10);
        double double17 = org.apache.commons.lang.math.NumberUtils.max(doubleArray10);
        java.lang.Class<?> wildcardClass18 = doubleArray10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        boolean boolean1 = org.apache.commons.lang.math.NumberUtils.isNumber("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 32, 100.0f, (float) 32);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) 1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(0L, (long) ' ', (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) '#', 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(100.0d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        byte[] byteArray0 = null;
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte5 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte[] byteArray6 = null;
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(byteArray6, byteArray13);
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray19);
        byte byte21 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray13);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            byte byte24 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 100 + "'", byte21 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) 10, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        int[] intArray0 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang.math.NumberUtils.createBigDecimal("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        java.lang.Class<?> wildcardClass22 = floatArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 1.0f, (double) 10L, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) (byte) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) ' ', (float) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 10.0f, (double) 0.0f, 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 0L, 0.0d, (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        long[] longArray3 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray4 = new long[] {};
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 10, (long) (short) -1, 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(0.0f, 10.0f, (float) (-1));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) -1, 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float1 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 97.0f, (double) (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 32, (double) (-1L), (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float[] floatArray10 = new float[] { 0, ' ', 100.0f };
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray10);
        float float12 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        float float13 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        java.lang.Class<?> wildcardClass14 = floatArray10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) 10, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) 0, (float) (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang.math.NumberUtils.createNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (-1.0f), (double) (short) 0, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(10.0f, (float) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 100, (long) (byte) 10, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 0, (long) (short) 1, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) -1, 10, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) 10, (double) (short) 0, 32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 1, 0.0f, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 0, (long) '#', (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        int int1 = org.apache.commons.lang.math.NumberUtils.stringToInt("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(10.0f, (float) 35, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 0L, (float) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 100, (short) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) -1, (int) (short) 0, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte4 = org.apache.commons.lang.math.NumberUtils.max(byteArray3);
        byte[] byteArray5 = null;
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray12);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(byteArray12, byteArray18);
        byte byte20 = org.apache.commons.lang.math.NumberUtils.max(byteArray12);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(byteArray3, byteArray12);
        byte byte22 = org.apache.commons.lang.math.NumberUtils.min(byteArray12);
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
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 'a', (long) 1, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 100, (long) '#', (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 100, (int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 32, 100.0f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (-1), (long) (byte) 100, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) ' ', 100.0f, (float) 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        float[] floatArray3 = new float[] { 0, 1.0f, 100 };
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray5);
        float[] floatArray10 = new float[] { 0, 1.0f, 100 };
        float[] floatArray12 = new float[] { (-1L) };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray12);
        float float14 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray10);
        java.lang.Class<?> wildcardClass16 = floatArray5.getClass();
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
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        double double82 = org.apache.commons.lang.math.NumberUtils.max(doubleArray62);
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
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 100.0d + "'", double82 == 100.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 1.0d + "'", double83 == 1.0d);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 'a', (double) 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) (byte) 100, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 'a', (long) 100, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 0, (float) 35, (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 100, (float) 1, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 1, (long) (byte) -1, (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte byte1 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        java.lang.Class<?> wildcardClass25 = floatArray14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 10, (long) 'a', (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(1, (-1), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang.math.NumberUtils.createDouble("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 10, (long) 1, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(35L, (long) (byte) 0, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 0, 1.0f, (float) 35);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((-1), 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (-1.0f), (double) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) 1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 10, 0.0f, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 'a', (float) 1, (float) 'a');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 97, (long) '4', (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 0, (float) 0L, (float) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 100, (double) 32, (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) (byte) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 1, (int) '4', (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 1, (long) 1, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(0L, (long) 97, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 0, (long) 10, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte5 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte6 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        java.lang.Class<?> wildcardClass7 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 0, 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(100L, (long) 1, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) -1, 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 35, (long) (byte) -1, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(10.0f, 97.0f, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) 10, (float) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) (byte) -1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 32L, 10.0f, 100.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) -1, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) ' ', 97, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) 10, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
        java.lang.Class<?> wildcardClass19 = shortArray16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 1, (int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 100, (long) '4', 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(100.0f, (float) (short) -1, (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 32, 10.0f, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '#', (int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) '4', 97.0d, (double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (-1), 52L, 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 10, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 10, (float) 0L, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 32L, (double) 32L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) (byte) 1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        double double53 = org.apache.commons.lang.math.NumberUtils.max(doubleArray44);
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
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 100.0d + "'", double53 == 100.0d);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        short[] shortArray2 = new short[] { (short) -1, (short) -1 };
        short short3 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
        short[] shortArray7 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short8 = org.apache.commons.lang.math.NumberUtils.max(shortArray7);
        short[] shortArray12 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray7, shortArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray7);
        short[] shortArray16 = new short[] { (short) 100 };
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray16);
        java.lang.Class<?> wildcardClass18 = shortArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(100L, (long) (byte) 1, (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 100, (float) (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(1L, (-1L), 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", 97.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 1, (long) '4', (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(1.0f, 32.0f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(100.0d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) (byte) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) (byte) 10, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 10, (float) 97, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((-1L), (long) (short) 100, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) (byte) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 52, (long) 0, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 'a', 0.0d, (double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        int int12 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(1, (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) (byte) 100, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 10.0f, (double) ' ', (double) 32L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) (byte) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) '4', 100, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) -1, 35.0f, (float) '4');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) ' ', (int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(32.0f, (float) 0L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(32, 35, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) 0, (float) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) (byte) -1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 10, (long) 32, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(35, (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 100, 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 100.0f, (double) 1.0f, 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 52, (float) (short) -1, 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 100, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 100.0f, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 0L, (double) (byte) 0, (double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) (byte) 1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 1, (float) (-1), (float) 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 0L, (double) 32.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(52, (int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        long[] longArray3 = new long[] { ' ', '4', (byte) -1 };
        long[] longArray4 = new long[] {};
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long7 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        long long8 = org.apache.commons.lang.math.NumberUtils.min(longArray3);
        java.lang.Class<?> wildcardClass9 = longArray3.getClass();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) (byte) 10, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) 'a', 0, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 0, (long) (-1), (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        short[] shortArray3 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short4 = org.apache.commons.lang.math.NumberUtils.max(shortArray3);
        short[] shortArray8 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray8);
        short short10 = org.apache.commons.lang.math.NumberUtils.min(shortArray3);
        short[] shortArray13 = new short[] { (short) -1, (short) -1 };
        short short14 = org.apache.commons.lang.math.NumberUtils.min(shortArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray13);
        short short16 = org.apache.commons.lang.math.NumberUtils.max(shortArray13);
        short short17 = org.apache.commons.lang.math.NumberUtils.min(shortArray13);
        short short18 = org.apache.commons.lang.math.NumberUtils.min(shortArray13);
        java.lang.Class<?> wildcardClass19 = shortArray13.getClass();
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
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -1 + "'", short17 == (short) -1);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) -1 + "'", short18 == (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(0.0f, (float) '#', (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 1, (float) (short) 100, 35.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) ' ', (float) (short) 0, (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 32, (float) (short) -1, (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 32L, 52.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) (byte) -1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 10, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 52, 52L, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) -1, 10L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(1, 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        short[] shortArray1 = new short[] { (short) -1 };
        short short2 = org.apache.commons.lang.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang.math.NumberUtils.max(shortArray1);
        short short4 = org.apache.commons.lang.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        float float19 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
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
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(0.0d, (double) '4', (double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 52, 52.0f, (float) 52);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 32, 35L, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(10, 100, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) ' ', 32, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 100, 32.0f, (float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(35L, 0L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(52.0f, 10.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '#', 97, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) (byte) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) '#', (double) 35.0f, (double) 32L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 100, (float) 1, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(0L, (long) (byte) 0, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(32.0f, 0.0f, 32.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 0L, (float) (byte) 1, (float) 100L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 0L, (double) 52, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 32, (long) (short) 100, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        short[] shortArray3 = new short[] { (byte) 1, (byte) 1, (short) 10 };
        short short4 = org.apache.commons.lang.math.NumberUtils.max(shortArray3);
        short[] shortArray8 = new short[] { (byte) 1, (short) 10, (short) 10 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray8);
        short short10 = org.apache.commons.lang.math.NumberUtils.min(shortArray3);
        short[] shortArray13 = new short[] { (short) -1, (short) -1 };
        short short14 = org.apache.commons.lang.math.NumberUtils.min(shortArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray13);
        short short16 = org.apache.commons.lang.math.NumberUtils.max(shortArray13);
        short short17 = org.apache.commons.lang.math.NumberUtils.min(shortArray13);
        short short18 = org.apache.commons.lang.math.NumberUtils.min(shortArray13);
        short short19 = org.apache.commons.lang.math.NumberUtils.max(shortArray13);
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
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -1 + "'", short17 == (short) -1);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) -1 + "'", short18 == (short) -1);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) -1 + "'", short19 == (short) -1);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        java.lang.Class<?> wildcardClass41 = byteArray29.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(97.0f, 97.0f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(100, (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 52L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 100, (float) 100L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        java.lang.Class<?> wildcardClass18 = longArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (byte) 0, (double) ' ', (double) 35L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 100, (short) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 1, (float) 0L, (float) 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 32, (float) 32L, (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 1.0f, (double) 97, (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) -1, 32, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(97, 52, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) (byte) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) '4', (-1L), 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 35L, 0.0d, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 35, 32.0d, (double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 0, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 100, (double) (short) 100, 52.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) '#', (double) ' ', (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(100L, 1L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        double[] doubleArray2 = new double[] { 100L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray2, doubleArray6);
        double[] doubleArray10 = new double[] { 100L, 1.0f };
        double[] doubleArray14 = new double[] { (short) 100, 10.0f, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray10, doubleArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray6, doubleArray10);
        double double17 = org.apache.commons.lang.math.NumberUtils.min(doubleArray10);
        double double18 = org.apache.commons.lang.math.NumberUtils.min(doubleArray10);
        java.lang.Class<?> wildcardClass19 = doubleArray10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        float[] floatArray4 = new float[] { 0.0f, 35, (-1), 35 };
        float[] floatArray5 = new float[] {};
        float[] floatArray9 = new float[] { 0, 1.0f, 100 };
        float[] floatArray11 = new float[] { (-1L) };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray9);
        float float14 = org.apache.commons.lang.math.NumberUtils.max(floatArray9);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray9);
        java.lang.Class<?> wildcardClass16 = floatArray9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 35L, (float) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        java.lang.Class<?> wildcardClass53 = doubleArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) 'a', (int) 'a', 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 1L, (float) 52L, 100.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 0, (float) '4', (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) (byte) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 1, (int) (short) 0, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 1L, (float) 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte byte5 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte6 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte8 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte10 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        java.lang.Class<?> wildcardClass11 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 100, (short) 100, '#' };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        java.lang.Class<?> wildcardClass12 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 0L, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 'a', (-1.0f), (float) 35L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        float[] floatArray27 = new float[] { 0, 1.0f, 100 };
        float[] floatArray29 = new float[] { (-1L) };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(floatArray27, floatArray29);
        float[] floatArray34 = new float[] { 0, ' ', 100.0f };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(floatArray29, floatArray34);
        float float36 = org.apache.commons.lang.math.NumberUtils.min(floatArray34);
        float float37 = org.apache.commons.lang.math.NumberUtils.min(floatArray34);
        float float38 = org.apache.commons.lang.math.NumberUtils.max(floatArray34);
        float[] floatArray42 = new float[] { 0, 1.0f, 100 };
        float[] floatArray44 = new float[] { (-1L) };
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(floatArray42, floatArray44);
        float float46 = org.apache.commons.lang.math.NumberUtils.max(floatArray42);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(floatArray34, floatArray42);
        float float48 = org.apache.commons.lang.math.NumberUtils.max(floatArray42);
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
        float float70 = org.apache.commons.lang.math.NumberUtils.min(floatArray63);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(floatArray53, floatArray63);
        float[] floatArray75 = new float[] { 0, 1.0f, 100 };
        float[] floatArray77 = new float[] { (-1L) };
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(floatArray75, floatArray77);
        float[] floatArray82 = new float[] { 0, ' ', 100.0f };
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(floatArray77, floatArray82);
        float float84 = org.apache.commons.lang.math.NumberUtils.min(floatArray82);
        float float85 = org.apache.commons.lang.math.NumberUtils.min(floatArray82);
        float float86 = org.apache.commons.lang.math.NumberUtils.max(floatArray82);
        float[] floatArray90 = new float[] { 0, 1.0f, 100 };
        float[] floatArray92 = new float[] { (-1L) };
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(floatArray90, floatArray92);
        float float94 = org.apache.commons.lang.math.NumberUtils.max(floatArray90);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(floatArray82, floatArray90);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(floatArray63, floatArray90);
        float float97 = org.apache.commons.lang.math.NumberUtils.min(floatArray63);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(floatArray42, floatArray63);
        boolean boolean99 = org.apache.commons.lang.math.NumberUtils.equals(floatArray18, floatArray63);
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
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 100.0f + "'", float38 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray42), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 100.0f + "'", float46 == 100.0f);
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
        org.junit.Assert.assertNotNull(floatArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray61), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray63), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(floatArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray68), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + (-1.0f) + "'", float70 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(floatArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray75), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray77), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(floatArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray82), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + float84 + "' != '" + 0.0f + "'", float84 == 0.0f);
        org.junit.Assert.assertTrue("'" + float85 + "' != '" + 0.0f + "'", float85 == 0.0f);
        org.junit.Assert.assertTrue("'" + float86 + "' != '" + 100.0f + "'", float86 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray90), "[0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray92), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + float94 + "' != '" + 100.0f + "'", float94 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + float97 + "' != '" + (-1.0f) + "'", float97 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        byte byte4 = org.apache.commons.lang.math.NumberUtils.max(byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 10, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(32.0f, (float) 10L, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(35.0f, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(10.0f, (float) (-1L), 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(52, (int) ' ', 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(32L, (long) (byte) 10, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 10, (long) (-1), (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) 'a', (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) (byte) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0f, (float) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 52, 0L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 32, 0L, (long) 52);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 1, (double) (byte) 100, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 'a', (double) (short) -1, 52.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) 0, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (-1), (float) (byte) 100, (float) 32L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(0.0f, (float) (short) 0, (float) 52L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 1L, (float) (short) 10, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 32L, (double) '4', (double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 1L, (float) (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(52, (int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(10, (int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        java.lang.Class<?> wildcardClass38 = floatArray29.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) (byte) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 100, 1L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) '4', (double) (-1L), (double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) -1, (float) 32L, 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 100, (long) (byte) 100, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(52, 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 32, 1.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 35, (long) (byte) 0, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        java.lang.Class<?> wildcardClass29 = floatArray15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 100, 10.0f, 35.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) (byte) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 35L, (float) 10L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 100, (float) 10, (float) 35L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(35, 35, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 10, (long) 52, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        java.lang.Class<?> wildcardClass72 = doubleArray62.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(32, 52, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(100.0d, (double) 52, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }
}

