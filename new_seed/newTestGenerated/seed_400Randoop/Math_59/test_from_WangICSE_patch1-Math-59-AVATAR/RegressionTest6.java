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
        long long2 = org.apache.commons.math.util.FastMath.max(5L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8721824073781502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1905871603838296d + "'", double1 == 1.1905871603838296d);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 51L, 1.0713634642907175d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5497922893701128d + "'", double2 == 1.5497922893701128d);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.104278850811079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
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
        double double2 = org.apache.commons.math.util.FastMath.min((-0.4129701157116966d), 10.017874927409903d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4129701157116966d) + "'", double2 == (-0.4129701157116966d));
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
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) (short) 1, 0.8137894696727874d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999999999d + "'", double2 == 0.9999999999999999d);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.837589179357618E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.837589179357618E-15d + "'", double1 == 1.837589179357618E-15d);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9562562360485877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.671032563057712d + "'", double1 == 0.671032563057712d);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        double double1 = org.apache.commons.math.util.FastMath.floor(38.8629167984213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.0d + "'", double1 == 38.0d);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 1, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9454760404994205d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3884945877179433d + "'", double1 == 0.3884945877179433d);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7869557758875051d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.7771308193574424E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.773775678340353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3376337436860346d + "'", double1 == 1.3376337436860346d);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.05139217630949651d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        double double1 = org.apache.commons.math.util.FastMath.signum(20.049875621120893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9999984298108128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931463954650435d + "'", double1 == 0.6931463954650435d);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9058595173841506d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.9925591367766535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6900198725289799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8306743480624521d + "'", double1 == 0.8306743480624521d);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.295214085529645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0724898276058306d + "'", double1 == 2.0724898276058306d);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, 6559L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6559L + "'", long2 == 6559L);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.7798578119818305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6526250861683623d) + "'", double1 == (-0.6526250861683623d));
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(6.17645900500726E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08516213117310048d + "'", double1 == 0.08516213117310048d);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0470063958937448d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 1, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.2240401467946807d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.2565251565229352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2565251565229353d + "'", double1 == 0.2565251565229353d);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.40517925701617413d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5707963267948712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5374317301410937E-14d + "'", double1 == 2.5374317301410937E-14d);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(14.389377026852705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.793333234353753d + "'", double1 == 3.793333234353753d);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8058302155599488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.373400766945016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        long long1 = org.apache.commons.math.util.FastMath.abs(51L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 51L + "'", long1 == 51L);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.2073305257621814d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-2.3079900213234987E-5d), 1.7580423413226773d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.3079900213234984E-5d) + "'", double2 == (-2.3079900213234984E-5d));
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        double double2 = org.apache.commons.math.util.FastMath.min(0.010468440224097982d, 2.106250657255404d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.010468440224097982d + "'", double2 == 0.010468440224097982d);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        float float2 = org.apache.commons.math.util.FastMath.max(9.223372E18f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.48706190399811883d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.45188139334621774d) + "'", double1 == (-0.45188139334621774d));
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.5160141294778328d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.40310504119931384d) + "'", double1 == (-0.40310504119931384d));
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.746501045726147d + "'", double1 == 4.746501045726147d);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7855030675432709d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9035086050663308d + "'", double1 == 0.9035086050663308d);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        double double1 = org.apache.commons.math.util.FastMath.ceil(9.999999995877692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        double double1 = org.apache.commons.math.util.FastMath.asin(7.635078747156649E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.635078747156649E-9d + "'", double1 == 7.635078747156649E-9d);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        double double1 = org.apache.commons.math.util.FastMath.floor(1735.209878559419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1735.0d + "'", double1 == 1735.0d);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.13355056135114904d, 3.7581226324091723d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13355056135114907d + "'", double2 == 0.13355056135114907d);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6020907673908776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.49725985529026d + "'", double1 == 34.49725985529026d);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.7757395863495598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5635488491325358d + "'", double1 == 1.5635488491325358d);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.9231784609934364d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.8540342600388389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9601555807827855d + "'", double1 == 0.9601555807827855d);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.5251431659552352d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0358050874256768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5370437824787192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.3371848034806941d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3967916312027995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 80.0302653271142d + "'", double1 == 80.0302653271142d);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.9830700822184464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15785947541393264d + "'", double1 == 0.15785947541393264d);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-2.0d), 6.890818211544855E11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.9024129480722718E-12d) + "'", double2 == (-2.9024129480722718E-12d));
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        int int2 = org.apache.commons.math.util.FastMath.max(2005, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2005 + "'", int2 == 2005);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.24395830743395697d, 0.6423001758318426d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.36298951511785643d + "'", double2 == 0.36298951511785643d);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9033391107665127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.467829725531415d + "'", double1 == 1.467829725531415d);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.930313428991271d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5287499284227857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5067775983634798d + "'", double1 == 0.5067775983634798d);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.2261911708835171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8002921300658523d + "'", double1 == 0.8002921300658523d);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9955758626477091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7062823395533953d + "'", double1 == 1.7062823395533953d);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        double double2 = org.apache.commons.math.util.FastMath.max(3.748066027288565E7d, (-0.9952731515503573d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.748066027288565E7d + "'", double2 == 3.748066027288565E7d);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8058302155599488d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        long long1 = org.apache.commons.math.util.FastMath.round(7871.825828205634d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7872L + "'", long1 == 7872L);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.28748675692952264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27993759046301575d + "'", double1 == 0.27993759046301575d);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.5160141294778328d), 0.9234637104758648d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9234637104758648d + "'", double2 == 0.9234637104758648d);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 100, 3280L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3280L + "'", long2 == 3280L);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.9115473323121701d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 32);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7677926132124684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8753887210506733d + "'", double1 == 0.8753887210506733d);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        double double2 = org.apache.commons.math.util.FastMath.max((double) (byte) -1, 1.1015071856306502d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1015071856306502d + "'", double2 == 1.1015071856306502d);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5.244348724433776E63d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9298471527633106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.276317445594024d + "'", double1 == 53.276317445594024d);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5567229026732161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0115210545205378d + "'", double1 == 1.0115210545205378d);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.23606797749979d + "'", double1 == 2.23606797749979d);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549503d + "'", double1 == 1.5574077246549503d);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9008481395968395d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8253695151090449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7347984691439217d + "'", double1 == 0.7347984691439217d);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9999999535225788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574075654456325d + "'", double1 == 1.5574075654456325d);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 2);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9730337692042502d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8265969029962065d) + "'", double1 == (-0.8265969029962065d));
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.008837977760189355d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.00883820788201599d) + "'", double1 == (-0.00883820788201599d));
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8624815133123458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6975340031826087d + "'", double1 == 0.6975340031826087d);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6017821704857126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        double double1 = org.apache.commons.math.util.FastMath.log(1.7715216602443775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5718388723129227d + "'", double1 == 0.5718388723129227d);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.0634370688955608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6017821704857126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6867563081498395d + "'", double1 == 0.6867563081498395d);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9683140799247235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5066117617628818d + "'", double1 == 1.5066117617628818d);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5553480614894135d + "'", double1 == 3.5553480614894135d);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.535680137218971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9999009710012459d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999900971001246d + "'", double1 == 0.999900971001246d);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.7715216602443777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.298342365610589d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5534301753820028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998492121821989d + "'", double1 == 0.9998492121821989d);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.14287905018325442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5227846790767261d + "'", double1 == 0.5227846790767261d);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 4L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        double double1 = org.apache.commons.math.util.FastMath.tanh(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        long long1 = org.apache.commons.math.util.FastMath.abs(7872L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7872L + "'", long1 == 7872L);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.010308730564481918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01030873056448192d + "'", double1 == 0.01030873056448192d);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.4748273059530623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 199.0929391679245d + "'", double1 == 199.0929391679245d);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.8809094881441943E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8923318358371681d) + "'", double1 == (-0.8923318358371681d));
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 2.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9640275800758169d + "'", double1 == 0.9640275800758169d);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5403023023993377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4953672865336895d + "'", double1 == 0.4953672865336895d);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.814697265625E-6d + "'", double1 == 3.814697265625E-6d);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.75d + "'", double1 == 0.75d);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5607088415259998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.42202966819183d + "'", double1 == 89.42202966819183d);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52, 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        float float2 = org.apache.commons.math.util.FastMath.max(36.0f, (float) 78962960182681L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.8962957E13f + "'", float2 == 7.8962957E13f);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.22517783153706364d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.22906252487991952d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0263497319331099d + "'", double1 == 1.0263497319331099d);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.7430987570063676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8451677598626034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1272994544561892d + "'", double1 == 1.1272994544561892d);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        double double1 = org.apache.commons.math.util.FastMath.sin(5.362545819211763E122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5057720758044307d + "'", double1 == 0.5057720758044307d);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        double double1 = org.apache.commons.math.util.FastMath.abs(22.24871540768837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.24871540768837d + "'", double1 == 22.24871540768837d);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6219097454839793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        long long2 = org.apache.commons.math.util.FastMath.min(3280L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.8451846157611319d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8451846157611319d + "'", double1 == 0.8451846157611319d);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.5063656411097466d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0918040996853897d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17453292519943295d + "'", double1 == 0.17453292519943295d);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.04147022652343259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.041482114154463165d + "'", double1 == 0.041482114154463165d);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        double double1 = org.apache.commons.math.util.FastMath.sinh(8.119741647423155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1680.0761156309295d + "'", double1 == 1680.0761156309295d);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.3124383412727525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7373603731804845d + "'", double1 == 0.7373603731804845d);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.671032563057712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5856586910882368d + "'", double1 == 0.5856586910882368d);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 78962960182681L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42901.69723267153d + "'", double1 == 42901.69723267153d);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5607088415259998d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4640783251232936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025552987280485488d + "'", double1 == 0.025552987280485488d);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.373400766945016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        double double1 = org.apache.commons.math.util.FastMath.tan(7.458883652534391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.39792714116487d + "'", double1 == 2.39792714116487d);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        int int2 = org.apache.commons.math.util.FastMath.min(97, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.1344439571520295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1336397384090254d + "'", double1 == 0.1336397384090254d);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        double double1 = org.apache.commons.math.util.FastMath.abs(18936.71296522655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18936.71296522655d + "'", double1 == 18936.71296522655d);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(9.306852817378903d, 4.644483341943245d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.306852817378902d + "'", double2 == 9.306852817378902d);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.05593807141461213d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.5701287081656914d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.009529184458135626d, 3.239582291948687d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8378193262057857E-7d + "'", double2 == 2.8378193262057857E-7d);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5604872310455469d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 52);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        double double1 = org.apache.commons.math.util.FastMath.log(0.3254103039381046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1226684192464662d) + "'", double1 == (-1.1226684192464662d));
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.03517713864733436d), 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.03517713864733436d) + "'", double2 == (-0.03517713864733436d));
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        double double1 = org.apache.commons.math.util.FastMath.tan(8.692617836018588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8988151898170457d) + "'", double1 == (-0.8988151898170457d));
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2261911708835174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414709848078966d + "'", double1 == 0.8414709848078966d);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        double double1 = org.apache.commons.math.util.FastMath.log(2.786083656729492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0246369024478919d + "'", double1 == 1.0246369024478919d);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.2073305257621814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        double double2 = org.apache.commons.math.util.FastMath.max(503.55674565883726d, (-7.47197233734299E-43d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 503.55674565883726d + "'", double2 == 503.55674565883726d);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        double double1 = org.apache.commons.math.util.FastMath.cos(51.68668337796996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14903806966647556d + "'", double1 == 0.14903806966647556d);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9955758626477091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0558063149039283d + "'", double1 == 3.0558063149039283d);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.7621956910836314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        double double1 = org.apache.commons.math.util.FastMath.rint(10.049875621120892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 4, (long) 2005);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2005L + "'", long2 == 2005L);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5856586910882368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        int int1 = org.apache.commons.math.util.FastMath.round(4.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        double double2 = org.apache.commons.math.util.FastMath.min(0.3884945877179433d, 0.6872483617622163d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3884945877179433d + "'", double2 == 0.3884945877179433d);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9914978027470505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7281588344338537d + "'", double1 == 2.7281588344338537d);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        int int2 = org.apache.commons.math.util.FastMath.max(32, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.3796077390275217d, 3.7452953479050968d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.10101093570532195d + "'", double2 == 0.10101093570532195d);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.219379580148095d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6975340031826087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6975340031826088d + "'", double1 == 0.6975340031826088d);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.22517783153706364d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22331704219228246d) + "'", double1 == (-0.22331704219228246d));
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.009528679807730494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        float float1 = org.apache.commons.math.util.FastMath.abs(3.9481478E13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.9481478E13f + "'", float1 == 3.9481478E13f);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.999999999733659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414709846639918d + "'", double1 == 0.8414709846639918d);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 4, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 6559.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 80.98765338000602d + "'", double1 == 80.98765338000602d);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5337813023984244d, 3.082130173350885d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17148487338673088d + "'", double2 == 0.17148487338673088d);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0613810862211954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8151660481819129d + "'", double1 == 0.8151660481819129d);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        double double1 = org.apache.commons.math.util.FastMath.log10(8.512599360064637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9300621940868865d + "'", double1 == 0.9300621940868865d);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.9155445780598082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0246369024478919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7717484403546819d + "'", double1 == 0.7717484403546819d);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.000000000000001d, 0.14191465995125369d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5424210127993572d + "'", double2 == 1.5424210127993572d);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        double double2 = org.apache.commons.math.util.FastMath.min(4.6151205168412615d, 0.8524543594406487d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8524543594406487d + "'", double2 == 0.8524543594406487d);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        int int2 = org.apache.commons.math.util.FastMath.max(2005, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2005 + "'", int2 == 2005);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.0343154071137053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.035505501878183035d + "'", double1 == 0.035505501878183035d);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.239582291948687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.523058333449637d + "'", double1 == 25.523058333449637d);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        int int1 = org.apache.commons.math.util.FastMath.abs(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.28366218546322625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5585053606381855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5585053606381856d + "'", double1 == 0.5585053606381856d);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.4274266235030733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9596936803142382d + "'", double1 == 0.9596936803142382d);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.6003344910765165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5782592216805864d + "'", double1 == 2.5782592216805864d);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        double double2 = org.apache.commons.math.util.FastMath.min(4.295214085529645d, 0.29655427201849516d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.29655427201849516d + "'", double2 == 0.29655427201849516d);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        double double1 = org.apache.commons.math.util.FastMath.cos(7.126523892887822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6649730557631149d + "'", double1 == 0.6649730557631149d);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.09808293184436E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0980829010588262E-4d + "'", double1 == 2.0980829010588262E-4d);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        int int2 = org.apache.commons.math.util.FastMath.min(4, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        long long2 = org.apache.commons.math.util.FastMath.min(3280L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        double double1 = org.apache.commons.math.util.FastMath.exp(105049.8032003758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438014d) + "'", double1 == (-1.1752011936438014d));
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8259324122591327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1912423341611753d) + "'", double1 == (-0.1912423341611753d));
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.2966885710872325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3010603925610111d + "'", double1 == 0.3010603925610111d);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1834.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42.82522621072771d + "'", double1 == 42.82522621072771d);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.24395830743395697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24395830743395697d + "'", double1 == 0.24395830743395697d);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.5877618172544402d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.07270966677774478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0701878462127337d + "'", double1 == 0.0701878462127337d);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.9002193888246004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.946229138796503d + "'", double1 == 0.946229138796503d);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        float float2 = org.apache.commons.math.util.FastMath.max(4.0f, (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(8.788723182374374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.063677972537624d + "'", double1 == 2.063677972537624d);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 2.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0580782213705773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7849272209484637d + "'", double1 == 0.7849272209484637d);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9676589901702034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5672290459474861d + "'", double1 == 0.5672290459474861d);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1555698629817919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06279620701139618d + "'", double1 == 0.06279620701139618d);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0584580199563727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4902166548761301d + "'", double1 == 0.4902166548761301d);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.999848038217972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615303285199447d + "'", double1 == 0.7615303285199447d);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 100.0f, 0.18650080065297936d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5689313209506868d + "'", double2 == 1.5689313209506868d);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(32.292251375478514d, 0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.29225137547851d + "'", double2 == 32.29225137547851d);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        double double1 = org.apache.commons.math.util.FastMath.cosh(19.085536923187668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.721054416662316E7d + "'", double1 == 9.721054416662316E7d);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        int int2 = org.apache.commons.math.util.FastMath.min(97, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5507969934215644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7152266900892013d + "'", double1 == 3.7152266900892013d);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        long long2 = org.apache.commons.math.util.FastMath.max(78962960182681L, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 78962960182681L + "'", long2 == 78962960182681L);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.6536436208636119d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7123889803846899d) + "'", double1 == (-0.7123889803846899d));
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9917933885729989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8370086477683244d + "'", double1 == 0.8370086477683244d);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0002098303044837d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.1226744880631757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1226744880631757d + "'", double1 == 0.1226744880631757d);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.02048526137339397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.5646454682250392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9882281837083275d + "'", double1 == 0.9882281837083275d);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0393768734000801d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01677304934804084d + "'", double1 == 0.01677304934804084d);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8058302155599485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2385542100998914d + "'", double1 == 2.2385542100998914d);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        float float1 = org.apache.commons.math.util.FastMath.abs(13.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 13.0f + "'", float1 == 13.0f);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9795918367346939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20237568556709695d + "'", double1 == 0.20237568556709695d);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.0384003448748685E38d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.9999999958776928d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6189908924466622d, 1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948963d + "'", double2 == 1.5707963267948963d);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0030319595626882427d, 20.085536923187668d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5095237688959358E-4d + "'", double2 == 1.5095237688959358E-4d);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        long long2 = org.apache.commons.math.util.FastMath.max(13L, 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0203763146052207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.020376314605221d + "'", double1 == 1.020376314605221d);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.7757395863495598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06589908747968856d + "'", double1 == 0.06589908747968856d);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.009483282630450406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999550340122696d + "'", double1 == 0.9999550340122696d);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 6559L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6559L + "'", long1 == 6559L);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5607966601082317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000323d + "'", double1 == 100.00000000000323d);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.24769059955591424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49768524144876375d + "'", double1 == 0.49768524144876375d);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        double double1 = org.apache.commons.math.util.FastMath.acos(123.44001497540268d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0038696050023175d, 1.8788470742801933d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0038696050023177d + "'", double2 == 1.0038696050023177d);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7053686466330484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7053686466330485d + "'", double1 == 0.7053686466330485d);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7878677702215401d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.642227864217147d), (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.642227864217147d) + "'", double2 == (-0.642227864217147d));
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.017097102876679145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017244094857510165d + "'", double1 == 0.017244094857510165d);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.22899890530590894d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22700267719769052d) + "'", double1 == (-0.22700267719769052d));
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.8540342600388389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.27106631018859d + "'", double1 == 3.27106631018859d);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.5063656411097465d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5282839739597386d) + "'", double1 == (-0.5282839739597386d));
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.1472859194620699d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14728591946206993d + "'", double1 == 0.14728591946206993d);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7762148545604776d, 0.6189908924466622d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8976134920167367d + "'", double2 == 0.8976134920167367d);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.23886037395044873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.685691320277302d + "'", double1 == 13.685691320277302d);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        double double1 = org.apache.commons.math.util.FastMath.log1p(5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8402864822065015d + "'", double1 == 1.8402864822065015d);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.5701287081656916d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        double double1 = org.apache.commons.math.util.FastMath.log10(7.04395999972525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8478168810902531d + "'", double1 == 0.8478168810902531d);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.6977688890979814E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999999931632527d + "'", double1 == 0.999999931632527d);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9506431907144247d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.0278589874552748d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        int int2 = org.apache.commons.math.util.FastMath.min(100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.9943400969063074d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9066335230777041d, 3.793333234353753d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9066335230777042d + "'", double2 == 0.9066335230777042d);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3042395695680862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7067535536595153d + "'", double1 == 1.7067535536595153d);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7595020127952743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.7031839360032603E-108d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7031839360032603E-108d) + "'", double1 == (-1.7031839360032603E-108d));
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        double double1 = org.apache.commons.math.util.FastMath.tanh(38.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9298471527633106d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8253695151090449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.970856367774133d + "'", double1 == 0.970856367774133d);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6219097454839793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 10, (float) 2005);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2005.0f + "'", float2 == 2005.0f);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.762747174039086d + "'", double1 == 1.762747174039086d);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        long long2 = org.apache.commons.math.util.FastMath.max(5L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9912009623635004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7578739517386045d + "'", double1 == 0.7578739517386045d);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.238693057170856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9775291852754583d + "'", double1 == 0.9775291852754583d);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 78962960182681L, 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.8962957E13f + "'", float2 == 7.8962957E13f);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.466704833957299d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 100, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        double double2 = org.apache.commons.math.util.FastMath.min(0.37287332357954484d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.01677304934804084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1295108078425922d + "'", double1 == 0.1295108078425922d);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7849272209484637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        float float2 = org.apache.commons.math.util.FastMath.min(4.0f, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.4920344106948838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.635640401759678d + "'", double1 == 1.635640401759678d);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.3440585709083352E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        double double1 = org.apache.commons.math.util.FastMath.log(32.29225137547851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.474827305953062d + "'", double1 == 3.474827305953062d);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52, (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.5553480614894135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.99836867862969d + "'", double1 == 0.99836867862969d);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        double double1 = org.apache.commons.math.util.FastMath.sin(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8052085614665847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8362763531273804d, 1.1555698629817919d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1555698629817919d + "'", double2 == 1.1555698629817919d);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        int int2 = org.apache.commons.math.util.FastMath.min(100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3205004784536853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.739146853975915d + "'", double1 == 1.739146853975915d);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9795918367346939d, (-1.139171425638416d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9795918367346937d + "'", double2 == 0.9795918367346937d);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.435403483148737d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6598511068026915d + "'", double1 == 0.6598511068026915d);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567154E14d + "'", double1 == 7.930067261567154E14d);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.4148895340330202d, (double) 3);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13742481004290297d + "'", double2 == 0.13742481004290297d);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32L, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.4748273059530623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.027969265740413d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9999893299850897d, 1.8402864822065015d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4977525408008414d + "'", double2 == 0.4977525408008414d);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        double double2 = org.apache.commons.math.util.FastMath.atan2(34.999999999999886d, (-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5972229600067989d + "'", double2 == 1.5972229600067989d);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        double double1 = org.apache.commons.math.util.FastMath.ulp(11013.232920103324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8189894035458565E-12d + "'", double1 == 1.8189894035458565E-12d);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.6908443102518884d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.231690697458971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.13025531550365874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1224435501265828d + "'", double1 == 0.1224435501265828d);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        long long1 = org.apache.commons.math.util.FastMath.round(1.457501399486101d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5501702829958329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5825681430865692d + "'", double1 == 0.5825681430865692d);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0001181575986342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5402028759058466d + "'", double1 == 0.5402028759058466d);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6020907673908776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6391335074803455d + "'", double1 == 0.6391335074803455d);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        int int2 = org.apache.commons.math.util.FastMath.min(1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1680.0761156309295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.119741647423155d + "'", double1 == 8.119741647423155d);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        double double1 = org.apache.commons.math.util.FastMath.sin(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, 7872L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9032560372034026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.443498367137542d + "'", double1 == 0.443498367137542d);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (short) -1, 2.6503846142007115d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.85186683311429d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3608331393357123d + "'", double1 == 1.3608331393357123d);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.9088339535934726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(47.7974777282436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2738.593745198908d + "'", double1 == 2738.593745198908d);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.24769059955591424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.020377724655755693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14275056796999336d + "'", double1 == 0.14275056796999336d);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5672290459474861d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.675894270215288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17012123520235736d) + "'", double1 == (-0.17012123520235736d));
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-3.966092663504925d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        long long2 = org.apache.commons.math.util.FastMath.max(2147483647L, 3280L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        double double1 = org.apache.commons.math.util.FastMath.acosh(42.81354925721529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.44986538813437d + "'", double1 == 4.44986538813437d);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3458247401995457E41d + "'", double1 == 2.3458247401995457E41d);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        double double1 = org.apache.commons.math.util.FastMath.ulp(22.24871540768837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5209620005493156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2063348770899864d + "'", double1 == 1.2063348770899864d);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.5309649148733837d), 526.8331299048269d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.5282839739597525d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5896158982755639d + "'", double1 == 0.5896158982755639d);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2334031175112035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.30113949866026923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26324041796387243d + "'", double1 == 0.26324041796387243d);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        long long1 = org.apache.commons.math.util.FastMath.round(2.914747959740454d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        long long1 = org.apache.commons.math.util.FastMath.round(2.702048418162471d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5057720758044307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46664446687876304d + "'", double1 == 0.46664446687876304d);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5604872310455469d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.40933232296601d + "'", double1 == 89.40933232296601d);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        long long1 = org.apache.commons.math.util.FastMath.abs(36L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36L + "'", long1 == 36L);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.644483341943245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.00961449578338d + "'", double1 == 104.00961449578338d);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.09711515743188391d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        double double2 = org.apache.commons.math.util.FastMath.min(7.922473906616227E-4d, 7.046745412134694E21d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.922473906616227E-4d + "'", double2 == 7.922473906616227E-4d);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.15785947541393264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002755167601444163d + "'", double1 == 0.002755167601444163d);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.1010569721060828d), 0.2966885710872325d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7523557927644398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6365522825478772d + "'", double1 == 0.6365522825478772d);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 5, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5585053606381856d, 0.5067775983634798d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8339178207386727d + "'", double2 == 0.8339178207386727d);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.138288992714996d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1189396031849521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5718388723129227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45224619022500656d + "'", double1 == 0.45224619022500656d);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.15689504851398525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15562022042706086d + "'", double1 == 0.15562022042706086d);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        float float2 = org.apache.commons.math.util.FastMath.min(6559.0f, (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5514266812416906d + "'", double1 == 0.5514266812416906d);
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
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        int int2 = org.apache.commons.math.util.FastMath.min(4, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.5085350159312789d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5085350159312788d) + "'", double1 == (-0.5085350159312788d));
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.034776717477448635d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.129830963909753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 32, 1.5735827215807552d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.003027381705607183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0030228084133541687d + "'", double1 == 0.0030228084133541687d);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.5534301753820028d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7884788267086713d) + "'", double1 == (-0.7884788267086713d));
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.1884117453587528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8868316935392929d, 0.8340324452479558d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8160703637778226d + "'", double2 == 0.8160703637778226d);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5294913521432763d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        float float1 = org.apache.commons.math.util.FastMath.abs(6559.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6559.0f + "'", float1 == 6559.0f);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        int int2 = org.apache.commons.math.util.FastMath.max(97, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(7.573807232972011d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9638338841846734d + "'", double1 == 1.9638338841846734d);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8145870194540231d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6023002278876782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8263149130273308d + "'", double1 == 0.8263149130273308d);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3396806684922336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 76.75804819986975d + "'", double1 == 76.75804819986975d);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.29668857108723257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.19486506597972084d, 4.615120516841259d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04219811538317294d + "'", double2 == 0.04219811538317294d);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.557153674151176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02717745857346494d + "'", double1 == 0.02717745857346494d);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1834.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.51479976048867d + "'", double1 == 7.51479976048867d);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.7031839360032603E-108d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        long long1 = org.apache.commons.math.util.FastMath.round(1.9836542011042855d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 2147483647);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.09808293184436E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014484760722374257d + "'", double1 == 0.014484760722374257d);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        double double2 = org.apache.commons.math.util.FastMath.min(0.62466259314447d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.5553480614894135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.485714285714284d + "'", double1 == 17.485714285714284d);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.7601526319909638d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7601526319909638d + "'", double1 == 0.7601526319909638d);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        double double1 = org.apache.commons.math.util.FastMath.ceil(151.64788521288048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 152.0d + "'", double1 == 152.0d);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7615303285199447d, 0.7853981633974484d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7615303285199447d + "'", double2 == 0.7615303285199447d);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8012298966644482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.5108256237659907d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5108256237659906d) + "'", double1 == (-0.5108256237659906d));
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.728323488481854d) + "'", double1 == (-0.728323488481854d));
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        long long2 = org.apache.commons.math.util.FastMath.max((long) ' ', 2005L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2005L + "'", long2 == 2005L);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.05593807141461213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05593807141461213d + "'", double1 == 0.05593807141461213d);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9379924444723454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9685001003987276d + "'", double1 == 0.9685001003987276d);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        double double2 = org.apache.commons.math.util.FastMath.max(1.174240018845341d, 0.881477674695355d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.174240018845341d + "'", double2 == 1.174240018845341d);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.7757395863495598d, 2.23606797749979d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.508135772975283d + "'", double2 == 19.508135772975283d);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.9506431907144247d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 51.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9318256327243257d + "'", double1 == 3.9318256327243257d);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.6929693744344998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.435597088531952d + "'", double1 == 4.435597088531952d);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3608331393357123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 77.9699955054746d + "'", double1 == 77.9699955054746d);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.248291097914389d + "'", double1 == 4.248291097914389d);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.1478260473879486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.25096172890041585d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1555698629817919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.02037772465575569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(9.999999995877692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1544346897358424d + "'", double1 == 2.1544346897358424d);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.61186341730071d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5052997058324041d + "'", double1 == 0.5052997058324041d);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        double double1 = org.apache.commons.math.util.FastMath.sinh(15.830314951333888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3749630.166340615d + "'", double1 == 3749630.166340615d);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        double double1 = org.apache.commons.math.util.FastMath.exp(7.805489164046136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2454.0356784138958d + "'", double1 == 2454.0356784138958d);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.5545968900472498d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5743037220874823d + "'", double1 == 0.5743037220874823d);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1256209726545494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.082130173350885d + "'", double1 == 2.082130173350885d);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.568058636590814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.9830700822184464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.899494936611662d + "'", double1 == 9.899494936611662d);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3205004784536856d, 1.762747174039086d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3205004784536856d + "'", double2 == 1.3205004784536856d);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        double double1 = org.apache.commons.math.util.FastMath.asinh(8.590556703111504E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.19809767560951d + "'", double1 == 51.19809767560951d);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.2565251565229352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2593478743243925d + "'", double1 == 0.2593478743243925d);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        double double1 = org.apache.commons.math.util.FastMath.tan(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.614234282244587d + "'", double1 == 1.614234282244587d);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        double double2 = org.apache.commons.math.util.FastMath.atan2(6.17645782688986E-4d, 59.76184719737747d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0335118669057789E-5d + "'", double2 == 1.0335118669057789E-5d);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(5.916079783099616d, 3.7581226324091723d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.916079783099615d + "'", double2 == 5.916079783099615d);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.5582527903380249d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6245182179883367d + "'", double1 == 0.6245182179883367d);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.03517713864733436d), 100.00000000000323d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.2847130244570347d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27726145677245667d) + "'", double1 == (-0.27726145677245667d));
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.373400766945016d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5896158982755639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.5646454682250392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5454678216376646d + "'", double1 == 0.5454678216376646d);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.1752011936438014d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0011273202561264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8420795437206745d + "'", double1 == 0.8420795437206745d);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        double double1 = org.apache.commons.math.util.FastMath.cosh(47.29016150730573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7251473495511184E20d + "'", double1 == 1.7251473495511184E20d);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        int int2 = org.apache.commons.math.util.FastMath.min(2005, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        long long1 = org.apache.commons.math.util.FastMath.round(0.15481538423886812d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        double double1 = org.apache.commons.math.util.FastMath.cos(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876911d + "'", double1 == 0.8623188722876911d);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0713634642907175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.630949191594277d + "'", double1 == 1.630949191594277d);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        double double1 = org.apache.commons.math.util.FastMath.ulp(299669.7281315037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.820766091346741E-11d + "'", double1 == 5.820766091346741E-11d);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        double double2 = org.apache.commons.math.util.FastMath.min(0.15785947541393264d, 11013.232920103324d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15785947541393264d + "'", double2 == 0.15785947541393264d);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9540479077382507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7618861378765684d + "'", double1 == 0.7618861378765684d);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748365E9f + "'", float1 == 2.14748365E9f);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.8655219413764763d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        double double2 = org.apache.commons.math.util.FastMath.max(0.24154560853011509d, 0.9562562360485877d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9562562360485877d + "'", double2 == 0.9562562360485877d);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.008879097553696258d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.3254103039381046d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 97);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        float float1 = org.apache.commons.math.util.FastMath.abs(1.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        double double1 = org.apache.commons.math.util.FastMath.exp(2453.0356784138967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        float float2 = org.apache.commons.math.util.FastMath.min(5.0f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        double double2 = org.apache.commons.math.util.FastMath.pow(263.856815596594d, 34.999999999999886d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.596172423257359E84d + "'", double2 == 5.596172423257359E84d);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9123687177766381d, 2671.5132386145165d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2671.5132386145165d + "'", double2 == 2671.5132386145165d);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.10101093570532195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0051059437697842d + "'", double1 == 1.0051059437697842d);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.375942878091087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1936227590745503d + "'", double1 == 0.1936227590745503d);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.504654289280179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.078811564393542d + "'", double1 == 6.078811564393542d);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        double double1 = org.apache.commons.math.util.FastMath.log1p(92.95177303495919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.54278159779379d + "'", double1 == 4.54278159779379d);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5424210127993572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.675896985065022d + "'", double1 == 3.675896985065022d);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0049514518537068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017539711657544456d + "'", double1 == 0.017539711657544456d);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.38818646476211366d, 0.9364017098556218d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3929872502058908d + "'", double2 == 0.3929872502058908d);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, 2005L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2005L + "'", long2 == 2005L);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 6.890818211544855E11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 5, (long) 2005);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3396806684922336d, 1.3025850929940461d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3396806684922333d + "'", double2 == 1.3396806684922333d);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.1010569721060828d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1010569721060828d + "'", double1 == 1.1010569721060828d);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        int int2 = org.apache.commons.math.util.FastMath.max(100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        double double1 = org.apache.commons.math.util.FastMath.sinh(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9452989832042407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.842160459462465d + "'", double1 == 0.842160459462465d);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.9836542011042855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.282932090538714d) + "'", double1 == (-2.282932090538714d));
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.14191465995125369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8479727390944818d) + "'", double1 == (-0.8479727390944818d));
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.41777137910516676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4057245130309275d + "'", double1 == 0.4057245130309275d);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.4888509771384419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48885097713844194d + "'", double1 == 0.48885097713844194d);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.24154560853011509d, (-0.20331750452375202d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.270472790769458d + "'", double2 == 2.270472790769458d);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.5309649148733837d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5880372899139343d + "'", double1 == 0.5880372899139343d);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(152.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.652900463031381d + "'", double1 == 2.652900463031381d);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2671.5132386145165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.875621465855696d + "'", double1 == 13.875621465855696d);
    }
}

