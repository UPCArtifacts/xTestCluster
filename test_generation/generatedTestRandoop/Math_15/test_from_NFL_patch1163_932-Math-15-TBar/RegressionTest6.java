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
        float float2 = org.apache.commons.math3.util.FastMath.max((-2.9999998f), (-5.999999f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.9999998f) + "'", float2 == (-2.9999998f));
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.1920928955078125E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004921566601151848d + "'", double1 == 0.004921566601151848d);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        int int1 = org.apache.commons.math3.util.FastMath.round((-1.0000001f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(5.421010862427522E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.421010862427522E-20d + "'", double1 == 5.421010862427522E-20d);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(5120.0005f, (int) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.75921877E14f + "'", float2 == 1.75921877E14f);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        double double1 = org.apache.commons.math3.util.FastMath.tan(5.293955920339377E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.293955920339377E-23d + "'", double1 == 5.293955920339377E-23d);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        int int2 = org.apache.commons.math3.util.FastMath.min(3, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        double double1 = org.apache.commons.math3.util.FastMath.abs(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.004478358365843835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(6208.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.094947017729282E-13d + "'", double1 == 9.094947017729282E-13d);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        double double1 = org.apache.commons.math3.util.FastMath.rint(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.301298902307295d, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.60259780461459d + "'", double2 == 4.60259780461459d);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.8596236973023724d), (-0.8646647167633873d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.8369630128952054d, 2.0741994506493335d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.236696324052198d + "'", double2 == 2.236696324052198d);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.384185791015625E-7d, 1.900849165587834d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.900849165587834d + "'", double2 == 1.900849165587834d);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.21687579852418168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22034127188586755d + "'", double1 == 0.22034127188586755d);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        double double1 = org.apache.commons.math3.util.FastMath.asin(46340.95001184158d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.000000000007276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.275957614156956E-12d + "'", double1 == 7.275957614156956E-12d);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7615941559557649d) + "'", double1 == (-0.7615941559557649d));
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(7.8972863173864525d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(39.960969282839415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.26374993599281344E17d + "'", double1 == 2.26374993599281344E17d);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        long long2 = org.apache.commons.math3.util.FastMath.min((-6L), (-23L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-23L) + "'", long2 == (-23L));
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10325507102576029d + "'", double1 == 0.10325507102576029d);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 0, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.027235643304099704d, (double) 511);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.027235643304099708d + "'", double2 == 0.027235643304099708d);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (-4.9999995f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.9998902999783974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7179836492391738d + "'", double1 == 1.7179836492391738d);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2400.8743011177776d, (-0.22429382749098223d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5708897485232787d + "'", double2 == 1.5708897485232787d);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 3L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.6497827368478742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1872318309893432d) + "'", double1 == (-0.1872318309893432d));
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.9999999999999984d, (-41));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.094947017729275E-13d + "'", double2 == 9.094947017729275E-13d);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        int int2 = org.apache.commons.math3.util.FastMath.max((-10), 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        double double1 = org.apache.commons.math3.util.FastMath.log(3.083333333333333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.126011262856224d + "'", double1 == 1.126011262856224d);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.010200777470529932d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(5.686278854741452E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.68627886E8d + "'", double1 == 5.68627886E8d);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) (-4503599627370496L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.342161576411106E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707729051791304d + "'", double1 == 1.5707729051791304d);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 5, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        double double1 = org.apache.commons.math3.util.FastMath.acos(71.02915737294383d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        double double1 = org.apache.commons.math3.util.FastMath.log(17.863451288869854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8827567980377764d + "'", double1 == 2.8827567980377764d);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5440680443502757d + "'", double1 == 1.5440680443502757d);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, (-20));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.1752011936437905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7771211630872562d + "'", double1 == 0.7771211630872562d);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        float float2 = org.apache.commons.math3.util.FastMath.min(3.0f, (float) 511);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.024600920295739914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2908375324515082d + "'", double1 == 0.2908375324515082d);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        double double2 = org.apache.commons.math3.util.FastMath.max(4.503599627370496E15d, 0.0059490826533332725d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.503599627370496E15d + "'", double2 == 4.503599627370496E15d);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        double double1 = org.apache.commons.math3.util.FastMath.asin(24.95329850015803d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.8633360733698906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 3.43597363E10f, (-2.067786496795693E-15d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4359736319999996E10d + "'", double2 == 3.4359736319999996E10d);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.570743203905968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5707963267948967d + "'", double1 == 0.5707963267948967d);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.8202965860187448d, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.281186344074979d + "'", double2 == 3.281186344074979d);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(128.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(178.72171540421934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10240.0d + "'", double1 == 10240.0d);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 2.34187215E17f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.6612899360192603d) + "'", double1 == (-2.6612899360192603d));
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(4.0f, (float) 1024L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.006220050026892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5350578961457685d + "'", double1 == 0.5350578961457685d);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 511.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 511.0d + "'", double1 == 511.0d);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.3012989023072956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.03216605451972054d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        double double2 = org.apache.commons.math3.util.FastMath.max(4096.0d, (double) (-0.99999994f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4096.0d + "'", double2 == 4096.0d);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.02028853366493086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0204957449291814d + "'", double1 == 1.0204957449291814d);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.3589153218773263d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9379018508748678d + "'", double1 == 1.9379018508748678d);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.3716732554246792d, 0.8919599252153066d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.37167325542467927d + "'", double2 == 0.37167325542467927d);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.734723475976807E-18d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        int int2 = org.apache.commons.math3.util.FastMath.min(32768, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.8823852309817808E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 4L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0634370688955608d + "'", double1 == 2.0634370688955608d);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.0590452297311184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.271066547867196d, (double) (-0.0234375f));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) 0, 511L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 511L + "'", long2 == 511L);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 1.9073485E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9073485191245059E-6d + "'", double1 == 1.9073485191245059E-6d);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 511);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 511.0f + "'", float1 == 511.0f);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.5033290854469099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7094568947067256d + "'", double1 == 0.7094568947067256d);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.0362419725544858d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.036241972554485795d) + "'", double1 == (-0.036241972554485795d));
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.29583625524354545d, 10.536049848239342d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.9334162333595348d) + "'", double2 == (-1.9334162333595348d));
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.7601702599438814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9966182834017786d + "'", double1 == 0.9966182834017786d);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 10.000002f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(2153.28968210235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 37.58199470190802d + "'", double1 == 37.58199470190802d);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        double double2 = org.apache.commons.math3.util.FastMath.min(Double.POSITIVE_INFINITY, 0.059306170823242965d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.059306170823242965d + "'", double2 == 0.059306170823242965d);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.6332359729824427d), (double) 1.71798692E10f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6332359729824426d) + "'", double2 == (-0.6332359729824426d));
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        long long1 = org.apache.commons.math3.util.FastMath.abs(23L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 23L + "'", long1 == 23L);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.5193407089583182d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6809190694162586d + "'", double1 == 1.6809190694162586d);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(35.014282803427776d, 1.1920928955078125E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963233903062d + "'", double2 == 1.5707963233903062d);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(6208.0f, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6208.0f + "'", float2 == 6208.0f);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-2.9999998f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-2.9999995f) + "'", float1 == (-2.9999995f));
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        long long2 = org.apache.commons.math3.util.FastMath.min(5L, (-23L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-23L) + "'", long2 == (-23L));
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.9999999999999929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(6.0d, 0.08369000730960287d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.000583639724013d + "'", double2 == 6.000583639724013d);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.02028853366493086d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.30033084129497156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30969878586487914d + "'", double1 == 0.30969878586487914d);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 1.2207031E-4f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2207031189367021E-4d + "'", double1 == 1.2207031189367021E-4d);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        double double1 = org.apache.commons.math3.util.FastMath.tan(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8203867151263053d) + "'", double1 == (-0.8203867151263053d));
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.442854201821675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.1097402702744097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.033570383701882d + "'", double1 == 3.033570383701882d);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        double double1 = org.apache.commons.math3.util.FastMath.acos(100.00000762939452d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-3.141592653577698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.0d) + "'", double1 == (-4.0d));
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.8742173026236351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8742173026236352d + "'", double1 == 0.8742173026236352d);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 24.249994f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1884163814228086d + "'", double1 == 3.1884163814228086d);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        double double2 = org.apache.commons.math3.util.FastMath.max(12.34222982222313d, 263.856815596594d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 263.856815596594d + "'", double2 == 263.856815596594d);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (-1L), 6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-64.0d) + "'", double2 == (-64.0d));
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        long long2 = org.apache.commons.math3.util.FastMath.max(41L, (long) 15);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 41L + "'", long2 == 41L);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-2));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.38011261180303196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 9.536743E-7f, 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0517578125E-5d + "'", double2 == 3.0517578125E-5d);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        double double1 = org.apache.commons.math3.util.FastMath.atan(403.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.568314942309596d + "'", double1 == 1.568314942309596d);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(96.99999237060547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.26788464966007d + "'", double1 == 5.26788464966007d);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.006142729981775034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006142729981775035d + "'", double1 == 0.006142729981775035d);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-7.801440805870862E-17d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        int int1 = org.apache.commons.math3.util.FastMath.round(7.1054274E-15f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(41.903161481023d, 5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 41.90316148102299d + "'", double2 == 41.90316148102299d);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.9316196464217202d, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8632392928434405d + "'", double2 == 1.8632392928434405d);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 5120.0005f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5120.0d + "'", double1 == 5120.0d);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (-23));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.026187963170189E-10d + "'", double1 == 1.026187963170189E-10d);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-40.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.9801475222605264d, 1.0787365865827503d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9801475222605265d + "'", double2 == 0.9801475222605265d);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-5.418539921951662d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004433615348723692d + "'", double1 == 0.004433615348723692d);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        double double1 = org.apache.commons.math3.util.FastMath.cos(4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07074101207510715d) + "'", double1 == (-0.07074101207510715d));
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(18824.277429736758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.536049848239342d + "'", double1 == 10.536049848239342d);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 4, (long) (-10));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10L) + "'", long2 == (-10L));
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.8203432320660448d, 1.0175545319252317d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0175545319252317d + "'", double2 == 1.0175545319252317d);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.1353352832366127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1449205926874493d + "'", double1 == 1.1449205926874493d);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.5033290854469099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40768203919741414d + "'", double1 == 0.40768203919741414d);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1.0f, (-7.8683390140765455E-19d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.8823852309817808E12d, 61);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.3404848255064437E30d + "'", double2 == 4.3404848255064437E30d);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0536712127723509E-8d, 1.0035040531497879d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.053671212772351E-8d + "'", double2 == 1.053671212772351E-8d);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.0272356433040997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003709130602427d + "'", double1 == 1.0003709130602427d);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.9899924966004454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-56.72239180482502d) + "'", double1 == (-56.72239180482502d));
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 4.5474746E-13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.547474593066815E-13d + "'", double1 == 4.547474593066815E-13d);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.862318872287684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876841d + "'", double1 == 0.8623188722876841d);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.02711357689300422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02711025494194475d + "'", double1 == 0.02711025494194475d);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.842171E-14f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-45) + "'", int1 == (-45));
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(102400.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5867087.82213963d + "'", double1 == 5867087.82213963d);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.5707962075856141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2533140897578763d + "'", double1 == 1.2533140897578763d);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        long long2 = org.apache.commons.math3.util.FastMath.min((-20L), 23L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-20L) + "'", long2 == (-20L));
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.49174338951939384d, (-1.4731414029041368d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8194167898372147d + "'", double2 == 2.8194167898372147d);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        double double2 = org.apache.commons.math3.util.FastMath.max(5.1858299335526885d, (-0.18710109962234833d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.1858299335526885d + "'", double2 == 5.1858299335526885d);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) (-1.9999999f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03490658295929199d) + "'", double1 == (-0.03490658295929199d));
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.38874545763980906d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3220931959476781d) + "'", double1 == (-0.3220931959476781d));
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.217652850343311d + "'", double1 == 1.217652850343311d);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(20.000002f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8184464592320668d + "'", double1 == 1.8184464592320668d);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.28741580761930413d), 0.6108652381980153d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.675103092651911d + "'", double2 == 0.675103092651911d);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.1920928244535417E-7d, (-4.476961205229636d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.476961205229636d) + "'", double2 == (-4.476961205229636d));
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.154458839122665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5106521020275598d + "'", double1 == 1.5106521020275598d);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        int int1 = org.apache.commons.math3.util.FastMath.round((-40.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-40) + "'", int1 == (-40));
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        double double1 = org.apache.commons.math3.util.FastMath.cos(9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011800076512800236d + "'", double1 == 0.011800076512800236d);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.1019269915497951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1019269915497951d + "'", double1 == 0.1019269915497951d);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 61);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 61.000004f + "'", float1 == 61.000004f);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 4096);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 234683.5128855852d + "'", double1 == 234683.5128855852d);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.9999999999795215d), (-40));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-9.094947017543031E-13d) + "'", double2 == (-9.094947017543031E-13d));
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.7790360334325874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.9115170270339398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 3.33289488E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.0f, 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        int int2 = org.apache.commons.math3.util.FastMath.max(6, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (-17));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.139937718785167E-8d + "'", double1 == 4.139937718785167E-8d);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(20.951580740511496d, 6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1340.9011673927357d + "'", double2 == 1340.9011673927357d);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.9999957691935532d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.00620078535925078d, 3580.56673991988d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.00620078535925078d + "'", double2 == 0.00620078535925078d);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.9115170270339398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(7.1054274E-15f, (float) 4096);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.1054274E-15f + "'", float2 == 7.1054274E-15f);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(13.000001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 13.000002f + "'", float1 == 13.000002f);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        double double2 = org.apache.commons.math3.util.FastMath.min(4.687693995581348d, 0.03274454486619997d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03274454486619997d + "'", double2 == 0.03274454486619997d);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (-4503599627370496L), 0.9801475222605265d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.04665687272850968d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(342.77469083470083d, 0.05709087716385304d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570629771684025d + "'", double2 == 1.570629771684025d);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-8.042848410283348d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.231631670286621d + "'", double1 == 5.231631670286621d);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-4.375d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.375d + "'", double1 == 4.375d);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.272221872585407E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 10.000002f, (-0.9985859267674833d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.000001907348633d + "'", double2 == 10.000001907348633d);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.006285734418917205d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.006305572823831891d) + "'", double1 == (-0.006305572823831891d));
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(9.5367431640625E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1175823681357508E-22d + "'", double1 == 2.1175823681357508E-22d);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 61);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 61L + "'", long1 == 61L);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(Double.NaN, (-0.1592259218842048d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.10567738618806241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.054868218550075d + "'", double1 == 6.054868218550075d);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.8202965860187449d, 3.281186344074979d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2449786631268642d + "'", double2 == 0.2449786631268642d);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        int int2 = org.apache.commons.math3.util.FastMath.max((-18), (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        float float1 = org.apache.commons.math3.util.FastMath.abs(34.999996f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 34.999996f + "'", float1 == 34.999996f);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.08037538236017183d, 1023.9999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.7494413523026204d) + "'", double2 == (-2.7494413523026204d));
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        long long2 = org.apache.commons.math3.util.FastMath.min(4503599627370496L, 511L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 511L + "'", long2 == 511L);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        double double1 = org.apache.commons.math3.util.FastMath.signum(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.8809094881441946E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5729.5779513082325d + "'", double1 == 5729.5779513082325d);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-23));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        double double1 = org.apache.commons.math3.util.FastMath.atan(58.996877293214865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5538479001269114d + "'", double1 == 1.5538479001269114d);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        float float2 = org.apache.commons.math3.util.FastMath.max(5.421011E-20f, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(3.8146899896858897E-6d, (double) (-4.9999995f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.999999523164297d + "'", double2 == 4.999999523164297d);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.0283378365323201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017947881070324214d + "'", double1 == 0.017947881070324214d);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(23.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9073486E-6f + "'", float1 == 1.9073486E-6f);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.009430054193516519d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1 == (-7));
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.6995216443485196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5031770949976695d) + "'", double1 == (-0.5031770949976695d));
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        int int2 = org.apache.commons.math3.util.FastMath.max(10240, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10240 + "'", int2 == 10240);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        double double2 = org.apache.commons.math3.util.FastMath.max((-1.6668288393884205d), (double) (-64L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6668288393884205d) + "'", double2 == (-1.6668288393884205d));
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.675103092651911d, 0.9960689204702708d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5956484387948465d + "'", double2 == 0.5956484387948465d);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(3.9638529430022156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6021822422061627d + "'", double1 == 1.6021822422061627d);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        double double1 = org.apache.commons.math3.util.FastMath.log(5786.873730821315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.66334748188207d + "'", double1 == 8.66334748188207d);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.912139617126407E10d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 19121396171L + "'", long1 == 19121396171L);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        double double2 = org.apache.commons.math3.util.FastMath.log(167.65805815345627d, 0.8633360733698906d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.028690618287860615d) + "'", double2 == (-0.028690618287860615d));
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-1.3427390986374435E15d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.008837977756594232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.00883774765274219d) + "'", double1 == (-0.00883774765274219d));
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        double double1 = org.apache.commons.math3.util.FastMath.sin(4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9974947163822921d) + "'", double1 == (-0.9974947163822921d));
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-40.63159692392033d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 100, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-2.8438669798515654d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.99999994f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.192092824453536E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.452669727114854E-4d + "'", double1 == 3.452669727114854E-4d);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        double double1 = org.apache.commons.math3.util.FastMath.floor(34.30686044883459d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.0d + "'", double1 == 34.0d);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-24.191690961245197d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.191690961245197d + "'", double1 == 24.191690961245197d);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 96.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.26788464966007d + "'", double1 == 5.26788464966007d);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(13.000002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 13.000003f + "'", float1 == 13.000003f);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.0536712127723509E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6543612251060553E-24d + "'", double1 == 1.6543612251060553E-24d);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.1449205926874493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.01014840024536274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999485054281845d + "'", double1 == 0.9999485054281845d);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(97.00001f, (float) 20L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.00001f + "'", float2 == 97.00001f);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.5533570812458124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(10.00000038146972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999999995877696d + "'", double1 == 0.999999995877696d);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.5422326689561365d, 13.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5422326689561368d + "'", double2 == 1.5422326689561368d);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.09298255216717233d, 8);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.587424908532976E-9d + "'", double2 == 5.587424908532976E-9d);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        int int1 = org.apache.commons.math3.util.FastMath.round(57.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        double double2 = org.apache.commons.math3.util.FastMath.pow(6.236369590203704d, 6.938893903907228E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.4419647419307422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9085973124442547d + "'", double1 == 0.9085973124442547d);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 10240, 9.536743E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.536743E-7f + "'", float2 == 9.536743E-7f);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 4503599627370496L, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.331929865381182d + "'", double1 == 9.331929865381182d);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-0.0234375f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0234375f + "'", float1 == 0.0234375f);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(167.61264592409196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.814811717347948d + "'", double1 == 5.814811717347948d);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        long long1 = org.apache.commons.math3.util.FastMath.round(1340.9011673927357d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1341L + "'", long1 == 1341L);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        double double1 = org.apache.commons.math3.util.FastMath.abs(6208.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6208.0d + "'", double1 == 6208.0d);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) (-41));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1992174676502746E17d + "'", double1 == 3.1992174676502746E17d);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.302585131141017d, 0.49369669957632584d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.302585131141017d + "'", double2 == 2.302585131141017d);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 23L, 0.1961198770299012d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1961198770299012d + "'", double2 == 0.1961198770299012d);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.4288314664442319d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.093365958203461d + "'", double1 == 1.093365958203461d);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.04665687272850968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0010886293480585d + "'", double1 == 1.0010886293480585d);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        int int1 = org.apache.commons.math3.util.FastMath.round(31.999998f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.7739782060779719d, (-10));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.963213729101282d + "'", double2 == 12.963213729101282d);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 40.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.3978727715165242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, 64L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, 3.107184941633452E23d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 32);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-1.4E-45f), 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1E-44f) + "'", float2 == (-1.1E-44f));
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (-511.5f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        double double1 = org.apache.commons.math3.util.FastMath.log(9.201788821823161E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.99094246966695d) + "'", double1 == (-6.99094246966695d));
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.03274454486619997d, 8.318010277546872d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.45564513420589E-13d + "'", double2 == 4.45564513420589E-13d);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.8761242229100255d, 0.8003717195249049d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2753807838602156d + "'", double2 == 0.2753807838602156d);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.5395564877821442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9319894546747586d + "'", double1 == 0.9319894546747586d);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-3));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.4650191511034985d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        int int1 = org.apache.commons.math3.util.FastMath.round((-3.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.4994475824457005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.479213990324464d + "'", double1 == 4.479213990324464d);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.4532640331862171d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, (-1023));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1023) + "'", int2 == (-1023));
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.9115170270339398d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7218595826821476d) + "'", double1 == (-0.7218595826821476d));
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.900849165587834d, (-0.4800568960210344d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.900849165587834d + "'", double2 == 1.900849165587834d);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.5708897485232787d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-1.6090486460720002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.253769370231402d) + "'", double1 == (-1.253769370231402d));
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.5707894966057265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.810444524607049d + "'", double1 == 3.810444524607049d);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2048.500122040519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 4096, (double) 7.1054274E-15f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.105427357601002E-15d + "'", double2 == 7.105427357601002E-15d);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(128.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.0232274785475504d, 100.00000000000004d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 200.5576604135868d + "'", double2 == 200.5576604135868d);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (-1.9999999f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.6268599593583692d) + "'", double1 == (-3.6268599593583692d));
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.1200795222140087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9637866463273798d + "'", double1 == 0.9637866463273798d);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, (-1.9999999f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.9999999f) + "'", float2 == (-1.9999999f));
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        int int2 = org.apache.commons.math3.util.FastMath.min((-23), 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-23) + "'", int2 == (-23));
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.912139617126407E10d, 80.00000012160547d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 80.00000012160547d + "'", double2 == 80.00000012160547d);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.1884163814228086d, (-127));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.111657402027768E-64d + "'", double2 == 1.111657402027768E-64d);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.09966865249116201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09983440995178776d + "'", double1 == 0.09983440995178776d);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-1022.99994f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.9992781084116672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.1362674922625857E-4d) + "'", double1 == (-3.1362674922625857E-4d));
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.9998000199980002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0000000066669989E-4d) + "'", double1 == (-2.0000000066669989E-4d));
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(48.499996f, 52.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 48.5f + "'", float2 == 48.5f);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        double double2 = org.apache.commons.math3.util.FastMath.max((-10.536049848239344d), 0.7046939980071439d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7046939980071439d + "'", double2 == 0.7046939980071439d);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.8342233605065122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.759169725377571d + "'", double1 == 0.759169725377571d);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.9999999999999999d, 0.0689622149987218d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0689622149987218d + "'", double2 == 0.0689622149987218d);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.03274454486619997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03273869620904596d + "'", double1 == 0.03273869620904596d);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        float float2 = org.apache.commons.math3.util.FastMath.min((-63.999996f), (float) (-6L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-63.999996f) + "'", float2 == (-63.999996f));
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.5091784786580567d, 0.9169927026825043d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.24179962938945632d) + "'", double2 == (-0.24179962938945632d));
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(4096.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.8828125E-4f + "'", float1 == 4.8828125E-4f);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(57.29577951308233d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0232274785475504d, (-0.6321205369012336d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0232274785475501d + "'", double2 == 1.0232274785475501d);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        float float1 = org.apache.commons.math3.util.FastMath.abs(4.60943642E18f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.60943642E18f + "'", float1 == 4.60943642E18f);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.8477481924511037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0465285740688983d + "'", double1 == 1.0465285740688983d);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-7.139470776250983E-6d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 100, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.4636456564559829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7686346899325218d) + "'", double1 == (-0.7686346899325218d));
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.15683098746077087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.3407807929942597E154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.03109752538365459d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9693810292091063d + "'", double1 == 0.9693810292091063d);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(10.04074995214716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.401592968989893d + "'", double1 == 2.401592968989893d);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 6208);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6208.0f + "'", float1 == 6208.0f);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 100.00001f, 0.7237368419565787d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.00000762939453d + "'", double2 == 100.00000762939453d);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-4.5035996E15f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.5035996E15f + "'", float1 == 4.5035996E15f);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.07466556700256388d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07459621024323529d) + "'", double1 == (-0.07459621024323529d));
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-5));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.21511909301433307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5991832340437723d + "'", double1 == 0.5991832340437723d);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 2147483648L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.18070977791825d + "'", double1 == 22.18070977791825d);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.862318872287684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.009430054193516519d, 0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.009430054193516519d + "'", double2 == 0.009430054193516519d);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-3.141592653577698d), 37648.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653577698d + "'", double2 == 3.141592653577698d);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(39.726213847251884d, 1.2900529801620624E20d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 39.726213847251884d + "'", double2 == 39.726213847251884d);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(58.996877293214865d, (double) 10240);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 58.99687729321487d + "'", double2 == 58.99687729321487d);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.4258213501575032E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963226725814d + "'", double1 == 1.5707963226725814d);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.126011262856224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.470961916843109d, 1.987846675914698E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.693138355419427E-18d + "'", double2 == 7.693138355419427E-18d);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.2981479726743438d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 4096, 0.1019269915497951d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4096.0d + "'", double2 == 4096.0d);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (-47));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        int int1 = org.apache.commons.math3.util.FastMath.round(0.00390625f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 6208);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6208L + "'", long1 == 6208L);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, 1.8761242229100255d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        double double2 = org.apache.commons.math3.util.FastMath.max(8.971567242793748d, 0.679522618351296d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.971567242793748d + "'", double2 == 8.971567242793748d);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-74.20321057778875d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.414240048492133E31d + "'", double1 == 8.414240048492133E31d);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(12.963213729101282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.0d + "'", double1 == 13.0d);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 4096);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(9.999978065515825E-24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.999978065515825E-24d + "'", double1 == 9.999978065515825E-24d);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 4.5035996E15f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.7615941540256079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5662191684212852d + "'", double1 == 0.5662191684212852d);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.004478358365843835d, (double) 23L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 23.0d + "'", double2 == 23.0d);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2.7755575615628914E-17d, 0.8203432320660448d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7755575615628914E-17d + "'", double2 == 2.7755575615628914E-17d);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-50.41678482966614d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-50.0d) + "'", double1 == (-50.0d));
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.4778572443836295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44577700853879687d + "'", double1 == 0.44577700853879687d);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.1353352832366127d, 3.970292057502952d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.559984735131298E-4d + "'", double2 == 3.559984735131298E-4d);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.34751057764683646d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3475105776468364d) + "'", double1 == (-0.3475105776468364d));
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        float float2 = org.apache.commons.math3.util.FastMath.max(5.0000005f, 0.99999994f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0000005f + "'", float2 == 5.0000005f);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.046656872728509685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04662304696317265d + "'", double1 == 0.04662304696317265d);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        double double2 = org.apache.commons.math3.util.FastMath.pow(41.903161481023d, 1.0175545319252317d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 44.742945770445154d + "'", double2 == 44.742945770445154d);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.5514266812416906d, 21.164088169838596d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.026048934789964995d + "'", double2 == 0.026048934789964995d);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.001739547024314626d, 9.587379894910212E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0017421870264488835d + "'", double2 == 0.0017421870264488835d);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.011377788717773904d), (-4.375d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.011377788717773904d) + "'", double2 == (-0.011377788717773904d));
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.15683098746077087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15748111057722322d + "'", double1 == 0.15748111057722322d);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        int int1 = org.apache.commons.math3.util.FastMath.round(4.8828125E-4f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 57, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.29583625524354545d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-7.8683390140765455E-19d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.8683390140765455E-19d) + "'", double1 == (-7.8683390140765455E-19d));
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        long long1 = org.apache.commons.math3.util.FastMath.round((-7.105427357601027E-15d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.4245783453278988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1323002075191344d + "'", double1 == 1.1323002075191344d);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        double double1 = org.apache.commons.math3.util.FastMath.signum(12.963213729101282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) (-6.0000005f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-2147483648), (float) 4096);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4096.0f + "'", float2 == 4096.0f);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.6256632450775597d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6672894683293485d) + "'", double1 == (-0.6672894683293485d));
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.364242E-12f, 5.485720850016558E-10d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3642422E-12f + "'", float2 == 1.3642422E-12f);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 96.99999f, 0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 36.34183433862237d + "'", double2 == 36.34183433862237d);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        float float1 = org.apache.commons.math3.util.FastMath.signum(2.34187198E17f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.0885816328207447d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08869752394637864d) + "'", double1 == (-0.08869752394637864d));
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 1, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.9966089419888077d, 1.1129900353232502d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.11638109333444258d) + "'", double2 == (-0.11638109333444258d));
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.07074101207510715d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07336779761599267d) + "'", double1 == (-0.07336779761599267d));
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.9147226107566936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.40974502154654d + "'", double1 == 52.40974502154654d);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.6508453542261259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5012874926078866d + "'", double1 == 0.5012874926078866d);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.33656885961385924d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 19121396171L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.67407376345184d + "'", double1 == 23.67407376345184d);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-40), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.0d) + "'", double2 == (-40.0d));
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        int int2 = org.apache.commons.math3.util.FastMath.min((-41), 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-41) + "'", int2 == (-41));
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.9619293889805304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.616740316021936d + "'", double1 == 2.616740316021936d);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-1.6668288393884205d), 0.9999999999999981d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6668288393884205d + "'", double2 == 1.6668288393884205d);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.3440585709080487E43d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        int int2 = org.apache.commons.math3.util.FastMath.min(127, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.192093E-7f, 178.72171540421934d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1920932E-7f + "'", float2 == 1.1920932E-7f);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        int int2 = org.apache.commons.math3.util.FastMath.max(20, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.0689622149987218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0690169939145268d + "'", double1 == 0.0690169939145268d);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-7.436895187235117E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5715400163821727d + "'", double1 == 1.5715400163821727d);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.5163575235272857E305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-5), 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(48.499996f, (float) (-4503599627370496L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-48.499996f) + "'", float2 == (-48.499996f));
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.22429382749098223d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        float float2 = org.apache.commons.math3.util.FastMath.max(4.8828125E-4f, 20.000002f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20.000002f + "'", float2 == 20.000002f);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.570796446004186d, 0.8813735870195445d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796446004186d + "'", double2 == 1.570796446004186d);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 97.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383449299268079E42d + "'", double1 == 1.3383449299268079E42d);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        float float1 = org.apache.commons.math3.util.FastMath.signum(4.5474746E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-3.1222300395979996d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2608358784543643d) + "'", double1 == (-1.2608358784543643d));
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        double double1 = org.apache.commons.math3.util.FastMath.sin(221206.6960055904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7669541186975021d + "'", double1 == 0.7669541186975021d);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        long long1 = org.apache.commons.math3.util.FastMath.round(4.999999523164297d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.477888730288475d + "'", double1 == 2.477888730288475d);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        double double2 = org.apache.commons.math3.util.FastMath.pow(6.830189170012752E-6d, (-0.03490658295929199d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5146500459630126d + "'", double2 == 1.5146500459630126d);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        float float2 = org.apache.commons.math3.util.FastMath.min(127.0f, (float) 4609435868686548992L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 127.0f + "'", float2 == 127.0f);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        double double2 = org.apache.commons.math3.util.FastMath.max(184.91157758310626d, 343.77467707849394d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 343.77467707849394d + "'", double2 == 343.77467707849394d);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.4778572443836295d, (double) (-23));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 23.004963541505774d + "'", double2 == 23.004963541505774d);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        double double1 = org.apache.commons.math3.util.FastMath.abs(8.318010277546872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.318010277546872d + "'", double1 == 8.318010277546872d);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(97.0f, (double) 10.000001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 96.99999f + "'", float2 == 96.99999f);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0017421870264488835d, 6.0744591563843855d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0017421870264488837d + "'", double2 == 0.0017421870264488837d);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        double double1 = org.apache.commons.math3.util.FastMath.floor(10.040749952147157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.8382668271306453E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42875.01401901398d + "'", double1 == 42875.01401901398d);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) '4', 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(51.999996f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        float float2 = org.apache.commons.math3.util.FastMath.min((-48.499996f), (float) 7L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-48.499996f) + "'", float2 == (-48.499996f));
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 100.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(3.8146899896858897E-6d, (-0.7995660637267406d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8146899896858893E-6d + "'", double2 == 3.8146899896858893E-6d);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(7.896280957292919E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.89628095729292E13d + "'", double1 == 7.89628095729292E13d);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-1), (long) 15);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.3869694069128182d, (-5));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.002243590697762415d + "'", double2 == 0.002243590697762415d);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        long long2 = org.apache.commons.math3.util.FastMath.min(3L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        long long2 = org.apache.commons.math3.util.FastMath.min(57L, (-5L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.036241972554485795d), 1.0010886293480585d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-5L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(3.970291985527539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-1.998096277817887d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        double double1 = org.apache.commons.math3.util.FastMath.rint(3.4965075614664802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 57L, (-8.042848410283348d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7000611280165643d + "'", double2 == 0.7000611280165643d);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.31036104568165535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0054168221170774146d + "'", double1 == 0.0054168221170774146d);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4436354751788103d + "'", double1 == 1.4436354751788103d);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 20, 223.47899536523738d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20.000002f + "'", float2 == 20.000002f);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-50.41678482966614d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-50.416784829666135d) + "'", double1 == (-50.416784829666135d));
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.2415914299460307E-13d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-43) + "'", int1 == (-43));
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, 2.34187215E17f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.34187215E17f + "'", float2 == 2.34187215E17f);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.0030543046677571d, 32768);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        double double2 = org.apache.commons.math3.util.FastMath.min(7.8972863173864525d, 1.5501806885958198d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5501806885958198d + "'", double2 == 1.5501806885958198d);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.010200777470529932d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010200423675724124d + "'", double1 == 0.010200423675724124d);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.011550867537013974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 6208.0005f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6208.00048828125d + "'", double1 == 6208.00048828125d);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 57, (long) (-18));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(7.957135859585879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7711415651109443d + "'", double1 == 2.7711415651109443d);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        double double1 = org.apache.commons.math3.util.FastMath.floor(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.465190328815662E-32d + "'", double1 == 2.465190328815662E-32d);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.342161576411106E-5d, (-0.7419819752357887d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2726.8473976782693d + "'", double2 == 2726.8473976782693d);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.9280538062512563d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.335442656797612d + "'", double1 == 1.335442656797612d);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        double double1 = org.apache.commons.math3.util.FastMath.floor(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        long long2 = org.apache.commons.math3.util.FastMath.max(2L, (-4503599627370496L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(2.0000002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0000005f + "'", float1 == 2.0000005f);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-40));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40 + "'", int1 == 40);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 4.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7568024953079282d) + "'", double1 == (-0.7568024953079282d));
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(3.4359738E10f, 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.8719477E10f + "'", float2 == 6.8719477E10f);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 48.499992f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.964193590833434d + "'", double1 == 6.964193590833434d);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        double double1 = org.apache.commons.math3.util.FastMath.tan(8.414240048492133E31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.00818538581289952d) + "'", double1 == (-0.00818538581289952d));
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2153.28968210235d, 4.375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5687645546574924d + "'", double2 == 1.5687645546574924d);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.17540341900446973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17540341900446976d + "'", double1 == 0.17540341900446976d);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-2.726510528000143d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.672461924684508d + "'", double1 == 7.672461924684508d);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 100L, (-6));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5625f + "'", float2 == 1.5625f);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.7111977130787057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012412741725877353d + "'", double1 == 0.012412741725877353d);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        int int1 = org.apache.commons.math3.util.FastMath.abs(6208);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6208 + "'", int1 == 6208);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.7852981633977816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9225959148113836d + "'", double1 == 0.9225959148113836d);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(4.15912713462618d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 32, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.8813735870195445d, (double) 32768L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8813735870195446d + "'", double2 == 0.8813735870195446d);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        double double1 = org.apache.commons.math3.util.FastMath.cos(7.330790212754673E148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8026817217694402d) + "'", double1 == (-0.8026817217694402d));
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        int int2 = org.apache.commons.math3.util.FastMath.min(20, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-4096.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 127.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.026525795967933d + "'", double1 == 5.026525795967933d);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, (double) 20);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-1.2057514536482425d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.021044332826869627d) + "'", double1 == (-0.021044332826869627d));
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 51.999996f, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 51.999996185302734d + "'", double2 == 51.999996185302734d);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.6991118430775187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.47381472041445116d) + "'", double1 == (-0.47381472041445116d));
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 1.9073486E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2351647362715017E-22d + "'", double1 == 4.2351647362715017E-22d);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1024.0d, (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.765625E-4d + "'", double2 == 9.765625E-4d);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.08942837070713458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08966792038047539d + "'", double1 == 0.08966792038047539d);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.9999935791925075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414675156134572d + "'", double1 == 0.8414675156134572d);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        float float2 = org.apache.commons.math3.util.FastMath.max(5.0000005f, (-63.999996f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0000005f + "'", float2 == 5.0000005f);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-20));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 20.0f + "'", float1 == 20.0f);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(127.00001f, 0.473814720414451d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 127.0f + "'", float2 == 127.0f);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        int int2 = org.apache.commons.math3.util.FastMath.max(97, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.05761413798165514d, (-0.47381472041445116d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.05761413798165514d + "'", double2 == 0.05761413798165514d);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(3.8146899896858897E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8146827137745345E-6d + "'", double1 == 3.8146827137745345E-6d);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        double double1 = org.apache.commons.math3.util.FastMath.tan(3.4972095184551337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37140692824026045d + "'", double1 == 0.37140692824026045d);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        double double1 = org.apache.commons.math3.util.FastMath.tan(96.99999237060547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4103302129827671d) + "'", double1 == (-0.4103302129827671d));
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        long long2 = org.apache.commons.math3.util.FastMath.max(4096L, (long) (-41));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4096L + "'", long2 == 4096L);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.8813735870195429d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.7182816664368272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 98.45028750153611d + "'", double1 == 98.45028750153611d);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.2928018131467037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30146666304021763d + "'", double1 == 0.30146666304021763d);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        double double1 = org.apache.commons.math3.util.FastMath.tan(6208.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21619335216456886d + "'", double1 == 0.21619335216456886d);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.342161576411106E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004839588387880839d + "'", double1 == 0.004839588387880839d);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-40.63159692392033d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        int int1 = org.apache.commons.math3.util.FastMath.round(19.999998f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.7422546989427482d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7422546989427481d) + "'", double1 == (-0.7422546989427481d));
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(51.999996f, 4.60497014597542d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.999992f + "'", float2 == 51.999992f);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.4103302129827671d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4228161333483835d) + "'", double1 == (-0.4228161333483835d));
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        double double1 = org.apache.commons.math3.util.FastMath.floor(365942.161553766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 365942.0d + "'", double1 == 365942.0d);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.059306170823242965d, 2.342161576411106E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.05930617082324296d + "'", double2 == 0.05930617082324296d);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(13.000003f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13.000003f + "'", float2 == 13.000003f);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.4258213501575032E8d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.821637045374455E-17d) + "'", double1 == (-4.821637045374455E-17d));
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) '#', 2.4968538574062324d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 34.999996f + "'", float2 == 34.999996f);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.4658842241887455d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-1023.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.07608628613008d) + "'", double1 == (-10.07608628613008d));
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(97.00337450631281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6930282706802875d + "'", double1 == 1.6930282706802875d);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.00628569302695887d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.00628577581071199d) + "'", double1 == (-0.00628577581071199d));
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        double double1 = org.apache.commons.math3.util.FastMath.log10(61.48000813767197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.788733916312187d + "'", double1 == 1.788733916312187d);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        double double1 = org.apache.commons.math3.util.FastMath.atan(234.24476918014662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5665273139641338d + "'", double1 == 1.5665273139641338d);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-6L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        double double1 = org.apache.commons.math3.util.FastMath.cos(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09711515743188391d) + "'", double1 == (-0.09711515743188391d));
    }
}

