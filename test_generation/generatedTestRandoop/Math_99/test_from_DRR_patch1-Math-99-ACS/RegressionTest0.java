import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (short) 10, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(100L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 1, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-51L) + "'", long2 == (-51L));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3628800.0d + "'", double1 == 3628800.0d);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        double double0 = org.apache.commons.math.util.MathUtils.SAFE_MIN;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 2.2250738585072014E-308d + "'", double0 == 2.2250738585072014E-308d);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (short) -1, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        int int1 = org.apache.commons.math.util.MathUtils.hash(100.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1079574528 + "'", int1 == 1079574528);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (short) 1, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 152 + "'", int2 == 152);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) (-1989683041));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (-1), (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        double double0 = org.apache.commons.math.util.MathUtils.EPSILON;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.1102230246251565E-16d + "'", double0 == 1.1102230246251565E-16d);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (-51L), 152);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-51.0d) + "'", double2 == (-51.0d));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        double double2 = org.apache.commons.math.util.MathUtils.log(3628800.0d, (double) 152);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3326101228062078d + "'", double2 == 0.3326101228062078d);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((-2L), (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((-51.0d), (double) 152, (double) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        float float2 = org.apache.commons.math.util.MathUtils.round(1.0f, (int) 'a');
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (short) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 8L, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(100.0d, (double) (short) 100, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 0.0f, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 1, (double) (short) 10, (double) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) (byte) 0, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((-2L), 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 0, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter(3628800.0d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3628799.9999999995d + "'", double2 == 3628799.9999999995d);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (-51L), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-51.0d) + "'", double2 == (-51.0d));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) (short) 10, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 152, 0.0d, (double) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) (short) 0, 1079574528);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(100L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 101L + "'", long2 == 101L);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 152, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 152.0f + "'", float2 == 152.0f);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (short) 1, (double) (-1989683041));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999999999d + "'", double2 == 0.9999999999999999d);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(152, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(0L, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) (-1989683041), 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (short) -1, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 1079574528, (double) 101L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0795745279999998E9d + "'", double2 == 1.0795745279999998E9d);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(1079574528);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 152, 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 152.0f + "'", float2 == 152.0f);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        int int1 = org.apache.commons.math.util.MathUtils.sign(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) (byte) 0, 99, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 152.0f, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 152.00000000000003d + "'", double2 == 152.00000000000003d);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 1, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (byte) 10, (-1989683041));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) ' ', (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        long long1 = org.apache.commons.math.util.MathUtils.factorial((int) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3628800L + "'", long1 == 3628800L);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 1079574528, (long) 1079574528);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1165481161506422784L + "'", long2 == 1165481161506422784L);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 0L, (double) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        float float1 = org.apache.commons.math.util.MathUtils.sign(152.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 99, 152);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.651900863115601E47d + "'", double2 == 5.651900863115601E47d);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (-3L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1073217536) + "'", int1 == (-1073217536));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 10, (double) (-1L));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 1165481161506422784L, (double) 99);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 1L, 0.3326101228062078d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (short) 0, (-1978525823));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(152.00000000000003d, 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2035526276899589d + "'", double2 == 1.2035526276899589d);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        float float1 = org.apache.commons.math.util.MathUtils.indicator(1.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        double[] doubleArray2 = new double[] { 1, 1.0d };
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-33553471) + "'", int3 == (-33553471));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(100, (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) (byte) 100, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        int int1 = org.apache.commons.math.util.MathUtils.sign((-1073217536));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 152, (double) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.61947916358787d + "'", double2 == 32.61947916358787d);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1079574528 + "'", int1 == 1079574528);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        int int1 = org.apache.commons.math.util.MathUtils.hash(Double.NaN);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2146959360 + "'", int1 == 2146959360);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((-1.0d), 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2676506002282294E30d) + "'", double2 == (-1.2676506002282294E30d));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300 + "'", int2 == 1300);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(Double.NaN, (double) 10.0f, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 1300, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        double double3 = org.apache.commons.math.util.MathUtils.round(3628800.0d, 1300, 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3628800.0d + "'", double3 == 3628800.0d);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(1.2035526276899589d, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2035526276899589d + "'", double2 == 1.2035526276899589d);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        float float3 = org.apache.commons.math.util.MathUtils.round((float) 1300, 100, 1);
        org.junit.Assert.assertTrue(Float.isNaN(float3));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) '#', (double) (-1073217536));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 34.99999999999999d + "'", double2 == 34.99999999999999d);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) -1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -1 + "'", byte1 == (byte) -1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        double[] doubleArray5 = new double[] { '4', (-1.0f), (-1.0d), 1, 100.0d };
        int int6 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1989683041) + "'", int6 == (-1989683041));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        long long1 = org.apache.commons.math.util.MathUtils.indicator(100L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((-51.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 2146959360, (long) (-1989683041));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 157276319L + "'", long2 == 157276319L);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) (-33553471), 1079574528, (-1073217536));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((-1989683041));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        long long1 = org.apache.commons.math.util.MathUtils.factorial(0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        int int1 = org.apache.commons.math.util.MathUtils.hash(32.61947916358787d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1469995939 + "'", int1 == 1469995939);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        double double3 = org.apache.commons.math.util.MathUtils.round((double) 8L, (int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.0d + "'", double3 == 8.0d);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (-1989683041), (double) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        int int1 = org.apache.commons.math.util.MathUtils.sign(2146959360);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(100.0d, 32.61947916358787d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.88496162102456d + "'", double2 == 30.88496162102456d);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 152, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (byte) 1, (-1989683041));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        double[] doubleArray4 = new double[] { 2.2250738585072014E-308d, 1L, 0.0f, 10L };
        int int5 = org.apache.commons.math.util.MathUtils.hash(doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[2.2250738585072014E-308, 1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1978525823) + "'", int5 == (-1978525823));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 1300, (int) 'a', 152);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1469995939, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-52) + "'", int2 == (-52));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) (short) 10, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1000 + "'", int2 == 1000);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (byte) 1, (-1073217536));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) -1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -1 + "'", byte1 == (byte) -1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        double double2 = org.apache.commons.math.util.MathUtils.round(100.0d, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.104412573075516d + "'", double1 == 15.104412573075516d);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((-33553471));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 2, 1300, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.0d, 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.566370614359172d + "'", double2 == 12.566370614359172d);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(8.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1490.4788257895502d + "'", double1 == 1490.4788257895502d);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        float float1 = org.apache.commons.math.util.MathUtils.sign(100.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 1L, (double) 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((-1.0d), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        double[] doubleArray5 = new double[] { '4', (-1.0f), (-1.0d), 1, 100.0d };
        int int6 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        int int7 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1989683041) + "'", int6 == (-1989683041));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1989683041) + "'", int7 == (-1989683041));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        long long1 = org.apache.commons.math.util.MathUtils.indicator(101L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 1300, 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1300.0d + "'", double2 == 1300.0d);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1L), (long) 2146959360);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2146959361L) + "'", long2 == (-2146959361L));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (short) 10, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 1165481161506422784L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(99, (-52));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5148 + "'", int2 == 5148);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(0.3326101228062078d, (-1.2676506002282294E30d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 1165481161506422784L, 1490.4788257895502d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.16548116150642253E18d + "'", double2 == 1.16548116150642253E18d);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(0.0d, (double) (-1L), 1300.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(152.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.149099138580642E65d + "'", double1 == 5.149099138580642E65d);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        long long1 = org.apache.commons.math.util.MathUtils.sign(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 97);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        float float1 = org.apache.commons.math.util.MathUtils.indicator(10.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(12.566370614359172d, (double) 157276319L, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (short) 100, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(12.566370614359172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 143375.65657007025d + "'", double1 == 143375.65657007025d);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3628800.0d + "'", double1 == 3628800.0d);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) (byte) 10, (-1978525823));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (byte) 1, (-1073217536));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(2146959360, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(10.0d, (double) 2146959360, (double) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 1300, (double) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 92.13617560368711d + "'", double1 == 92.13617560368711d);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (-1978525823));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        double double1 = org.apache.commons.math.util.MathUtils.sign(143375.65657007025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 9700, 0.3326101228062078d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.11991269359432755d) + "'", double2 == (-0.11991269359432755d));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (short) -1, (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(99, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.486940148245216d + "'", double2 == 8.486940148245216d);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-1L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((-52));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-1073217536));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        long long1 = org.apache.commons.math.util.MathUtils.factorial(10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3628800L + "'", long1 == 3628800L);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(101L, (long) 2146959360);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2146959461L + "'", long2 == 2146959461L);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 0, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(100L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 200L + "'", long2 == 200L);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (byte) 10, (double) (-1978525823));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.9785258207571552E9d) + "'", double2 == (-1.9785258207571552E9d));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 1L, 5.149099138580642E65d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(97, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 1, 9700);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(3628800.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 0.0f, (double) 1165481161506422784L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 99, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 98.99999999999999d + "'", double2 == 98.99999999999999d);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        int int1 = org.apache.commons.math.util.MathUtils.sign(1000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((-1.9785258207571552E9d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(3628799.9999999995d, (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.4086791132576764d) + "'", double2 == (-3.4086791132576764d));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 1300, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1300.0f + "'", float2 == 1300.0f);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialLog((-33553471));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n > 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 10);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        long long1 = org.apache.commons.math.util.MathUtils.indicator(10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) Float.NaN, (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) '#', (double) 9700);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5819922566585003d + "'", double2 == 2.5819922566585003d);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((-1978525823));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        double double1 = org.apache.commons.math.util.MathUtils.sign(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(1079574528);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 1165481161506422784L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) (byte) 10, 9700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 1079574528, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 107957452800L + "'", long2 == 107957452800L);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 1300);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 1.0f, (double) (-33553471), 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        double double2 = org.apache.commons.math.util.MathUtils.round((-1.2676506002282294E30d), 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2676506002282294E30d) + "'", double2 == (-1.2676506002282294E30d));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        double double1 = org.apache.commons.math.util.MathUtils.sign((-3.4086791132576764d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) (-1073217536), (double) 8L, (double) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) '#', 9700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 1165481161506422784L, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.16548116150642278E18d + "'", double2 == 1.16548116150642278E18d);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(101L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 133L + "'", long2 == 133L);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        int int1 = org.apache.commons.math.util.MathUtils.sign(5148);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) (byte) 100, 9700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 200L, 10.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 1, (long) (-52));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-51L) + "'", long2 == (-51L));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        long long1 = org.apache.commons.math.util.MathUtils.factorial((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) 'a', 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 1165481161506422784L, 0, (-52));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (-2L), (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.9999999999999998d) + "'", double2 == (-1.9999999999999998d));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        int int1 = org.apache.commons.math.util.MathUtils.sign((-1989683041));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) (-1073217536));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        double[] doubleArray3 = new double[] { (-1.0f), (-2L), 0 };
        double[] doubleArray9 = new double[] { 10.0f, (-1.2676506002282294E30d), (byte) 1, 5.149099138580642E65d, 30.88496162102456d };
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray3, doubleArray9);
        double[] doubleArray15 = new double[] { 2.2250738585072014E-308d, 1L, 0.0f, 10L };
        int int16 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        boolean boolean17 = org.apache.commons.math.util.MathUtils.equals(doubleArray3, doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, -2.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, -1.2676506002282294E30, 1.0, 5.149099138580642E65, 30.88496162102456]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[2.2250738585072014E-308, 1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1978525823) + "'", int16 == (-1978525823));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(1079574528);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (-33553471), (long) (-1073217536));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36010173470867456L + "'", long2 == 36010173470867456L);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(2, (-1978525823));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1978525821) + "'", int2 == (-1978525821));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (-3L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (-33553471), (long) (-52));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1744780492L + "'", long2 == 1744780492L);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3200 + "'", int2 == 3200);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(8L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 776L + "'", long2 == 776L);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(0, 5148);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) (byte) 1, 12.566370614359172d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        int int1 = org.apache.commons.math.util.MathUtils.hash((-1.0d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1074790400) + "'", int1 == (-1074790400));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) (-3L), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.802951800684688E30d) + "'", double2 == (-3.802951800684688E30d));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(1.1102230246251565E-16d, 1300);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.498484069478155E-242d) + "'", double2 == (-7.498484069478155E-242d));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(3628799.9999999995d, (double) 107957452800L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0795745279828792E11d + "'", double2 == 1.0795745279828792E11d);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((-1073217536), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (-1978525823), (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1978525791L) + "'", long2 == (-1978525791L));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(8.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1490.479161252178d + "'", double1 == 1490.479161252178d);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(100.0d, (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5309649148733797d) + "'", double2 == (-0.5309649148733797d));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        double[] doubleArray5 = new double[] { '4', (-1.0f), (-1.0d), 1, 100.0d };
        int int6 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        double[] doubleArray12 = new double[] { '4', (-1.0f), (-1.0d), 1, 100.0d };
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        int int14 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        int int15 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        boolean boolean16 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray12);
        java.lang.Class<?> wildcardClass17 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1989683041) + "'", int6 == (-1989683041));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[52.0, -1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1989683041) + "'", int13 == (-1989683041));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1989683041) + "'", int14 == (-1989683041));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1989683041) + "'", int15 == (-1989683041));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.round(1.16548116150642278E18d, 2146959360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }
}

