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
        int int2 = org.apache.commons.math.util.FastMath.min(36, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1531436238758581d, (-34.768015146316124d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-34.768015146316124d) + "'", double2 == (-34.768015146316124d));
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.3441486949905643d, 1.0000000002328306d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.34414869499056433d + "'", double2 == 0.34414869499056433d);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.6169827255860205d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        double double1 = org.apache.commons.math.util.FastMath.atan(28.45884779991685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.53567232102789d + "'", double1 == 1.53567232102789d);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1477896, 72L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 72L + "'", long2 == 72L);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.2680279460309557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2374628952287586d + "'", double1 == 0.2374628952287586d);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3L, (float) (-53));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        double double1 = org.apache.commons.math.util.FastMath.exp(3036.676314193363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.41671114415975286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        double double1 = org.apache.commons.math.util.FastMath.sinh(7721.570345472033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7679249258932203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7074254741780729d + "'", double1 == 0.7074254741780729d);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.506328628316939E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6982469888270821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8668856945829329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6242716385733329d + "'", double1 == 0.6242716385733329d);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.1215871267631296E-5d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.703530868239122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.5063656411097343d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.042291128921215566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2056480705506754d + "'", double1 == 0.2056480705506754d);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 3, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7.896296018267969E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.606983036005677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8466921199172307d + "'", double1 == 0.8466921199172307d);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.27922113659304d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        float float2 = org.apache.commons.math.util.FastMath.max(57.0f, (float) (-36));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6411915549411445d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(8.208435730874367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.208435730874369d + "'", double1 == 8.208435730874369d);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46340.95001184158d + "'", double1 == 46340.95001184158d);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        double double1 = org.apache.commons.math.util.FastMath.cos((-34.768015146316124d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9779274073329283d) + "'", double1 == (-0.9779274073329283d));
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3565686652647782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1647182772090332d + "'", double1 == 1.1647182772090332d);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.552489187522351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3106472496723418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        float float1 = org.apache.commons.math.util.FastMath.abs(1477896.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1477896.0f + "'", float1 == 1477896.0f);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-3));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.1048285727011695d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1437757162199678d, (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.143775716219968d + "'", double2 == 1.143775716219968d);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7010979104724594d, 0.8261522787674126d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7010979104724594d + "'", double2 == 0.7010979104724594d);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-9.289321970063883E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.289321943344232E-5d) + "'", double1 == (-9.289321943344232E-5d));
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        double double1 = org.apache.commons.math.util.FastMath.expm1(7.77037274892726E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.99998657637409d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.71824533950557d + "'", double1 == 2.71824533950557d);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.644483341943245d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5686300059875781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6048394375639378d + "'", double1 == 0.6048394375639378d);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.6347792607040605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.6759364361843174d), 9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6759364361843173d) + "'", double2 == (-0.6759364361843173d));
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.2917098371502295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-16.7137425111567d) + "'", double1 == (-16.7137425111567d));
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.9258949934053917d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9258949934053917d + "'", double1 == 0.9258949934053917d);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.32179921168174863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.251952459411674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24929524866556063d + "'", double1 == 0.24929524866556063d);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8632695193447204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.46170004073965d + "'", double1 == 49.46170004073965d);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.263814502040431d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        double double1 = org.apache.commons.math.util.FastMath.ulp(156.1918541558971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.99627207622075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 1477896);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1477896L + "'", long1 == 1477896L);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        double double1 = org.apache.commons.math.util.FastMath.ulp(6.326458826000224E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920928955078125E-7d + "'", double1 == 1.1920928955078125E-7d);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6061093801777692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.72750940747645d + "'", double1 == 34.72750940747645d);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        double double1 = org.apache.commons.math.util.FastMath.sin(5.088887490341629E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.088887490341629E-14d + "'", double1 == 5.088887490341629E-14d);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.6069417913449664d, (-632.8931087238835d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1374735898621697d + "'", double2 == 3.1374735898621697d);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0602412165727728d, 5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.19861363322695616d + "'", double2 == 0.19861363322695616d);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182818284590458d + "'", double1 == 1.7182818284590458d);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        double double1 = org.apache.commons.math.util.FastMath.signum((-4.965964575870387E-6d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 11013L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 11013.0f + "'", float1 == 11013.0f);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.2746361876728606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24266079489065126d + "'", double1 == 0.24266079489065126d);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.01568485717214877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01580851019182626d + "'", double1 == 0.01580851019182626d);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        double double2 = org.apache.commons.math.util.FastMath.max(2.7260621198151926d, 0.2835736696417744d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7260621198151926d + "'", double2 == 2.7260621198151926d);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.17119879283175632d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5166364975962761d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.176259623626705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.866213764556301d + "'", double1 == 0.866213764556301d);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5716776679087391d, 1.0003963416279558d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0003963416279558d + "'", double2 == 1.0003963416279558d);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.24356506942966236d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 32);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.2960570985715265d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.7809568482823821d), (double) (-3L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7809568482823821d) + "'", double2 == (-0.7809568482823821d));
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.6995216443485196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6040640580642322d) + "'", double1 == (-0.6040640580642322d));
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.010374295917472897d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5944033714909972d) + "'", double1 == (-0.5944033714909972d));
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.22766430356286296d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.428182669496151d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.45642327729008136d) + "'", double1 == (-0.45642327729008136d));
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.37754243147639266d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        double double1 = org.apache.commons.math.util.FastMath.sin(5.009340961621595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9562328011312552d) + "'", double1 == (-0.9562328011312552d));
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        double double1 = org.apache.commons.math.util.FastMath.tan((-59.10786673843406d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.658594985530628d + "'", double1 == 0.658594985530628d);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        double double1 = org.apache.commons.math.util.FastMath.asin(271.6563638137265d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-53));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53.0f + "'", float1 == 53.0f);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        double double1 = org.apache.commons.math.util.FastMath.sin(37.40464270515639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.29023187920579935d) + "'", double1 == (-0.29023187920579935d));
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0000000000000009d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.276858964458209d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9996144206527183d + "'", double1 == 0.9996144206527183d);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        int int2 = org.apache.commons.math.util.FastMath.min(32, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9016684086532855d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40589190094865796d + "'", double1 == 0.40589190094865796d);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        double double1 = org.apache.commons.math.util.FastMath.log(3.948148009133999E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.306852819440046d + "'", double1 == 31.306852819440046d);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.08558186793850525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.0133109241786307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.1103453443603275d) + "'", double1 == (-2.1103453443603275d));
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.16243485560816776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.013221573872519d + "'", double1 == 1.013221573872519d);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        int int2 = org.apache.commons.math.util.FastMath.max(32, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7071067811865475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.34657359027997275d) + "'", double1 == (-0.34657359027997275d));
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.3023186765274488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        int int2 = org.apache.commons.math.util.FastMath.max(11013, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.876278270531895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8762782705318957d + "'", double1 == 2.8762782705318957d);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.3686469200204923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        double double2 = org.apache.commons.math.util.FastMath.atan2(10.049875621120885d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        double double1 = org.apache.commons.math.util.FastMath.expm1(5.431733408790851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 227.54506429048948d + "'", double1 == 227.54506429048948d);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(192.9948452238572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.778945114895067d + "'", double1 == 5.778945114895067d);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2092204141489054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8364454861264231d + "'", double1 == 0.8364454861264231d);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.0476958419065936d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0476958419065934d) + "'", double1 == (-1.0476958419065934d));
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2460098192572937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 71.39110387530145d + "'", double1 == 71.39110387530145d);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.6842868307608122d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        double double1 = org.apache.commons.math.util.FastMath.cos(68.40322401739336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7571779662589213d + "'", double1 == 0.7571779662589213d);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.4521234009544473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9852791038997014d + "'", double1 == 0.9852791038997014d);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9428090415820634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7559694104239076d + "'", double1 == 0.7559694104239076d);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(11013.232874695796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.248715407683253d + "'", double1 == 22.248715407683253d);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5414729998706594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5683229532269037d + "'", double1 == 0.5683229532269037d);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.2350469597522027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 128.05875780734718d + "'", double1 == 128.05875780734718d);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        float float2 = org.apache.commons.math.util.FastMath.min(1477896.0f, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-53L), (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.01282218098091439d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.44855772084253d + "'", double1 == 2.44855772084253d);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        double double1 = org.apache.commons.math.util.FastMath.floor(5.388267471840758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.2792211365930397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13850408558812574d + "'", double1 == 0.13850408558812574d);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.002160686891321d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8426364437777444d + "'", double1 == 0.8426364437777444d);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        double double1 = org.apache.commons.math.util.FastMath.abs(13.596393407513998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.596393407513998d + "'", double1 == 13.596393407513998d);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9589242746631385d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 39481480091340L, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.6699175736806615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6699175736806615d + "'", double1 == 1.6699175736806615d);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5422186167449905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.24186094903777d + "'", double1 == 1.24186094903777d);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 5.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        double double1 = org.apache.commons.math.util.FastMath.abs(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103323d + "'", double1 == 11013.232920103323d);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.3317302351290102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33784800591283637d + "'", double1 == 0.33784800591283637d);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.18106042748149917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1820513306501462d + "'", double1 == 0.1820513306501462d);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.2040758220049488d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9335082459300553d) + "'", double1 == (-0.9335082459300553d));
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5.778945114895067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999808795594539d + "'", double1 == 0.9999808795594539d);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.010320668518630319d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2177221477573357d) + "'", double1 == (-0.2177221477573357d));
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.3283064365386963E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.15195825143981E-4d + "'", double1 == 6.15195825143981E-4d);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.9936026854386766d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03490658503988659d) + "'", double1 == (-0.03490658503988659d));
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.148283155648077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        double double1 = org.apache.commons.math.util.FastMath.tan(115.35421880301885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2213312276126236d) + "'", double1 == (-1.2213312276126236d));
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        int int2 = org.apache.commons.math.util.FastMath.min((-36), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        double double1 = org.apache.commons.math.util.FastMath.tanh(231.58466047909457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        double double1 = org.apache.commons.math.util.FastMath.abs(22.180709777452588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.180709777452588d + "'", double1 == 22.180709777452588d);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.041914822473389d, 7.2638973976934574E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.04191482247339d + "'", double2 == 4.04191482247339d);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.02012615298501282d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        double double1 = org.apache.commons.math.util.FastMath.log(3.2792211365930397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1876059358425726d + "'", double1 == 1.1876059358425726d);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9226350743220142d), 82.80264201054017d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        long long1 = org.apache.commons.math.util.FastMath.abs((-53L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 53L + "'", long1 == 53L);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5860134523134185E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.586013452313419E15d + "'", double1 == 1.586013452313419E15d);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7413633920040708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2992643663336907d) + "'", double1 == (-0.2992643663336907d));
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3383347192042695E42d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        double double2 = org.apache.commons.math.util.FastMath.min(1.9997894669934126d, (-1.219022125506721d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.219022125506721d) + "'", double2 == (-1.219022125506721d));
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.010374295917472897d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010374668114874872d) + "'", double1 == (-0.010374668114874872d));
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        double double1 = org.apache.commons.math.util.FastMath.tanh(6.6174449004242214E-24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.6174449004242214E-24d + "'", double1 == 6.6174449004242214E-24d);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        double double1 = org.apache.commons.math.util.FastMath.log(9.138523014339807E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.997841595373406d) + "'", double1 == (-6.997841595373406d));
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5728275353520677d, 0.7944146264030464d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7944146264030464d + "'", double2 == 0.7944146264030464d);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7615941559557655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7237368419565783d + "'", double1 == 0.7237368419565783d);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.9936026854386766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8364454861264231d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        int int1 = org.apache.commons.math.util.FastMath.abs(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2147483647, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.506976913724955d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.5942992187596847d), (-1.9323667197459253d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.9323667197459253d) + "'", double2 == (-1.9323667197459253d));
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.358364510279281d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        int int2 = org.apache.commons.math.util.FastMath.max(10, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5900247258946039d, 1936674.200214744d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.210078523883574E-7d + "'", double2 == 8.210078523883574E-7d);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.28111738892954613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28495825391099355d + "'", double1 == 0.28495825391099355d);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 72L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 72.00000000000001d + "'", double1 == 72.00000000000001d);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.14287905018325442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1423973302809369d + "'", double1 == 0.1423973302809369d);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.45642327729008136d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4573750283097829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4415944677216688d + "'", double1 == 0.4415944677216688d);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 36, 1477896.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.320630207612775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8222596433035483d + "'", double1 == 1.8222596433035483d);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.253350360695029d, 0.9591348389208239d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9176021804981276d + "'", double2 == 0.9176021804981276d);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3348400172962347d + "'", double1 == 1.3348400172962347d);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.010477800994405333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9797298543946944d) + "'", double1 == (-1.9797298543946944d));
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.4001817886098734d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2648389735541739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8523926839062378d + "'", double1 == 0.8523926839062378d);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-35.99999999999999d), 0.011800076512800236d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5704685469035022d) + "'", double2 == (-1.5704685469035022d));
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.32220799131551875d), 2.1556157735575975E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.32220799131551875d) + "'", double2 == (-0.32220799131551875d));
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        int int2 = org.apache.commons.math.util.FastMath.max(10, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.2824704504712367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004930039400314648d + "'", double1 == 0.004930039400314648d);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.208718528794109E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        double double1 = org.apache.commons.math.util.FastMath.ulp(11.548739357257746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.658594985530628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011494650934633872d + "'", double1 == 0.011494650934633872d);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.2056480705506754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20564807055067544d + "'", double1 == 0.20564807055067544d);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49536728921867335d + "'", double1 == 0.49536728921867335d);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.1711987928317563d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0146903407800787d + "'", double1 == 1.0146903407800787d);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.6567305011816795d), 0.28111738892954613d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6567305011816795d) + "'", double2 == (-1.6567305011816795d));
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5949858734594968E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.594985873324243E-5d + "'", double1 == 1.594985873324243E-5d);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        int int2 = org.apache.commons.math.util.FastMath.min(2, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.4944324908505626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6099169425432279d + "'", double1 == 0.6099169425432279d);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.01696287761582862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016963691108386116d + "'", double1 == 0.016963691108386116d);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8197546798628417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1987501543833528d) + "'", double1 == (-0.1987501543833528d));
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.7265659438059517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7217112730781983d + "'", double1 == 2.7217112730781983d);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0000000000000009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000004d + "'", double1 == 1.0000000000000004d);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        double double1 = org.apache.commons.math.util.FastMath.abs(7.896296018267969E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018267969E13d + "'", double1 == 7.896296018267969E13d);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        long long2 = org.apache.commons.math.util.FastMath.max(36L, (long) (-53));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        double double1 = org.apache.commons.math.util.FastMath.signum(7.930067261567152E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9659700754028168d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.3805150062465867d) + "'", double1 == (-3.3805150062465867d));
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5915576703333734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9997844910483683d + "'", double1 == 0.9997844910483683d);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.4856741544225798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1410583570401092d + "'", double1 == 1.1410583570401092d);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.1647182772090332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) (-36L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12796368962740468d) + "'", double1 == (-0.12796368962740468d));
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.07414666724177091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9999500037496876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.1713638431318046E-5d) + "'", double1 == (-2.1713638431318046E-5d));
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8604282210872225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6521128841879388d + "'", double1 == 0.6521128841879388d);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.594973153695066E-5d, (double) 39481480091340L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0398008129510645E-19d + "'", double2 == 4.0398008129510645E-19d);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.2239800905693157d, 1.0523779637351338d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2239800905693152d + "'", double2 == 2.2239800905693152d);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-59.10786673843407d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3398626545797663E25d + "'", double1 == 2.3398626545797663E25d);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.1240849833762582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13211207761779425d + "'", double1 == 0.13211207761779425d);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3297402172855466d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6997597439205169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6440339106610352d + "'", double1 == 0.6440339106610352d);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        long long1 = org.apache.commons.math.util.FastMath.round(1.3348400172962347d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.2460098192572937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2460098192572937d + "'", double1 == 1.2460098192572937d);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.3246090892520057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        double double1 = org.apache.commons.math.util.FastMath.tanh(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0544066060443427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02300811819039169d + "'", double1 == 0.02300811819039169d);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.810040600889587d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.15227205151615d + "'", double1 == 45.15227205151615d);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.1745267124417875d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.691649480399158E41d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, (-0.39592515018183416d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.39592515018183416d) + "'", double2 == (-0.39592515018183416d));
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5712556729872575d), 271.6563638137265d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0021028582689319873d) + "'", double2 == (-0.0021028582689319873d));
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        long long1 = org.apache.commons.math.util.FastMath.round(0.1223881891967115d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1217719640679913d, 1.1229215998502982d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7848860063260921d + "'", double2 == 0.7848860063260921d);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        long long2 = org.apache.commons.math.util.FastMath.max(1477896L, 72L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.39731803409120725d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3973180340912072d) + "'", double1 == (-0.3973180340912072d));
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.133577208235657d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05469123964916419d + "'", double1 == 0.05469123964916419d);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.8222596433035483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24882151940824415d) + "'", double1 == (-0.24882151940824415d));
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.07074101207510715d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6242716385733329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7203775199467526d + "'", double1 == 0.7203775199467526d);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7191015686156517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8479985663995262d + "'", double1 == 0.8479985663995262d);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.05469123964916419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5160777855982221d + "'", double1 == 1.5160777855982221d);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7615941559557655d, 11.591953275521519d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7615941559557656d + "'", double2 == 0.7615941559557656d);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.8369144593899815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8369144593899818d + "'", double1 == 1.8369144593899818d);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9917318921852735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6666666666666667d + "'", double1 == 0.6666666666666667d);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        double double2 = org.apache.commons.math.util.FastMath.min(1833.4649444186343d, 2.5999999999999996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5999999999999996d + "'", double2 == 2.5999999999999996d);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5707651109236087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.810327220066308d + "'", double1 == 3.810327220066308d);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.564939354012384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5353645941168004d + "'", double1 == 0.5353645941168004d);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        double double1 = org.apache.commons.math.util.FastMath.cosh(7.111512116496156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 613.0004078303422d + "'", double1 == 613.0004078303422d);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.6230034949480645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7487731841429789d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6427154841742911d + "'", double1 == 0.6427154841742911d);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.542010393166326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5689411523163806d + "'", double1 == 0.5689411523163806d);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5672839406622014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5672839406622017d + "'", double1 == 1.5672839406622017d);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        double double2 = org.apache.commons.math.util.FastMath.atan2(11013.232874695796d, (-0.17119879283175626d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5708118716212673d + "'", double2 == 1.5708118716212673d);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.164473663317525E39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.240152057753145E41d + "'", double1 == 1.240152057753145E41d);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.017302733123681042d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017154745458683805d + "'", double1 == 0.017154745458683805d);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        double double1 = org.apache.commons.math.util.FastMath.log10(34.768015146316124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.541179898172264d + "'", double1 == 1.541179898172264d);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5826970349443759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011900427241491611d) + "'", double1 == (-0.011900427241491611d));
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        long long1 = org.apache.commons.math.util.FastMath.round(1.013221573872519d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.594700892207039d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        int int2 = org.apache.commons.math.util.FastMath.min(2, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.194206803317586d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.5656994050637374d), 39.82204982013094d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5656994050637372d) + "'", double2 == (-1.5656994050637372d));
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.7456418720467646d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.7775225130543997d) + "'", double1 == (-2.7775225130543997d));
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.2045352723380653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.21501840976713257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21842712107840842d + "'", double1 == 0.21842712107840842d);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2909944487358056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8593867635096132d + "'", double1 == 0.8593867635096132d);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        long long1 = org.apache.commons.math.util.FastMath.round(0.2680279460309557d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.2878368723990908d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.29196735084148556d) + "'", double1 == (-0.29196735084148556d));
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9905446432719665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 39481480091340L, (float) (-36));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.133577208235657d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8088310611859937d + "'", double1 == 1.8088310611859937d);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-2L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.2917098371502295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        int int1 = org.apache.commons.math.util.FastMath.abs(53);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2532512135083778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8491928178865491d + "'", double1 == 0.8491928178865491d);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.2130532941206642d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8375930412496614d) + "'", double1 == (-0.8375930412496614d));
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 53, (float) 53);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        double double1 = org.apache.commons.math.util.FastMath.ceil(82.80264201054017d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 83.0d + "'", double1 == 83.0d);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        double double2 = org.apache.commons.math.util.FastMath.min((-2.675024856842625d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.675024856842625d) + "'", double2 == (-2.675024856842625d));
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2715542753135176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1276321542566607d + "'", double1 == 1.1276321542566607d);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.148283155648077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        float float2 = org.apache.commons.math.util.FastMath.min(4.0f, 11013.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        double double1 = org.apache.commons.math.util.FastMath.acosh(34.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.228279826110952d + "'", double1 == 4.228279826110952d);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.13211207761779425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13134879548499653d + "'", double1 == 0.13134879548499653d);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6995216443485196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.35735854275557144d) + "'", double1 == (-0.35735854275557144d));
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-53L), 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        double double1 = org.apache.commons.math.util.FastMath.tanh(442413.3920089205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.39585386311332965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38559616115412315d + "'", double1 == 0.38559616115412315d);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9751009553485449d, 0.7805951733159242d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9751009553485449d + "'", double2 == 0.9751009553485449d);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-2.30756025842063d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.975185951049946d) + "'", double1 == (-4.975185951049946d));
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.03490658503988659d), (-2.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0349065850398866d) + "'", double2 == (-0.0349065850398866d));
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.385849999980594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1772213045900053d + "'", double1 == 1.1772213045900053d);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.4689057088038129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48627885708638907d + "'", double1 == 0.48627885708638907d);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.490658503988659d, (double) 2147483647);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6254645332759822E-9d + "'", double2 == 1.6254645332759822E-9d);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32, (-36.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        double double1 = org.apache.commons.math.util.FastMath.floor(68.40322401739334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 68.0d + "'", double1 == 68.0d);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6719977351570301d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (byte) 10, 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1392309460131813d + "'", double2 == 1.1392309460131813d);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.4911392070312753d, 1.4495725029967728d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3266773376804153d + "'", double2 == 0.3266773376804153d);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.691076096637946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.5068440202380022d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        double double1 = org.apache.commons.math.util.FastMath.ulp(572.9577951308233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1368683772161603E-13d + "'", double1 == 1.1368683772161603E-13d);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.1215871267631296E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1215384062460795E-5d + "'", double1 == 3.1215384062460795E-5d);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        long long1 = org.apache.commons.math.util.FastMath.round(2.2039425986338603d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3092866533194534d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7944146264030464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.700702522942757d + "'", double1 == 0.700702522942757d);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8633639145424554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9746912786087358d + "'", double1 == 0.9746912786087358d);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        long long2 = org.apache.commons.math.util.FastMath.min(36L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.2177221477573357d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21603772555018477d) + "'", double1 == (-0.21603772555018477d));
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.810327220066308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6199936158896424d) + "'", double1 == (-0.6199936158896424d));
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, (-53L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.253350360695029d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        double double2 = org.apache.commons.math.util.FastMath.pow(11013.000000000002d, 2.3852968325547366d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.376679237093473E9d + "'", double2 == 4.376679237093473E9d);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5683229532269037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7538719740293466d + "'", double1 == 0.7538719740293466d);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.544753606236012E-12d);
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
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9663516425671944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.367870644634905d + "'", double1 == 55.367870644634905d);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7191015686156517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9643200333078156d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        double double1 = org.apache.commons.math.util.FastMath.log10(96.10655605346268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9827530147312373d + "'", double1 == 1.9827530147312373d);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5728275353520677d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 53, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        double double1 = org.apache.commons.math.util.FastMath.acosh(13.596393407513998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3015966351452155d + "'", double1 == 3.3015966351452155d);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0554351483188518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01842081837943866d + "'", double1 == 0.01842081837943866d);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.4253120969346567d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4134332111535645d) + "'", double1 == (-0.4134332111535645d));
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.24266079489065126d, 1.5572942752342611d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.11022076540492277d + "'", double2 == 0.11022076540492277d);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6729892096111301d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9600876852440052d + "'", double1 == 1.9600876852440052d);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6384917413123372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0000000000000018d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1437757162199678d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.912812809961445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9992015815530141d + "'", double1 == 0.9992015815530141d);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5729.5779513082325d + "'", double1 == 5729.5779513082325d);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        double double1 = org.apache.commons.math.util.FastMath.exp(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.4451787324341034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        double double2 = org.apache.commons.math.util.FastMath.min((-2.30756025842063d), 2.445650060521281d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.30756025842063d) + "'", double2 == (-2.30756025842063d));
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1920928955078125E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.080594601624405E-9d + "'", double1 == 2.080594601624405E-9d);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.953499812724235d, 0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9597713318903205d + "'", double2 == 0.9597713318903205d);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.24929524866556063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24425607142663947d + "'", double1 == 0.24425607142663947d);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        long long2 = org.apache.commons.math.util.FastMath.min(52L, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        int int2 = org.apache.commons.math.util.FastMath.min(35, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1920928955078125E-7d, 0.9964183022495265d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1963779597549772E-7d + "'", double2 == 1.1963779597549772E-7d);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        double double1 = org.apache.commons.math.util.FastMath.acos((-4.9E-324d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        double double1 = org.apache.commons.math.util.FastMath.signum(71.39110387530145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        double double1 = org.apache.commons.math.util.FastMath.exp(9.306831672164943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11012.99999999999d + "'", double1 == 11012.99999999999d);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.8189894035458565E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8189894035442021E-12d + "'", double1 == 1.8189894035442021E-12d);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.147483647E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9428090415820635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8092116512100659d + "'", double1 == 0.8092116512100659d);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        double double1 = org.apache.commons.math.util.FastMath.cos(36.04365338911715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08456102495932247d) + "'", double1 == (-0.08456102495932247d));
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.7568396789787597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.75683967897876d + "'", double1 == 3.75683967897876d);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.2712959543974419d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5422186167449905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        double double2 = org.apache.commons.math.util.FastMath.max(4.951760157141521E27d, (double) 4.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.951760157141521E27d + "'", double2 == 4.951760157141521E27d);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.217652850343311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7964493619549832d + "'", double1 == 0.7964493619549832d);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5638717219103803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7574637558162575d + "'", double1 == 0.7574637558162575d);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.8292136654695167d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 10.0f, (-1.4650188248182272d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7162633894119443d + "'", double2 == 1.7162633894119443d);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        int int2 = org.apache.commons.math.util.FastMath.max(32, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5303468257884512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8094437199630216d + "'", double1 == 0.8094437199630216d);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.1563686078816606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.044836923843401d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6482508233950507d) + "'", double1 == (-0.6482508233950507d));
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.5835189384561104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 205.3205109787361d + "'", double1 == 205.3205109787361d);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.242605345373291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.24266079489065126d, (-4.278070357299329d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.084931348079087d + "'", double2 == 3.084931348079087d);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8491928178865491d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014821210656408876d + "'", double1 == 0.014821210656408876d);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9508218731216449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.668250757176408d + "'", double1 == 0.668250757176408d);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        long long1 = org.apache.commons.math.util.FastMath.round((-35.99999999999999d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-36L) + "'", long1 == (-36L));
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        long long1 = org.apache.commons.math.util.FastMath.round(1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1217719640679913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0591373678933207d + "'", double1 == 1.0591373678933207d);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        double double2 = org.apache.commons.math.util.FastMath.min(9.999999999999998d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        float float2 = org.apache.commons.math.util.FastMath.max(1.0f, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.320630207612775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.820828880418915d + "'", double1 == 13.820828880418915d);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7848860063260921d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7848860063260921d + "'", double1 == 0.7848860063260921d);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.618990892446662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9830787956514044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5234147844947254d + "'", double1 == 1.5234147844947254d);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        double double2 = org.apache.commons.math.util.FastMath.min(0.003993711498963172d, 0.8809373872769856d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003993711498963172d + "'", double2 == 0.003993711498963172d);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.2239800905693152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5707963274966374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963274966377d + "'", double1 == 1.5707963274966377d);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6769292032740716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5895194292017539d + "'", double1 == 0.5895194292017539d);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        long long2 = org.apache.commons.math.util.FastMath.max(5L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3136593011643067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3136593011643067d + "'", double1 == 1.3136593011643067d);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4142135623730951d + "'", double1 == 1.4142135623730951d);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.017154745458683805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.3485292390836008d), 1.3136593011643067d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3136593011643067d + "'", double2 == 1.3136593011643067d);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        double double2 = org.apache.commons.math.util.FastMath.pow(21.665602783539605d, 0.6846269172035435d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.213053064948797d + "'", double2 == 8.213053064948797d);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 11.570393614520828d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6156264703860141d) + "'", double1 == (-0.6156264703860141d));
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-2.30756025842063d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9004962809790011d) + "'", double1 == (-0.9004962809790011d));
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.21501840976713257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.319647397271215d + "'", double1 == 12.319647397271215d);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        int int2 = org.apache.commons.math.util.FastMath.min(52, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.6878438789017723E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.12841819466121d + "'", double1 == 43.12841819466121d);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8746486203042796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.11367450037566d + "'", double1 == 50.11367450037566d);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        double double1 = org.apache.commons.math.util.FastMath.signum((-16.7137425111567d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7857868058746702d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8864461663714668d + "'", double1 == 0.8864461663714668d);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        long long2 = org.apache.commons.math.util.FastMath.min((-2L), (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9402241834946016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.772945733569301d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5414729998706594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8150650454920118d + "'", double1 == 0.8150650454920118d);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.084931348079087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.056630991823551025d + "'", double1 == 0.056630991823551025d);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.99189285848507d) + "'", double1 == (-0.99189285848507d));
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.15335264995992573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15395442373348717d + "'", double1 == 0.15395442373348717d);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        double double1 = org.apache.commons.math.util.FastMath.exp(82.80264201054018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.135461931345429E35d + "'", double1 == 9.135461931345429E35d);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4657022738769552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.330583428267176d + "'", double1 == 4.330583428267176d);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-16.857679757182947d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999522687615d) + "'", double1 == (-0.9999999522687615d));
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        int int2 = org.apache.commons.math.util.FastMath.min(97, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9532533939390466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4898102688480725d + "'", double1 == 1.4898102688480725d);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.00883809281975468d), 2048.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.00883809281975468d) + "'", double2 == (-0.00883809281975468d));
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 11013, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (-2.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.6268604078470186d) + "'", double1 == (-3.6268604078470186d));
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7237368419565783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8837010712667019d + "'", double1 == 0.8837010712667019d);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.3305834282671767d, 0.9236795528830172d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3002627588283298d + "'", double2 == 1.3002627588283298d);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.746938918904175d), (-4.258659887385141d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7469389189041751d) + "'", double2 == (-0.7469389189041751d));
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.152127757479647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6508801680230075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557649d + "'", double1 == 0.7615941559557649d);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.03337773768597237d, 0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03337773815377114d + "'", double2 == 0.03337773815377114d);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.023974957339495964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023970364804932462d + "'", double1 == 0.023970364804932462d);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 52, (long) (-53));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.4932054413052554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0550256221829202d + "'", double1 == 1.0550256221829202d);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.586013452313419E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.586013452313419E15d + "'", double1 == 1.586013452313419E15d);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.7978269761159673E33d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9711243963529564d) + "'", double1 == (-0.9711243963529564d));
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.41032129904824216d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        double double1 = org.apache.commons.math.util.FastMath.sin(68.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8979276806892913d) + "'", double1 == (-0.8979276806892913d));
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8415496589078763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.375500687858178d + "'", double1 == 1.375500687858178d);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, (float) 53);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        int int2 = org.apache.commons.math.util.FastMath.min(32, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.223886926280673d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.3320915232243828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9453625312870415d + "'", double1 == 0.9453625312870415d);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-11.046060585537848d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31348.240034421615d + "'", double1 == 31348.240034421615d);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.09995276840535378d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        double double2 = org.apache.commons.math.util.FastMath.min(0.00426464387701392d, 1.3340213222681154E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3340213222681154E-8d + "'", double2 == 1.3340213222681154E-8d);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 52, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.21603772555018477d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21276782429758892d) + "'", double1 == (-0.21276782429758892d));
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.0037786218504155065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5670176959525735d + "'", double1 == 1.5670176959525735d);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9718540920347526d, 1.3092866533194534d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3092866533194534d + "'", double2 == 1.3092866533194534d);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8113741275700294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09077884483567829d) + "'", double1 == (-0.09077884483567829d));
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.017453292519943295d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.719463918234335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.5815355027042575d + "'", double1 == 5.5815355027042575d);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        float float2 = org.apache.commons.math.util.FastMath.min(4.0f, 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        int int1 = org.apache.commons.math.util.FastMath.abs(11013);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11013 + "'", int1 == 11013);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5607966601082315d, 1.5949858734594968E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000007100844429d + "'", double2 == 1.000007100844429d);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        double double2 = org.apache.commons.math.util.FastMath.max(7.603575026530223d, 1.3072602306204815d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.603575026530223d + "'", double2 == 7.603575026530223d);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103323d + "'", double1 == 11013.232920103323d);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7346568543593085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7420608187820846d + "'", double1 == 0.7420608187820846d);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.30102999566398114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30559714930590764d + "'", double1 == 0.30559714930590764d);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.8862269254527582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9506628842154309d + "'", double1 == 0.9506628842154309d);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        long long2 = org.apache.commons.math.util.FastMath.min(57L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.27631948176648663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24398053114331036d + "'", double1 == 0.24398053114331036d);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.8119320375488408d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8366617438896834d) + "'", double1 == (-0.8366617438896834d));
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9562328011312552d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01668941079530856d) + "'", double1 == (-0.01668941079530856d));
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.1223881891967115d, 34.30685281944005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0035674409029537143d + "'", double2 == 0.0035674409029537143d);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        long long2 = org.apache.commons.math.util.FastMath.max(52L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, (-7.369139609590174E-249d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.06488501547250208d, (-0.9210509322442526d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.06488501547250207d + "'", double2 == 0.06488501547250207d);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6846269172035435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6846269172035435d + "'", double1 == 0.6846269172035435d);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        int int2 = org.apache.commons.math.util.FastMath.max(1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7538719740293466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8273358886853742d + "'", double1 == 0.8273358886853742d);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.34555558058171215d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3390237543630367d) + "'", double1 == (-0.3390237543630367d));
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        double double1 = org.apache.commons.math.util.FastMath.tan(18.72514057803899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12506129236784067d) + "'", double1 == (-0.12506129236784067d));
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        double double1 = org.apache.commons.math.util.FastMath.log10((-48.18608569304648d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.344459247866038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3376877392668466d + "'", double1 == 0.3376877392668466d);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8431082790768843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8431082790768845d + "'", double1 == 0.8431082790768845d);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8864461663714668d, 0.0133874022879147d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5556951450945122d + "'", double2 == 1.5556951450945122d);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.010374668122887301d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.810721175460831E-4d) + "'", double1 == (-1.810721175460831E-4d));
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.0476958419065934d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0156523399700865d) + "'", double1 == (-1.0156523399700865d));
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.030368359245297637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5175786716959128d) + "'", double1 == (-1.5175786716959128d));
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        long long1 = org.apache.commons.math.util.FastMath.round(3.9349327016694437E-28d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5716776679087391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5591799640801441d) + "'", double1 == (-0.5591799640801441d));
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        double double1 = org.apache.commons.math.util.FastMath.log(83.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.418840607796598d + "'", double1 == 4.418840607796598d);
    }
}

