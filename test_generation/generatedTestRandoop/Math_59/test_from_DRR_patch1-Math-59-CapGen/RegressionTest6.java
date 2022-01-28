import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2005, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2005L + "'", long2 == 2005L);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.019228399099707562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019230769230769586d + "'", double1 == 0.019230769230769586d);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9734594443576854d, 151.64788521288048d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.006419120665304706d + "'", double2 == 0.006419120665304706d);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.0697079433475818d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        int int2 = org.apache.commons.math.util.FastMath.min(52, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3383347192042695E42d, (-0.9231784609934363d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9231784609934363d) + "'", double2 == (-0.9231784609934363d));
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        int int2 = org.apache.commons.math.util.FastMath.max(100, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9999550340122696d, 0.9997917751171265d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999550340122695d + "'", double2 == 0.9999550340122695d);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2334031175112035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20977711114722197d + "'", double1 == 0.20977711114722197d);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.112464991987175E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.112464991987175E-14d + "'", double1 == 2.112464991987175E-14d);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8623188722876838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6218224167640864d + "'", double1 == 0.6218224167640864d);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        float float2 = org.apache.commons.math.util.FastMath.max(51.0f, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.0f + "'", float2 == 51.0f);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.225431076931693E-25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.295214085529645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.939216676724527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0835214836909097d + "'", double1 == 1.0835214836909097d);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5092033284084692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1998574867931386d + "'", double1 == 1.1998574867931386d);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9997917751171265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        double double1 = org.apache.commons.math.util.FastMath.log1p(31.306852819440063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.475279369318095d + "'", double1 == 3.475279369318095d);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9999550340122696d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.10928726776364893d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.38195407365429795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6180243309565554d + "'", double1 == 0.6180243309565554d);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 3280.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.271284253105414d + "'", double1 == 57.271284253105414d);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.7715216602443777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9437759606812824d + "'", double1 == 0.9437759606812824d);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5734860711430395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6527019197008838d + "'", double1 == 0.6527019197008838d);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 6559L, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6559.0f + "'", float2 == 6559.0f);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.9204604704918524d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.04144646964819275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.041446469648192756d + "'", double1 == 0.041446469648192756d);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.008879097553696258d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.1906899454435433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37101925991283097d + "'", double1 == 0.37101925991283097d);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5287499284227858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7271519293949413d + "'", double1 == 0.7271519293949413d);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9455557866374293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.1752011936438014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        double double1 = org.apache.commons.math.util.FastMath.asin(1833.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8721824073781502d, (-0.015106595394726734d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8721824073781501d + "'", double2 == 0.8721824073781501d);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        double double2 = org.apache.commons.math.util.FastMath.min(7.217373703740946d, 1.2778843899054422d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2778843899054422d + "'", double2 == 1.2778843899054422d);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5707963267948954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171523356672742d + "'", double1 == 0.9171523356672742d);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.0590011172720796d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05729428410226429d) + "'", double1 == (-0.05729428410226429d));
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.2778843899054422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.589038681517209d + "'", double1 == 3.589038681517209d);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7615165085805536d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8656496755126944d + "'", double1 == 0.8656496755126944d);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.056454263945691766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.055287372175112d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.4961362064880912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.009529184458135626d, 2.9982229502979716d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.009529184458135628d + "'", double2 == 0.009529184458135628d);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2334031175112035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70.66879307167028d + "'", double1 == 70.66879307167028d);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9938692204505003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6900770828544028d + "'", double1 == 0.6900770828544028d);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.28354302476765203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9147226107566937d + "'", double1 == 0.9147226107566937d);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5335854272192775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 87.86797250243188d + "'", double1 == 87.86797250243188d);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7239458651321878d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8095051177152213d + "'", double1 == 0.8095051177152213d);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.8259963669851865d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        double double1 = org.apache.commons.math.util.FastMath.ceil(6.176458612301354E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-5.03214487176113d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-288.3206630503136d) + "'", double1 == (-288.3206630503136d));
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.7353126200110887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5594482377087571d) + "'", double1 == (-0.5594482377087571d));
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7428042414504862d, 0.6567734310571898d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8467900408269441d + "'", double2 == 0.8467900408269441d);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        int int2 = org.apache.commons.math.util.FastMath.max(2005, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2005 + "'", int2 == 2005);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.663310606035718d, 3.948148009134101E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.745721284698821E-14d + "'", double2 == 6.745721284698821E-14d);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7015156767002264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.016807219771015d + "'", double1 == 1.016807219771015d);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9795918367346939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-2.3079900215284027E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3079900213234987E-5d) + "'", double1 == (-2.3079900213234987E-5d));
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38785408736876786d + "'", double1 == 0.38785408736876786d);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.996575062024539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7089878066060047d + "'", double1 == 1.7089878066060047d);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        double double2 = org.apache.commons.math.util.FastMath.max(0.04494573522768691d, (-0.2892114475688025d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04494573522768691d + "'", double2 == 0.04494573522768691d);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.5063656411097466d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8145870194540231d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6835723937915076d + "'", double1 == 0.6835723937915076d);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        double double2 = org.apache.commons.math.util.FastMath.max(4.574710978503383d, 1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.574710978503383d + "'", double2 == 4.574710978503383d);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) -1, 6559L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6559L + "'", long2 == 6559L);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 8.119741647423155d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1259469553800836d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.33144561670275613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3378353904531375d + "'", double1 == 0.3378353904531375d);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        double double2 = org.apache.commons.math.util.FastMath.max(0.020377724655755693d, 9.357486930108681d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.357486930108681d + "'", double2 == 9.357486930108681d);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.13786975975049967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13700280476621962d + "'", double1 == 0.13700280476621962d);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6632456843634444d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.071731403574208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 118.70146570951638d + "'", double1 == 118.70146570951638d);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6974863893961706d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.234021194410018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.494664241363263d + "'", double1 == 1.494664241363263d);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.926969347450164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.588511276868499d) + "'", double1 == (-4.588511276868499d));
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6419693473089224d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        double double1 = org.apache.commons.math.util.FastMath.sin(147.4131591025766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23934930027803344d + "'", double1 == 0.23934930027803344d);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        double double1 = org.apache.commons.math.util.FastMath.tan(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.380515006246586d) + "'", double1 == (-3.380515006246586d));
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1574928494310313d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 1L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.663310606035718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4602546797556596d + "'", double1 == 0.4602546797556596d);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 2005.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        double double1 = org.apache.commons.math.util.FastMath.tanh(8.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999997749296758d + "'", double1 == 0.9999997749296758d);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.1494681981443936d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.49297772472673135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6371840522608367d + "'", double1 == 1.6371840522608367d);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        double double1 = org.apache.commons.math.util.FastMath.log(7.93006726156721E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.30685281944006d + "'", double1 == 34.30685281944006d);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.7949001954883153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.248076799411382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9903383527331044d + "'", double1 == 2.9903383527331044d);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.0951332666770965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.1247888682360925d + "'", double1 == 4.1247888682360925d);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        double double1 = org.apache.commons.math.util.FastMath.log(7.80544915674607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.054822099620526d + "'", double1 == 2.054822099620526d);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9088714301767988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1735.209878559419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1735.2098785594192d + "'", double1 == 1735.2098785594192d);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        double double1 = org.apache.commons.math.util.FastMath.signum(6.17645900500726E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.051480451855675305d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.494664241363263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.457839543417076d + "'", double1 == 3.457839543417076d);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.3554432E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9765172909509285d) + "'", double1 == (-0.9765172909509285d));
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000047d + "'", double1 == 1.0000000000000047d);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.420282415626885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8896578254184928d + "'", double1 == 0.8896578254184928d);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.029000719225137573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.66161881444429d + "'", double1 == 1.66161881444429d);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.017939523577309636d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        double double1 = org.apache.commons.math.util.FastMath.cos(7.93006726156721E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5401219231953477d + "'", double1 == 0.5401219231953477d);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.14027452341391E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1402745234035877E-6d + "'", double1 == 3.1402745234035877E-6d);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.1472859194620699d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14623453909346465d + "'", double1 == 0.14623453909346465d);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5401219231953477d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8143865674904548d + "'", double1 == 0.8143865674904548d);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.460094597035771d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4764999550079779d) + "'", double1 == (-0.4764999550079779d));
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.23934930027803344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.713704735340738d + "'", double1 == 13.713704735340738d);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '#', (float) 51L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10L, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        double double1 = org.apache.commons.math.util.FastMath.signum(13.067188648029997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.574710978503383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.50515463917526d + "'", double1 == 48.50515463917526d);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.015373606509534388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6610060414837631d + "'", double1 == 0.6610060414837631d);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9755461963938009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8280082726548262d + "'", double1 == 0.8280082726548262d);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        double double1 = org.apache.commons.math.util.FastMath.abs((-288.3206630503136d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 288.3206630503136d + "'", double1 == 288.3206630503136d);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.983070082218447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        long long2 = org.apache.commons.math.util.FastMath.min(51L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32, (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        double double1 = org.apache.commons.math.util.FastMath.abs(97.68799240441712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.68799240441712d + "'", double1 == 97.68799240441712d);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5294913521432763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2367260618840683d + "'", double1 == 1.2367260618840683d);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        long long2 = org.apache.commons.math.util.FastMath.max(39481480091341L, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091341L + "'", long2 == 39481480091341L);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        double double1 = org.apache.commons.math.util.FastMath.asin(11013.232920103324d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        double double1 = org.apache.commons.math.util.FastMath.abs(2453.035678413897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2453.035678413897d + "'", double1 == 2453.035678413897d);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9717769481908543d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1321130459272635d + "'", double1 == 1.1321130459272635d);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8052085614665847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8950841726012685d + "'", double1 == 0.8950841726012685d);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.9088339535934726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23066270610605835d + "'", double1 == 0.23066270610605835d);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        double double1 = org.apache.commons.math.util.FastMath.tanh(42.81354925721529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.652900463031381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3843321925803553d + "'", double1 == 1.3843321925803553d);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9147226107566937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9707255742310666d + "'", double1 == 0.9707255742310666d);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1259023567118747d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.2301052825991547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.056375972367417156d + "'", double1 == 0.056375972367417156d);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9676589901702034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.619165243970861d + "'", double1 == 1.619165243970861d);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.644298430695373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998150716581506d + "'", double1 == 0.9998150716581506d);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        double double1 = org.apache.commons.math.util.FastMath.abs(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.44127637925208785d, 2.1479594040306007d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4412763792520879d + "'", double2 == 0.4412763792520879d);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.7035516195697273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1258102894883197d + "'", double1 == 1.1258102894883197d);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2533141373154901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22579135264471936d + "'", double1 == 0.22579135264471936d);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5702200276960676d, 1.1598987305185835d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6876964991326107d + "'", double2 == 1.6876964991326107d);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 3280L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3280 + "'", int1 == 3280);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        long long1 = org.apache.commons.math.util.FastMath.abs(51L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 51L + "'", long1 == 51L);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        double double1 = org.apache.commons.math.util.FastMath.ceil(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 52);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.011408233318727529d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.485329946666348d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        float float1 = org.apache.commons.math.util.FastMath.abs(1.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        double double2 = org.apache.commons.math.util.FastMath.min(0.047460767623888615d, 0.5681875589916088d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.047460767623888615d + "'", double2 == 0.047460767623888615d);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.9943400969063074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.2181320109034326d) + "'", double1 == (-2.2181320109034326d));
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        double double1 = org.apache.commons.math.util.FastMath.tanh(631011.7651164598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5574077105338615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4430227150499066d + "'", double1 == 0.4430227150499066d);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        double double1 = org.apache.commons.math.util.FastMath.signum(12.610439577969121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8623188722876839d, 0.6414234112961992d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8623188722876839d + "'", double2 == 0.8623188722876839d);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.9830700822184464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9874615871121458d) + "'", double1 == (-0.9874615871121458d));
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0713634642907175d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.15481538423886812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.42846204504183943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2147483647, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0096275915360662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 36L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7015156767002263d, 2453.0356784138967d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7015156767002263d + "'", double2 == 0.7015156767002263d);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3205004784536856d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 3280);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3280 + "'", int2 == 3280);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        double double2 = org.apache.commons.math.util.FastMath.atan2(12.238292298814303d, 2453.0355994876113d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.004988998432693165d + "'", double2 == 0.004988998432693165d);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9891013135438892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.423022573449436d + "'", double1 == 1.423022573449436d);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1063634786066832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1063634786066834d + "'", double1 == 1.1063634786066834d);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        double double1 = org.apache.commons.math.util.FastMath.asinh(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.363655626077857d + "'", double1 == 2.363655626077857d);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        double double1 = org.apache.commons.math.util.FastMath.ceil(47.107771483580954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.0d + "'", double1 == 48.0d);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        float float1 = org.apache.commons.math.util.FastMath.abs(2.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.776356839400251E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.776356839400251E-15d + "'", double1 == 1.776356839400251E-15d);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0L, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.9999999999999999d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8414709848078965d, 21.445599564021325d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03921734824062372d + "'", double2 == 0.03921734824062372d);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        double double1 = org.apache.commons.math.util.FastMath.atan(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        double double1 = org.apache.commons.math.util.FastMath.log10(50.50495049504956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.703333949748545d + "'", double1 == 1.703333949748545d);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9999092042625952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.009574440517976634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009574147965999787d + "'", double1 == 0.009574147965999787d);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.2457500122259584d, 0.010308913146243286d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.528872126815999d + "'", double2 == 1.528872126815999d);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7234772904593856d, 2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.220446049250313E-16d + "'", double2 == 2.220446049250313E-16d);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.810477380965351d + "'", double1 == 4.810477380965351d);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.25096172890041585d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.004380108465809665d) + "'", double1 == (-0.004380108465809665d));
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8280082726548262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8280082726548263d + "'", double1 == 0.8280082726548263d);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.27746265011900656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2706542725261827d + "'", double1 == 0.2706542725261827d);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.3665789367467411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0679458541891842d + "'", double1 == 1.0679458541891842d);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7005834764389589d, 0.04537685793879663d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04537685793879663d + "'", double2 == 0.04537685793879663d);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10701348355876977d) + "'", double1 == (-0.10701348355876977d));
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        double double1 = org.apache.commons.math.util.FastMath.tanh(57.271284253105414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        int int2 = org.apache.commons.math.util.FastMath.min(2, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0811447892938331E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001081203235103d + "'", double1 == 1.0001081203235103d);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.8656100066608416d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9778302553902034d) + "'", double1 == (-0.9778302553902034d));
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.290774892867231d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.29488975471104756d) + "'", double1 == (-0.29488975471104756d));
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 3280L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3280L + "'", long2 == 3280L);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.15339215657878688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39165310745452653d + "'", double1 == 0.39165310745452653d);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.7715216602443777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7715216602443777d + "'", double1 == 1.7715216602443777d);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 0, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.20977711114722197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.002650236923264503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0026467312379548666d + "'", double1 == 0.0026467312379548666d);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.460094597035771d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.44403286888919763d) + "'", double1 == (-0.44403286888919763d));
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5410395588486396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8148475049841903d + "'", double1 == 0.8148475049841903d);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.3124383412727525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7110135287323527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6113119967914531d + "'", double1 == 0.6113119967914531d);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.035274726494073E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.5108256237659907d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9929402025489149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0030769050645423827d) + "'", double1 == (-0.0030769050645423827d));
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8582650681910386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6537512907586591d + "'", double1 == 0.6537512907586591d);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5087348157117294d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.46895884275557587d) + "'", double1 == (-0.46895884275557587d));
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 2005L, 6.176458219595615E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707960187421175d + "'", double2 == 1.5707960187421175d);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.19334632705655572d, 138.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.19334632705655574d + "'", double2 == 0.19334632705655574d);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.00510204081635d + "'", double1 == 49.00510204081635d);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9925551120260716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6981196703948143d + "'", double1 == 1.6981196703948143d);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 5, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.23606797749979d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4623267743738125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44603181533298825d + "'", double1 == 0.44603181533298825d);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9971213268799871d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        double double1 = org.apache.commons.math.util.FastMath.abs(199.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 199.0d + "'", double1 == 199.0d);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.9481480091341E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0078125d + "'", double1 == 0.0078125d);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1259023567118747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8096121846576995d + "'", double1 == 0.8096121846576995d);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.8860316424407535E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 3);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        double double1 = org.apache.commons.math.util.FastMath.acos(8.788723182374374d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        int int2 = org.apache.commons.math.util.FastMath.min(32, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0000000000002274d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.2566275487052346d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        double double2 = org.apache.commons.math.util.FastMath.atan2(9.848857801796104d, 0.8235811162606056d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4873684330435484d + "'", double2 == 1.4873684330435484d);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8805765261215637d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.6151205168412615d, 4.741265442356241d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7719167525452196d + "'", double2 == 0.7719167525452196d);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5707963267948954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948957d + "'", double1 == 1.5707963267948957d);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.3936173560075417d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0068699188553262855d) + "'", double1 == (-0.0068699188553262855d));
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.5309649148733837d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876839d + "'", double1 == 0.8623188722876839d);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        long long1 = org.apache.commons.math.util.FastMath.round(2.0741994078890014d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.3923993423012373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41386243940890527d + "'", double1 == 0.41386243940890527d);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.2744808562922508d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.3216115088844413E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267816805d + "'", double1 == 1.5707963267816805d);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.557407724654903d, 0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5574077246549027d + "'", double2 == 1.5574077246549027d);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.357420103411657E28d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3574201034116572E28d + "'", double1 == 1.3574201034116572E28d);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        int int2 = org.apache.commons.math.util.FastMath.max(3, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.0278589874552748d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.09254849966825912d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        double double2 = org.apache.commons.math.util.FastMath.min(1.570705526933711d, 0.056454263945691766d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.056454263945691766d + "'", double2 == 0.056454263945691766d);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1912543356541123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.291206897498674d + "'", double1 == 2.291206897498674d);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        double double1 = org.apache.commons.math.util.FastMath.sin(9.306852821501208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11765201143093872d + "'", double1 == 0.11765201143093872d);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9455557866374293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4813536596690229d + "'", double1 == 1.4813536596690229d);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.23695510898143343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.381816156307044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9443504370351302d + "'", double1 == 0.9443504370351302d);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-23.03580664819349d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.0500272064426E9d) + "'", double1 == (-5.0500272064426E9d));
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8721824073781501d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8721824073781502d + "'", double1 == 0.8721824073781502d);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5707963267948967d, 2.112464991987175E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948597d + "'", double2 == 1.5707963267948597d);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.791759469228055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 102.66025548936804d + "'", double1 == 102.66025548936804d);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5960035785549811d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4675027412274724d + "'", double1 == 0.4675027412274724d);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.3728048593649235d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9335211344483768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.029875845395236918d) + "'", double1 == (-0.029875845395236918d));
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.644483341943245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06785346300039428d) + "'", double1 == (-0.06785346300039428d));
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0011273202561264d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9997917751171265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5503888718069867d + "'", double1 == 1.5503888718069867d);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.570796326794896d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.85186683311429d, 0.9998150716581506d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8518668331142898d + "'", double2 == 1.8518668331142898d);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9998000199980002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1748926318726323d + "'", double1 == 1.1748926318726323d);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7177916798535343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9030746578456205d + "'", double1 == 0.9030746578456205d);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2233932393493425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8406522687884861d + "'", double1 == 0.8406522687884861d);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        long long1 = org.apache.commons.math.util.FastMath.round(7.419949789789507E-4d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.0697079433475818d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.112464991987175E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        float float2 = org.apache.commons.math.util.FastMath.max(9.223372E18f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.06571071737855876d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 32, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        double double1 = org.apache.commons.math.util.FastMath.rint(8.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        float float2 = org.apache.commons.math.util.FastMath.max(2.14748365E9f, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8805765261215637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 10, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1675576188544794d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1074946319245942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0523757085397754d + "'", double1 == 1.0523757085397754d);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        float float2 = org.apache.commons.math.util.FastMath.min(35.0f, 51.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7239458651321878d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.22275386159456184d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8003118125268405d + "'", double1 == 0.8003118125268405d);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.12119940557253528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12060942723254259d + "'", double1 == 0.12060942723254259d);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8340324452479558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18148297420509218d) + "'", double1 == (-0.18148297420509218d));
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        double double1 = org.apache.commons.math.util.FastMath.tanh(10.571645135349055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999986859385d + "'", double1 == 0.9999999986859385d);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5514266812416906d + "'", double1 == 0.5514266812416906d);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.5424779506349352E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        double double2 = org.apache.commons.math.util.FastMath.max(0.2457500122259584d, 0.17364817766693033d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2457500122259584d + "'", double2 == 0.2457500122259584d);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 3280);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3280L + "'", long2 == 3280L);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        int int2 = org.apache.commons.math.util.FastMath.min(36, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.038399603650754E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.11742496684289d), 57.271284253105414d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1174249668428897d) + "'", double2 == (-1.1174249668428897d));
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.43081945257903537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6563683817636521d + "'", double1 == 0.6563683817636521d);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.6696927901138922d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7208856239751529d) + "'", double1 == (-0.7208856239751529d));
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-2.7673480719979073d), 0.029000719225137573d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5603171037625536d) + "'", double2 == (-1.5603171037625536d));
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.38195407365429795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.010308913146243284d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2240401467946809d, 0.20637502874300212d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4037656825238871d + "'", double2 == 1.4037656825238871d);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-3.6030305945752334d), 1.5737618316160396d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1589833505355636d) + "'", double2 == (-1.1589833505355636d));
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.570794982590176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.273736754432579E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267946692d + "'", double1 == 1.5707963267946692d);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.04747859541485403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 3280L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0959035329611d + "'", double1 == 8.0959035329611d);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9914978027470505d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.1194710708535681d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11975712045798752d) + "'", double1 == (-0.11975712045798752d));
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.798718793048466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9417923783146559d) + "'", double1 == (-0.9417923783146559d));
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7147307549458812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7771562635532541d + "'", double1 == 0.7771562635532541d);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        int int2 = org.apache.commons.math.util.FastMath.min(52, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        long long2 = org.apache.commons.math.util.FastMath.min(35L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        double double1 = org.apache.commons.math.util.FastMath.asinh(137.38927884571783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.615978772723304d + "'", double1 == 5.615978772723304d);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.13355056135114904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1331539194450892d + "'", double1 == 0.1331539194450892d);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7562097583875903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7132953246693796d + "'", double1 == 0.7132953246693796d);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (short) -1, (-0.9202613644617779d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(6558.851092551817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 80.9867340528794d + "'", double1 == 80.9867340528794d);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5473651378551416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.594700892207039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 263.25696924845715d + "'", double1 == 263.25696924845715d);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.38625675609943166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6900198725289799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8306743480624521d + "'", double1 == 0.8306743480624521d);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.44403286888919763d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        double double1 = org.apache.commons.math.util.FastMath.log10(7.951386703658792E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.099557124773774d) + "'", double1 == (-15.099557124773774d));
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6214949279424251d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 3280, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3280L + "'", long2 == 3280L);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        double double1 = org.apache.commons.math.util.FastMath.acosh(138.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.620387737964422d + "'", double1 == 5.620387737964422d);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5707055269350272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027413983024288702d + "'", double1 == 0.027413983024288702d);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7615165085805535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.8797429772373989d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7937339868319561d) + "'", double1 == (-0.7937339868319561d));
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7854964800073828d, 0.019228399099707562d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9953682684385264d + "'", double2 == 0.9953682684385264d);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.23644098054602897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2667327915362043d + "'", double1 == 1.2667327915362043d);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4037656825238871d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8770365420904747d + "'", double1 == 0.8770365420904747d);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        long long1 = org.apache.commons.math.util.FastMath.round(4.493423335506387d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        long long1 = org.apache.commons.math.util.FastMath.round(2.3025850929940463d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.723945865132188d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6193475142995275d + "'", double1 == 0.6193475142995275d);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5729.5779513082325d + "'", double1 == 5729.5779513082325d);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.7253825588523148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6146685600490525d + "'", double1 == 5.6146685600490525d);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        double double1 = org.apache.commons.math.util.FastMath.signum(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0213710154485947d, 89.00499281765603d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0213710154485947d + "'", double2 == 1.0213710154485947d);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6900770828544028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012044117188367039d + "'", double1 == 0.012044117188367039d);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 2005);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2005L + "'", long1 == 2005L);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9233096377747994d, 0.2754679320391345d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9782600344876317d + "'", double2 == 0.9782600344876317d);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8656496755126944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6991570920917849d + "'", double1 == 0.6991570920917849d);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '#', (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6900770828544028d, 1.1088821403655396d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5566682095218779d + "'", double2 == 0.5566682095218779d);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.605170185988091d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.9903383527331044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5879598790812549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8003118125268405d + "'", double1 == 1.8003118125268405d);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5707963267948968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.451582705289455d + "'", double1 == 0.451582705289455d);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.4593566380802732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8975275723469739d + "'", double1 == 0.8975275723469739d);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 1, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        double double1 = org.apache.commons.math.util.FastMath.sin(11.553863346113918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8481626989605049d) + "'", double1 == (-0.8481626989605049d));
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        int int2 = org.apache.commons.math.util.FastMath.min(3, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0074423261227956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5340248990657174d + "'", double1 == 0.5340248990657174d);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.07270966677774478d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5501702829958329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.570796326794879d), 0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8623188722876839d + "'", double2 == 0.8623188722876839d);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.4342944819032518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3606730780703395d + "'", double1 == 0.3606730780703395d);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5422326689561365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.675016391586134d + "'", double1 == 3.675016391586134d);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        double double1 = org.apache.commons.math.util.FastMath.rint(57.816495852442316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 58.0d + "'", double1 == 58.0d);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5706882123157566d, 0.9606232348570213d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0218955299763328d + "'", double2 == 1.0218955299763328d);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.465735902799727d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 2005);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2005 + "'", int2 == 2005);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5108256237659906d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7993878774634113d) + "'", double1 == (-0.7993878774634113d));
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.837589179357618E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9999999999999645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182818284589487d + "'", double1 == 1.7182818284589487d);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.6908443102518884d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-96.87824279114196d) + "'", double1 == (-96.87824279114196d));
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.532821681221366d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.284009411162292d, 1.3831970825634745d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0262690355566166d + "'", double2 == 1.0262690355566166d);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.35650241886700945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006222141000553268d + "'", double1 == 0.006222141000553268d);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.12270990624068587d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11574532203027807d + "'", double1 == 0.11574532203027807d);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        long long1 = org.apache.commons.math.util.FastMath.round(1.6981196703948143d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        long long1 = org.apache.commons.math.util.FastMath.round(0.09221082649558883d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.44403286888919763d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0001966525547152d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3L, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3279.925622497139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        double double1 = org.apache.commons.math.util.FastMath.abs(49.00510204081635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.00510204081635d + "'", double1 == 49.00510204081635d);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.24541566109532464d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.14782604738794858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0109461818722032d + "'", double1 == 1.0109461818722032d);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        double double2 = org.apache.commons.math.util.FastMath.min(1.570796326794896d, 0.32317036277189654d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.32317036277189654d + "'", double2 == 0.32317036277189654d);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.44403286888919763d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(9.079573912775347E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079573912775348E-5d + "'", double1 == 9.079573912775348E-5d);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        double double1 = org.apache.commons.math.util.FastMath.tanh(573.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 32, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        double double1 = org.apache.commons.math.util.FastMath.abs(9.079573887825082E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079573887825082E-5d + "'", double1 == 9.079573887825082E-5d);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9199653037215055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9199653037215056d + "'", double1 == 0.9199653037215056d);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.211102550927978d + "'", double1 == 7.211102550927978d);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5707963267948597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        double double2 = org.apache.commons.math.util.FastMath.max(2.0867705308894857d, 5.332679130150692d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.332679130150692d + "'", double2 == 5.332679130150692d);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.19486506597972084d, 9.079986106087252E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9998515125805979d + "'", double2 == 0.9998515125805979d);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 12.238292298814303d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6632456843634446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41060979278765175d) + "'", double1 == (-0.41060979278765175d));
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0213710154485947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7769994643832112d + "'", double1 == 1.7769994643832112d);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(23.566702073076858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1350.2725658295117d + "'", double1 == 1350.2725658295117d);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9978058928475745d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(123.44001497540268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7072.591881122252d + "'", double1 == 7072.591881122252d);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.05729428410226429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.029000719225137573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1702959753638869d + "'", double1 == 0.1702959753638869d);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 32, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        double double1 = org.apache.commons.math.util.FastMath.rint(100.00000000000011d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.15339215657878688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.4122900538217174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1219529208307404d + "'", double1 == 1.1219529208307404d);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 51L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 51 + "'", int1 == 51);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        double double1 = org.apache.commons.math.util.FastMath.sin(5.362545819211763E122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5057720758044307d + "'", double1 == 0.5057720758044307d);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6023002278876782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5665394379443537d + "'", double1 == 0.5665394379443537d);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.35650241886700945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3641021037370766d + "'", double1 == 0.3641021037370766d);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        double double1 = org.apache.commons.math.util.FastMath.exp(6.17645782688986E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0006178365651222d + "'", double1 == 1.0006178365651222d);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.6908443102518884d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18436379801697833d + "'", double1 == 0.18436379801697833d);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.9765172909509285d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6233795230203681d) + "'", double1 == (-0.6233795230203681d));
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.41386243940890527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0218955299763328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5691842460354224d + "'", double1 == 1.5691842460354224d);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5294913521432763d, 2.2737367544328376E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2737367544328376E-13d + "'", double2 == 2.2737367544328376E-13d);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0001966525547152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8815126345383952d + "'", double1 == 0.8815126345383952d);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 51, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.8809094881441943E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.903339110766513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2688363802786091d + "'", double1 == 1.2688363802786091d);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8280082726548263d, 1.7715216602443775d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.43722873960471553d + "'", double2 == 0.43722873960471553d);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8135279227115655d, 1.6876964991326107d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8135279227115656d + "'", double2 == 0.8135279227115656d);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.28847397809838626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.129366163845515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.116272937678812d + "'", double1 == 2.116272937678812d);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.325835187949904d, 2.7668694253884004E30d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.8259963669851865d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6783203845295841d) + "'", double1 == (-0.6783203845295841d));
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.043964956056685586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5268171949666718d + "'", double1 == 1.5268171949666718d);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8486007400083447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6389612763136348d + "'", double1 == 0.6389612763136348d);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.1258102894883197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49650242647406817d + "'", double1 == 0.49650242647406817d);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 10, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        double double1 = org.apache.commons.math.util.FastMath.sin((-2.3079900215284027E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3079900213234987E-5d) + "'", double1 == (-2.3079900213234987E-5d));
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.106250657255404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.169533543042907d + "'", double1 == 4.169533543042907d);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8143865674904548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8143865674904548d + "'", double1 == 0.8143865674904548d);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        float float2 = org.apache.commons.math.util.FastMath.min(1.0f, 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8940757456435277d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.4694715627858907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8918074856677578d + "'", double1 == 0.8918074856677578d);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        double double1 = org.apache.commons.math.util.FastMath.cosh(7872.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5707963267948954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5202860320095168d, (-0.882947592858927d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.882947592858927d) + "'", double2 == (-0.882947592858927d));
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.1331539194450892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13237524813391602d + "'", double1 == 0.13237524813391602d);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.3678794411714424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1940688187363215d + "'", double1 == 1.1940688187363215d);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        double double2 = org.apache.commons.math.util.FastMath.max(2.104278850811079d, 1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.104278850811079d + "'", double2 == 2.104278850811079d);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        double double1 = org.apache.commons.math.util.FastMath.log10(2302.9401181042886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.362282645426244d + "'", double1 == 3.362282645426244d);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.04747859541485403d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.978364500953377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.660102087863946d + "'", double1 == 2.660102087863946d);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        float float2 = org.apache.commons.math.util.FastMath.min(3.0f, (float) 39481480091341L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7595020127952743d, 0.8012298966644482d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8021880834897168d + "'", double2 == 0.8021880834897168d);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        double double2 = org.apache.commons.math.util.FastMath.max(0.12236703082541885d, 0.24331311680122622d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.24331311680122622d + "'", double2 == 0.24331311680122622d);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103323d + "'", double1 == 11013.232920103323d);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.697768889097982E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999999931632527d + "'", double1 == 0.999999931632527d);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.0011563803982365727d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0011563801405149337d) + "'", double1 == (-0.0011563801405149337d));
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        long long2 = org.apache.commons.math.util.FastMath.min(2147483647L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6321205588285577d) + "'", double1 == (-0.6321205588285577d));
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4813536596690229d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025854498747691985d + "'", double1 == 0.025854498747691985d);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8358515696195364d, 80.9867340528794d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.010320479063999152d + "'", double2 == 0.010320479063999152d);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        long long2 = org.apache.commons.math.util.FastMath.max(3280L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3280L + "'", long2 == 3280L);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 3.7621956910836314d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '#', (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.4397629335614917d, 0.9775291852754583d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.439762933561491d + "'", double2 == 2.439762933561491d);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        int int2 = org.apache.commons.math.util.FastMath.max(1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.6696927901138922d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6696927901138922d + "'", double1 == 0.6696927901138922d);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        int int2 = org.apache.commons.math.util.FastMath.max(3280, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3280 + "'", int2 == 3280);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.3277046831761643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.078429063317607d + "'", double1 == 5.078429063317607d);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6610060414837631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6204290412244261d + "'", double1 == 0.6204290412244261d);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.019230769230769586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019233140238467443d + "'", double1 == 0.019233140238467443d);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.5922362574545064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41367458077606883d + "'", double1 == 0.41367458077606883d);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4567608960260546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44104337593103254d + "'", double1 == 0.44104337593103254d);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7068730370437739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.706873037043774d + "'", double1 == 0.706873037043774d);
    }
}

