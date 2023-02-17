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
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5892512118024951d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5995504841726447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.3517123481176d + "'", double1 == 34.3517123481176d);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.020879729880431727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020879729880431727d + "'", double1 == 0.020879729880431727d);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9223372036854775807L, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        float float1 = org.apache.commons.math.util.FastMath.abs(3.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.5084833071825032d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.545185591332969E49d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.10885756869875891d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0059308383512293d + "'", double1 == 1.0059308383512293d);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 53.0f, 0.6416164750242573d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.99999999999999d + "'", double2 == 52.99999999999999d);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        double double1 = org.apache.commons.math.util.FastMath.tan(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483608274590866d + "'", double1 == 0.6483608274590866d);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        double double2 = org.apache.commons.math.util.FastMath.min(0.4311581967195641d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8833206860228293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9594878221418731d + "'", double1 == 0.9594878221418731d);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        int int2 = org.apache.commons.math.util.FastMath.max(36, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.115445474195378d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.4344205208065718d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5572364748926293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5572364748926295d + "'", double1 == 1.5572364748926295d);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1161530356493914d, 22.18070977745259d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1161530356493916d + "'", double2 == 1.1161530356493916d);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.03003511361978026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.030044150150702355d + "'", double1 == 0.030044150150702355d);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.43930669835763825d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.4772282118533498d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1160510480284926d + "'", double1 == 1.1160510480284926d);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.570705526935434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0231525181530474d + "'", double1 == 1.0231525181530474d);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.2919553545008196d + "'", double1 == 7.2919553545008196d);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.6904492636009615d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6448247459530039d) + "'", double1 == (-0.6448247459530039d));
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.016455121993179136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12827751943804938d + "'", double1 == 0.12827751943804938d);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7560632008621517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9429862169662604d + "'", double1 == 0.9429862169662604d);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.2333184128133814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09107521534299858d + "'", double1 == 0.09107521534299858d);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        long long2 = org.apache.commons.math.util.FastMath.min((-1L), (long) (-53));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        double double2 = org.apache.commons.math.util.FastMath.min(49.80857186097812d, 1.3092866533194534d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3092866533194534d + "'", double2 == 1.3092866533194534d);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.7811352629728695E-34d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.8539967282194916E-36d + "'", double1 == 4.8539967282194916E-36d);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        long long2 = org.apache.commons.math.util.FastMath.min(53L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.7051700342143223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7208459681098984d + "'", double1 == 1.7208459681098984d);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8805489308698095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.211017194207928d + "'", double1 == 1.211017194207928d);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.4219132975121505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.267396586565031d + "'", double1 == 11.267396586565031d);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        double double1 = org.apache.commons.math.util.FastMath.asin(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97L, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.003873175936571774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000075007552947d + "'", double1 == 1.0000075007552947d);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        float float2 = org.apache.commons.math.util.FastMath.max(3.0f, 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.615724430838339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06310629616292701d + "'", double1 == 0.06310629616292701d);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 53L, 61.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 61.0f + "'", float2 == 61.0f);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6334239030790434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8848263231172628d + "'", double1 == 0.8848263231172628d);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        int int2 = org.apache.commons.math.util.FastMath.min((-53), (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.27572056477178236d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.797624686386575d) + "'", double1 == (-15.797624686386575d));
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-53.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9250245035569947d) + "'", double1 == (-0.9250245035569947d));
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.7105940846527337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.433064486228815d + "'", double1 == 0.433064486228815d);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.5872139151568908d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6655280485428683d) + "'", double1 == (-0.6655280485428683d));
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9991050130774393d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7612180281375921d) + "'", double1 == (-0.7612180281375921d));
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        double double1 = org.apache.commons.math.util.FastMath.sin(10.049875621120885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5851764690934491d) + "'", double1 == (-0.5851764690934491d));
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        double double1 = org.apache.commons.math.util.FastMath.signum(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0686474581524463E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.7887200523027917d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6576833375608168d) + "'", double1 == (-0.6576833375608168d));
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.848501131276805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.471995607949335d + "'", double1 == 23.471995607949335d);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        double double1 = org.apache.commons.math.util.FastMath.log10(5506.500045400885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7408756471404097d + "'", double1 == 3.7408756471404097d);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        float float2 = org.apache.commons.math.util.FastMath.max((-2.0f), (float) 11013L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.7220034424505188d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3119232597915513d + "'", double1 == 1.3119232597915513d);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        float float2 = org.apache.commons.math.util.FastMath.max(53.0f, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 57, (float) 11013);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.017066003704239316d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8575532158463938d, 0.46313536681893186d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8575532158463938d + "'", double2 == 0.8575532158463938d);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9830787956514044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.4080652728465024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1866192619566323d + "'", double1 == 1.1866192619566323d);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3132616875182228d, (double) 57.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.0d + "'", double2 == 57.0d);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.40992093554642245d, 3.3305834282671762d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1224619373680373d + "'", double2 == 0.1224619373680373d);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.087344633461887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0937456180488585d + "'", double1 == 4.0937456180488585d);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6765125521465636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6765125521465637d + "'", double1 == 0.6765125521465637d);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.087344633461887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9697059811445589d + "'", double1 == 0.9697059811445589d);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.32220799131551875d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.00000000000001d + "'", double1 == 97.00000000000001d);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, 11013L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.307560258420629d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1618676209477559d + "'", double1 == 1.1618676209477559d);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        double double1 = org.apache.commons.math.util.FastMath.sinh(235.781718468518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2521872254166764E102d + "'", double1 == 1.2521872254166764E102d);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        double double1 = org.apache.commons.math.util.FastMath.tan(22.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00885165604168446d + "'", double1 == 0.00885165604168446d);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9999346490652955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.2646180550224786d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9786524875477416d + "'", double1 == 0.9786524875477416d);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        long long1 = org.apache.commons.math.util.FastMath.round(5.2437141131408894E22d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.5430256902014756d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        double double1 = org.apache.commons.math.util.FastMath.log((-2025.4348094013415d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9867717342662448d + "'", double1 == 1.9867717342662448d);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4577979139729038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025443373427532223d + "'", double1 == 0.025443373427532223d);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 34);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.1215871282840145E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 4477855L, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 57.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8998668269691937d + "'", double1 == 0.8998668269691937d);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.163442205927363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6955886362231636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.601560242965996d + "'", double1 == 0.601560242965996d);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.2130532941206642d), 0.4472118490899239d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.114722093336851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9999929257765152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7182625987939137d + "'", double1 == 2.7182625987939137d);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9854342165774551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.457458870558788d + "'", double1 == 2.457458870558788d);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.2557610379370634d), 1.1679173671934143E40d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0752139433928819E-40d) + "'", double2 == (-1.0752139433928819E-40d));
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.884191021882157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9999999835100737d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999917550368d + "'", double1 == 0.9999999917550368d);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8593267093280548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.3283158262817936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2024664181803648d + "'", double1 == 1.2024664181803648d);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(43.42944819032519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2488.324087887704d + "'", double1 == 2488.324087887704d);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9992066252797287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7161260676499148d + "'", double1 == 1.7161260676499148d);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.7370361196913022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.680482178387855d + "'", double1 == 5.680482178387855d);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(5.431733408790851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 311.21539976392364d + "'", double1 == 311.21539976392364d);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0741466672417709d, 1.3799380148686868d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0741466672417709d + "'", double2 == 0.0741466672417709d);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.7853981633974483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.22403837382938316d, 3.414062290979883d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.006052854641401612d + "'", double2 == 0.006052854641401612d);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3052998807949199d, 0.5837461910522398d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5837461910522398d + "'", double2 == 0.5837461910522398d);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.4932054413052554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49320544130525545d + "'", double1 == 0.49320544130525545d);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.5063656411097343d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5063656411097343d + "'", double1 == 0.5063656411097343d);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.5259944849453191d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5259944849453191d + "'", double1 == 0.5259944849453191d);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        float float2 = org.apache.commons.math.util.FastMath.min((-53.0f), (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9363055236908925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3588380304952641d + "'", double1 == 0.3588380304952641d);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.307560258420629d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.8582226493088282d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7774898930433891d) + "'", double1 == (-0.7774898930433891d));
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.2924316695611777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.898979485566356d + "'", double1 == 8.898979485566356d);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1262023.5276316951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1262024.0d + "'", double1 == 1262024.0d);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.03422749178784308d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9009272373598115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.716749058368794d + "'", double1 == 0.716749058368794d);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.3284512750821519d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.719463918234335d, 1.4274266235030733d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.167735703405218d + "'", double2 == 2.167735703405218d);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.40459526003396906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6360780298312221d + "'", double1 == 0.6360780298312221d);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.17542037193601015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19174708835953738d + "'", double1 == 0.19174708835953738d);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.007582068426303211d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0076108850910483d + "'", double1 == 1.0076108850910483d);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.449489742783178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 140.3454242220617d + "'", double1 == 140.3454242220617d);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.07752552270710597d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07459659470484177d) + "'", double1 == (-0.07459659470484177d));
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        double double2 = org.apache.commons.math.util.FastMath.max(44.07414248543583d, (-0.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 44.07414248543583d + "'", double2 == 44.07414248543583d);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.77905632175577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013597097873114517d + "'", double1 == 0.013597097873114517d);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.8256472186458474d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3628287378324058d) + "'", double1 == (-1.3628287378324058d));
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.5578300447656457d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5724499077477837d + "'", double1 == 0.5724499077477837d);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        int int2 = org.apache.commons.math.util.FastMath.min(11013, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2063L, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2063.0f + "'", float2 == 2063.0f);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        double double1 = org.apache.commons.math.util.FastMath.ulp(6.298292365610484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.7415668164626985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.787869317656026d + "'", double1 == 7.787869317656026d);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7424877582997027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5982487386901945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7734654088517433d + "'", double1 == 0.7734654088517433d);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.5674369031063861d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.567436903106386d) + "'", double1 == (-0.567436903106386d));
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.772945733569301d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3119232597915513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.01706683222077747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017067660857999937d + "'", double1 == 0.017067660857999937d);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, 28L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 28L + "'", long2 == 28L);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        double double1 = org.apache.commons.math.util.FastMath.log(103645.29347944363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.54872970901283d + "'", double1 == 11.54872970901283d);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.27234146891183075d), (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.4944324908505626d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        double double1 = org.apache.commons.math.util.FastMath.acosh(9.999999995877003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9932228457120043d + "'", double1 == 2.9932228457120043d);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1161530356493914d, (-0.021989770635849296d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9975865056243414d + "'", double2 == 0.9975865056243414d);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5473244135939721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9916323853406819d + "'", double1 == 0.9916323853406819d);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 11013L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.0d + "'", double1 == 11013.0d);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5707963267948963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5721494028333372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9173669803900304d + "'", double1 == 0.9173669803900304d);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.8097187196293865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.1377407200944d + "'", double1 == 45.1377407200944d);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.465190328815662E-32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.465190328815662E-32d + "'", double1 == 2.465190328815662E-32d);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.1224619373680373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12307781635714636d + "'", double1 == 0.12307781635714636d);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.017436510074825058d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017436510074825058d + "'", double1 == 0.017436510074825058d);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.468462369872704d, 1.2067705094227903d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4004791895156678d + "'", double2 == 0.4004791895156678d);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        double double1 = org.apache.commons.math.util.FastMath.asin(15.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5430806348152448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6789823271282995d + "'", double1 == 3.6789823271282995d);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        long long2 = org.apache.commons.math.util.FastMath.min((-1L), (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.4120080778437435E-10d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        double double1 = org.apache.commons.math.util.FastMath.expm1(10.049875621120886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23151.906933686434d + "'", double1 == 23151.906933686434d);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.3490760817142498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21051295027658917d + "'", double1 == 0.21051295027658917d);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 1, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        double double2 = org.apache.commons.math.util.FastMath.min(3.1001094562563805d, (double) 3.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.7208852476093055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14952605421220036d) + "'", double1 == (-0.14952605421220036d));
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.7010979104724594d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        double double2 = org.apache.commons.math.util.FastMath.min(0.995950244065464d, (-2025.4348094013415d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2025.4348094013415d) + "'", double2 == (-2025.4348094013415d));
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3023186765274486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.24376859510303997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        double double2 = org.apache.commons.math.util.FastMath.min(1.243830346881223d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.32179921168174863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3276291673075579d + "'", double1 == 0.3276291673075579d);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8195908673690073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3550914891488244d + "'", double1 == 1.3550914891488244d);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        long long2 = org.apache.commons.math.util.FastMath.min(28L, (long) 1477896);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 28L + "'", long2 == 28L);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(52.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.280109889280518d + "'", double1 == 7.280109889280518d);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 0, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 34L, (float) 36);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-2.1928939093273927d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8884066601218983d) + "'", double1 == (-0.8884066601218983d));
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.8792846300053567d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6377023445868331d + "'", double1 == 0.6377023445868331d);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        double double1 = org.apache.commons.math.util.FastMath.log(36.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.58351893845611d + "'", double1 == 3.58351893845611d);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5707963274966377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        double double1 = org.apache.commons.math.util.FastMath.log10(8.673617379884035E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-18.06179973983887d) + "'", double1 == (-18.06179973983887d));
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 0, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.1189396031849523d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8848263231172628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7243683239856294d + "'", double1 == 0.7243683239856294d);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 1477896.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9429862169662604d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05870361261004548d) + "'", double1 == (-0.05870361261004548d));
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9286112600478652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        int int2 = org.apache.commons.math.util.FastMath.max(53, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 36, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.934990176680789d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.8369144593899815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 61, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 61L + "'", long2 == 61L);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.8999083480823814d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.015706363640220756d) + "'", double1 == (-0.015706363640220756d));
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9999999987563514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999995854505d + "'", double1 == 0.9999999995854505d);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 61);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 61 + "'", int2 == 61);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.4351842306678721d), 0.4818623606494503d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4818623606494503d + "'", double2 == 0.4818623606494503d);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.369491427691419d, 0.6296609567811063d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.369491427691418d + "'", double2 == 4.369491427691418d);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.15300256822516012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.4573750283097829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45737502830978294d + "'", double1 == 0.45737502830978294d);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9170656115321792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8214980036126366d + "'", double1 == 0.8214980036126366d);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.038579145276530495d) + "'", double1 == (-0.038579145276530495d));
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        double double2 = org.apache.commons.math.util.FastMath.min(209.0252227135293d, 30.000000000000092d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.000000000000092d + "'", double2 == 30.000000000000092d);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.4650188248182272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 83.93939556930012d + "'", double1 == 83.93939556930012d);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7601945740163978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5654243563578895d + "'", double1 == 0.5654243563578895d);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5473244135939721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.359378923407302d + "'", double1 == 31.359378923407302d);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5419290584994321d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        double double1 = org.apache.commons.math.util.FastMath.signum(10.049875621120886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.8189894035458565E-12d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1477896.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.899277193215994d + "'", double1 == 14.899277193215994d);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.1224619373680373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12185520336050866d + "'", double1 == 0.12185520336050866d);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5459079327750913d, 0.9999999999992766d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999992766d + "'", double2 == 0.9999999999992766d);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1477896, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0000000000000018d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.433704240591099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9617542719885632d + "'", double1 == 0.9617542719885632d);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        long long1 = org.apache.commons.math.util.FastMath.round(0.16388652634107947d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.006052854641401612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0564224263707882E-4d + "'", double1 == 1.0564224263707882E-4d);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(5.1901966454565756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 297.37636262761947d + "'", double1 == 297.37636262761947d);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(16.305565311881853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.305565311881857d + "'", double1 == 16.305565311881857d);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4466128799118947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.141380652391393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4645589422527667d + "'", double1 == 1.4645589422527667d);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10, 4477855.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4477855.0f + "'", float2 == 4477855.0f);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7874470920119091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6569603880327592d + "'", double1 == 0.6569603880327592d);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5721494028333372d, 5.2437141131408894E22d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        double double1 = org.apache.commons.math.util.FastMath.expm1(7.604073567738472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2005.3522829578822d + "'", double1 == 2005.3522829578822d);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5127742681331149d, 1.4771212547196624d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.37284288447085207d + "'", double2 == 0.37284288447085207d);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3859684164526524d + "'", double1 == 0.3859684164526524d);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        long long1 = org.apache.commons.math.util.FastMath.round(2.9802322387695312E-8d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.982478439757621E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        double double1 = org.apache.commons.math.util.FastMath.floor((-8.51313365841725d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.0d) + "'", double1 == (-9.0d));
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.3112315471152565E15d, (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        double double2 = org.apache.commons.math.util.FastMath.min(4.565934759736901E23d, (-122.141774015765d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-122.141774015765d) + "'", double2 == (-122.141774015765d));
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.198408826999716d + "'", double1 == 2.198408826999716d);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        double double1 = org.apache.commons.math.util.FastMath.tanh(31.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1555698629817919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1758326914467423d + "'", double1 == 3.1758326914467423d);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-59.10786673843407d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0730374999763912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37990878017946567d + "'", double1 == 0.37990878017946567d);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.43065237603874346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9086935997460159d + "'", double1 == 0.9086935997460159d);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        long long1 = org.apache.commons.math.util.FastMath.round(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        int int1 = org.apache.commons.math.util.FastMath.round(57.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.4892370193052502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.104083357908641d + "'", double1 == 2.104083357908641d);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 57.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.685719999335932E24d + "'", double1 == 5.685719999335932E24d);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.4650188248182272d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.23664550481769292d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2107289687910285d) + "'", double1 == (-0.2107289687910285d));
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.34736225845333263d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9255530618729875d + "'", double1 == 1.9255530618729875d);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        long long2 = org.apache.commons.math.util.FastMath.min(793006726156715L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2147483647, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.1011775851339626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10083444191577728d) + "'", double1 == (-0.10083444191577728d));
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.900263084763043E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-8.5132340567954d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(5.009340961621595d, 0.8113741275700294d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.009340961621594d + "'", double2 == 5.009340961621594d);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        double double1 = org.apache.commons.math.util.FastMath.cos(1936674.200214744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13855396415229312d) + "'", double1 == (-0.13855396415229312d));
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(11.548739357257746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.548739357257748d + "'", double1 == 11.548739357257748d);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        double double1 = org.apache.commons.math.util.FastMath.rint((-86.33580274416312d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-86.0d) + "'", double1 == (-86.0d));
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        double double1 = org.apache.commons.math.util.FastMath.ulp(11.54872970901283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5374883357278658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49108437703232716d + "'", double1 == 0.49108437703232716d);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.0081355681289063E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570595513236734d + "'", double1 == 1.570595513236734d);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.1310377402202207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4257210334580655d + "'", double1 == 0.4257210334580655d);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5757472671756005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5223956895814861d + "'", double1 == 0.5223956895814861d);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.570796326794896d, 0.09966865249116202d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948957d + "'", double2 == 1.5707963267948957d);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        double double2 = org.apache.commons.math.util.FastMath.min((-2.6750248568426245d), 1.9997894669934126d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.6750248568426245d) + "'", double2 == (-2.6750248568426245d));
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7601945740163978d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5195675877329186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6813004775399978d + "'", double1 == 1.6813004775399978d);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        double double1 = org.apache.commons.math.util.FastMath.sin((-5.797048609501637d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4672136660029183d + "'", double1 == 0.4672136660029183d);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5572364748926295d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        double double1 = org.apache.commons.math.util.FastMath.log(0.18452216030183452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6899857126771447d) + "'", double1 == (-1.6899857126771447d));
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.20638559288074199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1876287759594812d + "'", double1 == 0.1876287759594812d);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        long long2 = org.apache.commons.math.util.FastMath.min(39481480091340L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        double double2 = org.apache.commons.math.util.FastMath.max(135.79913804720726d, 0.6296609567811063d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 135.79913804720726d + "'", double2 == 135.79913804720726d);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5954732329718483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5609005988965426d + "'", double1 == 0.5609005988965426d);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.42520696267656133d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        long long2 = org.apache.commons.math.util.FastMath.max((-53L), (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.2106815084135339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2106815084135339d + "'", double1 == 0.2106815084135339d);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) (-2));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        float float2 = org.apache.commons.math.util.FastMath.max((-53.0f), 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.691029831908528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.151665335034499d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06132629483063868d + "'", double1 == 0.06132629483063868d);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.111040995153103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0357223815346017d + "'", double1 == 1.0357223815346017d);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9697059811445589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6371689679536297d + "'", double1 == 2.6371689679536297d);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.03673618878368824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0374193018868239d + "'", double1 == 1.0374193018868239d);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.017066003704239316d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6061093801777692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931433986678658d + "'", double1 == 0.6931433986678658d);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.09933992780358329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09901443649234584d + "'", double1 == 0.09901443649234584d);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.27631948176648663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27291879708384875d + "'", double1 == 0.27291879708384875d);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 4L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1129787402495097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0549780757198273d + "'", double1 == 1.0549780757198273d);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        float float2 = org.apache.commons.math.util.FastMath.max(3.9481478E13f, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.4176620615017429d), 0.7346342576927686d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4176620615017429d) + "'", double2 == (-0.4176620615017429d));
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(54.4780803985937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3121.3640828137964d + "'", double1 == 3121.3640828137964d);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        int int2 = org.apache.commons.math.util.FastMath.min(34, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8986761182296238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        double double2 = org.apache.commons.math.util.FastMath.atan2(34.30685281944005d, (-0.5851764690934491d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5878518034529052d + "'", double2 == 1.5878518034529052d);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9854342165774551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5707963274966377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027415567793051467d + "'", double1 == 0.027415567793051467d);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        long long1 = org.apache.commons.math.util.FastMath.round((-114.59155902616465d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-115L) + "'", long1 == (-115L));
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9434257847789064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05823757674916767d) + "'", double1 == (-0.05823757674916767d));
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9754001961551926d), 1.3440585709080869E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.257125673445783E-44d) + "'", double2 == (-7.257125673445783E-44d));
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9991461404922782d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 793006726156715L, (float) 1477896);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.9300672E14f + "'", float2 == 7.9300672E14f);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1301927452503902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1301927452503904d + "'", double1 == 1.1301927452503904d);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        double double1 = org.apache.commons.math.util.FastMath.log(156.1918541558971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.051085085955435d + "'", double1 == 5.051085085955435d);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.104083357908641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1271307019409333d + "'", double1 == 1.1271307019409333d);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3023186765274486d, 573.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.407481337357587E65d + "'", double2 == 5.407481337357587E65d);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5410520681182421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5410520681182421d + "'", double1 == 0.5410520681182421d);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.3852968325547366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2194415930823448d + "'", double1 == 1.2194415930823448d);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        double double2 = org.apache.commons.math.util.FastMath.pow((-86.0d), 7.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.4792782221696E13d) + "'", double2 == (-3.4792782221696E13d));
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32L, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        double double2 = org.apache.commons.math.util.FastMath.min(1.4146685492575237d, (-0.9516311810082599d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9516311810082599d) + "'", double2 == (-0.9516311810082599d));
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5860134523134308E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.586013452313431E15d + "'", double1 == 1.586013452313431E15d);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 7.9300672E14f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4133836244307663d) + "'", double1 == (-1.4133836244307663d));
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.7255967321845854d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.898597293193949d) + "'", double1 == (-0.898597293193949d));
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.17139683014300192d), 0.19127348683183137d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1713968301430019d) + "'", double2 == (-0.1713968301430019d));
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, 28L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6981142704849399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.359372478322521d) + "'", double1 == (-0.359372478322521d));
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.6995216443485196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6438517469625918d) + "'", double1 == (-0.6438517469625918d));
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.15912713462618d + "'", double1 == 4.15912713462618d);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, (-0.457669233211857d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        double double1 = org.apache.commons.math.util.FastMath.atan(195.61136026791206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5656841938016288d + "'", double1 == 1.5656841938016288d);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.6591354567261247d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.3283064365386963E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5675807421208592d, 0.28738952988751526d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5675807421208592d + "'", double2 == 1.5675807421208592d);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3074614241103386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7653530282311698d + "'", double1 == 0.7653530282311698d);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5414729998706594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5414729998706596d + "'", double1 == 0.5414729998706596d);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.9397458386915911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5862840469997894d) + "'", double1 == (-2.5862840469997894d));
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7.516258181075712E96d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.3628287378324058d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5013507798060323d, (double) 2.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.25135260441211665d + "'", double2 == 0.25135260441211665d);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) (-53L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9584036466699127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.985937728331783d + "'", double1 == 0.985937728331783d);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        double double1 = org.apache.commons.math.util.FastMath.cosh(91.10170611520638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8362772857258556E39d + "'", double1 == 1.8362772857258556E39d);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8410093358548899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7453164347125397d + "'", double1 == 0.7453164347125397d);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.253350360695029d, 0.016031504549832633d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5580061040079176d + "'", double2 == 1.5580061040079176d);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        double double1 = org.apache.commons.math.util.FastMath.acos(295.41443706420927d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.39592515018183416d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-4.9E-324d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0549780757198273d, (-86.33580274416312d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-86.33580274416312d) + "'", double2 == (-86.33580274416312d));
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.194206803317586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5707956501570803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936438014d + "'", double1 == 1.1752011936438014d);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7346342576927686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9387214167925974d + "'", double1 == 0.9387214167925974d);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.999303822951033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017441141938262003d + "'", double1 == 0.017441141938262003d);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        double double1 = org.apache.commons.math.util.FastMath.tan(1477895.5237245467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9633071774102245d) + "'", double1 == (-0.9633071774102245d));
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.605170185988093d + "'", double1 == 4.605170185988093d);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1477896 + "'", int2 == 1477896);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9997152991171921d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.841317126163967d + "'", double1 == 0.841317126163967d);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6565667352442498d, (double) 4477855.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.9251475365964138d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7465363222182905d) + "'", double1 == (-0.7465363222182905d));
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.618990892446662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        int int2 = org.apache.commons.math.util.FastMath.min(2, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        double double1 = org.apache.commons.math.util.FastMath.exp(22.60451646247372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.561705969853512E9d + "'", double1 == 6.561705969853512E9d);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 53L, (float) 1477896);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-1L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        double double1 = org.apache.commons.math.util.FastMath.log(28.45884779991685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.348459106948174d + "'", double1 == 3.348459106948174d);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        double double1 = org.apache.commons.math.util.FastMath.expm1(78.69006752597979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.495071996956252E34d + "'", double1 == 1.495071996956252E34d);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.1321790744880604d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.848501131276805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7603734074051981d) + "'", double1 == (-0.7603734074051981d));
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5707963267948966d + "'", double1 == 2.5707963267948966d);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.7529602598008398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18115812444149643d) + "'", double1 == (-0.18115812444149643d));
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 793006726156715L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.010714389643952717d), 0.36787944117144233d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        double double1 = org.apache.commons.math.util.FastMath.sin(471.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2366321052384454d) + "'", double1 == (-0.2366321052384454d));
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2733360428781544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1284219259116488d + "'", double1 == 1.1284219259116488d);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.011800076512800234d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6997597439205169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012213111504325393d + "'", double1 == 0.012213111504325393d);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, 61);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 61 + "'", int2 == 61);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        int int2 = org.apache.commons.math.util.FastMath.min(61, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9329417505747774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8331526722825443d + "'", double1 == 0.8331526722825443d);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.1224619373680373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12185340335495028d + "'", double1 == 0.12185340335495028d);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        double double1 = org.apache.commons.math.util.FastMath.log(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5271796258079011d + "'", double1 == 1.5271796258079011d);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7885839348184186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6576060904218043d + "'", double1 == 0.6576060904218043d);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.1731525181731936d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1731525181731936d + "'", double1 == 0.1731525181731936d);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        double double1 = org.apache.commons.math.util.FastMath.tan(6.894806889943192E27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5635321918516419d) + "'", double1 == (-0.5635321918516419d));
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        double double2 = org.apache.commons.math.util.FastMath.atan2(10.049875621120885d, 0.5661631704961736d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5145204691365632d + "'", double2 == 1.5145204691365632d);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        int int1 = org.apache.commons.math.util.FastMath.round((-2.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3119232597915513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.713308505923074d + "'", double1 == 2.713308505923074d);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7805951733159242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5769476754472138d + "'", double1 == 0.5769476754472138d);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.5831805218535748d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5831805218535747d) + "'", double1 == (-0.5831805218535747d));
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.450905222306537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 83.13074571165504d + "'", double1 == 83.13074571165504d);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.7507239941348802d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2052372928768276d) + "'", double1 == (-1.2052372928768276d));
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 1, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 4L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.000000000000001d + "'", double1 == 4.000000000000001d);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.8872978375373093E32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.42520696267656133d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6520789543272818d + "'", double1 == 0.6520789543272818d);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0000000000000142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.718281828459084d + "'", double1 == 1.718281828459084d);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        double double1 = org.apache.commons.math.util.FastMath.tan(31.306852819440046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10950833761445115d) + "'", double1 == (-0.10950833761445115d));
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7612639340924646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8725044034802716d + "'", double1 == 0.8725044034802716d);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.49260818941222645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4926081894122265d + "'", double1 == 0.4926081894122265d);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        long long2 = org.apache.commons.math.util.FastMath.min((-36L), (long) 1477896);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5427661770824743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4189118803430434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.187299190145385d + "'", double1 == 2.187299190145385d);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5404895876275592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7168472036069868d + "'", double1 == 1.7168472036069868d);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-35.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.930067261567154E14d) + "'", double1 == (-7.930067261567154E14d));
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5706386041602216d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        long long1 = org.apache.commons.math.util.FastMath.abs(35L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.7220034424505188d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9381038193126576d + "'", double1 == 0.9381038193126576d);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.7260621198151926d, 0.44138521123769286d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.726062119815192d + "'", double2 == 2.726062119815192d);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        double double2 = org.apache.commons.math.util.FastMath.min(0.3156563365585749d, 14.206129690390002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3156563365585749d + "'", double2 == 0.3156563365585749d);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6105647004975028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6492134298110585d + "'", double1 == 0.6492134298110585d);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5721494028333372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        double double2 = org.apache.commons.math.util.FastMath.min(44.07414248543583d, 100.00000000000004d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 44.07414248543583d + "'", double2 == 44.07414248543583d);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        double double1 = org.apache.commons.math.util.FastMath.log(0.007582068426303211d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.881969237093158d) + "'", double1 == (-4.881969237093158d));
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5669767943827968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24643471584737353d) + "'", double1 == (-0.24643471584737353d));
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        float float2 = org.apache.commons.math.util.FastMath.min(11013.0f, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.1976967646632825E-38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5420777404922401d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5420777404922401d + "'", double1 == 1.5420777404922401d);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        int int2 = org.apache.commons.math.util.FastMath.min(34, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        long long2 = org.apache.commons.math.util.FastMath.max(5L, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.243830346881223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.995557355458841d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.053714424981454d + "'", double1 == 3.053714424981454d);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        float float2 = org.apache.commons.math.util.FastMath.max(3.9481478E13f, (float) (-53L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.633123935319537E16d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.850338976445283E14d) + "'", double1 == (-2.850338976445283E14d));
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.43930669835763825d), 2.3686469200204927d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.43930669835763825d) + "'", double2 == (-0.43930669835763825d));
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.415289655969459d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6576060904218043d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.5835189384561104d, (-0.015736432937059376d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.58351893845611d + "'", double2 == 3.58351893845611d);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.3102515536998522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.15360022690981504d, 38.38636539305675d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15360022690981506d + "'", double2 == 0.15360022690981506d);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.45651311918339676d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2), (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1L, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.010714594648513057d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010657397841739896d) + "'", double1 == (-0.010657397841739896d));
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.983031862437426d, 0.634202896939395d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.997838234401106d + "'", double2 == 0.997838234401106d);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.4742570847547076d), 0.5954732329718483d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        double double1 = org.apache.commons.math.util.FastMath.cos(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9251475365964139d) + "'", double1 == (-0.9251475365964139d));
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        float float2 = org.apache.commons.math.util.FastMath.max((-36.0f), (float) 1477896L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        long long1 = org.apache.commons.math.util.FastMath.round(2.155615773557598E15d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2155615773557598L + "'", long1 == 2155615773557598L);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.4380253164811876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4120062944864213d + "'", double1 == 0.4120062944864213d);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.4672136660029183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4359452626029217d + "'", double1 == 0.4359452626029217d);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8809373872769856d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.9815145531741134d, 1.031436599693981d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.981514553174113d + "'", double2 == 3.981514553174113d);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.8462239673567167d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.7260621198151926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        long long2 = org.apache.commons.math.util.FastMath.min((-36L), (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.1554436208840472E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1554436208840472E-30d + "'", double1 == 3.1554436208840472E-30d);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        double double1 = org.apache.commons.math.util.FastMath.atanh(533.252579626545d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        double double1 = org.apache.commons.math.util.FastMath.log(1.544068044350276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43442052080657195d + "'", double1 == 0.43442052080657195d);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.385849999980594d, 4.691029831908528d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3858499999805942d + "'", double2 == 1.3858499999805942d);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        float float2 = org.apache.commons.math.util.FastMath.min(32.0f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7465363222182906d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2147483647, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1160510480284926d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.6169827255860205d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01076837998940472d) + "'", double1 == (-0.01076837998940472d));
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6061093801777692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010578604311324126d + "'", double1 == 0.010578604311324126d);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9387214167925974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.8351015231807235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0718547487488204d + "'", double1 == 1.0718547487488204d);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5553313201112098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44168859053115433d + "'", double1 == 0.44168859053115433d);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.7763568394002503E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.3083596576175056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31326970789315417d + "'", double1 == 0.31326970789315417d);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        int int2 = org.apache.commons.math.util.FastMath.min((-36), 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        double double1 = org.apache.commons.math.util.FastMath.acos(100.69314718055995d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.8999083480823814d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7162532403593261d) + "'", double1 == (-0.7162532403593261d));
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.8872978375373093E32d, 0.6142115809594618d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.6710621214420255E19d + "'", double2 == 6.6710621214420255E19d);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        long long1 = org.apache.commons.math.util.FastMath.abs(4L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.9250245035569947d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9250245035569947d + "'", double1 == 0.9250245035569947d);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        double double1 = org.apache.commons.math.util.FastMath.abs(7.006492321624085E-46d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.006492321624085E-46d + "'", double1 == 7.006492321624085E-46d);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5127742681331149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.512774268133115d + "'", double1 == 0.512774268133115d);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6334239030790434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011055332669562755d + "'", double1 == 0.011055332669562755d);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-36), (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, (long) 61);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 61L + "'", long2 == 61L);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9999999995854505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.883847335314108d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.1528498782648477d) + "'", double1 == (-2.1528498782648477d));
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        double double2 = org.apache.commons.math.util.FastMath.min(0.1223881891967115d, 0.6769292032740716d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1223881891967115d + "'", double2 == 0.1223881891967115d);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3169578969248166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8402550739104362d + "'", double1 == 0.8402550739104362d);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9250245035569947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.0d + "'", double1 == 53.0d);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5855174436770063d, 0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9149994957367078d + "'", double2 == 0.9149994957367078d);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        double double1 = org.apache.commons.math.util.FastMath.floor(6.894806889943192E27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.894806889943192E27d + "'", double1 == 6.894806889943192E27d);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.257328148668907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6158008682147178d + "'", double1 == 1.6158008682147178d);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5448995862811551d, 5.407481337357587E65d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5777218104420236E-30d, 231.58466047909457d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 231.58466047909457d + "'", double2 == 231.58466047909457d);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.4359452626029217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        double double1 = org.apache.commons.math.util.FastMath.ulp(34.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.2067705094227903d, 1.6699175736806615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2067705094227905d + "'", double2 == 1.2067705094227905d);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5707651109236087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32034.985999653978d + "'", double1 == 32034.985999653978d);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        long long2 = org.apache.commons.math.util.FastMath.min(57L, 34L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34L + "'", long2 == 34L);
    }
}

