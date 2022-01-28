import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        double double1 = org.apache.commons.math3.util.FastMath.atan(3.8146899896673862E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.814689989648883E-6d + "'", double1 == 3.814689989648883E-6d);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.004363323650134475d), (-0.032426843737390965d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03271908904668641d + "'", double2 == 0.03271908904668641d);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(3.136179572894461E74d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 171.53430224417298d + "'", double1 == 171.53430224417298d);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1429.7186889891823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9570832444155108d) + "'", double1 == (-0.9570832444155108d));
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        long long2 = org.apache.commons.math3.util.FastMath.max(40L, (-4503599627370496L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 40L + "'", long2 == 40L);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-97.00337450631281d), 0.04647454434494028d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.00337450631281d + "'", double2 == 97.00337450631281d);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        float float2 = org.apache.commons.math3.util.FastMath.max(126.99999f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 126.99999f + "'", float2 == 126.99999f);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.8203867151263053d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5597386341481805d) + "'", double1 == (-0.5597386341481805d));
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483608274590866d + "'", double1 == 0.6483608274590866d);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        long long1 = org.apache.commons.math3.util.FastMath.abs(2147483647L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(7.756674360448215E-153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.756674360448216E-153d + "'", double1 == 7.756674360448216E-153d);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        double double2 = org.apache.commons.math3.util.FastMath.min(74.54992027339121d, 45.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 45.0d + "'", double2 == 45.0d);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        int int2 = org.apache.commons.math3.util.FastMath.min((-1023), (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1023) + "'", int2 == (-1023));
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        float float2 = org.apache.commons.math3.util.FastMath.max(35.000004f, 64.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 64.0f + "'", float2 == 64.0f);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) '4', (-18));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.5574077246549023d, 1.0232274785475501d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0232274785475501d + "'", double2 == 1.0232274785475501d);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (long) (-47));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(2.14748365E9f, 2.0000005f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.4152908733857559d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7460778197644783d) + "'", double1 == (-0.7460778197644783d));
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) (-23.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.1449205926874493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1449205926874495d + "'", double1 == 1.1449205926874495d);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-6.053272382792838d), 0.08037538236017183d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.053272382792837d) + "'", double2 == (-6.053272382792837d));
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        int int2 = org.apache.commons.math3.util.FastMath.min(15, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.993222941974403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.7313481348387146d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7983101165780776d + "'", double1 == 0.7983101165780776d);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.8813616205677708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(5.686278854741452E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9924428.82017707d + "'", double1 == 9924428.82017707d);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(268.5850815956288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6843418860808015E-14d + "'", double1 == 5.6843418860808015E-14d);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018268069E13d + "'", double1 == 7.896296018268069E13d);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 40.0f, 6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2560.0d + "'", double2 == 2560.0d);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-5L), 1.5625f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.0f) + "'", float2 == (-5.0f));
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        int int2 = org.apache.commons.math3.util.FastMath.max((-10), 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        double double1 = org.apache.commons.math3.util.FastMath.log((-511.49999999999994d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 143);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        float float2 = org.apache.commons.math3.util.FastMath.min(127.0f, 13.000001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13.000001f + "'", float2 == 13.000001f);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(5.293955920339377E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.21280863569583866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) '#', (-1023));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1023) + "'", int2 == (-1023));
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.8919599252153066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4399070033931303d + "'", double1 == 1.4399070033931303d);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.812402071214698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(3.228996546770822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        float float2 = org.apache.commons.math3.util.FastMath.min((-4.9999995f), 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.9999995f) + "'", float2 == (-4.9999995f));
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        float float1 = org.apache.commons.math3.util.FastMath.signum(100.00001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(268.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-15), (long) 127);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 127L + "'", long2 == 127L);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(6.566343246671086E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.566343246671082E-8d + "'", double1 == 6.566343246671082E-8d);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(7.657351729889458E92d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(58.996877293214865d, (-2147483648));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(9.094947E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.094948E-13f + "'", float1 == 9.094948E-13f);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.6482076576793505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-7), (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-45), 0.3957378743180247d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-44.999996f) + "'", float2 == (-44.999996f));
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        double double1 = org.apache.commons.math3.util.FastMath.abs(56.93526894286123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.93526894286123d + "'", double1 == 56.93526894286123d);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.8360218615377305d), (-3.2819493855383146d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8360218615377305d) + "'", double2 == (-0.8360218615377305d));
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        int int1 = org.apache.commons.math3.util.FastMath.round((-0.25000003f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(4.72097405257708E23d, (-4.09061543436171E-4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.830314142019763E-5d + "'", double2 == 6.830314142019763E-5d);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        double double1 = org.apache.commons.math3.util.FastMath.log10(5.59529114079855E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.2521773108241656d) + "'", double1 == (-3.2521773108241656d));
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 17, 3.0533959519657112d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 16.999998f + "'", float2 == 16.999998f);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 7.1054274E-15f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-47) + "'", int1 == (-47));
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.5350578961457685d, 4.091910996119958d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5350578961457685d + "'", double2 == 0.5350578961457685d);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(10239.998f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10239.999f + "'", float1 == 10239.999f);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 7, 1.9999999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9999999f + "'", float2 == 1.9999999f);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(4.8148248609680896E-35d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.403454673077138E-37d + "'", double1 == 8.403454673077138E-37d);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        float float2 = org.apache.commons.math3.util.FastMath.min(6.0f, (-7.9999995f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.9999995f) + "'", float2 == (-7.9999995f));
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.7724538509055159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-1023.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1023.0f + "'", float1 == 1023.0f);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 43L, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 21.5f + "'", float2 == 21.5f);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.1961198770299012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.236841232438037d + "'", double1 == 11.236841232438037d);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(96.99999237060547d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        double double1 = org.apache.commons.math3.util.FastMath.log10(5.312288897847933E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.274718314790358d) + "'", double1 == (-4.274718314790358d));
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.0874453647522562d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.624434178907251d, 0.22498664000000534d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8994711377630404d + "'", double2 == 0.8994711377630404d);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(41984.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.00390625f + "'", float1 == 0.00390625f);
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.570629771684025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.6104048481741295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5480350179494938d) + "'", double1 == (-0.5480350179494938d));
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.9990382024714676d, 7.896280957292998E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.896280957292998E13d + "'", double2 == 7.896280957292998E13d);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        double double1 = org.apache.commons.math3.util.FastMath.floor(46.40364254441709d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.0d + "'", double1 == 46.0d);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.17694219171363745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.17540341900446973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19172688492398915d + "'", double1 == 0.19172688492398915d);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        double double2 = org.apache.commons.math3.util.FastMath.pow(6.991989996645917E-56d, (-3.6268604078470186d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0988379340033215E200d + "'", double2 == 1.0988379340033215E200d);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(214.56664193281875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.744894366675417d + "'", double1 == 3.744894366675417d);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-5.418539921951662d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7564161665363514d) + "'", double1 == (-1.7564161665363514d));
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-24.611645180793627d), (-3.6268604078470186d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7171068871557624d) + "'", double2 == (-1.7171068871557624d));
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.6481413052534384d, 96.99999237060548d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6481413052534384d + "'", double2 == 1.6481413052534384d);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        long long1 = org.apache.commons.math3.util.FastMath.round(10.000000953675826d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.3377546286248103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, (-64));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.1733515377169321d, 1.3369954337691163d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2382978397513802d + "'", double2 == 1.2382978397513802d);
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.154277032758874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4282220681686308d + "'", double1 == 1.4282220681686308d);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        double double1 = org.apache.commons.math3.util.FastMath.floor(12347.228980451639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12347.0d + "'", double1 == 12347.0d);
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.718557888110264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4343385851652767d + "'", double1 == 0.4343385851652767d);
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-2.3176272142905816d), 8.864996893061638E35d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.3176272142905816d) + "'", double2 == (-2.3176272142905816d));
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) (-10.000001f), (-0.021044332826869627d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-10.000000953674316d) + "'", double2 == (-10.000000953674316d));
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) (-2.9999998f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.052359873398640684d) + "'", double1 == (-0.052359873398640684d));
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.71798692E10f, 13);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.40737488E14f + "'", float2 == 1.40737488E14f);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.9999999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        int int2 = org.apache.commons.math3.util.FastMath.max(10240, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10240 + "'", int2 == 10240);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.107184941633452E23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.07074101207510715d), 3.0533959519657112d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.07074101207510715d) + "'", double2 == (-0.07074101207510715d));
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-8));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8L + "'", long1 == 8L);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 2147483647L, 13);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7592186E13f + "'", float2 == 1.7592186E13f);
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.027415566677401863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027046490461847636d + "'", double1 == 0.027046490461847636d);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        float float2 = org.apache.commons.math3.util.FastMath.min(16.999998f, 1.34217728E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 16.999998f + "'", float2 == 16.999998f);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.880909488144193E11d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.0986122886681098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8905770416677471d + "'", double1 == 0.8905770416677471d);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 13L, (float) 20L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13.0f + "'", float2 == 13.0f);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.017453292519943295d, 0.9561803165529644d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011068739095462627d + "'", double2 == 0.011068739095462627d);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.027415567780803774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02741900326072046d) + "'", double1 == (-0.02741900326072046d));
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 511.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4716788741741842d) + "'", double1 == (-0.4716788741741842d));
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.0000000002742861d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(3.1992174676502746E17d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.6389612763136348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.900849165587834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.900849165587834d + "'", double1 == 1.900849165587834d);
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.2207034E-4f, (-10));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1920932E-7f + "'", float2 == 1.1920932E-7f);
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 4, (long) (-45));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(4.041914989933879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.104828612919536d + "'", double1 == 2.104828612919536d);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.49904707604701226d), (-2.372298207860836d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.9781088370666045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7522460694432564d + "'", double1 == 0.7522460694432564d);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 233472.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.8203432320660448d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.4968538574062324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.11328499162254d + "'", double1 == 6.11328499162254d);
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-2401L), (-5.999999f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2401.0f) + "'", float2 == (-2401.0f));
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.6499783639526059d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.5625001f, (-6.1572651E13f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5625001f + "'", float2 == 1.5625001f);
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.25132724169328774d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(16.999998f, 143);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 68, (long) (-20));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-20L) + "'", long2 == (-20L));
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-1.5424980307488157E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.6921669342095567E-6d) + "'", double1 == (-2.6921669342095567E-6d));
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(8.429369702178828E-8d, (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.214684851089414E-8d + "'", double2 == 4.214684851089414E-8d);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.017455951307856887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017455064928217585d + "'", double1 == 0.017455064928217585d);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.4716788741741842d), 9.234056889056756d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4716788741741842d) + "'", double2 == (-0.4716788741741842d));
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        double double2 = org.apache.commons.math3.util.FastMath.log(7.896296018267969E13d, 6.830189984234749E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3716924396446455d) + "'", double2 == (-0.3716924396446455d));
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-1023.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1022.99994f) + "'", float1 == (-1022.99994f));
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.09983440995178776d, (-13.847379800543134d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.31604169520790676d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27097094748400474d) + "'", double1 == (-0.27097094748400474d));
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 40L, 212.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 40.0f + "'", float2 == 40.0f);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.4512856670122316d, 0.003905821484290615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.4765298821990065d) + "'", double2 == (-4.4765298821990065d));
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.09966865249116201d, (-0.6912431464778742d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.09966865249116201d) + "'", double2 == (-0.09966865249116201d));
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.43480940134145385d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 75L, 1.192093E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 75.0f + "'", float2 == 75.0f);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (-20), 0.9999999999999992d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(5557.0d, (-17.789481822638468d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5557.028474433393d + "'", double2 == 5557.028474433393d);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.44454092331852335d), 86.23874129193797d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 86.23874129193797d + "'", double2 == 86.23874129193797d);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 63L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-3), (long) (-19));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.09298255216717233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09311706020371358d + "'", double1 == 0.09311706020371358d);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.708420900134713d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(6.905338425253609E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.907723159073521E-4d + "'", double1 == 6.907723159073521E-4d);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 10240);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10240L + "'", long1 == 10240L);
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) (-3.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.49205974021214605d, 0.8994711377630404d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.49205974021214605d + "'", double2 == 0.49205974021214605d);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(6.4851835E18f, (-5.4210105393100954E-20d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.4851829E18f + "'", float2 == 6.4851829E18f);
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.6314566596416601d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7946424728402454d + "'", double1 == 0.7946424728402454d);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2.0536546824812274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0536546824812274d + "'", double1 == 2.0536546824812274d);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.6021822422061627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9219963810650263d + "'", double1 == 0.9219963810650263d);
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.530993900237115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9286120715391879d + "'", double1 == 0.9286120715391879d);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(4.476961205229636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1793785704821427d + "'", double1 == 2.1793785704821427d);
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.9999999999999992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        int int2 = org.apache.commons.math3.util.FastMath.max(52, 68);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 68 + "'", int2 == 68);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        int int2 = org.apache.commons.math3.util.FastMath.max((-40), (-41));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-40) + "'", int2 == (-40));
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.5422326689561368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43323115153831754d + "'", double1 == 0.43323115153831754d);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 4.8828125E-4f, 1.0452982054695486E-58d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 24, (long) 13);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24L + "'", long2 == 24L);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.031092515388382688d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.031087507813438716d) + "'", double1 == (-0.031087507813438716d));
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.9912174443839007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-9.143899130258427E-100d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.143899130258427E-100d) + "'", double1 == (-9.143899130258427E-100d));
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        double double2 = org.apache.commons.math3.util.FastMath.min(39.960969282839415d, (double) (-2401L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2401.0d) + "'", double2 == (-2401.0d));
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.0468426300829488d, 5867087.82213963d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 340.4399400146707d + "'", double2 == 340.4399400146707d);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        int int2 = org.apache.commons.math3.util.FastMath.min((-5), 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(57.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.736121492758925d + "'", double1 == 4.736121492758925d);
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        long long2 = org.apache.commons.math3.util.FastMath.max(43L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.004478358365843835d, 0.9911569720921272d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.004518283195138572d + "'", double2 == 0.004518283195138572d);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.9085973124442547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7204583273036288d + "'", double1 == 0.7204583273036288d);
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, (-35.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.8813705015364591d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7071052384416396d) + "'", double1 == (-0.7071052384416396d));
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        double double1 = org.apache.commons.math3.util.FastMath.log((-2.726510528000143d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.5707962635746238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0232274263581917d + "'", double1 == 1.0232274263581917d);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.790784730303113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0735227395772053d + "'", double1 == 1.0735227395772053d);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.04665687272850968d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.673241892622634d) + "'", double1 == (-2.673241892622634d));
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.9890133769134045d), 0.6483608274590866d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.5597386341481805d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1607866859909812d + "'", double1 == 1.1607866859909812d);
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.1920928244535474E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0805944776113177E-9d + "'", double1 == 2.0805944776113177E-9d);
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.2442042457880407d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-1L), (float) 87L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 87.0f + "'", float2 == 87.0f);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(3.43597363E10f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.4359738E10f + "'", float1 == 3.4359738E10f);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 1998848.0f, 0.4484615082261164d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1998848.0d + "'", double2 == 1998848.0d);
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.3377546286248103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7740218422513514d + "'", double1 == 1.7740218422513514d);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.8623188722876841d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5309649148733833d + "'", double1 == 0.5309649148733833d);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.7830044631770386d), (double) 212.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0036934004848983132d) + "'", double2 == (-0.0036934004848983132d));
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.6021822422061627d, 0.01010362752657458d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6021822422061625d + "'", double2 == 1.6021822422061625d);
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.07466556700256388d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9280538062512562d + "'", double1 == 0.9280538062512562d);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.3068528194400547d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2977318668738574d) + "'", double1 == (-0.2977318668738574d));
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(10.536076409331102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2459322866213802d + "'", double1 == 3.2459322866213802d);
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-127), (long) (-12));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-12L) + "'", long2 == (-12L));
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-4.741450291257945d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.260429527939435d) + "'", double1 == (-2.260429527939435d));
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 24.000002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        int int2 = org.apache.commons.math3.util.FastMath.min(43, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(14.999999f, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14.999999f + "'", float2 == 14.999999f);
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) (-0.0234375f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.00027467077621d + "'", double1 == 1.00027467077621d);
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(4.547473508864641E-13d, 9.927204076769259d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.547473508864641E-13d + "'", double2 == 4.547473508864641E-13d);
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        double double1 = org.apache.commons.math3.util.FastMath.tan(71.55417527999327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8464950758027222d) + "'", double1 == (-0.8464950758027222d));
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.012764432931255018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01276443293125502d + "'", double1 == 0.01276443293125502d);
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        double double1 = org.apache.commons.math3.util.FastMath.log(39.960969282839415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6879032098134856d + "'", double1 == 3.6879032098134856d);
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.5970303593578004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 1.5625001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.2676506002282294E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(4.209318697132464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0734664705307195d + "'", double1 == 0.0734664705307195d);
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        double double1 = org.apache.commons.math3.util.FastMath.atan(10.536076409331102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.476167802349038d + "'", double1 == 1.476167802349038d);
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.7883545632203803d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7883545632203802d) + "'", double1 == (-0.7883545632203802d));
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.05149771824736E-4d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.7243890099427566d, 0.5202037405680986d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7243890099427566d + "'", double2 == 0.7243890099427566d);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-6.436592044971218d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.02857142857142857d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.028167124967018894d) + "'", double1 == (-0.028167124967018894d));
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.09805993851507629d, 0.950488987782623d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09805993851507629d + "'", double2 == 0.09805993851507629d);
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.04924885734225888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04926876819650362d + "'", double1 == 0.04926876819650362d);
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.000018866625139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7616020793403864d + "'", double1 == 0.7616020793403864d);
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        double double2 = org.apache.commons.math3.util.FastMath.pow(68.9840077059649d, 212);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.9085973124442547d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.9879627505659927d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.872836301040899d) + "'", double1 == (-0.872836301040899d));
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.05930617082324296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3979932872537244d + "'", double1 == 3.3979932872537244d);
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.2533449363319665d, 0.7000611280165643d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2533449363319665d + "'", double2 == 0.2533449363319665d);
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.8290775546364043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.679980385894906d + "'", double1 == 0.679980385894906d);
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.2543011339274215d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(2.0f, (double) 1.1920932E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9999999f + "'", float2 == 1.9999999f);
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) (-23.0f), 0.1948839253625035d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-22.999999999999996d) + "'", double2 == (-22.999999999999996d));
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2560.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5704057018147648d + "'", double1 == 1.5704057018147648d);
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.42826253011881144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41614683654714246d + "'", double1 == 0.41614683654714246d);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 43L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (short) 10, 5.07804867017443E-10d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.999999f + "'", float2 == 9.999999f);
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.6390573296152584d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-43));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 43.0f + "'", float1 == 43.0f);
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.888024818894126E22d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.986771734266245d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.01737254084242038d), 1.1686198234960486E8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1686198234960486E8d + "'", double2 == 1.1686198234960486E8d);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(40.999996f, 512);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        float float1 = org.apache.commons.math3.util.FastMath.abs(51.999996f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 51.999996f + "'", float1 == 51.999996f);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(42.97463715202101d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.37167325542467927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9897401563131257d) + "'", double1 == (-0.9897401563131257d));
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (-0.0f), (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(10.040749952147157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.997309964677358d + "'", double1 == 2.997309964677358d);
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.1568553487765425E21d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 40.0f, 0.9791496723130869d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 39.99999999999999d + "'", double2 == 39.99999999999999d);
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.0d), 1.192092895507821E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 512L, 0.003906251f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 512.0f + "'", float2 == 512.0f);
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 57);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.7076170222418037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.51580177126805d + "'", double1 == 4.51580177126805d);
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.2449786631268642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4949531928646023d + "'", double1 == 0.4949531928646023d);
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.15912713462618d, 1.1805980508882694d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.11648110840574631d + "'", double2 == 0.11648110840574631d);
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 8, 0.8780601356668734d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.208223115294254d + "'", double2 == 6.208223115294254d);
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        double double1 = org.apache.commons.math3.util.FastMath.log(6400.000019456874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.7640532723879d + "'", double1 == 8.7640532723879d);
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.4210854715202004E-14d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4210854715202004E-14d + "'", double2 == 1.4210854715202004E-14d);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 6L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.4212655272004053d), 2.639057329615259d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.047442967903742035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.280359968382907E-4d + "'", double1 == 8.280359968382907E-4d);
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.3383449299268079E42d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.3957378743180247d, 0.34272165058632437d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.34272165058632437d + "'", double2 == 0.34272165058632437d);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-1023.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(8.042848410283348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.835991609699039d + "'", double1 == 2.835991609699039d);
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        float float2 = org.apache.commons.math3.util.FastMath.max(32768.0f, (float) (-47L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32768.0f + "'", float2 == 32768.0f);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.9966089419888077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.10148620095698d + "'", double1 == 57.10148620095698d);
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.2415914299460307E-13d, 0.8813616205677708d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2415914299460307E-13d + "'", double2 == 2.2415914299460307E-13d);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        int int2 = org.apache.commons.math3.util.FastMath.max(10, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(14.0055615162482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(510.99997f, 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.30133927E18f + "'", float2 == 2.30133927E18f);
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 3L, 0.8447979300678613d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.529711810641404d + "'", double2 == 2.529711810641404d);
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        double double1 = org.apache.commons.math3.util.FastMath.log(6.048315279876172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7997797671276863d + "'", double1 == 1.7997797671276863d);
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.49369669957632584d, 4.600444344825681d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.49369669957632584d + "'", double2 == 0.49369669957632584d);
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-511.5f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0517578E-5f + "'", float1 == 3.0517578E-5f);
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.736121492758925d, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.736121492758925d + "'", double2 == 4.736121492758925d);
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.6883420083174141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6352575884298074d + "'", double1 == 0.6352575884298074d);
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.2138716147160418d, 0.4101902625061654d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4101902625061654d + "'", double2 == 0.4101902625061654d);
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(7.657351729889458E92d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        int int2 = org.apache.commons.math3.util.FastMath.min((-18), 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.2533141120942604d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.60818633738585d + "'", double1 == 1.60818633738585d);
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.6918184078520578d, 0.009430054193516519d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6918184078520577d + "'", double2 == 0.6918184078520577d);
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        int int2 = org.apache.commons.math3.util.FastMath.min(24, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.9073467001376322E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.719570357677014d) + "'", double1 == (-5.719570357677014d));
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(3.5199873736154695E30d, 1.053671212772351E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.519987373615469E30d + "'", double2 == 3.519987373615469E30d);
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.008837862706914782d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.00883786270691478d) + "'", double1 == (-0.00883786270691478d));
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1024.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1024.0001f + "'", float1 == 1024.0001f);
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.8369630128952054d, (-45));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.378791955650301E-14d + "'", double2 == 2.378791955650301E-14d);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
        double double1 = org.apache.commons.math3.util.FastMath.acos(128.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.991301486674581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9913014866745815d + "'", double1 == 2.9913014866745815d);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 57L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.736121492758925d + "'", double1 == 4.736121492758925d);
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.5597386341481805d), 1.5625001192092896d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5597386341481805d + "'", double2 == 0.5597386341481805d);
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.5507969934215662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0065378806329035d + "'", double1 == 1.0065378806329035d);
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 1.4210856E-14f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210856409267898E-14d + "'", double1 == 1.4210856409267898E-14d);
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 212L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 212.00002f + "'", float1 == 212.00002f);
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.10471975511965978d, 9.346544323973411d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.10471975511965978d + "'", double2 == 0.10471975511965978d);
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.9879627505659927d), (double) 57L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9879627505659927d) + "'", double2 == (-0.9879627505659927d));
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.5750864740467807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3120848586373612d + "'", double1 == 2.3120848586373612d);
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
        float float1 = org.apache.commons.math3.util.FastMath.abs(14.999999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 14.999999f + "'", float1 == 14.999999f);
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        double double1 = org.apache.commons.math3.util.FastMath.cos(28.59329174674238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9495627235668462d) + "'", double1 == (-0.9495627235668462d));
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.02460092029573991d, 3.7776536914795704d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.77773379396016d + "'", double2 == 3.77773379396016d);
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, 0.7204583273036288d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7204583273036288d + "'", double2 == 0.7204583273036288d);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.3188965091265011E218d, 6.324555320336759d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.318896509126501E218d + "'", double2 == 1.318896509126501E218d);
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.02460092029573991d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02430319072258091d + "'", double1 == 0.02430319072258091d);
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(32768.004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32768.008f + "'", float1 == 32768.008f);
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-2.999999f), (-8));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.011718746f) + "'", float2 == (-0.011718746f));
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 13, (-0.11611854943761853d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.11611854943761853d) + "'", double2 == (-0.11611854943761853d));
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(27.308232836016487d, 2.271046620432096E-33d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 27.308232836016483d + "'", double2 == 27.308232836016483d);
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.9036922050915067d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9036922050915066d) + "'", double1 == (-0.9036922050915066d));
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(5.0000005f, 5.293955920339377E-23d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.006187413933411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0061874139334113d + "'", double1 == 1.0061874139334113d);
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        int int2 = org.apache.commons.math3.util.FastMath.min((-18), 127);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 512, (-0.2545302486183726d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5712934561457763d + "'", double2 == 1.5712934561457763d);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.30969878586487914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0483412035760868d + "'", double1 == 1.0483412035760868d);
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        double double1 = org.apache.commons.math3.util.FastMath.cos(7.657351729889458E92d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3052616540384379d + "'", double1 == 0.3052616540384379d);
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        int int1 = org.apache.commons.math3.util.FastMath.round(40.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40 + "'", int1 == 40);
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        double double2 = org.apache.commons.math3.util.FastMath.pow(6.65790272519809E-8d, 1.5295813285302078d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.053685383586912E-11d + "'", double2 == 1.053685383586912E-11d);
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.3978727715165242d, 0.05372289070732859d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.021812536565224118d + "'", double2 == 0.021812536565224118d);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 212L, 0.024600920295739914d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 211.99998f + "'", float2 == 211.99998f);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        double double2 = org.apache.commons.math3.util.FastMath.min((-1.4212655272004053d), (-0.12887618051864808d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4212655272004053d) + "'", double2 == (-1.4212655272004053d));
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 20L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.6090156828024733d, 2153.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.82868400631261E-4d + "'", double2 == 2.82868400631261E-4d);
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 0.0039062505f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.673617379884035E-19d + "'", double1 == 8.673617379884035E-19d);
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 61L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.1754034190044697d, (double) 7.1054274E-15f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999999877d + "'", double2 == 0.9999999999999877d);
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.41777137910516676d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.41777137910516676d + "'", double2 == 0.41777137910516676d);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        long long2 = org.apache.commons.math3.util.FastMath.min(3L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.22348190443041302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.06829003182121696d), 3.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.06829003182121696d + "'", double2 == 0.06829003182121696d);
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-19));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-19) + "'", int1 == (-19));
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        double double1 = org.apache.commons.math3.util.FastMath.abs(7.6809424742810615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.6809424742810615d + "'", double1 == 7.6809424742810615d);
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.0017593314992682E31d, (-19));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9107042913422931E25d + "'", double2 == 1.9107042913422931E25d);
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-1.253769370231402d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(3.948148009134021E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.306852819440078d + "'", double1 == 31.306852819440078d);
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0039062505f, 9.536743E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.536743E-7f + "'", float2 == 9.536743E-7f);
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.74877907E11f, 101);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.4643056300239326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44906018104917866d + "'", double1 == 0.44906018104917866d);
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.5342913977175717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4886546185887335d + "'", double1 == 0.4886546185887335d);
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.4484615082261164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6696726873825126d + "'", double1 == 0.6696726873825126d);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 1023.0f, 2.5641241260040846d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1023.0d + "'", double2 == 1023.0d);
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        double double1 = org.apache.commons.math3.util.FastMath.tan(29.5761829363623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.628116537047963d + "'", double1 == 3.628116537047963d);
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(4.547474050965727E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(90.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5156.62015617741d + "'", double1 == 5156.62015617741d);
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 4503599627370496L, (float) (-12));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.5035996E15f + "'", float2 == 4.5035996E15f);
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.8813616205677707d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(6.11328499162254d, (-0.7238497818898454d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.11328499162254d) + "'", double2 == (-6.11328499162254d));
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5.551115123125783E-17d, 43);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 24.249996f, 0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 24.24999618530273d + "'", double2 == 24.24999618530273d);
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        int int1 = org.apache.commons.math3.util.FastMath.round(212.00002f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 212 + "'", int1 == 212);
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-47L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-47) + "'", int1 == (-47));
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 'a', Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.624434178907251d, 0.7451131604793488d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7451131604793488d + "'", double2 == 0.7451131604793488d);
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.6951219826018177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6012623759002728d + "'", double1 == 0.6012623759002728d);
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-2025.4348094013412d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2026.0d) + "'", double1 == (-2026.0d));
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, 0.8987804897672533d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        double double1 = org.apache.commons.math3.util.FastMath.floor(57.295779513082316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 511);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 511.00003f + "'", float1 == 511.00003f);
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.5707963267948968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.509178478658057d + "'", double1 == 2.509178478658057d);
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.3852401422190596E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3852401422190596E-16d + "'", double1 == 1.3852401422190596E-16d);
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.010200777470529932d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010200777470529934d + "'", double1 == 0.010200777470529934d);
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) '#', (long) (-45));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-1.2057514536482425d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8354005249332166d) + "'", double1 == (-0.8354005249332166d));
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 3);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
        int int2 = org.apache.commons.math3.util.FastMath.max(52, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-2.6612899360192603d), (-0.036241972554485795d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.584413682758705d) + "'", double2 == (-1.584413682758705d));
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 4);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6536436208636119d) + "'", double1 == (-0.6536436208636119d));
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        int int2 = org.apache.commons.math3.util.FastMath.max(512, 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 512 + "'", int2 == 512);
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.1087413143427255E15d, 0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1087413143427255E15d + "'", double2 == 1.1087413143427255E15d);
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(3580.582889552442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.547473508864641E-13d + "'", double1 == 4.547473508864641E-13d);
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.04649127608358614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.663753903766989d + "'", double1 == 2.663753903766989d);
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(571.90945520504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.042128628650798d + "'", double1 == 7.042128628650798d);
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        double double1 = org.apache.commons.math3.util.FastMath.log(5.68627886E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.15873679924275d + "'", double1 == 20.15873679924275d);
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.01745355584320953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017452669828398083d + "'", double1 == 0.017452669828398083d);
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        float float2 = org.apache.commons.math3.util.FastMath.min((-0.9999998f), (float) 24L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.9999998f) + "'", float2 == (-0.9999998f));
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.855938105439101d, 5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.984551904491525E-4d + "'", double2 == 4.984551904491525E-4d);
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(47.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
        float float2 = org.apache.commons.math3.util.FastMath.max(9.094948E-13f, (float) 10240);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10240.0f + "'", float2 == 10240.0f);
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 1.1920932E-7f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-17.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-16.999998f) + "'", float1 == (-16.999998f));
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(89.16353073421527d, 205151.36246232543d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 89.16353073421529d + "'", double2 == 89.16353073421529d);
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        float float1 = org.apache.commons.math3.util.FastMath.abs(9.536745E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536745E-7f + "'", float1 == 9.536745E-7f);
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.8146972656527556E-6d, 18.687973453650347d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0412578576879198E-7d + "'", double2 == 2.0412578576879198E-7d);
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-12L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 12L + "'", long1 == 12L);
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
        double double1 = org.apache.commons.math3.util.FastMath.signum(41.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        double double2 = org.apache.commons.math3.util.FastMath.min(9.094947017729282E-13d, 1895.8365091329927d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.094947017729282E-13d + "'", double2 == 9.094947017729282E-13d);
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
        double double1 = org.apache.commons.math3.util.FastMath.exp(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 64.01562118716426d + "'", double1 == 64.01562118716426d);
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(4.715226690089209d, 3.0434448108017733d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9976260922138449d + "'", double2 == 0.9976260922138449d);
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (byte) 10, 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        long long2 = org.apache.commons.math3.util.FastMath.max(35L, (long) (-10));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2.8827567980377764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.86345128886985d + "'", double1 == 17.86345128886985d);
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.4778887302884747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.477888730288475d + "'", double1 == 2.477888730288475d);
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(511.500818457423d, 1.0061874139334113d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5688292016608134d + "'", double2 == 1.5688292016608134d);
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        double double2 = org.apache.commons.math3.util.FastMath.min(1429.0d, 96.99999237060547d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 96.99999237060547d + "'", double2 == 96.99999237060547d);
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-19), (long) (-17));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-19L) + "'", long2 == (-19L));
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
        float float2 = org.apache.commons.math3.util.FastMath.min(1998848.0f, 40.999992f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 40.999992f + "'", float2 == 40.999992f);
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.2531288525643591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2531288525643594d + "'", double1 == 1.2531288525643594d);
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.8202965860187448d, 0.001316561561093711d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.873345736286426E-5d + "'", double2 == 7.873345736286426E-5d);
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, (-20));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.9897401563131257d), 34.999996185302734d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        long long2 = org.apache.commons.math3.util.FastMath.min(87L, 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        float float1 = org.apache.commons.math3.util.FastMath.signum(48.499996f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-2.6612899360192603d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) (-1.9184615E21f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9184615244032817E21d) + "'", double1 == (-1.9184615244032817E21d));
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.7076170222418037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.6090128311061332d, (double) 20.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6090128311061332d + "'", double2 == 0.6090128311061332d);
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-64L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 64.0f + "'", float1 == 64.0f);
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 6.4851835E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.926359837370816d, 0.40768203919741414d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.40768203919741414d + "'", double2 == 0.40768203919741414d);
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.4806837110361924E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 258428.05938229858d + "'", double1 == 258428.05938229858d);
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 3);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
        double double1 = org.apache.commons.math3.util.FastMath.log(10.754065986323363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.375283914348145d + "'", double1 == 2.375283914348145d);
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
        long long2 = org.apache.commons.math3.util.FastMath.min(17L, (-4L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4L) + "'", long2 == (-4L));
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.4281895641080631d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.404569132052851d) + "'", double1 == (-0.404569132052851d));
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.8225824358786724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 4.5036002E15f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.4343385851652767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5439415353277282d + "'", double1 == 1.5439415353277282d);
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.38991804378757267d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.7322058522179385d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-2.68435424E8f), 32.693147180559926d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.68435408E8f) + "'", float2 == (-2.68435408E8f));
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
        int int2 = org.apache.commons.math3.util.FastMath.max(100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
        double double2 = org.apache.commons.math3.util.FastMath.min((-16.999999999999996d), (-0.8354005249332166d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-16.999999999999996d) + "'", double2 == (-16.999999999999996d));
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 17, (long) 12);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17L + "'", long2 == 17L);
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.2442042457880407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.8236845783289657d, (-1.117010721276371d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5062039286810203d + "'", double2 == 2.5062039286810203d);
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.6839128558975155d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
        double double1 = org.apache.commons.math3.util.FastMath.asin(3.452669727114854E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.452669795713238E-4d + "'", double1 == 3.452669795713238E-4d);
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6428");
        double double1 = org.apache.commons.math3.util.FastMath.acos(52.07100014498407d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6429");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) (-1023L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9164853722719367d + "'", double1 == 0.9164853722719367d);
    }

    @Test
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6430");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-2.4917798526449118d), 1.2722218725854072E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948915d) + "'", double2 == (-1.5707963267948915d));
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6431");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.00883774765274219d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5796341894982169d + "'", double1 == 1.5796341894982169d);
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6432");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-46.999992f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 46.999992f + "'", float1 == 46.999992f);
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6433");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 100L, (-0.37245959530521877d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999999999999d + "'", double2 == 99.99999999999999d);
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6434");
        float float2 = org.apache.commons.math3.util.FastMath.min(35.0f, 51.999992f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6435");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.012764432931255018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012764086336898644d + "'", double1 == 0.012764086336898644d);
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6436");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-7.801440805870862E-17d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.801440805870862E-17d) + "'", double1 == (-7.801440805870862E-17d));
    }

    @Test
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6437");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(2.3841860752327193E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.161189699301219E-9d + "'", double1 == 4.161189699301219E-9d);
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6438");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 3.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1411200080598672d + "'", double1 == 0.1411200080598672d);
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6439");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) (-15));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.26179938779914946d) + "'", double1 == (-0.26179938779914946d));
    }

    @Test
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6440");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) (-2.68435408E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6441");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.6090128311061331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.19125149579865d + "'", double1 == 1.19125149579865d);
    }

    @Test
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6442");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1998848.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6443");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (-40));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6444");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.0000002f, 2.8E-45f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0000002f + "'", float2 == 1.0000002f);
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6445");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.42883146644423187d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6446");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.60818633738585d, 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4006487.4030249193d + "'", double2 == 4006487.4030249193d);
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6447");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(32.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.000008f + "'", float1 == 32.000008f);
    }

    @Test
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6448");
        long long2 = org.apache.commons.math3.util.FastMath.max(127L, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 127L + "'", long2 == 127L);
    }

    @Test
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6449");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(5.585053606381854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8848024758427249d + "'", double1 == 1.8848024758427249d);
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6450");
        float float2 = org.apache.commons.math3.util.FastMath.min(24.249994f, 0.99999994f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.99999994f + "'", float2 == 0.99999994f);
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6451");
        long long2 = org.apache.commons.math3.util.FastMath.min((-23L), 212L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-23L) + "'", long2 == (-23L));
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6452");
        double double2 = org.apache.commons.math3.util.FastMath.log(223.0d, (double) 41L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6867864058443843d + "'", double2 == 0.6867864058443843d);
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6453");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.05709087716385304d, 0.6139677044391678d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6166163396713061d + "'", double2 == 0.6166163396713061d);
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6454");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(6.657902725198096E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.657902503559762E-8d + "'", double1 == 6.657902503559762E-8d);
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6455");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.1920932E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920933E-7f + "'", float1 == 1.1920933E-7f);
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6456");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.6441739259957566d, 0.9998902999783974d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3556066739610382d) + "'", double2 == (-0.3556066739610382d));
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6457");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.9804641080481076d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6458");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-7), (-6L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7L) + "'", long2 == (-7L));
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6459");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(4.547473508864641E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6460");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.03273753892205462d, 1.3920854323190326d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.023512569743138746d + "'", double2 == 0.023512569743138746d);
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6461");
        double double1 = org.apache.commons.math3.util.FastMath.floor(46.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.0d + "'", double1 == 46.0d);
    }

    @Test
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6462");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.7542142871583881d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7542142871583881d + "'", double1 == 0.7542142871583881d);
    }

    @Test
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6463");
        double double1 = org.apache.commons.math3.util.FastMath.abs(55.51535513730588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.51535513730588d + "'", double1 == 55.51535513730588d);
    }

    @Test
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6464");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(3.2592091679400053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 186.73892987330703d + "'", double1 == 186.73892987330703d);
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6465");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6466");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 1, 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6467");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(7.20871559418883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6849051369068575d + "'", double1 == 2.6849051369068575d);
    }

    @Test
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6468");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.01737079345125424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01737166705456418d) + "'", double1 == (-0.01737166705456418d));
    }

    @Test
    public void test6469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6469");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 10240);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test6470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6470");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.5503919142183956d, (-0.41614683654714246d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.41614683654714246d) + "'", double2 == (-0.41614683654714246d));
    }

    @Test
    public void test6471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6471");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(15.749546042573087d, 8.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.100808050508475d + "'", double2 == 1.100808050508475d);
    }

    @Test
    public void test6472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6472");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.5295813285302078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test6473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6473");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 75L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42070095062112434d) + "'", double1 == (-0.42070095062112434d));
    }

    @Test
    public void test6474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6474");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 4, 101);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0141204801825835E31d + "'", double2 == 1.0141204801825835E31d);
    }

    @Test
    public void test6475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6475");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.011800076512800236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9281151766786875d) + "'", double1 == (-1.9281151766786875d));
    }

    @Test
    public void test6476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6476");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.3513346877207577d, 0.10471975511965978d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.047500075088242555d + "'", double2 == 0.047500075088242555d);
    }

    @Test
    public void test6477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6477");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.6483635366065764d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6478");
        double double1 = org.apache.commons.math3.util.FastMath.signum(32.000003814697266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6479");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, 7);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6480");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.972630067242408d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6481");
        double double1 = org.apache.commons.math3.util.FastMath.atan(6.932447891572509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4275353316718848d + "'", double1 == 1.4275353316718848d);
    }

    @Test
    public void test6482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6482");
        int int2 = org.apache.commons.math3.util.FastMath.max(43, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 43 + "'", int2 == 43);
    }

    @Test
    public void test6483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6483");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-5.314369626254345d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004920379455972045d + "'", double1 == 0.004920379455972045d);
    }

    @Test
    public void test6484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6484");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.017453292519943292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01730273312368104d + "'", double1 == 0.01730273312368104d);
    }

    @Test
    public void test6485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6485");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.1594216750445131d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1587539925732924d) + "'", double1 == (-0.1587539925732924d));
    }

    @Test
    public void test6486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6486");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.7830044631770386d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8655027300461295d) + "'", double1 == (-0.8655027300461295d));
    }

    @Test
    public void test6487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6487");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 4L, 6.930495410524605d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.930495410524605d) + "'", double2 == (-2.930495410524605d));
    }

    @Test
    public void test6488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6488");
        double double1 = org.apache.commons.math3.util.FastMath.asin(3.2139218826786786E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.213921938007921E-4d + "'", double1 == 3.213921938007921E-4d);
    }

    @Test
    public void test6489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6489");
        int int1 = org.apache.commons.math3.util.FastMath.round(5.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test6490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6490");
        int int2 = org.apache.commons.math3.util.FastMath.min((-2147483648), 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test6491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6491");
        long long2 = org.apache.commons.math3.util.FastMath.max((-20L), 64L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 64L + "'", long2 == 64L);
    }

    @Test
    public void test6492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6492");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 512, (long) (-8));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8L) + "'", long2 == (-8L));
    }

    @Test
    public void test6493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6493");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.2504230129550942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6494");
        int int1 = org.apache.commons.math3.util.FastMath.round(512.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
    }

    @Test
    public void test6495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6495");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 9.536743E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6496");
        int int2 = org.apache.commons.math3.util.FastMath.max((-15), (-43));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15) + "'", int2 == (-15));
    }

    @Test
    public void test6497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6497");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.126011262856224d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6498");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.6610060414837631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7893750108307106d + "'", double1 == 0.7893750108307106d);
    }

    @Test
    public void test6499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6499");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 100, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test6500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6500");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }
}

