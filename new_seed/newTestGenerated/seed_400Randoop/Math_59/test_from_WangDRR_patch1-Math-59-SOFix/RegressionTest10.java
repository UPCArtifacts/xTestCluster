import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(6.34960155562218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.519841573516514d + "'", double1 == 2.519841573516514d);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.14287905018325486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4591471111629582E53d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5466921360757326E51d + "'", double1 == 2.5466921360757326E51d);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        double double1 = org.apache.commons.math.util.FastMath.expm1(7.419050069773651d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1666.4487951693106d + "'", double1 == 1666.4487951693106d);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.38050362137184734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39034082089753575d + "'", double1 == 0.39034082089753575d);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7282657137693636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6220031846622691d + "'", double1 == 0.6220031846622691d);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, 84677176);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        int int2 = org.apache.commons.math.util.FastMath.max(3, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.048891900480796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3114437720352931d + "'", double1 == 0.3114437720352931d);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        int int1 = org.apache.commons.math.util.FastMath.abs(1477896);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1477896 + "'", int1 == 1477896);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.6997678580926362d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-40.09374490761756d) + "'", double1 == (-40.09374490761756d));
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        int int1 = org.apache.commons.math.util.FastMath.round(5.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        int int1 = org.apache.commons.math.util.FastMath.abs(416128);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 416128 + "'", int1 == 416128);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.28162208224762103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2853121312169806d + "'", double1 == 1.2853121312169806d);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        int int2 = org.apache.commons.math.util.FastMath.max(3, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.03840091833939954d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.038410356896381344d) + "'", double1 == (-0.038410356896381344d));
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        int int2 = org.apache.commons.math.util.FastMath.max((-36), 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', 416128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416128 + "'", int2 == 416128);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        double double1 = org.apache.commons.math.util.FastMath.ulp(6.766375983153399E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0587911840678754E-22d + "'", double1 == 1.0587911840678754E-22d);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.6476534799298319d), 10.437911002510875d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6476534799298318d) + "'", double2 == (-0.6476534799298318d));
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5623823663631259d, (-0.7076312586751927d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7076312586751927d) + "'", double2 == (-0.7076312586751927d));
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        double double1 = org.apache.commons.math.util.FastMath.exp((-5.895315751447931d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002752307160878881d + "'", double1 == 0.002752307160878881d);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        int int2 = org.apache.commons.math.util.FastMath.min(53, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        int int2 = org.apache.commons.math.util.FastMath.min(45, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.7711544466071394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.877634861813576d + "'", double1 == 4.877634861813576d);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.5598925417941161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009771968311667285d + "'", double1 == 0.009771968311667285d);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5356723210278893d, 0.5716315636979222d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2778919526316612d + "'", double2 == 1.2778919526316612d);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.004344100997306704d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.004344073671360548d) + "'", double1 == (-0.004344073671360548d));
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 45L, (-36.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.025196192240463114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0255162991293005d + "'", double1 == 1.0255162991293005d);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        double double1 = org.apache.commons.math.util.FastMath.tanh(31.30685277862425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 6.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.346431770829404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7917594692280547d + "'", double1 == 1.7917594692280547d);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        double double1 = org.apache.commons.math.util.FastMath.cos(7.4764165040274095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3686581944193187d + "'", double1 == 0.3686581944193187d);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.993222846126381d + "'", double1 == 2.993222846126381d);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        double double1 = org.apache.commons.math.util.FastMath.sin(416128.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8818207058137428d) + "'", double1 == (-0.8818207058137428d));
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5307314453561238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4879294468412729d + "'", double1 == 0.4879294468412729d);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0000000040844357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023024312056d + "'", double1 == 0.5403023024312056d);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        double double2 = org.apache.commons.math.util.FastMath.min(8.253215446498233E-30d, 0.10604625733031672d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.253215446498233E-30d + "'", double2 == 8.253215446498233E-30d);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.170616649243588d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        double double1 = org.apache.commons.math.util.FastMath.log1p(36.974403151355936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6369123314750054d + "'", double1 == 3.6369123314750054d);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.02125525174622087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.7282657137693634d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8996977230841076d) + "'", double1 == (-0.8996977230841076d));
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        double double1 = org.apache.commons.math.util.FastMath.signum(20.13501082303189d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        double double1 = org.apache.commons.math.util.FastMath.log1p(639.6272283571994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.462447740731961d + "'", double1 == 6.462447740731961d);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.49391564547484d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.079331342726163d, 0.9008710423195464d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9337853017671083d + "'", double2 == 1.9337853017671083d);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.3600357884336912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36830625413145357d + "'", double1 == 0.36830625413145357d);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.005402465832298d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6105647004975029d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8483542321328145d + "'", double1 == 0.8483542321328145d);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7621445381930755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.117962658336205d) + "'", double1 == (-0.117962658336205d));
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.0017885376783303671d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.001788538631880774d + "'", double1 == 0.001788538631880774d);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        double double1 = org.apache.commons.math.util.FastMath.log10(323.0328345212857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5092466682340993d + "'", double1 == 2.5092466682340993d);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0587911840678754E-22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0587911840678754E-22d + "'", double1 == 1.0587911840678754E-22d);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.3284512750821519d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.34109125662395556d) + "'", double1 == (-0.34109125662395556d));
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) -1, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9902697229065449d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        double double1 = org.apache.commons.math.util.FastMath.cos(5.937759236406684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9409312714715267d + "'", double1 == 0.9409312714715267d);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.010869896178468208d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6227991747716105d) + "'", double1 == (-0.6227991747716105d));
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8668713349201806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        double double2 = org.apache.commons.math.util.FastMath.pow(416127.66138192907d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0232274785475501d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7968780678647464d + "'", double1 == 0.7968780678647464d);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        double double1 = org.apache.commons.math.util.FastMath.acos(7.821622829149065d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.9917318921852735d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9917318921852734d) + "'", double1 == (-0.9917318921852734d));
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.28162208224762103d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        double double1 = org.apache.commons.math.util.FastMath.sinh(7.951386703658795E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.951386703658795E-16d + "'", double1 == 7.951386703658795E-16d);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1301927452503902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019725584586772812d + "'", double1 == 0.019725584586772812d);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        double double1 = org.apache.commons.math.util.FastMath.cos(7.603575026530223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24779790579557093d + "'", double1 == 0.24779790579557093d);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6437933524252503d, 0.5896069690147183d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5896069690147183d + "'", double2 == 0.5896069690147183d);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        double double1 = org.apache.commons.math.util.FastMath.acosh(7.280109889280518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6735424271045924d + "'", double1 == 2.6735424271045924d);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        double double1 = org.apache.commons.math.util.FastMath.abs((-3.380515006246586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.380515006246586d + "'", double1 == 3.380515006246586d);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.3068127984286353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2976952894904131d + "'", double1 == 0.2976952894904131d);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7621445381930754d, 0.9185375499501867d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7621445381930755d + "'", double2 == 0.7621445381930755d);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        double double1 = org.apache.commons.math.util.FastMath.expm1(148.80597572185025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2229324083833204E64d + "'", double1 == 4.2229324083833204E64d);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.011800624231293426d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, (float) 1477896);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        long long2 = org.apache.commons.math.util.FastMath.max(6L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.214684851089401E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.214684851089398E-8d + "'", double1 == 4.214684851089398E-8d);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        double double1 = org.apache.commons.math.util.FastMath.rint(6.907793317242678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 15472906, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7383640997376417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9872460216486223d, 1.9145768651795099d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9145768651795099d + "'", double2 == 1.9145768651795099d);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.4845280286046115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5058235528477868d + "'", double1 == 0.5058235528477868d);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.3574158419544757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023691375760836582d + "'", double1 == 0.023691375760836582d);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.38714087209326337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7288245749424875d + "'", double1 == 0.7288245749424875d);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        int int1 = org.apache.commons.math.util.FastMath.round(6.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        int int1 = org.apache.commons.math.util.FastMath.round(2.15561577E15f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        double double1 = org.apache.commons.math.util.FastMath.cosh(645.0798400198227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.138137542419229E279d + "'", double1 == 7.138137542419229E279d);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.1111143058480209d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11134309044212017d + "'", double1 == 0.11134309044212017d);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.4251053392695819d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5297515540876878d + "'", double1 == 1.5297515540876878d);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        double double1 = org.apache.commons.math.util.FastMath.exp(36.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.311231547115195E15d + "'", double1 == 4.311231547115195E15d);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.327624706282432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.327624706282432d + "'", double1 == 4.327624706282432d);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9402241834946016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5605553882446344d + "'", double1 == 1.5605553882446344d);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.2176528503433113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7964493619549832d + "'", double1 == 0.7964493619549832d);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.070843830251405d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.437442032932441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.544951074455595d + "'", double1 == 3.544951074455595d);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.1951162469645535d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        double double2 = org.apache.commons.math.util.FastMath.min(2.2542036597000856d, 5.192987713658941d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2542036597000856d + "'", double2 == 2.2542036597000856d);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7850896760339817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8682623776472602d + "'", double1 == 0.8682623776472602d);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 149, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 149L + "'", long2 == 149L);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        float float2 = org.apache.commons.math.util.FastMath.max(36.0f, (-53.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        double double1 = org.apache.commons.math.util.FastMath.log(0.006690129943162349d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.0071219815385035d) + "'", double1 == (-5.0071219815385035d));
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6199895080879192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        double double1 = org.apache.commons.math.util.FastMath.log(1.000000837352016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.373516653686975E-7d + "'", double1 == 8.373516653686975E-7d);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2280945400058982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5307314453561238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5307314453561238d + "'", double1 == 0.5307314453561238d);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.6553645909090928d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        float float2 = org.apache.commons.math.util.FastMath.min(2.14748365E9f, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.05483113556160755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.569838481574019E-4d + "'", double1 == 9.569838481574019E-4d);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6707931770950559d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-4.3025459603122967E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.3025456948179563E-4d) + "'", double1 == (-4.3025456948179563E-4d));
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.8383544794438463d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9400684924366013d) + "'", double1 == (-0.9400684924366013d));
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.7465363222182906d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9251475365964139d) + "'", double1 == (-0.9251475365964139d));
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.40786779792830646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.36910342058666d + "'", double1 == 23.36910342058666d);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        double double1 = org.apache.commons.math.util.FastMath.atanh(114.59155902616465d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        double double1 = org.apache.commons.math.util.FastMath.exp(43.63394589122048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.912138441355265E18d + "'", double1 == 8.912138441355265E18d);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        double double1 = org.apache.commons.math.util.FastMath.floor(57.295779747103246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) (-53L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5519306407732258d) + "'", double1 == (-1.5519306407732258d));
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.20414594311450418d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20273091198900292d) + "'", double1 == (-0.20273091198900292d));
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        int int2 = org.apache.commons.math.util.FastMath.min(10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.356147801749623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6873230320414576d + "'", double1 == 2.6873230320414576d);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.1732867951399863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.985023376545766d + "'", double1 == 0.985023376545766d);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8071755356156836d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        double double1 = org.apache.commons.math.util.FastMath.ceil(45.41638539636288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.0d + "'", double1 == 46.0d);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        double double1 = org.apache.commons.math.util.FastMath.sin(23.092175930340908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8916728940028572d) + "'", double1 == (-0.8916728940028572d));
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2155615773557597L, (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.15561577E15f + "'", float2 == 2.15561577E15f);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.17528947615916912d), 1.5729700885805267d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1752894761591691d) + "'", double2 == (-0.1752894761591691d));
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 10, (float) 39481480091340L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.5756666190961113d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1428667560490884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 65.48144166742021d + "'", double1 == 65.48144166742021d);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2048.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.547473508864641E-13d + "'", double1 == 4.547473508864641E-13d);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.0159227463586952E74d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1550386519077517E76d + "'", double1 == 1.1550386519077517E76d);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9176834530093733d, 1.2277207513970612d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6418794309070784d + "'", double2 == 0.6418794309070784d);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8552072360648283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8552072360648283d + "'", double1 == 0.8552072360648283d);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1550386519077517E76d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5707963267948954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.99999999999993d + "'", double1 == 89.99999999999993d);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.1498040080478718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9732158079512789d + "'", double1 == 0.9732158079512789d);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1048047831074077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3436797881009894d + "'", double1 == 1.3436797881009894d);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.1299083649462789d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9703166014948361d) + "'", double1 == (-0.9703166014948361d));
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.007302804107846621d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.29985830521606127d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.309363902921281d) + "'", double1 == (-0.309363902921281d));
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        double double1 = org.apache.commons.math.util.FastMath.tanh(65.7839305200671d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        double double1 = org.apache.commons.math.util.FastMath.atan(36.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430256902014756d + "'", double1 == 1.5430256902014756d);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 22.18070977791825d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22.18070977791825d + "'", double2 == 22.18070977791825d);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.18106042748149917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1984875986923136d + "'", double1 == 1.1984875986923136d);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 416128, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 416128.0f + "'", float2 == 416128.0f);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        int int2 = org.apache.commons.math.util.FastMath.max(6, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-11.745681216144897d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-672.9779611911906d) + "'", double1 == (-672.9779611911906d));
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        long long2 = org.apache.commons.math.util.FastMath.max(2155615773557597L, 39481480091340L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2155615773557597L + "'", long2 == 2155615773557597L);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        long long2 = org.apache.commons.math.util.FastMath.min(1477896L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.05483113556160755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37990564499810686d + "'", double1 == 0.37990564499810686d);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.0595018713561494E-4d, 0.7525586878958921d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.736666060822467E-4d + "'", double2 == 2.736666060822467E-4d);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5560432043521122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027158077219227316d + "'", double1 == 0.027158077219227316d);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0139617178500335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        long long2 = org.apache.commons.math.util.FastMath.max((-2L), (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.8818207058137428d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0006324214414275d) + "'", double1 == (-1.0006324214414275d));
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.8351015231807233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8351015231807233d + "'", double1 == 1.8351015231807233d);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 53);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 53L + "'", long1 == 53L);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5707956501570803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2533138673760378d + "'", double1 == 1.2533138673760378d);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        float float2 = org.apache.commons.math.util.FastMath.min(9.223372E18f, (float) 1477896);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) (-36L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.276858964458208d) + "'", double1 == (-4.276858964458208d));
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.0012941034727495249d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.033985452519997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0339854525199974d + "'", double1 == 2.0339854525199974d);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.22459997143478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70.16440995505405d + "'", double1 == 70.16440995505405d);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.31587294930624943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.327055958571125d + "'", double1 == 0.327055958571125d);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        int int2 = org.apache.commons.math.util.FastMath.max(84677176, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 84677176 + "'", int2 == 84677176);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        int int2 = org.apache.commons.math.util.FastMath.max(5, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8044965609865441d, 49.81171952239862d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 49.81171952239862d + "'", double2 == 49.81171952239862d);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        double double1 = org.apache.commons.math.util.FastMath.acos(11014.999999999998d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9441850002921958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.057433157151405186d) + "'", double1 == (-0.057433157151405186d));
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9591348389208239d, 3.970291913552122d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.959134838920824d + "'", double2 == 0.959134838920824d);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.6321205588285577d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        double double1 = org.apache.commons.math.util.FastMath.signum(53.598150033144236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) -1, (long) 11013);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.17364288451637427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        long long2 = org.apache.commons.math.util.FastMath.min(2147483647L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6022111734203904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010510567768484375d + "'", double1 == 0.010510567768484375d);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647L, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        double double1 = org.apache.commons.math.util.FastMath.tan(536.7148441762085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5430602604667795d) + "'", double1 == (-0.5430602604667795d));
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.74342314569772E-5d, 1.6506325163944369d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.39734852696103E-8d + "'", double2 == 1.39734852696103E-8d);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 416128L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 416128 + "'", int1 == 416128);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8071755356156836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9310850001463591d + "'", double1 == 0.9310850001463591d);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        double double1 = org.apache.commons.math.util.FastMath.expm1(28.000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4462570642904802E12d + "'", double1 == 1.4462570642904802E12d);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9999092042625951d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.3497438749375477d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.3114437720352931d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 149.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.173186268412274d + "'", double1 == 2.173186268412274d);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(9.569838481574019E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05483113556160755d + "'", double1 == 0.05483113556160755d);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        int int2 = org.apache.commons.math.util.FastMath.min(15472906, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.38714087209326337d, 24.678686683130433d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3871408720932634d + "'", double2 == 0.3871408720932634d);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-4.276858964458208d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.159761581911684d) + "'", double1 == (-2.159761581911684d));
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.469446951953614E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.013961717850033481d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        double double1 = org.apache.commons.math.util.FastMath.rint((-2.978724239478952E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.506844020238002d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9633078296451878d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        double double1 = org.apache.commons.math.util.FastMath.signum((-34.768015146316124d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1046225788468806d, 2.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1046225788468809d + "'", double2 == 1.1046225788468809d);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        long long1 = org.apache.commons.math.util.FastMath.round(3.799263459336884d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.2204460492503128E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.6239190567167857d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6651936259987531d) + "'", double1 == (-0.6651936259987531d));
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        double double1 = org.apache.commons.math.util.FastMath.exp(7.042749499570736d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1144.5301696214883d + "'", double1 == 1144.5301696214883d);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.749996267789066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41292226304899554d) + "'", double1 == (-0.41292226304899554d));
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        float float2 = org.apache.commons.math.util.FastMath.max(36.0f, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6044791236121515d, 1.000000837352016d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000000837352016d + "'", double2 == 1.000000837352016d);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        int int2 = org.apache.commons.math.util.FastMath.min(416128, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.7508693062485688d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2953986190320608d + "'", double1 == 1.2953986190320608d);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7214969542037845d, 55.367870644634905d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 55.367870644634905d + "'", double2 == 55.367870644634905d);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.1662915285707833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2939146610758965d + "'", double1 == 1.2939146610758965d);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.32179921168174863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0522257274488631d + "'", double1 == 1.0522257274488631d);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.394411534628069d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.1115738623399643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11204033570361543d + "'", double1 == 0.11204033570361543d);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7206435247136849d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012577602239430928d + "'", double1 == 0.012577602239430928d);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.199548965513553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.199548965513553d + "'", double1 == 1.199548965513553d);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9995120760870788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7851541419138716d + "'", double1 == 0.7851541419138716d);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6022111734203904d, 0.8687425280815093d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6022111734203904d + "'", double2 == 0.6022111734203904d);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8307652072016097d, 0.20894025738121733d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9620015576484418d + "'", double2 == 0.9620015576484418d);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.106976355621385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01932038214732081d + "'", double1 == 0.01932038214732081d);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.644483341943245d + "'", double1 == 4.644483341943245d);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.477208157986425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4593010294267361d + "'", double1 == 0.4593010294267361d);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5356723210278893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18629855661269387d + "'", double1 == 0.18629855661269387d);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6108652381980155d, 0.492549213298881d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8922172055377627d + "'", double2 == 0.8922172055377627d);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        double double2 = org.apache.commons.math.util.FastMath.max(3.9481478479872E13d, 0.9702843181545027d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9481478479872E13d + "'", double2 == 3.9481478479872E13d);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5940561914458121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46628183159475434d + "'", double1 == 0.46628183159475434d);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 'a', 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        double double1 = org.apache.commons.math.util.FastMath.asin(22.18070977791825d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        double double1 = org.apache.commons.math.util.FastMath.acos((-4.821637045374455E-17d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1161530356493914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7495998344665884d + "'", double1 == 0.7495998344665884d);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        float float1 = org.apache.commons.math.util.FastMath.abs(36.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5757472671756005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.778459014529333d + "'", double1 == 1.778459014529333d);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7787556555465047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7787556555465047d + "'", double1 == 0.7787556555465047d);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.362548825412157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35465852402350817d + "'", double1 == 0.35465852402350817d);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        long long2 = org.apache.commons.math.util.FastMath.max(4L, 2155615773557597L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2155615773557597L + "'", long2 == 2155615773557597L);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.837131699124806d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2115094355072138d) + "'", double1 == (-1.2115094355072138d));
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0192608780318253d, 3.0537144249814574d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0537144249814574d + "'", double2 == 3.0537144249814574d);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.7063851457511368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7063851457511368d + "'", double1 == 1.7063851457511368d);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        double double1 = org.apache.commons.math.util.FastMath.ulp(28.43781006905283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 7.9300672E14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.8695168523156485d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.1286541698196357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8483910504053456d + "'", double1 == 0.8483910504053456d);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.437442032932441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 254.2467003209809d + "'", double1 == 254.2467003209809d);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.2050634318473186d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0192106325823187d) + "'", double1 == (-1.0192106325823187d));
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3887317335324652d, 0.7266953932355397d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7266953932355397d + "'", double2 == 0.7266953932355397d);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        double double1 = org.apache.commons.math.util.FastMath.acos(41.32317658130462d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 39481480091340L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.596393425240073d + "'", double1 == 13.596393425240073d);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9997092487312308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.693001794357499d + "'", double1 == 0.693001794357499d);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9518921423514372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2593525547596036d + "'", double1 == 1.2593525547596036d);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3880206449936091E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5817278226951806d) + "'", double1 == (-0.5817278226951806d));
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 57L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8998668269691937d + "'", double1 == 0.8998668269691937d);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.36830625413145357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4452845955815483d + "'", double1 == 1.4452845955815483d);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.506328628316938E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.899450800738734d) + "'", double1 == (-0.899450800738734d));
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5065192423637161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5065192423637163d + "'", double1 == 0.5065192423637163d);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5896069690147183d, (-0.24357481979072695d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5896069690147182d + "'", double2 == 0.5896069690147182d);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        double double1 = org.apache.commons.math.util.FastMath.sin(5.691758600279624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5575459650766624d) + "'", double1 == (-0.5575459650766624d));
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9740733519705822d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.025630151592603893d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02530448746327424d) + "'", double1 == (-0.02530448746327424d));
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.5321070224790865E26d, 0.363219329202442d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.1554436208840472E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1554436208840472E-30d + "'", double1 == 3.1554436208840472E-30d);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        long long2 = org.apache.commons.math.util.FastMath.max(100L, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        double double1 = org.apache.commons.math.util.FastMath.acosh(9.989078815390096E-4d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 149L, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.0020646921059506392d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0020668265211430115d) + "'", double1 == (-0.0020668265211430115d));
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.2563886896772048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2509824502635308d + "'", double1 == 0.2509824502635308d);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-3.8754705787895336d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06763972166404768d) + "'", double1 == (-0.06763972166404768d));
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2745942431964723d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9221885224184981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6034653621241517d + "'", double1 == 1.6034653621241517d);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.031235131803051444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.03338100822971834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.006690129943162349d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0066900301330304005d + "'", double1 == 0.0066900301330304005d);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5521802813382803d, 1.5953649790673516d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5521802813382803d + "'", double2 == 0.5521802813382803d);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.40589190094865796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5006403258942742d + "'", double1 == 1.5006403258942742d);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        double double1 = org.apache.commons.math.util.FastMath.log10((-4.3025456948179563E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.03673618878368824d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 35, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.08726646259971647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08737726680187785d + "'", double1 == 0.08737726680187785d);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.1593051502639125d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.4779900867225375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9424716586347164d + "'", double1 == 0.9424716586347164d);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        double double2 = org.apache.commons.math.util.FastMath.atan2(171.78552109133562d, 0.09994695977117724d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5702145143821933d + "'", double2 == 1.5702145143821933d);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2027522105204773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0967006020425434d + "'", double1 == 1.0967006020425434d);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.1338468571120415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.962141938673646d + "'", double1 == 21.962141938673646d);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0504502603385693d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 1, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.008838092819754681d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008838207880218597d) + "'", double1 == (-0.008838207880218597d));
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5065192423637161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.768115672379123E13d, 0.7683152502780354d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948688d + "'", double2 == 1.5707963267948688d);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7991915029216112d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9259489307902636d + "'", double1 == 0.9259489307902636d);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.799263459336884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.99899812376483d + "'", double1 == 0.99899812376483d);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        double double1 = org.apache.commons.math.util.FastMath.exp(9.272410972265918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10640.37463429509d + "'", double1 == 10640.37463429509d);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        int int2 = org.apache.commons.math.util.FastMath.max(11013, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        double double1 = org.apache.commons.math.util.FastMath.exp(53.598150033144236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8940035976891812E23d + "'", double1 == 1.8940035976891812E23d);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.9510025301004161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4650188248182274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025569402096776085d + "'", double1 == 0.025569402096776085d);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.162447351509626d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.3435641450074346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0596009736702285d + "'", double1 == 1.0596009736702285d);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-77.26503394947866d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        double double2 = org.apache.commons.math.util.FastMath.max(0.36431415595777866d, 0.30102999566398114d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.36431415595777866d + "'", double2 == 0.36431415595777866d);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.42149796567476777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.150054506514234d + "'", double1 == 24.150054506514234d);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.2633862394596655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9655139028821577d + "'", double1 == 0.9655139028821577d);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        double double1 = org.apache.commons.math.util.FastMath.expm1(18741.93649013445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        double double1 = org.apache.commons.math.util.FastMath.log((-4.3025459603122967E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.05326119751852293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05323601959381076d + "'", double1 == 0.05323601959381076d);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.3127199080565219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.559213651529111d + "'", double1 == 0.559213651529111d);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        double double1 = org.apache.commons.math.util.FastMath.sinh(204.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9726239996384714E88d + "'", double1 == 1.9726239996384714E88d);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        double double2 = org.apache.commons.math.util.FastMath.min(1.724275869600789d, 1.5356723210278893d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5356723210278893d + "'", double2 == 1.5356723210278893d);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 1.5472906E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.247748232914745d + "'", double1 == 17.247748232914745d);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4436354751788103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3671645675901346d + "'", double1 == 0.3671645675901346d);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-3.8787751869641602d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5712002380278036d) + "'", double1 == (-1.5712002380278036d));
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.693889518756616d), 0.02411494803001423d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6938895187566159d) + "'", double2 == (-0.6938895187566159d));
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.09994695977117724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3161438909281298d + "'", double1 == 0.3161438909281298d);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 45L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 45.0f + "'", float1 == 45.0f);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0484411939287768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2513582023221557d + "'", double1 == 1.2513582023221557d);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(7.6035750265302235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7574580733948113d + "'", double1 == 2.7574580733948113d);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.217652850343311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3792468199971823d + "'", double1 == 3.3792468199971823d);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.0159227463586952E74d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5108406941546723E58d + "'", double1 == 2.5108406941546723E58d);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.8309951464910048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0709129329002653d + "'", double1 == 1.0709129329002653d);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8924232090626707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8924232090626708d + "'", double1 == 0.8924232090626708d);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5987609268125889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9288431615557667d + "'", double1 == 0.9288431615557667d);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0399894657358901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0399894657358904d + "'", double1 == 1.0399894657358904d);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1477896, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5191129625505976d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.137792216825654d + "'", double1 == 1.137792216825654d);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        double double1 = org.apache.commons.math.util.FastMath.asin((-86.33580274416313d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.004344073671360548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0043535365743673626d) + "'", double1 == (-0.0043535365743673626d));
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1639660085492005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.757427526873428d + "'", double1 == 1.757427526873428d);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        float float2 = org.apache.commons.math.util.FastMath.min(35.0f, 2.15561577E15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2280945400058982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0338353139228529d + "'", double1 == 1.0338353139228529d);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.267909605184542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42998790048727914d) + "'", double1 == (-0.42998790048727914d));
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        float float2 = org.apache.commons.math.util.FastMath.max(7.9300672E14f, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.9300672E14f + "'", float2 == 7.9300672E14f);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.24928153889173274d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-14.282780089022575d) + "'", double1 == (-14.282780089022575d));
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        long long1 = org.apache.commons.math.util.FastMath.round(0.31784189721835715d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.9942575694137897d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0343738591931952d + "'", double1 == 3.0343738591931952d);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 10L, 0.9260416922830169d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9260416922830169d + "'", double2 == 0.9260416922830169d);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1118733076078493d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100L, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.4253120969346567d), 0.7621445381930755d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.9234103443381365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.34535216988526224d) + "'", double1 == (-0.34535216988526224d));
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.0030006328454241253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1719235979111335d + "'", double1 == 0.1719235979111335d);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        int int2 = org.apache.commons.math.util.FastMath.min(3, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1411917790307853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.814815011820438d + "'", double1 == 0.814815011820438d);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8932968697638163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.438012234630102d + "'", double1 == 1.438012234630102d);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.3992615748884459d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3893496220099056d + "'", double1 == 0.3893496220099056d);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7485270909508315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9079651392259976d + "'", double1 == 0.9079651392259976d);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6997597439205169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6042152549280319d + "'", double1 == 0.6042152549280319d);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9117339147869651d), (-0.34535216988526224d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9117339147869651d) + "'", double2 == (-0.9117339147869651d));
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.529104380392399d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.026687906044515184d) + "'", double1 == (-0.026687906044515184d));
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.0343738591931952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05295981457936807d + "'", double1 == 0.05295981457936807d);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        int int2 = org.apache.commons.math.util.FastMath.min(32, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0833737308639964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08007999700658493d + "'", double1 == 0.08007999700658493d);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        double double1 = org.apache.commons.math.util.FastMath.acos(1477896.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6527531305852572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        long long2 = org.apache.commons.math.util.FastMath.max((-36L), (long) 11013);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.36431415595777866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3563085473595781d + "'", double1 == 0.3563085473595781d);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.137792216825654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1632752550609538d + "'", double1 == 2.1632752550609538d);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.4845280286046115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44986261998611243d + "'", double1 == 0.44986261998611243d);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        double double1 = org.apache.commons.math.util.FastMath.rint(12.19860548267097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.0d + "'", double1 == 12.0d);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        double double1 = org.apache.commons.math.util.FastMath.atanh(7.280109889280518d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.3992615748884459d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006968429058501292d + "'", double1 == 0.006968429058501292d);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.292518932727564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.436702063474025d + "'", double1 == 13.436702063474025d);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        double double1 = org.apache.commons.math.util.FastMath.tanh(52.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3565686652647782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21259280829080318d + "'", double1 == 0.21259280829080318d);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7672312144687762d, 1.0986122886681098d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7672312144687763d + "'", double2 == 0.7672312144687763d);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1316153248585041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3890745789597314d + "'", double1 == 1.3890745789597314d);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5061643021402576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5575593171677878d + "'", double1 == 0.5575593171677878d);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5992428797223133d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5430806348152446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        long long2 = org.apache.commons.math.util.FastMath.max(149L, 416128L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 416128L + "'", long2 == 416128L);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        double double1 = org.apache.commons.math.util.FastMath.abs((-4.999625031243404E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.999625031243404E-5d + "'", double1 == 4.999625031243404E-5d);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 36L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.883259400089535E100d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.885337784451458E84d + "'", double1 == 3.885337784451458E84d);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.005178565573424058d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005178588719521202d + "'", double1 == 0.005178588719521202d);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5679890550656346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19534302688082442d + "'", double1 == 0.19534302688082442d);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        int int2 = org.apache.commons.math.util.FastMath.min(52, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9984579799537394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9984579799537395d + "'", double1 == 0.9984579799537395d);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9703166014948361d), 19.990612120000147d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.970316601494836d) + "'", double2 == (-0.970316601494836d));
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1440689579547698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.14406895795477d + "'", double1 == 1.14406895795477d);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.162063444860504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.853977625476199d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2706644088397694d) + "'", double1 == (-1.2706644088397694d));
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        double double1 = org.apache.commons.math.util.FastMath.asin(39.04822696504081d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.03173339314553415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03224226575285404d + "'", double1 == 0.03224226575285404d);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.5098796108399273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5842599568378692d + "'", double1 == 1.5842599568378692d);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        double double1 = org.apache.commons.math.util.FastMath.acos((-7.016709298534876E-15d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267949037d + "'", double1 == 1.5707963267949037d);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        double double1 = org.apache.commons.math.util.FastMath.exp(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        double double1 = org.apache.commons.math.util.FastMath.log10(41.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6127838567197355d + "'", double1 == 1.6127838567197355d);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        double double1 = org.apache.commons.math.util.FastMath.expm1(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001256E-16d + "'", double1 == 8.881784197001256E-16d);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        long long1 = org.apache.commons.math.util.FastMath.abs(45L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 45L + "'", long1 == 45L);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1L), 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.9942575694137897d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7825186884472763d) + "'", double1 == (-0.7825186884472763d));
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 1.0080212625522527d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0080212625522527d + "'", double2 == 1.0080212625522527d);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        double double1 = org.apache.commons.math.util.FastMath.atan((-2.9999999999999996d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2490457723982544d) + "'", double1 == (-1.2490457723982544d));
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.999921393166548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999606958108643d + "'", double1 == 0.9999606958108643d);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.786036626268317d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9043712444123206d) + "'", double1 == (-0.9043712444123206d));
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.7529602598008407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9724616610739303d + "'", double1 == 2.9724616610739303d);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.214684851089405E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000421468493d + "'", double1 == 1.0000000421468493d);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.0043507836180990325d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.004350811070762581d) + "'", double1 == (-0.004350811070762581d));
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        int int2 = org.apache.commons.math.util.FastMath.max(3, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        double double2 = org.apache.commons.math.util.FastMath.max((-10.017874927409903d), (-0.9033391107665127d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9033391107665127d) + "'", double2 == (-0.9033391107665127d));
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        float float2 = org.apache.commons.math.util.FastMath.max(4.0f, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.5452187590232507d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1665948792931762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8621396495246559d + "'", double1 == 0.8621396495246559d);
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.8554182836643194d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        double double1 = org.apache.commons.math.util.FastMath.cos(9.494107596574928E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(6.2919553545008196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10981533732452632d + "'", double1 == 0.10981533732452632d);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.26496707001953784d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2327687855312238d) + "'", double1 == (-0.2327687855312238d));
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5860134523134185E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.10604625733031672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10624513177635671d + "'", double1 == 0.10624513177635671d);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.27112864638649725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2744626885882167d + "'", double1 == 0.2744626885882167d);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.9323667197459253d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.8052881239252931d), (-0.9851462604682474d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8052881239252933d) + "'", double2 == (-0.8052881239252933d));
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.2014038779280567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9797867046510361d + "'", double1 == 0.9797867046510361d);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        double double2 = org.apache.commons.math.util.FastMath.max(1.035580123877089d, 28.220991124514843d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 28.220991124514843d + "'", double2 == 28.220991124514843d);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.8996977230841076d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8662137645563011d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7138320036389565d + "'", double1 == 0.7138320036389565d);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        int int2 = org.apache.commons.math.util.FastMath.max(53, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0008347150187464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.623609135857365E-4d + "'", double1 == 3.623609135857365E-4d);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6803595632804155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2405112290192857d + "'", double1 == 1.2405112290192857d);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.7365898990208962d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6270804372411973d) + "'", double1 == (-0.6270804372411973d));
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        long long1 = org.apache.commons.math.util.FastMath.round((-7.369139609590174E-249d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6218224167640864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.41032129904824216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.38937226128359037d) + "'", double1 == (-0.38937226128359037d));
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        double double1 = org.apache.commons.math.util.FastMath.asin(27.289917197127753d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32L, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(89.99999999999993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948954d + "'", double1 == 1.5707963267948954d);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.8052881239252931d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.20787957635076193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20940667843058006d + "'", double1 == 0.20940667843058006d);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5013507798060323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40636522275409087d + "'", double1 == 0.40636522275409087d);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.1965223232699738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 183.14723824272207d + "'", double1 == 183.14723824272207d);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.8337422720523482d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7942161166308663d) + "'", double1 == (-1.7942161166308663d));
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5707963267948957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.810477380965347d + "'", double1 == 4.810477380965347d);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0913479926158096d, 1.3132616875182228d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1216456772885524d + "'", double2 == 1.1216456772885524d);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        double double2 = org.apache.commons.math.util.FastMath.max(1.6506325163944369d, 0.6033293179688031d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6506325163944369d + "'", double2 == 1.6506325163944369d);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5860134523134338E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25d + "'", double1 == 0.25d);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 1.5472906E7f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5015887158341327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4633656815430332d + "'", double1 == 0.4633656815430332d);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1639660085492005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15183314660553213d + "'", double1 == 0.15183314660553213d);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 3.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.755461289508684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8691727616007556d + "'", double1 == 0.8691727616007556d);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        int int2 = org.apache.commons.math.util.FastMath.max(45, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.985023376545766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17328679513998643d + "'", double1 == 0.17328679513998643d);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.09966865249116198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09950437040259404d + "'", double1 == 0.09950437040259404d);
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2L), (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.3753668845100457d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.56173368499807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.56173368499807d + "'", double1 == 2.56173368499807d);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.3600357884336912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3600357884336912d + "'", double1 == 0.3600357884336912d);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3036.676314193363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        float float2 = org.apache.commons.math.util.FastMath.min(416128.0f, (float) (-53));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8691727616007556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3296867882556773d + "'", double1 == 1.3296867882556773d);
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.24376859510303997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        int int2 = org.apache.commons.math.util.FastMath.max(3, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5785812223437699d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5216334679510201d) + "'", double1 == (-0.5216334679510201d));
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.287543329097423d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.3490760817142498d, 1.4650188248182272d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1584365016955682d + "'", double2 == 1.1584365016955682d);
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5669767943827967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24643471584737361d) + "'", double1 == (-0.24643471584737361d));
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-2.6661203985235478d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1984875986923136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1984875986923136d + "'", double1 == 1.1984875986923136d);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8849970445005177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9407428152797754d + "'", double1 == 0.9407428152797754d);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 0, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.11776318452497536d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3431664093773972d + "'", double1 == 0.3431664093773972d);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        float float2 = org.apache.commons.math.util.FastMath.min(8.4677176E7f, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        double double1 = org.apache.commons.math.util.FastMath.cosh(45.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7467135528742547E19d + "'", double1 == 1.7467135528742547E19d);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5915576703333734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 84677176L, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.4677176E7f + "'", float2 == 8.4677176E7f);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        long long2 = org.apache.commons.math.util.FastMath.max(36L, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.05326119751852293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2735890731610697d) + "'", double1 == (-1.2735890731610697d));
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        double double1 = org.apache.commons.math.util.FastMath.log(3.1720269046268665E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.69314718055995d + "'", double1 == 35.69314718055995d);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7609048895609227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9983608366524339d + "'", double1 == 0.9983608366524339d);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.06577273855851125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.1662915285707833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6065871571457463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6517607320093916d + "'", double1 == 0.6517607320093916d);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5.937759236406684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4367517798098937d + "'", double1 == 2.4367517798098937d);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.0343738591931952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.369926430633274d + "'", double1 == 10.369926430633274d);
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0967006020425434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9942704184504283d + "'", double1 == 2.9942704184504283d);
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        double double1 = org.apache.commons.math.util.FastMath.asin(8.583175998895534d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7288245749424875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0726429388606686d + "'", double1 == 1.0726429388606686d);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        double double2 = org.apache.commons.math.util.FastMath.pow(7.951386703658792E-16d, 3.9481478479872E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6701982005616954d, 0.362548825412157d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6701982005616953d + "'", double2 == 0.6701982005616953d);
    }
}

