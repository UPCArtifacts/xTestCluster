import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.1d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09531017980432487d + "'", double1 == 0.09531017980432487d);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 84677176);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4628824377340256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5886465665472023d + "'", double1 == 0.5886465665472023d);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.541950429394781d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(5.293329949408896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.293329949408897d + "'", double1 == 5.293329949408897d);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5992442618287416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5681767505732657d + "'", double1 == 0.5681767505732657d);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 84677176);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.851644805886466E9d + "'", double1 == 4.851644805886466E9d);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.3798616970349825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37986169703498257d + "'", double1 == 0.37986169703498257d);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        double double1 = org.apache.commons.math.util.FastMath.expm1(803226.6141649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        int int2 = org.apache.commons.math.util.FastMath.max(97, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        double double1 = org.apache.commons.math.util.FastMath.expm1(7.725864345518537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2265.2105300860912d + "'", double1 == 2265.2105300860912d);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.7711544466071394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0192640011039094d + "'", double1 == 1.0192640011039094d);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.154434690031884d + "'", double1 == 2.154434690031884d);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9950915100179343d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.6667327043309772E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.322108077097887d + "'", double1 == 17.322108077097887d);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.11776318452497536d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11749267603958367d + "'", double1 == 0.11749267603958367d);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        double double1 = org.apache.commons.math.util.FastMath.ceil(8.467720335926631E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.4677204E7d + "'", double1 == 8.4677204E7d);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        long long1 = org.apache.commons.math.util.FastMath.abs((-36L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36L + "'", long1 == 36L);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5408212093041704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49360933992239375d + "'", double1 == 0.49360933992239375d);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.8336836665378882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2083581549727214d + "'", double1 == 3.2083581549727214d);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.399216241149525E248d, 1.6506325163944369d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.2200909184537633d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3074614241103386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.91202147768658d + "'", double1 == 74.91202147768658d);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557649d + "'", double1 == 0.7615941559557649d);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 6, (float) 6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 3L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.618990892446662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.394411534628069d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5886465665472023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7672330588205922d + "'", double1 == 0.7672330588205922d);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.4430227241169226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0997501702946164d + "'", double1 == 1.0997501702946164d);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.114043989714556d, 1.4369873807744509d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1140439897145558d + "'", double2 == 3.1140439897145558d);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-2.43878905260671d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9908064955841372d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-2.978724239478952E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06678466725522385d) + "'", double1 == (-0.06678466725522385d));
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 57L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 84677176);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 84677176L + "'", long1 == 84677176L);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.6904492636009615d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.48105018967490865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4810501896749087d + "'", double1 == 0.4810501896749087d);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.45967525618227173d), (-0.837131699124806d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4596752561822718d) + "'", double2 == (-0.4596752561822718d));
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.0037614443570399263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003761462096743441d + "'", double1 == 0.003761462096743441d);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.0037614443570399263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.021373301521365424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0002284177042067d + "'", double1 == 1.0002284177042067d);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.339637404328899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8024753333555441d + "'", double1 == 0.8024753333555441d);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.677511790861663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9689724168752079d + "'", double1 == 1.9689724168752079d);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2280945400058982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0338353139228529d + "'", double1 == 1.0338353139228529d);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(22.18070977791825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.709640090061899d + "'", double1 == 4.709640090061899d);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549018d + "'", double1 == 1.5574077246549018d);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.7158569288579336d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, 55L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 55L + "'", long2 == 55L);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5408212093041704d, 2.2851156853967676d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5408212093041704d + "'", double2 == 0.5408212093041704d);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5707173906673306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027414190085478973d + "'", double1 == 0.027414190085478973d);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5860134523134185E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5354158716652867d + "'", double1 == 0.5354158716652867d);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, 149L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5674991151269533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2316310948340863d + "'", double1 == 1.2316310948340863d);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.14287905018325486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14385932007498992d + "'", double1 == 0.14385932007498992d);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        double double1 = org.apache.commons.math.util.FastMath.exp(49.80857186097812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.281420761381717E21d + "'", double1 == 4.281420761381717E21d);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        int int2 = org.apache.commons.math.util.FastMath.min(53, 84677176);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.9481478479872E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        float float2 = org.apache.commons.math.util.FastMath.min(6.0f, 1.58601345E15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.22766430356286296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.026027646803929d + "'", double1 == 1.026027646803929d);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 149L, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5508166443572533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027066856538764013d + "'", double1 == 0.027066856538764013d);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        float float2 = org.apache.commons.math.util.FastMath.max(6.0f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.013865150856733838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5569307316547285d + "'", double1 == 1.5569307316547285d);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5860134523134298E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0871877068532768E16d + "'", double1 == 9.0871877068532768E16d);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.09966865249116202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.001739546146996826d + "'", double1 == 0.001739546146996826d);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.557407724654903d + "'", double1 == 1.557407724654903d);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.4787897278629274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9012409891810162d + "'", double1 == 0.9012409891810162d);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        double double1 = org.apache.commons.math.util.FastMath.sin(5506.500045400885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6532555690007772d + "'", double1 == 0.6532555690007772d);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 53, 45L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 45L + "'", long2 == 45L);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        double double1 = org.apache.commons.math.util.FastMath.expm1(11013.232874703415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.29225491648198393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2842089146420203d + "'", double1 == 0.2842089146420203d);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-3.046174150757105E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000463958851d + "'", double1 == 1.0000000463958851d);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.2146848510894035E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.375234893767539d) + "'", double1 == (-7.375234893767539d));
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2L), (float) 1477896L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 36.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.276858964458208d + "'", double1 == 4.276858964458208d);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 4L, (float) 6L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 11013L, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5860134523134185E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.982478439757607E7d + "'", double1 == 3.982478439757607E7d);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        double double2 = org.apache.commons.math.util.FastMath.max(1.373400766945016d, (-1.7456418720467646d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.373400766945016d + "'", double2 == 1.373400766945016d);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1511316354017451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.10757413843619563d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.428182669496151d), 3.982478439757607E7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.982478439757607E7d + "'", double2 == 3.982478439757607E7d);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, (long) 84677176);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7658461948190803d, 0.7658461948190802d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7853981633974484d + "'", double2 == 0.7853981633974484d);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.276858964458208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.01388621073821d + "'", double1 == 36.01388621073821d);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.0392223672767975E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.039222367276798E14d + "'", double1 == 4.039222367276798E14d);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.3156563365585749d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30557409445340483d + "'", double1 == 0.30557409445340483d);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7201065497963348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7813863964118538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7813863964118539d + "'", double1 == 0.7813863964118539d);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        double double1 = org.apache.commons.math.util.FastMath.atan(11.548739357257746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4844222297453324d + "'", double1 == 1.4844222297453324d);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        int int1 = org.apache.commons.math.util.FastMath.abs(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.4393066983576382d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.355516912589023d) + "'", double1 == (-0.355516912589023d));
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7949577687638787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0193043406642304d + "'", double1 == 1.0193043406642304d);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.05723320573453925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7095251320497278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6103789692086523d + "'", double1 == 0.6103789692086523d);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        long long1 = org.apache.commons.math.util.FastMath.round(3.4657359027997265d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8113741275700294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6242971965547152d + "'", double1 == 0.6242971965547152d);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        double double1 = org.apache.commons.math.util.FastMath.log(3.9697296111063074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.378697984345966d + "'", double1 == 1.378697984345966d);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.5447358754943394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009507434581110117d + "'", double1 == 0.009507434581110117d);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        double double1 = org.apache.commons.math.util.FastMath.floor(39.74137414560076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.0d + "'", double1 == 39.0d);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        float float2 = org.apache.commons.math.util.FastMath.min(2.14748365E9f, (float) 2155615773557597L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.24357481979072695d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.970482026087804d + "'", double1 == 0.970482026087804d);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.755461289508684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9999468579779085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615718367667291d + "'", double1 == 0.7615718367667291d);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8261522787674126d, 0.9221885224184981d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8385206858446207d + "'", double2 == 0.8385206858446207d);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        double double1 = org.apache.commons.math.util.FastMath.rint(23.620277154609447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.0d + "'", double1 == 24.0d);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8862269254527579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4259590371681936d + "'", double1 == 2.4259590371681936d);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8360321798777053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2078459541945306d + "'", double1 == 1.2078459541945306d);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.23083849595387476d, 9.287781549441661d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02484888141034163d + "'", double2 == 0.02484888141034163d);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5303019207992773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(534.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.108440016582687d + "'", double1 == 23.108440016582687d);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) (-36.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.0d) + "'", double1 == (-36.0d));
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        double double1 = org.apache.commons.math.util.FastMath.log1p(23151.90693368639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.049875621120885d + "'", double1 == 10.049875621120885d);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.3182714301523224d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-75.53138920040317d) + "'", double1 == (-75.53138920040317d));
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.0808864545885957E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0808866710930326E-7d + "'", double1 == 2.0808866710930326E-7d);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.584822186623346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.260930909413656d + "'", double1 == 13.260930909413656d);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(17.322108077097887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 992.483685087183d + "'", double1 == 992.483685087183d);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6441666662680666d, 1.2316310948340863d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6441666662680666d + "'", double2 == 0.6441666662680666d);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9428090415820634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.768115672379123E13d, 1.6699175736806615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8011713858470582E22d + "'", double2 == 2.8011713858470582E22d);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5860134523134308E15d, 4.248291097914389d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.248291097914389d + "'", double2 == 4.248291097914389d);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0000000463958851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000463958854d + "'", double1 == 1.0000000463958854d);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2378644027129617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8134633577082349d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8134633577082349d + "'", double1 == 0.8134633577082349d);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.2599210498948732d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2599210498948732d + "'", double1 == 1.2599210498948732d);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0L, (-53.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.164473663317525E39d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9177658737860996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40837872183945423d + "'", double1 == 0.40837872183945423d);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.525881748669311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.209034609522352d + "'", double1 == 1.209034609522352d);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        double double1 = org.apache.commons.math.util.FastMath.expm1(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5860134523134298E15d + "'", double1 == 1.5860134523134298E15d);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.9999999999999958d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5.306360105454386E78d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 149L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 149.0d + "'", double1 == 149.0d);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.16299078079570548d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        double double2 = org.apache.commons.math.util.FastMath.pow(23.108440016582687d, 2.0808866710930326E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000000653439813d + "'", double2 == 1.000000653439813d);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.731537741517051d + "'", double1 == 1.731537741517051d);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        double double1 = org.apache.commons.math.util.FastMath.expm1(41.32317658130462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.8394972283036544E17d + "'", double1 == 8.8394972283036544E17d);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.24619002710729043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.105649511459072d + "'", double1 == 14.105649511459072d);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6813252169987396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9764952825826654d + "'", double1 == 0.9764952825826654d);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8261522787674126d, (double) 15472906L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5472906E7d + "'", double2 == 1.5472906E7d);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.5896069690147183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010290582902011021d + "'", double1 == 0.010290582902011021d);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3565686652647782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1124761597012494d + "'", double1 == 1.1124761597012494d);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3297065169161864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7799338781144556d + "'", double1 == 3.7799338781144556d);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 416128L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 416128.0f + "'", float1 == 416128.0f);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0L, (float) 15472906L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5472906E7f + "'", float2 == 1.5472906E7f);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.4380253164811876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) (-2L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7621956910836314d + "'", double1 == 3.7621956910836314d);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.13937364645376973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(966980.6941481612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 983.3517652133245d + "'", double1 == 983.3517652133245d);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9651775697905435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9651775697905436d + "'", double1 == 0.9651775697905436d);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        long long1 = org.apache.commons.math.util.FastMath.round(0.02187509047518678d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.771137740740136d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-2), (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        double double1 = org.apache.commons.math.util.FastMath.log(3.0962532307185966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1301927452503902d + "'", double1 == 1.1301927452503902d);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        double double2 = org.apache.commons.math.util.FastMath.max(74.20994852478785d, 199.00499987500626d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 199.00499987500626d + "'", double2 == 199.00499987500626d);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35, (float) (-36L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        double double2 = org.apache.commons.math.util.FastMath.max(966980.6941481595d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 966980.6941481595d + "'", double2 == 966980.6941481595d);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7621186826519104d + "'", double1 == 1.7621186826519104d);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.7282657137693634d), 34.30685281944005d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7075093757430987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7848286465099108d + "'", double1 == 0.7848286465099108d);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        double double1 = org.apache.commons.math.util.FastMath.asin(45.41047360972814d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.8337422720523482d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.2083157409463713d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.550214026948225d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5502140269482249d) + "'", double1 == (-0.5502140269482249d));
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.15447239811366015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1670420650504933d + "'", double1 == 1.1670420650504933d);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8076349221631601d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0454926245955656d + "'", double1 == 1.0454926245955656d);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.084289455298593d) + "'", double1 == (-4.084289455298593d));
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6436460504146816d, 0.635381542950125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7558191731720005d + "'", double2 == 0.7558191731720005d);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.091604239627809d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9171523356672712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5021549377007268d + "'", double1 == 1.5021549377007268d);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        long long2 = org.apache.commons.math.util.FastMath.min(2L, (-4L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4L) + "'", long2 == (-4L));
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        long long1 = org.apache.commons.math.util.FastMath.round(1.410122136122596d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6321205588285577d) + "'", double1 == (-0.6321205588285577d));
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.3292773492529157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.059640238794054d + "'", double1 == 4.059640238794054d);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        long long2 = org.apache.commons.math.util.FastMath.min(15472906L, 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        double double2 = org.apache.commons.math.util.FastMath.min(4.5087686982174615d, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.5087686982174615d + "'", double2 == 4.5087686982174615d);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.7626139187213443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8132846413855772d) + "'", double1 == (-0.8132846413855772d));
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 1.2422079676186446d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        double double2 = org.apache.commons.math.util.FastMath.min(92560.48544260226d, (-2.675024856842625d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.675024856842625d) + "'", double2 == (-2.675024856842625d));
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.4576692332118569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.9936026854386766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0833737308639964d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.876278270531895d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5669767943827967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1650835072843442d + "'", double1 == 1.1650835072843442d);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        long long2 = org.apache.commons.math.util.FastMath.min(35L, (long) 149);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1752011936438014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.084066969169249d + "'", double1 == 1.084066969169249d);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3L, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5707963267948963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8104773809653505d + "'", double1 == 3.8104773809653505d);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        double double1 = org.apache.commons.math.util.FastMath.cos(8.467720335926631E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9934865306650267d) + "'", double1 == (-0.9934865306650267d));
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        double double1 = org.apache.commons.math.util.FastMath.log(1.22459997143478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2026142367355531d + "'", double1 == 0.2026142367355531d);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        long long2 = org.apache.commons.math.util.FastMath.max(2155615773557597L, 1477896L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2155615773557597L + "'", long2 == 2155615773557597L);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.9290529400482024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4667272212422093d + "'", double1 == 0.4667272212422093d);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        double double1 = org.apache.commons.math.util.FastMath.signum(7.93006726156715E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.9902697229065449d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3, 11013.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        double double1 = org.apache.commons.math.util.FastMath.acosh(57.29579257371756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.741298210530896d + "'", double1 == 4.741298210530896d);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8360321798777053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6963289254771234d + "'", double1 == 0.6963289254771234d);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.006625307971731655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000219474331413d + "'", double1 == 1.0000219474331413d);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        double double1 = org.apache.commons.math.util.FastMath.log(14.206130012655933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.653673562487557d + "'", double1 == 2.653673562487557d);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5039744651761873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        long long2 = org.apache.commons.math.util.FastMath.max(100L, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9428090415820634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        double double1 = org.apache.commons.math.util.FastMath.floor(96.10655605346268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.0d + "'", double1 == 96.0d);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        float float1 = org.apache.commons.math.util.FastMath.abs(1477896.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1477896.0f + "'", float1 == 1477896.0f);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.09531017980432487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0016634764482532738d + "'", double1 == 0.0016634764482532738d);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9702843181545027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9899950066593376d + "'", double1 == 0.9899950066593376d);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7075093757430987d, (double) 39481480091340L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.948148009134E13d + "'", double2 == 3.948148009134E13d);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.36787944117144233d, 0.021252051384784545d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3678794411714423d + "'", double2 == 0.3678794411714423d);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        float float1 = org.apache.commons.math.util.FastMath.abs(5.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.525881748669311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5258817486693113d + "'", double1 == 1.5258817486693113d);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.9171523356672742d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8215619185843577d) + "'", double1 == (-0.8215619185843577d));
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.09966865249116202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0014414133113334d) + "'", double1 == (-1.0014414133113334d));
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        double double2 = org.apache.commons.math.util.FastMath.min(1.9999999999999998d, 18.94750415825669d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9999999999999998d + "'", double2 == 1.9999999999999998d);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        double double1 = org.apache.commons.math.util.FastMath.log1p(32.307469852239215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5057816917175177d + "'", double1 == 3.5057816917175177d);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.327624706282431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 247.9546309865258d + "'", double1 == 247.9546309865258d);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8113741275700294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.761511811895975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8947254893223937d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 11013);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.99997885478613d + "'", double1 == 9.99997885478613d);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.58601345231343E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326794896d + "'", double1 == 1.570796326794896d);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        double double2 = org.apache.commons.math.util.FastMath.min(0.2413339035979167d, 1.0000002279510873d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2413339035979167d + "'", double2 == 0.2413339035979167d);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        long long2 = org.apache.commons.math.util.FastMath.min(2155615773557597L, 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        long long1 = org.apache.commons.math.util.FastMath.round(28.42845879209619d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 28L + "'", long1 == 28L);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0009877980461306d + "'", double1 == 1.0009877980461306d);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        long long1 = org.apache.commons.math.util.FastMath.round(1.7498537011943207d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6362495915029428d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01110465023619529d + "'", double1 == 0.01110465023619529d);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0314323214767873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 59.09671887400065d + "'", double1 == 59.09671887400065d);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.268524170518187d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.26852417051818694d) + "'", double1 == (-0.26852417051818694d));
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.130497003573102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(40.76402405185421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4415890906031725d + "'", double1 == 3.4415890906031725d);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '4', (-53.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.351950794486537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8745129512124437d + "'", double1 == 0.8745129512124437d);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.3283064365386963E-10d, 0.9157372585176266d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5091754965748117E-9d + "'", double2 == 1.5091754965748117E-9d);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6065871571457463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8341610016597678d + "'", double1 == 0.8341610016597678d);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.5063656411097588d), 5.303304908059076d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9418502147163486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7541871649905414d + "'", double1 == 1.7541871649905414d);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        long long1 = org.apache.commons.math.util.FastMath.round(3.9697296111063074d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.14287905018325442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0102245878389058d + "'", double1 == 1.0102245878389058d);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.7669782712368582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 84677176, 0.7852869460862587d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1681014.419118863d + "'", double2 == 1681014.419118863d);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        double double2 = org.apache.commons.math.util.FastMath.min(55.22296199276716d, 0.24468093598772875d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.24468093598772875d + "'", double2 == 0.24468093598772875d);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.281420761381717E21d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.08581296033843074d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08560294061168246d) + "'", double1 == (-0.08560294061168246d));
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0615776890930098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8909283794231584d + "'", double1 == 2.8909283794231584d);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.741298210530896d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9149994957367078d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        double double1 = org.apache.commons.math.util.FastMath.cos(803226.6141649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9961706744304772d) + "'", double1 == (-0.9961706744304772d));
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.618990892446662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8570531296713235d + "'", double1 == 1.8570531296713235d);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(12.425477704824782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 711.927430920361d + "'", double1 == 711.927430920361d);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2048.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.317766107114693d + "'", double1 == 8.317766107114693d);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.2554125869476498d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7150417460890065d) + "'", double1 == (-0.7150417460890065d));
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        double double1 = org.apache.commons.math.util.FastMath.acos((-11.811140782249282d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 1, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '#', (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.2146848510894035E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.214684851089401E-8d + "'", double1 == 4.214684851089401E-8d);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.0014414133113334d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.4996289686340808d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4052177232671116d + "'", double1 == 0.4052177232671116d);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.2764592626816604d, (-0.2723414689118315d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2764592626816602d + "'", double2 == 1.2764592626816602d);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.48837199120847863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8830978720823157d + "'", double1 == 0.8830978720823157d);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2764592626816604d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2764592626816607d + "'", double1 == 1.2764592626816607d);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 84677176L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.4677176E7d + "'", double1 == 8.4677176E7d);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.7799338781144556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.07453619030152617d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07439846418517579d) + "'", double1 == (-0.07439846418517579d));
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        double double1 = org.apache.commons.math.util.FastMath.acos((-7.52574989159953d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        int int2 = org.apache.commons.math.util.FastMath.min(57, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.927002471590281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6002341714155816d + "'", double1 == 0.6002341714155816d);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.025470578295336027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02547057829533603d + "'", double1 == 0.02547057829533603d);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.9991396955517629d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7849678260893329d) + "'", double1 == (-0.7849678260893329d));
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(11013.232920103304d, 1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11013.232920103303d + "'", double2 == 11013.232920103303d);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.24619002710729043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.3777255673228614d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.2554125869476498d), 1.939478423157959d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2554125869476498d) + "'", double2 == (-1.2554125869476498d));
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        long long1 = org.apache.commons.math.util.FastMath.round(0.32681535598557454d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0841005523291758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.956779154231204d + "'", double1 == 2.956779154231204d);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        double double1 = org.apache.commons.math.util.FastMath.sin((-14.04469065108256d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9957271142846829d) + "'", double1 == (-0.9957271142846829d));
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        double double1 = org.apache.commons.math.util.FastMath.acos(74.91202147768658d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        int int1 = org.apache.commons.math.util.FastMath.round(3.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        double double1 = org.apache.commons.math.util.FastMath.log(3.8286413964890955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.342510013496884d + "'", double1 == 1.342510013496884d);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9912373278715739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6887562183155683d + "'", double1 == 0.6887562183155683d);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 32, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1624084433472168d, 35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.00000000000001d + "'", double2 == 35.00000000000001d);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.4466128799118947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9922991399818323d + "'", double1 == 0.9922991399818323d);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.017453292519943295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 100, (long) 11013);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        double double1 = org.apache.commons.math.util.FastMath.abs(45.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.0d + "'", double1 == 45.0d);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) (-2));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2, (float) (-53));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5992428797223133d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7057759543134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15133314207536405d) + "'", double1 == (-0.15133314207536405d));
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.24871540768837d + "'", double1 == 22.24871540768837d);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8617100707735503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9515984431693014d + "'", double1 == 0.9515984431693014d);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        double double1 = org.apache.commons.math.util.FastMath.exp(49.80857186097813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2814207613817476E21d + "'", double1 == 4.2814207613817476E21d);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.3777255673228614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 79.65665351938952d + "'", double1 == 79.65665351938952d);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.3707603033998556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.43090677112216796d) + "'", double1 == (-0.43090677112216796d));
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.025196192240463114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02520152551308015d + "'", double1 == 0.02520152551308015d);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.026027646803929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7723102600487979d + "'", double1 == 0.7723102600487979d);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        double double1 = org.apache.commons.math.util.FastMath.asinh(5.725101101257968E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.84399620220857d + "'", double1 == 96.84399620220857d);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        float float1 = org.apache.commons.math.util.FastMath.abs(2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748365E9f + "'", float1 == 2.14748365E9f);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(53.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.280109889280518d + "'", double1 == 7.280109889280518d);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-36L), (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3235780930645504d, 2.1034585241152786d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3235780930645504d + "'", double2 == 1.3235780930645504d);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.217380259166629d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 127.0465304258725d + "'", double1 == 127.0465304258725d);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        int int2 = org.apache.commons.math.util.FastMath.min(35, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.147483648E9d + "'", double1 == 2.147483648E9d);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.240521134419134d, 0.9221885224184981d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3966070444871779d + "'", double2 == 1.3966070444871779d);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.00949495958537668d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7453292519943295d + "'", double1 == 1.7453292519943295d);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        long long1 = org.apache.commons.math.util.FastMath.round(5557.690612768985d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5558L + "'", long1 == 5558L);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5039744651761873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4081112474421564d + "'", double1 == 0.4081112474421564d);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        double double2 = org.apache.commons.math.util.FastMath.atan2(8.317766107114693d, 0.6103789692086523d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4975450646752215d + "'", double2 == 1.4975450646752215d);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        long long1 = org.apache.commons.math.util.FastMath.round(2.748779069440004E11d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 274877906944L + "'", long1 == 274877906944L);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        float float2 = org.apache.commons.math.util.FastMath.max(5.0f, (float) (-4L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8726936208978296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8726936208978298d + "'", double1 == 0.8726936208978298d);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        double double1 = org.apache.commons.math.util.FastMath.log(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0980197632589188d + "'", double1 == 1.0980197632589188d);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.006589358495248128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0065892631285295435d + "'", double1 == 0.0065892631285295435d);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        double double2 = org.apache.commons.math.util.FastMath.pow((-5.959891290659564d), (double) 274877906944L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        double double1 = org.apache.commons.math.util.FastMath.abs(1833.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1833.0d + "'", double1 == 1833.0d);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        double double1 = org.apache.commons.math.util.FastMath.log1p(13.596393407514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.680774471315522d + "'", double1 == 2.680774471315522d);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.7282657137693634d), 1.0504502603385693d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        float float2 = org.apache.commons.math.util.FastMath.min(149.0f, 1.5472906E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3603078162116136d, 2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3603078162116136d + "'", double2 == 1.3603078162116136d);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.4785470608465352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1828040514903277d + "'", double1 == 1.1828040514903277d);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7057759543134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 11013.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.755849220270756d) + "'", double1 == (-6.755849220270756d));
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.07492623841795108d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42157803635284585d) + "'", double1 == (-0.42157803635284585d));
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.2723414689118315d), 0.002205224069989189d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2723414689118314d) + "'", double2 == (-0.2723414689118314d));
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        long long2 = org.apache.commons.math.util.FastMath.min(5L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        double double1 = org.apache.commons.math.util.FastMath.log(0.13127977254262357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0304245648143593d) + "'", double1 == (-2.0304245648143593d));
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.22459997143478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9406701758307913d + "'", double1 == 0.9406701758307913d);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.99822295029797d + "'", double1 == 2.99822295029797d);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.585786437626905d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.556667905035692d + "'", double1 == 0.556667905035692d);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.017422180268940393d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5707651109236087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.003875819055588d + "'", double1 == 1.003875819055588d);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        double double1 = org.apache.commons.math.util.FastMath.log(352.78391767704466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.8658557382779835d + "'", double1 == 5.8658557382779835d);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.7522203923062025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        double double2 = org.apache.commons.math.util.FastMath.max(0.051269224554469806d, 0.5312987770791809d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5312987770791809d + "'", double2 == 0.5312987770791809d);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.1411917790307853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5253359862894805d + "'", double1 == 0.5253359862894805d);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-3.3805150062465854d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.380515006246585d) + "'", double1 == (-3.380515006246585d));
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 15472906L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.5472906E7f + "'", float1 == 1.5472906E7f);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.680482178387855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.330643198305168d + "'", double1 == 31.330643198305168d);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.31466697030166657d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3046768398228529d + "'", double1 == 0.3046768398228529d);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5015887158341327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1284552609919887d + "'", double1 == 1.1284552609919887d);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.339637404328899d, 127.0465304258725d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3592252572100584E16d + "'", double2 == 1.3592252572100584E16d);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        int int2 = org.apache.commons.math.util.FastMath.max(84677176, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 84677176 + "'", int2 == 84677176);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.585786437626905d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.4944324908505626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7907435667822754d) + "'", double1 == (-0.7907435667822754d));
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        double double1 = org.apache.commons.math.util.FastMath.cosh(6.907793317242678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0195194729837d + "'", double1 == 500.0195194729837d);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.4785470608465352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.4210854715202007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202007E-14d + "'", double1 == 1.4210854715202007E-14d);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        double double2 = org.apache.commons.math.util.FastMath.atan2(17.322108077097887d, 0.6890624663225461d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5310379237791845d + "'", double2 == 1.5310379237791845d);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        double double1 = org.apache.commons.math.util.FastMath.acos(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948957d + "'", double1 == 1.5707963267948957d);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        double double1 = org.apache.commons.math.util.FastMath.acosh(5.00264328101366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2929710785315947d + "'", double1 == 2.2929710785315947d);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.009507434581110117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000451959965992d + "'", double1 == 1.0000451959965992d);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        double double2 = org.apache.commons.math.util.FastMath.min(0.2026142367355531d, 2.301297204502775d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2026142367355531d + "'", double2 == 0.2026142367355531d);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.04084445256892067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3211090992020036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        double double1 = org.apache.commons.math.util.FastMath.sinh(215.5579348013961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0634389258010436E93d + "'", double1 == 2.0634389258010436E93d);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.4219132975121505d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(231.58466047909457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.041914822473389d + "'", double1 == 4.041914822473389d);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.011800076512800234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011800624231293425d + "'", double1 == 0.011800624231293425d);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.027414190085478973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027414190085478976d + "'", double1 == 0.027414190085478976d);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        float float2 = org.apache.commons.math.util.FastMath.min(3.0f, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 149L, 8.4677176E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        int int2 = org.apache.commons.math.util.FastMath.max((-36), 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        double double1 = org.apache.commons.math.util.FastMath.sin(14.899277193215994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7233806000137262d + "'", double1 == 0.7233806000137262d);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.23191437957608327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9930368739582951d), 0.7162579075638862d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        int int2 = org.apache.commons.math.util.FastMath.min(11013, 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 84677176);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6002341714155816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8225455384923368d + "'", double1 == 1.8225455384923368d);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-53L), (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 416128L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 416128 + "'", int1 == 416128);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.07439846418517579d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.776356839400252E-15d + "'", double1 == 1.776356839400252E-15d);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6535657774206833d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        double double1 = org.apache.commons.math.util.FastMath.cos((-34.657359027997266d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9950201419849896d) + "'", double1 == (-0.9950201419849896d));
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.6347792607040605d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.9936026854386766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.27631948176648663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9620660586936727d + "'", double1 == 0.9620660586936727d);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6108652381980155d, 0.7813863964118538d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6803629519678808d + "'", double2 == 0.6803629519678808d);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.741297982545108d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9995821638981217d) + "'", double1 == (-0.9995821638981217d));
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.7835271334741006d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7835271334741006d + "'", double1 == 0.7835271334741006d);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.9957271142846829d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.4828196330754233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9468959422161157d + "'", double1 == 0.9468959422161157d);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.7799338781144556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06597229168077529d + "'", double1 == 0.06597229168077529d);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        int int2 = org.apache.commons.math.util.FastMath.min(100, 84677176);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.693889518756616d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.647653479929832d) + "'", double1 == (-0.647653479929832d));
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        double double1 = org.apache.commons.math.util.FastMath.tanh(127.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        double double1 = org.apache.commons.math.util.FastMath.log(0.04084445256892067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.1979842669242053d) + "'", double1 == (-3.1979842669242053d));
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        int int2 = org.apache.commons.math.util.FastMath.max(149, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.002205218707991866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0022052151333469753d + "'", double1 == 0.0022052151333469753d);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        double double1 = org.apache.commons.math.util.FastMath.abs((-3.694990094719959d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.694990094719959d + "'", double1 == 3.694990094719959d);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        double double1 = org.apache.commons.math.util.FastMath.tan(9.99997885478613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483307938061412d + "'", double1 == 0.6483307938061412d);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.001739546146996826d, 5.240521134419134d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.319414307254659E-4d + "'", double2 == 3.319414307254659E-4d);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5013507798060324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6509498349092767d + "'", double1 == 0.6509498349092767d);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.02484888141034163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.024545168950693856d + "'", double1 == 0.024545168950693856d);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9012409891810162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9012409891810164d + "'", double1 == 0.9012409891810164d);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1224236947215336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 64.31014053302421d + "'", double1 == 64.31014053302421d);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.9961706744304772d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9987219253646197d) + "'", double1 == (-0.9987219253646197d));
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 149, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267831587699268d + "'", double1 == 5.267831587699268d);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        double double1 = org.apache.commons.math.util.FastMath.signum(8.168997321391517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.377725567322862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0923015001005143d + "'", double1 == 2.0923015001005143d);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5707963267948957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.810477380965347d + "'", double1 == 3.810477380965347d);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.650856032201109d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615560214388488d + "'", double1 == 0.7615560214388488d);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.5971542229890323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6115688700732067d + "'", double1 == 1.6115688700732067d);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.015388982106145104d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5310379237791845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5310379237791847d + "'", double1 == 1.5310379237791847d);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        long long2 = org.apache.commons.math.util.FastMath.min(2155615773557597L, 1586013452313419L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1586013452313419L + "'", long2 == 1586013452313419L);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5949065948500845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.348658628056262d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0559214943204758d + "'", double1 == 2.0559214943204758d);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.03700049997605E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49174338951939384d + "'", double1 == 0.49174338951939384d);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        int int1 = org.apache.commons.math.util.FastMath.round(1.5472906E7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15472906 + "'", int1 == 15472906);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 53.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        double double1 = org.apache.commons.math.util.FastMath.tanh(534.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(44.78115991081385d, 0.16690925682449867d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 44.78115991081384d + "'", double2 == 44.78115991081384d);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        double double2 = org.apache.commons.math.util.FastMath.min((double) '#', 0.9663516425671944d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9663516425671944d + "'", double2 == 0.9663516425671944d);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        double double1 = org.apache.commons.math.util.FastMath.sinh(416128.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.74342314569772E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        double double2 = org.apache.commons.math.util.FastMath.min((-2.984259713678174d), 43.12841819466121d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.984259713678174d) + "'", double2 == (-2.984259713678174d));
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        double double1 = org.apache.commons.math.util.FastMath.log(0.4149733479708179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8795409825708094d) + "'", double1 == (-0.8795409825708094d));
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1440689579547698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05845220204150941d + "'", double1 == 0.05845220204150941d);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        float float2 = org.apache.commons.math.util.FastMath.min((-2.0f), (float) (-4L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.0f) + "'", float2 == (-4.0f));
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.04084445256892067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.529940509100779d + "'", double1 == 1.529940509100779d);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.9171523356672744d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171523356672744d + "'", double1 == 0.9171523356672744d);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        int int2 = org.apache.commons.math.util.FastMath.min(416128, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 32, (long) 15472906);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15472906L + "'", long2 == 15472906L);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.9848929415691016d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) -1, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6813252169987396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011891368313492844d + "'", double1 == 0.011891368313492844d);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8113741275700294d, 36.000000000000014d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8113741275700294d + "'", double2 == 0.8113741275700294d);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.14121435915412675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        long long1 = org.apache.commons.math.util.FastMath.round(0.15747226777829929d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.7692799493082574d, 1.0504502603385693d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7692799493082572d + "'", double2 == 1.7692799493082572d);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        double double1 = org.apache.commons.math.util.FastMath.ceil(5.2846029059076024E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.2846029059076024E20d + "'", double1 == 5.2846029059076024E20d);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.7626139187213443d, 0.5127742681331149d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.762613918721344d + "'", double2 == 3.762613918721344d);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.09531017980432487d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 1, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0L, 1.58601345E15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.58601345E15f + "'", float2 == 1.58601345E15f);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5896069690147184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8032795313693359d + "'", double1 == 0.8032795313693359d);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        double double2 = org.apache.commons.math.util.FastMath.atan2(22.24871540768837d, (-27.03274004183787d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.452966821957258d + "'", double2 == 2.452966821957258d);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 53, 0.5623823663631259d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.326148873149265d + "'", double2 == 9.326148873149265d);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9984579799537394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5415992281085693d + "'", double1 == 0.5415992281085693d);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 10, 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.18487140694284424d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.87735959904093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998839663167365d + "'", double1 == 0.9998839663167365d);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-34.657359027997266d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 11013.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.999978850663648d + "'", double1 == 9.999978850663648d);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6436460504146816d, 0.43305085726475895d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6436460504146815d + "'", double2 == 0.6436460504146815d);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7245474750742176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.32220799131551875d) + "'", double1 == (-0.32220799131551875d));
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.7711544466071394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647L, 2.15561577E15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        long long2 = org.apache.commons.math.util.FastMath.min(416128L, 1586013452313419L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 416128L + "'", long2 == 416128L);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.8934964811466461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0624656259075147d + "'", double1 == 1.0624656259075147d);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1262023.527631695d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5310379237791845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4259458869626107d + "'", double1 == 0.4259458869626107d);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(500.0195194729837d, 0.003761435487319938d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 500.01951947298363d + "'", double2 == 500.01951947298363d);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        int int1 = org.apache.commons.math.util.FastMath.abs(1477896);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1477896 + "'", int1 == 1477896);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5707963267948961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        float float2 = org.apache.commons.math.util.FastMath.max(10.0f, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1705482956267237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02042992181229427d + "'", double1 == 0.02042992181229427d);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7658461948190802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013366537663462888d + "'", double1 == 0.013366537663462888d);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.0035151680352298246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7266953932355397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.628418575037306d + "'", double1 == 0.628418575037306d);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        double double1 = org.apache.commons.math.util.FastMath.log(0.0026285273327564763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.941331539144997d) + "'", double1 == (-5.941331539144997d));
    }
}

