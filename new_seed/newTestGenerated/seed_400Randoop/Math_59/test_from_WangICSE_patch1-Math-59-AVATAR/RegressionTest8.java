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
        double double1 = org.apache.commons.math.util.FastMath.acos(0.764612681954403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7003561790124814d + "'", double1 == 0.7003561790124814d);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.04742516418921198d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.009483282630450406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009483282630450408d + "'", double1 == 0.009483282630450408d);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5265885704492408d, 2.072618110111349d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5265885704492409d + "'", double2 == 0.5265885704492409d);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5574077246549023d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.7580423413226773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.457501399486101d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.264015675732496d + "'", double1 == 2.264015675732496d);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5731104262529237d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8340324452479558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.302585092994046d + "'", double1 == 2.302585092994046d);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.23313271272363228d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2310709246944891d) + "'", double1 == (-0.2310709246944891d));
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.180265029949426E20d + "'", double1 == 8.180265029949426E20d);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 13.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4630211329364896d + "'", double1 == 0.4630211329364896d);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.44986538813437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483468734360595d + "'", double1 == 0.6483468734360595d);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.6536436208636119d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7816340724367478d) + "'", double1 == (-0.7816340724367478d));
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        double double2 = org.apache.commons.math.util.FastMath.min(0.07270966677774478d, 2.0634370688955608d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07270966677774478d + "'", double2 == 0.07270966677774478d);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.15562022042706086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0027160852291315484d + "'", double1 == 0.0027160852291315484d);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9960122203732344d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5438317534371178d) + "'", double1 == (-1.5438317534371178d));
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 35, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        double double1 = org.apache.commons.math.util.FastMath.asinh(11.553863346113918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.142034586093159d + "'", double1 == 3.142034586093159d);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9999197990932152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5571330292496455d + "'", double1 == 1.5571330292496455d);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.234021194410018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.337337939299603d + "'", double1 == 9.337337939299603d);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        int int2 = org.apache.commons.math.util.FastMath.min(10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5422326689561365d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 13, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.03505120341912517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0006143563258767d + "'", double1 == 1.0006143563258767d);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '#', 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0348955683853929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.018062335082623244d + "'", double1 == 0.018062335082623244d);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32L, (float) 6559L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6559.0f + "'", float2 == 6559.0f);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        double double1 = org.apache.commons.math.util.FastMath.acos(47.29016150730573d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        int int2 = org.apache.commons.math.util.FastMath.min(52, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.841419241695424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.20977135024594d + "'", double1 == 48.20977135024594d);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(7.896296018268069E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3781636423089612E12d + "'", double1 == 1.3781636423089612E12d);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.741265442356241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-34.62065524210653d) + "'", double1 == (-34.62065524210653d));
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5271796258079011d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9099407103569997d + "'", double1 == 0.9099407103569997d);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.27263664300150503d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2692716263907514d) + "'", double1 == (-0.2692716263907514d));
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6306583303604348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2055441846608936d + "'", double1 == 1.2055441846608936d);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3216115088844415E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.878896188075114d) + "'", double1 == (-10.878896188075114d));
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2L, 2005.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2005.0f + "'", float2 == 2005.0f);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        double double1 = org.apache.commons.math.util.FastMath.asinh(10.017874927409903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        float float2 = org.apache.commons.math.util.FastMath.max(52.0f, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0051059437697842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0025497213454224d + "'", double1 == 1.0025497213454224d);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        double double2 = org.apache.commons.math.util.FastMath.max(5.267884728309446d, 0.7595020127952743d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.267884728309446d + "'", double2 == 5.267884728309446d);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9043400555523963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.1226744880631757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35024917996074695d + "'", double1 == 0.35024917996074695d);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5737618316160396d, 1.0611064769287215d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5737618316160396d + "'", double2 == 1.5737618316160396d);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) -1, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.764297879283013d, 0.12236703082541885d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4120398112486696d + "'", double2 == 1.4120398112486696d);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.3929872502058908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39298725020589087d + "'", double1 == 0.39298725020589087d);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0263499943255474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7724403067762812d + "'", double1 == 0.7724403067762812d);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.64236324311418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.8378193262057857E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.837819326205786E-7d + "'", double1 == 2.837819326205786E-7d);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        long long2 = org.apache.commons.math.util.FastMath.max(39481480091341L, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091341L + "'", long2 == 39481480091341L);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.64236324311418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0238739333695548d + "'", double1 == 1.0238739333695548d);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        double double1 = org.apache.commons.math.util.FastMath.sinh(7.028730419947964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 564.2979850674095d + "'", double1 == 564.2979850674095d);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 2147483647L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.054696319902792064d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.23886037395044873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23441903665414232d + "'", double1 == 0.23441903665414232d);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1064106411944428d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9058595173841506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4373918059267367d + "'", double1 == 0.4373918059267367d);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        double double1 = org.apache.commons.math.util.FastMath.log(0.4723407343250855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7500546590807314d) + "'", double1 == (-0.7500546590807314d));
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.0278589874552748d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0278589874552748d + "'", double1 == 1.0278589874552748d);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.36298951511785643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006335362189024327d + "'", double1 == 0.006335362189024327d);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0713634642907175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 13, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        int int2 = org.apache.commons.math.util.FastMath.min(4, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        double double1 = org.apache.commons.math.util.FastMath.rint(56.4814618818951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.0d + "'", double1 == 56.0d);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.5108256237659907d), (-0.7059602000407633d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9123687177766381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        double double1 = org.apache.commons.math.util.FastMath.exp(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 193.9948452238572d + "'", double1 == 193.9948452238572d);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.07496085456049556d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07510173476268535d) + "'", double1 == (-0.07510173476268535d));
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6598511068026915d, 2.1544346897358424d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.29720437496938557d + "'", double2 == 0.29720437496938557d);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9999092042625951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.5684916247485625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.602651435823948d + "'", double1 == 1.602651435823948d);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0038696050023175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0001181575986342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6932062576141789d + "'", double1 == 0.6932062576141789d);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(7.52574989159953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 431.19370645968985d + "'", double1 == 431.19370645968985d);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5635488491325358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.77573958634956d + "'", double1 == 3.77573958634956d);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3279842425886166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.773429397893732d + "'", double1 == 3.773429397893732d);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.014484760722374257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8299156566489104d + "'", double1 == 0.8299156566489104d);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.07496085456049556d), 0.8940757456435277d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.07496085456049556d) + "'", double2 == (-0.07496085456049556d));
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.01745240643728351d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.2966885710872325d, 8.881784197001254E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999999989d + "'", double2 == 0.9999999999999989d);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9857874761787422d, 0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8342233605065102d + "'", double2 == 0.8342233605065102d);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.06214609673410902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06214609673410903d + "'", double1 == 0.06214609673410903d);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.1650486009423269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        double double1 = org.apache.commons.math.util.FastMath.abs(7.896296018268069E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018268069E13d + "'", double1 == 7.896296018268069E13d);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9734594443576854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23090601498489322d + "'", double1 == 0.23090601498489322d);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.20331750452375202d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7755413388321177d + "'", double1 == 1.7755413388321177d);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        double double1 = org.apache.commons.math.util.FastMath.asinh(8.881784197001254E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001254E-16d + "'", double1 == 8.881784197001254E-16d);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.39298725020589087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48139950167021806d + "'", double1 == 0.48139950167021806d);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.594700892207039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0046874060688094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7635557292444164d + "'", double1 == 0.7635557292444164d);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.023246939094508524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        long long1 = org.apache.commons.math.util.FastMath.round(1.4643340811431678d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1102230246251565E-16d, 0.9066335230777041d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4279467535836454E-15d + "'", double2 == 3.4279467535836454E-15d);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.301812843306464d + "'", double1 == 2.301812843306464d);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8307927247660993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2951374315917379d + "'", double1 == 1.2951374315917379d);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.605170185988091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.99999999999996d + "'", double1 == 99.99999999999996d);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(13.875621465855696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 795.0145481146601d + "'", double1 == 795.0145481146601d);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5395564933646284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6625219529419444d + "'", double1 == 3.6625219529419444d);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        double double2 = org.apache.commons.math.util.FastMath.max(3.793333234353753d, 1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.793333234353753d + "'", double2 == 3.793333234353753d);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7615165085805538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013290970383022313d + "'", double1 == 0.013290970383022313d);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7591697253775695d + "'", double1 == 0.7591697253775695d);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5860134523134308E15d + "'", double1 == 1.5860134523134308E15d);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.5440211074304587d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6582696111348529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2245968743820945d + "'", double1 == 1.2245968743820945d);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.1194710708535681d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.23606797749979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4953487812212205d + "'", double1 == 1.4953487812212205d);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.45961320728596883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4596132072859689d + "'", double1 == 0.4596132072859689d);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        long long1 = org.apache.commons.math.util.FastMath.round(48.20977135024594d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 48L + "'", long1 == 48L);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.835185011349347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 1, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        double double1 = org.apache.commons.math.util.FastMath.log((-2.719630684615244d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1932800507380157d, 0.999329299739067d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1932800507380157d + "'", double2 == 1.1932800507380157d);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 0, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 'a', 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.2951374315917379d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7505520374326113d + "'", double1 == 0.7505520374326113d);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.17012123520235736d), 0.4968798877157107d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.013267166245943098d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5840638822810198d + "'", double1 == 1.5840638822810198d);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.09247351917780995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09260582453650028d + "'", double1 == 0.09260582453650028d);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0348955683853929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0172981708355682d + "'", double1 == 1.0172981708355682d);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5567229026732161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.3728048593649235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3728048593649236d + "'", double1 == 0.3728048593649236d);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.015371184793963343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01536997430806746d + "'", double1 == 0.01536997430806746d);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.023246939094508524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0235192552613448d + "'", double1 == 1.0235192552613448d);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9455557866374292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3853288719732373d + "'", double1 == 1.3853288719732373d);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.016112503727829505d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.016113898209915566d) + "'", double1 == (-0.016113898209915566d));
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.5438317534371178d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5438317534371178d + "'", double1 == 1.5438317534371178d);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.746501045726147d, 0.6610060414837631d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.799542231457883d + "'", double2 == 2.799542231457883d);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9596936803142382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6108965818975884d + "'", double1 == 1.6108965818975884d);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '#', 78962960182681L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5649399270507434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.782387635136122d + "'", double1 == 3.782387635136122d);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        double double1 = org.apache.commons.math.util.FastMath.tan(27.289917197127753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5052875030491273d) + "'", double1 == (-1.5052875030491273d));
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        long long2 = org.apache.commons.math.util.FastMath.min(7872L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.745427304692527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2909366033525147d + "'", double1 == 1.2909366033525147d);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 10, 0.03011360650845773d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03011360650845773d + "'", double2 == 0.03011360650845773d);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8259324122591327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6778717693998078d + "'", double1 == 0.6778717693998078d);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 51.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        double double2 = org.apache.commons.math.util.FastMath.min((double) ' ', 0.24395830743395697d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.24395830743395697d + "'", double2 == 0.24395830743395697d);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6391335074803455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8259324122591327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1189396031849523d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3396806684922336d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.1719235979111335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0148153001032358d + "'", double1 == 1.0148153001032358d);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 100, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5571330292496455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2478513650469938d + "'", double1 == 1.2478513650469938d);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        long long2 = org.apache.commons.math.util.FastMath.max(100L, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 0, 51.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.0f + "'", float2 == 51.0f);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-3.269062116088924d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9619579105874023d) + "'", double1 == (-0.9619579105874023d));
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.010308913146243284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999468636254574d + "'", double1 == 0.9999468636254574d);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.5253536785057736d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        long long2 = org.apache.commons.math.util.FastMath.max(3280L, 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3280L + "'", long2 == 3280L);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9144143970315091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03885694479331038d) + "'", double1 == (-0.03885694479331038d));
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.004975165426584024d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.384371602954472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.415248705123492d) + "'", double1 == (-0.415248705123492d));
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        float float2 = org.apache.commons.math.util.FastMath.min(10.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        int int1 = org.apache.commons.math.util.FastMath.abs(6559);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6559 + "'", int1 == 6559);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.45188139334621774d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.15059643745753507d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1494732094266326d) + "'", double1 == (-0.1494732094266326d));
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0611064769287215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.617819568339381d + "'", double1 == 1.617819568339381d);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        double double1 = org.apache.commons.math.util.FastMath.log((-2.0355549961366867E-12d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.239582291948687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        int int2 = org.apache.commons.math.util.FastMath.max(4, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9144143970315091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.138288992714996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 78L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 78.0f + "'", float1 == 78.0f);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        long long2 = org.apache.commons.math.util.FastMath.min(4L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(7.951386703658792E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.04299281412108692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3503202894520549d + "'", double1 == 0.3503202894520549d);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        int int2 = org.apache.commons.math.util.FastMath.max(13, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        double double2 = org.apache.commons.math.util.FastMath.max(0.2982952388073998d, 0.978364500953377d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.978364500953377d + "'", double2 == 0.978364500953377d);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.644483341943245d, (-0.017941448296478753d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.6444833419432445d + "'", double2 == 4.6444833419432445d);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 4);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.44986538813437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.20637502874300212d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2063750287430021d) + "'", double1 == (-0.2063750287430021d));
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5702200276960676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2330935876201878d + "'", double1 == 1.2330935876201878d);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.7166721312869937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.434037227610032d + "'", double1 == 0.434037227610032d);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        int int2 = org.apache.commons.math.util.FastMath.max(2, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        double double2 = org.apache.commons.math.util.FastMath.min(0.26324041796387243d, 3.9588076367332286d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.26324041796387243d + "'", double2 == 0.26324041796387243d);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(6.3108872417680944E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.61587203936269E-28d + "'", double1 == 3.61587203936269E-28d);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.4248349501142077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35405598253118287d + "'", double1 == 0.35405598253118287d);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9736488930495181d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.785972299321855d + "'", double1 == 55.785972299321855d);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.093079357587117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.034776717477448635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.004619514690056837d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.082130173350885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.844103223736517d + "'", double1 == 1.844103223736517d);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7615303285199447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6508397703249049d + "'", double1 == 0.6508397703249049d);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.5282839739597525d), (double) 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5282839739597525d) + "'", double2 == (-0.5282839739597525d));
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, 39481480091341L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        long long1 = org.apache.commons.math.util.FastMath.round(138.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 138L + "'", long1 == 138L);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.62466259314447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5583566489006084d + "'", double1 == 0.5583566489006084d);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        long long1 = org.apache.commons.math.util.FastMath.round(2738.593745198908d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2739L + "'", long1 == 2739L);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.4575013994861008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 83.50867882496455d + "'", double1 == 83.50867882496455d);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.7580785313863723d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.758078531386372d) + "'", double1 == (-1.758078531386372d));
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        double double1 = org.apache.commons.math.util.FastMath.tanh(24.19638901669072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9912009623635004d, 7.217373703740946d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9382048268704765d + "'", double2 == 0.9382048268704765d);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        int int2 = org.apache.commons.math.util.FastMath.min(97, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.3796077390275217d, (-0.20331750452375202d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.217667027802922d + "'", double2 == 1.217667027802922d);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.6444833419432445d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0071451610978088d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-323.30621534311575d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2855095071632904E140d + "'", double1 == 1.2855095071632904E140d);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.764297879283013d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8340324452479558d, 0.9914978027470505d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.835320354053141d + "'", double2 == 0.835320354053141d);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9882281837083275d, 2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9882281837083275d + "'", double2 == 0.9882281837083275d);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.16657228212058228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4034439702017982d + "'", double1 == 1.4034439702017982d);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        double double1 = org.apache.commons.math.util.FastMath.tanh(681.4521151915139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5860134523134298E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.8485804212570964d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2510593165140436d) + "'", double1 == (-1.2510593165140436d));
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.2698012268765735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.718989392409238d + "'", double1 == 0.718989392409238d);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.013267166245943098d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.99991199244082d + "'", double1 == 0.99991199244082d);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        long long1 = org.apache.commons.math.util.FastMath.round(2.837819326205786E-7d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.034279652058798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.757983587242636d + "'", double1 == 3.757983587242636d);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0192272144065368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0194132476811772d + "'", double1 == 1.0194132476811772d);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5403023023993376d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.95704158868318d + "'", double1 == 30.95704158868318d);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        double double1 = org.apache.commons.math.util.FastMath.acosh(16.75071124639625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.510695715855381d + "'", double1 == 3.510695715855381d);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9534853411343631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5947374629017292d + "'", double1 == 1.5947374629017292d);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        double double1 = org.apache.commons.math.util.FastMath.acos(19.781104616480253d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        long long2 = org.apache.commons.math.util.FastMath.min(6559L, 7872L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6559L + "'", long2 == 6559L);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '#', (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6783712618582197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7316113039382015d + "'", double1 == 0.7316113039382015d);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.44699510894891675d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4203522483336561d) + "'", double1 == (-0.4203522483336561d));
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.09711515743188391d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.0086972736692794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1015071856306502d + "'", double1 == 1.1015071856306502d);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.5438317534371178d), 564.2988711233953d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5438317534371175d) + "'", double2 == (-1.5438317534371175d));
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9899924966004454d) + "'", double1 == (-0.9899924966004454d));
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.13742481004290297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.137424810042903d + "'", double1 == 0.137424810042903d);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.23441903665414232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5884697075000961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.605170185988091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998000199980002d + "'", double1 == 0.9998000199980002d);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.023246939094508524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.547547293338531d + "'", double1 == 1.547547293338531d);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.04299281412108692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9990759513130485d + "'", double1 == 0.9990759513130485d);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.9999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        double double1 = org.apache.commons.math.util.FastMath.atan(9.999999995877692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276742629196d + "'", double1 == 1.4711276742629196d);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.019529180206536243d, 0.013442018252748935d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01952918020653624d + "'", double2 == 0.01952918020653624d);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        double double1 = org.apache.commons.math.util.FastMath.ceil(32.29225137547852d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.0d + "'", double1 == 33.0d);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        double double1 = org.apache.commons.math.util.FastMath.asin(8.58054943433846d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        double double2 = org.apache.commons.math.util.FastMath.min(0.13786975975049967d, 13.067188648029997d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13786975975049967d + "'", double2 == 0.13786975975049967d);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        long long1 = org.apache.commons.math.util.FastMath.round(0.010308913146243284d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8807733836535281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.412764978032765d + "'", double1 == 2.412764978032765d);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8486007400083447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7503561819538955d + "'", double1 == 0.7503561819538955d);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.580519347575949d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9514299550145358d + "'", double1 == 0.9514299550145358d);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3371848034806941d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.290566511066606d + "'", double1 == 0.290566511066606d);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.01209770050168668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012025108203109165d + "'", double1 == 0.012025108203109165d);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.038991025401791155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5317954149515614d + "'", double1 == 1.5317954149515614d);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        double double2 = org.apache.commons.math.util.FastMath.max(3.4279467535836454E-15d, 0.1472859194620699d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1472859194620699d + "'", double2 == 0.1472859194620699d);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0049514518537068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8441359396316807d + "'", double1 == 0.8441359396316807d);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        double double1 = org.apache.commons.math.util.FastMath.signum(18936.712965226554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        long long2 = org.apache.commons.math.util.FastMath.max(52L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.605170185988091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.605170185988091d + "'", double1 == 4.605170185988091d);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.3120421100391796E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5702200276960678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19596051235763337d + "'", double1 == 0.19596051235763337d);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9443504370351302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9810949988186548d + "'", double1 == 0.9810949988186548d);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.9704971179648552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2536951179519045d + "'", double1 == 1.2536951179519045d);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        double double1 = org.apache.commons.math.util.FastMath.exp(9.07998609361042E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000908039833682d + "'", double1 == 1.0000908039833682d);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.0278589874552748d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3577721357828531d + "'", double1 == 0.3577721357828531d);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1574457518571803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0635006452872446d + "'", double1 == 0.0635006452872446d);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        double double1 = org.apache.commons.math.util.FastMath.tan(32.009338481576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6745085168424229d + "'", double1 == 0.6745085168424229d);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9443504370351302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7372146681639586d + "'", double1 == 0.7372146681639586d);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5707963267948961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2334031175112168d + "'", double1 == 1.2334031175112168d);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 4L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3862943611198906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1774100225154747d + "'", double1 == 1.1774100225154747d);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        float float2 = org.apache.commons.math.util.FastMath.max(13.0f, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.40205067186377547d), 0.9914978027470505d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.40205067186377547d) + "'", double2 == (-0.40205067186377547d));
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-7.47197233734299E-43d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.2811247956825435E-41d) + "'", double1 == (-4.2811247956825435E-41d));
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        int int2 = org.apache.commons.math.util.FastMath.min(35, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.7567424583270177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1063634786066832d, 0.3665789367467411d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2508437256480078d + "'", double2 == 1.2508437256480078d);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.460094597035771d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.702048418162471d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04715964144523967d + "'", double1 == 0.04715964144523967d);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        long long1 = org.apache.commons.math.util.FastMath.round(7871.825828205633d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7872L + "'", long1 == 7872L);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0000908039833682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.07998609361042E-5d + "'", double1 == 9.07998609361042E-5d);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5282839739597386d), Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        long long1 = org.apache.commons.math.util.FastMath.round(21.3640677341238d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 21L + "'", long1 == 21L);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 8L, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.5646454682250392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5646454682250397d + "'", double1 == 2.5646454682250397d);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        double double1 = org.apache.commons.math.util.FastMath.log(2.7400702703686357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0079835661910628d + "'", double1 == 1.0079835661910628d);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 2005);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5702975737190454d + "'", double1 == 1.5702975737190454d);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) -1, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.5300284545496456d, 0.8816651612292111d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2668439577566954d + "'", double2 == 2.2668439577566954d);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.16288628673873548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16288628673873548d + "'", double1 == 0.16288628673873548d);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        double double1 = org.apache.commons.math.util.FastMath.log1p(24.19638901669072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.226700691261493d + "'", double1 == 3.226700691261493d);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.75d, 0.020483828884450862d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9941244983245001d + "'", double2 == 0.9941244983245001d);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        float float2 = org.apache.commons.math.util.FastMath.min(2005.0f, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7853981633974484d, 3.9588076367332294d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7853981633974484d + "'", double2 == 0.7853981633974484d);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1259469553800836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9676886063122145d + "'", double1 == 0.9676886063122145d);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 35L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9221952083958849d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.3396806684922333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.249523657620544d + "'", double1 == 4.249523657620544d);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 36.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3019272488946267d + "'", double1 == 3.3019272488946267d);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.238991635001947d, 7.217373703740946d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2389916350019472d + "'", double2 == 1.2389916350019472d);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8813735386764384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12627374894863147d) + "'", double1 == (-0.12627374894863147d));
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        double double1 = org.apache.commons.math.util.FastMath.sin(7.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6569865987187891d + "'", double1 == 0.6569865987187891d);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-2.0355549961366867E-12d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0355549961366867E-12d) + "'", double1 == (-2.0355549961366867E-12d));
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        int int2 = org.apache.commons.math.util.FastMath.max(97, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0861389180081439d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0899577325456637d + "'", double1 == 1.0899577325456637d);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.9988731032017402d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5972229600067989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0114159693713736d + "'", double1 == 1.0114159693713736d);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0000000000000142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715201903E-14d + "'", double1 == 1.4210854715201903E-14d);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.6696927901138922d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.03168203751511701d), 0.3923993423012373d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3923993423012373d + "'", double2 == 0.3923993423012373d);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5202860320095168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9803514567371407d + "'", double1 == 0.9803514567371407d);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9171523356672743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171523356672744d + "'", double1 == 0.9171523356672744d);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        float float1 = org.apache.commons.math.util.FastMath.abs(2.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.319776824715853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.89972743965683d + "'", double1 == 3.89972743965683d);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.1124649919871528E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9899750504798679d, 0.49297772472673135d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.995045299569872d + "'", double2 == 0.995045299569872d);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        int int2 = org.apache.commons.math.util.FastMath.max(4, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        double double1 = org.apache.commons.math.util.FastMath.signum(10.571645135349055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(81.78552109133565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.340690375060061d + "'", double1 == 4.340690375060061d);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4643340811431678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2779471644382685d + "'", double1 == 2.2779471644382685d);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7216329479064553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0172981708355682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8506908681373769d + "'", double1 == 0.8506908681373769d);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.23441903665414232d, (double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.541576288123802E-20d + "'", double2 == 2.541576288123802E-20d);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5497922893701128d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5582527903380249d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7689468296853795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3104969031154132d + "'", double1 == 1.3104969031154132d);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        double double2 = org.apache.commons.math.util.FastMath.min(8.875921921551335d, 1.1516653330585762d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1516653330585762d + "'", double2 == 1.1516653330585762d);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7322313444854719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.663368930684795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        double double1 = org.apache.commons.math.util.FastMath.sinh(605.7106487655087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6985241514062685E262d + "'", double1 == 5.6985241514062685E262d);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.1599362326291829d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.16601303451652813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002897474053540409d + "'", double1 == 0.002897474053540409d);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        double double1 = org.apache.commons.math.util.FastMath.tan((-2.719630684615244d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44892785157241405d + "'", double1 == 0.44892785157241405d);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2478513650469938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.247851365046994d + "'", double1 == 1.247851365046994d);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 48L, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 48.0f + "'", float2 == 48.0f);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        float float2 = org.apache.commons.math.util.FastMath.min(10.0f, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        int int2 = org.apache.commons.math.util.FastMath.max(13, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.610564700497503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5733302243794455d + "'", double1 == 0.5733302243794455d);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.27263664300150503d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.5019296225954823d, (-0.45188139334621774d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5675937536109087d + "'", double2 == 0.5675937536109087d);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8574443553084918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7088000510620012d + "'", double1 == 0.7088000510620012d);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 6559);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5707963267948963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.2063750287430021d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8135279227115655d + "'", double1 == 0.8135279227115655d);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1), (float) 6559L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6559.0f + "'", float2 == 6559.0f);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7322313444854719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3116587705732702d) + "'", double1 == (-0.3116587705732702d));
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.2692716263907514d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2360642776393149d) + "'", double1 == (-0.2360642776393149d));
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8253690221023695d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9538957088157914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5785098535614418d + "'", double1 == 0.5785098535614418d);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        double double1 = org.apache.commons.math.util.FastMath.acos(9.848857801796104d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5037517052427105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.999329299739067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5408665591104282d + "'", double1 == 0.5408665591104282d);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        float float2 = org.apache.commons.math.util.FastMath.min(4.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.6929693744344998d, 1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6929693744345d + "'", double2 == 1.6929693744345d);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5501702829958329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5501702829958329d + "'", double1 == 0.5501702829958329d);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(23.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.795831523312719d + "'", double1 == 4.795831523312719d);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.22700267719769052d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.08516213117310048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0014863595869859044d + "'", double1 == 0.0014863595869859044d);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        double double1 = org.apache.commons.math.util.FastMath.asinh(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298342365610589d + "'", double1 == 5.298342365610589d);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5265885704492408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4827690611490426d + "'", double1 == 0.4827690611490426d);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4034439702017982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3389291945421886d + "'", double1 == 0.3389291945421886d);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-36.34032616795694d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0208063722335754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0208063722335754d + "'", double1 == 1.0208063722335754d);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.1226744880631757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12329359244987054d + "'", double1 == 0.12329359244987054d);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        double double2 = org.apache.commons.math.util.FastMath.atan2(8.788723182374373d, 1.7771308193574424E20d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.945456511497625E-20d + "'", double2 == 4.945456511497625E-20d);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8339178207386727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.302321175433678d + "'", double1 == 1.302321175433678d);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6778717693998078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.517526186412088d + "'", double1 == 0.517526186412088d);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1599362326291829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.159936232629183d + "'", double1 == 1.159936232629183d);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-2.0355549961366867E-12d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1662871024540074E-10d) + "'", double1 == (-1.1662871024540074E-10d));
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.9322410534856177d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9768834261562479d) + "'", double1 == (-0.9768834261562479d));
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        float float2 = org.apache.commons.math.util.FastMath.max(1.0f, (float) 8L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-2.713130608547954d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.7131306085479534d) + "'", double1 == (-2.7131306085479534d));
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.07270966677774479d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.6503846142007115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6280001886365711d + "'", double1 == 1.6280001886365711d);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.1485728867362902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1601773562338082d + "'", double1 == 0.1601773562338082d);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6745085168424229d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7996188932311933d + "'", double1 == 0.7996188932311933d);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1598987305185837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.076985947224282d + "'", double1 == 1.076985947224282d);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0000000041223074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.04144646964819275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.041446469648192756d + "'", double1 == 0.041446469648192756d);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 1, 21L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.093079357587117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.1936227590745503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0188035214415698d + "'", double1 == 1.0188035214415698d);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 78962960182681L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        double double1 = org.apache.commons.math.util.FastMath.exp(47.29016150730573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.450294699102237E20d + "'", double1 == 3.450294699102237E20d);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9999242832456278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.175084359955017d + "'", double1 == 1.175084359955017d);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        long long1 = org.apache.commons.math.util.FastMath.abs(21L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 21L + "'", long1 == 21L);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-3.893312903359797d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9991698414004467d) + "'", double1 == (-0.9991698414004467d));
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.718989392409238d, (-0.4161468365471424d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7189893924092379d + "'", double2 == 0.7189893924092379d);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        double double2 = org.apache.commons.math.util.FastMath.min(3.469446951953614E-18d, 1.5703334748399476d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.469446951953614E-18d + "'", double2 == 3.469446951953614E-18d);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        int int2 = org.apache.commons.math.util.FastMath.max(97, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5604872310455469d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2755533721084498d + "'", double1 == 2.2755533721084498d);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9891013135438892d, (double) 48.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9891013135438892d + "'", double2 == 0.9891013135438892d);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        double double1 = org.apache.commons.math.util.FastMath.log(1.868551121099462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6251633290015512d + "'", double1 == 0.6251633290015512d);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8943483995140632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04849326586728246d) + "'", double1 == (-0.04849326586728246d));
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2739L, (float) 689081821154L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2739.0f + "'", float2 == 2739.0f);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6347692319286742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8830864942993886d + "'", double1 == 0.8830864942993886d);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5706882123157566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5706882123157566d + "'", double1 == 1.5706882123157566d);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 100, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        double double1 = org.apache.commons.math.util.FastMath.floor(80.0302653271142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 80.0d + "'", double1 == 80.0d);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) -1, 13.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13.0f + "'", float2 == 13.0f);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(99.99999999999997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.745329251994329d + "'", double1 == 1.745329251994329d);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9123687177766381d, 0.23886037395044876d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.23886037395044876d + "'", double2 == 0.23886037395044876d);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.167375502789719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        long long1 = org.apache.commons.math.util.FastMath.round(2.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        long long1 = org.apache.commons.math.util.FastMath.abs(2739L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2739L + "'", long1 == 2739L);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.615120516841261d, 1.2349946114235455d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.61512051684126d + "'", double2 == 4.61512051684126d);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7003561790124814d, 0.2923550633004577d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7003561790124813d + "'", double2 == 0.7003561790124813d);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8253690221023695d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1L, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        float float2 = org.apache.commons.math.util.FastMath.max(48.0f, (float) 8L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 48.0f + "'", float2 == 48.0f);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.25096172890041585d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22194785209959902d) + "'", double1 == (-0.22194785209959902d));
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.6321205588285577d), 1.5567229026732161d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3857182818695369d) + "'", double2 == (-0.3857182818695369d));
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.32349849299466304d, 0.9562562360485877d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.33986957931062006d + "'", double2 == 0.33986957931062006d);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0046874060688094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.53635206842149d + "'", double1 == 0.53635206842149d);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10L, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        long long1 = org.apache.commons.math.util.FastMath.round(8.692617836018588d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9L + "'", long1 == 9L);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5410395588486396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4937744707606272d + "'", double1 == 0.4937744707606272d);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.16288628673873548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16146084948443995d) + "'", double1 == (-0.16146084948443995d));
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.0030228084133541687d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(5.000000000000001d, (-0.21588220933551652d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0d + "'", double2 == 5.0d);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        double double1 = org.apache.commons.math.util.FastMath.log(0.06214609673410903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.7782672669540793d) + "'", double1 == (-2.7782672669540793d));
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.1256209726545494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9676589901702034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6768445062632679d + "'", double1 == 0.6768445062632679d);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8595315709695678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2915485661551678d + "'", double1 == 1.2915485661551678d);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        double double1 = org.apache.commons.math.util.FastMath.log(2.0310116979478843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7085340422802743d + "'", double1 == 0.7085340422802743d);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.175084359955017d, 30.95704158868318d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1750843599550171d + "'", double2 == 1.1750843599550171d);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        float float2 = org.apache.commons.math.util.FastMath.min(2739.0f, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2739.0f + "'", float2 == 2739.0f);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        double double1 = org.apache.commons.math.util.FastMath.rint(5.244348724433776E63d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.244348724433776E63d + "'", double1 == 5.244348724433776E63d);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 36L, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 8L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8L + "'", long1 == 8L);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.383182435886996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04159438018192675d + "'", double1 == 0.04159438018192675d);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.2182984788308782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0038100272076939663d + "'", double1 == 0.0038100272076939663d);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5947374629017292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        double double1 = org.apache.commons.math.util.FastMath.atan(5.244348724433776E63d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6508397703249049d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42949179560133843d) + "'", double1 == (-0.42949179560133843d));
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.238693057170856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        double double1 = org.apache.commons.math.util.FastMath.sinh(99.99999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080104E43d + "'", double1 == 1.3440585709080104E43d);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 78L, 8.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        int int2 = org.apache.commons.math.util.FastMath.min(2, 6559);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        double double1 = org.apache.commons.math.util.FastMath.acos(5.268356063861754E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963215265406d + "'", double1 == 1.5707963215265406d);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        double double1 = org.apache.commons.math.util.FastMath.tanh(138.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0030228084133541687d, (-0.5063656411095873d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.87267627911232d + "'", double2 == 18.87267627911232d);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.23527328223197624d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.23310874770420992d) + "'", double1 == (-0.23310874770420992d));
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9917933885729989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.03505120341912517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03505120341912517d + "'", double1 == 0.03505120341912517d);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5496008503596722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5496008503596722d + "'", double1 == 0.5496008503596722d);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.03168203751511701d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.031682037515117d) + "'", double1 == (-0.031682037515117d));
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 6559);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6559.0f + "'", float1 == 6559.0f);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.99991199244082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01745175649826896d + "'", double1 == 0.01745175649826896d);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        long long2 = org.apache.commons.math.util.FastMath.max(2L, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 10, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5585053606381856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.0038621373392852356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003854698434102049d + "'", double1 == 0.003854698434102049d);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        double double2 = org.apache.commons.math.util.FastMath.min(19.085536923187668d, 0.5227846790767261d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5227846790767261d + "'", double2 == 0.5227846790767261d);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.15059643745753507d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1632208669247299d) + "'", double1 == (-0.1632208669247299d));
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0213710154485947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 58.52024850219568d + "'", double1 == 58.52024850219568d);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        double double2 = org.apache.commons.math.util.FastMath.max(3.0d, 0.1958111284153483d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0911874016151137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5904595247658336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6253724835562301d + "'", double1 == 0.6253724835562301d);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5968949588006862d, 2.5362067139382427d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2701660525260755d + "'", double2 == 0.2701660525260755d);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9306695450583735d, (-1.6908443102518884d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9306695450583735d + "'", double2 == 0.9306695450583735d);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5057720758044307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.9925591367766533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.0000000000000004d, 1.0103622330573048d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        double double1 = org.apache.commons.math.util.FastMath.tan(1834.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8255205413933215d) + "'", double1 == (-0.8255205413933215d));
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, 78962960182681L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.19486506597972084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19486506597972086d + "'", double1 == 0.19486506597972086d);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        double double2 = org.apache.commons.math.util.FastMath.min(5.268356063861754E-9d, 0.007414768657038784d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.268356063861754E-9d + "'", double2 == 5.268356063861754E-9d);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        float float1 = org.apache.commons.math.util.FastMath.abs(2005.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2005.0f + "'", float1 == 2005.0f);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.043904921102047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8068757622399418d + "'", double1 == 0.8068757622399418d);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.671032563057712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        double double1 = org.apache.commons.math.util.FastMath.asin((-2.7782672669540793d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0115210545205378d, 1.5972229600067989d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5645454927157055d + "'", double2 == 0.5645454927157055d);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3440585709083352E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100L, 51.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.0f + "'", float2 == 51.0f);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.2539945895800114d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.25399458958001137d) + "'", double1 == (-0.25399458958001137d));
    }
}

