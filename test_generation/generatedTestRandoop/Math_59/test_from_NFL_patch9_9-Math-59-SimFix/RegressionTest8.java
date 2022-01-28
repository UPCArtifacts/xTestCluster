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
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 2.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3169578969248166d + "'", double1 == 1.3169578969248166d);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1477896.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1477896.0000000002d + "'", double1 == 1477896.0000000002d);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8461684323333869d, 1.176259623626705d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.846168432333387d + "'", double2 == 0.846168432333387d);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0051542672067486d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5915576703333734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.8410058489917948d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3749872852413327d + "'", double1 == 1.3749872852413327d);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        double double1 = org.apache.commons.math.util.FastMath.acosh(5.47816931894628E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.722354182756217d + "'", double1 == 27.722354182756217d);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.12300481949001142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.130889871246794d + "'", double1 == 1.130889871246794d);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        double double1 = org.apache.commons.math.util.FastMath.asinh(100.69314718055996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.3052495822221415d + "'", double1 == 5.3052495822221415d);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8668856945829327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.931066965681273d + "'", double1 == 0.931066965681273d);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.267013246259975d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.189933027900477d) + "'", double1 == (-3.189933027900477d));
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.3707603033998556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.43090677112216796d) + "'", double1 == (-0.43090677112216796d));
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.035124005767007416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03513846058079957d + "'", double1 == 0.03513846058079957d);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        long long2 = org.apache.commons.math.util.FastMath.min(2147483647L, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        long long2 = org.apache.commons.math.util.FastMath.max(1833L, (long) 11013);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8700022875052251d, 2.6878438789017723E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8700022875052251d + "'", double2 == 0.8700022875052251d);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.7174132092735896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04742780763900985d + "'", double1 == 0.04742780763900985d);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9917318921852735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5294446044440393d + "'", double1 == 1.5294446044440393d);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '#', (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8813735870195429d) + "'", double1 == (-0.8813735870195429d));
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.999303822951033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5550255395263828d + "'", double1 == 1.5550255395263828d);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 148.4131591025766d + "'", double1 == 148.4131591025766d);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.344058570908087E43d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2L, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.04191482247339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.476411608537223d + "'", double1 == 28.476411608537223d);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        float float2 = org.apache.commons.math.util.FastMath.max(3.9481478E13f, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.175201187282749d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020511130091430484d + "'", double1 == 0.020511130091430484d);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        float float2 = org.apache.commons.math.util.FastMath.max(3.0f, (float) 11013);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.414062290979883d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        int int2 = org.apache.commons.math.util.FastMath.min((-53), (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.053086467974937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 174.92896910346727d + "'", double1 == 174.92896910346727d);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9453625312870415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016499688795946783d + "'", double1 == 0.016499688795946783d);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.5777877754722899d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.20787957635076193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21092668861480754d + "'", double1 == 0.21092668861480754d);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5298038334472444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9103910184992512d + "'", double1 == 0.9103910184992512d);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.375500687858178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.980990341745093d + "'", double1 == 0.980990341745093d);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        long long2 = org.apache.commons.math.util.FastMath.min(1833L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.4577979139729036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6433380240448354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9028219555251866d + "'", double1 == 0.9028219555251866d);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7212254887267799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6176678248388561d + "'", double1 == 0.6176678248388561d);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.067661995777765d + "'", double1 == 10.067661995777765d);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.011800076512800236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9281151766786875d) + "'", double1 == (-1.9281151766786875d));
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        float float2 = org.apache.commons.math.util.FastMath.max(1833.0f, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1833.0f + "'", float2 == 1833.0f);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-53.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.663528081877013d) + "'", double1 == (-4.663528081877013d));
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 8L, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        float float2 = org.apache.commons.math.util.FastMath.max(1477896.0f, (float) 57);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(100.00000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000000000002d + "'", double1 == 10.000000000000002d);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        double double2 = org.apache.commons.math.util.FastMath.max(3.162277660168379d, (-0.5259944849453191d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.162277660168379d + "'", double2 == 3.162277660168379d);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9999929257765152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.9250245035569947d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7071067811865475d, 0.7926396995186359d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7926396995186359d + "'", double2 == 0.7926396995186359d);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        long long2 = org.apache.commons.math.util.FastMath.min(35L, (long) 11013);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.5321070224790865E26d, (-0.39592515018183416d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5707963274966377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.509178480272973d + "'", double1 == 2.509178480272973d);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5707055250154314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707055250154316d + "'", double1 == 1.5707055250154316d);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-35.35050620855721d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        double double1 = org.apache.commons.math.util.FastMath.rint(8.467720335926631E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.4677203E7d + "'", double1 == 8.4677203E7d);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.056630991823551025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05663099182355103d + "'", double1 == 0.05663099182355103d);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, (-36L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.455841039450451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3500296991663472d + "'", double1 == 1.3500296991663472d);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.023974957339495964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023977254200743377d + "'", double1 == 0.023977254200743377d);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7237289657353609d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0621084231003282d + "'", double1 == 1.0621084231003282d);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9185375499501867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3092866533194534d + "'", double1 == 1.3092866533194534d);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 3.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (-3.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9950547536867305d) + "'", double1 == (-0.9950547536867305d));
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        long long1 = org.apache.commons.math.util.FastMath.round(0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.242605345373291d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        double double1 = org.apache.commons.math.util.FastMath.log(8525.954375188212d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.05087024605447d + "'", double1 == 9.05087024605447d);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.1240849833762582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1240849833762582d + "'", double1 == 0.1240849833762582d);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.7507239941348802d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.030555897991319556d) + "'", double1 == (-0.030555897991319556d));
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        double double1 = org.apache.commons.math.util.FastMath.floor(7.280109889280518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-3), (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0f) + "'", float2 == (-3.0f));
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0003963416279558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5399687534597263d + "'", double1 == 0.5399687534597263d);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.262451664828748d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        double double2 = org.apache.commons.math.util.FastMath.pow(11.548739357257741d, 100.00000000000003d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.792495150309638E106d + "'", double2 == 1.792495150309638E106d);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.01645512199317914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        double double1 = org.apache.commons.math.util.FastMath.exp(5.334683477013125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 207.40708930571046d + "'", double1 == 207.40708930571046d);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.7171092768909919d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9016684086532855d) + "'", double1 == (-0.9016684086532855d));
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) '4', 0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5604062717320897d + "'", double2 == 1.5604062717320897d);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.44855772084253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8086089434116457d + "'", double1 == 1.8086089434116457d);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) (-36));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.0d) + "'", double1 == (-36.0d));
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8491928178865491d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6147492292213783d + "'", double1 == 0.6147492292213783d);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(14.206129690390002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 813.951274474838d + "'", double1 == 813.951274474838d);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.4657359027997265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.0d + "'", double1 == 31.0d);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.0133109241786307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.488068777620869d + "'", double1 == 7.488068777620869d);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        double double2 = org.apache.commons.math.util.FastMath.min(11013.232874695796d, 1.5705870643612196d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5705870643612196d + "'", double2 == 1.5705870643612196d);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        double double1 = org.apache.commons.math.util.FastMath.signum(200.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6089008978477989d, 0.8632695193447204d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6516368856569676d + "'", double2 == 0.6516368856569676d);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        double double2 = org.apache.commons.math.util.FastMath.min(0.646957225053178d, 0.28630352695323197d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.28630352695323197d + "'", double2 == 0.28630352695323197d);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-3.0972644080713274d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.8554182836643193d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8554182836643193d + "'", double1 == 0.8554182836643193d);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8693235746902677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8693235746902677d + "'", double1 == 0.8693235746902677d);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 72, (float) (-36L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1594624155482454d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.399216241149525E248d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3023186765274488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0798639893280937d + "'", double1 == 1.0798639893280937d);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.8097187196293865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.1377407200944d + "'", double1 == 44.1377407200944d);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1433548139665488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        double double1 = org.apache.commons.math.util.FastMath.rint((-4.278070357299329d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.0d) + "'", double1 == (-4.0d));
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6085491459180241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5431049991994821d + "'", double1 == 0.5431049991994821d);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.21276782429758892d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5456620010518718d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.377725567322862d, 2.2204460492503128E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000002d + "'", double2 == 1.0000000000000002d);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5604874136486533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2491947060601294d + "'", double1 == 1.2491947060601294d);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4689057088038129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5982442912835338d + "'", double1 == 0.5982442912835338d);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5705870643612196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.8094708340813614d + "'", double1 == 4.8094708340813614d);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.6109179126442243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 206.89035656270292d + "'", double1 == 206.89035656270292d);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3340213222681154E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3340213311661798E-8d + "'", double1 == 1.3340213311661798E-8d);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        double double2 = org.apache.commons.math.util.FastMath.max(1.4856741544225798d, 0.21819433807844027d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4856741544225798d + "'", double2 == 1.4856741544225798d);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(11013.232874703413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 192.21717495245468d + "'", double1 == 192.21717495245468d);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8593867635096132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7783730288530368d + "'", double1 == 0.7783730288530368d);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) (-3));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.049787068367863944d + "'", double1 == 0.049787068367863944d);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        int int2 = org.apache.commons.math.util.FastMath.min(11013, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 97);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6535657774206832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5943927097962464d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1819139347123162d + "'", double1 == 1.1819139347123162d);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.646957225053178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3297402172855466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1531436238758581d + "'", double1 == 1.1531436238758581d);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(272.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 272.00000000000006d + "'", double1 == 272.00000000000006d);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 36.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36L + "'", long1 == 36L);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3348400172962347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.7418898236506195d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        long long2 = org.apache.commons.math.util.FastMath.min(3L, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        double double1 = org.apache.commons.math.util.FastMath.log(0.22123522076451269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5085287961297d) + "'", double1 == (-1.5085287961297d));
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        double double2 = org.apache.commons.math.util.FastMath.max(0.48627885708638907d, 0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6931471805599453d + "'", double2 == 0.6931471805599453d);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32L, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 53.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 53.0d + "'", double2 == 53.0d);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8726936208978296d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.4898102688480725d, 0.34414869499056433d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1470511776466854d + "'", double2 == 1.1470511776466854d);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.152127757479647d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.49555014055642926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5184680970211729d) + "'", double1 == (-0.5184680970211729d));
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.10600733624570037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3255876782768359d + "'", double1 == 0.3255876782768359d);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        double double1 = org.apache.commons.math.util.FastMath.floor(533.252579626545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 533.0d + "'", double1 == 533.0d);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-61.225361138336666d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-61.22536113833666d) + "'", double1 == (-61.22536113833666d));
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.7541941649741823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9919274478344264d + "'", double1 == 0.9919274478344264d);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        double double1 = org.apache.commons.math.util.FastMath.exp(22026.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        double double1 = org.apache.commons.math.util.FastMath.tan(7.2638973976934574E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6789474239703004d + "'", double1 == 0.6789474239703004d);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        double double1 = org.apache.commons.math.util.FastMath.tan((-35.99999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.750470905698713d) + "'", double1 == (-7.750470905698713d));
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.049787068367863944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.049787068367863944d + "'", double1 == 0.049787068367863944d);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.4416248142133119d, 5.551115123125784E-17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8197546798628417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9609825412972041d + "'", double1 == 0.9609825412972041d);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7966043547446022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2179965971834452d + "'", double1 == 1.2179965971834452d);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        long long2 = org.apache.commons.math.util.FastMath.min(53L, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        long long1 = org.apache.commons.math.util.FastMath.round(0.4932054413052554d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-53.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.39550023939513446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41749914352885914d + "'", double1 == 0.41749914352885914d);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 72, 72L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 72L + "'", long2 == 72L);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6701982005616954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2331159284334476d + "'", double1 == 1.2331159284334476d);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        double double2 = org.apache.commons.math.util.FastMath.min((-4.663528081877013d), 1.3749872852413327d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.663528081877013d) + "'", double2 == (-4.663528081877013d));
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        double double1 = org.apache.commons.math.util.FastMath.cos(104.9439511105971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.29494961238899225d) + "'", double1 == (-0.29494961238899225d));
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 1.1139433523068367d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        double double2 = org.apache.commons.math.util.FastMath.min(5.33632941342054d, 0.1423973302809369d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1423973302809369d + "'", double2 == 0.1423973302809369d);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.792495150309638E106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.037035976334486E90d + "'", double1 == 2.037035976334486E90d);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.1752011936438014d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1752011936438014d) + "'", double2 == (-1.1752011936438014d));
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7251533457729202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8112570643423485d + "'", double1 == 0.8112570643423485d);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7938702090612697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3320161349050261d + "'", double1 == 1.3320161349050261d);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', (-36L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(6.894806889943192E27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.303497389620347E13d + "'", double1 == 8.303497389620347E13d);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 57, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1477896, (float) 11013L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.4577979139729038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2964878675680054d + "'", double1 == 3.2964878675680054d);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.586013452313442E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41653661616751786d) + "'", double1 == (-0.41653661616751786d));
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        double double1 = org.apache.commons.math.util.FastMath.log(0.20494781863014405d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5849998755129548d) + "'", double1 == (-1.5849998755129548d));
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        long long2 = org.apache.commons.math.util.FastMath.max(2L, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        double double1 = org.apache.commons.math.util.FastMath.signum(8525.954375188212d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.38559616115412315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41386729841516146d) + "'", double1 == (-0.41386729841516146d));
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8199744766146694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6868023880361244d + "'", double1 == 0.6868023880361244d);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.2246467991473532E-16d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7191015686156517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3297526675165189d) + "'", double1 == (-0.3297526675165189d));
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        int int2 = org.apache.commons.math.util.FastMath.max(53, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2147483647, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5133236589758516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.9778913495481287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        long long2 = org.apache.commons.math.util.FastMath.min(1477896L, 72L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 72L + "'", long2 == 72L);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1470511776466854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020019819738813043d + "'", double1 == 0.020019819738813043d);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-59.10786673843406d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.895367428170235d) + "'", double1 == (-3.895367428170235d));
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8414709848078965d, 1.163964051005108d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.163964051005108d + "'", double2 == 1.163964051005108d);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9918956474731391d, 2.6069417913449664d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9918956474731392d + "'", double2 == 0.9918956474731392d);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        float float1 = org.apache.commons.math.util.FastMath.abs(4.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0001456277756542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.8189894035458565E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.818989403545857E-12d + "'", double1 == 1.818989403545857E-12d);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        double double1 = org.apache.commons.math.util.FastMath.asinh(442413.3920089205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.693147180561223d + "'", double1 == 13.693147180561223d);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9998039600078416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.514743325056726E-5d) + "'", double1 == (-8.514743325056726E-5d));
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        double double2 = org.apache.commons.math.util.FastMath.min((-2.5049299044217186d), (-3.6268604078470186d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.6268604078470186d) + "'", double2 == (-3.6268604078470186d));
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.7456418720467646d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-100.01791180959569d) + "'", double1 == (-100.01791180959569d));
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.2350469597522027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1740434439996548d + "'", double1 == 1.1740434439996548d);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-8.711666086263719d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-499.14169927016286d) + "'", double1 == (-499.14169927016286d));
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 4L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.399216241149525E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.892038097483659d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.394284041695768d) + "'", double1 == (-1.394284041695768d));
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.7182818284590458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.043734674009951d + "'", double1 == 1.043734674009951d);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        double double2 = org.apache.commons.math.util.FastMath.min((-61.22536113833666d), 0.7074254741780729d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-61.22536113833666d) + "'", double2 == (-61.22536113833666d));
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        long long2 = org.apache.commons.math.util.FastMath.min((-2L), (long) 72);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        long long1 = org.apache.commons.math.util.FastMath.round(2.56173368499807d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9751009553485449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7727923643371758d + "'", double1 == 0.7727923643371758d);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        long long1 = org.apache.commons.math.util.FastMath.round(0.01745417873758517d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.2950149647750298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022602274997922656d + "'", double1 == 0.022602274997922656d);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        long long1 = org.apache.commons.math.util.FastMath.abs(1833L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1833L + "'", long1 == 1833L);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(18.72514057803899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1072.8715259107928d + "'", double1 == 1072.8715259107928d);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.7162633894119443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7162633894119446d + "'", double1 == 1.7162633894119446d);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.01668941079530856d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.07414666724177091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42011083099619667d + "'", double1 == 0.42011083099619667d);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        float float2 = org.apache.commons.math.util.FastMath.max(8.0f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.21603772555018477d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21273831587189979d) + "'", double1 == (-0.21273831587189979d));
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.3284512750821519d), 2.2239800905693157d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5166364975962761d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6763796495118177d + "'", double1 == 0.6763796495118177d);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.9778913495481287d, 1.402867870327277d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.603351882902383d + "'", double2 == 2.603351882902383d);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.251366653795176d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2568711084276258d) + "'", double1 == (-0.2568711084276258d));
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8813735870195443d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.004930039400314648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000121526688588d + "'", double1 == 1.0000121526688588d);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.5656994050637372d), 0.7783730288530368d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        double double2 = org.apache.commons.math.util.FastMath.min(0.24434609527920614d, 34.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.24434609527920614d + "'", double2 == 0.24434609527920614d);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5716315636979223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9623033716478188d + "'", double1 == 0.9623033716478188d);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.0017885395854308759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0017885376783291472d + "'", double1 == 0.0017885376783291472d);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        double double1 = org.apache.commons.math.util.FastMath.exp((-77.26503394947866d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7811352629728695E-34d + "'", double1 == 2.7811352629728695E-34d);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        double double1 = org.apache.commons.math.util.FastMath.atanh(5.729577951308232d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.719463918234335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1372666353170484d + "'", double1 == 1.1372666353170484d);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.019765178226982465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999804675223787d + "'", double1 == 0.999804675223787d);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        long long1 = org.apache.commons.math.util.FastMath.round(5.729577951308232d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8479985663995262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9533488279004556d + "'", double1 == 0.9533488279004556d);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.8557005192018434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 47.26171308520733d + "'", double1 == 47.26171308520733d);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-29.012614126025312d) + "'", double1 == (-29.012614126025312d));
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.848501131276805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.02350739754725d + "'", double1 == 2.02350739754725d);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        double double1 = org.apache.commons.math.util.FastMath.acos(5.477053318335443E41d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, (-3L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 'a', (float) 72);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.041914824263685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.458847850898053d + "'", double1 == 28.458847850898053d);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7189991032004813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6233635614632341d + "'", double1 == 0.6233635614632341d);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.28738952988751526d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9434257847789064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6644522842053634d + "'", double1 == 0.6644522842053634d);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7162579075638862d, 11014.999999999998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7162579075638863d + "'", double2 == 0.7162579075638863d);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.48627885708638907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4862788570863891d + "'", double1 == 0.4862788570863891d);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5550255395263828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.509011168189731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9997576181915098d + "'", double1 == 0.9997576181915098d);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.9107344921579834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3334287966108627d) + "'", double1 == (-0.3334287966108627d));
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.2374628952287586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23746289522875863d + "'", double1 == 0.23746289522875863d);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5707055250154316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0038586335035662d + "'", double1 == 1.0038586335035662d);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) (-1), 9.138520470401178E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999999d) + "'", double2 == (-0.9999999999999999d));
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.761511811895975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.9434257847789064d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2328145148497662d) + "'", double1 == (-1.2328145148497662d));
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.2130532941206642d), 49.63039286521482d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2130532941206642d) + "'", double2 == (-1.2130532941206642d));
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6997597439205169d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9849610023458857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.677707458075602d + "'", double1 == 2.677707458075602d);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.10862815709014047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10841464634038782d + "'", double1 == 0.10841464634038782d);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        double double1 = org.apache.commons.math.util.FastMath.acos(23151.90693368639d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        double double1 = org.apache.commons.math.util.FastMath.log(35.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.555348061489414d + "'", double1 == 3.555348061489414d);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.356568665264778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8572066056224252d + "'", double1 == 0.8572066056224252d);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5436613490374845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9960029898367354d + "'", double1 == 0.9960029898367354d);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        double double2 = org.apache.commons.math.util.FastMath.max(0.07463853704904692d, 2.6069417913449664d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6069417913449664d + "'", double2 == 2.6069417913449664d);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.26221266393298326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25921821707943726d + "'", double1 == 0.25921821707943726d);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 35, 8L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.2710663101885893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2710663101885893d + "'", double1 == 3.2710663101885893d);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.020019819738813043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2L), (float) 11013);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.2015841995251386E-10d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.723728965735361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14042404529948058d) + "'", double1 == (-0.14042404529948058d));
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.6370255026277432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1785603199102086d + "'", double1 == 1.1785603199102086d);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1116752822606313d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0359194400831782d + "'", double1 == 1.0359194400831782d);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        long long1 = org.apache.commons.math.util.FastMath.abs(4L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.6576833375608168d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5180500925877483d + "'", double1 == 0.5180500925877483d);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9659700754028168d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38061379651184485d + "'", double1 == 0.38061379651184485d);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        double double1 = org.apache.commons.math.util.FastMath.tan(630998.4197775756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11097837805695132d + "'", double1 == 0.11097837805695132d);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        double double1 = org.apache.commons.math.util.FastMath.tanh(100.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9997844910483683d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.881221190967907d + "'", double1 == 0.881221190967907d);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(23.140692632779267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.810477380965351d + "'", double1 == 4.810477380965351d);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) -1, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (-2L), 0.99998657637409d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.0d) + "'", double2 == (-2.0d));
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        int int2 = org.apache.commons.math.util.FastMath.min(72, 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72 + "'", int2 == 72);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        double double1 = org.apache.commons.math.util.FastMath.floor((-53.00704927389939d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-54.0d) + "'", double1 == (-54.0d));
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2005.3522829578812d, (-0.6759364361843173d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5711333929634348d + "'", double2 == 1.5711333929634348d);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7805951733159242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.011800076512800234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0595018713561488E-4d + "'", double1 == 2.0595018713561488E-4d);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        long long1 = org.apache.commons.math.util.FastMath.round(13.782153736230454d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 14L + "'", long1 == 14L);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.506976913724955d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8112570643423485d, 3.3305834282671767d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2389254154223536d + "'", double2 == 0.2389254154223536d);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        long long1 = org.apache.commons.math.util.FastMath.round(0.08558186793850525d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1833L, (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1833.0f + "'", float2 == 1833.0f);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.9250245035569947d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9250245035569946d) + "'", double1 == (-0.9250245035569946d));
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6065871571457463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4999068558183408d) + "'", double1 == (-0.4999068558183408d));
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.7950337271198835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3651941488254717d + "'", double1 == 1.3651941488254717d);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 11013L, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1470511776466854d, (-0.21809990377316002d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9705211365109137d + "'", double2 == 0.9705211365109137d);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.223372036854776E18d + "'", double1 == 9.223372036854776E18d);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4477855.166669106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.314654955631479d + "'", double1 == 15.314654955631479d);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.6759364361843173d), (-1.0316268884157165d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 57, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        double double2 = org.apache.commons.math.util.FastMath.min(23.620277154609447d, 1.2045352723380653d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2045352723380653d + "'", double2 == 1.2045352723380653d);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.883847335314108d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        double double1 = org.apache.commons.math.util.FastMath.tan(8.673617379884035E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.673617379884035E-19d + "'", double1 == 8.673617379884035E-19d);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.2442033263957681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0755496237970386d + "'", double1 == 1.0755496237970386d);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.017023944947506645d), 64.40683631162594d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.017023944947506642d) + "'", double2 == (-0.017023944947506642d));
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        long long2 = org.apache.commons.math.util.FastMath.min(97L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        double double1 = org.apache.commons.math.util.FastMath.log(2.5971542229890323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9544163159728498d + "'", double1 == 0.9544163159728498d);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.01645512199317914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016454379408150685d + "'", double1 == 0.016454379408150685d);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        double double1 = org.apache.commons.math.util.FastMath.asinh(5.3052495822221415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3706102964440734d + "'", double1 == 2.3706102964440734d);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0798639893280937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.94427907045667d + "'", double1 == 2.94427907045667d);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.5915576703333734d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.9355072424226104d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7520896312851567d) + "'", double1 == (-0.7520896312851567d));
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9754001961551926d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.895646744719586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        double double2 = org.apache.commons.math.util.FastMath.max((-4.934593734201322E-4d), 0.6341811450608946d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6341811450608946d + "'", double2 == 0.6341811450608946d);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 53);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.00000000000001d + "'", double1 == 53.00000000000001d);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7964493619549832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.022350304650365d + "'", double1 == 1.022350304650365d);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9179618963970241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7249318159569607d + "'", double1 == 0.7249318159569607d);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.25469727314226837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.032611072057901d + "'", double1 == 1.032611072057901d);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.4541594839761731d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        double double2 = org.apache.commons.math.util.FastMath.pow(11.548739357257746d, 35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5442239942543037E37d + "'", double2 == 1.5442239942543037E37d);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7328603869760997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(89.4270613023165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.471874976475479d + "'", double1 == 4.471874976475479d);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7763470636942515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3168008123704915d + "'", double1 == 1.3168008123704915d);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.251952459411674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        double double1 = org.apache.commons.math.util.FastMath.sin(28.45884779991685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1834687238125812d) + "'", double1 == (-0.1834687238125812d));
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8623188722876839d, (-0.24882151940824415d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8517150827024451d + "'", double2 == 1.8517150827024451d);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9968116020407186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07987607545345242d + "'", double1 == 0.07987607545345242d);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9126599178967103d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5013507798060324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.128330879172867d + "'", double1 == 1.128330879172867d);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        double double2 = org.apache.commons.math.util.FastMath.min(2.3852968325547366d, 1.000007100844429d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000007100844429d + "'", double2 == 1.000007100844429d);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.5321070224790865E26d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.42011083099619667d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.000423867565398E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0004239742659785E-4d + "'", double1 == 4.0004239742659785E-4d);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.24266079489065126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24759945880815834d + "'", double1 == 0.24759945880815834d);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.506844020238002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.026299389467141204d) + "'", double1 == (-0.026299389467141204d));
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.9600876852440052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4376760684376033d) + "'", double1 == (-2.4376760684376033d));
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.45642327729008136d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4564232772900813d) + "'", double1 == (-0.4564232772900813d));
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1833L, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        float float2 = org.apache.commons.math.util.FastMath.min((float) ' ', (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1477896 + "'", int2 == 1477896);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7727923643371758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.698137190187897d + "'", double1 == 0.698137190187897d);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.088887490341629E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.3108872417680944E-30d + "'", double1 == 6.3108872417680944E-30d);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        double double2 = org.apache.commons.math.util.FastMath.pow(71.39110387530145d, (-3.189933027900477d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.221798175510835E-6d + "'", double2 == 1.221798175510835E-6d);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        double double1 = org.apache.commons.math.util.FastMath.atan(64.40683631162594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5552712721030326d + "'", double1 == 1.5552712721030326d);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        double double1 = org.apache.commons.math.util.FastMath.floor(100.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        int int2 = org.apache.commons.math.util.FastMath.min(2, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.62129253189115E-6d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999983787087824d + "'", double1 == 0.9999983787087824d);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1), (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        double double1 = org.apache.commons.math.util.FastMath.log(573.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.35088571671474d + "'", double1 == 6.35088571671474d);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.39415474995637106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48313004522679587d + "'", double1 == 0.48313004522679587d);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0591373678933207d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.30559714930590764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9536674626523927d + "'", double1 == 0.9536674626523927d);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.11022806535638537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4603438160905373d + "'", double1 == 1.4603438160905373d);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.24929524866556063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5707963274966374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.01740826388532E-10d) + "'", double1 == (-7.01740826388532E-10d));
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        float float2 = org.apache.commons.math.util.FastMath.min(11013.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.21092668861480754d, 0.8555035296395697d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.26411443765382414d + "'", double2 == 0.26411443765382414d);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8094437199630216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8094437199630216d + "'", double1 == 0.8094437199630216d);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6799781366958019d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8246078684416017d + "'", double1 == 0.8246078684416017d);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        double double1 = org.apache.commons.math.util.FastMath.acosh(48.83850327565627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.581561354348932d + "'", double1 == 4.581561354348932d);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-4.9E-324d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        int int2 = org.apache.commons.math.util.FastMath.min(57, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.6666666666666667d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2837956627431926d + "'", double1 == 1.2837956627431926d);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6890624663225461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.597379374759859d + "'", double1 == 0.597379374759859d);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5707055250154316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171379122748513d + "'", double1 == 0.9171379122748513d);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.023970364804932462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023970364804932462d + "'", double1 == 0.023970364804932462d);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.154434690031884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5142773362439195d) + "'", double1 == (-1.5142773362439195d));
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.07987607545345242d, (double) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0024961221737729742d + "'", double2 == 0.0024961221737729742d);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8700022875052251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.386916313601571d + "'", double1 == 1.386916313601571d);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.6169827255860205d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.959675187910034d) + "'", double1 == (-0.959675187910034d));
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8364454861264231d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8364454861264232d + "'", double1 == 0.8364454861264232d);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.4657359027997265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 198.57204013738644d + "'", double1 == 198.57204013738644d);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5259944849453191d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8072233764829364d) + "'", double1 == (-0.8072233764829364d));
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 36L, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(231.58466047909457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 231.5846604790946d + "'", double1 == 231.5846604790946d);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.40910736701644745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.010374668122887301d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-7.01740826388532E-10d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.017408261423119E-10d) + "'", double1 == (-7.017408261423119E-10d));
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.1289051803966543d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1137498498793765d + "'", double1 == 2.1137498498793765d);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8973607083412377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9472912478964628d + "'", double1 == 0.9472912478964628d);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2665841925237464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.8407970089415017d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8407970089415016d) + "'", double1 == (-0.8407970089415016d));
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        long long2 = org.apache.commons.math.util.FastMath.min(53L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53L + "'", long2 == 53L);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6574149189921918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2239931820987016d + "'", double1 == 1.2239931820987016d);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0037857698423101618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0037929449205005d + "'", double1 == 1.0037929449205005d);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        double double1 = org.apache.commons.math.util.FastMath.sinh(23151.90693368639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9999983787087824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.56899560935137d + "'", double1 == 1.56899560935137d);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7615941559557649d) + "'", double1 == (-0.7615941559557649d));
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3168008123704915d, 0.9453625312870415d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3168008123704913d + "'", double2 == 1.3168008123704913d);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        double double2 = org.apache.commons.math.util.FastMath.min(9.612434767874704E-6d, 0.9550315978940166d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.612434767874704E-6d + "'", double2 == 9.612434767874704E-6d);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6521128841879388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6993242523789821d + "'", double1 == 0.6993242523789821d);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.0016855752345481393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6535657774206833d, 1.2239931820987016d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6535657774206833d + "'", double2 == 0.6535657774206833d);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9705211365109137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.029922097619078235d) + "'", double1 == (-0.029922097619078235d));
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        double double1 = org.apache.commons.math.util.FastMath.log10(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.302190676759448d + "'", double1 == 3.302190676759448d);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7346342576927686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7346342576927686d + "'", double1 == 0.7346342576927686d);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        int int2 = org.apache.commons.math.util.FastMath.min(72, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        long long2 = org.apache.commons.math.util.FastMath.max(14L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5163039218686447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        double double1 = org.apache.commons.math.util.FastMath.atanh(11013.000000000002d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1477896, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9751009553485449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01701872221017432d + "'", double1 == 0.01701872221017432d);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        double double2 = org.apache.commons.math.util.FastMath.min(1.594985873324243E-5d, 2.41014226417523d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.594985873324243E-5d + "'", double2 == 1.594985873324243E-5d);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.07074101207510715d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5013507798060324d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 11013);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 11013L + "'", long1 == 11013L);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(14.476482730108396d, 2.238952695683498d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.476482730108394d + "'", double2 == 14.476482730108394d);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.529104380392399d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.44855772084253d, 0.13134879548499653d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4485577208425298d + "'", double2 == 2.4485577208425298d);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.7162633894119443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1349753073117674d + "'", double1 == 1.1349753073117674d);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3L, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 1477896L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        float float2 = org.apache.commons.math.util.FastMath.max(2.0f, 1833.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1833.0f + "'", float2 == 1833.0f);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0798639893280937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9442790704566704d + "'", double1 == 1.9442790704566704d);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.6878438789017723E18d, 2.6881171418161737E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.998983441196998E-26d + "'", double2 == 9.998983441196998E-26d);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5552712721030326d, 49.63039286521482d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3068506629900103E9d + "'", double2 == 3.3068506629900103E9d);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.011800350358700291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999303766736223d + "'", double1 == 0.9999303766736223d);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        float float2 = org.apache.commons.math.util.FastMath.max(3.0f, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5662191695169732d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        double double1 = org.apache.commons.math.util.FastMath.tanh(8.4677203E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9250245035569947d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7282657137693634d) + "'", double1 == (-0.7282657137693634d));
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.561893127573004E64d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 149.32888531310746d + "'", double1 == 149.32888531310746d);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8691858264600905d, 0.5799018512655504d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8691858264600903d + "'", double2 == 0.8691858264600903d);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.2640633033557785d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.7415668164626985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        float float2 = org.apache.commons.math.util.FastMath.min(3.9481478E13f, (float) 11013L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 72, 53L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53L + "'", long2 == 53L);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1276321542566607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7550096966956188d + "'", double1 == 0.7550096966956188d);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 35);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        double double1 = org.apache.commons.math.util.FastMath.log(42.12656474461543d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.740678533255427d + "'", double1 == 3.740678533255427d);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.5712556729872575d), 1833.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5712556729872574d) + "'", double2 == (-0.5712556729872574d));
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 39481480091340L, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9033391107665127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2), (float) 72L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 72.0f + "'", float2 == 72.0f);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        long long1 = org.apache.commons.math.util.FastMath.round(174.92896910346727d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 175L + "'", long1 == 175L);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.011869972069403028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0717009473084772E-4d + "'", double1 == 2.0717009473084772E-4d);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.0021028582689319873d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.670180049565156E-5d) + "'", double1 == (-3.670180049565156E-5d));
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6250984987600411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        double double1 = org.apache.commons.math.util.FastMath.atan(9.135461931345429E35d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        double double1 = org.apache.commons.math.util.FastMath.log(0.08558186793850525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4582818414204355d) + "'", double1 == (-2.4582818414204355d));
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8746486203042796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.248867972642223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5997823587707154d + "'", double1 == 1.5997823587707154d);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 53, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        int int2 = org.apache.commons.math.util.FastMath.min((-36), 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7215087615242685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7648174594177056d + "'", double1 == 0.7648174594177056d);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.632512904931238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.99981066134163d + "'", double1 == 0.99981066134163d);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.1223881891967115d, 1.4210854715201906E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999999701d + "'", double2 == 0.9999999999999701d);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9995917534020516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8412503381137896d + "'", double1 == 0.8412503381137896d);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6799781366958019d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1819139347123162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1819139347123162d + "'", double1 == 1.1819139347123162d);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.8646647167633873d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8646647167633873d + "'", double1 == 0.8646647167633873d);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.3348400172962347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.334840017296235d + "'", double1 == 1.334840017296235d);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(68.40322401739334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1938614780827768d + "'", double1 == 1.1938614780827768d);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1477896, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.597379374759859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        double double1 = org.apache.commons.math.util.FastMath.log1p(5.266451746161367E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.41047360972814d + "'", double1 == 45.41047360972814d);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        double double2 = org.apache.commons.math.util.FastMath.min(0.3707603033998556d, 2.4219132975121505d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3707603033998556d + "'", double2 == 0.3707603033998556d);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        double double1 = org.apache.commons.math.util.FastMath.log1p(7.516258181075712E96d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 223.06523735925123d + "'", double1 == 223.06523735925123d);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308232d + "'", double1 == 57.29577951308232d);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        double double2 = org.apache.commons.math.util.FastMath.max(0.953499812724235d, 1.3023186765274488d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3023186765274488d + "'", double2 == 1.3023186765274488d);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3130883967082236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.4133588461770283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9332058000055234d + "'", double1 == 1.9332058000055234d);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.008837862706915424d), (-0.03492076949174774d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        double double2 = org.apache.commons.math.util.FastMath.max(3036.676314193363d, 0.5851102438039822d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3036.676314193363d + "'", double2 == 3036.676314193363d);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9975366607028198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.12376680396006796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(Double.POSITIVE_INFINITY, 1.1752011936438014d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.15335264995992576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15456620010518718d + "'", double1 == 0.15456620010518718d);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        long long2 = org.apache.commons.math.util.FastMath.min(8L, 1833L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.9633078296451878d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9633078296451877d) + "'", double1 == (-0.9633078296451877d));
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        int int2 = org.apache.commons.math.util.FastMath.min(52, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        double double2 = org.apache.commons.math.util.FastMath.min(0.4427658101751764d, 7.951386703658792E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.951386703658792E-16d + "'", double2 == 7.951386703658792E-16d);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 72);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 72.0f + "'", float1 == 72.0f);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        double double1 = org.apache.commons.math.util.FastMath.atan(7.930067261567152E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948954d + "'", double1 == 1.5707963267948954d);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        double double1 = org.apache.commons.math.util.FastMath.signum(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.019765178226982465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019766465371506087d + "'", double1 == 0.019766465371506087d);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8837010712667019d, 0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.905659800501133d + "'", double2 == 0.905659800501133d);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.377725567322862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 78.6566535193896d + "'", double1 == 78.6566535193896d);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 11013L, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }
}

