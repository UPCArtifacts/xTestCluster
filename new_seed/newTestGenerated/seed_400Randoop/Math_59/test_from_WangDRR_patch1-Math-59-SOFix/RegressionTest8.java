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
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 84677176);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.01386515085673384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013961717850033481d + "'", double1 == 0.013961717850033481d);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.2239800905693157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.170616649243588d + "'", double1 == 1.170616649243588d);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.469446951953614E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5982487386901945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.27712782597298d + "'", double1 == 34.27712782597298d);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.166594879293176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1665948792931762d + "'", double1 == 1.1665948792931762d);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        int int2 = org.apache.commons.math.util.FastMath.max(97, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3246090892520057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7607149637232955d + "'", double1 == 2.7607149637232955d);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.03172806744895933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.031235131803051444d + "'", double1 == 0.031235131803051444d);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.248715438260383d + "'", double1 == 22.248715438260383d);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        double double2 = org.apache.commons.math.util.FastMath.min(1.166594879293176d, 0.011697165240742895d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011697165240742895d + "'", double2 == 0.011697165240742895d);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        double double1 = org.apache.commons.math.util.FastMath.acosh(5.551115123125783E-17d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        double double1 = org.apache.commons.math.util.FastMath.asinh(34.99999999540764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.248699261105204d + "'", double1 == 4.248699261105204d);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8492499565656626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        long long1 = org.apache.commons.math.util.FastMath.abs((-36L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36L + "'", long1 == 36L);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.574710978503383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999787460148778d + "'", double1 == 0.999787460148778d);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 36);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1556157735575975E15d + "'", double1 == 2.1556157735575975E15d);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6099169425432279d, 0.29225491648198393d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.123949793829337d + "'", double2 == 1.123949793829337d);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.0037614532268226615d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7588984970945903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.481680962341194d + "'", double1 == 43.481680962341194d);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.9902697229065449d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9902697229065449d + "'", double1 == 0.9902697229065449d);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        float float2 = org.apache.commons.math.util.FastMath.min(1.0f, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        float float1 = org.apache.commons.math.util.FastMath.abs(2.15561577E15f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.15561577E15f + "'", float1 == 2.15561577E15f);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.5310724756574393d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5707963267948963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2062.6480624709634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.41638539636288d + "'", double1 == 45.41638539636288d);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        double double1 = org.apache.commons.math.util.FastMath.cosh(270053.16143060935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6994453290609607d, 1.0615776890930098d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6994453290609608d + "'", double2 == 0.6994453290609608d);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017455065036229584d + "'", double1 == 0.017455065036229584d);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5596872477209207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.01275945468949d + "'", double1 == 90.01275945468949d);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.42280635864377986d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.42280635864377986d) + "'", double2 == (-0.42280635864377986d));
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.0078125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19842513149602495d + "'", double1 == 0.19842513149602495d);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 84677176);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 84677176L + "'", long1 == 84677176L);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        float float2 = org.apache.commons.math.util.FastMath.max(416128.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 416128.0f + "'", float2 == 416128.0f);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0864876632426175d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6418211471568946d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.647653479929832d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6476534799298319d) + "'", double1 == (-0.6476534799298319d));
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5707963267948823d, 0.7884320060348541d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948821d + "'", double2 == 1.5707963267948821d);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        double double1 = org.apache.commons.math.util.FastMath.atanh(22.18070977791825d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.1624473515096263d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.7250840343721086d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2745942431964723d + "'", double1 == 1.2745942431964723d);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.192242010190033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6105407559087495d + "'", double1 == 0.6105407559087495d);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        double double1 = org.apache.commons.math.util.FastMath.exp(72.01388621073826d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8846616861015088E31d + "'", double1 == 1.8846616861015088E31d);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9332525345454011d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8333798993106615d + "'", double1 == 0.8333798993106615d);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.010869254060903364d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.010869896178468208d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, 53L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53L + "'", long2 == 53L);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        double double2 = org.apache.commons.math.util.FastMath.min(92560.48544260226d, 1.2077476E7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 92560.48544260226d + "'", double2 == 92560.48544260226d);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.3833162101372999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006690129943162349d + "'", double1 == 0.006690129943162349d);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.18106042748149917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18306528221419757d + "'", double1 == 0.18306528221419757d);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, 149L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.38930040372081254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3800827644314904d + "'", double1 == 0.3800827644314904d);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.28162208224762103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2893113549836797d + "'", double1 == 0.2893113549836797d);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.48689816668284824d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6145296093470032d + "'", double1 == 0.6145296093470032d);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        int int2 = org.apache.commons.math.util.FastMath.min(53, 84677176);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.38873810163383016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3992615748884459d + "'", double1 == 0.3992615748884459d);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 10, 11013.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5992428797223133d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5756666190961113d + "'", double1 == 2.5756666190961113d);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        float float2 = org.apache.commons.math.util.FastMath.max(2.0f, (float) 416128L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 416128.0f + "'", float2 == 416128.0f);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.977857455908435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01706683222077747d + "'", double1 == 0.01706683222077747d);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        float float2 = org.apache.commons.math.util.FastMath.max(2.15561577E15f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.15561577E15f + "'", float2 == 2.15561577E15f);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        double double1 = org.apache.commons.math.util.FastMath.acos((-3.04617424497707E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5711009442241053d + "'", double1 == 1.5711009442241053d);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.2710663101885893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 187.41829408123715d + "'", double1 == 187.41829408123715d);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05483113556160755d + "'", double1 == 0.05483113556160755d);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9550315978940166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.019982259239296005d) + "'", double1 == (-0.019982259239296005d));
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.6699175736806615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.055592286993075d) + "'", double1 == (-10.055592286993075d));
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6360918665423811d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5940561914458121d + "'", double1 == 0.5940561914458121d);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 53, 45L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 45L + "'", long2 == 45L);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.3686469200204927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.682927644892207d + "'", double1 == 9.682927644892207d);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1639660085492005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8223281760268522d + "'", double1 == 0.8223281760268522d);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.2826557062927154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0402137955774267d + "'", double1 == 1.0402137955774267d);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9684798222642294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.013909423133397792d) + "'", double1 == (-0.013909423133397792d));
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        float float2 = org.apache.commons.math.util.FastMath.max(2.15561577E15f, 4.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.15561577E15f + "'", float2 == 2.15561577E15f);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-2.131776110801955d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5010608089539732d) + "'", double1 == (-1.5010608089539732d));
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        float float2 = org.apache.commons.math.util.FastMath.max(11013.0f, (float) 39481480091340L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        float float2 = org.apache.commons.math.util.FastMath.max(52.0f, (float) 84677176);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.4677176E7f + "'", float2 == 8.4677176E7f);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.17542037193601015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4188321524620694d + "'", double1 == 0.4188321524620694d);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        double double2 = org.apache.commons.math.util.FastMath.max(3.2792211365930397d, (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0004446442786143d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6145296093470032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7839193895720421d + "'", double1 == 0.7839193895720421d);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5378778166059792d, 0.03673618878368824d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5378778166059792d + "'", double2 == 1.5378778166059792d);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, (long) 84677176);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.6699175736806615d, 0.6500970221088582d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.199548965513553d + "'", double2 == 1.199548965513553d);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.5321070224790865E26d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(295.4144370642092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 295.41443706420927d + "'", double1 == 295.41443706420927d);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.017023944947506642d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017022300541627376d) + "'", double1 == (-0.017022300541627376d));
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7282657137693634d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6105647004975028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6105647004975029d + "'", double1 == 0.6105647004975029d);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.469446951953614E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        int int1 = org.apache.commons.math.util.FastMath.abs(45);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 45 + "'", int1 == 45);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5445447624694046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6858379720917758d + "'", double1 == 3.6858379720917758d);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.412477959165965E-27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.412477959165965E-27d + "'", double1 == 2.412477959165965E-27d);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.20500081011138022d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0000000000035623d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        double double1 = org.apache.commons.math.util.FastMath.log(9.825659180793972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.284997247697515d + "'", double1 == 2.284997247697515d);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        double double1 = org.apache.commons.math.util.FastMath.abs(14.899277193215765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.899277193215765d + "'", double1 == 14.899277193215765d);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.01706683222077747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.978724151380226E-4d + "'", double1 == 2.978724151380226E-4d);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 793006726156715L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7871127525111784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32, 53.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.2602833319285365d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30554713851424564d + "'", double1 == 0.30554713851424564d);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.3490760817142498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.011800624231293426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011800076497547315d + "'", double1 == 0.011800076497547315d);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.8309951464910048d, 0.10757413843619563d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0672307953258016d + "'", double2 == 1.0672307953258016d);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5157707046119765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 149L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.12717101690833E64d + "'", double1 == 5.12717101690833E64d);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        double double1 = org.apache.commons.math.util.FastMath.atanh(8.881784197001246E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001246E-16d + "'", double1 == 8.881784197001246E-16d);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        double double2 = org.apache.commons.math.util.FastMath.atan2(10.437911002510873d, 0.8726936208978296d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4873822566029389d + "'", double2 == 1.4873822566029389d);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.2545767570502781d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        double double1 = org.apache.commons.math.util.FastMath.ceil(22.60451646247372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.0d + "'", double1 == 23.0d);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.5844399164946341d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8781280698332341d) + "'", double1 == (-0.8781280698332341d));
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5707963267948963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.99999999999999d + "'", double1 == 89.99999999999999d);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-15.385301667943363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999997919113546d) + "'", double1 == (-0.9999997919113546d));
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        double double1 = org.apache.commons.math.util.FastMath.exp(189.3225229221956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6661995203430285E82d + "'", double1 == 1.6661995203430285E82d);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(572.2646479502633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32788.349092089964d + "'", double1 == 32788.349092089964d);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0d, 0.39709459624648236d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.39709459624648236d + "'", double2 == 0.39709459624648236d);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.6904492636009615d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.833913607205024d, (-0.2622510397683969d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0487840741059375d + "'", double2 == 1.0487840741059375d);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9983608366524339d, 2.721667748088015d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9983608366524339d + "'", double2 == 0.9983608366524339d);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(9.989082137816156E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.989082137816158E-4d + "'", double1 == 9.989082137816158E-4d);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.7465363222182906d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7465363222182906d + "'", double1 == 0.7465363222182906d);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.2851156853967676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2851156853967676d + "'", double1 == 2.2851156853967676d);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) -1, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        double double1 = org.apache.commons.math.util.FastMath.acos(22.18070977791825d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.114043989714556d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.791759469228055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.346431770829404d + "'", double1 == 1.346431770829404d);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-4.821637045374455E-17d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.821637045374455E-17d) + "'", double1 == (-4.821637045374455E-17d));
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        double double1 = org.apache.commons.math.util.FastMath.ceil(149.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 149.0d + "'", double1 == 149.0d);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        double double1 = org.apache.commons.math.util.FastMath.rint(8.305661184154149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        double double1 = org.apache.commons.math.util.FastMath.tanh(11013.232874695796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        long long1 = org.apache.commons.math.util.FastMath.round(3.9481480091340336E13d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 39481480091340L + "'", long1 == 39481480091340L);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6033293179688031d, 7.042749499570736d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.028477366208555375d + "'", double2 == 0.028477366208555375d);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2881954997339584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1349870042136863d + "'", double1 == 1.1349870042136863d);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5440680443502754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.683604680594732d + "'", double1 == 3.683604680594732d);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        double double1 = org.apache.commons.math.util.FastMath.exp(34.18390799770244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.012657256633849E14d + "'", double1 == 7.012657256633849E14d);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(5.566459051786784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 318.93461049977685d + "'", double1 == 318.93461049977685d);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        double double1 = org.apache.commons.math.util.FastMath.expm1(9.989082137816158E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.994072887542587E-4d + "'", double1 == 9.994072887542587E-4d);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        double double2 = org.apache.commons.math.util.FastMath.max(0.011800076497547315d, 0.9260416922830169d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9260416922830169d + "'", double2 == 0.9260416922830169d);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.552713678800501E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.200655107570901E-17d + "'", double1 == 6.200655107570901E-17d);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3023186765274488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0798639893280937d + "'", double1 == 1.0798639893280937d);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        double double1 = org.apache.commons.math.util.FastMath.exp(7.012657256633849E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        float float2 = org.apache.commons.math.util.FastMath.max(57.0f, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.7282657137693634d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.04085581769411778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0008347150187464d + "'", double1 == 1.0008347150187464d);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        double double1 = org.apache.commons.math.util.FastMath.floor(28.458847799916846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.0d + "'", double1 == 28.0d);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(21.278971706197215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.612913581045847d + "'", double1 == 4.612913581045847d);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.8659525529524847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.865952552952485d + "'", double1 == 1.865952552952485d);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        long long1 = org.apache.commons.math.util.FastMath.round(4.709640090012462d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6707931770950559d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 36);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-2), (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9908886150478887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009153147489909813d) + "'", double1 == (-0.009153147489909813d));
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        double double2 = org.apache.commons.math.util.FastMath.max(96.10655605346268d, 0.015129758985515648d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 96.10655605346268d + "'", double2 == 96.10655605346268d);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        float float2 = org.apache.commons.math.util.FastMath.max(5.0f, (float) 2155615773557597L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.15561577E15f + "'", float2 == 2.15561577E15f);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.7245474750742176d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.2881954997339584d, 5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.24187736759082779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3264961224259655d + "'", double1 == 1.3264961224259655d);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 149L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5860134523134308E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.982478439757623E7d + "'", double1 == 3.982478439757623E7d);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6527531305852572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0523779637351338d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.052377963735134d + "'", double1 == 1.052377963735134d);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9995120760870788d + "'", double1 == 0.9995120760870788d);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.168501181378485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.217167073190452d + "'", double1 == 3.217167073190452d);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9999995015891399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574060173404456d + "'", double1 == 1.5574060173404456d);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.385849999980594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.3451842900569835d + "'", double1 == 5.3451842900569835d);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.5844399164946341d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5844399164946341d + "'", double1 == 0.5844399164946341d);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8623188722876837d, 0.977857455908435d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8651519032445955d + "'", double2 == 0.8651519032445955d);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.040495400879878d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8306189581832664d + "'", double1 == 1.8306189581832664d);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        long long2 = org.apache.commons.math.util.FastMath.min(2L, 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1440689579547698d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4824196727343814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6199895080879192d + "'", double1 == 0.6199895080879192d);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8575532158463938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1558241215220355d + "'", double1 == 1.1558241215220355d);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        long long2 = org.apache.commons.math.util.FastMath.min(15472906L, 793006726156715L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15472906L + "'", long2 == 15472906L);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8809373872769856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4137774971580666d + "'", double1 == 1.4137774971580666d);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5992442618287415d, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5992442618287415d + "'", double2 == 0.5992442618287415d);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        double double1 = org.apache.commons.math.util.FastMath.cos(148.80597572185025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4074639732020709d) + "'", double1 == (-0.4074639732020709d));
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 1.1046225788468806d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        double double2 = org.apache.commons.math.util.FastMath.min(3.50632862831693E14d, 15.33357135131469d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.33357135131469d + "'", double2 == 15.33357135131469d);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5832682320789061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5896069690147184d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        double double1 = org.apache.commons.math.util.FastMath.asin(13.596393407513998d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.710594084652733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.552352059737451d + "'", double1 == 7.552352059737451d);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        long long2 = org.apache.commons.math.util.FastMath.min(35L, (long) 149);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        float float2 = org.apache.commons.math.util.FastMath.max(52.0f, (float) 1586013452313419L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.58601345E15f + "'", float2 == 1.58601345E15f);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        double double1 = org.apache.commons.math.util.FastMath.expm1(7.77037274892726E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.27229885648267216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9631551729748808d + "'", double1 == 0.9631551729748808d);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.7368005696771d) + "'", double1 == (-36.7368005696771d));
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        long long2 = org.apache.commons.math.util.FastMath.max(2155615773557597L, 1477896L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2155615773557597L + "'", long2 == 2155615773557597L);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.709975946676697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23299000144533963d + "'", double1 == 0.23299000144533963d);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        double double1 = org.apache.commons.math.util.FastMath.signum(57.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4210854715202007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-13.847379800543134d) + "'", double1 == (-13.847379800543134d));
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 10, (float) (-53L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.30102999566398114d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.2668765990765648E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.9802322387695312E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000004d + "'", double1 == 1.0000000000000004d);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        double double1 = org.apache.commons.math.util.FastMath.log(2.5971542229890323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9544163159728498d + "'", double1 == 0.9544163159728498d);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8125492953065081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        long long2 = org.apache.commons.math.util.FastMath.max(100L, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9975366607028198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.1719235979111335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0030006328454241253d + "'", double1 == 0.0030006328454241253d);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-2.5049299044217186d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3581003438233763d) + "'", double1 == (-1.3581003438233763d));
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        double double2 = org.apache.commons.math.util.FastMath.max(148.80597572185025d, (-2.43878905260671d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 148.80597572185025d + "'", double2 == 148.80597572185025d);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8623188722876837d, 1.3673722261798014d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8623188722876838d + "'", double2 == 0.8623188722876838d);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0637969690534155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7282657137693634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7282657137693636d + "'", double1 == 0.7282657137693636d);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3211090992020036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0912561694388279d + "'", double1 == 1.0912561694388279d);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5617466952995023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2504594738129939d) + "'", double1 == (-0.2504594738129939d));
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        double double2 = org.apache.commons.math.util.FastMath.min(1.4657022738769552d, 1.2881954997339584d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2881954997339584d + "'", double2 == 1.2881954997339584d);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.6915215721218745d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-39.62126752483498d) + "'", double1 == (-39.62126752483498d));
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8261522787674126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6022111734203904d + "'", double1 == 0.6022111734203904d);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.20500081011138022d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-11.745681216144897d) + "'", double1 == (-11.745681216144897d));
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        double double1 = org.apache.commons.math.util.FastMath.ceil(536.7148441762085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 537.0d + "'", double1 == 537.0d);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.8402785435782612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.2717628242082613d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        double double1 = org.apache.commons.math.util.FastMath.asinh(10.049875621120885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0031735464552978d + "'", double1 == 3.0031735464552978d);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.24357481979072695d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2389223526567926d) + "'", double1 == (-0.2389223526567926d));
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        double double2 = org.apache.commons.math.util.FastMath.min(0.282781601724098d, (-0.7245474750742176d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7245474750742176d) + "'", double2 == (-0.7245474750742176d));
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        long long2 = org.apache.commons.math.util.FastMath.min(2155615773557597L, 793006726156715L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 793006726156715L + "'", long2 == 793006726156715L);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        long long1 = org.apache.commons.math.util.FastMath.round(1.3018626251784624d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.23299000144533963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22890630401878298d + "'", double1 == 0.22890630401878298d);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0691962561940713d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.24619002710729043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004296826558596309d + "'", double1 == 0.004296826558596309d);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 97);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.295779276891516d + "'", double1 == 57.295779276891516d);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7839193895720421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7839193895720422d + "'", double1 == 0.7839193895720422d);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.284997247697515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.786036626268317d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9228850149325126d) + "'", double1 == (-0.9228850149325126d));
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        float float2 = org.apache.commons.math.util.FastMath.max(5.0f, 4.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9630809759170001d + "'", double1 == 0.9630809759170001d);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7206435247136849d, 0.02411962364530756d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.992129291171207d + "'", double2 == 0.992129291171207d);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.0872664625997165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09118740161511363d + "'", double1 == 0.09118740161511363d);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5860134523134308E15d, 9.989078815390096E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.035580123877089d + "'", double2 == 1.035580123877089d);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.0037614443570399263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003761462096743441d + "'", double1 == 0.003761462096743441d);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        long long1 = org.apache.commons.math.util.FastMath.round(0.37754243147639266d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7266953932355397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2758693720989824d + "'", double1 == 1.2758693720989824d);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.0476958419065936d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.138692313968385d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2002.0876500568609d + "'", double2 == 2002.0876500568609d);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.0d), 0.25469727314226837d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8365164337420496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5799018512655504d + "'", double1 == 0.5799018512655504d);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.2083157409463713d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20535382550526307d) + "'", double1 == (-0.20535382550526307d));
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.4219132975121505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.267396586565031d + "'", double1 == 11.267396586565031d);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        double double1 = org.apache.commons.math.util.FastMath.atanh(5506.500045400885d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.748066029033894E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.132482812877438d + "'", double1 == 18.132482812877438d);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.04085581769411778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9991655171663728d + "'", double1 == 0.9991655171663728d);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        long long1 = org.apache.commons.math.util.FastMath.round(4.4454545364061836E-4d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.224391898887561d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5540801229283607d + "'", double1 == 1.5540801229283607d);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.006625404912081631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3796077390275217d + "'", double1 == 0.3796077390275217d);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0590159658258047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3418901892542356d + "'", double1 == 0.3418901892542356d);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6521120104928195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9195907465729697d + "'", double1 == 0.9195907465729697d);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.13271291339328767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4376907204886114d + "'", double1 == 1.4376907204886114d);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        long long2 = org.apache.commons.math.util.FastMath.min(57L, (long) 149);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100, 1477896.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438014d) + "'", double1 == (-1.1752011936438014d));
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        double double1 = org.apache.commons.math.util.FastMath.atan((-3.046174150757105E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.046174056537147E-4d) + "'", double1 == (-3.046174056537147E-4d));
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9046945134253409d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7023967071298747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5320370859115992d + "'", double1 == 0.5320370859115992d);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(295.41443706420927d, 5.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 295.4144370642092d + "'", double2 == 295.4144370642092d);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8365164337420496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6700527843371118d + "'", double1 == 0.6700527843371118d);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.3114437720352931d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31144377203529316d + "'", double1 == 0.31144377203529316d);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.10757413843619563d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.3018626251784624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8622018919156007d + "'", double1 == 0.8622018919156007d);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.3383347192042695E42d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        int int2 = org.apache.commons.math.util.FastMath.min(57, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        double double1 = org.apache.commons.math.util.FastMath.cos(35.30685281589777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7321429324531826d) + "'", double1 == (-0.7321429324531826d));
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.192242010190033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1922420101900333d + "'", double1 == 1.1922420101900333d);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.1115738623399643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1111143058480209d + "'", double1 == 0.1111143058480209d);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.58601345231343E15d, 384.43435069728696d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5860134523134298E15d + "'", double2 == 1.5860134523134298E15d);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4836385494853932d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.2031992972018404d), 1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2031992972018404d) + "'", double2 == (-1.2031992972018404d));
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        long long1 = org.apache.commons.math.util.FastMath.round((double) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.9977506581384374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.372454264330465d + "'", double1 == 7.372454264330465d);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.0037614177479929033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0037614088784109546d + "'", double1 == 0.0037614088784109546d);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.01745417873758517d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.58825139188514d + "'", double1 == 1.58825139188514d);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        double double1 = org.apache.commons.math.util.FastMath.log(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3862943611198906d + "'", double1 == 1.3862943611198906d);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.248291097914389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.657902518456065d + "'", double1 == 1.657902518456065d);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9533010145860434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3068127984286353d + "'", double1 == 0.3068127984286353d);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5403023058681398d, 4.437442032932441d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.437442032932441d + "'", double2 == 4.437442032932441d);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4576692332118569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44185841358710953d + "'", double1 == 0.44185841358710953d);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.010869254060903364d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) -1, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.9823021454200065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        float float2 = org.apache.commons.math.util.FastMath.max(97.0f, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.891912895047918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        double double1 = org.apache.commons.math.util.FastMath.log10(11.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0413926851582251d + "'", double1 == 1.0413926851582251d);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.31144377203529316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6778389961463591d + "'", double1 == 0.6778389961463591d);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        long long1 = org.apache.commons.math.util.FastMath.abs(39481480091340L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 39481480091340L + "'", long1 == 39481480091340L);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        double double1 = org.apache.commons.math.util.FastMath.exp(149.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.12717101690833E64d + "'", double1 == 5.12717101690833E64d);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        double double1 = org.apache.commons.math.util.FastMath.exp(92560.48544260226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5013507798060323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.29985830521606127d) + "'", double1 == (-0.29985830521606127d));
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9991791830426371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5545995898581264d + "'", double1 == 1.5545995898581264d);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.4376907204886114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8932318985931245d + "'", double1 == 0.8932318985931245d);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.3833162101372999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37450062041999266d + "'", double1 == 0.37450062041999266d);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 4L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) (-2.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) -1, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        double double2 = org.apache.commons.math.util.FastMath.min(1.001244835092151d, (-0.2504594738129939d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2504594738129939d) + "'", double2 == (-0.2504594738129939d));
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.6283575265889236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 93.29801381190705d + "'", double1 == 93.29801381190705d);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        int int2 = org.apache.commons.math.util.FastMath.min(35, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.018085164638296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.02187509047518678d, (-10.055592286993075d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1394172416057455d + "'", double2 == 3.1394172416057455d);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.3283909087132568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6967614701467567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012160781755097083d + "'", double1 == 0.012160781755097083d);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1161530356493914d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5625847965301676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44634137093517556d + "'", double1 == 0.44634137093517556d);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (-53), 6.802168607459072E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.791632795147367E-15d) + "'", double2 == (-7.791632795147367E-15d));
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0000000000000009d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        float float2 = org.apache.commons.math.util.FastMath.max((-36.0f), (float) 15472906L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5472906E7f + "'", float2 == 1.5472906E7f);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.0133109241786307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.013310924178631d + "'", double1 == 2.013310924178631d);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        double double1 = org.apache.commons.math.util.FastMath.log(26.339410356026733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2710663101885893d + "'", double1 == 3.2710663101885893d);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5302764730926062d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9919809193762412d + "'", double1 == 0.9919809193762412d);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35L, (float) 11013L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.5128928810496862d), 0.7944146264030465d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 149L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 149.0d + "'", double1 == 149.0d);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        double double1 = org.apache.commons.math.util.FastMath.log1p(43.66827237527655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.799263459336884d + "'", double1 == 3.799263459336884d);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.412477959165965E-27d, 1.0926396835566503d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.253215446498233E-30d + "'", double2 == 8.253215446498233E-30d);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        float float2 = org.apache.commons.math.util.FastMath.min(2.15561577E15f, (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        double double2 = org.apache.commons.math.util.FastMath.min(3.8097187196293865d, (-0.010869682119891842d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.010869682119891842d) + "'", double2 == (-0.010869682119891842d));
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        double double1 = org.apache.commons.math.util.FastMath.asinh(8.4677176E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.947503835155906d + "'", double1 == 18.947503835155906d);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.017022300541627376d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        double double1 = org.apache.commons.math.util.FastMath.tan(173988.73655062242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7522743823454654d + "'", double1 == 1.7522743823454654d);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.732511156817248d + "'", double1 == 3.732511156817248d);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6930491557595924d, 0.28495825391099355d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6930491557595923d + "'", double2 == 0.6930491557595923d);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        long long2 = org.apache.commons.math.util.FastMath.min(36L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9987591185419123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.001241651988975115d) + "'", double1 == (-0.001241651988975115d));
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5307314453561238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5061643021402576d + "'", double1 == 0.5061643021402576d);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        double double1 = org.apache.commons.math.util.FastMath.asinh(639.6272283571994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.154033342591204d + "'", double1 == 7.154033342591204d);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        double double1 = org.apache.commons.math.util.FastMath.exp((-52.99999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.602680054508745E-24d + "'", double1 == 9.602680054508745E-24d);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.7805951733159241d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7853981633974483d) + "'", double1 == (-0.7853981633974483d));
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9999500037496876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.999750016661555E-5d) + "'", double1 == (-4.999750016661555E-5d));
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-2.9999999999999996d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.529104380392399d), 0.7813863964118539d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7813863964118539d + "'", double2 == 0.7813863964118539d);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.7130053006861585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6553645909090928d + "'", double1 == 1.6553645909090928d);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(114.59155902616465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 114.59155902616466d + "'", double1 == 114.59155902616466d);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        double double1 = org.apache.commons.math.util.FastMath.tan(194.9663415979849d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18982918240695817d + "'", double1 == 0.18982918240695817d);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.276473161941219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9996141230803657d + "'", double1 == 0.9996141230803657d);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.0012941034727495246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000837352016d + "'", double1 == 1.000000837352016d);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.502154937700735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.4077166057103022d, 1262023.527631695d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        int int2 = org.apache.commons.math.util.FastMath.max(84677176, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 84677176 + "'", int2 == 84677176);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0139617178500335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.756499886438907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4021226112018044d + "'", double1 == 1.4021226112018044d);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.1720269046268665E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.6701224592653805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0001353885748059d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8415441278547194d + "'", double1 == 0.8415441278547194d);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.729577951308232d, 0.6885025193255089d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.451203406859217d + "'", double2 == 1.451203406859217d);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.008838092819754681d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5796345346787104d + "'", double1 == 1.5796345346787104d);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.43442052080657173d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.31784189721835715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0509384096138175d + "'", double1 == 1.0509384096138175d);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        double double2 = org.apache.commons.math.util.FastMath.min(4.644483341943245d, (-86.33580274416313d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-86.33580274416313d) + "'", double2 == (-86.33580274416313d));
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.10757413843619562d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.021887900742948527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9195907465729697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.054790747304297d + "'", double1 == 1.054790747304297d);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.3066167674914817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31680680192059457d + "'", double1 == 0.31680680192059457d);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-3036.676314193363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-53.0d) + "'", double1 == (-53.0d));
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8743692948528521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.195887765543622d + "'", double1 == 1.195887765543622d);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9400683544685794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9400683544685795d + "'", double1 == 0.9400683544685795d);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        float float2 = org.apache.commons.math.util.FastMath.min(5.0f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        int int2 = org.apache.commons.math.util.FastMath.max((-36), 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.363219329202442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3552853625479235d + "'", double1 == 0.3552853625479235d);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.9848929415691015d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        double double2 = org.apache.commons.math.util.FastMath.pow((-36.7368005696771d), 0.37661646864071713d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        double double1 = org.apache.commons.math.util.FastMath.atan(78.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.557976516321996d + "'", double1 == 1.557976516321996d);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        int int2 = org.apache.commons.math.util.FastMath.min(11013, 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        double double1 = org.apache.commons.math.util.FastMath.floor(171.78552109133562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 171.0d + "'", double1 == 171.0d);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 84677176);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8876694185588774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4294609915203074d + "'", double1 == 2.4294609915203074d);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) -1, (float) 53L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.01706683222077747d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.17352652702107887d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1593051502639125d) + "'", double1 == (-0.1593051502639125d));
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.7063851457511368d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        double double1 = org.apache.commons.math.util.FastMath.cos(13.781934843695915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3478079812383207d + "'", double1 == 0.3478079812383207d);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6994453290609608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0484411939287768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4989225874165695d + "'", double1 == 0.4989225874165695d);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7266953932355397d, 0.005178565573424058d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9983481197742622d + "'", double2 == 0.9983481197742622d);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        double double1 = org.apache.commons.math.util.FastMath.sin(74.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9851462604682474d) + "'", double1 == (-0.9851462604682474d));
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8849970445005177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8849970445005177d + "'", double1 == 0.8849970445005177d);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-27.03274004183787d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.24619002710729038d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.403108691968676E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.194215895814761E-8d + "'", double1 == 4.194215895814761E-8d);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        int int2 = org.apache.commons.math.util.FastMath.max(10, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.4650188248182274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936438014d + "'", double1 == 1.1752011936438014d);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0926396835566503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.797839565109256d + "'", double1 == 0.797839565109256d);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        double double1 = org.apache.commons.math.util.FastMath.log(9.994072887542587E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.908348165950628d) + "'", double1 == (-6.908348165950628d));
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        double double1 = org.apache.commons.math.util.FastMath.abs(7.225973768125749E86d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.225973768125749E86d + "'", double1 == 7.225973768125749E86d);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9171523356672743d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3055336652009293d) + "'", double1 == (-1.3055336652009293d));
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.010869254060903364d), (-2.978724151380226E-4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5981945158543847d) + "'", double2 == (-1.5981945158543847d));
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        double double1 = org.apache.commons.math.util.FastMath.expm1(92560.48544260226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-3.0461741036471235E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0466381567221E-4d) + "'", double1 == (-3.0466381567221E-4d));
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9221885224184981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9221885224184982d + "'", double1 == 0.9221885224184982d);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.010869254060903364d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6227623841451938d) + "'", double1 == (-0.6227623841451938d));
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5716315636979223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8299247832830295d + "'", double1 == 0.8299247832830295d);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 149L, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4021226112018044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4021226112018046d + "'", double1 == 1.4021226112018046d);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 53);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.280109889280518d + "'", double1 == 7.280109889280518d);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6803595632804155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9745875937954159d + "'", double1 == 0.9745875937954159d);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0615776890930098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.79104479655494d + "'", double1 == 1.79104479655494d);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(6.234954028085534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.496988992383734d + "'", double1 == 2.496988992383734d);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9948376736367679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.4251053392695819d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42510533926958194d + "'", double1 == 0.42510533926958194d);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        long long2 = org.apache.commons.math.util.FastMath.min(6L, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        double double1 = org.apache.commons.math.util.FastMath.signum((-4.999750016661555E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36787944117144233d + "'", double1 == 0.36787944117144233d);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.992129291171207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1630923307762646d + "'", double1 == 1.1630923307762646d);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 97.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        int int2 = org.apache.commons.math.util.FastMath.min(149, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.127345252052883d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8101087222704179d) + "'", double1 == (-0.8101087222704179d));
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5707963267948957d, 0.25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948954d + "'", double2 == 1.5707963267948954d);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 3L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5540801229283607d, 1.556529890912072d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5540801229283607d + "'", double2 == 1.5540801229283607d);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.5785812223437699d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6114064672121875d) + "'", double1 == (-0.6114064672121875d));
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.356568665264778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.8813735870195429d), 1.2083802338853868d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8813735870195429d) + "'", double2 == (-0.8813735870195429d));
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.2245999714347802d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 15472906L, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7629292891930135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7029641237193509d + "'", double1 == 0.7029641237193509d);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7615941559557655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557655d + "'", double1 == 0.7615941559557655d);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        int int2 = org.apache.commons.math.util.FastMath.min(100, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5574060173404456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2155615773557597L, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.15561577E15f + "'", float2 == 2.15561577E15f);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.07414666724177091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0012941034727495249d + "'", double1 == 0.0012941034727495249d);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        double double2 = org.apache.commons.math.util.FastMath.min(2.496988992383734d, 57.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.496988992383734d + "'", double2 == 2.496988992383734d);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        double double1 = org.apache.commons.math.util.FastMath.ulp(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        long long1 = org.apache.commons.math.util.FastMath.round(2.571281590658235d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        long long1 = org.apache.commons.math.util.FastMath.abs(6L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9659700754028168d), 1.0590159658258047d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9659700754028167d) + "'", double2 == (-0.9659700754028167d));
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.9754001961551926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.356147801749622d, 5.366643026452032d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.356147801749623d + "'", double2 == 4.356147801749623d);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 8.4677176E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.947503835155906d + "'", double1 == 18.947503835155906d);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97, (float) (-53));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 57);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        float float2 = org.apache.commons.math.util.FastMath.max(1.58601345E15f, 53.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.58601345E15f + "'", float2 == 1.58601345E15f);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.718281828459045d, 0.6108652381980153d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3497438749375477d + "'", double2 == 1.3497438749375477d);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 2155615773557597L, (-24.092316404524105d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3603078162116136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20893765340601256d + "'", double1 == 0.20893765340601256d);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        float float2 = org.apache.commons.math.util.FastMath.max(11013.0f, (float) 11013L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        long long1 = org.apache.commons.math.util.FastMath.round(32034.985999653978d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32035L + "'", long1 == 32035L);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9991791830426371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7612492183413337d + "'", double1 == 0.7612492183413337d);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.3279301050129204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8687425280815093d + "'", double1 == 0.8687425280815093d);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.09933992780358329d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) (-2.0f), 1.196341993668888d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.9999999999999998d) + "'", double2 == (-1.9999999999999998d));
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        double double1 = org.apache.commons.math.util.FastMath.log(53.598150033144236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9815145531741134d + "'", double1 == 3.9815145531741134d);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.502154937700735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 57L, (float) 2155615773557597L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        long long2 = org.apache.commons.math.util.FastMath.min((-53L), 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.604073567738472d + "'", double1 == 7.604073567738472d);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        double double1 = org.apache.commons.math.util.FastMath.atanh(171.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        double double1 = org.apache.commons.math.util.FastMath.log((double) (-1.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 149.0f, 2.710594084652733d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 148.99999999999997d + "'", double2 == 148.99999999999997d);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '#', (float) 1586013452313419L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        double double1 = org.apache.commons.math.util.FastMath.rint(1477896.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1477896.0d + "'", double1 == 1477896.0d);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 53L, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        long long1 = org.apache.commons.math.util.FastMath.round(0.09966865249116198d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.24928153889173274d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0043507836180990325d) + "'", double1 == (-0.0043507836180990325d));
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6530481872478414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        double double1 = org.apache.commons.math.util.FastMath.atan(173988.73655062242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.57079057929641d + "'", double1 == 1.57079057929641d);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        double double1 = org.apache.commons.math.util.FastMath.log(2.0808864545885957E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.385301667943363d) + "'", double1 == (-15.385301667943363d));
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 36);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.0d + "'", double1 == 36.0d);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8657694832396586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9780533157623794d + "'", double1 == 0.9780533157623794d);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 36, 149.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.01706683222077747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5537286659368967d + "'", double1 == 1.5537286659368967d);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7001754393517351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6044791236121515d + "'", double1 == 0.6044791236121515d);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        double double2 = org.apache.commons.math.util.FastMath.pow(9.223372036854776E18d, 2.5556892683639982d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9401206378061303E48d + "'", double2 == 2.9401206378061303E48d);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1922420101900333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9291998984986712d + "'", double1 == 0.9291998984986712d);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5707963267948968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.0222383329741738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0222383329741738d + "'", double1 == 2.0222383329741738d);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.428182669496151d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.428182669496151d + "'", double1 == 0.428182669496151d);
    }
}

