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
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.0664977916380836d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2804875905732958d) + "'", double1 == (-1.2804875905732958d));
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.63064585426075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7424877582997027d + "'", double1 == 0.7424877582997027d);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-53), (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 793006726156715L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0000000000000009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        long long1 = org.apache.commons.math.util.FastMath.abs(39481480091340L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 39481480091340L + "'", long1 == 39481480091340L);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.7456418720467646d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.940877490667089d) + "'", double1 == (-0.940877490667089d));
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.24650636127268888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24901046636122032d + "'", double1 == 0.24901046636122032d);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        double double2 = org.apache.commons.math.util.FastMath.min(0.4576692332118569d, 1.3745669993918974d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4576692332118569d + "'", double2 == 0.4576692332118569d);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        double double1 = org.apache.commons.math.util.FastMath.asinh(41.671325557916006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.423104373056463d + "'", double1 == 4.423104373056463d);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.10666980032367356d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10626705440853382d) + "'", double1 == (-0.10626705440853382d));
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17632698070846498d + "'", double1 == 0.17632698070846498d);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        double double2 = org.apache.commons.math.util.FastMath.atan2(31.306852819440046d, (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5419290584994321d + "'", double2 == 0.5419290584994321d);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        double double1 = org.apache.commons.math.util.FastMath.rint(42.12656474461543d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42.0d + "'", double1 == 42.0d);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        int int2 = org.apache.commons.math.util.FastMath.min(36, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 5, 1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5574077246549023d + "'", double2 == 1.5574077246549023d);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 2.14748365E9f, 4.3777255673228614d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1474836479999998E9d + "'", double2 == 2.1474836479999998E9d);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9672751491015754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03327228511758094d) + "'", double1 == (-0.03327228511758094d));
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.5659347597369016E23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1477896, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) (-2L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        double double1 = org.apache.commons.math.util.FastMath.floor(5.729577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        float float2 = org.apache.commons.math.util.FastMath.max(97.0f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.01505863975516233d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-3.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.017874927409903d) + "'", double1 == (-10.017874927409903d));
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.703530868239122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.25111902873535263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22403837382938316d + "'", double1 == 0.22403837382938316d);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5851102438039822d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.0476958419065936d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.5712556729872575d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8253806476966538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9085046217255329d + "'", double1 == 0.9085046217255329d);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 3, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        double double1 = org.apache.commons.math.util.FastMath.tanh(10.049875621120886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999962690542d + "'", double1 == 0.9999999962690542d);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5282839739597525d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8083928780200789d) + "'", double1 == (-0.8083928780200789d));
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.8402785435782614d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 1, 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5840734641020676d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6719977351570301d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6719977351570302d + "'", double1 == 0.6719977351570302d);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9286112600478652d + "'", double1 == 0.9286112600478652d);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876839d + "'", double1 == 0.8623188722876839d);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.3112315471152565E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.565996913733098E7d + "'", double1 == 6.565996913733098E7d);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5223184878037187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        float float1 = org.apache.commons.math.util.FastMath.abs((-2.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 57);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 57L + "'", long1 == 57L);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 97L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.58351893845611d, 11013.232874695796d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5835189384561104d + "'", double2 == 3.5835189384561104d);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5419290584994321d, 4.691029831908529d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5419290584994321d + "'", double2 == 0.5419290584994321d);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100L, (float) 1477896);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0429652634610682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.77905632175577d + "'", double1 == 0.77905632175577d);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.10666980032367356d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1011775851339626d) + "'", double1 == (-0.1011775851339626d));
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4210854715201906E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000142d + "'", double1 == 1.0000000000000142d);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6955886362231636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.769238901363972d + "'", double1 == 0.769238901363972d);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 53L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53.0f + "'", float1 == 53.0f);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 57);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        double double1 = org.apache.commons.math.util.FastMath.asin(9.0871877068532832E16d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.6878438789017723E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6878438789017723E18d + "'", double1 == 2.6878438789017723E18d);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.577309983889371d, (-1.7678470809183597d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5773099838893709d + "'", double2 == 0.5773099838893709d);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 36.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2062.6480624709634d + "'", double1 == 2062.6480624709634d);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        double double1 = org.apache.commons.math.util.FastMath.abs(10.017874927409903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.017874927409903d + "'", double1 == 10.017874927409903d);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-4.965964575870387E-6d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.965976906313293E-6d) + "'", double1 == (-4.965976906313293E-6d));
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.219022125506721d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.4771212547196624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9956156978709082d + "'", double1 == 0.9956156978709082d);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6699684639824476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.38636539305675d + "'", double1 == 38.38636539305675d);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6765182208109524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7430243621557114d + "'", double1 == 0.7430243621557114d);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.403108691970989E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2351647362715017E-22d + "'", double1 == 4.2351647362715017E-22d);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5143524375699184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 1477896);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1477896L + "'", long1 == 1477896L);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.8108072797718955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.32394487827058d + "'", double1 == 14.32394487827058d);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.709975946676697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9903301413773637d + "'", double1 == 0.9903301413773637d);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.637986554446436d, (double) 5L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8452989082960941d + "'", double2 == 0.8452989082960941d);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.253350360695029d, 2.3283064365386963E-10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.57079632660913d + "'", double2 == 1.57079632660913d);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-3036.676314193363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        double double1 = org.apache.commons.math.util.FastMath.signum(14.206130012655933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.4593566380802732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1720048136876373d + "'", double1 == 1.1720048136876373d);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.3686469200204923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.682927644892203d + "'", double1 == 9.682927644892203d);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5527050564662712d, (-0.5282839739597525d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5527050564662712d + "'", double2 == 0.5527050564662712d);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 2.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5654575915353359d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        double double2 = org.apache.commons.math.util.FastMath.max(36.043653389117146d, 1.8402785435782614d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 36.043653389117146d + "'", double2 == 36.043653389117146d);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 42.042831059009366d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9581452714622315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2804516987794936d + "'", double1 == 1.2804516987794936d);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.41498791363815524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42792951869037016d + "'", double1 == 0.42792951869037016d);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        double double2 = org.apache.commons.math.util.FastMath.max(86.73801698433718d, 1.3732849892136236d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 86.73801698433718d + "'", double2 == 86.73801698433718d);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (-36));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-7.091998009803879d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7692389013639721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.07414248543583d + "'", double1 == 44.07414248543583d);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.658584751965128d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1262023.5276316951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1123.39820528239d + "'", double1 == 1123.39820528239d);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7895608642289974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.008360251176708d + "'", double1 == 1.008360251176708d);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.007421261501110636d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.5777877754722899d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5461721541136804d) + "'", double1 == (-0.5461721541136804d));
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        double double1 = org.apache.commons.math.util.FastMath.tan(115.35421880301885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2213312276126236d) + "'", double1 == (-1.2213312276126236d));
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9966758829408293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4892370193052502d + "'", double1 == 1.4892370193052502d);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        double double1 = org.apache.commons.math.util.FastMath.sin(6.6578275518955335E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8140679949148034d) + "'", double1 == (-0.8140679949148034d));
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.433704240591099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        int int2 = org.apache.commons.math.util.FastMath.min(32, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        double double1 = org.apache.commons.math.util.FastMath.exp((-86.33580274416312d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1976967646632825E-38d + "'", double1 == 3.1976967646632825E-38d);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7556616167207904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2801615999341825d) + "'", double1 == (-0.2801615999341825d));
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.56173368499807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        double double1 = org.apache.commons.math.util.FastMath.tan((-39.206747378977376d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.811548117507941d) + "'", double1 == (-15.811548117507941d));
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.723489952777984d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2733360428781544d + "'", double1 == 1.2733360428781544d);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9584036466699126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04248624667210518d) + "'", double1 == (-0.04248624667210518d));
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6995216443485196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        int int2 = org.apache.commons.math.util.FastMath.max(11013, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(148.20890535952418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 148.2089053595242d + "'", double1 == 148.2089053595242d);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        double double1 = org.apache.commons.math.util.FastMath.signum(68.40322401739336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.9997894669934126d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        double double1 = org.apache.commons.math.util.FastMath.expm1(9.825659180793972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18501.46380400819d + "'", double1 == 18501.46380400819d);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.01573708249221756d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.015736432937059376d) + "'", double1 == (-0.015736432937059376d));
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4677992676220695d + "'", double1 == 1.4677992676220695d);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.7405700602011438d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9402927170540545d) + "'", double1 == (-0.9402927170540545d));
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.980232238769532E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9802322387695326E-8d + "'", double1 == 2.9802322387695326E-8d);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.295779513082316d) + "'", double1 == (-57.295779513082316d));
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7809568482823821d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        double double1 = org.apache.commons.math.util.FastMath.cos(11.548739357257746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5253829059023629d + "'", double1 == 0.5253829059023629d);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-50.498986710526204d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.5573691630451039d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5084833071825032d) + "'", double1 == (-0.5084833071825032d));
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.3023186765274486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0920413661465178d + "'", double1 == 1.0920413661465178d);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.2213312276126236d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5484312221342833d) + "'", double1 == (-1.5484312221342833d));
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(22025.465703991664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1261966.226648863d + "'", double1 == 1261966.226648863d);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-36), (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-53L), (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.339637404328899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.3320915232243828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.055651037105448d + "'", double1 == 1.055651037105448d);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8887992509694498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.2924316695611777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1364083366959243d) + "'", double1 == (-1.1364083366959243d));
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.17632698070846498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17541469703878793d + "'", double1 == 0.17541469703878793d);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.2924316695611777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2924316695611777d + "'", double1 == 2.2924316695611777d);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 39481480091340L, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        double double1 = org.apache.commons.math.util.FastMath.abs((-50.498986710526204d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.498986710526204d + "'", double1 == 50.498986710526204d);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.20325541915325d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.221037751377339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.221037751377339d + "'", double1 == 1.221037751377339d);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6565667352442498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7047660992167044d + "'", double1 == 0.7047660992167044d);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.22481137595997358d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2267098339889183d) + "'", double1 == (-0.2267098339889183d));
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9640275800758169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8214948155164382d + "'", double1 == 0.8214948155164382d);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.529104380392399d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9102712041190427d) + "'", double1 == (-0.9102712041190427d));
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5826970349443759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1653756234894295d + "'", double1 == 1.1653756234894295d);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.2883311413111977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2783128248821491d + "'", double1 == 1.2783128248821491d);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8827157523517359d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015406296237756672d + "'", double1 == 0.015406296237756672d);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2697663311309155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.846168432333387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.129574352540827d + "'", double1 == 1.129574352540827d);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        int int2 = org.apache.commons.math.util.FastMath.min((-36), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(6.157240911549055d, 1.3023186765274488d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.157240911549054d + "'", double2 == 6.157240911549054d);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.5999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6094379124341003d + "'", double1 == 1.6094379124341003d);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        double double1 = org.apache.commons.math.util.FastMath.log(2.4441141450677315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8936827444199411d + "'", double1 == 0.8936827444199411d);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.8582226493088282d), 0.6701982005616954d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        long long1 = org.apache.commons.math.util.FastMath.abs((-53L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 53L + "'", long1 == 53L);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9171523356672744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        double double1 = org.apache.commons.math.util.FastMath.log(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        double double2 = org.apache.commons.math.util.FastMath.min(572.9577951308233d, 1.4488357507586564d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4488357507586564d + "'", double2 == 1.4488357507586564d);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.015736432937059376d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.015737732031283817d) + "'", double1 == (-0.015737732031283817d));
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.017066003704239316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017064347081341257d) + "'", double1 == (-0.017064347081341257d));
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.876278270531895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.8375930412496614d), 0.6190869198926164d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6190869198926164d + "'", double2 == 0.6190869198926164d);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.008977384716240355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999597035524652d + "'", double1 == 0.9999597035524652d);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        double double1 = org.apache.commons.math.util.FastMath.atanh(11.591953275521519d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        double double1 = org.apache.commons.math.util.FastMath.rint(69.9857113690718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70.0d + "'", double1 == 70.0d);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7692389013639721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        int int1 = org.apache.commons.math.util.FastMath.abs(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2147483647, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9964183022495265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7010979104724594d, (-0.5259944849453191d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5259944849453191d) + "'", double2 == (-0.5259944849453191d));
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.594700892207039d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        int int2 = org.apache.commons.math.util.FastMath.max(10, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.148283155648077d, 1.6699175736806615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9100343574741956d + "'", double2 == 0.9100343574741956d);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.912812809961445d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-2.675024856842625d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.6750248568426245d) + "'", double1 == (-2.6750248568426245d));
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.114722093336851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.960213901859517d + "'", double1 == 0.960213901859517d);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.529468828731893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7052062927726025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6481909307040588d + "'", double1 == 0.6481909307040588d);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-2L), (float) 11013);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9966758829408293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.998336557950689d + "'", double1 == 0.998336557950689d);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5686300059875781d, 0.6719977351570302d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.70227127294963d + "'", double2 == 0.70227127294963d);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.688117141816173E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.42944819032519d + "'", double1 == 43.42944819032519d);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.506328628316938E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.4823133060975066d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4480943461187145d) + "'", double1 == (-0.4480943461187145d));
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-2));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.021099236524914633d, 1.2460098192572937d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.016931824990597796d + "'", double2 == 0.016931824990597796d);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.2557610379370634d), (-2.041886155779305d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.041886155779305d) + "'", double2 == (-2.041886155779305d));
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        int int2 = org.apache.commons.math.util.FastMath.max(10, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8253806476966538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.7208852476093055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.030035113619780257d + "'", double1 == 0.030035113619780257d);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.03337773768597237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.033377737685972374d + "'", double1 == 0.033377737685972374d);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.017438277374752006d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017436510074825058d) + "'", double1 == (-0.017436510074825058d));
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8986761182296238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4317286541305323d + "'", double1 == 1.4317286541305323d);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        double double2 = org.apache.commons.math.util.FastMath.min(7.2638973976934564E18d, 2.7415668164626985d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7415668164626985d + "'", double2 == 2.7415668164626985d);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.998336557950689d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.541701295923297d + "'", double1 == 0.541701295923297d);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        int int2 = org.apache.commons.math.util.FastMath.min(2, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-2), (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.8402785435782612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.298292365610484d + "'", double1 == 6.298292365610484d);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.09895901520441384d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09912061004526737d) + "'", double1 == (-0.09912061004526737d));
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5195675877329186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6547583753982603d) + "'", double1 == (-0.6547583753982603d));
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.4317286541305323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9735166836958602d + "'", double1 == 1.9735166836958602d);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0001456277756542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000072811237089d + "'", double1 == 1.000072811237089d);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.248699261236361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.248699261236361d + "'", double1 == 4.248699261236361d);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        long long2 = org.apache.commons.math.util.FastMath.max(793006726156715L, (long) 1477896);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 793006726156715L + "'", long2 == 793006726156715L);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.4253120969346567d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.7260621198151926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3153519440251744d + "'", double1 == 1.3153519440251744d);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8199744766146694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7311284168939934d + "'", double1 == 0.7311284168939934d);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5L, (-2.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5707963267948961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1624473515096263d + "'", double1 == 1.1624473515096263d);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.1011775851339626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        double double1 = org.apache.commons.math.util.FastMath.tanh(9.306831672164943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999835100737d + "'", double1 == 0.9999999835100737d);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9997774193665461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5404895876275592d + "'", double1 == 0.5404895876275592d);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.24376859510303997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.4750868533986696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3935904433867401d + "'", double1 == 0.3935904433867401d);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8633639145424554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.649884463891855d + "'", double1 == 0.649884463891855d);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6765182208109524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5892512118024951d + "'", double1 == 0.5892512118024951d);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0920413661465178d, 4.716854397550169d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2275105810810727d + "'", double2 == 0.2275105810810727d);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(37.40464270515639d, 0.6085491459180241d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 37.404642705156384d + "'", double2 == 37.404642705156384d);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8113741275700294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3476231082807906d + "'", double1 == 1.3476231082807906d);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.2917098371502295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.25301474810019103d) + "'", double1 == (-0.25301474810019103d));
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 32, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.011800076512800236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01180035037395392d + "'", double1 == 0.01180035037395392d);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.0664977916380836d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8755136329925575d) + "'", double1 == (-0.8755136329925575d));
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        long long1 = org.apache.commons.math.util.FastMath.round(8.881784197001254E-16d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.706549328424579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.706549328424579d + "'", double1 == 0.706549328424579d);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.46627444884951624d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.32179921168174863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31113287105457993d + "'", double1 == 0.31113287105457993d);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        double double1 = org.apache.commons.math.util.FastMath.log10(22026.465703991664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.342944817241923d + "'", double1 == 4.342944817241923d);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5669767943827968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7629292891930137d + "'", double1 == 1.7629292891930137d);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.24376859510303997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.324546544903331d + "'", double1 == 1.324546544903331d);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        double double1 = org.apache.commons.math.util.FastMath.atanh(22.180709777452588d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9149994957367078d, 235.781718468518d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0038806863757765916d + "'", double2 == 0.0038806863757765916d);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        long long1 = org.apache.commons.math.util.FastMath.round(2062.6480624709634d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2063L + "'", long1 == 2063L);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.276858964458209d, (-0.017023944947506645d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5747767842239402d + "'", double2 == 1.5747767842239402d);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        long long2 = org.apache.commons.math.util.FastMath.max(1477896L, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2648389735541739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.264838973554174d + "'", double1 == 1.264838973554174d);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(42.042831059009366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7337858288394479d + "'", double1 == 0.7337858288394479d);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0986122886681098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4548324228266097d + "'", double1 == 0.4548324228266097d);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        long long1 = org.apache.commons.math.util.FastMath.round(0.27229885648267216d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        double double1 = org.apache.commons.math.util.FastMath.tan(5.691781362855433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6715908994405805d) + "'", double1 == (-0.6715908994405805d));
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.025630151592603893d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5964292853117084d + "'", double1 == 1.5964292853117084d);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.3305834282671767d, (-0.9092974268256817d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3305834282671762d + "'", double2 == 3.3305834282671762d);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5707963274966374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963274966377d + "'", double1 == 1.5707963274966377d);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.4823133060975066d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.2717628242082613d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        double double2 = org.apache.commons.math.util.FastMath.min(7.105427357601003E-15d, 0.9170656115321792d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.105427357601003E-15d + "'", double2 == 7.105427357601003E-15d);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.6881171418161737E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9993832155237184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8411375746967762d + "'", double1 == 0.8411375746967762d);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        double double1 = org.apache.commons.math.util.FastMath.cosh(10.566701978945693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19410.215896422804d + "'", double1 == 19410.215896422804d);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        double double1 = org.apache.commons.math.util.FastMath.rint(38.38636539305675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.0d + "'", double1 == 38.0d);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) (-36L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5430256902014756d) + "'", double1 == (-1.5430256902014756d));
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8726001743881419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9876308483262278d + "'", double1 == 0.9876308483262278d);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.19127348683183137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1912734868318314d + "'", double1 == 0.1912734868318314d);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6931471805599463d, 1.3887317335324654d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.46294531990550564d + "'", double2 == 0.46294531990550564d);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-35.350506208557206d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2025.4348094013415d) + "'", double1 == (-2025.4348094013415d));
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.716759133972877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9994396750506453d + "'", double1 == 0.9994396750506453d);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.2732005436470559d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.2734626020942639d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        double double1 = org.apache.commons.math.util.FastMath.cos(115.35421880301885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6335143900670387d) + "'", double1 == (-0.6335143900670387d));
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6699684639824475d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.710594084652733d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        int int2 = org.apache.commons.math.util.FastMath.min(2, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.6576833375608168d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7887200523027917d) + "'", double1 == (-0.7887200523027917d));
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.7763568394002505E-15d, (-0.4896826700609314d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7763568394002503E-15d + "'", double2 == 1.7763568394002503E-15d);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.7465363222182906d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8178372899398717d) + "'", double1 == (-0.8178372899398717d));
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8849970445005177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        double double1 = org.apache.commons.math.util.FastMath.atanh(90.00000004020679d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        long long1 = org.apache.commons.math.util.FastMath.round(5.388267471840756d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.540177670628365E45d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5370843467987585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 39481480091340L, (float) (-36));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        double double1 = org.apache.commons.math.util.FastMath.acosh(10.049875621120886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9982229502979694d + "'", double1 == 2.9982229502979694d);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-2L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.145976303209723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.816416721453645d + "'", double1 == 0.816416721453645d);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 53, (float) 53);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7215087615242686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9754001961551925d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9754001961551925d) + "'", double2 == (-0.9754001961551925d));
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(6.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.449489742783178d + "'", double1 == 2.449489742783178d);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        float float2 = org.apache.commons.math.util.FastMath.min((-36.0f), 11013.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9991461404922782d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.16035232751746503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1739244040089578d + "'", double1 == 1.1739244040089578d);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.4738147204144684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4412763792521019d + "'", double1 == 0.4412763792521019d);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        double double1 = org.apache.commons.math.util.FastMath.log(53.598150033144236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9815145531741134d + "'", double1 == 3.9815145531741134d);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-53L), 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (-53));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.2245999714347802d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9406701758307914d) + "'", double1 == (-0.9406701758307914d));
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        double double1 = org.apache.commons.math.util.FastMath.ceil(209.0252227135293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 210.0d + "'", double1 == 210.0d);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.1011775851339626d), 1.3235780930645504d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3235780930645504d + "'", double2 == 1.3235780930645504d);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.017436510074825058d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017437393630756623d) + "'", double1 == (-0.017437393630756623d));
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.5707963267948963d), 52.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948961d) + "'", double2 == (-1.5707963267948961d));
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.013310924178631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4189118803430434d + "'", double1 == 1.4189118803430434d);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.03952504136025236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.039535333357754006d + "'", double1 == 0.039535333357754006d);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.41032129904824216d), 2.155615773557597E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.9034992417551938E-16d) + "'", double2 == (-1.9034992417551938E-16d));
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32, 7.9300672E14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        double double1 = org.apache.commons.math.util.FastMath.floor((-2.675024856842625d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 7.9300672E14f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.99999999540764d + "'", double1 == 34.99999999540764d);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.4001817886098734d), 2.164473663317525E39d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.848864208384537E-40d) + "'", double2 == (-1.848864208384537E-40d));
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9986081305645496d, 1477895.5237245467d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.756960248771417E-7d + "'", double2 == 6.756960248771417E-7d);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        double double1 = org.apache.commons.math.util.FastMath.ulp(11.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.8369144593899815d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3102515536998522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8373564163103412d + "'", double1 == 0.8373564163103412d);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        long long1 = org.apache.commons.math.util.FastMath.round(4477855.166669106d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4477855L + "'", long1 == 4477855L);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.752220392306203d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        double double1 = org.apache.commons.math.util.FastMath.cos(148.20890535952418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.850400315662227d) + "'", double1 == (-0.850400315662227d));
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        double double1 = org.apache.commons.math.util.FastMath.sinh(231.58466047909457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.883259400089535E100d + "'", double1 == 1.883259400089535E100d);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 34L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-36), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9260416922830169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.828098672198483d + "'", double1 == 0.828098672198483d);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.32220799131551875d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3166616956814557d) + "'", double1 == (-0.3166616956814557d));
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.264838973554174d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 0, 1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(11.077668423659947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.328313149879372d + "'", double1 == 3.328313149879372d);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        double double1 = org.apache.commons.math.util.FastMath.floor(18501.46380400819d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18501.0d + "'", double1 == 18501.0d);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.31113287105457993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.826600379215485d + "'", double1 == 17.826600379215485d);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.16369732444195506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40459526003396906d + "'", double1 == 0.40459526003396906d);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        long long1 = org.apache.commons.math.util.FastMath.round(61.48941136975552d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 61L + "'", long1 == 61L);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.948148009133999E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.596393425240073d + "'", double1 == 13.596393425240073d);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6345784979980641d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(5.33632941342054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0931365182352061d + "'", double1 == 0.0931365182352061d);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5860134523134298E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25d + "'", double1 == 0.25d);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.7105940846527337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7227249945840306d + "'", double1 == 1.7227249945840306d);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.3083596576175056d, 3.3992162411495244E248d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        double double1 = org.apache.commons.math.util.FastMath.exp((-2.1317761108019555d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11862641298045705d + "'", double1 == 0.11862641298045705d);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        double double1 = org.apache.commons.math.util.FastMath.rint(6.565996913733098E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.5659969E7d + "'", double1 == 6.5659969E7d);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.008799151683644863d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008838092819754681d) + "'", double1 == (-0.008838092819754681d));
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        long long1 = org.apache.commons.math.util.FastMath.round(2.5971542229890328d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        long long1 = org.apache.commons.math.util.FastMath.round(0.40130793110770663d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.003215579132524195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0032155680495951195d + "'", double1 == 0.0032155680495951195d);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-34.768015146316124d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1992.0605299308352d) + "'", double1 == (-1992.0605299308352d));
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5860134523134308E15d + "'", double1 == 1.5860134523134308E15d);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.99998657637409d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        double double2 = org.apache.commons.math.util.FastMath.min(148.20890535952418d, 2.2618589996500895d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2618589996500895d + "'", double2 == 2.2618589996500895d);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.2538007084319281d, 1.5721494028333372d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1158173859015895d + "'", double2 == 0.1158173859015895d);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.264838973554174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8523926839062379d + "'", double1 == 0.8523926839062379d);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 97, (long) 57);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9751009553485449d, 1.5815107164388493d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5525092244297581d + "'", double2 == 0.5525092244297581d);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5401776706283436E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        double double1 = org.apache.commons.math.util.FastMath.exp(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6569265110688361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5049643868687765d + "'", double1 == 0.5049643868687765d);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        double double1 = org.apache.commons.math.util.FastMath.tanh(34.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-36));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        float float2 = org.apache.commons.math.util.FastMath.min(11013.0f, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.114722093336851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8977884248618486d + "'", double1 == 0.8977884248618486d);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.703530868239122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8462239673567167d) + "'", double1 == (-0.8462239673567167d));
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-36.04365338911715d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.043653389117146d) + "'", double1 == (-36.043653389117146d));
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 1.570705526935434d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        double double2 = org.apache.commons.math.util.FastMath.max(1.385849999980594d, 1.4317286541305323d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4317286541305323d + "'", double2 == 1.4317286541305323d);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-2.1374118819130998E-18d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.1374118819130998E-18d) + "'", double1 == (-2.1374118819130998E-18d));
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.3485292390836008d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7403781783870954d) + "'", double1 == (-0.7403781783870954d));
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.4650188248182272d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        int int2 = org.apache.commons.math.util.FastMath.min(36, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5401776706283436E45d, (double) 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.9132212823529585d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.72191732992486d + "'", double1 == 2.72191732992486d);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        float float1 = org.apache.commons.math.util.FastMath.abs(11013.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 11013.0f + "'", float1 == 11013.0f);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8726001743881419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9555903714699527d + "'", double1 == 0.9555903714699527d);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.403108691968676E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1599753909038675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1898547757074525d + "'", double1 == 2.1898547757074525d);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 631011.7625152355d + "'", double1 == 631011.7625152355d);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        double double1 = org.apache.commons.math.util.FastMath.ceil(7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.93006726156716E14d + "'", double1 == 7.93006726156716E14d);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9023219280642616d, 1.226694653653776d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.634202896939395d + "'", double2 == 0.634202896939395d);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.3153655518886576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005504167227826097d + "'", double1 == 0.005504167227826097d);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.41671114415975286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3483380896528481d + "'", double1 == 0.3483380896528481d);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9810147281934775d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        long long1 = org.apache.commons.math.util.FastMath.abs(61L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 61L + "'", long1 == 61L);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5840734641020676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7642469915557847d + "'", double1 == 0.7642469915557847d);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        double double2 = org.apache.commons.math.util.FastMath.min(0.41671114415975286d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0730374999763912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2911401090912527d + "'", double1 == 1.2911401090912527d);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.948148009134034E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134034E13d + "'", double1 == 3.948148009134034E13d);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.11275809360067206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.3023186765274488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9748575314241001d + "'", double1 == 1.9748575314241001d);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        double double2 = org.apache.commons.math.util.FastMath.min(6.326458826000224E8d, 0.02109767107454078d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02109767107454078d + "'", double2 == 0.02109767107454078d);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4047671643148918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(5.729577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.729577951308233d + "'", double1 == 5.729577951308233d);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1555698629817919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8195908673690073d + "'", double1 == 0.8195908673690073d);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-36), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 57.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.4944324908505626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.49443249085056257d) + "'", double1 == (-0.49443249085056257d));
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6931471805599462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8325546111576982d + "'", double1 == 0.8325546111576982d);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.324546544903331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        double double2 = org.apache.commons.math.util.FastMath.max(1.719463918234335d, 0.6765182208109524d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.719463918234335d + "'", double2 == 1.719463918234335d);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5106730734832936d, 22.18070977745259d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9421.685482771907d + "'", double2 == 9421.685482771907d);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 3.912812809961445d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2804516987794936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24721290535208976d + "'", double1 == 0.24721290535208976d);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8593267093280548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3615701351686145d + "'", double1 == 1.3615701351686145d);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.414062290979883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 195.61136026791206d + "'", double1 == 195.61136026791206d);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        int int2 = org.apache.commons.math.util.FastMath.min(34, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.618990892446662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.46556569423d + "'", double1 == 35.46556569423d);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        double double1 = org.apache.commons.math.util.FastMath.signum((-86.33580274416312d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6890624663225461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8300978655089688d + "'", double1 == 0.8300978655089688d);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-2), (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        double double1 = org.apache.commons.math.util.FastMath.ceil(34.982780458176066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.658584751965128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8700360014895149d + "'", double1 == 0.8700360014895149d);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        double double1 = org.apache.commons.math.util.FastMath.sin(8.467717607067357E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7653233053981704d + "'", double1 == 0.7653233053981704d);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.017436510074825058d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017435626545756002d) + "'", double1 == (-0.017435626545756002d));
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.154434690031884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.253522697326158d + "'", double1 == 4.253522697326158d);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9727829084506698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.645295841649998d + "'", double1 == 2.645295841649998d);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4645918875615231d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.32577747641597d + "'", double1 == 4.32577747641597d);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5855174436770063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7959200327197421d + "'", double1 == 0.7959200327197421d);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.7621956910836314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        int int2 = org.apache.commons.math.util.FastMath.min((-53), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9830787956514044d, 56.93525951038501d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9830787956514044d + "'", double2 == 0.9830787956514044d);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.1223881891967115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12208469106610245d + "'", double1 == 0.12208469106610245d);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-36), (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.63064585426075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6732878491822778d + "'", double1 == 0.6732878491822778d);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9999500037496876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5572364748926293d + "'", double1 == 1.5572364748926293d);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.999303822951033d, 0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9952563459747216d + "'", double2 == 0.9952563459747216d);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.6878438789017723E18d, 1.2067705094227903d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6878438789017718E18d + "'", double2 == 2.6878438789017718E18d);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.9697296111063074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1189396031849523d) + "'", double1 == (-1.1189396031849523d));
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (-3L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.4538869113115327d, 7.2638973976934574E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        long long2 = org.apache.commons.math.util.FastMath.max(1477896L, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7813863964118538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6739119692147136d + "'", double1 == 0.6739119692147136d);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9581452714622315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.716759133972877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9893663289106042d + "'", double1 == 0.9893663289106042d);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0489207050997464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31153476727509205d + "'", double1 == 0.31153476727509205d);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, 4477855L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.010714389648659332d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000573996218827d + "'", double1 == 1.0000573996218827d);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.5474914758024213E29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5474914758024213E29d + "'", double1 == 2.5474914758024213E29d);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2063L, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        int int2 = org.apache.commons.math.util.FastMath.min(57, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        long long1 = org.apache.commons.math.util.FastMath.round(28.476411608537198d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 28L + "'", long1 == 28L);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        double double1 = org.apache.commons.math.util.FastMath.cos(28.4764116085372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9796516822121061d) + "'", double1 == (-0.9796516822121061d));
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0686474581524463E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        int int1 = org.apache.commons.math.util.FastMath.round(3.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        double double2 = org.apache.commons.math.util.FastMath.min(0.866213764556301d, (-0.10017290084007202d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.10017290084007202d) + "'", double2 == (-0.10017290084007202d));
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        long long2 = org.apache.commons.math.util.FastMath.max(2L, 1477896L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        double double1 = org.apache.commons.math.util.FastMath.atan((-7.091998009803879d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4307158335586432d) + "'", double1 == (-1.4307158335586432d));
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 3);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8199744766146694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6094298995694992d + "'", double1 == 0.6094298995694992d);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        double double2 = org.apache.commons.math.util.FastMath.max(0.03490658503988659d, 1.0484411939287768d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0484411939287768d + "'", double2 == 1.0484411939287768d);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5157707046119765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.287543329097423d) + "'", double1 == (-0.287543329097423d));
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.3996012668469272d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 97);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.38905609893065d + "'", double1 == 7.38905609893065d);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 793006726156715L, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.7853981633974483d), 0.5669767943827967d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8452989082960941d, 35.46556569423d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.46556569423d + "'", double2 == 35.46556569423d);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5374883357278658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1479579986039938d + "'", double1 == 1.1479579986039938d);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.842859999667966E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8792846300053567d) + "'", double1 == (-0.8792846300053567d));
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9154657226686728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.048804093852466d + "'", double1 == 1.048804093852466d);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        double double1 = org.apache.commons.math.util.FastMath.sin((-53.00704927389939d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3894421397486322d) + "'", double1 == (-0.3894421397486322d));
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        long long2 = org.apache.commons.math.util.FastMath.min(61L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        double double1 = org.apache.commons.math.util.FastMath.log1p(31.59442154605463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.484141155511086d + "'", double1 == 3.484141155511086d);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.529468828731893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.615724430838339d + "'", double1 == 3.615724430838339d);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.041914824263685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0705447217685693d + "'", double1 == 0.0705447217685693d);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        int int2 = org.apache.commons.math.util.FastMath.max((-36), 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9917788534431158d), 1.2688363802786087d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6634478624283493d) + "'", double2 == (-0.6634478624283493d));
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 0, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 4477855L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4477855.0f + "'", float1 == 4477855.0f);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 44.770142683335514d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        long long2 = org.apache.commons.math.util.FastMath.min(61L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.9349901766807889d, 3.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.934990176680789d + "'", double2 == 1.934990176680789d);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.31113287105457993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31113287105457993d + "'", double1 == 0.31113287105457993d);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        int int2 = org.apache.commons.math.util.FastMath.max(1, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5815107164388493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3283158262817936d + "'", double1 == 2.3283158262817936d);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.960213901859517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8529589150738823d + "'", double1 == 0.8529589150738823d);
    }
}

