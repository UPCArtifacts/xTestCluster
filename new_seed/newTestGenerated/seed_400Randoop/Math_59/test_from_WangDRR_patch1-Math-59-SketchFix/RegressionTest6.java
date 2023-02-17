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
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.9182827862121189d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-52.61372804946848d) + "'", double1 == (-52.61372804946848d));
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        double double1 = org.apache.commons.math.util.FastMath.log(0.02490862564965864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.692541123865255d) + "'", double1 == (-3.692541123865255d));
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.3162739259961891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3061339104324154d + "'", double1 == 0.3061339104324154d);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.85314001086485d, (-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.23191437957608327d + "'", double2 == 0.23191437957608327d);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8365164337420496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8365164337420498d + "'", double1 == 0.8365164337420498d);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2280945400058982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8420257396676675d + "'", double1 == 0.8420257396676675d);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8365164337420498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.4787897278629274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0798594392233403d + "'", double1 == 2.0798594392233403d);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.5310724756574393d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5563906530042565d) + "'", double1 == (-0.5563906530042565d));
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.106976355621385d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9983608366524339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7609048895609227d + "'", double1 == 0.7609048895609227d);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        long long1 = org.apache.commons.math.util.FastMath.abs(35L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.644483341943245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.00000000000001d + "'", double1 == 52.00000000000001d);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.3284512750821519d), (-0.2717628242082613d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3284512750821519d) + "'", double2 == (-0.3284512750821519d));
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5896069690147184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5598925417941161d + "'", double1 == 0.5598925417941161d);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9434257847789064d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7367922631517189d) + "'", double1 == (-0.7367922631517189d));
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        long long2 = org.apache.commons.math.util.FastMath.max(39481480091340L, (long) 57);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091340L + "'", long2 == 39481480091340L);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        double double1 = org.apache.commons.math.util.FastMath.tan((-8.711666086263719d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8649540891548834d + "'", double1 == 0.8649540891548834d);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 3.9481478E13f, (-0.2136609872391593d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796326794902d + "'", double2 == 1.570796326794902d);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9103739670886851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        int int2 = org.apache.commons.math.util.FastMath.min(52, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 5, 0.4251053392695819d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4251053392695819d + "'", double2 == 0.4251053392695819d);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        int int2 = org.apache.commons.math.util.FastMath.min(32, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 3.0f, 2.1556157735575975E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0000000000000004d + "'", double2 == 3.0000000000000004d);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        double double1 = org.apache.commons.math.util.FastMath.log(3.3480571885407375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2083802338853868d + "'", double1 == 1.2083802338853868d);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.38873810163383016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37076030339985566d + "'", double1 == 0.37076030339985566d);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        long long2 = org.apache.commons.math.util.FastMath.min(57L, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 11013L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.306922469822426d + "'", double1 == 9.306922469822426d);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6994453290609607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.425305228849993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.15912713462618d + "'", double1 == 4.15912713462618d);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.248291097914389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.21893547406786593d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22068870023590068d + "'", double1 == 0.22068870023590068d);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9665362520985106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.9261711162367936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.2764592626816607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8226212809177448d + "'", double1 == 0.8226212809177448d);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.842859999667966E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.03422749178784308d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.414213562373095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.189207115002721d + "'", double1 == 1.189207115002721d);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        float float2 = org.apache.commons.math.util.FastMath.min(10.0f, (-53.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(533.2485891978159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.092175930340908d + "'", double1 == 23.092175930340908d);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, (long) (-53));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(572.9577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.305661184154149d + "'", double1 == 8.305661184154149d);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.175201187282749d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2L, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.9145768651795099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2661711883825657d + "'", double1 == 1.2661711883825657d);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 57);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.00000000000001d + "'", double1 == 57.00000000000001d);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0484411939287768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0239341746073216d + "'", double1 == 1.0239341746073216d);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.07414666724177091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9972523950133705d + "'", double1 == 0.9972523950133705d);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.170548295626724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0819188026958049d + "'", double1 == 1.0819188026958049d);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.2867484168102035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9998039600078416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 1477896);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1477896L + "'", long1 == 1477896L);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        double double1 = org.apache.commons.math.util.FastMath.asin((-3.0461741036471235E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.046174150757105E-4d) + "'", double1 == (-3.046174150757105E-4d));
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-34.657359027997266d), (-0.08776598447540371d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-34.65735902799726d) + "'", double2 == (-34.65735902799726d));
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3500481793371046d, 77.26503394947866d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3500481793371046d + "'", double2 == 1.3500481793371046d);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 1, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-3.8754705787895336d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9991396955517629d) + "'", double1 == (-0.9991396955517629d));
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.27229885648267216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3129793350683445d + "'", double1 == 0.3129793350683445d);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.339637404328899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.81765898774876d + "'", double1 == 3.81765898774876d);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.23191437957608327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23404525834112114d + "'", double1 == 0.23404525834112114d);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748365E9f + "'", float1 == 2.14748365E9f);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        double double1 = org.apache.commons.math.util.FastMath.ceil(533.2485891978159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 534.0d + "'", double1 == 534.0d);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6499429567608755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7075093757430987d + "'", double1 == 0.7075093757430987d);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.2246467991473532E-16d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8492499565656627d, 0.22766430356286296d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8492499565656626d + "'", double2 == 0.8492499565656626d);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3036.676314193363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 173988.73655062242d + "'", double1 == 173988.73655062242d);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.3089447962273203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3089447962273203d + "'", double1 == 0.3089447962273203d);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        double double1 = org.apache.commons.math.util.FastMath.log1p(13.781934843695916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6934058165391472d + "'", double1 == 2.6934058165391472d);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.6915215721218745d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        double double1 = org.apache.commons.math.util.FastMath.sin(7.951386703658792E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.951386703658792E-16d + "'", double1 == 7.951386703658792E-16d);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        double double1 = org.apache.commons.math.util.FastMath.asin(5506.500045400884d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.22068870023590068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        double double1 = org.apache.commons.math.util.FastMath.ceil(9.287781549441661d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-41.01558075875642d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.2846029059076024E20d + "'", double1 == 5.2846029059076024E20d);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        double double1 = org.apache.commons.math.util.FastMath.sin(89.42706130231652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9941381145925094d + "'", double1 == 0.9941381145925094d);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2228636002804178E-47d, (-0.4944324908505626d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.017066003704239316d), (-0.10757413843619563d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.984259713678174d) + "'", double2 == (-2.984259713678174d));
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-52.61372804946848d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        double double1 = org.apache.commons.math.util.FastMath.signum(105.44019367551631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 149);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 149.0f + "'", float1 == 149.0f);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7245474750742176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6726606802567049d + "'", double1 == 0.6726606802567049d);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.011800076512800236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011730998496174396d + "'", double1 == 0.011730998496174396d);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.9171523356672744d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6003444930876607d) + "'", double1 == (-0.6003444930876607d));
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        double double2 = org.apache.commons.math.util.FastMath.max((-3.694990094719959d), (-0.9408618465702292d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9408618465702292d) + "'", double2 == (-0.9408618465702292d));
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        long long1 = org.apache.commons.math.util.FastMath.round(0.07454121709103567d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5894952792761199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5326596333479113d + "'", double1 == 0.5326596333479113d);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        double double2 = org.apache.commons.math.util.FastMath.max(0.3268153559855746d, 0.9187506059390845d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9187506059390845d + "'", double2 == 0.9187506059390845d);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        long long2 = org.apache.commons.math.util.FastMath.max((-53L), (long) 1477896);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 3.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8587033066171034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0327340166022558d + "'", double1 == 1.0327340166022558d);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.7306786685136297d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8113741275700294d, 0.8422941990863629d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8422941990863629d + "'", double2 == 0.8422941990863629d);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1477896 + "'", int2 == 1477896);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.60978210179491616E17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        double double1 = org.apache.commons.math.util.FastMath.acosh(45.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.499686190671499d + "'", double1 == 4.499686190671499d);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(6.157240911549055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 352.78391767704466d + "'", double1 == 352.78391767704466d);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        double double1 = org.apache.commons.math.util.FastMath.acosh(11.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0889699048446033d + "'", double1 == 3.0889699048446033d);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(199.00499987500626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.106913194423727d + "'", double1 == 14.106913194423727d);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.4253120969346567d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4529592297810597d) + "'", double1 == (-0.4529592297810597d));
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.2422079676186446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6826664571216056d + "'", double1 == 0.6826664571216056d);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        double double1 = org.apache.commons.math.util.FastMath.sin(120.15664711213525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7005202664493964d + "'", double1 == 0.7005202664493964d);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.38714087209326337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4077166057103022d + "'", double1 == 0.4077166057103022d);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.403108691968676E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.403108691970989E-6d + "'", double1 == 2.403108691970989E-6d);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        float float1 = org.apache.commons.math.util.FastMath.abs(9.223372E18f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.223372E18f + "'", float1 == 9.223372E18f);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5707939236862047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999971125d + "'", double1 == 0.9999999999971125d);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.2245999714347802d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.17364817766693033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1719235979111335d + "'", double1 == 0.1719235979111335d);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.4868981666828483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.7813318292761458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.937759236406684d + "'", double1 == 5.937759236406684d);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        double double1 = org.apache.commons.math.util.FastMath.log(3.5835189383285444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2763452613070068d + "'", double1 == 1.2763452613070068d);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        double double1 = org.apache.commons.math.util.FastMath.ulp(8.305661184154149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        double double1 = org.apache.commons.math.util.FastMath.tan((-3.380515006246586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24357481979072695d) + "'", double1 == (-0.24357481979072695d));
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        int int1 = org.apache.commons.math.util.FastMath.abs(149);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 149 + "'", int1 == 149);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1173954566600866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11100049204224008d + "'", double1 == 0.11100049204224008d);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.986771734266245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.7498537011943205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7498537011943207d + "'", double1 == 1.7498537011943207d);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 8.4677176E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.4909189283808535d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0637969690534155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8973512833173551d + "'", double1 == 1.8973512833173551d);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1877020959207132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0590159658258047d + "'", double1 == 1.0590159658258047d);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        int int1 = org.apache.commons.math.util.FastMath.round((-36.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-36) + "'", int1 == (-36));
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9695968919838217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7485270909508315d + "'", double1 == 0.7485270909508315d);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        long long1 = org.apache.commons.math.util.FastMath.abs(149L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 149L + "'", long1 == 149L);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        int int1 = org.apache.commons.math.util.FastMath.round((-2.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6065871573381094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6065871573381095d + "'", double1 == 0.6065871573381095d);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.3043013731747495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 189.3225229221956d + "'", double1 == 189.3225229221956d);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8002101055488575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7401549043526567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7383640997376417d + "'", double1 == 0.7383640997376417d);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-2.978724239478952E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.978724151380226E-4d) + "'", double1 == (-2.978724151380226E-4d));
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.1255150095460777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1310470982913303d + "'", double1 == 1.1310470982913303d);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9983608366524339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9994533134057076d + "'", double1 == 0.9994533134057076d);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.43305085726475895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44671356483539665d + "'", double1 == 0.44671356483539665d);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        int int2 = org.apache.commons.math.util.FastMath.max(35, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7425442460725571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42.54465140168117d + "'", double1 == 42.54465140168117d);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 149, (float) (-53));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.862081708689257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7586713254405011d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3018626251784624d + "'", double1 == 1.3018626251784624d);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8081843818082921d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7156372641383866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8693785117457933d + "'", double1 == 0.8693785117457933d);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5378778166059792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9994582347688005d + "'", double1 == 0.9994582347688005d);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3023186765274488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3023186765274488d + "'", double1 == 1.3023186765274488d);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        long long2 = org.apache.commons.math.util.FastMath.min(39481480091340L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        float float2 = org.apache.commons.math.util.FastMath.max(97.0f, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        double double1 = org.apache.commons.math.util.FastMath.abs(5.770607976886994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.770607976886994d + "'", double1 == 5.770607976886994d);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.9930368739582951d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        long long2 = org.apache.commons.math.util.FastMath.max((-2L), 39481480091340L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091340L + "'", long2 == 39481480091340L);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.986771734266245d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        double double1 = org.apache.commons.math.util.FastMath.abs(1224.999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1224.999999999999d + "'", double1 == 1224.999999999999d);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.1760515822653508d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.176962421128026d) + "'", double1 == (-0.176962421128026d));
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.9916299884373267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1623266059131168d) + "'", double1 == (-1.1623266059131168d));
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9942575694137897d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8383544794438463d) + "'", double1 == (-0.8383544794438463d));
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0590159658258047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7852869460862587d + "'", double1 == 0.7852869460862587d);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.2763452613070068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.08473267747442d + "'", double1 == 1.08473267747442d);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0589027237910784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0192608780318253d + "'", double1 == 1.0192608780318253d);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        double double1 = org.apache.commons.math.util.FastMath.acos(263.856815596594d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6701982005616954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011697165240742895d + "'", double1 == 0.011697165240742895d);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.3327099519782247d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.34555558058171215d) + "'", double1 == (-0.34555558058171215d));
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.7498537011943207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9413588856302918d + "'", double1 == 0.9413588856302918d);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.145976303209723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.145976303209723d + "'", double1 == 1.145976303209723d);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.817884356931778d, 43.42944819032519d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8178843569317782d + "'", double2 == 1.8178843569317782d);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        double double1 = org.apache.commons.math.util.FastMath.log(0.28495825391099355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2554125869476498d) + "'", double1 == (-1.2554125869476498d));
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8623188722876837d, 14.899277193215765d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.11002669683705266d + "'", double2 == 0.11002669683705266d);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 84677176);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 84677176 + "'", int1 == 84677176);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2261911708835171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        double double1 = org.apache.commons.math.util.FastMath.log(1.8189894035458565E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-27.03274004183787d) + "'", double1 == (-27.03274004183787d));
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        float float1 = org.apache.commons.math.util.FastMath.abs(149.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 149.0f + "'", float1 == 149.0f);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        double double2 = org.apache.commons.math.util.FastMath.min(1.7498537011943205d, 0.7955086123527585d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7955086123527585d + "'", double2 == 0.7955086123527585d);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.0026974884567037482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0026974949994306666d + "'", double1 == 0.0026974949994306666d);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9418502147163486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7360711750351105d + "'", double1 == 0.7360711750351105d);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9764996816772386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.023780854648827218d) + "'", double1 == (-0.023780854648827218d));
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9735605461531053d, 1.4073861552074949d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4073861552074949d + "'", double2 == 1.4073861552074949d);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.2717628242082613d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9632991984933736d + "'", double1 == 0.9632991984933736d);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.7245474750742176d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9171523356672744d) + "'", double1 == (-0.9171523356672744d));
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7485270909508315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5013507798060323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        int int1 = org.apache.commons.math.util.FastMath.abs((-36));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        long long2 = org.apache.commons.math.util.FastMath.max(10L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.586013445029888E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25d + "'", double1 == 0.25d);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        double double2 = org.apache.commons.math.util.FastMath.min(0.40589190094865796d, (-0.3118395312526729d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3118395312526729d) + "'", double2 == (-0.3118395312526729d));
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.415289655969459d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4419864533963391d + "'", double1 == 0.4419864533963391d);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 84677176);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        int int2 = org.apache.commons.math.util.FastMath.max(149, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.276858964458209d, 2.1048285727011695d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1134536045423387d + "'", double2 == 1.1134536045423387d);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        double double1 = org.apache.commons.math.util.FastMath.asin(10.049875621120886d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.1720269046268675E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.172026904626868E15d + "'", double1 == 3.172026904626868E15d);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9999959128521664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.881370696966641d + "'", double1 == 0.881370696966641d);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        double double1 = org.apache.commons.math.util.FastMath.ceil(416127.66138192907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 416128.0d + "'", double1 == 416128.0d);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.7306786685136297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9872460216486223d + "'", double1 == 0.9872460216486223d);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5d + "'", double1 == 0.5d);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7581226324091722d, 0.43442052080657173d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0504502603385693d + "'", double2 == 1.0504502603385693d);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9993832155237184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7850896760339817d + "'", double1 == 0.7850896760339817d);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0986122886681098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04084445256892067d + "'", double1 == 0.04084445256892067d);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        double double1 = org.apache.commons.math.util.FastMath.signum(32.48537739999093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.8554182836643193d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.693889518756616d) + "'", double1 == (-0.693889518756616d));
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 5L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        double double2 = org.apache.commons.math.util.FastMath.atan2(52.00000000000001d, 0.8693235746902678d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5540801229283607d + "'", double2 == 1.5540801229283607d);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        double double2 = org.apache.commons.math.util.FastMath.min(1262023.527631695d, 0.9904127082563061d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9904127082563061d + "'", double2 == 0.9904127082563061d);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.749996267789066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.047996489290474884d + "'", double1 == 0.047996489290474884d);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.22766430356286296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2556637328313827d + "'", double1 == 1.2556637328313827d);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.1415926535897927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.011800076512800236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0595018713561494E-4d + "'", double1 == 2.0595018713561494E-4d);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.217652850343311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2176528503433113d + "'", double1 == 1.2176528503433113d);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.2204460492503128E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2204460492503128E-16d + "'", double1 == 2.2204460492503128E-16d);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.1933463270565558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0187497017783491d + "'", double1 == 1.0187497017783491d);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.4909189283808535d), 120.15664711213525d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4909189283808535d) + "'", double2 == (-0.4909189283808535d));
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0516141982650264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49617020718960864d + "'", double1 == 0.49617020718960864d);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        int int2 = org.apache.commons.math.util.FastMath.min(3, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 1, (long) 57);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.4454545364061836E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0004446442786143d + "'", double1 == 1.0004446442786143d);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3106472496723418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.719463918234335d + "'", double1 == 1.719463918234335d);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5430806348152388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2326303196791204d + "'", double1 == 2.2326303196791204d);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.9999999999999999d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.4577979139729036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4577979139729036d + "'", double1 == 1.4577979139729036d);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 53, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.7453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6296609567811063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48837199120847863d + "'", double1 == 0.48837199120847863d);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6994453290609607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6437933524252503d + "'", double1 == 0.6437933524252503d);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        float float2 = org.apache.commons.math.util.FastMath.max((-2.0f), (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6994453290609607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8876694185588774d + "'", double1 == 0.8876694185588774d);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.921688867296064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.1662915285707833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9740733519705822d + "'", double1 == 0.9740733519705822d);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6694963894787934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7841343015464058d + "'", double1 == 0.7841343015464058d);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        double double1 = org.apache.commons.math.util.FastMath.rint(9.306922469822426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.821637045374455E-17d) + "'", double1 == (-4.821637045374455E-17d));
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.20675080015374017d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9787030787287175d + "'", double1 == 0.9787030787287175d);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9964228836762624d + "'", double1 == 0.9964228836762624d);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        double double2 = org.apache.commons.math.util.FastMath.atan2(9.989078815390096E-4d, 9.307013259236443d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0732851129357383E-4d + "'", double2 == 1.0732851129357383E-4d);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 149L, 4.303190128915375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 148.99999999999997d + "'", double2 == 148.99999999999997d);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.40589190094865796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0835112623546757d + "'", double1 == 1.0835112623546757d);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        int int2 = org.apache.commons.math.util.FastMath.min(10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.1662915285707833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.725864345518537d + "'", double1 == 7.725864345518537d);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.85314001086485d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4311581967195641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4179232837440048d + "'", double1 == 0.4179232837440048d);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        long long1 = org.apache.commons.math.util.FastMath.round(0.635381542950125d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7813863964118538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7813863964118538d + "'", double1 == 0.7813863964118538d);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.4752832273511767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        double double1 = org.apache.commons.math.util.FastMath.log10(13.781934843695918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1393101923868099d + "'", double1 == 1.1393101923868099d);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.2083157409463713d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8119506301746697d + "'", double1 == 0.8119506301746697d);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3953649341158527d + "'", double1 == 1.3953649341158527d);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.0133109241786307d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, (-0.9182827862121189d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9182827862121189d) + "'", double2 == (-0.9182827862121189d));
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        double double2 = org.apache.commons.math.util.FastMath.atan2(77.0d, 0.37218765288965655d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5659627585563982d + "'", double2 == 1.5659627585563982d);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        int int2 = org.apache.commons.math.util.FastMath.max((-2), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9550315978940166d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.21893547406786593d, (double) (-36));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.135511187617348d + "'", double2 == 3.135511187617348d);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        long long2 = org.apache.commons.math.util.FastMath.max((-2L), (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.3745669993918974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3745669993918976d + "'", double1 == 1.3745669993918976d);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.7219067166708869d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.012599649098168814d) + "'", double1 == (-0.012599649098168814d));
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.6842868307608122d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7748700530452005d + "'", double1 == 0.7748700530452005d);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5472906394139022E7d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 15472906L + "'", long1 == 15472906L);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.2130532941206642d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.675024856842625d) + "'", double1 == (-2.675024856842625d));
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.6904492636009615d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.31712849292107215d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8934964811466461d + "'", double1 == 1.8934964811466461d);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7805951733159242d, 0.1d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7805951733159241d + "'", double2 == 0.7805951733159241d);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7944146264030464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7944146264030465d + "'", double1 == 0.7944146264030465d);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.6094379124341003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 2.15561577E15f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.33357135131469d + "'", double1 == 15.33357135131469d);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        double double2 = org.apache.commons.math.util.FastMath.min(0.677511790861663d, 1.433704240591099d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.677511790861663d + "'", double2 == 0.677511790861663d);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8125492953065081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2536458786393914d + "'", double1 == 1.2536458786393914d);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.8108072797718955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6203702025697551d) + "'", double1 == (-0.6203702025697551d));
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4678297255314154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2851156853967676d + "'", double1 == 2.2851156853967676d);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        double double1 = org.apache.commons.math.util.FastMath.rint(7.151039979174052E54d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.151039979174052E54d + "'", double1 == 7.151039979174052E54d);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963263292353d + "'", double1 == 1.5707963263292353d);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7944146264030465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8806497224008819d + "'", double1 == 0.8806497224008819d);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-3.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.9999999999999996d) + "'", double1 == (-2.9999999999999996d));
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0000000000000018d, 57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.017451520651465855d + "'", double2 == 0.017451520651465855d);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.49617020718960864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.42845879209619d + "'", double1 == 28.42845879209619d);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.11100049204224008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10526095353969918d + "'", double1 == 0.10526095353969918d);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.37218765288965655d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.677511790861663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16908314228145543d) + "'", double1 == (-0.16908314228145543d));
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.4430227241169226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9034600343951873d + "'", double1 == 0.9034600343951873d);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0664977916380836d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5540801229283607d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5574077246549023d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(18.72514057803899d, 173988.73655062242d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.725140578038992d + "'", double2 == 18.725140578038992d);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.40992093582609207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42149796567476777d + "'", double1 == 0.42149796567476777d);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.857530727509168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 57);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 1477896);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9393516398044407d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1173954566600866d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7966043547446022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-36L), 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.3833162101372999d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 84677176);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.4677176E7f + "'", float1 == 8.4677176E7f);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.199781099457594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.692229922941576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9987591185419123d + "'", double1 == 0.9987591185419123d);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.4488357507586564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8954624216489684d + "'", double1 == 0.8954624216489684d);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        float float2 = org.apache.commons.math.util.FastMath.max(2.15561577E15f, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.15561577E15f + "'", float2 == 2.15561577E15f);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 45L, (float) 11013);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 45.0f + "'", float2 == 45.0f);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        double double2 = org.apache.commons.math.util.FastMath.min(7.4764165040274095d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.78115991081385d + "'", double1 == 44.78115991081385d);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9087403372292328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-36L), 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5067985556900776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9684798222642294d + "'", double1 == 0.9684798222642294d);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.4149733479708179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.514330380176722d + "'", double1 == 1.514330380176722d);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8693785117457933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1399766769213089d) + "'", double1 == (-0.1399766769213089d));
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        float float2 = org.apache.commons.math.util.FastMath.max(2.14748365E9f, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9107602588845184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7214969542037845d + "'", double1 == 0.7214969542037845d);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        double double1 = org.apache.commons.math.util.FastMath.sin(1764.9013237338472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6239190567167857d) + "'", double1 == (-0.6239190567167857d));
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1217719640679913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        double double2 = org.apache.commons.math.util.FastMath.max(42.12656474461543d, 2.749996267789066d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 42.12656474461543d + "'", double2 == 42.12656474461543d);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (-2));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.6268604078470186d) + "'", double1 == (-3.6268604078470186d));
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7841343015464058d, 4.276473161941219d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.784134301546406d + "'", double2 == 0.784134301546406d);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.3162739259961891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5623823663631259d + "'", double1 == 0.5623823663631259d);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.16299078079570548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16371340869567735d) + "'", double1 == (-0.16371340869567735d));
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2147483647L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        double double2 = org.apache.commons.math.util.FastMath.atan2(7.603575026530223d, 9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6500970221088582d + "'", double2 == 0.6500970221088582d);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 149L, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.4541594839761731d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.5091729483939074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707939236862047d + "'", double1 == 1.5707939236862047d);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5896069690147183d, (-1.150849338916875d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.668135051225122d + "'", double2 == 2.668135051225122d);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.4657022738769552d, 0.7615560214388488d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.091604239627809d + "'", double2 == 1.091604239627809d);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9999092042625951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.4161468365471424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        double double1 = org.apache.commons.math.util.FastMath.log1p(45.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.828641396489095d + "'", double1 == 3.828641396489095d);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        long long1 = org.apache.commons.math.util.FastMath.round(0.02490862564965864d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.1072845368400976d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.2228636002804178E-47d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.000000000001819d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936466082d + "'", double1 == 1.1752011936466082d);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        int int2 = org.apache.commons.math.util.FastMath.min(35, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.432442232354526d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6218443352412333d + "'", double1 == 1.6218443352412333d);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        double double1 = org.apache.commons.math.util.FastMath.acos(18.013888888888896d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.07454121709103567d, 1.724275869600789d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011368429140754338d + "'", double2 == 0.011368429140754338d);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.27767826196252E83d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.725101101257968E41d + "'", double1 == 5.725101101257968E41d);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.008838092819754681d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.963822509477476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.22296199276716d + "'", double1 == 55.22296199276716d);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        long long1 = org.apache.commons.math.util.FastMath.abs(10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        double double1 = org.apache.commons.math.util.FastMath.ceil(148.80597572185025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 149.0d + "'", double1 == 149.0d);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.9848929415691016d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        long long1 = org.apache.commons.math.util.FastMath.round(1.3673722261798014d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6500970221088582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18702182332316017d) + "'", double1 == (-0.18702182332316017d));
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.1310470982913303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5065192423637161d + "'", double1 == 0.5065192423637161d);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        long long2 = org.apache.commons.math.util.FastMath.max((long) ' ', (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        double double1 = org.apache.commons.math.util.FastMath.acosh(77.26503394947866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.040346812154621d + "'", double1 == 5.040346812154621d);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0009877980461308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735870195432d + "'", double1 == 0.8813735870195432d);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (short) 1, 1.248867972642223d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1046225788468806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.018085164638296d + "'", double1 == 3.018085164638296d);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9999468579779085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5521802813382803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43966057567100886d + "'", double1 == 0.43966057567100886d);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        long long1 = org.apache.commons.math.util.FastMath.round(0.16690925682449867d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        long long1 = org.apache.commons.math.util.FastMath.round(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.761594155955765d + "'", double1 == 0.761594155955765d);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 171.78552109133562d + "'", double1 == 171.78552109133562d);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4900780917150722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.437442032932441d + "'", double1 == 4.437442032932441d);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.24619002710729038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        double double2 = org.apache.commons.math.util.FastMath.min(1.410122136122596d, 1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7763568394002505E-15d + "'", double2 == 1.7763568394002505E-15d);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.00949495958537668d) + "'", double1 == (-0.00949495958537668d));
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9157372585176266d, 1.0000000000035623d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9157372585173394d + "'", double2 == 0.9157372585173394d);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.2130532941206642d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8375930412496614d) + "'", double1 == (-0.8375930412496614d));
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) -1, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        double double2 = org.apache.commons.math.util.FastMath.atan2(127.0d, 0.04772374476421262d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5704205492947558d + "'", double2 == 1.5704205492947558d);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 3.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6689830892710052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.693889518756616d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4996289686340808d + "'", double1 == 0.4996289686340808d);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2147483647);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748365E9f + "'", float1 == 2.14748365E9f);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        double double1 = org.apache.commons.math.util.FastMath.log1p(9.989082137816156E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.984096369658629E-4d + "'", double1 == 9.984096369658629E-4d);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 39481480091340L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.9481478E13f + "'", float1 == 3.9481478E13f);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 0, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.11831214619987152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11803632173468953d + "'", double1 == 0.11803632173468953d);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        int int2 = org.apache.commons.math.util.FastMath.min(53, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.170548295626724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3896467821622059d + "'", double1 == 0.3896467821622059d);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.313261687518223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3132616875182233d + "'", double1 == 1.3132616875182233d);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.7005202664493964d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.43966057567100886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0484411939287768d, 1.1134536045423387d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1134536045423387d + "'", double2 == 1.1134536045423387d);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.6997678580926362d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2031992972018404d) + "'", double1 == (-1.2031992972018404d));
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2378644027129617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        int int2 = org.apache.commons.math.util.FastMath.min(10, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.60978210179491616E17d, 2.749996267789066d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6433380240448354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.871945894290764d + "'", double1 == 0.871945894290764d);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.047996489290474884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36341525809683245d + "'", double1 == 0.36341525809683245d);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5716315636979222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.4881954908148405d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.38626711782658774d) + "'", double1 == (-0.38626711782658774d));
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(7.049772952917979E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0392223672767975E14d + "'", double1 == 4.0392223672767975E14d);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1752011936466082d, (double) 1477896);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.951853132063153E-7d + "'", double2 == 7.951853132063153E-7d);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-3.04617424497707E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.316577016430221E-6d) + "'", double1 == (-5.316577016430221E-6d));
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6994453290609607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5303019207992773d + "'", double1 == 0.5303019207992773d);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        long long1 = org.apache.commons.math.util.FastMath.round(9.044524487391685E157d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        long long1 = org.apache.commons.math.util.FastMath.round(0.003576212944920802d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(14.106913194423727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7559170909943855d + "'", double1 == 3.7559170909943855d);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.8554182836643192d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8554182836643192d) + "'", double2 == (-0.8554182836643192d));
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2), (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-3.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.017874927409903d) + "'", double1 == (-10.017874927409903d));
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        double double1 = org.apache.commons.math.util.FastMath.abs(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        double double1 = org.apache.commons.math.util.FastMath.ceil(13.781934843695916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.0d + "'", double1 == 14.0d);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        double double1 = org.apache.commons.math.util.FastMath.cosh(6.157240911549055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 236.0628816681138d + "'", double1 == 236.0628816681138d);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        double double2 = org.apache.commons.math.util.FastMath.min(2.768115672379123E13d, 3.5011732945663934E66d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.768115672379123E13d + "'", double2 == 2.768115672379123E13d);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        double double1 = org.apache.commons.math.util.FastMath.ceil(7.896296018267969E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018268E13d + "'", double1 == 7.896296018268E13d);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8686198410610922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8686198410610924d + "'", double1 == 0.8686198410610924d);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.635381542950125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5617466952995023d + "'", double1 == 0.5617466952995023d);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        long long2 = org.apache.commons.math.util.FastMath.max(52L, (long) (-53));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        double double1 = org.apache.commons.math.util.FastMath.abs(55.367870644634905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.367870644634905d + "'", double1 == 55.367870644634905d);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.07752552270710597d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07752552270710596d) + "'", double1 == (-0.07752552270710596d));
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(148.80597572185025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.19860548267097d + "'", double1 == 12.19860548267097d);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.5574077246549023d), 0.057233205734539244d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.057233205734539244d + "'", double2 == 0.057233205734539244d);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7944146264030464d, 0.983031862437426d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.797523050064412d + "'", double2 == 0.797523050064412d);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, (-0.5520864868395452d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 36.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.58351893845611d + "'", double1 == 3.58351893845611d);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.1016572581144659d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09666088923348715d) + "'", double1 == (-0.09666088923348715d));
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9999468579779085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.292734699501686d + "'", double1 == 57.292734699501686d);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        int int2 = org.apache.commons.math.util.FastMath.min(35, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.50632862831693E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.18390799770244d + "'", double1 == 34.18390799770244d);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0000002279510873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29579257371756d + "'", double1 == 57.29579257371756d);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.415289655969459d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 32, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        double double1 = org.apache.commons.math.util.FastMath.rint(534.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 534.0d + "'", double1 == 534.0d);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.22068870023590068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9103739670886851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9691848350703998d + "'", double1 == 0.9691848350703998d);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 1477896);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1477896 + "'", int1 == 1477896);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.736121492758925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9997183971458905d) + "'", double1 == (-0.9997183971458905d));
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.3896467821622059d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3798616970349825d + "'", double1 == 0.3798616970349825d);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.87735959904093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 131.28356459696715d + "'", double1 == 131.28356459696715d);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.691649480399158E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7955086123527585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.301297204502775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.043629138314787d + "'", double1 == 5.043629138314787d);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.5574077246549023d), 1.170548295626724d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5574077246549023d) + "'", double2 == (-1.5574077246549023d));
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0691962561940713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9294662936171667d + "'", double1 == 0.9294662936171667d);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.01706683222077747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01706848947107439d + "'", double1 == 0.01706848947107439d);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.026525695313479d, 0.003761435487319938d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5700480097637672d + "'", double2 == 1.5700480097637672d);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(28.000000000000004d, 1.5708649036675921d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 28.0d + "'", double2 == 28.0d);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.09267307410348408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.6691802474911265E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6691802474974652E-6d + "'", double1 == 2.6691802474974652E-6d);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) (-36));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 2147483647, 1.5364951284461146d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.180041580820244E14d + "'", double2 == 2.180041580820244E14d);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        double double1 = org.apache.commons.math.util.FastMath.tanh(90.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 100, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7485270909508315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7249582745326694d + "'", double1 == 0.7249582745326694d);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5067985556900776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1173954566600866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8989626366660383d + "'", double1 == 0.8989626366660383d);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.39709459624648236d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        double double1 = org.apache.commons.math.util.FastMath.sin(45.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8509035245341184d + "'", double1 == 0.8509035245341184d);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        double double1 = org.apache.commons.math.util.FastMath.cosh(171.78552109133562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0159227463586952E74d + "'", double1 == 2.0159227463586952E74d);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.44671356483539665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44671356483539665d + "'", double1 == 0.44671356483539665d);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1586013452313419L, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        long long1 = org.apache.commons.math.util.FastMath.round(2.1072845368400976d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        double double1 = org.apache.commons.math.util.FastMath.cos(9.984096369658629E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999995015891399d + "'", double1 == 0.9999995015891399d);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-27.03274004183787d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.748779069440004E11d + "'", double1 == 2.748779069440004E11d);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.6667327043309772E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.862645149230957E-9d + "'", double1 == 1.862645149230957E-9d);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 52L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9999468579779085d, (-0.9117339147869651d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9117339147869651d) + "'", double2 == (-0.9117339147869651d));
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, 11013L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.6506325163944369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.026102280813798d + "'", double1 == 1.026102280813798d);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.5574077246549018d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        double double2 = org.apache.commons.math.util.FastMath.max(3.7621956910836314d, 0.9972523950133705d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7621956910836314d + "'", double2 == 3.7621956910836314d);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.214684851089406E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.375234893767539d) + "'", double1 == (-7.375234893767539d));
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.1556157735575975E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.0d + "'", double1 == 36.0d);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5716315636979223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7711544466071394d + "'", double1 == 1.7711544466071394d);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 0, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5447358754943394d, 1.8934964811466461d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3165695056594996d + "'", double2 == 0.3165695056594996d);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.08776598447540371d), 1.5707956501570803d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707956501570803d + "'", double2 == 1.5707956501570803d);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001523125762564d + "'", double1 == 1.0001523125762564d);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.007007049837584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5343928609612147d + "'", double1 == 0.5343928609612147d);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (-53));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.206879716514544E22d) + "'", double1 == (-5.206879716514544E22d));
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        double double1 = org.apache.commons.math.util.FastMath.sin(5506.500045400884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6532555690014658d + "'", double1 == 0.6532555690014658d);
    }
}

