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
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9867717342662448d + "'", double1 == 1.9867717342662448d);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438014d) + "'", double1 == (-1.1752011936438014d));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-1.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (byte) 100, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681398d + "'", double1 == 0.5403023058681398d);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.00001f + "'", float1 == 100.00001f);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 1L, 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (byte) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (short) 100, 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.61512051684126d + "'", double1 == 4.61512051684126d);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        double double0 = org.apache.commons.math3.util.FastMath.random();
// flaky:         org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.8202965860187448d + "'", double0 == 0.8202965860187448d);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 10, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 100, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999999999999d + "'", double2 == 99.99999999999999d);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 'a', (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0051545022222d + "'", double2 == 97.0051545022222d);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 102400.0d + "'", double2 == 102400.0d);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (-1.0f), (double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        double double1 = org.apache.commons.math3.util.FastMath.floor(97.0051545022222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1023) + "'", int1 == (-1023));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.141592653589793d + "'", double1 == 3.141592653589793d);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.4359738E10f + "'", float2 == 3.4359738E10f);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 'a', (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        double double2 = org.apache.commons.math3.util.FastMath.max(Double.POSITIVE_INFINITY, (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(Double.POSITIVE_INFINITY, (int) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557649d + "'", double1 == 0.7615941559557649d);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (short) -1, (-2.0d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0000001f) + "'", float2 == (-1.0000001f));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.8202965860187448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.999532327864166d + "'", double1 == 46.999532327864166d);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) (byte) -1, 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.296908309475615d + "'", double2 == 3.296908309475615d);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.192092895507818E-7d + "'", double1 == 1.192092895507818E-7d);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        double double1 = org.apache.commons.math3.util.FastMath.log((-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 6);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 343.77467707849394d + "'", double1 == 343.77467707849394d);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.9867717342662448d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1.1920929E-7f, (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        double double0 = org.apache.commons.math3.util.FastMath.E;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 2.718281828459045d + "'", double0 == 2.718281828459045d);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 100, (-1023));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (short) 1, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.6268604078470186d) + "'", double1 == (-3.6268604078470186d));
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000001d + "'", double1 == 100.00000000000001d);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 0, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        float float1 = org.apache.commons.math3.util.FastMath.signum(3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.00001f + "'", float1 == 97.00001f);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        double double1 = org.apache.commons.math3.util.FastMath.cos(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876839d + "'", double1 == 0.8623188722876839d);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.99822295029797d + "'", double1 == 2.99822295029797d);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 100.0f, (double) (-1.0000001f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999999999999d + "'", double2 == 99.99999999999999d);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2710663101885897d + "'", double1 == 3.2710663101885897d);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 'a', (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9286112600478652d + "'", double1 == 0.9286112600478652d);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080487E43d + "'", double1 == 1.3440585709080487E43d);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17453292519943295d + "'", double1 == 0.17453292519943295d);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 97.00001f, 4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000000000000002d + "'", double2 == 1.000000000000002d);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 1, (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.61512051684126d, 97.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9913014866745806d + "'", double2 == 2.9913014866745806d);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974483d + "'", double1 == 0.7853981633974483d);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 1.1920929E-7f, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.986771734266245d + "'", double1 == 1.986771734266245d);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.986771734266245d, 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.986771734266245d + "'", double2 == 1.986771734266245d);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.049875621120892d + "'", double1 == 10.049875621120892d);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 35L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 1, 102400.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0000001f + "'", float2 == 1.0000001f);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 1L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5604874136486533d + "'", double1 == 1.5604874136486533d);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        double double2 = org.apache.commons.math3.util.FastMath.min(Double.NaN, 2.99822295029797d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        long long1 = org.apache.commons.math3.util.FastMath.abs(10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) ' ', (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.999999999999996d + "'", double2 == 31.999999999999996d);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) ' ', (double) (-1023));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1023.5003663897733d + "'", double2 == 1023.5003663897733d);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 100.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.00000038146972d + "'", double1 == 10.00000038146972d);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 10L, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6929693744344998d + "'", double1 == 1.6929693744344998d);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 3.4359738E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.435973836800001E10d + "'", double1 == 3.435973836800001E10d);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        int int1 = org.apache.commons.math3.util.FastMath.round((-1.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        double double0 = org.apache.commons.math3.util.FastMath.PI;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 3.141592653589793d + "'", double0 == 3.141592653589793d);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.29577951308232d) + "'", double1 == (-57.29577951308232d));
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.17453292519943295d, (-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17453292519943295d + "'", double2 == 0.17453292519943295d);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) (-1.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920928244535446E-7d + "'", double1 == 1.1920928244535446E-7d);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.605170185988092d + "'", double1 == 4.605170185988092d);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 10L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298292365610485d + "'", double1 == 5.298292365610485d);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(100.00001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 6);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(6.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10471975511965978d + "'", double1 == 0.10471975511965978d);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103323d + "'", double1 == 11013.232920103323d);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) -1, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2204460492503136E-16d + "'", double1 == 2.2204460492503136E-16d);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        int int1 = org.apache.commons.math3.util.FastMath.round(0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000004d + "'", double1 == 100.00000000000004d);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-3.6268604078470186d), (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.6268604078470186d) + "'", double2 == (-3.6268604078470186d));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) (-1.0000001f), (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.01428280342778d + "'", double2 == 35.01428280342778d);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (short) 1, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 35L, 97.00001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2.2204460492503136E-16d, 2.2204460492503136E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2204460492503136E-16d + "'", double2 == 2.2204460492503136E-16d);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) (-1), (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 97.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.6917246496340396E41d + "'", double1 == 6.6917246496340396E41d);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        double double1 = org.apache.commons.math3.util.FastMath.sin(100.00000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.506365641109722d) + "'", double1 == (-0.506365641109722d));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.000000000000002d, 2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.5604874136486533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.915499384730081d + "'", double1 == 0.915499384730081d);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.5403023058681398d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32768.0f + "'", float2 == 32768.0f);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5557.690612768985d + "'", double1 == 5557.690612768985d);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0000001f, (-57.29577951308232d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.473814720414451d + "'", double1 == 0.473814720414451d);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.000000000000002d, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.999999999999998d + "'", double2 == 0.999999999999998d);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(35.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.000004f + "'", float1 == 35.000004f);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.027415567780803774d) + "'", double1 == (-0.027415567780803774d));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5553480614894135d + "'", double1 == 3.5553480614894135d);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.5707963267948966d, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948968d + "'", double2 == 1.5707963267948968d);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        double double1 = org.apache.commons.math3.util.FastMath.signum(6.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 32768.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(4.61512051684126d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (short) 10, 35.000004f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 3.4359738E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.536049848239342d + "'", double1 == 10.536049848239342d);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (short) 1, 97.00001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        double double2 = org.apache.commons.math3.util.FastMath.log((-57.29577951308232d), 32.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308221d + "'", double1 == 57.29577951308221d);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (byte) 100, (-0.506365641109722d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09711106517907972d + "'", double2 == 0.09711106517907972d);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.99500000000002d + "'", double1 == 49.99500000000002d);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        double double1 = org.apache.commons.math3.util.FastMath.log(343.77467707849394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.839986434268865d + "'", double1 == 5.839986434268865d);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        long long1 = org.apache.commons.math3.util.FastMath.abs(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        double double1 = org.apache.commons.math3.util.FastMath.log10(5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.744894366675417d + "'", double1 == 3.744894366675417d);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, (int) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(5.839986434268865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 342.7746770784939d + "'", double1 == 342.7746770784939d);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        double double1 = org.apache.commons.math3.util.FastMath.sin(3.296908309475615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15469196324980172d) + "'", double1 == (-0.15469196324980172d));
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 6);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4917798526449118d + "'", double1 == 2.4917798526449118d);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 1.0000001f, (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000001192092896d + "'", double2 == 1.0000001192092896d);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4419647419307422d + "'", double1 == 1.4419647419307422d);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.059306170823243d + "'", double1 == 1.059306170823243d);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(100.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) (-1023));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1023.0d) + "'", double1 == (-1023.0d));
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.99822295029797d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453292519943295d + "'", double1 == 0.017453292519943295d);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(97.0f, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 'a', (double) (-1.0000001f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0000001192092896d) + "'", double2 == (-1.0000001192092896d));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.99822295029797d + "'", double1 == 2.99822295029797d);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.059306170823243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9226938919179323d + "'", double1 == 0.9226938919179323d);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 32768.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        double double1 = org.apache.commons.math3.util.FastMath.exp(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 101.00000000000003d + "'", double1 == 101.00000000000003d);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (short) -1, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0000001f + "'", float1 == 1.0000001f);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 100.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 0, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) (-1.0000001f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0174532946005379d) + "'", double1 == (-0.0174532946005379d));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438014d) + "'", double1 == (-1.1752011936438014d));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        double double1 = org.apache.commons.math3.util.FastMath.acos(3.296908309475615d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.1920929E-7f, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1920929E-7f + "'", float2 == 1.1920929E-7f);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        float float2 = org.apache.commons.math3.util.FastMath.min(35.000004f, 97.00001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.000004f + "'", float2 == 35.000004f);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.0000001192092896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.175201377593356d + "'", double1 == 1.175201377593356d);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(342.7746770784939d, 0.09711106517907972d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 342.77469083470083d + "'", double2 == 342.77469083470083d);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(46.999532327864166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8202965860187448d + "'", double1 == 0.8202965860187448d);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (-1.0000001f), (double) 35.000004f);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(3.4359738E10f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4096.0f + "'", float1 == 4096.0f);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.4917798526449118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6441739259957566d + "'", double1 == 1.6441739259957566d);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (byte) -1, 3.4359738E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.4359738E10f + "'", float2 == 3.4359738E10f);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.3440585709080487E43d, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0000001f + "'", float1 == 1.0000001f);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 3.4359738E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (short) 1, 2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.7615941559557649d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.4917798526449118d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (short) 1, 35.01428280342778d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.10471975511965978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4658842241887455d + "'", double1 == 1.4658842241887455d);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        int int1 = org.apache.commons.math3.util.FastMath.abs(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.718281828459045d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.1920928244535446E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920928244535474E-7d + "'", double1 == 1.1920928244535474E-7d);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        double double1 = org.apache.commons.math3.util.FastMath.abs(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.141592653589793d + "'", double1 == 3.141592653589793d);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(97.0051545022222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.726254890556496E41d + "'", double1 == 6.726254890556496E41d);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        int int2 = org.apache.commons.math3.util.FastMath.min(1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-1.5707963267948966d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.915499384730081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6499783639526059d + "'", double1 == 0.6499783639526059d);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.1920928244535474E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920928955078154E-7d + "'", double1 == 1.1920928955078154E-7d);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.718281828459045d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.718281828459045d + "'", double2 == 2.718281828459045d);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(31.999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134021E13d + "'", double1 == 3.948148009134021E13d);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 4096.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4096.0d + "'", double1 == 4096.0d);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 4096.0f, 0.9226938919179323d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2153.28968210235d + "'", double2 == 2153.28968210235d);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.027415567780803774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6912431464778742d) + "'", double1 == (-0.6912431464778742d));
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4210855E-14f + "'", float1 == 1.4210855E-14f);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (long) (-1023));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 97.00001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        int int2 = org.apache.commons.math3.util.FastMath.max((-1), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-1.0f), (float) 6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-1));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        double double1 = org.apache.commons.math3.util.FastMath.abs(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2710663101885897d + "'", double1 == 3.2710663101885897d);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        double double1 = org.apache.commons.math3.util.FastMath.rint(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 6);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.791759469228055d + "'", double1 == 1.791759469228055d);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        int int2 = org.apache.commons.math3.util.FastMath.max(97, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        double double1 = org.apache.commons.math3.util.FastMath.asin(57.29577951308221d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.0d, 3.948148009134021E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.948148009134021E13d + "'", double2 == 3.948148009134021E13d);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.154434690031884d + "'", double1 == 2.154434690031884d);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 'a', 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 1.0000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000001192092896d + "'", double1 == 1.0000001192092896d);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        int int1 = org.apache.commons.math3.util.FastMath.abs(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(3.2710663101885897d, 102400.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.27106631018859d + "'", double2 == 3.27106631018859d);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        double double1 = org.apache.commons.math3.util.FastMath.log10(3.744894366675417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5734395719374923d + "'", double1 == 0.5734395719374923d);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.989740156313126d) + "'", double1 == (-0.989740156313126d));
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.791759469228055d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 6, 0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.09275324764611881d) + "'", double2 == (-0.09275324764611881d));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(10.536049848239342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.536049848239344d + "'", double1 == 10.536049848239344d);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.718281828459045d, (-0.6912431464778742d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.04669075745245177d) + "'", double2 == (-0.04669075745245177d));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.1920928244535446E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000001192092896d + "'", double1 == 1.0000001192092896d);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.986771734266245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4095289050836257d + "'", double1 == 1.4095289050836257d);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.5734395719374923d, (double) 1.4210855E-14f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.336116942011905d + "'", double2 == 57.336116942011905d);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.6912431464778742d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.49904707604701226d) + "'", double1 == (-0.49904707604701226d));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(5.839986434268865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999830769532079d + "'", double1 == 0.9999830769532079d);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.9286112600478652d, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4643056300239326d + "'", double2 == 0.4643056300239326d);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        double double1 = org.apache.commons.math3.util.FastMath.sin(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9952731515503572d) + "'", double1 == (-0.9952731515503572d));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 97, 35.01428280342778d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.042848410283348d) + "'", double2 == (-8.042848410283348d));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(101.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5786.873730821316d + "'", double1 == 5786.873730821316d);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        float float1 = org.apache.commons.math3.util.FastMath.signum(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        int int2 = org.apache.commons.math3.util.FastMath.max(6, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        double double1 = org.apache.commons.math3.util.FastMath.log10(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.505149978319906d + "'", double1 == 1.505149978319906d);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-1.0d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(35.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.000008f + "'", float1 == 35.000008f);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 'a', (double) 97.00001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.00001f + "'", float2 == 97.00001f);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.09275324764611881d), 4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0927532476461188d) + "'", double2 == (-0.0927532476461188d));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.989740156313126d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3716732554246792d + "'", double1 == 0.3716732554246792d);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.5604874136486533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.04669075745245177d), 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04669075745245177d + "'", double2 == 0.04669075745245177d);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        double double1 = org.apache.commons.math3.util.FastMath.log(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-35.35050620855721d) + "'", double1 == (-35.35050620855721d));
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 3.4359738E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.95329850015803d + "'", double1 == 24.95329850015803d);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        double double1 = org.apache.commons.math3.util.FastMath.signum(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        float float1 = org.apache.commons.math3.util.FastMath.abs(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.059306170823243d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.9913014866745806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.141592653589793d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2.2204460492503136E-16d, (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.220446049250314E-16d + "'", double2 == 2.220446049250314E-16d);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5557.690612768985d + "'", double1 == 5557.690612768985d);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1023) + "'", int1 == (-1023));
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-2.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 35.000008f, 342.7746770784939d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.00000762939454d + "'", double2 == 35.00000762939454d);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999999d + "'", double1 == 0.9999999999999999d);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        int int2 = org.apache.commons.math3.util.FastMath.min((-1), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.5604874136486533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0272356433040997d + "'", double1 == 0.0272356433040997d);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        double double1 = org.apache.commons.math3.util.FastMath.rint(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 35L, 1.6929693744344998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 100.0f, (-0.04669075745245177d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999999999999d + "'", double2 == 99.99999999999999d);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.54992027339121d + "'", double1 == 74.54992027339121d);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        double double1 = org.apache.commons.math3.util.FastMath.log(6.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.791759469228055d + "'", double1 == 1.791759469228055d);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.916079783099616d + "'", double1 == 5.916079783099616d);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        double double2 = org.apache.commons.math3.util.FastMath.min(49.99500000000002d, 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 49.99500000000002d + "'", double2 == 49.99500000000002d);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.09275324764611881d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.314369626254345d) + "'", double1 == (-5.314369626254345d));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.6929693744344998d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        int int2 = org.apache.commons.math3.util.FastMath.min(10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4965075614664802d + "'", double1 == 3.4965075614664802d);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.00000000000001d + "'", double1 == 97.00000000000001d);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.4095289050836257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02460092029573991d + "'", double1 == 0.02460092029573991d);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        int int1 = org.apache.commons.math3.util.FastMath.abs(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6929693744344998d + "'", double1 == 1.6929693744344998d);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.2204460492503136E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2204460492503136E-16d + "'", double1 == 2.2204460492503136E-16d);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.9286112600478652d, (double) 6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-24.191690961245197d) + "'", double2 == (-24.191690961245197d));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.059306170823243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05761413798165514d + "'", double1 == 0.05761413798165514d);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        double double2 = org.apache.commons.math3.util.FastMath.max(342.7746770784939d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 342.7746770784939d + "'", double2 == 342.7746770784939d);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 10L, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10240.0f + "'", float2 == 10240.0f);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(4096.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796207585607d + "'", double1 == 1.570796207585607d);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        double double2 = org.apache.commons.math3.util.FastMath.log((-3.6268604078470186d), 0.4643056300239326d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.154434690031884d, 1.1920928955078154E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.154434690031884d + "'", double2 == 2.154434690031884d);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, 31.999999999999996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.644483341943245d + "'", double1 == 4.644483341943245d);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        float float1 = org.apache.commons.math3.util.FastMath.abs(3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.900849165587834d + "'", double1 == 1.900849165587834d);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.02460092029573991d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02460092029573991d + "'", double1 == 0.02460092029573991d);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        long long1 = org.apache.commons.math3.util.FastMath.round(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.6929693744344998d, (double) 1.4E-45f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        double double1 = org.apache.commons.math3.util.FastMath.exp(10.536049848239344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 37648.554832912145d + "'", double1 == 37648.554832912145d);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (byte) 100, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2105354941985667d + "'", double1 == 2.2105354941985667d);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(3.296908309475615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.028944477141252d + "'", double1 == 26.028944477141252d);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-1), (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        double double1 = org.apache.commons.math3.util.FastMath.floor(4096.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4096.0d + "'", double1 == 4096.0d);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.1920928955078154E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999929d + "'", double1 == 0.9999999999999929d);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5574077246549023d) + "'", double1 == (-1.5574077246549023d));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.15912713462618d + "'", double1 == 4.15912713462618d);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.4917798526449118d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        double double1 = org.apache.commons.math3.util.FastMath.sin(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1411200080598672d + "'", double1 == 0.1411200080598672d);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.0d + "'", double1 == 45.0d);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 35L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.5707963267948968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.00000000000001d + "'", double1 == 90.00000000000001d);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-1), (double) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.99999994f) + "'", float2 == (-0.99999994f));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 2L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.473814720414451d, 2.220446049250314E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.220446049250314E-16d + "'", double2 == 2.220446049250314E-16d);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.900849165587834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.23874681872885d + "'", double1 == 1.23874681872885d);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        int int2 = org.apache.commons.math3.util.FastMath.max((-1023), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        float float2 = org.apache.commons.math3.util.FastMath.max(10240.0f, (float) (-1023));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10240.0f + "'", float2 == 10240.0f);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        double double2 = org.apache.commons.math3.util.FastMath.max(6.726254890556496E41d, 0.0272356433040997d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.726254890556496E41d + "'", double2 == 6.726254890556496E41d);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267831587699267d + "'", double1 == 5.267831587699267d);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.3716732554246792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3802897750888419d + "'", double1 == 0.3802897750888419d);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-57.29577951308232d), (double) 1.4E-45f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-57.295779513082316d) + "'", double2 == (-57.295779513082316d));
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5874010519681996d + "'", double1 == 1.5874010519681996d);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 100, 1.4095289050836257d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 35.000004f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.192092895507818E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.192092895507821E-7d + "'", double1 == 1.192092895507821E-7d);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        double double2 = org.apache.commons.math3.util.FastMath.log(45.0d, 0.3802897750888419d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.25398147417648104d) + "'", double2 == (-0.25398147417648104d));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.9952731515503572d), (-57.295779513082316d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.30442320325666d + "'", double2 == 57.30442320325666d);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, 10.536049848239342d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.536049848239342d + "'", double2 == 10.536049848239342d);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.5707963267948968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.301298902307295d + "'", double1 == 2.301298902307295d);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(343.77467707849394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1023.5003663897733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        double double2 = org.apache.commons.math3.util.FastMath.pow(101.00000000000003d, (-0.25398147417648104d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.30969878586487914d + "'", double2 == 0.30969878586487914d);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.1920928244535446E-7d, 0.04669075745245177d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04669075745245177d + "'", double2 == 0.04669075745245177d);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5422326689561365d + "'", double1 == 1.5422326689561365d);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(10.049875621120892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17540341900446973d + "'", double1 == 0.17540341900446973d);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 35.000004f, (double) 6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8382668271306453E9d + "'", double2 == 1.8382668271306453E9d);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 4096.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) '4');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        double double1 = org.apache.commons.math3.util.FastMath.sin(10.049875621120892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5851764690934549d) + "'", double1 == (-0.5851764690934549d));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 97, 1.059306170823243d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 96.99999f + "'", float2 == 96.99999f);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.570796207585607d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        float float2 = org.apache.commons.math3.util.FastMath.max((-1.0f), (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-57.29577951308232d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(3.744894366675417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 214.56664193281875d + "'", double1 == 214.56664193281875d);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        double double2 = org.apache.commons.math3.util.FastMath.log(97.0d, (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5033290854469099d + "'", double2 == 0.5033290854469099d);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        double double1 = org.apache.commons.math3.util.FastMath.floor(5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-8.042848410283348d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.003564344806379d) + "'", double1 == (-2.003564344806379d));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.6929693744344998d, 35.01428280342778d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6929693744344998d + "'", double2 == 1.6929693744344998d);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0d, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        float float1 = org.apache.commons.math3.util.FastMath.abs(3.4359738E10f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.4359738E10f + "'", float1 == 3.4359738E10f);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 35.000004f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        double double1 = org.apache.commons.math3.util.FastMath.abs(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103323d + "'", double1 == 11013.232920103323d);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.145966026289347d + "'", double1 == 2.145966026289347d);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49361759023450513d + "'", double1 == 0.49361759023450513d);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(10.0d, 100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09966865249116201d + "'", double2 == 0.09966865249116201d);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.5474735E-13f + "'", float1 == 4.5474735E-13f);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-1L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(4096.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.0d + "'", double1 == 16.0d);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 4096.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.094947017729282E-13d + "'", double1 == 9.094947017729282E-13d);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681398d + "'", double1 == 0.5403023058681398d);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        double double1 = org.apache.commons.math3.util.FastMath.sin(57.29577951308221d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.679522618351296d + "'", double1 == 0.679522618351296d);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.49904707604701226d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49904707604701226d + "'", double1 == 0.49904707604701226d);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        double double1 = org.apache.commons.math3.util.FastMath.exp(5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) -1, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) 10, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        double double1 = org.apache.commons.math3.util.FastMath.floor(5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5557.0d + "'", double1 == 5557.0d);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.506365641109722d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008837747656336603d) + "'", double1 == (-0.008837747656336603d));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.0174532946005379d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(10.00000038146972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.237121318984d + "'", double1 == 11013.237121318984d);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        int int2 = org.apache.commons.math3.util.FastMath.max(1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-3.6268604078470186d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6268604078470186d + "'", double1 == 3.6268604078470186d);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.5851764690934549d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8364287485695048d) + "'", double1 == (-0.8364287485695048d));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998000199980002d + "'", double1 == 0.9998000199980002d);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(3.4965075614664802d, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3580.4237429416758d + "'", double2 == 3580.4237429416758d);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(32.0d, 3.435973836800001E10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.313225746154783E-10d + "'", double2 == 9.313225746154783E-10d);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.1920928955078154E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920928955078125E-7d + "'", double1 == 1.1920928955078125E-7d);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 4.5474735E-13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.547473508864641E-13d + "'", double1 == 4.547473508864641E-13d);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1023.5003663897733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1024.0d + "'", double1 == 1024.0d);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308232d + "'", double1 == 57.29577951308232d);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (-0.99999994f), 10.049875621120892d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.0927532476461188d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0885816328207447d) + "'", double1 == (-0.0885816328207447d));
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.3440585709080487E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (short) -1, (-0.49904707604701226d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.99999994f) + "'", float2 == (-0.99999994f));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(342.77469083470083d, 5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 342.7746908347008d + "'", double2 == 342.7746908347008d);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) '#', (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(49.99500000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.60497014597542d + "'", double1 == 4.60497014597542d);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (-1L), (double) 96.99999f);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.8202965860187448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7313481348387146d + "'", double1 == 0.7313481348387146d);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.418539921951662d) + "'", double1 == (-5.418539921951662d));
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 4.5474735E-13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.04669075745245177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04669075745245178d + "'", double1 == 0.04669075745245178d);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.1920929E-7f, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1920929E-7f + "'", float2 == 1.1920929E-7f);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.047442967903742035d + "'", double1 == 0.047442967903742035d);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-1.5574077246549023d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        double double1 = org.apache.commons.math3.util.FastMath.log10(3.27106631018859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5146893481167586d + "'", double1 == 0.5146893481167586d);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(3.435973836800001E10d, 0.5146893481167586d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.435973836800001E10d + "'", double2 == 3.435973836800001E10d);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) -1, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (short) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017455064928217585d + "'", double1 == 0.017455064928217585d);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.301298902307295d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.9999999999999929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999977d + "'", double1 == 0.9999999999999977d);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(57.29577951308232d, (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.58037251265019648E17d + "'", double2 == 2.58037251265019648E17d);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.9952731515503572d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.4643056300239326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1097402702744097d + "'", double1 == 1.1097402702744097d);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        double double1 = org.apache.commons.math3.util.FastMath.cos(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9036922050915067d) + "'", double1 == (-0.9036922050915067d));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.220446049250314E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948963d + "'", double1 == 1.5707963267948963d);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        double double1 = org.apache.commons.math3.util.FastMath.log(10.00000038146972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.302585131141017d + "'", double1 == 2.302585131141017d);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017453292519943295d) + "'", double1 == (-0.017453292519943295d));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(4096.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.318010277546872d + "'", double1 == 8.318010277546872d);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.1411200080598672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5206304090742055d + "'", double1 == 0.5206304090742055d);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        int int2 = org.apache.commons.math3.util.FastMath.min(97, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.09966865249116201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0017395461469968258d + "'", double1 == 0.0017395461469968258d);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.7313481348387146d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 41.90316148102299d + "'", double1 == 41.90316148102299d);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(343.77467707849394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.53313149942335d + "'", double1 == 6.53313149942335d);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (byte) 1, (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 6);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 403.4287934927351d + "'", double1 == 403.4287934927351d);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(35.000008f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.4095289050836257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(35.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.5403023058681398d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(90.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.102016471589291E38d + "'", double1 == 6.102016471589291E38d);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-0.99999994f), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2676505E30f) + "'", float2 == (-1.2676505E30f));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.3802897750888419d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3802897750888419d + "'", double2 == 0.3802897750888419d);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.4643056300239326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.33319605018370174d) + "'", double1 == (-0.33319605018370174d));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5874010519681996d, 5786.873730821316d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(4.440892098500626E-16d, 5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.990534932436728E-20d + "'", double2 == 7.990534932436728E-20d);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        double double2 = org.apache.commons.math3.util.FastMath.min(41.90316148102299d, 4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.15912713462618d + "'", double2 == 4.15912713462618d);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        float float2 = org.apache.commons.math3.util.FastMath.min((-0.99999994f), 4096.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.99999994f) + "'", float2 == (-0.99999994f));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(6.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 343.77467707849394d + "'", double1 == 343.77467707849394d);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (short) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-5.314369626254345d), 0.5206304090742055d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4731414029041368d) + "'", double2 == (-1.4731414029041368d));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.23874681872885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1129900353232502d + "'", double1 == 1.1129900353232502d);
    }
}
